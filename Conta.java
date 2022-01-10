class Conta{
   
   
    public Double saldo; // 2.0 3.9
    public String nome; // nome da conta

    // método (função) para setar o saldo
    public void setSaldo(Double valor){
        this.saldo = valor;
    }
    // método (função) para setar o nome
    public String setNome(String usuario){
        this.nome = usuario;
        return usuario;
    }
    
    // método (função) para ver o saldo
    public Double verSaldo(){
        return this.saldo;
    }
    
    // método (função) para depositar valor ao saldo
    public void despositar(Double valor){
        this.saldo = this.saldo + valor;
    
    }

    public void multiplicar(Double valor){
        this.saldo = this.saldo * valor;
    }
    public void subtrair(Double valor){
        this.saldo = this.saldo * valor;
    }
    public static void main(String[] args) {
        // Instansiando a classe Conta, na variável conta
        Conta conta = new Conta();
        conta.setSaldo(0.0);
        String resultado = new String();
        conta.setNome("Blade Rei delas Chavoso");
        // imprimindo o atributo nome do obejto conta
        System.out.println(conta.nome);
        // imprimindo o retorno do método verSaldo do objeto conta
        System.out.println(conta.verSaldo());
        // depositando 6000 no saldo do objeto conta :)
        conta.despositar(6000.0);
        // imprimindo o retorno do método verSaldo do objeto conta
        System.out.println(conta.verSaldo());
        conta.multiplicar(10.0);
        System.out.println(conta.verSaldo());
        conta.subtrair(-1.0);
        System.out.println(conta.verSaldo());


    }

}
