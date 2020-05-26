package com.wanty.repository;

import com.wanty.entity.CompanyGraph;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface CompanyGraphRepository extends Neo4jRepository<CompanyGraph, Long> {
}
