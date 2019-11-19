package strategy.promotion;

import java.util.HashMap;
import java.util.Map;

public class PromotionStrategyFactory {
    private PromotionStrategyFactory(){}

    private static final Map<String, PromotionStrategy> PROMOTION_STRATEGY_MAP = new HashMap<>();
    static {
        PROMOTION_STRATEGY_MAP.put(PromotionKey.COUPON,new CouponStrategy());
        PROMOTION_STRATEGY_MAP.put(PromotionKey.CASHBACK,new CashbackStrategy());
        PROMOTION_STRATEGY_MAP.put(PromotionKey.GROUPBUY,new GroupbuyStrategy());
    }
    private static final PromotionStrategy NON_PROMOTION = new EmptyStrategy();

    public static PromotionStrategy getPromotionStrategy(String promotionKey){
       return PROMOTION_STRATEGY_MAP.get(promotionKey)== null ? NON_PROMOTION : PROMOTION_STRATEGY_MAP.get(promotionKey);
    }

    private interface PromotionKey{
        String COUPON = "COUPON";
        String CASHBACK = "CASHBACK";
        String GROUPBUY = "GROUPBUY";
    }
}
