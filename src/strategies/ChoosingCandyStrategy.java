package strategies;

import candy.Candy;
import java.util.List;

public interface ChoosingCandyStrategy {
    Candy chooseCandy(List<Candy> listOfCandies, int childAge);
}
