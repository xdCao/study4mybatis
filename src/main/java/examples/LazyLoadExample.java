package examples;

import Utils.SqlSessionFactoryUtil;
import dao.StudentMapper;
import domain.Student;
import org.apache.ibatis.session.SqlSession;

public class LazyLoadExample {

    public static void main(String[] args) {
        SqlSession sqlSession= SqlSessionFactoryUtil.openSqlSession();
        StudentMapper studentMapper=sqlSession.getMapper(StudentMapper.class);
        Student student = studentMapper.getStudent(1l);
//        student.getGoals();
//        student.getCard();
    }

}
