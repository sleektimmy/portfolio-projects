#include <stdio.h>
#include <stdlib.h>

int main()
{
    char characterName [] = "John";
    int characterAge = 35;
    printf("There was a man named %s \n", characterName);
    printf("he is %d years old. \n", characterAge);

    characterAge = 90;
    printf("But he doesn't like the name John\n");
    printf(" neither does he like the age %d \n", characterAge);
    return 0;
}
