package strategy.promotion;

public class PromotionActivityTest2 {

    public static void main(String[] args) {
        String promotionStrategy = "GROUPBUY";
        PromotionActivity promotionActivity = new PromotionActivity(PromotionStrategyFactory.getPromotionStrategy(promotionStrategy));
        promotionActivity.execute();
    }

}
