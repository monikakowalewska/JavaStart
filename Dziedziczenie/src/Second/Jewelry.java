package Second;

import First.Part;

public class Jewelry extends Part {
    String aggregate;
    double sample;

    public String getAggregate() {
        return aggregate;
    }

    public void setAggregate(String aggregate) {
        this.aggregate = aggregate;
    }

    public double getSample() {
        return sample;
    }

    public void setSample(double sample) {
        this.sample = sample;
    }

    @Override
    public String toString() {
        return "Jewelry{" +
                "aggregate='" + aggregate + '\'' +
                ", sample=" + sample +
                ", ID=" + ID +
                ", producent='" + producent + '\'' +
                ", model='" + model + '\'' +
                ", collection='" + collection + '\'' +
                '}';
    }
}
