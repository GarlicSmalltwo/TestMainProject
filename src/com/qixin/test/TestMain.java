package com.qixin.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class TestMain {
         public static void main(String[] args) {
	               String str="sdfjklsajfoiwernjkwnerkddddddddddddwndfs";
	               count(str);
        }
         
         public static void count(String str) {
        	 System.out.println("待统计字符："+str);
        	 System.out.println("字符数组统计");
        	 char[] count=new char[5000];
        	 for (int i = 0; i < str.length(); i++) {
        		 //str.charAt(i)根据下标找到字符串里的字符，返回char类型
				//System.out.println(str.charAt(i));
        		 
        		 //返回的是数字
        		// System.out.println(count[str.charAt(i)]+1);
        		 //返回的是char类型的字符
        	     // System.out.println((char)(count[str.charAt(i)]+1));
				count[str.charAt(i)]=(char)(count[str.charAt(i)]+1);
			}
        	 
           toenum(count);
        	 
         }
         
         public static void toenum(char[] count) {
        	 Map<Character,Integer> map=new HashMap<Character,Integer>();
        	 for (int i = 0; i < count.length; i++) {
			 if(count[i]>0) {
				 char c=(char)i;//int转char
				 System.out.println(c);
				 int ci=count[i];//char转int
				 System.out.println("字符：" + c +  "  编码："+  i + " 频次：" + ci);
			     map.put(c, ci);
			 }
				
			}
        	 
        	tomap(map);
        	 
         }
         
         public static void tomap(Map<Character,Integer> map) {
        	 System.out.println("遍历map集合");
        	 for (Map.Entry entry: map.entrySet()) {
				System.out.println(entry.getKey()+" "+entry.getValue());
			}
        	 System.out.println("map存到list，按频次排序");
        	 
        	 List<Map.Entry<Character, Integer>> list=new ArrayList<>(map.entrySet());
        	 //排序
        	 Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {

				@Override
				public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
					//System.out.println("   o1=    "+o1+"，    o2=      "+o2);
					//System.out.println("o1.getKey()=      "+o1.getKey()+"，     o2.getKey()=        "+o2.getKey());
					//System.out.println("o1.getValue()=     "+o1.getValue()+"，      o2.getValue()=         "+o2.getValue());
					
					return o2.getValue()-o1.getValue();//倒序
				}
			});
        	 
        	for (Map.Entry entry : list) {
				System.out.println(entry.getKey()+"          "+entry.getValue());
			} 
        	 System.out.println("------------------------------------------------------");
        	 
        	int maxCount= list.get(0).getValue();
        	 System.out.println("重复最多次数："+maxCount);
        	 System.out.println("重复最多的字符是：");
        	 
        	 for (Map.Entry entry : list) {
				if(entry.getValue().equals(maxCount)) {
					System.out.print(entry.getKey());
				}else {
					break;//不相等就不是重复最多的
				}
			}
        	 
         }
         
      
         
         
         
}
