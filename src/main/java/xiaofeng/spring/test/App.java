package xiaofeng.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import xiaofeng.spring.repo.service.TeacherService;
import xiaofeng.spring.repo.service.UserService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("app.xml");
//        ApplicationContext classPathXmlApplicationContext = new FileSystemXmlApplicationContext("app.xml");
        UserService userService = (UserService) classPathXmlApplicationContext.getBean("userService");
//        User user = new User("lixf",20);
        System.out.println(userService.findByName("lixf"));
//
//        TeacherService teacherService = (TeacherService) classPathXmlApplicationContext.getBean("teacherService");
////        Teacher teacher = new Teacher("teacher","18202818828");
////        teacherService.saveTeacher(teacher);
//        System.out.println(teacherService.findTeacherByName("teacher"));
    }
}
