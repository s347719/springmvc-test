package xiaofeng.spring.repo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xiaofeng.spring.repo.dao.TeacherDao;
import xiaofeng.spring.repo.entity.Teacher;

import javax.transaction.Transactional;

/**
 * @author lixf
 * @date 2019/3/27
 */
@Service("teacherService")
@Transactional
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherDao teacherDao;

    @Override
    public Teacher findTeacherByName(String name) {
        return teacherDao.findTeacher(name);
    }

    @Override
    public void saveTeacher(Teacher teacher) {
        teacherDao.save(teacher);
    }
}
