public class TestePersonagem 
{
    public static void main(String[] args)
    {

        // p é uma variável de referência. Faz referência ao objeto construído com new
       //Personagem p = new Personagem();
       //java 10 em diante (ineferência de tipo)
        var p = new Personagem();
        System.out.println(p.energia);
        p.nome = "john";
        // 10, 0, 0, john
        p.cacar();
        p.comer();
        p.dormir();

    }
    /*
        int idade = 18;

        if (idade >= 18)
        {
            System.out.println("Sim pode dirigir");
        }
        else
        {
            System.out.println("Não pode dirigir");
        } */
}
