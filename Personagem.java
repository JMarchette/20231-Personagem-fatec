import static java.lang.Math.min;

public class Personagem
{
    // A verde= adicionado/pronto para commit
    // ?? vermelho = untracked
    //variáveis de instância
    String nome;
    int energia = 10;
    int fome = 0;
    int sono = 0;

    // método de instância caçar
    void cacar()
    {
        if (energia >= 2)
        {
            System.out.println(nome + " cacando");
            energia = energia -2;
        }
        else 
        {
            System.out.println(nome + " sem energia para cacar");
        }
        fome = min(fome + 1, 10);
        sono = min(sono + 1, 10);
        
    }

    // método de instância comer
    void comer()
    {
        if (fome >= 1)
        {
            System.out.printf(nome + " comendo\n");
            energia = min (energia + 1, 10);
            fome = fome - 1;
        }
        else
        {
            System.out.println(nome + " sem fome");
        }
    }

    // método de instância dormir
    void dormir()
    {
        if (sono >= 1)
        {
            System.out.printf("%s dormindo%n", nome);
            energia = energia + 1 < 10 ? energia + 1 : 10; // senao = :
            sono--;
        }
        else 
        {
            System.out.println(nome + " sem sono");
        }
    }


}