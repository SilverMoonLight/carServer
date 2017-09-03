package com.main.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.main.entity.Maker;
import com.main.repo.MakerRepo;

@RestController
public class MakerController {

	@Autowired
	MakerRepo makerRepo;
	
	@RequestMapping(path="/maker", method=RequestMethod.POST, consumes= MediaType.APPLICATION_JSON_VALUE)
	@CrossOrigin
	@ResponseBody
	@Transactional
	public Maker addMaker(@RequestBody Maker maker) {
		System.out.println(maker.getName());
		Maker result = makerRepo.save(maker);
		System.out.println(result);
		return result;
	}
	
	@RequestMapping(path="/maker", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	@CrossOrigin
	@Transactional
	public Maker findMakerbyName(@RequestParam("name") String name) {
		Maker maker = makerRepo.findMakerByName(name);
		if(maker == null) {
			return new Maker();
		} else {
		return maker;
		}
	}
}
