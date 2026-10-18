import java.util.Scanner;

class Strings {
    Scanner sc = new Scanner(System.in);
    String str1;
    String str2;

    Strings(String str1, String str2) {
        this.str1 = str1;
        this.str2 = str2;
    }

    void display() {
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
    }

    void length() {
        System.out.println("The length of string " + str1 + " is: " + str1.length());
        System.out.println("returns the count of the number of characters");
        System.out.println("syntax = stringname.length()");
    }

    void charAtDemo() {
        System.out.println("Enter the index of char to find:");
        int num = sc.nextInt();
        if (num >= 0 && num < str1.length()) {
            System.out.println("The char at index " + num + " is " + str1.charAt(num));
        } else {
            System.out.println("Invalid index! Valid range is 0 to " + (str1.length() - 1));
        }
        System.out.println("returns the character at the specified index position.");
        System.out.println("syntax = stringname.charAt(index)");
    }
    void LowerCaseDemo() {
        System.out.println("Lowercase: " + str1.toLowerCase());
        System.out.println("syntax = stringname.toLowerCase()");
    }


    void upperCaseDemo() {
        System.out.println("Uppercase: " + str1.toUpperCase());
        System.out.println("syntax = stringname.toUpperCase()");
    }
    void concate(){
	System.out.println("append the contents of one string to another string.");

	System.out.println(str2.concat(str1));
	System.out.println(str1.concat(str2));
	System.out.println("Sytax: stringname.concat(Stringname)");

}

    void compareDemo() {
        System.out.println("compare: " + str1.compareTo(str2));
        System.out.println("compareIgnoreCase: " + str1.compareToIgnoreCase(str2));
        System.out.println("syntax = string1.equals(string2)");
	System.out.println("syntax = string1.equalsIgnoreCase(string2)");
	System.out.println("in equal case we don't check eigther the given case is upper or lower");
	System.out.println("compare the unicode values of the characters available in a String, by considering their case. This method is designed for sorting the strings."); 
    }
    void booleanDemo(){
	System.out.println ("equals: "+str1.equals(str2));
	System.out.println ("equalsIgnoreCase: " +str1.equalsIgnoreCase(str2));
	System.out.println ("boolean equals(Object): to compare the contents of the string objects by considering their case.");
	System.out.println ("boolean equalsIgnoreCase(String): This method can be used to compare the content of the string objects by ignoring their case.");
    }
    void startsWithDemo() {
    	System.out.println("Enter the prefix to check:");
   	String prefix = sc.next();
    	boolean result = str1.startsWith(prefix);
    	System.out.println("Does \"" + str1 + "\" start with \"" + prefix + "\"? " + result);

    	System.out.println("Enter a start index to check from:");
    	int index = sc.nextInt();
    	System.out.println("startsWith(prefix, " + index + "): " + str1.startsWith(prefix, index));

    	System.out.println("returns true if the string begins with the given prefix.");
    	System.out.println("syntax = stringname.startsWith(prefix)");
    	System.out.println("syntax = stringname.startsWith(prefix, startIndex)");
    }

    void endsWithDemo() {
    	System.out.println("Enter the suffix to check:");
    	String suffix = sc.next();
    	boolean result = str1.endsWith(suffix);
    	System.out.println("Does \"" + str1 + "\" end with \"" + suffix + "\"? " + result);

    	System.out.println("returns true if the string ends with the given suffix.");
    	System.out.println("syntax = stringname.endsWith(suffix)");
    }
    void substringDemo() {
    	System.out.println("Enter the start index:");
    	int start = sc.nextInt();
    	System.out.println("Enter the end index:");
    	int end = sc.nextInt();

    	if (start >= 0 && end <= str1.length() && start <= end) {
        	System.out.println("substring(" + start + "): " + str1.substring(start));
        	System.out.println("substring(" + start + ", " + end + "): " + str1.substring(start, end));
    	} else {
        	System.out.println("Invalid index! Valid range is 0 to " + str1.length());
    	}

    	System.out.println("returns a part of the string.");
    	System.out.println("syntax = stringname.substring(startIndex)");
    	System.out.println("syntax = stringname.substring(startIndex, endIndex)");
    }

     void trimDemo() {
    	String text = "   " + str1 + "   ";
    	System.out.println("Before trim: " + text );
    	System.out.println("After trim:  " + text.trim() );
    	System.out.println("removes leading and trailing spaces.");
    	System.out.println("syntax = stringname.trim()");
   }

    void internDemo() {
    	String a = new String(str1);   // new object in heap memory
    	String b = a.intern();         // reference from the string pool

    	System.out.println("a == str1 : " + (a == str1));
    	System.out.println("b == str1 : " + (b == str1));
    	System.out.println("a.equals(str1) : " + a.equals(str1));

    	System.out.println("returns the string from the string pool (adds it if absent).");
    	System.out.println("syntax = stringname.intern()");
   }
}

public class StringDemoeasytolearneachcase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first string:");
        String a = input.nextLine();
        System.out.println("Enter the second string:");
        String b = input.nextLine();

        Strings s = new Strings(a, b);
        int choice;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Display strings");
            System.out.println("2. length()");
            System.out.println("3. charAt()");
            System.out.println("4. toUpperCase()");
            System.out.println("5. equals()");
	    System.out.println("6. startsWith()");
	    System.out.println("7. endsWith()");
	    System.out.println("8. substring()");
	    System.out.println("9. trim()");
	    System.out.println("10. intern()");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    s.display();
                    break;
                case 2:
		    s.display();
                    s.length();
                    break;
                case 3:
                    s.charAtDemo();
                    break;
                case 4:
                    s.upperCaseDemo();
                    break;
                case 5:
                    s.compareDemo();
                    break;
		case 6:
    		     s.startsWithDemo();
    		     break;
	        case 7:
                     s.endsWithDemo();
                     break;
		case 8:
                     s.substringDemo();
                     break;
		case 9:
    		     s.trimDemo();
                     break;
		case 10:
    		     s.internDemo();
                     break;
                case 0:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice, try again.");
            }
        } while (choice != 0);
    }
}