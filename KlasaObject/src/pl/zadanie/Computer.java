package pl.zadanie;

import java.util.Objects;

public class Computer {
    private String producer;
    private int model;

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }
public Computer(String producer,int model){
        this.producer=producer;
        this.model=model;
}
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Computer)) return false;
        Computer computer = (Computer) o;
        return model == computer.model &&
                Objects.equals(producer, computer.producer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(producer, model);
    }

    @Override
    public String toString() {
        return "Computer{" +
                "producer='" + producer + '\'' +
                ", model=" + model +
                '}';
    }
}
