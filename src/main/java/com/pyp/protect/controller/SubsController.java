package com.pyp.protect.controller;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pyp.protect.entities.Subscribers;
import com.pyp.protect.pk.SubscriberPK;
import com.pyp.protect.services.SubscriberService;

@RestController
public class SubsController {
	
	@Autowired
	private SubscriberService subServices;
	
	
	protected final Log logger = LogFactory.getLog(getClass());
	

	@GetMapping("/subcribers/checkService")
	public String serviceUp() {
		return "OK";
	}
	
	@GetMapping("/subs/all")
	public List<Subscribers> getAllSubs() {
		 return subServices.getSubscribers();
	}
	
	@GetMapping("/subs/{emailId}/{mobileNum}")
	public Subscribers getSubsciber(@PathVariable String emailId,@PathVariable String mobileNum) {
		SubscriberPK subPk = new SubscriberPK(emailId, mobileNum);
		logger.info(emailId+" "+mobileNum);
		return subServices.getSubscriber(subPk);
	}
	
	@PostMapping("/subs/addSub")
	public Subscribers addSubscribers(@RequestBody Subscribers subs) {
		
		logger.info(subs.toString());
		return subServices.addSubscribers(subs);
	}
	
	@PutMapping("/subs/update")
	public Subscribers updateSubscribers(@RequestBody Subscribers subs) {
		return subServices.updateSubscriber(subs);
	}
	
	@DeleteMapping("/subs/delete/{emailId}/{mobileNum}")
	public ResponseEntity<HttpStatus> deleteSub(@PathVariable String emailId,@PathVariable String mobileNum) {
		
		try {
			SubscriberPK subPk = new SubscriberPK(emailId, mobileNum);
			subServices.deleteSubscriber(subPk);
			return new ResponseEntity<>(HttpStatus.OK);
			}
		catch(Exception e){
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		}

}
