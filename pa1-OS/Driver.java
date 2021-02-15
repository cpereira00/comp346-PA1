
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kerly Titus
 */

public class Driver {

    /** 
     * main class
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	
    	 /*******************************************************************************************************************************************
    	  * TODO : implement all the operations of main class   																					*
    	  ******************************************************************************************************************************************/
        
    	Network networkThread = new Network("network");            /* Activate the network */
        networkThread.start();

        Server serverThread = new Server();                        /* Start the server */
        serverThread.start();


        Client clientSendThread = new Client("sending");            /* Start the receiving client */
        clientSendThread.start();
        Client clientReceiveThread = new Client("receiving");              /* Start the sending client */
        clientReceiveThread.start();

    }
}
