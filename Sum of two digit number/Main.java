#include<stdio.h>
int main()
{
 int n,a,b,s;
  scanf("%d",&n);
  a=n%10;
  b=n/10;
  s=a+b;
  printf("%d",s);
  return 0;
}