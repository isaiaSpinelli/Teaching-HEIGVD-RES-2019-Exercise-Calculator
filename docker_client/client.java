
import java.io.*;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This is not really an HTTP client, but rather a very simple program that
 * establishes a TCP connection with a real HTTP server. Once connected, the
 * client sends "garbage" to the server (the client does not send a proper
 * HTTP request that the server would understand). The client then reads the
 * response sent back by the server and logs it onto the console.
 *
 * @author Olivier Liechti
 */
public class Client {

    static final Logger LOG = Logger.getLogger(Client.class.getName());

    final static int BUFFER_SIZE = 1024;

    /**
     * This method does the whole processing
     */
    public void sendWrongHttpRequest() {
        Socket clientSocket = null;
        OutputStream os = null;
        BufferedReader  is = null;

        String dataToSend = "";
        String dataRecept = "";
        Scanner sc = new Scanner(System.in);

        try {
            clientSocket = new Socket("127.0.0.1", 2205);
            os = clientSocket.getOutputStream();
            is = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            LOG.log(Level.INFO, "Connection  ");

            while((dataRecept = is.readLine()) != null)
            {
                if (dataRecept.equals("Bye man")) {
                    System.out.println(dataRecept);
                    break;
                }
                System.out.println(dataRecept);

                dataToSend = sc.nextLine() + "\r\n";
                os.write(dataToSend.getBytes());
                os.flush();
            }

            LOG.log(Level.INFO, "Fin de la communication !");

        } catch (IOException ex) {
            LOG.log(Level.SEVERE, null, ex);
        } finally {
            try {
                is.close();
            } catch (IOException ex) {
                Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                os.close();
            } catch (IOException ex) {
                Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                clientSocket.close();
            } catch (IOException ex) {
                Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.setProperty("java.util.logging.SimpleFormatter.format", "%5$s %n");

        Client client = new Client();
        client.sendWrongHttpRequest();

    }

}