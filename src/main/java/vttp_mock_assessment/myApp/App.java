package vttp_mock_assessment.myApp;


// import java.io.BufferedInputStream;
// import java.io.BufferedOutputStream;
// import java.io.BufferedReader;
// import java.io.DataInputStream;
// import java.io.DataOutputStream;
// import java.io.IOException;
// import java.io.InputStream;
// import java.io.InputStreamReader;
// import java.io.OutputStream;
// import java.io.PrintWriter;
// import java.net.ServerSocket;
// import java.net.Socket;
// import java.util.Date;
// import java.util.concurrent.ExecutorService;
// import java.util.concurrent.Executors;


// //each client will be managed on a dedicated thread
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
// {
//     static final File WEB_ROOT = new File(".");
//     static final String DEAFULT_FILE = "index.html"; 
//     static final String FILE_NOT_FOUND = "404.html"; 
//     static final String METHOD_NOT_SUPPORTED = "not_supported.html"; 

//     //port to listen to the connection; 
//     static int port = 3000;

//     //verbose mode; 
//     static final boolean verbose = true; 

//     // client connection via the socket class; 
//     private Socket connect; 

//     public App(Socket c) {
//         connect = c; 
//     }

//     public static void main( String[] args ) throws IOException 
//     {
//         try {
//             ServerSocket serverConnect = new ServerSocket(port);
//             System.out.printf("Server started. \nListening for connections on port : %d ...\n", port);

//             //listen until user halts server execution - use while loop 
//             while (true) {
//                 App myServer = new App(serverConnect.accept()); 

//                 if(verbose) {
//                     System.out.println("Connection opened (" + new Date() + ")");
//                 }

//                 //create dedicated thread to manage client connection
//                 Thread thread = new Thread(myServer);
//                 thread.start(); 

//             }
            
//         //catches all types of exceptions
//         } catch (Exception e) {
//             System.out.println("Server Connection error: " + e.getMessage());
//         }
        
//         // if(args.length > 0) {
//         //     port = Integer.parseInt(args[1]);
//         //     System.out.printf("Server App started at %s\n", port);
//         //     ExecutorService threadPool = Executors.newFixedThreadPool(2); 

//         //     ServerSocket server = new ServerSocket(port); 

//         //     while(true) {
//         //         System.out.println("Waiting for client conenction");
//         //         Socket sock = server.accept(); 
//         //         System.out.println("Connected ...");

//         //     }

        
//         // }
//     }

//     @Override
//     public void run() {
//         // manage our particular client connection 
//         BufferedReader in = null; PrintWriter out = null; BufferedOutputStream dataOut = null; 
//         String fileRequested = null;

//         try {
//             //we read characters from the client via the input stream on the socket 
//             in = new BufferedReader(new InputStreamReader(connect.getInputStream()));
//             //we get character output stream to client (for headers) 

//         //catches only the ioexceptions
//         } catch (IOException ioe) {
//             System.out.println("System error: " + ioe);
//         }
//     }

    
    
// }

