package First;

public class Part {
    protected int ID;
    protected String producent;
    protected String model;
    protected String collection;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getProducent() {
        return producent;
    }

    public void setProducent(String producent) {
        this.producent = producent;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCollection() {
        return collection;
    }

    public void setCollection(String collection) {
        this.collection = collection;
    }
    public Part(int ID, String producent,String model,String collection) {
        this.ID=ID;
        this.producent=producent;
        this.model=model;
        this.collection=collection;
    }
    public Part(){}
}
