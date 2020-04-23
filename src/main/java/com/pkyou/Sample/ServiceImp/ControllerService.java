package com.pkyou.Sample.ServiceImp;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.pkyou.Sample.Dao.IIndoorInfoDao;
import com.pkyou.Sample.Entyties.IndoorCheckItemEntity;

@Service
public class ControllerService   {
	@Autowired
	private IIndoorInfoDao dao;

	@Autowired
	private StringRedisTemplate stringRedisTemplate;
	
	public ArrayList<IndoorCheckItemEntity> getIndoorCheckItemEntities() {

		String key1 = stringRedisTemplate.opsForValue().get("key1");

		ArrayList<IndoorCheckItemEntity> wscheckItemsOfIndoor = dao.getWscheckItemsOfIndoor();

		wscheckItemsOfIndoor.get(0).setName(key1);
		return wscheckItemsOfIndoor;
	}
}
