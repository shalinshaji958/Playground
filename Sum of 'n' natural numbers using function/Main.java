#include<stdio.h>
int main() {
    int n,s;
  scanf("%d",&n);
  s=sum(n);
  printf("%d",s);
}
int sum(int m)
{
  int sum;
  for(int i=1;i<=m;i++)
  {
    sum=i+sum;
  }
  return sum;
}