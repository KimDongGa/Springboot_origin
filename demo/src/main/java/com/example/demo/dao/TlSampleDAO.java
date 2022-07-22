package com.example.demo.dao;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.demo.entity.UserData;

@Repository
public interface TlSampleDAO {

	public List<UserData> selectTest() throws Exception;

	public List<UserData> selectTest1() throws Exception;
}
