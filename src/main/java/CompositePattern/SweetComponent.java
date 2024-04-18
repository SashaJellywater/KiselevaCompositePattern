package CompositePattern;

public class SweetComponent extends Component{
    private int count;

    public SweetComponent(int count) {
        this.count = count;
    }

    @Override
    public int count() {
        return count;
    }

    // Методы add и remove не применимы для отдельной сладости
    @Override
    public void add(Component component) {
        throw new UnsupportedOperationException("Метод add не применим к отдельной сладости");
    }

    @Override
    public void remove(Component component) {
        throw new UnsupportedOperationException("Метод remove не применим к отдельной сладости");
    }
}
