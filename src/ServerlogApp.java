import java.io.*;
import java.net.URL;
import java.util.Scanner;

public class ServerlogApp {
    public static void main(String[] args)
    {
        String line = "";
        String splitBy = ",";
        try
        {
//parsing a CSV file into BufferedReader class constructor
            BufferedReader br = new BufferedReader(new FileReader("./resource/technobrain.csv"));
            while ((line = br.readLine()) != null)   //returns a Boolean value
            {
                String[] logs = line.split(splitBy);    // use comma as separator
                System.out.println("logs [timestamp=" + logs[0] + ", url=" + logs[1] + ", IpAddress=" + logs[2]  +"]");
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}


