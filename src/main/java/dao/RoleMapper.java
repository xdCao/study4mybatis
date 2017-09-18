package dao;

import domain.Role;

public interface RoleMapper {

    Role getRole(Long id);

    void insertRole(Role role);

    void deleteRole(Long id);

}
