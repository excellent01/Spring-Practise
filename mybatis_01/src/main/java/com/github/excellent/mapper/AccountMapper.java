package com.github.excellent.mapper;

import com.github.excellent.dao.Account;

import java.util.List;
import java.util.Map;

public interface AccountMapper {
    void insert(Account account);
    List<Account> select();
    Account selectById(int id);
    List<Account> seelctByMap(Map<String,String> map);
    List<Account> seelctByJavaBean(Account account);
}
