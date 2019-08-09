#include <stdio.h>
int great(int,int);
int main()
{
int m,a,n,o;
scanf("%d%d%d",&n,&m,&o);
a=great(m,n);
  if (a>o)
{
  printf("%d",a);
}
else
{
  printf("%d",o);
}
}
int great(int s,int d)
{
  {
  if(s>d)
  {
   return s;
  }
  else
    return d;
}
}

  
