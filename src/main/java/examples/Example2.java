package examples;

import Utils.SqlSessionFactoryUtil;
import dao.RoleMapper;
import domain.Role;
import org.apache.ibatis.session.SqlSession;

public class Example2 {

    public static void main(String[] args) {
        SqlSession sqlSession=null;
        try {
            sqlSession= SqlSessionFactoryUtil.openSqlSession();
            RoleMapper roleMapper=sqlSession.getMapper(RoleMapper.class);
            Role role=new Role();
            role.setNote("hehehh");
            role.setRoleName("me");
            roleMapper.insertRole(role);
            roleMapper.deleteRole(1L);
            sqlSession.commit();
        }catch (Exception e){
            System.err.println(e.getMessage());
        }finally {
            if (sqlSession!=null){
                sqlSession.close();
            }
        }
    }

}
