
public class operation {

public void reverse(int num1, int num2, int sum) {
	
	sum= num1+ num2;
	System.out.println("Sum=" + sum);
}
public void reverseString() {
	String str= "MNB**nbm*" , nstr="";
	char ch;
	System.out.println("Original word:" +str);
	
	for(int i=0; i<str.length(); i++) {
		ch= str.charAt(i);
		nstr = ch+nstr;
	}
	System.out.println("Reverse word:" + nstr);
}
}