package com.wanty.repository;

import com.wanty.Relationship.SupplyRelationship;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface SupplyRelationshipRepository extends Neo4jRepository<SupplyRelationship, Long> {
}
