package CH3;


public class ScoreBoard {
    private GameEntry[] gameEntries;
    private int numEntries =0;

    public ScoreBoard(int capacity) {
        gameEntries=new GameEntry[capacity];
    }
    public void add(GameEntry gameEntry){
        int score= gameEntry.getScore();
        if(numEntries <gameEntries.length||score<gameEntries[numEntries -1].getScore()){
            if(numEntries <gameEntries.length)
                numEntries++;
           int j= numEntries -1;
           while(j>0 &&score>gameEntries[j].getScore()){
               gameEntries[j]=gameEntries[j];
               j--;
           }
           gameEntries[j]=gameEntry;
        }
    }
    public GameEntry remove(int index){
        if(index<0 || index>= numEntries)throw new IndexOutOfBoundsException();
        int j=index+1;
        GameEntry temp=gameEntries[index];
        while(j< numEntries){
            gameEntries[j-1]=gameEntries[j];
            j++;
        }
        gameEntries[numEntries -1]=null;
        numEntries--;
        return temp;
    }
}
