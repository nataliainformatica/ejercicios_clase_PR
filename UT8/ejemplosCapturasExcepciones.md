Ejemplos de capturas de excepciones
Requisitos de finalización
 //Ejemplos

//ArithmeticException
class ArithmeticException_Demo{
        public static void main(String args[])
        {
                try {
                        int a = 30, b = 0;
                        int c = a/b;  // cannot divide by zero
                        System.out.println ("Result = " + c);
                }
                catch(ArithmeticException e) {
                        System.out.println ("Can't divide a number by 0");
                }
        }
}

//NullPointerException
class NullPointer_Demo{
        public static void main(String args[])
        {
                try {
                        String a = null; //null value
                        System.out.println(a.charAt(0));
                } catch(NullPointerException e) {
                        System.out.println("NullPointerException..");
                }
        }
}

//StringIndexOutOfBoundsException
class StringIndexOutOfBound_Demo{
        public static void main(String args[])
        {
                try {
                        String a = "This is like chipping "; // length is 22
                        char c = a.charAt(24); // accessing 25th element
                        System.out.println(c);
                }
                catch(StringIndexOutOfBoundsException e) {
                        System.out.println("StringIndexOutOfBoundsException");
                }
        }
}

//FileNotFoundException
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
 class File_notFound_Demo {
        public static void main(String args[])  {
                try {
                        // Following file does not exist
                        File file = new File("E://file.txt");
                        FileReader fr = new FileReader(file);
                } catch (FileNotFoundException e) {
                     System.out.println("File does not exist");
                }
        }
}

//NumberFormatException
class  NumberFormat_Demo{
        public static void main(String args[])
        {
                try {
                        // "akki" is not a number
                        int num = Integer.parseInt ("akki") ;

                        System.out.println(num);
                } catch(NumberFormatException e) {
                        System.out.println("Number format exception");
                }
        }
}

//ArrayIndexOutOfBoundException
class ArrayIndexOutOfBound_Demo{
        public static void main(String args[])
        {
                try{
                        int a[] = new int[5];
                        a[6] = 9; // acceso inválido
                }
                catch(ArrayIndexOutOfBoundsException e){
                        System.out.println ("Array Index is Out Of Bounds");
                }
        }
}
