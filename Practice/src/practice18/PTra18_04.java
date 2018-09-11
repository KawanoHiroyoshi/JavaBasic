/*
 * PTra18_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

import practice18.entity.Player;

public class PTra18_04 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) throws IOException {

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */
		
		
         ArrayList<Player> array0 = new ArrayList<Player>();
         ArrayList<Player> array1 = new ArrayList<Player>();
         ArrayList<Player> array2 = new ArrayList<Player>();
         ArrayList<Player> array3 = new ArrayList<Player>();
         FileReader fr = new FileReader("file/BestElevenCandidate.csv");
         BufferedReader br = new BufferedReader(fr);
         entity et = new  entity();
          String line;
         ArrayList<Player> array = new  ArrayList<Player>();
         while ((line = br.readLine()) != null) { 
       	  String [] s = new String[4];
       	  Player p = new Player();
       	  s = line.split(",");
       	
       	  if(s[0].equals("GK")) {
       		  p.setPosition(s[0] + ",");
       		p.setName(s[1]+",");
         	  p.setCountry(s[2]+",");
         	  p.setTeam(s[3]);
         	 array0.add(p);}
       	  
       	if(s[0].equals("DF")) {
     		  p.setPosition(s[0] + ",");
     		p.setName(s[1]+",");
       	  p.setCountry(s[2]+",");
       	  p.setTeam(s[3]);
       	 array1.add(p);}

    	if(s[0].equals("MF")) {
   		  p.setPosition(s[0] + ",");
   		p.setName(s[1]+",");
     	  p.setCountry(s[2]+",");
     	  p.setTeam(s[3]);
     	 array2.add(p);}
         
    	if(s[0].equals("FW")) {
     		  p.setPosition(s[0] + ",");
     		p.setName(s[1]+",");
       	  p.setCountry(s[2]+",");
       	  p.setTeam(s[3]);
       	 array3.add(p);}
         
         
         }
       	  
       	  
     
         Collections.shuffle(array0);
         Collections.shuffle(array1);
         Collections.shuffle(array2);
         Collections.shuffle(array3);
         
         
        
		// ★ ①のArrayListの中からGK1名、DF4名、MF4名, FW2名をランダムで出力してください
            	 System.out.println(array0.get(0));
            	 System.out.println(array1.get(0));
            	 System.out.println(array1.get(1));
            	 System.out.println(array1.get(2));
            	 System.out.println(array1.get(3));
            	 System.out.println(array2.get(0));
            	 System.out.println(array2.get(1));
            	 System.out.println(array2.get(2));
            	 System.out.println(array2.get(3));
            	 System.out.println(array3.get(0));
            	 System.out.println(array3.get(1));
         
         
	

	
	}
}
