package com.sistemi.informativi.builder;

public class Spedizione {

    private String origine;
    private String destinazione;
    private String assicurazione;
    private boolean prime;
    public Spedizione (SpedizioneBuilder spedizioneBuilder){
        this.origine=spedizioneBuilder.origine;
        this.destinazione= spedizioneBuilder.destinazione;
        this.prime= spedizioneBuilder.prime;
        this.assicurazione= spedizioneBuilder.assicurazione;
    }

    @Override
    public String toString() {
        return "Spedizione{" +
                "origine='" + origine + '\'' +
                ", destinazione='" + destinazione + '\'' +
                ", assicurazione='" + assicurazione + '\'' +
                ", prime=" + prime +
                '}';
    }

    public String getOrigine() {
        return origine;
    }

    public String getDestinazione() {
        return destinazione;
    }

    public String getAssicurazione() {
        return assicurazione;
    }

    public boolean isPrime() {
        return prime;
    }

    public static class SpedizioneBuilder {
        private String origine;
        private String destinazione;
        private String assicurazione;
        private boolean prime;

        public SpedizioneBuilder(String origine, String destinazione) {
            this.origine = origine;
            this.destinazione = destinazione;
        }

        public SpedizioneBuilder assicurazione(String assicurazione) {
            this.assicurazione = assicurazione;
            return this;
        }
        public SpedizioneBuilder notAssicurazione (){
            this.assicurazione= null;
            return this;
        }
        public SpedizioneBuilder prime (boolean prime){
            this.prime= prime;
            return this;
        }
        public SpedizioneBuilder notPrime(){
            this.prime=false;
            return this;
        }
        public SpedizioneBuilder primeAssicurazione (String assicurazione, boolean prime){
            this.assicurazione=assicurazione;
            this.prime=prime;
            return this;
        }
        public SpedizioneBuilder notPrimeAssicurazione (){
            this.prime=false;
            this.assicurazione=null;
            return this;
        }
        public Spedizione build(){
            return new Spedizione(this);
        }

    }

}
