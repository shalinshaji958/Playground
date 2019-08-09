#include<stdio.h>
int main()
{
  int a,b,n,sum;
  scanf("%d",&n);
  a=n/100;
  b=n%10;
  sum=a+b;
  printf("%d",sum);
  return 0;
}