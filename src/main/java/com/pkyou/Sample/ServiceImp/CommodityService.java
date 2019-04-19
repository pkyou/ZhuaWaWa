package com.pkyou.Sample.ServiceImp;

import com.pkyou.Sample.Dao.ICommodityDao;
import com.pkyou.Sample.request.GetCommoditiesRequest;
import com.pkyou.Sample.request.GetCommodityExchangeRecordRequest;
import com.pkyou.Sample.response.GetCommoditiesResponse;
import com.pkyou.Sample.response.GetCommodityExchangeRecordResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommodityService {
    @Autowired
    private ICommodityDao dao;
    public List<GetCommoditiesResponse> getCommodities(GetCommoditiesRequest request) {
        return dao.getCommodities(request);
    }

    public List<GetCommodityExchangeRecordResponse> getCommodityExchangeRecord(GetCommodityExchangeRecordRequest request) {
        return dao.getCommodityExchangeRecord(request);
    }
}
