/*
 * PTra13_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice13.ptra13;

import practice13.common.Hero;
import practice13.common.Slime;

public class PTra13_04{

	/*
	 * ★ PTra13_02, PTra13_03で作成した、Hero/Slimeクラスを使用します
	 */

	public static void main(String[] args) {

		// ★ HeroインスタンスとSlimeインスタンスを作成し、それぞれの名前に"勇者", "スライム"を設定してください
		Hero a = new Hero();
		Slime b = new Slime();
		a.setName("勇者");
		b.setName("スライム");
		

		/*
		 * ★ HeroとSlimeを、どちらかが体力０になるまで戦わせます
		 *
		 * 	●Heroの攻撃 -> ダメージ判定 -> Slimeの攻撃 -> ダメージ判定
		 * 上記を繰り返し行います
		 */
		boolean heroWin = true;
		while (true) {
			System.out.println(a.getName() + "の攻撃");
			int heroAttack = a.attack();
			if (b.damage(heroAttack)) {
				System.out.println(b.getName() + "は倒れた・・・\n");
				break;
			}

			System.out.println(b.getName() + "の攻撃");
			int slimeAttack = b.attack();
			if (a.damage(slimeAttack)) {
				System.out.println(a.getName() + "は倒れた・・・\n");
				heroWin = false;
				break;
			}
		}

		// 勝利した方の出力を行ってください。「○○は■■との戦闘に勝利した」
		if (heroWin) {
			System.out.println(a.getName() + "は" + b.getName() + "との戦闘に勝利した");
		} else {
			System.out.println(b.getName() + "は" + a.getName() + "との戦闘に勝利した");
		}
	}
}
