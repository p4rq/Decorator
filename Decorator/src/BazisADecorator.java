public class BazisADecorator extends Decor {
    public BazisADecorator(IApartment wrapped) {
        super(wrapped);
    }
    @Override
    public void advantages(String adv){
        super.advantages(adv);
        System.out.println(adv + "BAZIS-A — крупнейший застройщик Казахстана, работает на строительном рынке с 1991 года и имеет высочайшую репутацию лидера строительной индустрии Казахстана.");


    }
}
