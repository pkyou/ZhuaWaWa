package com.pkyou.Sample.Dao;

import java.util.ArrayList;

import com.pkyou.Sample.Entyties.IndoorCheckItemEntity;

public interface IIndoorInfoDao {
	public ArrayList<IndoorCheckItemEntity> getWscheckItemsOfIndoor();
}
