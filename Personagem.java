import static java.lang.Math.min;

public class Personagem
{
    // A verde= adicionado/pronto para commit
    // ?? vermelho = untracked
    //variáveis de instância
    String nome;
     private int energia = 10;
     private int fome = 0;
     private int sono = 0;
 
    Personagem(int energia,int fome,int sono)
    {
        if(energia>=0&& energia<=10)
            this.energia = energia;
        if(fome>=0&& fome<=10)
            this.fome=fome;
        if(sono>=0&& sono<=10)
            this.sono=sono;

    //shadowing(sombreamento)

        System.out.println("construindo um objeto.");
    }

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
        System.out.println(obterEstado());
        
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
        System.out.println(obterEstado());
    
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
    
    String obterEstado()
    {
        return String.format("e(%d),s(%d),f(%d)",energia,sono,fome);
    }
}