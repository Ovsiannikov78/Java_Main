public class GuessedFromFirstAttemptMessenger implements GameMessenger{

    private boolean isGuessed = true;
    @Override
    public void printString(String s) {
        //System.out.println(s);
        isGuessed = s.equals(" You are winner :-) !!!");
    }
    public boolean isGuessed(){
        return isGuessed;
    }
}
