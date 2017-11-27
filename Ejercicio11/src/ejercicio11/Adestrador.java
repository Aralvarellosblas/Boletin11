package ejercicio11;
/*
 * @author Arturo
 */
public class Adestrador extends Persoa{
    private int idFederacion;

    public Adestrador(int idFederacion, int id, int idade, String nome, String apelido){
        super(id, idade, nome, apelido);
        this.idFederacion=idFederacion;
    }

    public int getIdFederacion(){
        return idFederacion;
    }

    public void setIdFederacion(int idFederacion){
        this.idFederacion=idFederacion;
    }
    
    public void dirixirPartido(){
        
    }
    
    public void dirixirAdestramento(){
        
    }
    
    @Override
    public void viaxar(){
        System.out.println("Viaxa o Entrenador");
    }
    
    @Override
    public String toString(){
        return ("Adestrador:\n"+super.toString()+"\nId Federación: "+idFederacion+"\n");
    }
}
