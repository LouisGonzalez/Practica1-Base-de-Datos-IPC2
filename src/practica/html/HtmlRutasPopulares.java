package practica.html;

/**
 *
 * @author luisGonzalez
 */
public class HtmlRutasPopulares {
    
    public String salida;
    public String fila;
    public String ultimo;
    
    public void generarEncabezado(){
        salida = "<!DOCTYPE html>\n";
        salida += "<html lang ='en'>\n";
        salida += "<head><meta charset='UTF-8'><title>Rutas</title><link rel='stylesheet' href='estilo.css'></head>\n"+"<body>\n";
        salida += "<div id ='main-container'>";
        salida += "<h1>REPORTE RUTAS POPULARES</h1>\n";
        salida += "<table>\n";
        salida += "<thead>\n";
        salida += "<tr>\n";
    }
    
    public void titulos(){
        String[] datos = new String[2];
        datos[0] = "No. Ruta";
        datos[1] = "Paquetes totales";
        for(int i = 0; i < 2; i++){
            salida += "<td><strong>"+datos[i]+"</strong></td>\n";        
        }
        salida += "</tr>\n";
        salida += "</thead>\n";
    }
    
    public void generarTabla(int valor, int valor2){
        fila = "\n<tr>\n";
        fila += "<td>"+valor+"</td>\n";
        fila += "<td>"+valor2+"</td>\n";
        fila += "</tr>\n";
    }
    
    public void parteFinal(){
        ultimo = "</table>";
        ultimo += "</div>";
        ultimo += "</body>";
        ultimo += "</html>";
    }
}
