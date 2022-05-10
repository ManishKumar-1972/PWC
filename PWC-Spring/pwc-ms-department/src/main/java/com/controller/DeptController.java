package com.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.model.Department;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeptController {

	private static Map<String, List<Department>> deptDB=new HashMap<String, List<Department>>();
	static List<Department> lst=new ArrayList<Department>();
	static {
		deptDB=new HashMap<String,List<Department>>();
		
		Department dept=new Department("IT","Manish");
		lst.add(dept);
		dept=new Department("HR","Harsh");
		lst.add(dept);
		deptDB.put("india", lst);
		
		lst=new ArrayList<Department>();
		dept=new Department("IT","malay");
		lst.add(dept);
		dept=new Department("HR","singapore");
		lst.add(dept);
		deptDB.put("asia", lst);
	}
	@GetMapping("/loaddept/{location}")
	public List<Department> loadEmp(@PathVariable("location")String location){
		List<Department> deptlist=deptDB.get(location);
		if(deptlist == null) {
			deptlist=new ArrayList<Department>();
			Department emp=new Department("NA","NOT FOUND");
			deptlist.add(emp);
		}
		
		return deptlist;
	}
	
	@GetMapping("/loaddept")
	public List<Department> loadDept(){
		return lst;
	}
	
}