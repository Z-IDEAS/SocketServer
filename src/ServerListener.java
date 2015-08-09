import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class ServerListener extends Thread {
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		try
		{
			ServerSocket serverSocket = new ServerSocket(10000);
			while(true){
				Socket socket = serverSocket.accept();
				System.out.println("access");
				ChatSocket cs = new ChatSocket(socket);
				cs.start();
				ChatManager.getChatManager().add(cs);
			}
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}
}
