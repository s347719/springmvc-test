package xiaofeng.spring.repo.service;

import xiaofeng.spring.repo.entity.User;

/**
 * @author lixf
 * @date 2019/3/27
 */
public interface UserService {

    User findByName(String name);

    void saveUser(User user);
}
