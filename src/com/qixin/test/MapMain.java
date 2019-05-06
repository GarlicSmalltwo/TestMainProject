package com.qixin.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MapMain {
	public static void main(String[] args) {
		String str="adksdivhdjksjdsfhdfdjernjrgfrjgkssljfdfdslkllsdfadskssdjk";
		count(str);
	}
	
	public static void count(String str) {
		System.out.println("待统计字符："+str);
		Map<Character, Integer> map=new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			Character one = str.charAt(i);
			if(!map.containsKey(one)) {
				map.put(one, 1);
			}else {
				map.put(one, map.get(one)+1);
			}
		}
		
		for (Map.Entry  entry: map.entrySet()) {
			System.out.println(entry.getKey()+"------"+entry.getValue());
		}
		
		System.out.println("将map存到list中，然后排序");
		
		List<Map.Entry<Character, Integer>> list=new ArrayList<>(map.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<Character,Integer>>() {

			@Override
			public int compare(Entry<Character, Integer> o1, Entry<Character, Integer> o2) {
				
				return o2.getValue()-o1.getValue();//倒序
			}
			
		});
		
		for (Entry<Character, Integer> entry : list) {
			System.out.println(entry.getKey()+"---------------"+entry.getValue());
		}
		
		System.out.println("-------------------------------------------------------------------------------");
		
		int maxCount = list.get(0).getValue();
		System.out.println("重复最多的次数是："+maxCount);
		System.out.print("重复最多的字符是：");
		for (Entry<Character, Integer> entry : list) {
			if(entry.getValue().equals(maxCount)) {
				System.out.print(entry.getKey());
			}else {
				break;
			}
		}
		
	}

}
