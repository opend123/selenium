package org.det;

public class InternDetails {
	public void interns (String name,String gender) {
		System.out.println("intern name :"+ name);
		System.out.println("intern gender;"+ gender);
	}
	public void interns(int age,int salary) {
		System.out.println("intern age:" + age);
		System.out.println("intern salary:"+salary );
	}

	public static void main(String[] args) {
		InternDetails s = new InternDetails();
		s.interns("praveen","male");
		s.interns(23,20000);
	

	}

}
