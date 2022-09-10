package petfriends.external.controller;

import java.util.Random;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController; 
import petfriends.external.controller.Payment;

@SuppressWarnings("unused")
@RestController
@RequestMapping("/")
public class ExternalController {

	 @PostMapping("/external")
	 public String cardpay(@Valid @RequestBody Payment payment) {
		payment.getCardNumber().substring(0,4);
	 	Random random = new Random();	
		int createNum = 0;  			
		String ranNum = ""; 			
        int letter    = 6;			    
		String resultNum = "";  		
		
		for (int i=0; i<letter; i++) { 
            		
			createNum = random.nextInt(9);		
			ranNum =  Integer.toString(createNum);  
			resultNum += ranNum;			
		}	
		return String.valueOf(payment.getCardNumber().substring(0,3) + resultNum);
		
	 }
	 
	 @PutMapping("/external/cancel/{cardPpprovalNumber}")
	 public boolean cardcancel(@PathVariable String cardPpprovalNumber) {
		 if ( cardPpprovalNumber == null || cardPpprovalNumber =="") {
			 return false;
		 }
		return true;
	 }
	 	 
 }
	 
 

 
