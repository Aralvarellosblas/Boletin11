package ejercicio11;
/*
 * @author Arturo
 */
public class Masaxista extends Persoa{
    private String titulacion;
    private int anosExperiencia;

    public Masaxista(String titulacion, int anosExperiencia, int id, int idade, String nome, String apelido){
        super(id, idade, nome, apelido);
        this.titulacion=titulacion;
        this.anosExperiencia=anosExperiencia;
    }

    public String getTitulacion(){
        return titulacion;
    }

    public void setTitulacion(String titulacion){
        this.titulacion=titulacion;
    }

    public int getAnosExperiencia(){
        return anosExperiencia;
    }

    public void setAnosExperiencia(int anosExperiencia){
        this.anosExperiencia=anosExperiencia;
    }
    
    public void darMasaxes(){
        
    }
    @Override
    public void viaxar(){
        System.out.println("Viaxa o Masaxista");
    }
    
    @Override
    public String toString(){
        return("Masaxista:\n"+super.toString()+"\nTitulación: "+titulacion+"\nAnos Experiencia: "+anosExperiencia+"\n");
    }
}
