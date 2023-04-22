package com.UrlHitCounter.Rakesh.Controler;

import com.UrlHitCounter.Rakesh.Service.Model.UrlHit;
import com.UrlHitCounter.Rakesh.Service.UrlHitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UrlHitControler {
    @Autowired
    UrlHitService urlHitService;
    @GetMapping("count")
    public UrlHit getCount(@RequestParam String name){
        return urlHitService.getContWithNameService(name);
    }
    @GetMapping("getAllUserWithCount")
    public List<UrlHit> getAllUserWithCount(){
        return urlHitService.getAllUserWithCountFromService();
    }

}
