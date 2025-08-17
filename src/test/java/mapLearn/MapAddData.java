package mapLearn;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections4.map.HashedMap;

public class MapAddData {

	public static void main(String[] args) {

		List<String> name=new ArrayList<String>();
		name.add("fname");
		name.add("mname");
		name.add("lname");
		name.add("add");
		
		List<String> name1=new ArrayList<String>();
		name1.add("fname");
		name1.add("mname");
		name1.add("lname");
		name1.add("add");
		
		Map<Integer, List<String>> inter=new HashedMap<Integer, List<String>>();
		
		inter.put(100203012, name);
		inter.put(100203011, name1);
		
		System.out.println(inter);
		
		
		
		Map<Integer,String> mp=new HashedMap<Integer, String>();
		mp.put(100, "");
		
		
		List<String> name=new ArrayList<String>();
		name.add("fname");
		name.add("mname");
		name.add("lname");
		name.add("add");
		
		List<String> name2=new ArrayList<String>();
		name1.add("fname");
		name1.add("mname");
		name1.add("lname");
		name1.add("add");
		
		Map<Integer, List<String>> inter1=new HashedMap<Integer, List<String>>();
		
		inter.put(100203012, name);
		inter.put(100203011, name1);
		
		System.out.println(inter);
		
		
		
		Map<Integer,String> mpp=new HashedMap<Integer, String>();
		mp.put(100, "");
		
		
		

	}

}
