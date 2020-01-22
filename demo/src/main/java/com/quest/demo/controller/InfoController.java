package com.quest.demo.controller;

import com.quest.demo.service.PlayerInfoService;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class InfoController {

	private static final Logger logger = Logger.getLogger(InfoController.class);
    
	@Autowired
    private PlayerInfoService playerInfoService;

    @GetMapping(value = "/getInfo/{id}", produces = "applicaton/json")
    public ResponseEntity<String> getInfo(@PathVariable String id) {
    	logger.info("Inside controller trying to get information for id :- "+id);
        return new ResponseEntity<>(playerInfoService.getInfoService(Integer.parseInt(id)), HttpStatus.OK);
    }
}
