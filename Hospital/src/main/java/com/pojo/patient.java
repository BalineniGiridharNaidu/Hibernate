package com.pojo;

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
@Table(name = "patient_details")
public class patient
{	
	@Id
	@GeneratedValue
	private int pid;
	private String pname;
	private int page;
	private String pcondition;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_bed")
	private bed b;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_address")
	private address adr;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable
		(
			name = "patient_doctor_join_table",
			joinColumns = { @JoinColumn(name = "person_id") },
			inverseJoinColumns = { @JoinColumn(name = "doctor_id")}
		)
	private List<doctor> doc;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_person_lab_Id")
	private List<labTest> labt;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_person_food_id")
	private List<foodBeverages> fb;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_person_contactDetails_id")
	private List<contact> cdetails;
	
	

//	public patient(String pname, int page, String pcondition, bed b, address adr, List<doctor> doc, List<labTest> labt,
//			List<foodBeverages> fb, List<contact> cdetails)
//	{
//		super();
//		this.pname = pname;
//		this.page = page;
//		this.pcondition = pcondition;
//		this.b = b;
//		this.adr = adr;
//		this.doc = doc;
//		this.labt = labt;
//		this.fb = fb;
//		this.cdetails = cdetails;
//	}
	
	
	
	public patient(String pname, int page, String pcondition, address adr)
	{
		super();
		this.pname = pname;
		this.page = page;
		this.pcondition = pcondition;
		this.adr = adr;
	}



	public patient()
	{
		super();
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

	public int getPage()
	{
		return page;
	}

	public void setPage(int page)
	{
		this.page = page;
	}

	public String getPcondition()
	{
		return pcondition;
	}

	public void setPcondition(String pcondition)
	{
		this.pcondition = pcondition;
	}

	public bed getB()
	{
		return b;
	}

	public void setB(bed b)
	{
		this.b = b;
	}

	public address getAdr()
	{
		return adr;
	}

	public void setAdr(address adr)
	{
		this.adr = adr;
	}

	public List<doctor> getDoc()
	{
		return doc;
	}

	public void setDoc(List<doctor> doc)
	{
		this.doc = doc;
	}

	public List<labTest> getLabt()
	{
		return labt;
	}

	public void setLabt(List<labTest> labt)
	{
		this.labt = labt;
	}

	public List<foodBeverages> getFb()
	{
		return fb;
	}

	public void setFb(List<foodBeverages> fb)
	{
		this.fb = fb;
	}

	public List<contact> getCdetails()
	{
		return cdetails;
	}

	public void setCdetails(List<contact> cdetails)
	{
		this.cdetails = cdetails;
	}



	@Override
	public String toString()
	{
		return "patient [pid=" + pid + ", pname=" + pname + ", page=" + page + ", pcondition=" + pcondition + ", b=" + b
				+ ", adr=" + adr + ", doc=" + doc + ", labt=" + labt + ", fb=" + fb + ", cdetails=" + cdetails + "]";
	}
	
	
	
}
