package org.nyu.Crypto.controller;

import org.nyu.Crypto.service.CiphertextGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CiphertextController {

	/**
	 * Generate a cipher text
	 */

	@Autowired
	private CiphertextGenerator ciphertextGenerator;

	@RequestMapping(value = "/api/cipher/mod", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<?> getCipherTextGenerator(@RequestParam("plainText") String plainText) {

		return ResponseEntity.ok(ciphertextGenerator.getCipherMod(plainText));
	}

	@RequestMapping(value = "/api/cipher/random", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<?> getCipherTextGeneratorRandom(@RequestParam("plainText") String plainText) {
		return ResponseEntity.ok(ciphertextGenerator.getCipherMod(plainText));
	}
}
