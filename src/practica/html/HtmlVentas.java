package practica.html;

/**
 *
 * @author luisGonzalez
 */
public class HtmlVentas {
    
    public String salida;
    public String fila;
    public String ultimo;
    
    public void generarEncabezado(){
        salida = "<!DOCTYPE html>\n";
        salida += "<html lang='en'>\n";
        salida += "<head><meta charset='UTF-8'><title>Ventas</title><link rel='stylesheet' href='estilo.css'></head>\n"+"<body>\n";
        salida += "<div id = 'main-container'>";
        salida += "<h1>REPORTE VENTAS</h1>\n";
        salida += "<table>\n";
        salida += "<thead>\n";
        salida += "<tr>\n";
    }
    
    public void titulos(){
        String datos[] = new String[4];
        datos[0] = "Id";
        datos[1] = "Nit";
        datos[2] = "No. Paquetes";
        datos[3] = "Total";
        for(int i = 0; i < 4; i++){
            salida += "<td><strong>"+datos[i]+"</strong></td>\n";
        }
        salida += "</tr>\n";
        salida += "</thead>\n";
    }
    
    public void generarTabla(int valor, int valor2, int valor3, int valor4){
        fila = "\n<tr>\n";
        fila += "<td>"+valor+"</td>\n";
        fila += "<td>"+valor2+"</td>\n";
        fila += "<td>"+valor3+"</td>\n";
        fila += "<td>"+valor4+"</td>\n";
        fila += "</tr>\n";
    }
    
    public void parteFinal(){
        ultimo = "</table>\n";
        ultimo = "</div>\n";
        ultimo += "</body>\n";
        ultimo += "</html>\n";
    }
}
