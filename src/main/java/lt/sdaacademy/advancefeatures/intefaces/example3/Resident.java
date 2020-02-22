package lt.sdaacademy.advancefeatures.intefaces.example3;

import java.math.BigDecimal;

public abstract class Resident implements Ritch{
    protected String name;
    protected String countryName;
    protected BigDecimal money;

    public Resident (String name, String countryName, BigDecimal money){
        this.name=name;
        this.countryName=countryName;
        this.money=money;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getMoney() {
        return money;
    }

    @Override
    public boolean findRicher(BigDecimal money) {
        return this.money.compareTo(money)<0;
    }
}
