public class EconomBIGroup implements AreaAndGroup {
    @Override
    public void howManySquareMeters(int squareMeters) {
        int how_cost = squareMeters*333000;
        System.out.println("The average price of econom " + how_cost);
    }
}
