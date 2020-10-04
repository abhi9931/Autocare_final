package com.autocare.dao;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

public abstract class AutocareBaseDAO<T> {
	@Autowired
	private HibernateTemplate hibernateTemplate;
	@Transactional
	public void  addEntity(T entity) {
		hibernateTemplate.saveOrUpdate(entity);
	}
	
	private T loadEntiry(String entiryName,Serializable ID) {
		return  (T)hibernateTemplate.get(entiryName, ID);
	}
	
}
