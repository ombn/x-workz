package com.xworkz.registartionapp.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.xworkz.registartionapp.demo.model.Response;
import com.xworkz.registartionapp.demo.service.RegistrationService;

@RestController
public class RegistrationController {

	@Autowired
	private RegistrationService registrationService;

	private static final String FAILURE = "failure";

	@PostMapping("/v1/save")
	public ResponseEntity<?> register(@RequestBody Object request) {
		Response response = null;
		try {
			response = registrationService.registerUser(request);
		} catch (Exception e) {
			response = new Response();
			response.setMessage(FAILURE);
		}
		return new ResponseEntity<Response>(response, HttpStatus.OK);
	}

	@GetMapping("/v1/fetchData")
	public ResponseEntity<?> fetchUser(@RequestParam("id") int userId) {
		Response response = null;
		try {
			response = registrationService.fetchuser(userId);
		} catch (Exception e) {
			response = new Response();
			response.setMessage(FAILURE);
		}
		return new ResponseEntity<Response>(response, HttpStatus.OK);
	}

	@GetMapping("/v1/fetchAllData")
	public ResponseEntity<?> fetchAllUser() {
		Response response = null;
		try {
			response = registrationService.fetchalluser();
		} catch (Exception e) {
			response = new Response();
			response.setMessage(FAILURE);
		}
		return new ResponseEntity<Response>(response, HttpStatus.OK);
	}

	@DeleteMapping("/v1/removeData")
	public ResponseEntity<?> remove(@RequestParam("id") int userId) {
		Response response = null;
		try {
			response = registrationService.removeOne(userId);
		} catch (Exception e) {
			response = new Response();
			response.setMessage(FAILURE);
		}
		return new ResponseEntity<Response>(response, HttpStatus.OK);
	}

	@DeleteMapping("/v1/removeAll")
	public ResponseEntity<?> removeAll() {
		Response response = null;
		try {
			response = registrationService.clear();
		} catch (Exception e) {
			response = new Response();
			response.setMessage(FAILURE);
		}
		return new ResponseEntity<Response>(response, HttpStatus.OK);
	}
	
    @CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/v2/save")
	public ResponseEntity<?> saveData(@RequestBody Object request) {
		Response response = null;
		try {
			response = registrationService.saveData(request);
		} catch (Exception e) {
			response = new Response();
			response.setMessage(FAILURE);
		}
		return new ResponseEntity<Response>(response, HttpStatus.OK);
	}

    @CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/v2/fetchData/{category}")
	public ResponseEntity<?> fetchData(@PathVariable("category") String category) {
		Response response = null;
		try {
			response = registrationService.fetchData(category);
		} catch (Exception e) {
			response = new Response();
			response.setMessage(FAILURE);
		}
		return new ResponseEntity<Response>(response, HttpStatus.OK);
	}

    @CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/v2/fetchAllData")
	public ResponseEntity<?> fetchAllData() {
		Response response = null;
		try {
			response = registrationService.fetchAllData();
		} catch (Exception e) {
			response = new Response();
			response.setMessage(FAILURE);
		}
		return new ResponseEntity<Response>(response, HttpStatus.OK);
	}

    @CrossOrigin(origins = "http://localhost:4200")
	@DeleteMapping("/v2/removeData/{category}")
	public ResponseEntity<?> removeData(@PathVariable("category") String category) {
		Response response = null;
		try {
			response = registrationService.removeData(category);
		} catch (Exception e) {
			response = new Response();
			response.setMessage(FAILURE);
		}
		return new ResponseEntity<Response>(response, HttpStatus.OK);
	}

    @CrossOrigin(origins = "http://localhost:4200")
	@DeleteMapping("/v2/removeAll")
	public ResponseEntity<?> removeAllData() {
		Response response = null;
		try {
			response = registrationService.clearAllData();
		} catch (Exception e) {
			response = new Response();
			response.setMessage(FAILURE);
		}
		return new ResponseEntity<Response>(response, HttpStatus.OK);
	}
}
