package com.wanty.controller;

import com.wanty.entity.UserNode;
import com.wanty.service.SupplyService;
import org.apache.commons.lang3.RandomUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
public class Neo4jController {

    @Autowired
    private com.wanty.service.Neo4jService neo4jService;

    @Autowired
    private SupplyService supplyService;

    //创建400个node
    @RequestMapping(path = "/addUserNode", method = RequestMethod.GET)
    public String addUserNode() {
        int i = 0;
        do {
            final UserNode build = UserNode.builder().age(RandomUtils.nextInt(15, 40))
                    .name("Fredia" + RandomUtils.nextInt(1, 1000))
                    .userId(UUID.randomUUID().toString())
                    .nodeId(RandomUtils.nextLong(1L, 999L)).build();

            neo4jService.addUser(build);
            i += 1;
        } while (i < 100);

        return "ok";
    }

    @RequestMapping(path = "/getUserNodeList", method = RequestMethod.GET)
    public List<UserNode> getUserNodeList() {

        return neo4jService.getUserNodeList();
    }

    @RequestMapping(path = "/supply", method = RequestMethod.GET)
    public Boolean supply() {
        supplyService.testService();
        return true;
    }

}
