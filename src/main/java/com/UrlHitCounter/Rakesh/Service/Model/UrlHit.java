package com.UrlHitCounter.Rakesh.Service.Model;

public class UrlHit {
    public String name;
    public int Count ;
  public  UrlHit(){
      System.out.println("Default Const is Called");
  }
    public UrlHit(String name){
        this.name=name;
         System.out.println("Parameterized Const is Called "+this.name);
    }


}
