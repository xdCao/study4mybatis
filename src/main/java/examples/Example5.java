package examples;

import Utils.SqlSessionFactoryUtil;
import dao.StudentMapper;
import domain.MaleStudent;
import domain.Student;
import org.apache.ibatis.session.SqlSession;

public class Example5 {

    public static void main(String[] args) {
        SqlSession sqlSession=null;
        try {
            sqlSession= SqlSessionFactoryUtil.openSqlSession();
            StudentMapper studentMapper=sqlSession.getMapper(StudentMapper.class);
            Student student=studentMapper.getStudent(1l);
            if (1 == student.getSex()){
                System.out.println("男的");
                System.out.println(((MaleStudent)student).getMaleHealthList().get(0).getHeart());
            }
        }finally {
            if (sqlSession!=null){
                sqlSession.close();
            }
        }
    }

}
