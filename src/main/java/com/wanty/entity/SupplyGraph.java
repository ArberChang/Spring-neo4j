package com.wanty.entity;

import lombok.Data;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
//@Builder
@Data
public class SupplyGraph {

    @Id
    @GeneratedValue
    private Long id;

    /**
     * 供应商名称
     */
    private String name;
}
