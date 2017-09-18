package Utils;

import com.sun.deploy.model.Resource;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class MyBatisUtil {

    private static SqlSessionFactory sqlSessionFactory=null;

    public static SqlSessionFactory getSqlSessionFactory() {
        InputStream inputStream=null;
        if (sqlSessionFactory==null){
            try {
                String resource="mybatis.xml";
                sqlSessionFactory=new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream(resource));
                return sqlSessionFactory;
            }catch (Exception e){
                System.err.println(e.getMessage());
                e.printStackTrace();
            }
        }
        return sqlSessionFactory;

    }
}
