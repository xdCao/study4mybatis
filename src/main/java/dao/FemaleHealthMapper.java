package dao;

import domain.FemaleHealth;

import java.util.List;

public interface FemaleHealthMapper {

    List<FemaleHealth> getFemaleHealthsByStuId(Long id);

}
