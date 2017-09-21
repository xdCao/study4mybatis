package dao;

import domain.MaleHealth;

import java.util.List;

public interface MaleHealthMapper {

    List<MaleHealth> getMaleHealthsByStuId(Long id);

}
