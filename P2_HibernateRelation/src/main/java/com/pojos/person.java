package com.pojos;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class person
{	
	@Id
	@GeneratedValue
	private int pid;
	private String pname;
	private String ploc;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_passport_id")
	private passport pt;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_rc_person_id")
	private rationCard rc;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable
	(
			name = "person_course",
			joinColumns = { @JoinColumn(name = "person_id") },
			inverseJoinColumns = { @JoinColumn(name = "course_id") }
	)
	private List<course> cou;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_person_BankId")
	private List<BankAccount> Ban;
	
	public person() {}


	


	public person(String pname, String ploc, passport pt, rationCard rc, List<course> cou, List<BankAccount> ban)
	{
		super();
		this.pname = pname;
		this.ploc = ploc;
		this.pt = pt;
		this.rc = rc;
		this.cou = cou;
		Ban = ban;
	}


   


	public List<BankAccount> getBan()
	{
		return Ban;
	}





	public void setBan(List<BankAccount> ban)
	{
		Ban = ban;
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


	public String getPloc()
	{
		return ploc;
	}


	public void setPloc(String ploc)
	{
		this.ploc = ploc;
	}


	public passport getPt()
	{
		return pt;
	}


	public void setPt(passport pt)
	{
		this.pt = pt;
	}


	public rationCard getRc()
	{
		return rc;
	}


	public void setRc(rationCard rc)
	{
		this.rc = rc;
	}


	public List<course> getCou()
	{
		return cou;
	}


	public void setCou(List<course> cou)
	{
		this.cou = cou;
	}





	@Override
	public String toString()
	{
		return "person [pid=" + pid + ", pname=" + pname + ", ploc=" + ploc + ", pt=" + pt + ", rc=" + rc + ", cou="
				+ cou + ", Ban=" + Ban + "]";
	}


		
	
	
	
	
}
