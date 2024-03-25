package Week4;

public class Classification {
    protected char section;
    protected int mainClass;
    protected char subclass;
    protected int mainGroup;
    protected int subgroup;
    protected char position;
    protected int value;
    protected final char SEPARATOR = '/';
    public char getSection() {
        return section;
    }

    public void setSection(char section) {
        this.section = section;
    }

    public int getMainClass() {
        return mainClass;
    }

    public void setMainClass(int mainClass) {
        this.mainClass = mainClass;
    }

    public char getSubclass() {
        return subclass;
    }

    public void setSubclass(char subclass) {
        this.subclass = subclass;
    }

    public int getMainGroup() {
        return mainGroup;
    }

    public void setMainGroup(int mainGroup) {
        this.mainGroup = mainGroup;
    }

    public int getSubgroup() {
        return subgroup;
    }

    public void setSubgroup(int subgroup) {
        this.subgroup = subgroup;
    }

    public char getPosition() {
        return position;
    }

    public void setPosition(char position) {
        this.position = position;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
