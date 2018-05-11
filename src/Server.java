import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by ashi on 5/7/18.
 */
public class Server {
    public static void main(String[] args) {
        String msg_received;

        ServerSocket socket = null;

        try {
            System.out.println("yes listening ");
            java.net.InetAddress addr = java.net.InetAddress.getLocalHost();
            socket = new ServerSocket(1555,0,addr);
            System.out.println(            socket.getInetAddress()
            );
            while(true) {
                Socket clientSocket = socket.accept();       //This is blocking. It will wait.
                DataInputStream DIS = new DataInputStream(clientSocket.getInputStream());
                msg_received = DIS.readUTF();
                try(FileWriter fw = new FileWriter("/Users/ashi/Downloads/Results/myfile.txt", true);
                    BufferedWriter bw = new BufferedWriter(fw);
                    PrintWriter out = new PrintWriter(bw))
                {
                    out.println(msg_received);

                } catch (IOException e) {
                    //exception handling left as an exercise for the reader
                }

                System.out.println(msg_received);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
