package practice14.common;

public abstract class  JavaCourse implements Course {
private String[] Unit;
private String name;

public String getCourseName() {
	String PREFIX =  "【Eラーニング】Jave";
	 return PREFIX;
 }

public String[] getCourseUnit() {
	String[] Unit = {"式と演算,制御構文,メソッド,配列,オブジェクト指向,継承,高度な継承"};
	return Unit;
	
}



}
 