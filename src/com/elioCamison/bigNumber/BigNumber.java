package com.elioCamison.bigNumber;

public class BigNumber {

    public String numero;

        // Constructor 1
        public BigNumber(String numero) {
            this.numero = numero;
        }

        // Constructor 2
        public BigNumber(BigNumber b) {
            this.numero = b.getNumero();
        }

        // Suma
        public BigNumber add(BigNumber other) {

            String valor = other.getNumero();
            for (int i = 0; i < valor.length(); i++){
                int vlr = Integer.parseInt(valor);
                int num = Integer.parseInt(numero);
                int result = vlr + num;
                String rlt = String.valueOf(result);

                other.setNumero(rlt);
            }
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
