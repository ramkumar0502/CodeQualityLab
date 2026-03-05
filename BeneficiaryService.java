package com.example.demo.service;

import java.util.List;

import org.jspecify.annotations.NonNull;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Beneficiary;
import com.example.demo.repository.BeneficiaryRepo;

@Service
public class BeneficiaryService {
	
	@Autowired
   BeneficiaryRepo beneficiaryRepo;
	
	public Beneficiary getData(int id)
	{
		return beneficiaryRepo.findById(id).orElse(null);
		
	}
	
	public Beneficiary postData(Beneficiary beneficiary)
	{  
		return beneficiaryRepo.save(beneficiary);
	}

	@NonNull
	public Beneficiary updateData(Beneficiary update) throws NullPointerException
	{
		Beneficiary exist=null;
		int id=update.getId();
	    exist=beneficiaryRepo.findById(id).orElse(null);
	  if(exist!=null)
	  {
		  
		  String name=update.getName();
		  exist.setName(name);
	  }
	 
		
		 int fund=update.getFund();
			exist.setFund(fund);
			String beneficiary=update.getBeneficiary();
			exist.setBeneficiary(beneficiary);
		
		return exist;
	}
	
	public void deleteData(int id)
	{
		 beneficiaryRepo.deleteById(id);
	}
    
	public List<Beneficiary>display()
	{
		return beneficiaryRepo.findAll();
	}
}
