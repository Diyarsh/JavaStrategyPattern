package child;

import candy.Candy;
import strategies.ChoosingCandyStrategy;
import java.util.List;

public class Child {
    private final int age;
    private final ChoosingCandyStrategy choosingCandyStrategy;

    public Child(int age, ChoosingCandyStrategy choosingCandyStrategy) {
        this.age = age;
        this.choosingCandyStrategy = choosingCandyStrategy;
    }

    public Candy chooseCandy(List<Candy> candies) {
        return choosingCandyStrategy.chooseCandy(candies, age);
    }

    @Override
    public String toString() {
        return "Child{" + "age=" + age + ", strategy=" + choosingCandyStrategy.getClass().getSimpleName() + '}';
    }
}