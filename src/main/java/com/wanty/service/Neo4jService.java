package com.wanty.service;

import com.wanty.entity.UserNode;
import com.wanty.repository.UserRelationRepository;
import com.wanty.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Neo4jService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserRelationRepository userRelationRepository;

    public int addUser(UserNode userNode) {
        final UserNode save = userRepository.save(userNode);
        return 1;
    }

    public List<UserNode> getUserNodeList() {
        List<UserNode> a = new ArrayList<>();
        final Iterable<UserNode> all = userRepository.findAll();
        all.forEach(a::add);
        return a;
    }





}
