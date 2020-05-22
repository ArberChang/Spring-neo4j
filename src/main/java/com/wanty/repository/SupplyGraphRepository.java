package com.wanty.repository;

import com.wanty.entity.SupplyGraph;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface SupplyGraphRepository extends Neo4jRepository<SupplyGraph,Long> {
}
