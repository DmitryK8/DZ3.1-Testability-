public class BonusMilesService<bonusMilesService> {

    public int calculate(int price, int cost) {
        int bonusMilesService = price / cost;

        System.out.println(bonusMilesService + "miles");
        return bonusMilesService;
    }
}