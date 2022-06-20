package market.store.domain;

import java.util.List;

public class Brand {

    private int brandId;
    private String name;
    private List<PricesProduct> prices;

    public List<PricesProduct> getPrices() {
        return prices;
    }

    public void setPrices(List<PricesProduct> prices) {
        this.prices = prices;
    }

    public int getBrandId() {
        return brandId;
    }

    public void setBrandId(int brandId) {
        this.brandId = brandId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
