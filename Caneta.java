public class Caneta{
    public String corCaneta;
    public String corTampa;

    public void setCorcaneta(String cor){
       this.corCaneta = cor;
       System.out.println("Setando a cor da caneta para: "+cor);

    }

    public String setcorTampa(String cor){
        this.corTampa = cor;
        return ("Setando a cor da Tampa para: "+cor);


    }
    
    public void alterCorcaneta(String novaCor){
        String corAnterior = this.corCaneta;
        this.corCaneta = novaCor;
        System.out.println("Alterando a cor da caneta de :"+corAnterior+"para: "+novaCor);
    }

    public void alterCorTampa(String novaCor){
        String corAnterior = this.corCaneta;
        this.corTampa = novaCor;
        System.out.println("Alterando a cor da tampa da caneta de :"+corAnterior+"para: "+novaCor);
    }

    
    public static void main(String[] args){
        Caneta bic = new Caneta();
        bic.setCorcaneta("azul");
        String resultado = bic.setcorTampa("azul");
        System.out.println(resultado);
        bic.alterCorcaneta("Vermelho");
        bic.alterCorTampa("Preto");



    }
}