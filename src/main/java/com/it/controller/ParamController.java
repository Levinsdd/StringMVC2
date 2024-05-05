package com.it.controller;

import com.it.pojo.User;
import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

@Controller
public class ParamController {
    //username=zhangsan&age=18&hobbies=zq&birthday=2018/11/11
    @GetMapping("param1")
    public String param1(User user){
        System.out.println(user);
        return "index.jsp";
    }

    @PostMapping("param11")
    public String param11(@RequestBody MultipartFile myfile) throws IOException {
        System.out.println(myfile);
        //将上传的文件保存
        //1.获得当前文件按的输入流
        InputStream inputStream = myfile.getInputStream();
        //2.获得输出流
        OutputStream fileOutputStream = new FileOutputStream("D:\\test\\"+myfile.getOriginalFilename());
        //执行文件拷贝
        IOUtils.copy(inputStream,fileOutputStream);
        //关闭流资源
        inputStream.close();
        fileOutputStream.close();
        return "/index.jsp";
    }
    @GetMapping("/request1")
    public String param12(HttpServletRequest request){
        request.setAttribute("name","name");
        return "/request2";
    }
    @GetMapping("/request2")
    public String param13(@RequestAttribute("name") String name){
        System.out.println(name);
        return "index.jsp";
    }



}

