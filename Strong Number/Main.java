#include <stdio.h>
int main() {
  int temp,n,i,sum=0,fact=1,r;
	scanf("%d",&n);
  temp=n;
  while(n>0)
  {
    fact=1;
   r=n%10;
   for(i=1;i<=r;i++)
   {
     fact=fact*i;
   }
   sum=sum+fact;
    n=n/10;
  }
  if(sum==temp)
  {
    printf("Yes");
  }
  
  else
  {
  
    printf("No");
  }
 
	return 0;
}