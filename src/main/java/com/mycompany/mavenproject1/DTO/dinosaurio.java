
package com.mycompany.mavenproject1.DTO;

public class dinosaurio {
    
    private String Nombre;
    private boolean tiene_cola;
    private int Edad;

    public dinosaurio(String Nombre, boolean tiene_cola, int Edad) {
        this.Nombre = Nombre;
        this.tiene_cola = tiene_cola;
        this.Edad = Edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public boolean isTiene_cola() {
        return tiene_cola;
    }

    public void setTiene_cola(boolean tiene_cola) {
        this.tiene_cola = tiene_cola;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
    
    
    
    
}
