package com.ui;
import com.utility.*;
import java.util.*;

public class UserInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		//Fill the UI code
		Bazaar b =new Bazaar();
		int id;
		String name;
		System.out.println("Enter the no of Policy names you want to store");
        int size = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<size;i++){
            System.out.println("Enter the Policy ID");
            id = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the Policy Name");
            name = sc.nextLine();
            b.addPolicyDetails(id,name);
        }
        Map<Integer,String> policyMap = b.getPolicyMap();
        for(Map.Entry m: policyMap.entrySet()){  
            System.out.println(m.getKey()+" "+m.getValue());  
        } 
        System.out.println("Enter the policy type to be searched");
        String str = sc.nextLine();
        List<Integer> l = b.searchBasedOnPolicyType(str);
        for(Integer number:l)  
            System.out.println(number); 
	}

}
