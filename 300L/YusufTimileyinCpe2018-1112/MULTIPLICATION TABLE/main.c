#include <stdio.h> /*Code for Printing Multiplication Table of 1-12 YUSUF TIMILEYIN ADURAGBEMI CPE/2018/1112 */

int main()
{

    int num, a;
  printf("Enter a number to print table: ");
  scanf("%d", &num);

  for (a=1;a<=12;a++)
  {
      printf("%d * % d = %d\n",num,a,num*a);
  }
  return 0;
}
