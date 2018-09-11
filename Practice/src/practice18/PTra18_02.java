/*
 * PTra18_02.java
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

public class PTra18_02 {

	/*
	 * ★ BestElevenCandidate.csvの情報を保持するためのクラス、entity.Playerクラスを作成してください
	 *
	 * フィールド
	 * 		position	：	String
	 * 		name		：	String
	 * 		country		：	String
	 * 		team		：	String
	 * メソッド
	 * 		各アクセサ
	 *
	 * 		toString()	：	Objectクラスのオーバーライド
	 * 		各フィールドの値を、カンマ区切りの文字列で取得する
	 */

	public static void main(String[] args) throws IOException {

		/*
		 * entity.Playerの作成後に行ってください
		 *
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */
		  FileReader fr = new FileReader("file/BestElevenCandidate.csv");
          BufferedReader br = new BufferedReader(fr);
          entity et = new  entity();
           String line;
          ArrayList<Player> array = new  ArrayList<Player>();
          while ((line = br.readLine()) != null) { 
        	  String [] s = new String[4];
        	  Player p = new Player();
        	  s = line.split(",");
        	  p.setPosition(s[0] + ",");
        	  p.setName(s[1]+",");
        	  p.setCountry(s[2]+",");
        	  p.setTeam(s[3]);
        	  
        	
        	  array.add(p);

        	 
       }
         
        	 
       
         
        	
     
          
        
          
	
	
	
          
              
    
    
	  

		// ★ ArrayListに格納されているインスタンス全てのtoStringメソッドを実行し、出力してください
          	// ※ できれば拡張for文を使いましょう
	for ( int i = 0; i < array.size(); ++i ) {
		array.toString();
		System.out.println(array.get(i));
	}
		
}
}
	
	
         
          
        	  
	
	
