package lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise10.services;

import java.util.Map;
import lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise10.goods.Coin;
import lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise10.goods.Currency;
import lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise10.goods.Product;

public class VendingMachine {
    Currency currency;
    Map<Product, Integer> productStock;
    Map<Coin, Integer> coinStock;

    public VendingMachine(Currency currency, Map<Product, Integer> productStock, Map<Coin, Integer> coinStock) {
        this.currency = currency;
        this.productStock = productStock;
        this.coinStock = coinStock;
    }

    public Map<Product, Integer> getProductStock() {
        return productStock;
    }

    public Map<Coin, Integer> getCoinStock() {
        return coinStock;
    }

    @Override
    public String toString() {
        return "VendingMachine{" +
                "currency=" + currency +
                ", productStock=" + productStock +
                ", coinStock=" + coinStock +
                '}';
    }
}
