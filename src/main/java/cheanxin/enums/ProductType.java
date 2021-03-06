package cheanxin.enums;

/**
 * Created by 273cn on 17/1/3.
 */
public enum ProductType {
    NEW_CAR_LOAN(1, "新车贷款"),
    USED_CAR_LOAN(2, "二手车贷款");

    private final int value;
    private final String desc;

    private ProductType(int value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    public int value() {
        return this.value;
    }

    public String getDesc() {
        return this.desc;
    }

    public static int[] getAllValues() {
        ProductType productTypes[] = ProductType.values();
        int values[] = new int[productTypes.length];
        for (int i = 0; i < productTypes.length; i++) {
            values[i] = productTypes[i].value();
        }
        return values;
    }

    public static boolean contains(int value) {
        ProductType productTypes[] = ProductType.values();
        for (ProductType productType : productTypes) {
            if (productType.value() == value)
                return true;
        }
        return false;
    }
}
