package Second;

public class Store {
    public static void main(String[] args) {
        Clothing clo=new Clothing();
        clo.setID(3456);
        clo.setProducent("HM");
        clo.setModel("sukienka");
        clo.setCollection("Summer");
        clo.setSize(122);
        System.out.println(clo.toString());
        Schoes sch=new Schoes();
        sch.setInsert(23);
        sch.setMembrana(true);
        sch.setCollection("Spring");
        sch.setID(123);
        sch.setModel("Sanda³y");
        System.out.println(sch.toString());
        Jewelry jew=new Jewelry();
        jew.setAggregate("Z³oto");
        jew.setSample(0.585);
        jew.setCollection("Lazy");
        jew.setID(56723);
        jew.setModel("Naszyjnik");
        jew.setProducent("Kruk");
        System.out.println(jew.toString());

    }
}
