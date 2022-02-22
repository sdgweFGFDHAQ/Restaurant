package com.RMS.Restaurant.mapper;

import com.RMS.Restaurant.entities.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
public interface AccountMapper {
    Account login(@Param("userName") String userName,@Param("userPwd") String userPwd);

}
