package com.wanty.service;

import com.wanty.Relationship.SupplyRelationship;
import com.wanty.entity.CompanyGraph;
import com.wanty.entity.SupplyGraph;
import com.wanty.repository.SupplyGraphRepository;
import com.wanty.repository.SupplyRelationshipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SupplyService {
    @Autowired
    SupplyGraphRepository supplyGraphRepository;

    @Autowired
    SupplyRelationshipRepository supplyRelationshipRepository;

    public void testService(){
        final CompanyGraph companyGraph = new CompanyGraph();
        //采购占比
        String scale = "47.14%";
        // 采购金额
        String amount ="18923.42";
        //供应商名称
        String name = "常州常电及其关联公司";
        //公司实体部分及添加公司节点部分省略...(companyGraph)
        SupplyGraph supplyGraph = SupplyGraph.builder().name(name).build();
        //添加供应商节点
        supplyGraphRepository.save(supplyGraph);
        String indexName = companyGraph.getFullName() + "-" + supplyGraph.getName();
        //供应商关系
        SupplyRelationship supplyRelationship =
                SupplyRelationship.builder().company(companyGraph).supply(supplyGraph).amount(amount).scale(scale).indexName(indexName).build();
        //添加供应关系
        supplyRelationshipRepository.save(supplyRelationship);
    }

}
