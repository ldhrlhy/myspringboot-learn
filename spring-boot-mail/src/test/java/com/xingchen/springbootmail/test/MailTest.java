package com.xingchen.springbootmail.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.xingchen.springbootmail.service.MailService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MailTest {
    @Autowired
    private MailService mailService;



    @Test
    public void testSimpleMail() throws Exception {
        mailService.sendSimpleMail("407721628@qq.com","这是一封简单邮件","大家好，这是我的第一封邮件！");
    }

    @Test
    public void testHtmlMail() throws Exception {
        String content="<html>\n" +
                "<body>\n" +
                "    <h3>hello world ! 这是一封html邮件!</h3>\n" +
                "</body>\n" +
                "</html>";
        mailService.sendHtmlMail("407721628@qq.com","这是一封HTML邮件",content);
    }
}
