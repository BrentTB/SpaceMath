
package spacemathgame;

public class Leaderboard {

    private String username;
    private int score;
    private int extraLives;
    private int removeAnswer;
 public  String space;
    public Leaderboard() {
    }

    public Leaderboard(String username, int score, int extraLives, int removeAnswer) {
        this.username = username;
        this.score = score;
        this.extraLives = extraLives;
        this.removeAnswer = removeAnswer;
    }

    public int getScore() {
        return score;
    }
    public String ForTextFile() {
        return username +"#"+ score +"#"+ extraLives + "#" +removeAnswer;
    }

    public void addSpaces(){
        space=" ";
        int length;
        String scoreLength = ""+score;
        length =username.length()+scoreLength.length();
       
        while(length<35){
            length+=1;
            space+=" ";
        }
    }

    @Override
    public String toString() {
        addSpaces();
        return username +" - "+ score +" points."+space+"\t"+ extraLives+" extraLive(s) and "+removeAnswer+" remove an answer's were used\n";
    }
    
   
}