import org.junit.Test;
import org.lanqiao.entity.Student;
import org.lanqiao.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    @Test
    public void too(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentService studentServiceImpl = (StudentService) context.getBean("StudentServiceImpl");
              Student student = new Student();
        Student sletcttest = studentServiceImpl.sletcttest(2);
        System.out.println(sletcttest);
    }
}
