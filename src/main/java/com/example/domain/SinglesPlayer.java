package com.example.domain;

import java.util.List;

import lombok.Data;

@Data
public class SinglesPlayer {

	private Integer singlesPlayerId;
	private String singlesPlayerName;
	private String imagePath;
	private Integer doublesPlayerId;
	private DoublesPlayer doublesPlayer;
	private List<SinglesScore> singlesScoreList;
	private List<DoublesScore> doublesScoreList;
}