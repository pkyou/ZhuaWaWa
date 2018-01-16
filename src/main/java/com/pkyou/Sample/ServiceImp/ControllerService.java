package com.pkyou.Sample.ServiceImp;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pkyou.Sample.Entyties.IndoorCheckItemEntity;
import com.pkyou.Sample.Mapper.IScheduleMapper;

@Service
public class ControllerService   {

	@Autowired
	private IScheduleMapper mapper;
	
	public ArrayList<IndoorCheckItemEntity> GetIndoorCheckItemEntities() {
		return mapper.GetWscheckItemsOfIndoor();
	}

}
