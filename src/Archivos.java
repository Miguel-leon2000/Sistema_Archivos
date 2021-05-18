import java.io.File;

public class Archivos {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";

    public static void main(String[] args) {
        //Carpeta del usuario
        String sCarpAct = System.getProperty("user.dir");
        System.out.println("Carpeta del usuario = " + sCarpAct);

        //Listemos todas las carpetas y archivos de la carpeta actual
        System.out.println(ANSI_RED + "//// LISTADO SIMPLE" + ANSI_RESET);

        File carpeta = new File(sCarpAct);
        String[] listado = carpeta.list();
        if (listado == null || listado.length == 0) {
            System.out.println("No hay elementos dentro de la carpeta actual");
            return;
        }
        else {
            for (int i=0; i< listado.length; i++) {
                System.out.println(listado[i]);
            }
        }
        
    }
}

