package examples;

import Utils.SqlSessionFactoryUtil;
import dao.StudentMapper;
import domain.Student;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

public class CacheExample {

    private static Logger logger=Logger.getLogger(CacheExample.class);

    public static void main(String[] args) {
        SqlSession sqlSession= SqlSessionFactoryUtil.openSqlSession();
        StudentMapper studentMapper=sqlSession.getMapper(StudentMapper.class);
        Student student=studentMapper.getStudent(1l);
        logger.debug("使用同一个sqlSession再执行一次");
        Student student1=studentMapper.getStudent(1l);
        sqlSession.commit();
        logger.debug("创建一个新的sqlSession再执行一次");
        SqlSession sqlSession1=SqlSessionFactoryUtil.openSqlSession();
        StudentMapper mapper = sqlSession1.getMapper(StudentMapper.class);
        Student student2 = mapper.getStudent(1l);
        sqlSession1.commit();
    }

}
