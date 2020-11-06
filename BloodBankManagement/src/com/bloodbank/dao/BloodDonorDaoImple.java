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
import com.bloodbank.dto.BloodDonor;


@Repository
public class BloodDonorDaoImple implements BloodDonorDao{
	
	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	public void requestBlood(BloodDonor bloodDonor) {
		hibernateTemplate.execute(new HibernateCallback<Void>() {

			@Override
			public Void doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				session.save(bloodDonor);
				tr.commit();
				session.flush();
				session.close();
				return null;
			}
			
		});
	}

	@Override
	public List<BloodDonor> selectAll(int userId) {
		List<BloodDonor> blist = hibernateTemplate.execute(new HibernateCallback<List<BloodDonor>>() {

			@Override
			public List<BloodDonor> doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				Query q = session.createQuery("from BloodDonor where userId=?");
				q.setInteger(0, userId);
				List<BloodDonor> li = q.list();
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
	public void deleteDonor(int donarId) {
		hibernateTemplate.execute(new HibernateCallback<Void>() {

			@Override
			public Void doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				session.delete(new BloodDonor(donarId));
				tr.commit();
				session.flush();
				session.close();
				return null;
				}
			});
	}
	
	@Override
	public BloodDonor selectDonor(int donarId) {
		BloodDonor bdonor = hibernateTemplate.execute(new HibernateCallback<BloodDonor>() {

			@Override
			public BloodDonor doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				BloodDonor bdr = (BloodDonor)session.get(BloodDonor.class, donarId);
				tr.commit();
				session.flush();
				session.close();
				return bdr;
			}
		});
		return bdonor;
	}

	@Override
	public void updateDonor(BloodDonor bloodDonor) {
		hibernateTemplate.execute(new HibernateCallback<Void>() {

			@Override
			public Void doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				session.update(bloodDonor);
				tr.commit();
				session.flush();
				session.close();
				return null;
			}
		});
	}

}
