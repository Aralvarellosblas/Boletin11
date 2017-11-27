package ejercicio11;
/*
 * @author Arturo
 */
public class Persoa {
    private int id, idade;
    private String nome, apelido;
    
    public Persoa(){
        
    }

    public Persoa(int id, int idade, String nome, String apelido){
        this.id=id;
        this.idade=idade;
        this.nome=nome;
        this.apelido=apelido;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id=id;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade=idade;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome=nome;
    }

    public String getApelido(){
        return apelido;
    }

    public void setApelido(String apelido){
        this.apelido=apelido;
    }
    
    public void concentrarse(){
        System.out.println("Concentrase a selección");
    }
    
    public void viaxar(){
        System.out.println("Viaxa a selección");
    }

    @Override
    public String toString(){
        return ("Id: " + id + "\nIdade: " + idade + "\nNome: " + nome + "\nApelido: " + apelido);
    }
    
}
