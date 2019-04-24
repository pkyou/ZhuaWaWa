package com.pkyou.Sample.Controller;

import com.pkyou.Sample.response.CommonResponse;
import com.pkyou.Sample.response.ExchangeIntegralResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

@RestController
@RequestMapping("/uploadPic")
@Api("upload picture")
public class UploadPicController {
    @ResponseBody
    @RequestMapping(value = "/uploadPic", method = RequestMethod.POST)
    @ApiOperation(notes = "上传 ", httpMethod = "POST",value = "上传测量数据")
    public CommonResponse<ExchangeIntegralResponse> uploadPic(@RequestParam("userId") String userId, MultipartFile file){
        CommonResponse<ExchangeIntegralResponse> response = new CommonResponse<ExchangeIntegralResponse>();
        try{
            String dir = "";
            File dirFile = new File(dir);
            if (!dirFile.exists())
                dirFile.mkdirs();
            String fileName = file.getOriginalFilename();
            try {
                Files.copy(file.getInputStream(), Paths.get(dir).resolve(fileName), StandardCopyOption.REPLACE_EXISTING);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }catch (Exception e){

        }
        return response;
    }
}
