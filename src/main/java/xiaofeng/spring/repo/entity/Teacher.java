package xiaofeng.spring.repo.entity;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author lixf
 * @date 2019/3/27
 */
@Entity
@Table(name = "XF_TEACHER")
public class Teacher extends AbstractPersistable<Integer> {

    @Column
    private String name;
    @Column
    private String mobile;

    public Teacher() {
    }

    public Teacher(String name, String mobile) {
        this.name = name;
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }


    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }
}
