package iteratordostupcollection;

public class ConcretAggregate implements Aggregate {

    String task[] = {"Hui", "Govno", "Pizda", "Zalupa", "Jopa", "Siski"};

    @Override
    public IteratorInt getIteratorInt() {
        return new TaskIterator();
    }

    private class TaskIterator implements IteratorInt {

        int index = 0;

        @Override
        public boolean hasNext() {
            if (index < task.length) {
                return true;
            } else {
                return false;
            }
        }

        @Override
        public Object next() {
            return task[index++];
        }

    }
}
