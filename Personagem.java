import java.net.Socket;

public class Personagem
{
    //variáveis de instância
    String nome;
    int fome;
    int sono;
    int energia;

    // método de instância caçar
    void cacar()
    {
        System.out.println(nome + " caçando");
    }

    // método de instância comer
    void comer()
    {
        System.out.print(fome + " comendo\n");
    }

    // método de instância dormir
    void dormir()
    {
        System.out.printf("%s dormindo%n", nome);
    }

    
}