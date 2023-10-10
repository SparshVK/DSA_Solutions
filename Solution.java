// import java.util.*;
class Solution {
	
	public static long reverseBits(long n) {
		// Write your code here
		long j=0;
        long l=0;
        int c=0;

        // Doing Prime Factorisation in top to bottom order( !!! NOT FROM BOTTOM TO TOP)
        while(n != 0)
        {
          c++;
          j = j*10 + n%2;
            n = n/2;
        }
   

	int pos = 32 - c; // counting the no. of zeros to be added at end

	for(long i=j;i!=0;i=i/10)
		{
           l = l + (int) (Math.pow(2,pos++))*(i%10);
        }

	return l;
}
	// ------------------------------------------------------------------------

        public static int reverse(int x) {
            // System.out.println(Integer.MAX_VALUE);
            // System.out.println(Integer.MIN_VALUE);
            if(x > Integer.MAX_VALUE || x < Integer.MIN_VALUE)
            return 0;
            else{
                int z=0;
                for(int i=x;i!=0; i=i/10)
                    z= z*10 + i%10;
                return z;
            }
        }
// --------------------------------------------------------------

static void Palindrome(int x){    
    int z=0;
                
     for(int i=x;i!=0; i=i/10)
        z= z*10 + i%10;
    if(x == z)
    System.out.println("Palindrome");
    else 
    System.out.println("Not Palindrome");
            
}
	// ----------------------------------------------------------------

	// Time Complexity O(log(n))
public static int calcGCD(int n, int m){
    // Write your code here.
    if(n==m) return m;
    int i =1,c=1;
    int n1 = (int)Math.sqrt(n),m1 = (int)Math.sqrt(m);
    for(i=2; i <= Math.max(n1,m1); i++){
    
        if(n%i == 0 && m%i == 0)
        {
            if(i>c)
        c=i;
    }
        if(n/i != 0 && n%(n/i) == 0 && m%(n/i) == 0)
        {
            if(n/i > c)
        c=n/i;}

        if(m/i != 0 && n%(m/i) == 0 && m%(m/i) == 0)
        {
            if(m/i > c)
        c=m/i;
    }
}
    return c;   
}
// -----------------------------------------------------------
	// Time Complexity O(n)
	 public static int calcGCD(int n, int m){
    // Write your code here.
    int i =1,c=0;
    int s = Math.min(n,m);
    while(i <= s)
    {
        if(n%i == 0 && m%i == 0)
        c = i;
            i++;
    }
   
    return c;
   
}
// -----------------------------------------------------

    public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);
        // int n = in.nextInt();
        // System.out.println(n);
        // System.out.println(reverse(n));
        // Palindrome(n);
        System.out.println(calcGCD(63,63));
        // System.out.println(reverseBits(11));
    //     System.out.println(reverseBits(13));
    //     System.out.println(reverseBits(14));
    //     System.out.println(reverseBits(11));
    // in.close();
    }
}
