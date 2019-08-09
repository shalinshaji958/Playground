#include <stdio.h>
int gcd(int,int);
int gc(int,int);
int main() {
int n1,n2,n3,a,b;
  scanf("%d%d%d",&n1,&n2,&n3);
  a=gcd(n1,n2);
  b=gc(a,n3);
  printf("%d",b);
}
int gcd(int n1,int n2)
{
  int min,gcd,a;
  if(n1<n2)
  {
    min=n1;
  }
  else
  {
    min=n2;
  }
  while(min>=1)
  {
    if((n1%min==0&&n2%min==0))
    {
      a=min;
      break;
    }
	min--;
  }
    return a;
}
int gc(int a,int n3)
{
  int min,gcd,b;
  if(a<n3)
  {
    min=a;
  }
  else
  {
    min=n3;
  }
  while(min>=1)
  {
    if((a%min==0&&n3%min==0))
    {
      b=min;
      break;
    }
	min--;
  }
    return b;
}