package com.telusko.DemoHibn;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="alien_table")
public class Allen  
{
	 @Id 
	private  int aid;
	private AlienName aname;
	@Column(name="alien_color")
	private String color;
	
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	
	public AlienName getAname() {
		return aname;
	}
	public void setAname(AlienName aname) {
		this.aname = aname;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Allen [aid=" + aid + ", aname=" + aname + ", color=" + color + "]";
	}
	
	
}
