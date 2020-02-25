package org.dbl.comsumer;

import org.dbl.dubbo.bean.UserAddress;
import org.dbl.dubbo.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * ClassName: MainApplication <br>
 * Description: <br>
 * date: 2020/2/25 19:58<br>
 *
 * @author Double <br>
 * @since JDK 1.8
 */
public class MainApplication {
  public static void main(String[] args) throws IOException {
    ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("comsumer.xml");
    UserService service = ctx.getBean(UserService.class);
    for (UserAddress address : service.getUserAddressList("1")) {
      System.out.println(address);
    }
    System.out.println("读取完毕");
    System.in.read();
  }
}
