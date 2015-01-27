import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.List;
public class server {

        Socket smtpSocket = null;  
        DataOutputStream os = null;
        DataInputStream is = null;
       
        boolean closing ;
 
        
        public boolean connection(String host,int port){
         
	        try {
	            this.closing = true;
	            smtpSocket = new Socket("localhost", 10000);
	            os = new DataOutputStream(smtpSocket.getOutputStream());
	            is = new DataInputStream(smtpSocket.getInputStream());
	        } catch (UnknownHostException e) {
	            System.err.println("Don't know about host: hostname");  
	        } catch (IOException e) {
	            System.err.println("Couldn't get I/O for the connection to: hostname");

	        }
         
	        if (smtpSocket != null && os != null && is != null) {
	        	return true;
	        }else{
	        	return false;
	        }
        }
   
        public String read(){
        	String responseLine=null;
        	try {
				os.writeBytes("GET\n");
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
 	        try {
 	        	is.readLine();
				responseLine = is.readLine();
				
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
 	        
 	       return responseLine;
        }
        
		public void close(){
				try{
					this.closing = false;
					os.writeBytes("END\n");

	     //           os.close();
	     //           is.close();
	     //          smtpSocket.close(); 

				}
                catch (UnknownHostException e) {
                	System.err.println("Trying to connect to unknown host: " + e);
                } catch (IOException e) {
                	System.err.println("IOException:  " + e);
            }       
        }       
}