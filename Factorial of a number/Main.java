#include <stdio.h>
int main() {
  int fact,i,n;
	scanf("%d",&n);
  fact=1;
  for(i=1;i<=n;i++)
  {
    fact=fact*i;
  }
    printf("%d",fact);
	return 0;
}