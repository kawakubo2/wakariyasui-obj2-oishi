package chapter23;

public class カタカナ {
    public static void main(String[] args) {
        for (char c = 'ァ'; c <= 'ン'; c++) {
            System.out.println(c + " の文字コードは " + (int)c);
        }
        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.println(c + " の文字コードは " + (int)c);
        }
    } 

}
