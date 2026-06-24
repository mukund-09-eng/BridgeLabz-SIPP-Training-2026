interface CouponValidator {

    void validateCoupon(String code);

    static boolean isLengthValid(String code) {
        return code.length() >= 5;
    }
}

class ShoppingCart implements CouponValidator {

    @Override
    public void validateCoupon(String code) {

        if (CouponValidator.isLengthValid(code)
                && code.startsWith("SAVE")) {

            System.out.println(code + " -> Valid Coupon");
        } else {
            System.out.println(code + " -> Invalid Coupon");
        }
    }
}

public class CouponValidatorDemo {

    public static void main(String[] args) {

        String[] coupons = {
                "SAVE10",
                "AB12",
                "SAVE50",
                "DISC20"
        };

        ShoppingCart cart = new ShoppingCart();

        for (String coupon : coupons) {
            cart.validateCoupon(coupon);
        }
    }
}
