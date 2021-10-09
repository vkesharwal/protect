package com.pyp.protect.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pyp.protect.entities.Subscribers;
import com.pyp.protect.pk.SubscriberPK;

public interface SubscriberDao extends JpaRepository<Subscribers, SubscriberPK> {

}
