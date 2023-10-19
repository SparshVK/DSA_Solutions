import java.util.*;
public class Char_hashing{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       String str = sc.nextLine();
       System.out.println("----------------------------------------------------");
    //    char ch = sc.next().charAt(0);

       // for lower case characters
int hash[] = new int[26];

// pre - calculating the frequency of characters in String
for(int i=0;i<str.length();i++){    
hash[str.charAt(i) - 'a']++;
}

// for(int i=0;i<str.length();i++){    
// System.out.println(hash[i]);
// }
System.out.println("----------------------------------------------------");
int query = sc.nextInt();

// No of queries to be made
while(query-- != 0){
    char c = sc.next().charAt(0); // Query Character
    System.out.println(hash[c - 'a']);
}
sc.close();
}
}