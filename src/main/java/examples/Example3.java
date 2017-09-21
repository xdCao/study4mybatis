package examples;

import Utils.SqlSessionFactoryUtil;
import dao.StudentMapper;
import domain.Card;
import domain.Student;
import org.apache.ibatis.session.SqlSession;

public class Example3 {

    public static void main(String[] args) {
        SqlSession sqlSession=null;
        try {
            sqlSession= SqlSessionFactoryUtil.openSqlSession();
            StudentMapper studentMapper=sqlSession.getMapper(StudentMapper.class);
            Student stu=studentMapper.getStudent(1l);
            System.out.println(stu.getName());
            Card card=stu.getCard();
            System.out.println(card);
        }finally {
            if (sqlSession!=null){
                sqlSession.close();
            }
        }
    }


}
