public class Tabla
{
    private char[][] plano; 
    private int cantHorizontales; 
    private int cantVerticales;
    
    public Tabla(char[][] plano){
        this.plano = plano; 
    }
    
    public String contarTablar(){
        String res = ""; 
        
        contarHorizontales(); 
        contarVerticales(); 
        int total = cantHorizontales + cantVerticales; 
        res = "Verticales: " + cantVerticales + " Horizontales: " + cantHorizontales + " Total: " + total; 
        
        return res; 
    }
    
    public void contarHorizontales(){
        boolean enUnaMadera = false; 
        
        for(int i = 0; i < plano.length; i++){
            for(int j = 0; j < plano[0].length; j++){
                char valor = plano [i][j];
                if(valor == '-'){
                    if(enUnaMadera != true){
                        enUnaMadera = true; 
                    }
                }else{
                    if(enUnaMadera == true){
                        enUnaMadera = false; 
                        cantHorizontales ++;
                    }
                }
            }
            if(enUnaMadera == true){
                enUnaMadera = false; 
                cantHorizontales++; 
            }
        }
    }
    
    public void contarVerticales(){
        boolean enUnaMadera = false; 
        
        for(int i = 0; i < plano[0].length; i++){
            for(int j = 0; j < plano.length; j++){
                char valor = plano [j][i];
                if(valor == '|'){
                    if(enUnaMadera == false){
                        enUnaMadera = true; 
                    }
                }else{
                    if(enUnaMadera == true){
                        enUnaMadera = false; 
                        cantVerticales++; 
                    }
                }
            }
            if(enUnaMadera == true){
                enUnaMadera = false; 
                cantVerticales++; 
            }
        }
    }
}
