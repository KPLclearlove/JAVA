package All;

public class test {
    public static void main(String[] args) {
        char section = 'A';
        int mainClass = 4;
        char subclass = 'B';
        int mainGroup = 55;
        int subgroup = 56;
        char position = 'B';
        int value = 1;

        Ipc ipc = new Ipc(section, mainClass, subclass, mainGroup, subgroup);
        System.out.println(ipc);

        String symbol = "G09F 17/30";
        System.out.println(new Ipc(symbol));

        Cpc cpc = new Cpc(section, mainClass, subclass, mainGroup, subgroup, position, value);
        System.out.println(cpc);

        String symbol1 = "G09F 17/30B1";
        System.out.println(new Cpc(symbol1));


    }

}
