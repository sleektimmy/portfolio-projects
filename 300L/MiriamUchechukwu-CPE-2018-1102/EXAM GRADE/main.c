/*Code for Printing grade & score of 20 students. MIRIAM UCHECHUKWU ONYEMENAM CPE/2018/1102*/
#include <stdio.h>
#define max 20
int main()
{
    char grade;
    int score,n;
    for (n=1;n<=max;n++){
        printf("enter score for student %d:",n);
    scanf("%d",&score);
    if (score>=70)grade='A';
    else if (score>=60)grade='B';
    else if (score>=50)grade='C';
    else if (score>=45)grade='D';
    else if (score>=40)grade='F';
    else grade='F';
    printf("student %d,grade = %c\n",n,grade);
    }
}
