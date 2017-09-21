package examples;

import Utils.SqlSessionFactoryUtil;
import dao.StudentMapper;
import domain.Student;
import org.apache.ibatis.session.SqlSession;

public class Example4 {

    public static void main(String[] args) {
        SqlSession sqlSession=null;
        try {
            sqlSession= SqlSessionFactoryUtil.openSqlSession();
            StudentMapper studentMapper=sqlSession.getMapper(StudentMapper.class);
            Student student=studentMapper.getStudent(1l);
            System.out.println(student.getGoals().size());
            System.out.println(student.getCard().getCreated());
        }finally {
            if (sqlSession!=null){
                sqlSession.close();
            }
        }
    }


}
