package com.wanty.entity;

import lombok.Data;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;

@Data
@NodeEntity(label = "User")
public class UserNode {

    @Id
    @GeneratedValue
    private Long nodeId;

    @Property(name = "userId")
    private String userId;

    @Property(name = "name")
    private String name;

    @Property(name = "age")
    private int age;
}
