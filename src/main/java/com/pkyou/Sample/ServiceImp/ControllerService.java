package com.pkyou.Sample.ServiceImp;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;

import com.pkyou.Sample.Dao.IIndoorInfoDao;
import com.pkyou.Sample.Entyties.IndoorCheckItemEntity;

 

@Service
public class ControllerService   {

	@Autowired
	private IIndoorInfoDao dao;
	
	public ArrayList<IndoorCheckItemEntity> getIndoorCheckItemEntities() {
		return dao.getWscheckItemsOfIndoor();
	}
}
