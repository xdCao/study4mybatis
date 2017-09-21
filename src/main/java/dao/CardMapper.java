package dao;

import domain.Card;

public interface CardMapper {

    Card getCardByStudentId(Long studentId);

}
