package org.micro.brinder.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {
	@RequestMapping(value = "/isThisThingOn", method = RequestMethod.GET)
	public ResponseEntity<String> heartBeat() {
		return new ResponseEntity<String>("Hi Brinder, I'm awake. Here is your response.", HttpStatus.OK);
	}
}
