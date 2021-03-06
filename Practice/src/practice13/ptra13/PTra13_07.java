/*
 * PTra13_07.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice13.ptra13;

import practice13.common.Item;
import practice13.common.Slime;
import practice13.common.SuperHero;

public class PTra13_07 {

	/*
	 * ★ common.Item, common.SuperHero, common.Slimeを使用します
	 */

	public static void main(String[] args) {

		// ★ SuperHeroインスタンスとSlimeインスタンスを作成し、それぞれの名前に"勇者（装備あり）", "スライム"を設定してください
		 SuperHero sh = new SuperHero();
		 Slime sl = new Slime();
		 sh.setName("勇者(装備あり)");
		 sl.setName("スライム");

		// Itemクラスのインスタンスを作成し、("こんぼう", 4）をコンストラクタの引数にしてください
			Item item = new Item("こんぼう", 4);

			// 作成したItemインスタンスをSuperHeroに持たせてください
			sh.setEquipment(item);

			/*
			 * SuperHeroとSlimeを、どちらかが体力０になるまで戦わせます
			 *
			 * 	●SuperHeroの攻撃 -> ダメージ判定 -> Slimeの攻撃 -> ダメージ判定
			 * 上記を繰り返し行います
			 */
			boolean heroWin = true;
			while (true) {
				System.out.println(sh.getName() + "の攻撃");
				int heroAttack = sh.attack();
				if (sl.damage(heroAttack)) {
					System.out.println(sl.getName() + "は倒れた・・・\n");
					break;
				}

				System.out.println(sl.getName() + "の攻撃");
				int slimeAttack = sl.attack();
				if (sh.damage(slimeAttack)) {
					System.out.println(sh.getName() + "は倒れた・・・\n");
					heroWin = false;
					break;
				}
			}


			// 勝利した方の出力を行ってください。「○○は■■との戦闘に勝利した」
			if (heroWin) {
				System.out.println(sh.getName() + "は" + sl.getName() + "との戦闘に勝利した");
			} else {
				System.out.println(sl.getName() + "は" + sh.getName() + "との戦闘に勝利した");
			}
		}
	}
