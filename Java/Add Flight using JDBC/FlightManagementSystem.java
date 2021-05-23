import java.util.*;
import java.sql.*;
import java.io.*;
public class FlightManagementSystem
{
   public boolean addFlight(Flight flightObj)
  {
   try{  
//creating object of DB class
  DB d= new DB();
//calling the methods of DB class to establish connection with database
  Connection myconn= d.getConnection();
  Statement mystat=myconn.createStatement();
    //getting the details of the flight by invoking the methods of flight class and storing in a variable
    int flightid=flightObj.getFlightId();
    String source= flightObj.getSource();
    String destination=flightObj.getDestination();
    int noofseats=flightObj.getNoOfSeats();
    double flightfare= flightObj.getFlightFare();
   //Using preparedstatement for inserting datas into the table flight
    PreparedStatement pstmt = myconn.prepareStatement("INSERT INTO flight(flightId,source,destination,noOfSeats,flightFare)" +" VALUE (?,?,?,?,?)");
   //At 1, inserting flight Id
    pstmt.setInt(1,flightid);
   //At 2, inserting source
    pstmt.setString(2,source);
    //At 3, inserting destination
    pstmt.setString(3,destination);
   //At 4, inserting no of seats
    pstmt.setInt(4,noofseats);
   //At 5, inserting flight fare
    pstmt.setDouble(5,flightfare);
    //count will check if the preparedstatement gets executed
    int count= pstmt.executeUpdate();
//If count is greater than 0, that means insertion is successful and return true, else will return false.
    if(count>0)
    {
      return true;
    }
   }
    catch(Exception e){e.printStackTrace();}
         return false; 
  }
}