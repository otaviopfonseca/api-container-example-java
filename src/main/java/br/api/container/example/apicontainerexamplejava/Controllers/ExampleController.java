package br.api.container.example.apicontainerexamplejava.Controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * ExampleController
 * 
 * @author Daniel Padua
 */
@RestController
@RequestMapping("api/example")
@Api("Hello World!")
public class ExampleController {

	@GetMapping("/hello-world")
	@ApiOperation(value = "Hello World")
	public ResponseEntity<String> get() {
		return ResponseEntity.ok("Hello World!");
    }
}