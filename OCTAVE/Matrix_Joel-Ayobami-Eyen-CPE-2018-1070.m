#This is a solve a linear system of equation with two unknown usinb determinant, rank, inverse and decomposition matrix methods. 
disp("The 2x2 Universal Matrix Calculator");
a=input('Enter the first element: ');
m=input('Enter the second element: ');
c=input('Enter the third element: ');
d=input('Enter the first element: ');
A=[a m; c d]
D=det(A);

if D==0
  printf('The Determinant Calculator Is Unsuccessfull') #FOR THE DETERMINANT
  R!=K #COMMAND FOR RANK
  printf('Rank Solution cannot be found.')
else
  printf('The Determinant of the Matrix is %.2f', D) #DETERMINANT
  printf('\n')
  
  e=input('Enter first element for B coloumn: ');
  f=input('Enter second element for B coloumn: '); #The Right Hand Side
  b=[e;f]
  x=A\b;
  x1=x(1);x2=x(2);
   printf('\n')
  printf('The X value is : %.f2',  x1);
  printf('\n');
  printf('The Y Value is : %.2f ', x2); 
  printf('\n');
   printf('\n');
  R=rank(A);
 H=[A b];
 K=rank(H);
  printf('For the Rank Calculation');#RANK
 printf('\n'); 
 printf('The X value is : %.f2',  x1);
  printf('\n');
  printf('The Y Value is : %.2f', x2); 
  printf('\n'); 
 
end
 printf('\n');
printf('For the Inverse Calculation'); #INVERSE
  printf('\n')
  I=inv(A);
  y=I*b;
  y1=y(1); y2=y(2);
  printf('The X value is : %.f2',  y1);
  printf('\n');
  printf('The Y Value is : %.2f', y2); 
  printf('\n'); 
   printf('\n');
   printf('For the Decomposition Calculation'); #DECOMPOSITION
   printf('\n');
   [L U]=lu(A)
   j=U\(L\b);
   j1=j(1); j2=j(2);
  printf('The X value is : %.f2',  j1);
  printf('\n');
  printf('The Y Value is : %.2f ', j2); 
  printf('\n'); 
  
  #DETERMINANT AND RANK WERE IN THE SAME IF/ELSE SEbMENT BECAUSE THEY MAKE USE OF THE SAME FUNCTION