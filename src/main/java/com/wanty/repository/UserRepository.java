package com.wanty.repository;

import com.wanty.entity.UserNode;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface UserRepository extends Neo4jRepository<UserNode, Long> {
}
