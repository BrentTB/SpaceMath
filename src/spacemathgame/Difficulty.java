
package spacemathgame;
public class Difficulty {

    private String username;
    private String difficulty;
    private String extras;

    public Difficulty() {
    }

    public Difficulty(String username, String difficulty, String extras) {
        this.username = username;
        this.difficulty = difficulty;
        this.extras = extras;
    }

    
    
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public String getExtras() {
        return extras;
    }

    public void setExtras(String extras) {
        this.extras = extras;
    }

    @Override
    public String toString() {
        return username + "#" + difficulty + "#" + extras;
    }
    
    //battleGlory#0&0&0#0&2&N&N
//wertyu#0&0&0#0&0&N&N
//wertuioisdfghjhgdfghj#0&0&0#0&0&N&N

    
    
    
    
}
