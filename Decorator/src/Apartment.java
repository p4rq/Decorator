public class Apartment implements IApartment {
    private final String name;
    private final BuyerName buyerName;


    public Apartment(String name){
        this.name = name;
        buyerName = new BuyerName();

    }

    @Override
    public void advantages(String adv){
        String buyer = buyerName.getName(name);
        System.out.println(adv + "of company " +"for " +buyer);
    }

}
