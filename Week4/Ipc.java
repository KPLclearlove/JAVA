package Week4;

public class Ipc extends Classification {

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(section);

        String strMainClass = String.format("%2s", mainClass).replace(' ', '0');
        sb.append(strMainClass);

        sb.append(subclass);

        String strMainGroup = String.format("%4s", mainGroup);
        sb.append(strMainGroup);

        sb.append(SEPARATOR);

        sb.append(subgroup);

        return sb.toString();
    }

    public Ipc(char section, int mainClass, char subclass, int mainGroup, int subgroup) {
        this.section = section;
        this.mainClass = mainClass;
        this.subclass = subclass;
        this.mainGroup = mainGroup;
        this.subgroup = subgroup;
    }

    public Ipc(String symbol) {
        this.section = symbol.charAt(0);
        this.mainClass = Integer.parseInt(symbol.substring(1, 3));
        this.subclass = symbol.charAt(3);

        int pos = symbol.indexOf(SEPARATOR);
        this.mainGroup = Integer.parseInt(symbol.substring(4, pos).trim());
        this.subgroup = Integer.parseInt(symbol.substring(pos + 1));
    }
}
