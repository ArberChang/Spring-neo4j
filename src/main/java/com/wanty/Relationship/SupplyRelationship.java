package com.wanty.Relationship;

import com.wanty.entity.CompanyGraph;
import com.wanty.entity.SupplyGraph;
import lombok.Builder;
import lombok.Data;
import org.neo4j.ogm.annotation.*;

/**
 * 供应关系（公司节点和供应商节点节点是供应关系）
  */
@Data
@Builder
@RelationshipEntity(type = "supply")
public class SupplyRelationship {
    @Id
    @GeneratedValue
    private Long id;

    private String indexName;

    //关系的一端节点是 公司节点
    @StartNode
    private CompanyGraph company;

    //关系的另一端节点是 供应商节点
    @EndNode
    private SupplyGraph supply;

    //下面是关系的属性
    /**
     * 采购占比
     */
    private String scale;

    /**
     * 采购金额
     */
    private String amount;
}

