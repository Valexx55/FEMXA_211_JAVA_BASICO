package edu.femxa.val;

public class QueHace { 
	 
    int a;// por estar declarada aquí, fuera de cualquier método; a es un 
            // atributo de la clase. Por lo tanto, es accesible y visible desde 
            // todos los métodos de la clase 
 
    void metodo() { 
        System.out.println(this.a); 
        this.a++; // equivalente --> a = a + 1; 
    } 
 
    public static void main(String args[]) { 
        QueHace qh1 = null; 
        QueHace qh2 = null; 
 
        qh1 = new QueHace(); 
 
        qh1.metodo(); 
        qh1.metodo(); 
        qh1.a = 33; 
        qh1.metodo(); 
        System.out.println(qh1.a);
        qh2 = qh1;
        qh2.metodo(); 
        qh1.metodo();
        if (qh1 == qh2)
        {
        	System.out.println("QH1 es igual a QH2");
        } else
        {
        	System.out.println("QH1 NO es igual a QH2");
        }
 
    } 
 
}