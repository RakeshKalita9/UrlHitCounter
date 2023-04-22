package com.UrlHitCounter.Rakesh.Service;

import com.UrlHitCounter.Rakesh.RepoSitory.UrlHitDao;
import com.UrlHitCounter.Rakesh.Service.Model.UrlHit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UrlHitService {
    @Autowired
    UrlHitDao urlHitDao;
    public UrlHit getContWithNameService(String name){
        return urlHitDao.getContWithNameRepo(name);
    }
    public List<UrlHit> getAllUserWithCountFromService(){
      return urlHitDao.getAllUserWithCountFromRepo();
    }
}
