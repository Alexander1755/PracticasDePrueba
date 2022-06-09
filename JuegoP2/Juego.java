
public class Juego
{
    private int rangoMinimo; 
    private int rangoMaximo; 
    private int numeroIntentosPermitidos; 
    private int numeroSecreto; 
    
    public Juego(int rangoMinimo, int rangoMaximo, int intentos){
        this.rangoMinimo = rangoMinimo; 
        this.rangoMaximo = rangoMaximo; 
        this.numeroIntentosPermitidos = intentos; 
        calcularNumeroSecreto(); 
    }
    
    private void calcularNumeroSecreto(){
        numeroSecreto = (int)(Math.random() * (rangoMaximo - rangoMinimo) + rangoMinimo);
    }
    
    public String jugar(int numero){
        String respuesta = ""; 
        
        double porcentajeError = (numero - numeroSecreto)/(double)(rangoMaximo - rangoMinimo) * 100.0;
        porcentajeError = Math.abs(porcentajeError);
        
        if(numeroIntentosPermitidos > 0){
            if(numeroSecreto == numero){
                respuesta = "Ganaste"; 
            }else if(porcentajeError > 30){
                respuesta = "Frio"; 
            }else if(porcentajeError > 10 && porcentajeError <= 30){
                respuesta = "Tibio";
            }else{
                respuesta = "Caliente"; 
            }
            numeroIntentosPermitidos--; 
        }else{
            respuesta = "Perdiste el juego"; 
        }
        return respuesta; 
    }
}
