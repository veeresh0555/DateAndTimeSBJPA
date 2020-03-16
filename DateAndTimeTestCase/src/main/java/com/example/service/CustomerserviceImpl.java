package com.example.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Customer;
import com.example.model.Custrequest;
import com.example.repository.CustomerRepository;

@Service
public class CustomerserviceImpl implements CustomerService {

	@Autowired
	CustomerRepository repo;
	
	
	@Override
	public Customer savecust(Custrequest cust) {
		//Date ldate= cust.getDate();
		//SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-YYYY");
		//String dtimeformat=sdf.format(ldate);
		//cust.setDate(Date.valueOf(dtimeformat));
		//ObjectMapper om = new ObjectMapper();
		//try {
			//String jsonString = om.writeValueAsString(cust);
			//System.out.println("jsonString: "+jsonString);
		//} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		//}
		
		 	String sDate1=cust.getDate();  
		    //Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);  
		 	
		 	java.util.Date sdate = null;
			try {
				sdate = new SimpleDateFormat("dd-MM-yyyy").parse(sDate1);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		   
		    System.out.println(sDate1+"\t"+sdate);  
		    
		Customer customer =new Customer();
		customer.setId(cust.getId());
		customer.setName(cust.getName());
		customer.setDate(sdate);
		
		return repo.save(customer);
	}

}
