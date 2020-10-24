package com.sairam.demo;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.sairam.demo.repoistory.Recordrepoistory;
@Service
public class service implements formService{
	@Autowired
	formRepoistory FormRepoistory;
//
	@Override
	public List<Form> findAll() {
		return  (List<Form>) FormRepoistory.findAll();
	}
	@Override
	public Form save(Form form) {
		FormRepoistory.save(form);
		return form;
	}
	@Override
	public Form findById(Long id) {
		if(FormRepoistory.findById(id).isPresent())
		{
			return FormRepoistory.findById(id).get();
		}
		return null;
	}
//	@Override
//	public Form findByPassportNumbe(String passport_number) {
//		if(FormRepoistory.findByPassportNumber(passport_number).isPresent())
//		{
//			return FormRepoistory.findByPassportNumber(passport_number).get();
//		}
//		return null;
//	}
//@Override
//public Form findById(Long id) {
//	// TODO Auto-generated method stub
//	return null;
//}

	
//	public List<Form> findBypassport_number(String passport_number)
//	{
//		return FormRepoistory.findBypassport_number(passport_number);
//	}
	}

	



