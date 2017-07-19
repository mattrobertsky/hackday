package hello;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by matt on 19/07/17.
 */
public class Price {

    @JsonProperty("price")
    private Float price;

    public Float getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = Float.parseFloat(price);
    }
}
