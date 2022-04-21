package com.lagou.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Controller
@RequestMapping(value = "/fileUpoad")
public class FileUploadController {

    @RequestMapping("/singleFileUpload")
    public String singleFileUpload(@RequestParam String fileName, @RequestParam MultipartFile filePic) throws IOException {

        System.out.println(fileName);

        String originalFilename = filePic.getOriginalFilename();

        System.out.println(originalFilename);

        filePic.transferTo(new File("F:/upload/"+originalFilename));


        return "success";
    }

    @RequestMapping("/multiFileUpload")
    public String multiFileUpload(@RequestParam String fileName, @RequestParam MultipartFile[] filePic) throws IOException {

        System.out.println(fileName);
        for (MultipartFile multipartFile : filePic) {
            String originalFilename = multipartFile.getOriginalFilename();
            System.out.println(originalFilename);
            multipartFile.transferTo(new File("F:/upload/"+originalFilename));
        }



        return "success";
    }
}
