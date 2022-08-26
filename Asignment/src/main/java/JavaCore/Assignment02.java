package JavaCore;

public class Assignment02 {
    public static void main(String[] args) {
        System.out.println("__________________________bai_1____________________________________________");
        unit1a(5);
        System.out.println("__________________________bai_1____________________________________________");
        unit1b(5);

        System.out.println("__________________________bai_2____________________________________________");
        unit2(4);

        System.out.println("__________________________bai_3____________________________________________");
        unit3(9);

        System.out.println("__________________________bai_4____________________________________________");
        unit4(10);
        System.out.println("__________________________bai_5____________________________________________");
        unit5(15);
        System.out.println("__________________________bai_6____________________________________________");
        unit6(7);
        System.out.println("__________________________bai_7____________________________________________");
        unit7(8);
        System.out.println("__________________________bai_8____________________________________________");
        unit8(8);
        System.out.println("__________________________bai_9____________________________________________");
        unit9a(8);
        System.out.println("__________________________bai_9b____________________________________________");
        unit9b(5);
        System.out.println("__________________________bai_9b____________________________________________");
//        unit10(5);

    }

    //    Bài 1, In ra màn hình tam giác vuông
//    Cách 1
    public static void unit1a(int n){
        System.out.printf("Tam giác có chiều cao %d \n",n);
        for(int i =1; i<=n ;i++){
            for(int j=1; j<=i;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void unit1b(int n){
        System.out.printf("Tam giác có chiều cao %d \n",n);
        String output = "";
        for(int i =1; i<=n ;i++){
            System.out.println(output +=i + " ");

        }
    }

    //    Bài 2: Viết chương trình in ra tam giác vuông nhưng các phần tử tăng dần 1 đơn vị:
    public static void unit2(int n){
        System.out.printf("Tam giác có chiều cao %d \n",n);
        int count =0;
        for(int i =1; i<=n ;i++){
            count+=i;
            for(int j=count-i+1; j<=count;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    //    Bài 3:
//Viết chương trình in ra kim tự tháp:
    public static void unit3(int n){
        System.out.printf("Tam giác có chiều cao %d \n",n);
        for(int i =1; i<=n; i++){
            for(int j =1; j<=i; j++){
                System.out.print(i+ " ");
            }
            System.out.println();
        }
    }

    //    Bài 4:
//Viết ct in ra tam giác Floyd’s:
    public static void unit4(int n){
        System.out.printf("Tam giác có chiều cao %d \n",n);
        int count =0;
        for(int i =1; i<=n ;i++){
            count+=i;
            for(int j=count-i+1; j<=count;j++){
                System.out.printf("%3d",j );
            }
            System.out.println();
        }
    }

    public static void unit5(int n){
        System.out.println("------------------------diamond standard__________----------------------__");

        for(int i = 0; i <n;i++){
            for(int space= 1; space<n-i; space ++ ){
                System.out.print("  ");
            }
            for (int star = 1; star<=2*i+1; star++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int j=0; j<=n-2;j++){
            for(int space= 1; space<=j+1; space ++ ){
                System.out.print("  ");
            }
            for (int star =(n-2-j)*2 +1; star>=1; star--){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("-----------------diamond square---------------------------------------------------------------_____--------------------------------------------------------------____-----__----___----__----__----__----___---___---__");
        for(int i = 0; i <n;i++){
            for(int space= 1; space<n-i; space ++ ){
                System.out.print("   ");
            }
            for (int star = 1; star<=2*i+1; star++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        for(int j=0; j<=n-2;j++){
            for(int space= 1; space<=j+1; space ++ ){
                System.out.print("   ");
            }
            for (int star =(n-2-j)*2 +1; star>=1; star--){
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println("---------------diamond right-----------------------------------------------------------------_____--------------------------------------------------------------____-----__----___----__----__----__----___---___---__");
        for(int i = 0; i <n;i++){
            for(int space= 1; space<n-i; space ++ ){
                System.out.print("   ");
            }
            for (int star = 1; star<=2*i+1; star++){
                System.out.print(" *    ");
            }
            System.out.println();
        }
        for(int j=0; j<=n-2;j++){
            for(int space= 1; space<=j+1; space ++ ){
                System.out.print("   ");
            }
            for (int star =(n-2-j)*2 +1; star>=1; star--){
                System.out.print(" *    ");
            }
            System.out.println();
        }

        System.out.println("-----diamond left---------------------------------------------------------------------------_____--------------------------------------------------------------____-----__----___----__----__----__----___---___---__");
        for(int i = 0; i <n;i++){
            for(int space= 1; space<n-i; space ++ ){
                System.out.print("     ");
            }
            for (int star = 1; star<=2*i+1; star++){
                System.out.print("  *");
            }
            System.out.println();
        }
        for(int j=0; j<=n-2;j++){
            for(int space= 1; space<=j+1; space ++ ){
                System.out.print("     ");
            }
            for (int star =(n-2-j)*2 +1; star>=1; star--){
                System.out.print("  *");
            }
            System.out.println();
        }
    }

    public static long chinhHopP(int n){
        int resul =1;
        for(int i = 1; i<=n;i++){
            resul*=i;
        }
        return resul;

    }
    public static void unit6(int n){

        for(int i = 0; i<n;i++){
            for(int space= 1; space<n-i; space ++ ){
                System.out.print("  ");
            }
            for(int j=0; j<=i;j++){
                System.out.printf("%2d",chinhHopP(i)/chinhHopP(j)/chinhHopP(i-j));
                System.out.print("   ");

            }
            System.out.println();
        }
    }
    public static void unit7(int n){
    for(int i = n; i>0;i--){
        for(int space =1;space<=n-i;space++){
            System.out.print("  ");

        }   for(int star = i; star>0;star--){
            System.out.print("* ");
        }

        System.out.println();

    }
    }
    public static void unit8(int n){
        for(int i = 0; i<n;i++){
            for(int space =1;space<=n-i;space++){
                System.out.print("  ");

            }   for(int star = i; star>0;star--){
                System.out.print("@ ");
            }

            System.out.println();

        }
    }
    public static void unit9a(int n){
        for(int i = 1; i <=n;i++){
            for(int space= 1; space<=n-i; space ++ ){
                System.out.print("  ");
            }
            for (int num1 = i; num1>=1; num1--){
                System.out.printf("%2d",num1);
            }
            for(int num2 = 2;num2<=i; num2++)
            System.out.printf("%2d",num2);
            System.out.println();
        }
        for(int j=0; j<=n-2;j++){
            for(int space= 1; space<=j+1; space ++ ){
                System.out.print("  ");
            }
            for (int num1 =(n-2-j) +1; num1>=1; num1--){
                System.out.printf("%2d",num1);
            }
            for (int num2 =2; num2<=(n-2-j)+1; num2++){
                System.out.printf("%2d",num2);
            }

            System.out.println();
        }
    }
    public static void unit9b(int n){

        for(int i = 1; i <=n;i++){

            for(int space= 1; space<=n-i; space ++ ){
                System.out.print(" ");
            }
            for (int num1 = 65; num1<i+65; num1++){

                System.out.printf("%s",(char)num1);
            }
            for(int num2 = i+63;num2>=65; num2--)
                System.out.printf("%s",(char)num2);
            System.out.println();
        }
        for(int j=0; j<=n-2;j++){
            for(int space= 1; space<=j+1; space ++ ){
                System.out.print(" ");
            }
            for (int num1 =65; num1<=(n-2-j)+65; num1++){
                System.out.printf("%s",(char)num1);
            }
            for (int num2 =(n-2-j)+64; num2>=65; num2--){
                System.out.printf("%s",(char)num2);
            }

            System.out.println();
        }
    }

}
