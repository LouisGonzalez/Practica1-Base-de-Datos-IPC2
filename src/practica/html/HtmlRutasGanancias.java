package practica.html;

/**
 *
 * @author luisGonzalez
 */
public class HtmlRutasGanancias {
    
    public String salida;
    public String fila;
    public String ultimo;
    
    public void generarEncabezado(){
        salida = "<!DOCTYPE html>\n";
        salida += "<html lang ='en'>\n";
        salida += "<head><meta charset='UTF-8'><title>Ganancias</title><link rel='stylesheet' href='estilo.css'></head>\n"+"<body>\n";
        salida += "<div id ='main-container'>";
        salida += "<h1>REPORTE RUTAS (Ganancias)</h1>";
        salida += "<table>\n";
        salida += "<thead>\n";
        salida += "<tr>\n";
    }
    
    public void titulos(){
        String[] datos = new String[5];
        datos[0] = "Id";
        datos[1] = "Destino";
        datos[2] = "Costos";
        datos[3] = "Ingresos";
        datos[4] = "Ganancias";
        for(int i = 0; i < 5; i++){
            salida += "<td><strong>"+datos[i]+"</strong></td>\n";
        }
        salida += "</tr>\n";
        salida += "</thead>\n";
    }
    
    public void generarTabla(int valor, String valor2, int valor3, int valor4, int valor5){
        fila = "\n<tr>\n";
        fila += "<td>"+valor+"</td>\n";
        fila += "<td>"+valor2+"</td>\n";
        fila += "<td>"+valor3+"</td>\n";
        fila += "<td>"+valor4+"</td>\n";    
        fila += "<td>"+valor5+"</td>\n";
        fila += "</tr>\n";
    }
    
    public void parteFinal(){
        ultimo = "</table>";
        ultimo += "</div>";
        ultimo += "</body>";
        ultimo += "</html>";
    }
}
