#include <stdio.h> /*Code for Getting Average Weather for the week MIRIAM UCHECHUKWU ONYEMENAM CPE/2018/1102 */

void main(void)
{
    float temp[7];
    float sum=0;
    int day;
    for (day=1;day<=7;day++){
        printf("Enter temp. for day %d;", day);
        scanf("%f", &temp[day]);

    }
    for (day=1;day<=7;day++)
        sum+=temp[day];
    printf("\n\nAverage temperature=%.2f\n",sum/7);
}
