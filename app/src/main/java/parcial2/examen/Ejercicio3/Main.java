package parcial2.examen.Ejercicio3;

public class Main {
    public static void main (String [] args){
        PaginaWeb paginaWeb = new PaginaWeb();

        Usuario usuario1 = new Usuario("Angel");
        Usuario usuario2 = new Usuario("Gabriel");
        Usuario usuario3 = new Usuario("Batistuta");
        Usuario usuario4 = new Usuario("Omar");
        Usuario usuario5 = new Usuario("Riquelme");

        paginaWeb.subscribirUsuario(usuario1, TipoNotificacion.IMAGENES);
        
        paginaWeb.subscribirUsuario(usuario2, TipoNotificacion.VIDEOS);

        paginaWeb.subscribirUsuario(usuario3, TipoNotificacion.VIDEOS);
        paginaWeb.subscribirUsuario(usuario3, TipoNotificacion.IMAGENES);

        paginaWeb.subscribirUsuario(usuario4, TipoNotificacion.VIDEOS);
        paginaWeb.subscribirUsuario(usuario4, TipoNotificacion.IMAGENES);

        paginaWeb.subscribirUsuario(usuario5, TipoNotificacion.VIDEOS);



        paginaWeb.notifyObservers("German ha subido un video", TipoNotificacion.VIDEOS);
        paginaWeb.notifyObservers("Tu crush ha subido su foto", TipoNotificacion.IMAGENES);
        paginaWeb.notifyObservers("TOP 5 speendrunners", TipoNotificacion.VIDEOS);


    }
}
