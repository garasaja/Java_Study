package ch15;

class MyOuterClass {
	int outerNum = 10;
	
	class MyInnerClass {
		int InnerNum = 20;
	}
}



public class InnerEx01 {

	public static void main(String[] args) {
		MyOuterClass moc = new MyOuterClass();
		MyOuterClass.MyInnerClass mic = moc.new MyInnerClass(); 

	}

}
