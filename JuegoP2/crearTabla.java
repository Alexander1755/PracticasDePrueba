public class crearTabla
{
    public char[][] generarTabla(){
        char[][] tabla; 
        int filas = (int)(Math.random()*10 + 1);
        int columnas = (int)(Math.random()*10 + 1);
        tabla = new char[filas][columnas]; 
        for(int f = 0; f < tabla.length; f++){
            for(int c = 0; c < tabla[0].length; c++){
                int aux = (int)(Math.random()*2 +1); 
                if(aux <= 1){
                    tabla[f][c] = '-';
                }else{
                    tabla[f][c] = '|';
                }
            }
        }
        String reporte = ""; 
        for(int f = 0; f < tabla.length; f++){
            for(int c = 0; c < tabla[0].length; c++){
                reporte += tabla[f][c] + " "; 
            }
            reporte += "\n";
        }
        System.out.println(reporte);
        return tabla;
    }
}
