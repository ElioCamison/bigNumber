package com.elioCamison.bigNumber;

public class BigNumber {

    public String digit;

    /**
     * --o Constructor 1
     *
     * @param numero
     */
    public BigNumber(String numero) {
        //-- ----------------------------------------------------------------
        int cont = 0;
        //-- ----------------------------------------------------------------
        for (int i = 0; i < numero.length(); i++) {
            //-- ----------------------------------------------------------------
            char vlr = numero.charAt(i);
            //-- ----------------------------------------------------------------
            if (vlr == '0') {
                cont++;
            } else break;
        }
        //-- ----------------------------------------------------------------
        this.digit = numero.substring(cont);
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
        StringBuilder vlr1 = new StringBuilder();
        StringBuilder vlr2 = new StringBuilder();
        //-- ----------------------------------------------------------------
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        //-- ----------------------------------------------------------------
        String valor = other.getNumero();
        vlr1.append(this.getNumero());
        vlr2.append(other.getNumero());
        //-- ----------------------------------------------------------------
        if (vlr1.length() > vlr2.length() || vlr1.length() == vlr2.length()){
             s1 = vlr1;
             s2 = vlr2;
        } else if (vlr1.length() < vlr2.length()) {
            s1 = vlr2;
            s2 = vlr1;
        }

        StringBuilder aux = new StringBuilder();

        for (int i = 0; i < s1.length(); i++){
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);

            //valores ascii, entre 48 y 57
            String c11 = String.valueOf(c1);
            String c22 = String.valueOf(c2);

            int c222 = Integer.parseInt(c11);
            int c111 = Integer.parseInt(c22);

            int res = c222+ c111;

            String result = Integer.toString(res);
            aux.append(result);

        }
        //-- ----------------------------------------------------------------
        BigNumber nb = new BigNumber(aux.toString());

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
