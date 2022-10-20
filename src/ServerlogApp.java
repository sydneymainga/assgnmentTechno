import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ServerlogApp {
    public static void main(String[] args) throws FileNotFoundException {
        //parsing a CSV file into the constructor of Scanner class
        Scanner sc = new Scanner(
                new File("C:\\Users\\Alif Computer\\IdeaProjects\\untitled\\resource"));
        //setting comma as delimiter pattern
        sc.useDelimiter(",");

        while (sc.hasNext()) {
            System.out.print(sc.next());
        }
        //closes the scanner
        sc.close();

    }
    }

