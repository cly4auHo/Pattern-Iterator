package iteratordostupcollection;

public class IteratorApp {

    public static void main(String[] args) {
        ConcretAggregate c = new ConcretAggregate();
        IteratorInt i = c.getIteratorInt();

        while (i.hasNext()) {
            System.out.println((String) i.next());
        }
    }
}
