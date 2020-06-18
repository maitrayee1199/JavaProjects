//thread mail merge
import java.util.regex.Pattern;
import java.util.regex.Matcher;
class mail extends Thread
{
String names[]={"abc@gmail.com","xyz@gmail.com","pqar@gmail.com","setmax@gmail.com","happy123@gmail.com"};
;
//returs merged mail
String s="hello! <name>,\nwishing you Merry Christmas from all of us at Nykaa.....";
String finalMail(String s,String name)
{

 Pattern p= Pattern.compile("[1-9@]");
 Matcher m= p.matcher(name);
 m.find();
 
return (s.replaceAll("<name>",name.substring(0,m.start())));
}
public void run()
{
	for(int i=0;i<names.length;i++)
	{
		System.out.println(finalMail(s,names[i])+"\n MESSAGE SENT TO: "+names[i]+"\n");
	}
}
}

class mail_merge
{
	public static void main (String args[])
	{
	  mail m=new mail();
	  m.start();
	}
}