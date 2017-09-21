package dao;

import domain.Goal;

import java.util.List;

public interface GoalMapper {

    List<Goal> getGoalsByStudentId(Long id);

}
