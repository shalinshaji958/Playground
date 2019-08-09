#include <stdio.h>
int main() {
  int n,a,r,d;
	scanf("%d",&n);
  a=n;
  while(n>0)
  {
  r=n%10;
  d=r*r*r+d;
  n=n/10;
  }
  if (d==a)
  {
    printf("Armstrong Number");
  }
    else
    {
      printf("Not an Armstrong Number");
    }
	return 0;
}