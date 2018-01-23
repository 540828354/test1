package main.java.com.mygroup.seviceimpl;

import main.java.com.mygroup.dao.VirtualDataDao;
import main.java.com.mygroup.sevice.Nintendo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

/**
 * Created by Administrator on 2018/1/10.
 */

//@RunWith(SpringJUnit4ClassRunner.class) //使用junit4进行测试
//@ContextConfiguration(locations={"classpath:/main/resources/WEB-INF/applicationContext.xml"}) //加载配置文件
public class NintendoImpl implements Nintendo{

    private VirtualDataDao virtualDataDao;

    // 必须有setter方法
    public void setVirtualDataDao(VirtualDataDao virtualDataDao) {
        this.virtualDataDao = virtualDataDao;
    }

    @Override
    public void sayHello() {
        System.out.print("Hello Nintendo");
    }

    @Override
    public void play(String input) {
        System.out.print(input);
    }

//    @Test

    /**
     *
     */
    public void saySomething() {
        Map<String,String> map = virtualDataDao.getVirtualData();
        System.out.print(map);

    }

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:/main/resources/WEB-INF/applicationContext.xml");
        Object object = context.getBean("virtualDataDao");
        VirtualDataDao dao = (VirtualDataDao) object;
        dao.getVirtualData();
    }
}
