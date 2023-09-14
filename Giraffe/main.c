#include <stdio.h>
#include <stdlib.h>

int main()
{
    char color[20];
    char pluralName[20];
    char celeb[20];
    printf("Enter your color here:");
    scanf("%s", color);
    printf("Enter the name of object here: ");
    scanf("%s", pluralName);
    printf("Enter name of celebrity: ");
    scanf("%s", celeb);

    printf("Roses are %s \n", color);
    printf("%s are blue \n", pluralName);
    printf("But i love %s", celeb);
    return 0;
}

