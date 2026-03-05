package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Beneficiary;
import com.example.demo.service.BeneficiaryService;

@RestController
@RequestMapping("/beneficiary")
@CrossOrigin(origins ="http://localhost:3000")
public class BeneficiaryController {

	@Autowired
   BeneficiaryService beneficiaryService;
	
	@GetMapping("/get/{id}")
	public Beneficiary getData(@PathVariable int id)
	{
		return beneficiaryService.getData(id);
	}
	@PostMapping("/post")
	public Beneficiary postData(@RequestBody Beneficiary beneficiary)
	{
		return beneficiaryService.postData(beneficiary);
	}
	@PutMapping("/update")
	public Beneficiary updateData(@RequestBody Beneficiary beneficiary)
	{
		return beneficiaryService.updateData(beneficiary);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteData(@PathVariable int id)
	{
		beneficiaryService.deleteData(id);
	}
	@GetMapping("/view")
	public List<Beneficiary> display()
	{
		return beneficiaryService.display();
	}

}
