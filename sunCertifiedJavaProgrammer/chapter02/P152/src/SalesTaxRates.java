//	Sun Certified Java Programmer
//	Chapter 2, P152
//  Object Orientation

class SalesTaxRates {
    public float salesRate;             //  should be private
    public float adjustedSalesRate;     //  should be private

    public float getSalesRate(String region) {
        salesRate = new DoTaxes().doColorado();     //  ouch again!
        //  do region-based calculations
        return adjustedSalesRate;
    }
}
