package com.pkyou.Sample.Dao;

import java.util.ArrayList;

import com.pkyou.Sample.Entyties.IndoorCheckItemEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface IIndoorInfoDao {
	public ArrayList<IndoorCheckItemEntity> getWscheckItemsOfIndoor();
}
