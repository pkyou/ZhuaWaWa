package com.pkyou.Sample.Controller;

import com.pkyou.Sample.enums.ResponseCodeEnum;
import com.pkyou.Sample.request.GetMyIntegralRequest;
import com.pkyou.Sample.response.BannerResponse;
import com.pkyou.Sample.response.CommonResponse;
import com.pkyou.Sample.response.GetMyIntegralResponse;
import org.springframework.web.bind.annotation.ModelAttribute;

public class MyBannerController {
    public CommonResponse<BannerResponse> getMyIntegral(@ModelAttribute GetMyIntegralRequest request) {

        CommonResponse<BannerResponse> response = new CommonResponse<BannerResponse>();

        try {
            BannerResponse result = new BannerResponse();
            result.setUrl("testUrl");
            response.setResult(result);
            response.setCode(ResponseCodeEnum.SUCCEED.getCode());
        }
        catch (Exception e){
            response.setCode(ResponseCodeEnum.FAILED.getCode());
            response.setMessage(e.getMessage());
        }
        return response;
    }
}
