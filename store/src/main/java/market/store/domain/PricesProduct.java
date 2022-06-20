package market.store.domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

public class PricesProduct {
    private int productId;
    private int brandId;
    private LocalDateTime start_date;
    private LocalDateTime end_date;
    private int price_list;
    private int priority;
    private BigDecimal price;
    private String curr;
    private List<PricesProduct> prices;

    public List<PricesProduct> getPrices() {
        return prices;
    }

    public void setPrices(List<PricesProduct> prices) {
        this.prices = prices;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getBrandId() {
        return brandId;
    }

    public void setBrandId(int brandId) {
        this.brandId = brandId;
    }

    public LocalDateTime getStart_date() {
        return start_date;
    }

    public void setStart_date(LocalDateTime start_date) {
        this.start_date = start_date;
    }

    public LocalDateTime getEnd_date() {
        return end_date;
    }

    public void setEnd_date(LocalDateTime end_date) {
        this.end_date = end_date;
    }

    public int getPrice_list() {
        return price_list;
    }

    public void setPrice_list(int price_list) {
        this.price_list = price_list;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getCurr() {
        return curr;
    }

    public void setCurr(String curr) {
        this.curr = curr;
    }
}
