package strategies;

import candy.Candy;
import java.util.List;

public class ChooseOnlySugarFreeCandiesStrategy implements ChoosingCandyStrategy {
    @Override
    public Candy chooseCandy(List<Candy> listOfCandies, int childAge) {
        return listOfCandies.stream()
                .min((c1, c2) -> Integer.compare(c1.getType().length(), c2.getType().length()))
                .orElse(null);
    }
}
