package All;

public class Cpc extends Classification{
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

        sb.append(position);

        sb.append(value);

        return sb.toString();
    }

    public Cpc(char section, int mainClass, char subclass, int mainGroup, int subgroup, char position, int value) {
        this.section = section;
        this.mainClass = mainClass;
        this.subclass = subclass;
        this.mainGroup = mainGroup;
        this.subgroup = subgroup;
        this.position = position;
        this.value = value;
    }

    public Cpc(String symbol1) {
        this.section = symbol1.charAt(0);
        this.mainClass = Integer.parseInt(symbol1.substring(1, 3));
        this.subclass = symbol1.charAt(3);

        int pos = symbol1.indexOf(SEPARATOR);
        this.mainGroup = Integer.parseInt(symbol1.substring(4, pos).trim());
        this.subgroup = Integer.parseInt(symbol1.substring(pos + 1, pos + 3));
        this.position = symbol1.charAt(pos + 3);
        this.value = Integer.parseInt(symbol1.substring(pos+4));
    }
}

