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

import com.bloodbank.dto.AdminUser;
import com.bloodbank.dto.User;

@Repository
public class AdminDaoImple implements AdminDao{

	@Autowired
	private HibernateTemplate hibernateTemplate;
	@Override
	public void insertUser(AdminUser adminUser) {
		hibernateTemplate.execute(new HibernateCallback<Void>() {

			@Override
			public Void doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				session.save(adminUser);
				tr.commit();
				session.flush();
				session.close();
				return null;
			}
		});
	}

	@Override
	public boolean checkUser(AdminUser adminUser) {
		boolean b = hibernateTemplate.execute(new HibernateCallback<Boolean>() {

			@Override
			public Boolean doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				Query q = session.createQuery("from AdminUser where userName = ? and password = ?");
				q.setString(0, adminUser.getUserName());
				q.setString(1,adminUser.getPassword());
				List<User> li = q.list();
				boolean flag = !li.isEmpty();
				tr.commit();
				session.flush();
				session.close();
				return flag;
			}
		});
		return b;
	}	

}
