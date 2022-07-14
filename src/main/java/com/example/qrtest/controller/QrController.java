package com.example.qrtest.controller;

import com.example.qrtest.util.QrUtil;
import com.google.zxing.WriterException;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.File;
import java.io.IOException;

public class QrController {

    @RequestMapping("/codetest")
    public void codeTest() throws WriterException, IOException{
        String url = "http://localhost:8080";
        int width = 150;
        int height = 150;

        String file_path = "C:"+ File.separator+"qr"+File.separator;
        String file_name = "test.png";
        QrUtil.makeQR(url, width, height, file_path, file_name);
    }
}
