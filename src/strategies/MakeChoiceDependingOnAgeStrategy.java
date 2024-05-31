package strategies;

import candy.Candy;
import java.util.List;
import java.util.Random;

public class MakeChoiceDependingOnAgeStrategy implements ChoosingCandyStrategy {
    @Override
    public Candy chooseCandy(List<Candy> listOfCandies, int childAge) {
        return listOfCandies.stream()
                .filter(candy -> candy.getType().length() == childAge)
                .findAny()
                .orElseGet(() -> {
                    Random random = new Random();
                    return listOfCandies.get(random.nextInt(listOfCandies.size()));
                });
    }
}
