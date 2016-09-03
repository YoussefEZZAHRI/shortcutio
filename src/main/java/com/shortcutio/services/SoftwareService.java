package com.shortcutio.services;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shortcutio.dao.ISoftwareRepository;
import com.shortcutio.entities.Software;

@RestController
public class SoftwareService {
	@Autowired
	private ISoftwareRepository isoftwareRepository;
	
	@RequestMapping("/test")
	public String test(){
		return "test";
	}
	
	@RequestMapping("/AllSoftwares")
	public Collection<Software>getAllSoft(){
		return null;
	}
		
	}
	

