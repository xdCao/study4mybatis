package Utils;

import com.sun.istack.internal.logging.Logger;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


import java.io.IOException;
import java.io.InputStream;


public class SqlSessionFactoryUtil {

    private static SqlSessionFactory sqlSessionFactory=null;

    private static final Class CLASS_LOCK=SqlSessionFactoryUtil.class;

    private SqlSessionFactoryUtil(){}

    public static SqlSessionFactory initSqlSessionFactory(){
        InputStream inputStream=null;
        String resource="mybatis.xml";
        try {
            inputStream=Resources.getResourceAsStream(resource);
        }catch (IOException e){
            e.getMessage();
        }
        synchronized (CLASS_LOCK){
            if (sqlSessionFactory==null){
                sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
            }
        }
        return sqlSessionFactory;
    }


    public static SqlSession openSqlSession(){
        if (sqlSessionFactory==null){
            initSqlSessionFactory();
        }
        return sqlSessionFactory.openSession();
    }


}
