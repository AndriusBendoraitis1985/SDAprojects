package lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise10.services;

import java.util.Map;
import lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise10.goods.Coin;
import lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise10.goods.CurencyType;
import lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise10.goods.Product;

public class VendingMachine {
    CurencyType curencyType;
    Map<Product, Integer> productStock;
    Map<Coin, Integer> coinStock;

    public VendingMachine(CurencyType curencyType, Map<Product, Integer> productStock, Map<Coin, Integer> coinStock) {
        this.curencyType = curencyType;
        this.productStock = productStock;
        this.coinStock = coinStock;
    }

}
