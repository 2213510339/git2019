package com.example.demo.designmodel.prototype;

import designmodel.prototype.AdTemplate;
import designmodel.prototype.Mail;
import org.junit.Test;

import java.util.Random;

/**
 * 不通过new关键字来产生一个对象，而是通过对象复制来实现的模式就叫做原型模式
 */
public class PrototypeTest {
    private static int Max_COUNT = 6;
    @Test
    public void testPrototype() {
        Mail mail = new Mail(new AdTemplate());
        mail.setTail("XX银行版权所有");
        for (int j = 0; j < Max_COUNT; j++) {
            Mail cloneMail = mail.clone();
            cloneMail.setApplication(getRandString(3) + "先生(女士)");
            cloneMail.setName(getRandString(8) + "@" + getRandString(5)+ ".com");
            sendMail(cloneMail);
        }
    }
    private void sendMail(Mail mail) {
        System.out.println("标题："+mail.getTitle() + "\t收件人："
                +mail.getName()+"\t...发送成功！");
    }
    //获得指定长度的随机字符串
    public static String getRandString(int maxLength){
        String source ="abcdefghijklmnopqrskuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuffer sb = new StringBuffer();
        Random rand = new Random();
        for(int i=0;i<maxLength;i++){
            sb.append(source.charAt(rand.nextInt(source.length())));
        }
        return sb.toString();
    }
}
