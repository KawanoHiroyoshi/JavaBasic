/*
 * PTra18_03.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import practice18.entity.Player;

public class PTra18_03 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) throws IOException {

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */
		  FileReader fr = new FileReader("file/BestElevenCandidate.csv");
          BufferedReader br = new BufferedReader(fr);
          entity et = new  entity();
          String line;
          ArrayList<Player> array = new ArrayList<Player>();
          while ((line = br.readLine()) != null) { 
        	  String [] s = new String[4];
        	  Player p = new Player();
        	  s = line.split(",",0);
        	  p.setPosition(s[0] + ",");
        	  p.setName(s[1] + ",");
        	  p.setCountry(s[2] + ",");
        	  p.setTeam(s[3]);
        	  
        	
        	  array.add(p);
        	  }
         
          
          
          
          
         
		// ★ ①のArrayListの中から"レアル・マドリード", "バルセロナ"の選手を除外してください
         
          for (int i = array.size() - 1; 0 < i; i--) {
  			Player player = array.get(i);
  			String team = player.getTeam();
  			if ("レアル・マドリード".equals(team) || "バルセロナ".equals(team)) {
  				array.remove(i);
  			}
  		}
     
		// ★ 削除後のArrayListの中身を全件出力してください
      	for ( int i = 0; i < array.size(); ++i ) {
          
          System.out.println(array.get(i));
          }
        
          
          
}
          
	
          
	}
	

		
		
		
		
		
		 

	

