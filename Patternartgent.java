import java.util.*;

class Art{
int size;
int choice;

Art(int size, int choice){
this.size = size;
this.choice = choice;
}

//-----------------------Butterfly pattern----------

public void butterfly(){

for(int i=1 ; i<=size ; i++){
    for(int j =1; j<=i ; j++){
      System.out.print("*");
      }
    // space
    for(int j=1; j<=size-i ; j++){
      System.out.print("  ");
      }
      //star part
    for (int j=1; j<=i ; j++){
        System.out.print("*");
    }   
      System.out.println();
 }

// lower part

for(int i=size-1 ; i>=1 ; i--){
    for(int j =1; j<=i ; j++){
      System.out.print("*");
      }
    for(int j=1; j<=size-i ; j++){
      System.out.print("  ");
      }
      //star part
    for (int j=1; j<=i ; j++){
        System.out.print("*");
    }   
System.out.println();
}
}

//--------------------------------------Dimond pattern

public void diamond(){

//---upper part---


for(int i=1; i<=size; i++){
 // space
for(int j=1; j<=size-i; j++){
   System.out.print(" ");
}
for(int j= 1; j<=2*i-1 ;j++){
  System.out.print("*");
}
System.out.println();
}

//---lower part----


for(int i=size-1; i>=1; i--){
// space
for(int j=1; j<=size-i; j++){
   System.out.print(" ");
}
for(int j=1; j<=2*i-1 ;j++){
  System.out.print("*");
}
System.out.println();
}
}

//--------------------------Hollowpyramid--------------------

public void hollowpyramid(){

 for (int i = 1; i <= size; i++) {

            // Print leading spaces
            for (int s = 1; s <= size - i; s++) {
                System.out.print(" ");
            }

            // Print stars and inside spaces
            for (int j = 1; j <= 2 * i - 1; j++) {

                // First row star only
                if (i == 1 && j == 1) {
                    System.out.print("*");
                }
                // Last row -> print whole line solid
                else if (i == size) {
                    System.out.print("*");
                }
                // Left border or right border
                else if (j == 1 || j == 2 * i - 1) {
                    System.out.print("*");
                }
                // Inside empty space
                else {
                    System.out.print(" ");
               }
}

   System.out.println();
}
}

//-------------------------------------numberhourglass--------------

public void numberhourglass(){

// upper part

for(int i=1; i<=size; i++){   //1->4 in 1st row
//space
for(int j=1; j<i ; j++){  // 1st row , 1st colum
System.out.print(" ");
}
//numbers
for(int j=i; j<=size; j++){
System.out.print(j);
}
//reverse numbers
for (int j=size-1; j>=i; j--){
System.out.print(j);
}
System.out.println();
}

//lower part

for(int i=size-1; i>=1; i--){
// 
for(int j=1; j<i ; j++){  // 1st row , 1st colum
System.out.print(" ");
}
//numbers
for(int j=i; j<=size; j++){
System.out.print(j);
}
//reverse numbers
for (int j=size-1; j>=i; j--){
System.out.print(j);
}
System.out.println();
}
}

//--------generator method------

public void generator(){

if(choice==1){
butterfly();
}else if(choice==2){
diamond();
}else if(choice==3){
hollowpyramid();
}else if(choice==4){
numberhourglass();
}else{
System.out.println("Invalid choice");
}
}





}



public class Patternartgent{
public static void main(String [] args){

Scanner sc =new Scanner(System.in);

    System.out.println("===============================================");
    System.out.println("Pattern Art Generator . Render Your imagination with code!");
    System.out.println("Code your lines. Shape your patterns. Paint with loops.");
    System.out.println("===============================================");

while(true){
System.out.println("===============================================");
System.out.println("1. Generate Butterfly");
System.out.println("2. Generate Diamond");
System.out.println("3. Generate Hollow Pyramid");
System.out.println("4. Generate Number hour glass");

System.out.print("Enter your choice:");
int n = sc.nextInt();
if (n < 1 || n > 4) {
    System.out.println("Invalid choice!");
    return;  
}

System.out.print("Enter your size:");
int s = sc.nextInt();
System.out.println("===============================================");

Art art=new Art(s,n);
art.generator();
}
}
}
