package com.shortcutio.services;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shortcutio.dao.ISoftwareRepository;
import com.shortcutio.entities.Software;

@RestController
@RequestMapping("/software")
public class SoftwareService {
	@Autowired
	private ISoftwareRepository isoftwareRepository;
	
	@RequestMapping("/test")
	public String test(){
		return "test shortcut";
	}
	
	@RequestMapping("/AllSoftwares")
	public Collection<Software>getAllSoft(){
		return isoftwareRepository.findAll();
	}
		
	@RequestMapping("/all")
	public String getAllSofts(){
		List<Software> list= isoftwareRepository.findAll();
		return list.toString();
	}
	}
	

