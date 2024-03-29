package Week5;

public class Gas extends CAR{
    public void perkilo(){
        System.out.println("度每百公里");
    }

    public static void main(String[] args) {
        Gas tesla = new Gas();
        tesla.perkilo();
    }
}
