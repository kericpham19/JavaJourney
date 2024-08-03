import java.util.*;
public class PhraseInfo
{
  public static void main(String arg[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a phrase : ");
    String string=sc.nextLine();
    String ans="";
    int count=0;
    int count1=0;
    for(int i=0;i<string.length();i++)
    {
      char c=string.charAt(i);
      if(c=='a' || c=='A' || c=='e' || c=='E' || c=='i' || c=='I' || c=='o' || c=='O' || c=='u' || c=='U' || c==' ')
      {
      }
      else ans+=c;
      
      if(c=='a' || c=='A' || c=='e' || c=='E' || c=='i' || c=='I' || c=='o' || c=='O' || c=='u' || c=='U')
      {
        count++;
      }  
    }
    char ch[]= new char[string.length()];     
    for(int j=0;j<string.length();j++)  
    {  
      ch[j]= string.charAt(j);  
      if( ((j>0)&&(ch[j]!=' ')&&(ch[j-1]==' ')) || ((ch[0]!=' ')&&(j==0)) )  
      count1++;  
    }
    System.out.println("Your Phrase: " + string + " \nhas " + count1 + " Words " + count + " vowels");
    System.out.println("Coded : "+ ans);
  }
}