package com.example.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.UserData;

@Service
public class TlSampleDaoImpl {

	@Autowired
	public TlSampleDAO dao;

	public List<UserData> selectTest() throws Exception {
		return dao.selectTest();
	}

	public List<UserData> selectTest1() throws Exception{
		return dao.selectTest1();
	}

}
