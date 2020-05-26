package com.wanty.entity;

import lombok.Builder;
import lombok.Data;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;

@Data
@Builder
@NodeEntity
public class UserNode {

    @Id
    @GeneratedValue
    private Long nodeId;

    @Property(name = "userId")
    private String userId;

    private String name;

    private int age;
}
