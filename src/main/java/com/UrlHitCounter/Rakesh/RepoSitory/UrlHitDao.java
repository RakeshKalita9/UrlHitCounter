package com.UrlHitCounter.Rakesh.RepoSitory;

import com.UrlHitCounter.Rakesh.Service.Model.UrlHit;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class UrlHitDao {
    public List<UrlHit>usersList;
    public UrlHitDao(){
       usersList = new ArrayList<>() ;
    }
    public UrlHit getContWithNameRepo(String name){
        if(!usersList.isEmpty()) {

            for (UrlHit ele : usersList) {
                String varName = ele.name;
                if (name.equals(varName)) {
                    ele.Count++;
                    return ele;
                }
            }
            usersList.add(new UrlHit(name));
            usersList.get(usersList.size()-1).Count++;
            return usersList.get(usersList.size()-1);
        }else{
            usersList.add(new UrlHit(name));
            usersList.get(0).Count++;
            return usersList.get(0);
        }
    }
    public List<UrlHit> getAllUserWithCountFromRepo(){
        return usersList;
    }


}
