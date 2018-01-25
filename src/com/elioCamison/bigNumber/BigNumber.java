package com.elioCamison.bigNumber;

public class BigNumber {

    public String digit;

    /**
     * --o Constructor 1
     *
     * @param numero
     */
    public BigNumber(String numero) {
        int cont = 0;
        for (int i = 0; i < numero.length(); i++) {
            char vlr = numero.charAt(i);
            if (vlr == '0') {
                cont++;
            } else break;
        }

        this.digit = numero.substring(cont);


//
//        String vlr1  = "";
//        //-- ----------------------------------------------------------------
//        for (int i = 0; i < numero.length(); i++) {
//            char vlr = numero.charAt(i);
//            if (vlr == 48 && numero.charAt(i) == 0) {
//                numero.replace("0","");
//            }
//        }
//        this.numero = vlr1;
        //-- ----------------------------------------------------------------
    }

    //-- ----------------------------------------------------------------
    //-- ----------------------------------------------------------------

    /**
     * --o Constructor 2
     *
     * @param b
     */
    public BigNumber(BigNumber b) {
        //-- ----------------------------------------------------------------
        this.digit = b.getNumero();
        //-- ----------------------------------------------------------------
    }

    //-- ----------------------------------------------------------------
    //-- ----------------------------------------------------------------

    /**
     * --o Suma
     *
     * @param other
     * @return
     */
    public BigNumber add(BigNumber other) {
        //-- ----------------------------------------------------------------
        String valor = other.getNumero();
        //-- ----------------------------------------------------------------
        BigNumber nb = new BigNumber("");
        //-- ----------------------------------------------------------------
        //--o Recorremos el String
        for (int i = 0; i < valor.length(); i++) {

            int vlr = Integer.parseInt(valor);
            int num = Integer.parseInt(digit);
            int result = vlr + num;
            String rlt = String.valueOf(result);

            other.setNumero(rlt);
            nb = new BigNumber(rlt);
        }
        //-- ----------------------------------------------------------------
        return nb;
    }

    //-- ----------------------------------------------------------------
    //-- ----------------------------------------------------------------

    /**
     * --o Resta
     *
     * @param other
     * @return
     */
    BigNumber sub(BigNumber other) {
        return other;
    }

    //-- ----------------------------------------------------------------
    //-- ----------------------------------------------------------------

    /**
     * --o Multiplica
     *
     * @param other
     * @return
     */
    BigNumber mult(BigNumber other) {
        return other;
    }

    //-- ----------------------------------------------------------------
    //-- ----------------------------------------------------------------

    /**
     * --o Divideix
     *
     * @param other
     * @return
     */
    BigNumber div(BigNumber other) {
        return other;
    }

    //-- ----------------------------------------------------------------
    //-- ----------------------------------------------------------------

    /**
     * --o  Compara dos BigNumber. Torna 0 si són iguals, -1 si el primer és menor
     * --o i torna 1 si el segon és menor
     * @param other
     * @return oth
     */
    public int compareTo(BigNumber other) {
        //-- ----------------------------------------------------------------
        BigNumber oth = (BigNumber) other;
        //-- ----------------------------------------------------------------
        int n = this.digit.compareTo(oth.digit);
        int n2 = oth.digit.compareTo(this.digit);
        //-- ----------------------------------------------------------------
        if (n < n2){
            return -1;
        } else if (n > n2) {
            return 1;
        } else {
            return 0;
        }
        //-- ----------------------------------------------------------------
    }

    //-- ----------------------------------------------------------------
    //-- ----------------------------------------------------------------

    /**
     * --o Mira si dos objectes BigNumber són iguals
     *
     * @param other
     * @return
     */
    public boolean equals(Object other) {
        //-- ----------------------------------------------------------------
        BigNumber oth = (BigNumber) other;
        //-- ----------------------------------------------------------------
        return this.digit.equals(oth.digit);
        //-- ----------------------------------------------------------------
    }

    //-- ----------------------------------------------------------------
    //-- ----------------------------------------------------------------

    /**
     * --o Retorna el valor de Numero
     *
     * @return
     */
    public String getNumero() {
        return digit;
    }

    //-- ----------------------------------------------------------------
    //-- ----------------------------------------------------------------

    /**
     * --o Canvia el valor de  numero
     *
     * @param numero
     */
    public void setNumero(String numero) {
        this.digit = numero;
    }

    //-- ----------------------------------------------------------------
    //-- ----------------------------------------------------------------

    @Override
    public String toString() {
        return "BigNumber{" +
                "numero='" + digit + '\'' +
                '}';
    }

}
