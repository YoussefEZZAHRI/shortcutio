package com.shortcutio.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shortcutio.dao.BouttonRepository;
import com.shortcutio.entities.Button;

@RestController
@RequestMapping("/boutton")
public class ButtonService {
	// if we don't use this annotation it will give us an exception with nullPointer
	@Autowired
	private BouttonRepository bouttonRepository;
	@RequestMapping("/all")
	public List<Button> getALLButtons(){
		return bouttonRepository.findAll();
	}
	
}
