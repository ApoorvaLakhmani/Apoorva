/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import Business.Employee.EmployeeDirectory;
import Business.Enterprise.EnterpriseDirectory;
import Business.UserAccount.UserAccountDirectory;
import java.util.ArrayList;

/**
 *
 * @author ApoorvaLakhmani
 */
public class Network {
    
    private String networkName;
    private UserAccountDirectory userAccountDirectory;
    private EmployeeDirectory employeeDirectory;
    private EnterpriseDirectory enterpriseDirectory;
    private ArrayList<Network> subNetwork;
    
    public Network(){
        enterpriseDirectory = new EnterpriseDirectory();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        subNetwork = new ArrayList<>();
    }

    public ArrayList<Network> getSubNetwork() {
        return subNetwork;
    }

    public void setSubNetwork(ArrayList<Network> subNetwork) {
        this.subNetwork = subNetwork;
    }

    
    public String getNetworkName() {
        return networkName;
    }

    public void setNetworkName(String networkName) {
        this.networkName = networkName;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public void setEnterpriseDirectory(EnterpriseDirectory enterpriseDir) {
        this.enterpriseDirectory = enterpriseDir;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public void setEmployeeDirectory(EmployeeDirectory employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }
    
    @Override
    public String toString(){
       return networkName; 
    }
    
    public Network addSubNetwork(){
        Network stateNetwork = new Network();
        subNetwork.add(stateNetwork);
        return stateNetwork;
    }
    
    
    
}
