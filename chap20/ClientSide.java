import java.io.*;
import java.net.*;
public class ClientSide {
  public static void main(String args[]) throws Exception {
    String server = args[0];
    int port = Integer.parseInt(args[1]);
    Socket c = new Socket(server, port);
    InputStream is = c.getInputStream();
    DataInputStream dis = new DataInputStream(is);
    for(int i=1 ; i <= 10 ; i++) {
      int j = dis.readInt();
      System.out.println("�����κ��� ���� ������ " + j + " ���");
    } 
    c.close();
  }
}
  
 