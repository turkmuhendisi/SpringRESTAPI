package com.example.cashcard.dao;

import com.example.cashcard.model.CashCard;
import org.springframework.data.repository.CrudRepository;
public interface CashCardRepository extends CrudRepository<CashCard, Long>{
}