package com.pkyou.Sample.Dao;

import com.pkyou.Sample.request.GetMyIntegralRequest;
import com.pkyou.Sample.response.GetMyIntegralResponse;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IMyIntegralDao {
    GetMyIntegralResponse getMyIntegral(GetMyIntegralRequest request);
}
