import java.util.*;
import java.sql.*;
import java.io.*;
//Main class
public class Main
{
//Main method
  public static void main(String[] args) throws ClassNotFoundException,SQLException {
    try
    {
    Scanner sc=new Scanner(System.in);
   //taking user input and creating the object of Flight class, automatically constructor will be called
    int flightId=sc.nextInt();
    String source=sc.next();
    String destination=sc.next();
    int noOfSeats=sc.nextInt();
    double flightFare=sc.nextDouble();
     Flight f= new Flight(flightId,source,destination,noOfSeats,flightFare);
    // Creating an object of FlightManagementSystem class and calling the method add flight
     FlightManagementSystem fm= new FlightManagementSystem();
     boolean flag= fm.addFlight(f);
    //If it return true that means flight details added to the database succesfully
     if(flag==true)
     {
       System.out.println("Flight details added successfully");
     }
    //else addition not done
     else
     {
       System.out.println("Addition not done");
     }
    }
    catch(Exception e){}
  }

}