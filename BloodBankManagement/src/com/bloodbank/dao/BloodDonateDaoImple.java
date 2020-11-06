package com.bloodbank.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.bloodbank.dto.BloodDonate;


@Repository
public class BloodDonateDaoImple implements BloodDonateDao{
	
	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	public void donateBlood(BloodDonate bloodDonate) {
		hibernateTemplate.execute(new HibernateCallback<Void>() {

			@Override
			public Void doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				session.save(bloodDonate);
				tr.commit();
				session.flush();
				session.close();
				return null;
			}
			
		});
	}

	@Override
	public List<BloodDonate> selectDall(int userId) {
		List<BloodDonate> blist = hibernateTemplate.execute(new HibernateCallback<List<BloodDonate>>() {

			@Override
			public List<BloodDonate> doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				Query q = session.createQuery("from BloodDonate where userId=?");
				q.setInteger(0, userId);
				List<BloodDonate> li = q.list();
				System.out.println(li);
				tr.commit();
				session.flush();
				session.close();
				return li;
			}
		});
		return blist;
	}

	@Override
	public void deleteDonate(int donateId) {
		hibernateTemplate.execute(new HibernateCallback<Void>() {

			@Override
			public Void doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				session.delete(new BloodDonate(donateId));
				tr.commit();
				session.flush();
				session.close();
				return null;
			}
		});
	}
	
	
	@Override
	public BloodDonate selectDonate(int donateId) {
		BloodDonate bloodDonate = hibernateTemplate.execute(new HibernateCallback<BloodDonate>() {

			@Override
			public BloodDonate doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				BloodDonate bdd = (BloodDonate)session.get(BloodDonate.class, donateId);
				tr.commit();
				session.flush();
				session.close();
				return bdd;
			}
		});
		return bloodDonate;
	}
		
	@Override
	public void updateDonate(BloodDonate bloodDonate) {
		hibernateTemplate.execute(new HibernateCallback<Void>() {

			@Override
			public Void doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				session.update(bloodDonate);
				tr.commit();
				session.flush();
				session.close();
				return null;
			}
		});
	}
	
}
