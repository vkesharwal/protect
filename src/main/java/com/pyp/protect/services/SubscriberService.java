package com.pyp.protect.services;

import java.util.List;

import com.pyp.protect.entities.Subscribers;
import com.pyp.protect.pk.SubscriberPK;

public interface SubscriberService {
	
public List<Subscribers> getSubscribers();
	
	public Subscribers getSubscriber(SubscriberPK subPk);
	
	public Subscribers addSubscribers(Subscribers subs);
	
	public Subscribers updateSubscriber(Subscribers subs);
	
	public void deleteSubscriber(SubscriberPK subPk);

}
