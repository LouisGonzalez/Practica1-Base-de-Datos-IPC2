package practica.html;

/**
 *
 * @author luisGonzalez
 */
public class HtmlClientes {

    public String salida;
    public String fila;
    public String ultimo;
    
    public HtmlClientes(){
    
    }
    
    public void generarEncabezado(){
        salida = "<html>\n";
        salida += "<head><title>Salida</title></head>\n"+"<body>\n";
        salida += "<h1>ERIK GEI</h1>";
        salida += "<table>\n";
        salida += "<tr>\n";        
    }
    
    public void titulos(){
        String[] datos = new String[7];
        datos[0] = "Nit";
        datos[1] = "Telefono";
        datos[2] = "Paquetes entregados";
        datos[3] = "Paquetes en sistema";
        datos[4] = "Costos";
        datos[5] = "Ingresos";
        datos[6] = "Ganancias";
        for(int i=0; i<7; i++){
            salida += "<td><strong>"+datos[i]+"</strong></td>\n";        
        }
        salida += "</tr>";
    }
    
    public void generarTabla(int valor, int valor2, int valor3, int valor4, int valor5, int valor6, int valor7){
        fila += ""; 
        fila += "<tr>\n";
        fila += "<td>"+valor+"</td>\n";
        fila += "<td>"+valor2+"</td>\n";
        fila += "<td>"+valor3+"</td>\n";
        fila += "<td>"+valor4+"</td>\n";
        fila += "<td>"+valor5+"</td>\n";
        fila += "<td>"+valor6+"</td>\n";
        fila += "<td>"+valor7+"</td>\n";
        fila += "</td>\n";
    }
    
    
    public void parteFinal(){
        ultimo += "</table>";
        ultimo += "</body>";
        ultimo += "</html>";
    }
    
    
}
