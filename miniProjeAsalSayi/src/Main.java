public class Main {

    public static void main(String[] args) {
	int number = 1;
    int remainder = number % 2;
    boolean isPrime=true;
    //System.out.println(remainder);
        if(number==1){
            System.out.println("Sayi asal değilir.");
            return;
        }
        if(number<1){
            System.out.println("Geçersiz Sayi");
        }
    for(int i = 2; i < number;i++){
        if (number% i ==0 ){
            isPrime=false;
        }
    }
    if (isPrime==true){
        System.out.println("Sayi asal sayi");
    }
    else
        System.out.println("Sayi asal değildir");

    }
}
