package dao;

import org.apache.ibatis.annotations.Select;

import po.Customer;

public interface CustomerDao {
	//����ɾ��ӳ��xml�ļ���д�����ע��
	//@Select("select * from t_customer where id=#{id}")
	public Customer findCustomerById(Integer id);
}
