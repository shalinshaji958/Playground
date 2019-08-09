#include<stdio.h>
int main()
{
  int a,b,n;
  scanf("%d",&n);
  a=n%10;
  n=n/10;
  b=n%10;
  printf("%d",b);
  return 0;
}