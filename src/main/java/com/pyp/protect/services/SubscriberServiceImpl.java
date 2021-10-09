package com.pyp.protect.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pyp.protect.dao.SubscriberDao;
import com.pyp.protect.entities.Subscribers;
import com.pyp.protect.pk.SubscriberPK;


@Service
public class SubscriberServiceImpl implements SubscriberService {
	
	@Autowired
	private SubscriberDao subsDao;

	@Override
	public List<Subscribers> getSubscribers() {
		// TODO Auto-generated method stub
		return subsDao.findAll();
	}

	@Override
	public Subscribers getSubscriber(SubscriberPK subPk) {
		// TODO Auto-generated method stub
		
		return subsDao.findById(subPk).get();
	}

	@Override
	public Subscribers addSubscribers(Subscribers subs) {
		// TODO Auto-generated method stub
		return subsDao.save(subs);
	}

	@Override
	public Subscribers updateSubscriber(Subscribers subs) {
		// TODO Auto-generated method stub
		return subsDao.save(subs);
	}

	@Override
	public void deleteSubscriber(SubscriberPK subPk) {
		// TODO Auto-generated method stub
		try {
			subsDao.deleteById(subPk);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			throw e;
		}
		
	}

}
