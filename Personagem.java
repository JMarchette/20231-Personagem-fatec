import java.net.Socket;

public class Personagem
{
    // A verde= adicionado/pronto para commit
    // ?? vermelho = untracked
    //variáveis de instância
    String nome;
    int energia;
    int fome;
    int sono;

    // método de instância caçar
    void cacar()
    {
        System.out.println(nome + " cacando");
    }

    // método de instância comer
    void comer()
    {
        System.out.printf(nome + " comendo\n");
    }

    // método de instância dormir
    void dormir()
    {
        System.out.printf("%s dormindo%n", nome);
    }


}