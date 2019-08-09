#include<stdio.h>
int main()
{
    int b,e;
  scanf("%d",&b);
  scanf("%d",&e);
  int op=po(b,e);
  printf("%d",op);
}
int po (int a,int b)
{
  int p=1;
  for(int i=1;i<=b;i++)
  {
    p=a*p;
  }
  return p;
}