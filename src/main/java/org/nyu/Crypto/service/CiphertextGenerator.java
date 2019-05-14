package org.nyu.Crypto.service;

import org.nyu.Crypto.dto.Ciphertext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CiphertextGenerator {

	// TODO - check if there is redundancy between this and Encryptor.

	@Autowired
	private Encryptor encryptor;// accept

	@Autowired
	private KeyGenerator keyGenerator;

	public Ciphertext getCipherMod(String plainText) {

		// TODO: persist the key with an ID which can be retrieved for random ciphers
		Ciphertext ciphertext = new Ciphertext();
		ciphertext.setCiphertext(encryptor.encryptMod(keyGenerator.generateKey(), plainText));
		return ciphertext;
	}
}
