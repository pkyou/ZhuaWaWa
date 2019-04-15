package com.pkyou.Sample.Dao;

import com.pkyou.Sample.request.GetCommoditiesRequest;
import com.pkyou.Sample.response.GetCommoditiesResponse;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICommodityDao {
    List<GetCommoditiesResponse> getCommodities(GetCommoditiesRequest request);
}
