package entity;

import java.io.Serializable;
import java.util.List;

import dao.TripDAO;

public class Trip implements Serializable{
   private int id;
   private String name;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
   
   


   

 

}
