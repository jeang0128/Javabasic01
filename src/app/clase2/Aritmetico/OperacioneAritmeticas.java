
package app.clase2.Aritmetico;


public class OperacioneAritmeticas {
    
    public OperacioneAritmeticas() {
}
    public double suma(double a, double b){
    double resultado = a + b;
    return resultado;
} 
    int max(int a, int b) {
    int mayor = a;
    if (a > b) {
    mayor = a;
    } else if (a == b) {
    mayor = 0; //por ser iguales
    } else {
    mayor = b;
    }
    return mayor;
    }
    float max(float a, float b) {
    float mayor = a;
    if (a > b) {
    mayor = a;
    } else if (a == b) {
    mayor = 0; //por ser iguales
    } else {
    mayor = b;
    }
    return mayor;
    }
    
   }
