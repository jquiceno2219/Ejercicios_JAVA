package Ejercicio14;

    public class Notas {
        public double fisica;
        public double quimica;
        public double biologia;
        public double mate;
        public double informatica;
        public double notaFinal(){
            return (fisica + quimica + biologia + mate + informatica) / 5;

        }
        public String mensaje(){
            if(notaFinal() <= 5.99){
                return ("La calificacion es mala");
            }else if(notaFinal() <= 8){
                return ("la calificaion es buena");
            }else if(notaFinal() > 8.01){
                return ("La calificacion es excelente");
            }else{
                return null;
            }


        }

        public double getFisica() {
            return fisica;
        }
        public void setfisica(double fisica) {
            this.fisica = fisica;
        }
        public double getQuimica() {
            return quimica;
        }
        public void setQuimica(double quimica) {
            this.quimica = quimica;
        }
        public double getBiologia() {
            return biologia;
        }
        public void setBiologia(double biologia) {
            this.biologia = biologia;
        }
        public double getMate() {
            return mate;
        }
        public void setMate(double mate) {
            this.mate = mate;
        }
        public double getInformatica() {
            return informatica;
        }
        public void setInformatica(double informatica) {
            this.informatica = informatica;

        }
    }

