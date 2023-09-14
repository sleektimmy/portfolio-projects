a1 = 2; a2 = 3; a3 = 3; a4= 4; b1= 3; b2= 3; b3 = 4; b4= 2; c1=3; c2 =6; c3=3; c4=3; d1=3; d2=2; d3=3; d4=4;
mat1= [a1 a2 a3 ];
mat2 = [b1 b2 b3]
printf("\n-----------------------------------------------");
printf("\nenter values for the first row.. 1 X 4 matrix.");
a1 = input("");

a2 = input("");

a3 = input("");

printf("\nenter values for the second element.. 4 X 1 matrix.");
b1= input("");

b2= input("");

b3= input("");
l1 = length(mat1);
l2 = length(mat2);
if l1 == 3 && l2==3

i = a2*b3+b2*a3;
i=int2str(i);
i= [i "i"]
j = a1 * b3 + b1 * a3;
j = int2str(j);
j = [j "j"]
k = a1 * b2 + b1 *  a2;

k =int2str(k);
k = [k "k"]
printf("the cross product is : %s %s %s \n", i, j, k);
else printf("the vectors are not of the same size");
end

