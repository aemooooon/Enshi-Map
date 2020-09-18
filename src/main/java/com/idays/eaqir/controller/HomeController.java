package com.idays.eaqir.controller;

import com.idays.eaqir.util.validatecode.IVerifyCodeGen;
import com.idays.eaqir.util.validatecode.RandomUtils;
import com.idays.eaqir.util.validatecode.SimpleCharVerifyCodeGenImpl;
import com.idays.eaqir.util.validatecode.VerifyCode;
import com.wordnik.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@RestController
@Slf4j
public class HomeController {


    @RequestMapping("/")
    public String home(HttpSession session) {
//        List<User> allUser = userMapper.getAllUser();
        StringBuilder str=new StringBuilder();
        for (int i = 0; i < 50; i++) {
            String uuid= RandomUtils.getUuid();
            str.append(uuid.toUpperCase());
            str.append("<br>");
        }

//        String vcode=session.getAttribute("VerifyCode").toString();

        return str.toString();
    }

    @ApiOperation(value = "验证码")
    @GetMapping("/verifyCode")
    public void verifyCode(HttpServletRequest request, HttpServletResponse response) {
        IVerifyCodeGen iVerifyCodeGen = new SimpleCharVerifyCodeGenImpl();

        try {
            VerifyCode verifyCode = iVerifyCodeGen.generate(84, 30);
            String code = verifyCode.getCode();
//            log.info(code);
            request.getSession().setAttribute("VerifyCode", code);
            response.setHeader("Pragma", "no-cache");
            response.setHeader("Cache-Control", "no-cache");
            response.setDateHeader("Expires", 0);
            response.setContentType("image/jpeg");
            response.getOutputStream().write(verifyCode.getImgBytes());
            response.getOutputStream().flush();
        } catch (IOException e) {
//            log.info("", e);
        }
    }

}
