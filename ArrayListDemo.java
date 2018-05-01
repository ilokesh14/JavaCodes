import java.util.ArrayList;
class Loop{
public static void main(String ...a){
int x[] = {10,20,30,40,50};
/*for(int i = 0 ; i<x.length; i++){
System.out.println(x[i]);
}*/
for(int i : x){
System.out.println(i);
}
ArrayList<Integer> list = new ArrayList<>();
list.add(89);
list.add(189);
list.add(289);
list.add(389);
list.add(0,100); 
list.forEach(w->System.out.println(w));
}
}