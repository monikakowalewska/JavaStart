package Second;

import First.Part;

public class Clothing extends Part {
    int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Clothing{" +
                "size=" + size +
                ", ID=" + ID +
                ", producent='" + producent + '\'' +
                ", model='" + model + '\'' +
                ", collection='" + collection + '\'' +
                '}';
    }
}
