package ejercicio11;
/*
 * @author Arturo
 */
public class Xogador extends Persoa{
    private int dorsal;
    private String demarcacion;

    public Xogador(int dorsal, String demarcacion, int id, int idade, String nome, String apelido){
        super(id, idade, nome, apelido);
        this.dorsal=dorsal;
        this.demarcacion=demarcacion;
    }

    public int getDorsal(){
        return dorsal;
    }

    public void setDorsal(int dorsal){
        this.dorsal=dorsal;
    }

    public String getDemarcacion(){
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion){
        this.demarcacion=demarcacion;
    }
    
    
    public void xogarPartido(){
        
    }
    
    public void entrenar(){
        
    }
    
    @Override
    public void viaxar(){
        System.out.println("Viaxan os Xogadores");
    }

    @Override
    public String toString(){
        return ("Xogador:\n"+super.toString()+"\nDorsal: "+dorsal+"\nDemarcacion: "+demarcacion+"\n");
    }
}
