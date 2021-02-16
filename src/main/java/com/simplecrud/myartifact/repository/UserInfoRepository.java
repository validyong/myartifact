package com.simplecrud.myartifact.repository;

import java.util.List;

import com.simplecrud.myartifact.mybean.UserInfo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserInfoRepository extends JpaRepository<UserInfo, String> {
    <S extends UserInfo> S save(UserInfo userInfo);
    UserInfo findByUserId(String UserId);
    List<UserInfo> findAll();
    
}
