package com.pojos;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "person_details")
public class person 
{		
	@Id
	@GeneratedValue
	private int pid;
	private String pname;
	private double page;
	private String paddress;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fkppassid")
	private passport pt;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable( name = "percou", joinColumns = @JoinColumn(name = "fkpecid"),  inverseJoinColumns = @JoinColumn(name = "fkcoid") )
	private List<course> cou;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "fkpmid")
	private List<mobile> mob;
	
	
	
	
	
	public person()
	{
		super();
	}
	public person(String pname, double page, String paddress, passport pt, List<course> cou, List<mobile> mob)
	{
		super();
		this.pname = pname;
		this.page = page;
		this.paddress = paddress;
		this.pt = pt;
		this.cou = cou;
		this.mob = mob;
	}
	public List<course> getCou()
	{
		return cou;
	}
	public void setCou(List<course> cou)
	{
		this.cou = cou;
	}
	public List<mobile> getMob()
	{
		return mob;
	}
	public void setMob(List<mobile> mob)
	{
		this.mob = mob;
	}
	public passport getPt()
	{
		return pt;
	}
	public void setPt(passport pt)
	{
		this.pt = pt;
	}
	public int getPid()
	{
		return pid;
	}
	public void setPid(int pid)
	{
		this.pid = pid;
	}
	public String getPname()
	{
		return pname;
	}
	public void setPname(String pname)
	{
		this.pname = pname;
	}
	public double getPage()
	{
		return page;
	}
	public void setPage(double page)
	{
		this.page = page;
	}
	public String getPaddress()
	{
		return paddress;
	}
	public void setPaddress(String paddress)
	{
		this.paddress = paddress;
	}
	
	@Override
	public String toString()
	{
		return "person [pid=" + pid + ", pname=" + pname + ", page=" + page + ", paddress=" + paddress + ", pt=" + pt
				+ ", cou=" + cou + ", mob=" + mob + "]";
	}
	
	
	
}
