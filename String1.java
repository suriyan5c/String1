package string1;
class StrTest
{
public static void main(String[] args)
{
String[] names = {"Suresh","Suri","Vishal","Nithya"};
for(int i=0;i<3;i++)
{
for(int j=i+1;j<4;j++)
{
String temp = names[i];
names[i]=names[j];
names[j]=temp;
}
}
for(int k=0;k<4;k++)
{
System.out.println(names[k]);
}
}
}
