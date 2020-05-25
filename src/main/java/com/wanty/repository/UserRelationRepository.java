package com.wanty.repository;

import com.wanty.Relationship.UserRelationship;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface UserRelationRepository extends Neo4jRepository<UserRelationship, Long> {
}
