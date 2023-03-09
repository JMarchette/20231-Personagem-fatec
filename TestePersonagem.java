public class TestePersonagem 
{
    public static void main(String[] args) throws Exception
    {

        // p é uma variável de referência. Faz referência ao objeto construído com new
       //Personagem p = new Personagem();
       //java 10 em diante (ineferência de tipo)
        var p = new Personagem(2,4,10);
        var p2=new Personagem(8,10,2);

        p.nome = "john";
        while (true)    
        {
            p.cacar();
            Thread.sleep(5000);
            p.comer();
            Thread.sleep(5000);
            p.dormir();
            Thread.sleep(5000);
            p.cacar();
            Thread.sleep(5000);
            p.cacar();
            Thread.sleep(5000);
            p.cacar();
            Thread.sleep(5000);
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
}
