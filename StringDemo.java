public class StringDemo{
	public static void main(String[] args){
		String str1="He  llo";
		String str2=new String("hello");
		System.out.println(str1);
		System.out.println(str2);
		int s1=str1.length();
		System.out.println(s1);
		
		char s2= str1.charAt(2);
		System.out.println(s2);
		System.out.println(str2.concat(str1));
		
		System.out.println(str1.compareTo(str2));
		System.out.println(str1.compareToIgnoreCase(str2));
		
		System.out.println (str1.equals(str2));
		System.out.println (str1.equalsIgnoreCase(str2));
		
		System.out.println(str1.startsWith("He"));
		System.out.println(str1.startsWith("Hello"));
		System.out.println(str2.startsWith("he"));
		System.out.println(str1.endsWith("h"));
		System.out.println(str1.endsWith("lo"));
		System.out.println(str2.endsWith("llo"));

		
		System.out.println(str1.indexOf("h"));
		System.out.println(str1.indexOf("e"));
		System.out.println(str1.indexOf("r"));
		System.out.println(str1.lastIndexOf("H"));
		System.out.println(str2.lastIndexOf("e"));
		System.out.println(str2.lastIndexOf("l"));

		System.out.println(str1.replace("H","q"));


		System.out.println(str1.toLowerCase());
		System.out.println(str1.toUpperCase());
		
		System.out.println(str1.substring(3));
		System.out.println(str1.substring (2,3));
		

		System.out.println(str1+"bye");
		System.out.println(str2.trim());

		String s3 = str1.intern();
		System.out.println(str1);
		System.out.println(s3);


	}
}