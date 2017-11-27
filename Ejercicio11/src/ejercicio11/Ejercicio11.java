package ejercicio11;
/*
 * @author Arturo
 */
public class Ejercicio11 {

    public static void main(String[] args) {
        //Creamos un obxeto de cada tipo
        Persoa Per1=new Persoa(6532, 30, "Daniel", "Suarez");
        Persoa Xog1=new Xogador(11, "Delantero", 7896, 22, "Pedro", "Jimenez");
        Persoa Ad1=new Adestrador(4123, 4562, 45,"Raul", "Rodriguez");
        /*Os obxetos poden ser creados a través da superclase, como os ateriores 
        ou como o seguinte, a través da propia clase*/
        Masaxista Mas1=new Masaxista("Doctor", 20, 8523, 36, "Luis", "Sanchez");
        //Mostramos a información de todos
        System.out.println(Xog1.toString());
        System.out.println(Ad1.toString());
        System.out.println(Mas1.toString());
        System.out.println(Per1.toString());
        //Chamamos ao metodo concentrarse dende todas as clases
        Per1.concentrarse();
        Xog1.concentrarse();
        Ad1.concentrarse();
        Mas1.concentrarse();
        //Chamamos ao metodo viaxar de cada clase
        Per1.viaxar();
        Xog1.viaxar();
        Ad1.viaxar();
        Mas1.viaxar();
        
        System.out.println(Xog1.getNome()); //Podese chamar a un metodo da superclase dende a subclase
        //Per1.darMasaxes();   //Non se pode chamar a un método da subclase a través da superclase
    }

}
