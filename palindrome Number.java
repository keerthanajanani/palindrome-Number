# palindrome-Number
import java.io.*;
import java.util.*;
public class palindrome Number
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int r,n,temp,sum=0;
while(n>0)
{
r=n%10;
sum=(sum*10)+r;
n=n/10;
}
if(temp==sum)
{
System.out.println("It is Palindrome number");
}
else
{
System.out.println("It is not Palindrome number");
}
}
}
