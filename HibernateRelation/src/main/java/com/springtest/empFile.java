package com.springtest;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class empFile
{
	public List<empPojo> getEmpData()
	{	
		ArrayList<empPojo> Arrl = new ArrayList<>();
		String path = "./employee_details.txt";
		try( FileReader fr = new FileReader(path);
		     BufferedReader br = new BufferedReader(fr); )
		{
			for(String s = br.readLine(); s!=null; s = br.readLine())
			{	
				empPojo e = new empPojo();
				String[] sa = s.split(",");
				e.setEid(Integer.parseInt(sa[0]));
				e.setEname(sa[1]);
				e.setEsal(Double.parseDouble(sa[2]));
				e.setEdesg(sa[3]);
				Arrl.add(e);
			}
		}
		catch(Exception e)
		{
			System.out.println("==================== File reading catch block executed =====================");
			e.printStackTrace();
		}
		
		
		
		return Arrl;
	}
}
