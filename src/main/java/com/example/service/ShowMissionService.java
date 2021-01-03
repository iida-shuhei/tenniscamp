package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.domain.Mission;
import com.example.mapper.MissionMapper;

@Service
@Transactional
public class ShowMissionService {

	@Autowired
	private MissionMapper mapper;
	
	public List<Mission> findAll() {
		return mapper.findAll();
	}
	
}
