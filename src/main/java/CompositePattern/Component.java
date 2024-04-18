package CompositePattern;

abstract class Component {
    abstract int count();
    abstract void add(Component component);
    abstract void remove(Component component);
}
