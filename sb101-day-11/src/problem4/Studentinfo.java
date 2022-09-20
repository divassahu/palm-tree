package problem4;
import java.io.*;
class Studentinfo implements Serializable{
    String name;
    int rid;
    String contact;
    Studentinfo(String n, int r, String c)
    {
    this.name = n;
    this.rid = r;
    this.contact = c;
    }
}

class Demo{
    public static void main(String[] args)
    {
        try
        {
            Studentinfo si = new Studentinfo("Abhi", 104, "110044");
            FileOutputStream fos = new FileOutputStream("student.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(si);
            oos.flush();
            oos.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
