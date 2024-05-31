package strategies;

import candy.Candy;
import java.util.List;
import java.util.Random;

public class CandyHaterStrategy implements ChoosingCandyStrategy {
    @Override
    public Candy chooseCandy(List<Candy> listOfCandies, int childAge) {
        Random random = new Random();
        return listOfCandies.get(random.nextInt(listOfCandies.size()));
    }
}
