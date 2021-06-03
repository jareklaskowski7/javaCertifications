//	Sun Certified Java Programmer
//	Chapter 3, P243
//  Assignments

class Conversions {
    public static void main(String[] args) {
        for (int x = 1; x <= 3; x++) {
            switch (x) {
                case 1: {
                    //  primitive xxxValue()
                    //  -to convert a Wrapper to a primitive
                    System.out.println("\n");
                    //  make a new wrapper (Byte) object
                    Byte x1 = new Byte("45");
                    System.out.println(x1 instanceof Byte);
                    //  convert x1's value to the appropriate primitive
                    byte a1 = x1.byteValue();
                    short b1 = x1.shortValue();
                    int c1 = x1.intValue();
                    long e1 = x1.longValue();
                    float f1 = x1.floatValue();
                    double g1 = x1.doubleValue();
                    System.out.println(a1);
                    System.out.println(b1);
                    System.out.println(c1);
                    System.out.println(e1);
                    System.out.println(f1);
                    System.out.println(g1);
                    System.out.println(x1);
                    System.out.println(x1 instanceof Byte);
                    System.out.println("");
                    //  make a new wrapper (Short) object
                    Short x2 = new Short("457");
                    System.out.println(x2 instanceof Short);
                    //  convert x2's value to the appropriate primitive
                    byte a2 = x2.byteValue();
                    short b2 = x2.shortValue();
                    int c2 = x2.intValue();
                    long e2 = x2.longValue();
                    float f2 = x2.floatValue();
                    double g2 = x2.doubleValue();
                    System.out.println(a2);
                    System.out.println(b2);
                    System.out.println(c2);
                    System.out.println(e2);
                    System.out.println(f2);
                    System.out.println(g2);
                    System.out.println(x2);
                    System.out.println(x2 instanceof Short);
                    System.out.println("");
                    //  make a new wrapper (Integer) object
                    Integer x3 = new Integer("47263");
                    System.out.println(x3 instanceof Integer);
                    //  convert x3's value to the appropriate primitive
                    byte a3 = x3.byteValue();
                    short b3 = x3.shortValue();
                    int c3 = x3.intValue();
                    long e3 = x3.longValue();
                    float f3 = x3.floatValue();
                    double g3 = x3.doubleValue();
                    System.out.println(a3);
                    System.out.println(b3);
                    System.out.println(c3);
                    System.out.println(e3);
                    System.out.println(f3);
                    System.out.println(g3);
                    System.out.println(x3);
                    System.out.println(x3 instanceof Integer);
                    System.out.println("");
                    //  make a new wrapper (Long) object
                    Long x4 = new Long("478642630");
                    System.out.println(x4 instanceof Long);
                    //  convert x4's value to the appropriate primitive
                    byte a4 = x4.byteValue();
                    short b4 = x4.shortValue();
                    int c4 = x4.intValue();
                    long e4 = x4.longValue();
                    float f4 = x4.floatValue();
                    double g4 = x4.doubleValue();
                    System.out.println(a4);
                    System.out.println(b4);
                    System.out.println(c4);
                    System.out.println(e4);
                    System.out.println(f4);
                    System.out.println(g4);
                    System.out.println(x4);
                    System.out.println(x4 instanceof Long);
                    System.out.println("");
                    //  make a new wrapper (Float) object
                    Float x5 = new Float("476310430.617");
                    System.out.println(x5 instanceof Float);
                    //  convert x5's value to the appropriate primitive
                    byte a5 = x5.byteValue();
                    short b5 = x5.shortValue();
                    int c5 = x5.intValue();
                    long e5 = x5.longValue();
                    float f5 = x5.floatValue();
                    double g5 = x5.doubleValue();
                    System.out.println(a5);
                    System.out.println(b5);
                    System.out.println(c5);
                    System.out.println(e5);
                    System.out.println(f5);
                    System.out.println(g5);
                    System.out.println(x5);
                    System.out.println(x5 instanceof Float);
                    System.out.println("");
                    //  make a new wrapper (Double) object
                    Double x6 = new Double("4764343037.6793");
                    System.out.println(x6 instanceof Double);
                    //  convert x6's value to the appropriate primitive
                    byte a6 = x6.byteValue();
                    short b6 = x6.shortValue();
                    int c6 = x6.intValue();
                    long e6 = x6.longValue();
                    float f6 = x6.floatValue();
                    double g6 = x6.doubleValue();
                    System.out.println(a6);
                    System.out.println(b6);
                    System.out.println(c6);
                    System.out.println(e6);
                    System.out.println(f6);
                    System.out.println(g6);
                    System.out.println(x6);
                    System.out.println(x6 instanceof Double);
                    System.out.println("");
                    break;
                }  //  end of case 1

                case 2: {
                    //  primitive parseXxx(String)
                    //  -to convert a String to a primitive
                    byte h1 = Byte.parseByte("6");
                    byte h2 = Byte.parseByte("01000111", 2);
                    short j1 = Short.parseShort("106");
                    short j2 = Short.parseShort("01001100", 2);
                    int k1 = Integer.parseInt("6758");
                    int k2 = Integer.parseInt("11001010", 2);
                    long m1 = Long.parseLong("6770489");
                    long m2 = Long.parseLong("11101111", 2);
                    float n1 = Float.parseFloat("63257.98F");
                    double o1 = Double.parseDouble("6297675.197");
                    System.out.println(h1);
                    System.out.println(h2);
                    System.out.println(j1);
                    System.out.println(j2);
                    System.out.println(k1);
                    System.out.println(k2);
                    System.out.println(m1);
                    System.out.println(m2);
                    System.out.println(n1);
                    System.out.println(o1);
                    System.out.println("");
                    break;
                }  //  end of case 2

                case 3: {
                    //  Wrapper valueOf(String)
                    //  -to convert a String to a Wrapper
                    Byte p1 = Byte.valueOf("56");
                    //Byte p2 = Byte.valueOf("8");
                    //System.out.println(p1 instanceof Byte);
                    Short q1 = Short.valueOf("248");
                    //Short q2 = Short.valueOf("108");
                    Integer r1 = Integer.valueOf("43287");
                    //Integer r2 = Integer.valueOf("87");
                    Long s1 = Long.valueOf("87031789");
                    //Long s2 = Long.valueOf("87789");
                    Float t1 = Float.valueOf("783295.63f");
                    Double u1 = Double.valueOf("542891401479.872");
                    System.out.println(p1);
                    System.out.println(p1 instanceof Byte);
                    //System.out.println(p2);
                    //System.out.println(p2 instanceof Byte);
                    System.out.println(q1);
                    System.out.println(q1 instanceof Short);
                    //System.out.println(q2);
                    //System.out.println(q2 instanceof Short);
                    System.out.println(r1);
                    System.out.println(r1 instanceof Integer);
                    //System.out.println(r2);
                    //System.out.println(r2 instanceof Integer);
                    System.out.println(s1);
                    System.out.println(s1 instanceof Long);
                    //System.out.println(s2);
                    //System.out.println(s2 instanceof Long);
                    System.out.println(t1);
                    System.out.println(t1 instanceof Float);
                    System.out.println(u1);
                    System.out.println(u1 instanceof Double);
                    break;
                }
            }
        }
    }
}
