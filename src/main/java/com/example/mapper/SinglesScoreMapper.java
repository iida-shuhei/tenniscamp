package com.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.domain.SinglesScore;

@Mapper
public interface SinglesScoreMapper {

	void registerSinglesScore(SinglesScore singlesScore);
	
	List<SinglesScore> findAll();
	
}
