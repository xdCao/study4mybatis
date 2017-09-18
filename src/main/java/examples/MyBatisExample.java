package examples;

import Utils.MyBatisUtil;
import dao.RoleMapper;
import domain.Role;
import org.apache.ibatis.session.SqlSession;

public class MyBatisExample {

    public static void main(String[] args) {
        SqlSession sqlSession=null;
        try {
            sqlSession= MyBatisUtil.getSqlSessionFactory().openSession();
            RoleMapper roleMapper=sqlSession.getMapper(RoleMapper.class);
            Role role=roleMapper.getRole(1L);
            System.out.println("role_name=>"+role.getRoleName());
        }finally {
            sqlSession.close();
        }
    }


}
