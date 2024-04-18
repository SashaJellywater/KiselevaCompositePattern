package CompositePattern;

public class Main {
    public static void main(String[] args) {
        // Создаем сладости
        Component cookies = new SweetComponent(20);
        Component lollipops = new SweetComponent(30);
        Component chocolate = new SweetComponent(10);

        // Создаем коробки и добавляем в них сладости
        Component firstBox = new BoxComponent();
        firstBox.add(cookies);
        Component secondBox = new BoxComponent();
        secondBox.add(lollipops);
        Component thirdBox = new BoxComponent();
        thirdBox.add(chocolate);

        // Добавляем коробку со сладостями в первую коробку
        firstBox.add(secondBox);

        // Добавляем коробку с шоколадками во вторую коробку
        secondBox.add(thirdBox);

        // Считаем общее количество сладостей
        int totalSweets = firstBox.count();
        System.out.println("Общее количество сладостей в коробках: " + totalSweets);
    }
}
