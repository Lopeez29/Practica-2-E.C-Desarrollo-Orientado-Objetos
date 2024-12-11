
    class Marca {
        private String nombre;
        private String pais;
        private double facturacion;

        public Marca(String nombre, String pais, double facturacion) {
            this.nombre = nombre;
            this.pais = pais;
            this.facturacion = facturacion;
        }

        public String getNombre() {
            return nombre;
        }

        public String getPais() {
            return pais;
        }

        public double getFacturacion() {
            return facturacion;
        }

        @Override
        public String toString() {
            return "Marca{" +
                    "nombre='" + nombre + '\'' +
                    ", pais='" + pais + '\'' +
                    ", facturacion=" + facturacion +
                    '}';
        }
    }

