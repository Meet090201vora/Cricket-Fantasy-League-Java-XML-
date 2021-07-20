import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.*;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        try
        {
            
            XMLEncoder x = new XMLEncoder(new BufferedOutputStream(new FileOutputStream("users.xml")));
            
            x.close();

        }
        catch(FileNotFoundException fileNotFound)
        {
            System.out.println("ERROR: File not found");
        }
    }
}