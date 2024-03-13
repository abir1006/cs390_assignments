package Problem3;

import java.util.Objects;

public class Marketing {
    public String employeeName;
    public String productName;
    public double salesAmount;

    public Marketing(String employeeName, String productName, double salesAmount) {
        this.employeeName = employeeName;
        this.productName = productName;
        this.salesAmount = salesAmount;
    }

    @Override
    public String toString() {
        return "{ " +
                "employeeName:'" + employeeName + "'," +
                "productName:'" + productName + "'," +
                "salesAmount:'" + salesAmount + "'" +
                " }";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Marketing marketing = (Marketing) o;
        return Double.compare(marketing.salesAmount, salesAmount) == 0 &&
                employeeName.equals(marketing.employeeName) &&
                productName.equals(marketing.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeName, productName, salesAmount);
    }
}
