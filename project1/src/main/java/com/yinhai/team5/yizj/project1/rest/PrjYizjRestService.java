package com.yinhai.team5.yizj.project1.rest;

import com.yinhai.ta404.core.exception.AppException;
import com.yinhai.ta404.core.restservice.BaseRestService;
import com.yinhai.ta404.core.restservice.annotation.RestService;
import org.jboss.netty.handler.codec.http.HttpRequest;
import org.jboss.netty.handler.codec.http.HttpResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;

/**
 *测试文件得上传下载
 * @author 小易同学
 */

@RestService
public class PrjYizjRestService extends BaseRestService {
    /**
     * 测试
     * @param files
     * @param request
     * @param response
     * @throws IOException
     */
    @PostMapping("/upload")
    public void upload(@RequestPart("uploadFile") MultipartFile[] files, HttpRequest request, HttpResponse response) {
        throw new AppException("这是一个错误");
//        if(files != null){
//            for (MultipartFile file:files
//                 ) {
//                String fileName=file.getOriginalFilename();
//                System.out.println(fileName);
//                InputStream inputStream=file.getInputStream();
//                File saveFile=new File("E://test");
//                if(!saveFile.exists()){
//                    saveFile.mkdirs();
//                }
//                OutputStream outputStream=new FileOutputStream(saveFile.getPath()+File.separator+fileName);
//                byte[] bs = new byte[1024];
//                int len;
//                while ((len = inputStream.read(bs)) != -1) {
//                    outputStream.write(bs, 0, len);
//                }
//
//            }
//        }
    }


}
