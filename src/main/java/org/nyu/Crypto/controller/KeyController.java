package org.nyu.Crypto.controller;

import org.nyu.Crypto.service.KeyGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;

@RestController
public class KeyController {

	@Autowired
	private KeyGenerator keyGenerator;

	@RequestMapping(value = "/api/key", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<?> getKey() {
		return ResponseEntity.ok(keyGenerator.generateKeyDto());
	}
}
