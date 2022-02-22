package com.RMS.Restaurant.service.impl;

import com.RMS.Restaurant.entities.Account;
import com.RMS.Restaurant.mapper.AccountMapper;
import com.RMS.Restaurant.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
@Slf4j
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountMapper accountMapper;

    @Override
    public boolean login(String userName, String userPwd){
        System.out.println("-----------------------------------------------------");
        Account account = accountMapper.login(userName, userPwd);
        // 条件成立：表示数据库中没有对应的用户名，登录失败
        if (null == account) {
            return false;
        }

        //String s = DigestUtils.md5DigestAsHex(account.getUserPwd().getBytes(StandardCharsets.UTF_8));

        // 比较密码是否一致
        // 条件成立：参数的用户名密码和数据库用户名密码一致登录成功
        if (Objects.equals(userPwd, account.getUserPwd())) {
            return true;
        }
        return false;
    }
}
