
package spacemathgame;

public class Users {
    
    private String name;
    private String surname;
    private String username;
    private String password;
    private String email;
    private int gold;
    public Users() {
    }

    public Users(String name, String surname, String username, String password, String email, int gold) {
        this.name = name;
        this.surname = surname;
        this.username = username;
        this.password = password;
        this.email = email;
        this.gold = gold;
    }

    public int getGold() {
        return gold;
    }


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    
    
    
    @Override
    public String toString() {
        return name + "#" + surname + "#" + username + "#" + password + "#" + email+"#"+gold;
    
    }
    
    
    
}
