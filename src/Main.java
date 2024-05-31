import candy.Candy;
import child.Child;
import strategies.CandyHaterStrategy;
import strategies.ChooseOnlySugarFreeCandiesStrategy;
import strategies.MakeChoiceDependingOnAgeStrategy;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Candy> candies = new ArrayList<>();
        candies.add(new Candy("Marshmallow"));
        candies.add(new Candy("Jelly Candy"));
        candies.add(new Candy("Caramel"));

        Child child1 = new Child(10, new CandyHaterStrategy());
        Child child2 = new Child(5, new ChooseOnlySugarFreeCandiesStrategy());
        Child child3 = new Child(7, new MakeChoiceDependingOnAgeStrategy());

        testChildStrategy(child1, candies);
        testChildStrategy(child2, candies);
        testChildStrategy(child3, candies);
    }

    private static void testChildStrategy(Child child, List<Candy> candies) {
        System.out.println(child + " chose: " + child.chooseCandy(candies));
    }
}
