import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class ContaBancaria {
    protected Integer numConta;
    protected Double saldo;
    protected Integer senha;
    static int aux=0;
    protected List<Transacoes>extrato = new ArrayList<>();

    Scanner scan = new Scanner(System.in);

    public ContaBancaria() {
    }

    public ContaBancaria(int senha) {
        aux+=1;
        this.numConta = aux;
        this.saldo = 0.0;
        this.senha=senha;
    }

    public Integer getNumConta() {
        return numConta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public Integer getSenha() {
        return senha;
    }

    public void alterarSenha(int senha){
        System.out.print("Digite a senha atual : ");
        int sen = scan.nextInt();
        if(this.senha == sen){
            this.senha=senha;
            System.out.println("Senha alterada com sucesso !");
        }else if (this.senha != sen){
            System.out.println("Senha atual incorreta ! ");
        }
    }



    public abstract boolean sacar(double saque);

    public abstract void extrato();

    public abstract void depositar(double deposito);




}
