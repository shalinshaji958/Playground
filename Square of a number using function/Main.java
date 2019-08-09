#include<stdio.h>
int main() {
   int n,sq;
  scanf("%d",&n);
  sq=sqa(n);
  printf("%d",sq);
}
int sqa (int m)
{
  int sqa;
  sqa=m*m;
   return sqa;
}