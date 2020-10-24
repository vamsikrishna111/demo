package com.sairam.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin("*")
@RestController
public class FormController {
	@Autowired
	 formService FormService;
	@GetMapping("/Forms")
	public  ResponseEntity<List<Form>> get()
	{
		List<Form> Forms=FormService.findAll();
		System.out.println("hai");
		return new ResponseEntity<List<Form>>(Forms,HttpStatus.OK);
	}
	@PostMapping("/Forms")
	public  ResponseEntity<Form>save(@RequestBody Form form)
	{
		Form form1=FormService.save(form);
		return new ResponseEntity<Form>(form1,HttpStatus.OK);
	}
	@GetMapping("/Forms/{id}")
	public  ResponseEntity<Form> get(@PathVariable("id") Long id)
	{
		Form Form=FormService.findById(id);
		return new ResponseEntity<Form>(Form,HttpStatus.OK);
	}
//	@DeleteMapping("/Forms/{id}")
//	public  ResponseEntity<String> delete(@PathVariable("id") Long id)
//	{
//		FormService.delete(id);
//		return new ResponseEntity<String>("deleted succesfully",HttpStatus.OK);
////	}
////	
//	@GetMapping("/Forms/{passport_number}")
//	
//	public List<Form> findBypassport_number(@PathVariable("passport_number") String passport_number)
//	{
//		return FormService.findBypassport_number(passport_number);
//	}
}
	

