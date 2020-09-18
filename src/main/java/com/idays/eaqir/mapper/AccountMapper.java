package com.idays.eaqir.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.idays.eaqir.domain.Account;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface AccountMapper extends BaseMapper<Account> {
    @Select("SELECT * FROM `account`")
    List<Account> getAll();
}
