package dao;

import java.util.List;

import org.springframework.stereotype.Repository;
import entity.Trip;

public interface  TripDAO  {
        //��ʾ����
	   public List<Trip> find();  
	   public List<Trip>findByPage(int start,int end);
      
     
       
}
