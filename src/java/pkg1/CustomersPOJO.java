package pkg1;

public class CustomersPOJO {
    
    String name,username,dob,email,password;
    int balance,id;

    public CustomersPOJO() {
        
    }

    public CustomersPOJO(String name, String username, String dob, String email, String password, int balance, int id) {
        this.name = name;
        this.username = username;
        this.dob = dob;
        this.email = email;
        this.password = password;
        this.balance = balance;
        this.id = id;
    }

    public CustomersPOJO(String name, String username, String dob, String email, String password, int id) {
        this.name = name;
        this.username = username;
        this.dob = dob;
        this.email = email;
        this.password = password;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
}
