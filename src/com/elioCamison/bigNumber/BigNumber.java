package com.elioCamison.bigNumber;

public class BigNumber {

    private String numero;

        // CONSTRUCTOR 1
        public BigNumber(String numero) {
            //-- ----------------------------------------------------------------
            this.numero = numero;

            //-- ----------------------------------------------------------------
            for (int i = 0; i < numero.length(); i++) {
                char vlr = numero.charAt(i);
                if (vlr == 48 && numero.charAt(i) == 1) {
                    continue;
                }
            }
            //-- ----------------------------------------------------------------
        }

        // CONSTRUCTOR 2
        public BigNumber(BigNumber b) {
            this.numero = b.getNumero();
        }


        //--o SUMA
        public BigNumber add(BigNumber other) {
            //-- ----------------------------------------------------------------
            String valor = other.getNumero();

            //--o Con esto se puede comprobar que no sea negativo
            int comprobar = Integer.parseInt(valor);

            if(comprobar < 0){
                //--o Code...
            }

            //-- ----------------------------------------------------------------
            //--o Recorremos el String
            for (int i = 0; i < valor.length(); i++){

                int vlr = Integer.parseInt(valor);
                int num = Integer.parseInt(numero);
                int result = vlr + num;
                String rlt = String.valueOf(result);

                other.setNumero(rlt);
            }
            //-- ----------------------------------------------------------------
            return other;
        }

        // Resta
        BigNumber sub(BigNumber other) {
            return other;
        }

        // Multiplica
        BigNumber mult(BigNumber other) {
            return other;
        }

        // Divideix
        BigNumber div(BigNumber other) {
            return other;
        }

        // Compara dos BigNumber. Torna 0 si són iguals, -1 si el primer és menor
        // i torna 1 si el segon és menor

        public int compareTo(BigNumber other) {
            return 0;
        }

    // Mira si dos objectes BigNumber són iguals
        public boolean equals(Object other) {
            BigNumber oth = (BigNumber) other;

            if (this.numero.equals(oth.numero)){
                return true;
            }
            return false;
        }

        // Retorna el valor de Numero
        public String getNumero() {
            return numero;
        }

        // Canvia el valor de  numero
        public void setNumero(String numero) {
            this.numero = numero;
        }

        @Override
        public String toString() {
            return "BigNumber{" +
                    "numero='" + numero + '\'' +
                    '}';
        }

}
