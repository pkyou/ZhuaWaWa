package com.pkyou.Sample.Mapper;

import java.util.ArrayList;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.pkyou.Sample.Entyties.IndoorCheckItemEntity;

public interface IScheduleMapper {

	@Select("select id itemId,name from yn_app_wscheckitems	"
			+ " where	 parent_id=0 and type='1'")
	@Results({ @Result(property = "id", column = "id"),
			@Result(property = "itemId", column = "itemId"),
			@Result(property = "name",column="name")})
	public ArrayList<IndoorCheckItemEntity> GetWscheckItemsOfIndoor();
}
