package market.store.domain;

import java.util.List;

public class Product {
    private int productId;
    private String name;
    private List<PricesProduct> prices;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
