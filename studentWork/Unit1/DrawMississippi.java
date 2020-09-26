package studentWork.Unit1;
//Titus Roberts: This code will draw the word "Mississippi" vertically using letters corrisponding the letter being drawn.
public class DrawMississippi {
    public static void main(String [] args) {  //1. Drawing the actual word
        drawM();
        System.out.println();
        drawI();
        System.out.println();
        drawS();
        System.out.println();
        drawS();
        System.out.println();      
        drawI();
        System.out.println();
        drawS();
        System.out.println();
        drawS();
        System.out.println();
        drawI();
        System.out.println();
        drawP();
        System.out.println();
        drawP();
        System.out.println();
        drawI();

    }
    public static void drawM1() {              //2. The Peices of "M"
        System.out.println("M     M");

    }
    public static void drawM2() {   
        System.out.println("MM   MM");
        System.out.println("M M M M");
        System.out.println("M  M  M");
    }
    public static void drawM() {               //3. Putting "M" Together
        drawM1();
        drawM2();
        drawM1();
        drawM1();
        drawM1();
    }
    public static void drawI1() {              //4. The Peices of "I" 
        System.out.println("IIIII");
    }
    public static void drawI2() {
        System.out.println("  I  ");
    }
    public static void drawI() {               //5. Putting "I" Together
        drawI1();
        drawI2();
        drawI2();
        drawI2();
        drawI2();
        drawI2();
        drawI1();
    }
    public static void drawS1() {              //6. The Peices of "S"
        System.out.println(" SSSS ");
    }
    public static void drawS2() {
        System.out.println("S    S");
    }
    public static void drawS3() {
        System.out.println("S");
    }
    public static void drawS4() {
        System.out.println("     S");
    }
    public static void drawS () {              //7. Putting "S" Together
        drawS1();
        drawS2();
        drawS3();
        drawS1();
        drawS4();
        drawS2();
        drawS1();

    }
    public static void drawP1() {              //8. The Peices of "P"
        System.out.println("PPPPPP ");
    }
    public static void drawP2() {
        System.out.println("P     P");
    }
    public static void drawP3() {
        System.out.println("P");

    }
    public static void drawP () {              //9. Putting "P" Together
        drawP1();
        drawP2();
        drawP2();
        drawP1();
        drawP3();
        drawP3();
        drawP3();
    }
}
   