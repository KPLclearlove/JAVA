package Week6;

public class Charcounter {
    protected String sentences;
    protected char word;
    protected int findword = 0;
    protected int alphacount = 0;
    protected int numbercount = 0;
    public Charcounter(String sentences, char word){
        this.sentences = sentences;
        this.word = word;
    }
    @Override
    public String toString() {
        for(int i = 0; i < sentences.length(); i++){
            if(sentences.charAt(i) == word){
                findword = findword + 1;
            }
            if(sentences.charAt(i) <= 122 & sentences.charAt(i ) >= 65){
                alphacount = alphacount + 1;
            }
            if(sentences.charAt(i) <= 57 & sentences.charAt(i ) >= 48){
                numbercount = numbercount + 1;
            }
        }
        return "alpha = " + alphacount + "\"" +
                "number = " + numbercount + "\"" +
                "find = " + findword ;
    }

    public static void main(String[] args) {
        Charcounter test = new Charcounter("QWERT12345",'A');
        System.out.println(test);
    }
}
