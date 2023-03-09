public class TestePersonagem 
{
    public static void main(String[] args)
    {
        // p é uma variável de referência. Faz referência ao objeto construído com new
       //Personagem p = new Personagem();
       //java 10 em diante (ineferência de tipo)
        var p = new Personagem();
        p.nome = "john";
        p.cacar();
        

    }
}
