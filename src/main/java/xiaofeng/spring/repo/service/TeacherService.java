package xiaofeng.spring.repo.service;

import xiaofeng.spring.repo.entity.Teacher;

/**
 * @author lixf
 * @date 2019/3/27
 */
public interface TeacherService {

    Teacher findTeacherByName(String name);

    void saveTeacher(Teacher teacher);
}
