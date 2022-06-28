// package vttp_mock_assessment.myApp;

// import java.io.*;
// import java.net.Socket;

// //Each client connection will be managed in a dedicated thread
// public class HttpServer implements Runnable {

//         static final File WEB_ROOT = new File(".");
//         static final String DEAFULT_FILE = "index.html"; 
//         static final String FILE_NOT_FOUND = "404.html"; 
//         static final String METHOD_NOT_SUPPORTED = "not_supported.html"; 

//         //port to listen to the connection; 
//         static int port = 3000;

//         //verbose mode; 
//         static final boolean verbose = true; 

//         // client connection via the socket class; 
//         private Socket connect




//         private InputStream is; 
//         private DataInputStream dis;
//         private OutputStream os; 
//         private DataOutputStream dos; 

//         public NetworkIO(Socket sock) throws IOException {
//             is = sock.getInputStream();
//             dis = new DataInputStream(dis); 
//             os = sock.getOutputStream();
//             dos = new DataOutputStream(os);
//         }
        
//         public String read() throws IOException {
//             return dis.readUTF(); 
//         }

//         public void write(String msg) throws IOException {
//             dos.writeUTF(msg);
//             dos.flush();
//         }

//         public void close() {
//             try {
//                 dis.close();
//                 is.close();
//                 os.close();
//                 dos.close();
//             } catch(IOException e) {
//                 e.printStackTrace();
//             }
//         }

//         public class 

//     }
    
