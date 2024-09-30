
        public class caneda {
            private boolean tinta;
            private String cor;
            private String marca;
            private float ponta;
            private boolean tampa; 
            

            public caneda(String m, float p){
              this.marca = m;
               this.ponta = p;
               this.tampar();

            }
        
            void escrever(){ 
              if( isTinta() == true && isTampa() == false ){
                  System.out.println("Voce pode escrever.");
              }else{
                  System.out.println("Caneta tampada ou sem tinta.");

              }    
            }
           void tampar(){
        //   if ( tampa == false ){

               setTampa(true);

        //       System.out.println("Tampado.");
        //      }else {
        //       System.out.println("Destampada.");
        //    }
           }
           void destampar(){
        //      if(tampa == true ){
                  setTampa(false); 
        //          System.out.println("Destampando.");   
        //      }else{
        //          System.out.println("Tampada.");
        //      } 
           }
           void status(){
               System.out.println("------------------------------");
               System.out.println("Marca:" + getMarca() );
               System.out.println("Cor:" + getCor() );
               System.out.println("Ponta:" + getPonta());
               System.out.println("Tampada:" + isTampa());
           }    

    /**
     * @return the tinta
     */
    public boolean isTinta() {
        return tinta;
    }

    /**
     * @param tinta the tinta to set
     */
    public void setTinta(boolean tinta) {
        this.tinta = tinta;
    }

    /**
     * @return the cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(String cor) {
        this.cor = cor;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the ponta
     */
    public float getPonta() {
        return ponta;
    }

    /**
     * @param ponta the ponta to set
     */
    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    /**
     * @return the tampa
     */
    public boolean isTampa() {
        return tampa;
    }

    /**
     * @param tampa the tampa to set
     */
    public void setTampa(boolean tampa) {
        this.tampa = tampa;
    }

        }
