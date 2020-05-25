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
            UserNode user = new UserNode();
            user.setAge(RandomUtils.nextInt(15, 40));
            user.setName("Fredia" + RandomUtils.nextInt(1, 1000));
            user.setUserId(UUID.randomUUID().toString());
            user.setNodeId(RandomUtils.nextLong(1L, 999L));
            neo4jService.addUser(user);
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
