import java.util.*;
public class Bracketbalance
{
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
	    String a="";
		a=in.nextLine();	//getting input
	    int count=0;
	    char[] ch=a.toCharArray();	//converting to character array
    Stack<Character> stack = new Stack<Character>();	//stack creation (best method)
            if(ch.length%2==0) { 	//check for even length
		if(ch[0]=='}') {	//changinging first character to open
                count++;
                ch[0]='{';
            } 
            if(ch[ch.length-1]=='{') {	//changinging last character to open
                count++;
                ch[ch.length-1]='}';
            }
            System.out.println(String.valueOf(ch));
            	for(int i = 0; i < a.length(); i++) {
                	if(ch[i]=='{') {
                   		 stack.push((Character) ch[i]);		//pushing element into stack
                                                         
               			 }
               		 else if(ch[i]=='}'&&stack.size()!=0) {
                   
                  		  stack.pop();		//pop if match found
                     
               			 }
                
               		 else if(ch[i]=='}'&&stack.size()==0) {
                		 ch[i]='{';		//changing brackets if needed
                		 count++;
                		 stack.push((Character) ch[i]);      //pushing elment                        
                		}
               		 }
        		System.out.println(count);	//print final count
	   	 }
		else
			System.out.println("Can't be made bracket balance");
	
	
	}
}

