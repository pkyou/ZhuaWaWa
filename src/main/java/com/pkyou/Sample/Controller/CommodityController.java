package com.pkyou.Sample.Controller;

import com.pkyou.Sample.request.GetCommoditiesRequest;
import com.pkyou.Sample.request.GetCommodityExchangeRecordRequest;
import com.pkyou.Sample.response.CommonResponse;
import com.pkyou.Sample.response.GetCommoditiesResponse;
import com.pkyou.Sample.response.GetCommodityExchangeRecordResponse;

import java.util.ArrayList;
import java.util.List;

public class CommodityController {

    /**
     * 获取商品列表
     * @param request 请求参数，商品类别
     * @return 商品列表
     */
    public CommonResponse<List<GetCommoditiesResponse>> GetCommodities(GetCommoditiesRequest request){
        CommonResponse<List<GetCommoditiesResponse>> response = new CommonResponse<List<GetCommoditiesResponse>>();

        try {
            List<GetCommoditiesResponse> result = new ArrayList<GetCommoditiesResponse>();
            response.setCode(1);
            response.setResult(result);
        }catch (Exception e){
            response.setCode(-1);
            response.setMessage(e.getMessage());
        }
        return response;
    }

    /**
     * 获取商品兑换记录
     * @param request 请求参数，商品ID,用户ID
     * @return
     */
    public CommonResponse<List<GetCommodityExchangeRecordResponse>> GetCommodityExchangeRecord
            (GetCommodityExchangeRecordRequest request){
        CommonResponse<List<GetCommodityExchangeRecordResponse>> response = new CommonResponse<List<GetCommodityExchangeRecordResponse>>();
        try {
            List<GetCommodityExchangeRecordResponse> result = new ArrayList<GetCommodityExchangeRecordResponse>();
            //
            response.setCode(1);
            response.setResult(result);
        }catch (Exception e){
            response.setCode(-1);

            response.setMessage(e.getMessage());
        }
        return response;
    }
}
