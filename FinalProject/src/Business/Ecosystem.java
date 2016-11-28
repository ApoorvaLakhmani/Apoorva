/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author Neha
 */
public class Ecosystem {
     private static EcoSystem business;
    private ArrayList<Network> networkList; 
    private EcoSystem(){
        super(null);
        networkList=new ArrayList<Network>();
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }
    
    public static EcoSystem getInstance(){
        if (business==null){
            business=new EcoSystem();
        }
        return business;
        
    }
}
