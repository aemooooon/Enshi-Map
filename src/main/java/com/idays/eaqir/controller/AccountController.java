package com.idays.eaqir.controller;

import com.idays.eaqir.domain.Account;
import com.idays.eaqir.mapper.AccountMapper;
import com.idays.eaqir.util.ErrorCodeEnum;
import com.power.common.model.CommonResult;
import com.power.common.util.UUIDUtil;
import com.wordnik.swagger.annotations.ApiOperation;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Api(tags = "用户数据接口")
public class AccountController {

    @Resource
    AccountMapper accountMapper;

    @ApiOperation(value ="查询用户", notes = "返回所有用户列表")
    @GetMapping(path = "/account")
    public CommonResult getAllAccounts(){
        List<Account> accountList=accountMapper.getAll();
        if (accountList.size()>0){
            return CommonResult.ok().setResult(accountList);
        }else{
            return CommonResult.fail(ErrorCodeEnum.PARAM_NO_RECORDS);
        }
    }

    @GetMapping(path = "/account/{id}")
    public Account getAAccount(@PathVariable("id") Integer id){
        Account account=accountMapper.selectById(id);
        return account;
    }

    @PostMapping(path = "/account")
    public Integer createAccount(@RequestBody Account account){
        Account newAccount=new Account();
        newAccount.setAccountCode(UUIDUtil.getUuid32());
        newAccount.setUserAccount("admin");
        newAccount.setSecurityCode("password");
        newAccount.setAddress("东风大道224号");
        Integer result=accountMapper.insert(newAccount);
        return result;
    }

    @PutMapping(path = "/account/{id}")
    public Integer updateAccount(@PathVariable("id") Integer id, Account account){

        return 0;
    }

    @DeleteMapping(path = "/account/{id}")
    public Integer deleteAccount(@PathVariable("id") Integer id){

        return 0;
    }
}
