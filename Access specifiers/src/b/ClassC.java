package b;

import a.ClassA;

public class ClassC extends ClassA{

	public static void main(String[] args) {
	ClassA obj=new ClassA();
	System.out.println(obj.a);
	ClassC object=new ClassC();
	int e=object.c;
	System.out.println(e);

	}

}
