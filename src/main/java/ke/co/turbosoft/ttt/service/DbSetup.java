package ke.co.turbosoft.ttt.service;

import javax.annotation.PostConstruct;

import ke.co.turbosoft.ttt.entity.Company;
import ke.co.turbosoft.ttt.repository.CompanyRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class DbSetup {
	
	@Autowired
	private CompanyRepo repo;
	
	@PostConstruct
	public void init(){
		
		Company com1=new Company();
		com1.setName("Turbosoft Tech Solutions");
		repo.save(com1);
		
		Company com2=new Company();
		com2.setName("Espa Business Solutions");
		repo.save(com2);
	
	}

}
