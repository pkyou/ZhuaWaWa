package com.pkyou.Sample.ServiceImp;

import com.pkyou.Sample.Dao.IMyIntegralDao;
import com.pkyou.Sample.request.GetMyIntegralRequest;
import com.pkyou.Sample.response.GetMyIntegralResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyIntegralService {
    @Autowired
    private IMyIntegralDao dao;
    public GetMyIntegralResponse getMyIntegral(GetMyIntegralRequest request) {
        return dao.getMyIntegral(request);
    }
}
