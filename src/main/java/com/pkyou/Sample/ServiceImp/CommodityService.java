package com.pkyou.Sample.ServiceImp;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
    public PageInfo getCommodities(GetCommoditiesRequest request) {
        PageHelper.startPage(request.getPagenum(),request.getPagesize());
        List<GetCommoditiesResponse> responses = dao.getCommodities(request);

        PageInfo page = new PageInfo(responses);
        return page;
    }

    public List<GetCommodityExchangeRecordResponse> getCommodityExchangeRecord(GetCommodityExchangeRecordRequest request) {
        return dao.getCommodityExchangeRecord(request);
    }
}
