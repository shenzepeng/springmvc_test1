package com.example.springmvc_test1.controller;

import com.example.springmvc_test1.domain.User;
import com.example.springmvc_test1.utils.ClearBeanNullToMap;
import com.example.springmvc_test1.utils.ObjectToMapUtil;
import com.example.springmvc_test1.utils.SzpJsonResult;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Map;

@RestController
public class IndexController {
    @PutMapping("getNumber")
    public SzpJsonResult getNumber(@RequestBody User user) throws Exception {
        Map<String, Object> stringObjectMap = ClearBeanNullToMap.bean2map(user);
        ArrayList<Map<String, Object>> arrayList=new ArrayList<>();
        arrayList.add(stringObjectMap);
        return SzpJsonResult.ok(arrayList);
    }
}
