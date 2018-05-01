class Loops{
public static void main(String ...arr){
/*while(true){

}*/
for(int i = 1; i<=10; i++){
}
int j = 1;
while(j<=10){
if(j>2){
j++;
}
else{
j+=2;
}
}

//int []array = {10,20,30,40,50};
//int []array = new int[5];
int []array = new int[]{10,20,30,40,50,90,100};
String name = new String("Amit");
/*for(int i = 0; i<array.length;i++){
System.out.println(array[i]);
}*/
System.out.println("******************************");
for(int i : array){
System.out.println(i);
}
System.out.println("******************************");
// break , continue
for(int k = 1; k<=3; k++){
for(int h = 1; h<=3; h++){
if(k==h){
break;
}
System.out.println("K is "+k+" and H is "+h);
}
}


}
}