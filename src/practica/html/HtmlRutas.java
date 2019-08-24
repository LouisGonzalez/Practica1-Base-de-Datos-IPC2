package practica.html;

/**
 *
 * @author luisGonzalez
 */
public class HtmlRutas {

    public String salida;
    public String fila;
    public String ultimo;
    
    public void generarEncabezado(){
        salida = "<!DOCTYPE html>\n";
        salida += "<html lang ='en'>\n";
        salida += "<head><meta charset='UTF-8'><title>Rutas</title><link rel='stylesheet' href='estilo.css'></head>\n"+"<body>\n";
        salida += "<div id ='main-container'>\n";
        salida += "<h1>REPORTE RUTAS</h1>\n";
        salida += "<table>\n";
        salida += "<thead>\n";
        salida += "<tr>\n";
    }
    
    public void titulos(){
        String[] datos = new String[6];
        datos[0] = "Id";
        datos[1] = "No. Puntos de control";
        datos[2] = "Destino";
        datos[3] = "Estado";
        datos[4] = "Paquetes en Sistema";
        datos[5] = "Paquetes entregados";
        for(int i = 0; i < 6; i++){
            salida += "<td><strong>"+datos[i]+"</strong></td>\n";
        }
        salida += "</tr>\n";
        salida += "</thead>\n";
    }
    
    public void generarTabla(int valor, int valor2, String valor3, String valor4, int valor5, int valor6){
        fila = "\n<tr>\n";
        fila += "<td>"+valor+"</td>\n";
        fila += "<td>"+valor2+"</td>\n";
        fila += "<td>"+valor3+"</td>\n";
        fila += "<td>"+valor4+"</td>\n";
        fila += "<td>"+valor5+"</td>\n";
        fila += "<td>"+valor6+"</td>\n";
        fila += "</tr>\n";
    }
    
    public void parteFinal(){
        ultimo = "</table>";
        ultimo += "</div>";
        ultimo += "</body>";
        ultimo += "</html>";
    }
}
