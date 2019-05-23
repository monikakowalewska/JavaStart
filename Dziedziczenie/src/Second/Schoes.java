package Second;

import First.Part;

public class Schoes extends Part {
    int insert;
    boolean membrana;

    public int getInsert() {
        return insert;
    }

    public void setInsert(int insert) {
        this.insert = insert;
    }

    public boolean isMembrana() {
        return membrana;
    }

    public void setMembrana(boolean membrana) {
        this.membrana = membrana;
    }

    @Override
    public String toString() {
        return "Schoes{" +
                "insert=" + insert +
                ", membrana=" + membrana +
                ", ID=" + ID +
                ", producent='" + producent + '\'' +
                ", model='" + model + '\'' +
                ", collection='" + collection + '\'' +
                '}';
    }
}
