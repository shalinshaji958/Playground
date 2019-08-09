#include <stdio.h>
int main() {
  int n,s,r;
	scanf("%d",&n);
  while(n>0)
  {
    r=n%10;
  s=s+r;
  n=n/10;
  }
  printf("%d",s);
	return 0;
}