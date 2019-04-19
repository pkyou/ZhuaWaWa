package com.pkyou.Sample.Dao;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.pkyou.Sample.request.GetCommoditiesRequest;
import com.pkyou.Sample.request.GetCommodityExchangeRecordRequest;
import com.pkyou.Sample.response.GetCommoditiesResponse;
import com.pkyou.Sample.response.GetCommodityExchangeRecordResponse;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICommodityDao {
    List<GetCommoditiesResponse> getCommodities(GetCommoditiesRequest request);

    List<GetCommodityExchangeRecordResponse> getCommodityExchangeRecord(GetCommodityExchangeRecordRequest request);
}
