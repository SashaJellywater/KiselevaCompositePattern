package CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class BoxComponent extends Component{
    private List<Component> components = new ArrayList<>();

    @Override
    public int count() {
        int total = 0;
        for (Component component : components) {
            total += component.count();
        }
        return total;
    }

    @Override
    public void add(Component component) {
        components.add(component);
    }

    @Override
    public void remove(Component component) {
        components.remove(component);
    }
}
