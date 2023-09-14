#CODE FOR PLOTTING GRAPH
printf("Input your values for X axis ");
printf("\n");
x1=input("for x1 = ");
x2=input ("for x2 = ");
x3=input ("for x3 = ");
printf("\n");
printf("Input your values for Y axis ");
printf("\n");
y1=input("for y1 = ");
y2=input ("for y2 = ");
y3=input ("for y3 = ");
x=[x1 x2 x3];
y=[y1 y2 y3];
printf("Your graph is");
plot(x,y,'--'), grid on, axis equal,xlabel('X O'), ylabel('Y O'), title('Ne2w Graph')
