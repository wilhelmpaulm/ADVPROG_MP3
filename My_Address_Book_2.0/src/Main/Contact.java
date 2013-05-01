/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author wilhe_000
 */
public class Contact {
    private String name, lastName, firstName, mobile, landline, email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getLandline() {
        return landline;
    }

    public void setLandline(String landline) {
        this.landline = landline;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Contact(String name, String mobile, String landline, String email) {
        String[] names = name.split(",");
        this.lastName = names[0];
        this.firstName = names[1];
        this.name = name;
        this.mobile = mobile;
        this.landline = landline;
        this.email = email;
    }
    
    public void editContact(String name, String mobile, String landline, String email){
        String[] names = name.split(",");
        this.lastName = names[0];
        this.firstName = names[1];
        this.name = name;
        this.mobile = mobile;
        this.landline = landline;
        this.email = email;
    }
    
    public String getContact(){
        return "Name:"+name+"\n"+
                "Mobile:"+mobile+"\n"+
                "Landline:"+mobile+"\n"+
                "Email:"+email;
    }
    
    @Override
    public String toString(){
        return name;
    }
    
    
}
