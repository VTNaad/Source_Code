package murach.business;

import java.io.Serializable;

public class User implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String firstName;
    private String lastName;
    private String email;
    private String birth;
    private String ans;
    private String op1;
    private String op2;
    private String contact;

    public User() {
    	firstName = "";
        lastName = "";
        email = "";
        birth = "";
        ans = "";
        op1 = "";
        op2 = "";
        contact = "";
    }

    public User(String firstName, String lastName, String email, String birth, String ans, String op1, String op2, String contact) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.birth = birth;
        this.ans = ans;
        this.op1 = op1;
        this.op2 = op2;
        this.contact = contact;
    }

    // Getter and setter methods for firstName
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Getter and setter methods for lastName
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Getter and setter methods for email
    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }
    
    public String getans() {
        return ans;
    }

    public void setans(String ans) {
        this.ans = ans;
    }
    
    public String getop1() {
        return op1;
    }

    public void setop1(String op1) {
        this.op1 = op1;
    }
    
    public String getop2() {
        return op2;
    }

    public void setop2(String op2) {
        this.op2 = op2;
    }
    
    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}