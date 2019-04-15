package com.pkyou.Sample.Controller;

import com.pkyou.Sample.ServiceImp.CommodityService;
import com.pkyou.Sample.request.GetCommoditiesRequest;
import com.pkyou.Sample.request.GetCommodityExchangeRecordRequest;
import com.pkyou.Sample.response.CommonResponse;
import com.pkyou.Sample.response.GetCommoditiesResponse;
import com.pkyou.Sample.response.GetCommodityExchangeRecordResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/commodity")
@Api("商品")
public class CommodityController {
    @Resource
    private CommodityService service;

    /**
     * 获取商品列表
     * @param request 请求参数，商品类别
     * @return 商品列表
     */
    @ApiOperation("获取商品列表")
    @RequestMapping(value="/getCommodities",method= RequestMethod.GET)
    public CommonResponse<List<GetCommoditiesResponse>> getCommodities(@ModelAttribute GetCommoditiesRequest request){
        CommonResponse<List<GetCommoditiesResponse>> response = new CommonResponse<List<GetCommoditiesResponse>>();

        try {
            List<GetCommoditiesResponse> result = service.getCommodities(request);
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
