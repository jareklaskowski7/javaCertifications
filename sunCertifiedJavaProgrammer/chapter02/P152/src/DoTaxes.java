//	Sun Certified Java Programmer
//	Chapter 2, P152
//  Object Orientation

class DoTaxes {
    float rate;

    float doColorado() {
        SalesTaxRates str = new SalesTaxRates();
        rate = str.salesRate;   //  ouch
        //  this should be a method call:
        //  rate = str.getSalesRate("CO");
        //  do stuff with rate
    }
}
