/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.DonorRegCenter.RegCenterDoctorOrganization;
import Business.Organization.DonorRegCenter.RegCenterLabOrganization;
import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Doctor.getValue())){
            organization = new RegCenterDoctorOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.RegCenterLab.getValue())){
            organization = new RegCenterLabOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
}