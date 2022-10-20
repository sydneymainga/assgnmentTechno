import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ServerlogApp {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(new File("C:\\Users\\Alif Computer\\IdeaProjects\\untitled\\resource"));
        //parsing a CSV file into the constructor of Scanner class
        sc.useDelimiter(",");
        //setting comma as delimiter pattern
        while (sc.hasNext()) {
            System.out.print(sc.next());
        }
        sc.close();
        //closes the scanner
    }
    }

