import java.util.*;
public class Stack
{
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
	    String a="}}{{";
	    int count=0;
	    char[] ch=a.toCharArray();
    Stack<Character> stack = new Stack<Character>();
             if(ch[0]=='}') {
                count++;
                ch[0]='{';
            } 
            if(ch[ch.length-1]=='{') {
                count++;
                ch[ch.length-1]='}';
            }
            System.out.println(String.valueOf(ch));
            for(int i = 0; i < a.length(); i++) {
                if(ch[i]=='{') {
                    stack.push((Character) ch[i]);
                    System.out.println("1."+stack.size());
                     //System.out.println(count);
                     System.out.println(i);
                     System.out.println("1."+String.valueOf(ch));
                
                }
                else if(ch[i]=='}'&&stack.size()!=0) {
                   
                    stack.pop();
                     System.out.println("2."+stack.size());
                    //System.out.println(count);
                    System.out.println(i);
                    System.out.println("2"+String.valueOf(ch));
                }
                
                else if(ch[i]=='}'&&stack.size()==0) {
                 ch[i]='{';
                 count++;
                 System.out.println(i);
                   System.out.println("3"+String.valueOf(ch));
                 stack.push((Character) ch[i]);
                 System.out.println("3."+stack.size());
                // System.out.println(count);
                }
                }
        System.out.println(count);
	}
}

