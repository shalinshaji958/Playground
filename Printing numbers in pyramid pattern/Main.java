#include <stdio.h>
int main() {
	int i,j,n,space,num;
	scanf("%d",&n);
  num=1;
      for(i=1;i<=n;i++)
        {
        for(space=1;space<=n-i;space++)
        {
          printf(" ");
        }
        for(j=1;j<=i;j++)
        {
          
          printf("%d ",num);
          num=num+1;
          
        }
        printf("\n");
      }
	return 0;
}