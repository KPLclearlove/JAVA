package Week5;

public class Electric extends CAR {
    public void perkilo(){
        System.out.println("升每百公里");
    }

    public static void main(String[] args) {
        Electric BMW = new Electric();
        BMW.perkilo();
    }
}
