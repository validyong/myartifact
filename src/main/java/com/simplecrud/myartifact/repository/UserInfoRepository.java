package com.simplecrud.myartifact.repository;

import com.simplecrud.myartifact.mybean.UserInfo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserInfoRepository extends JpaRepository<UserInfo, String> {
    UserInfo findByUserId(String UserId);
    
}
