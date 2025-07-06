package taller1_ejemplos;


// 1. Constructor por defecto
class Clase1 {
    String mensaje;

    public Clase1() {
        mensaje = "Este es un constructor por defecto";
    }

    public void mostrarMensaje() {
        System.out.println(mensaje);
    }
}

// 2. Constructor con parámetros
class Clase2 {
    String nombre;

    public Clase2(String nombre) {
        this.nombre = nombre;
    }

    public void saludar() {
        System.out.println("Hola, " + nombre);
    }
}

// 3. Sobrecarga de constructores
class Clase3 {
    String texto;
    int numero;

    public Clase3() {
        texto = "Texto por defecto";
        numero = 0;
    }

    public Clase3(String texto) {
        this.texto = texto;
        numero = 0;
    }

    public Clase3(String texto, int numero) {
        this.texto = texto;
        this.numero = numero;
    }

    public void mostrar() {
        System.out.println("Texto: " + texto + ", Número: " + numero);
    }
}

// 4. Uso de this() para llamar a otro constructor
class Clase4 {
    int a, b;

    public Clase4() {
        this(5, 10); // llama al constructor con parámetros
        System.out.println("Constructor por defecto");
    }

    public Clase4(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("Constructor con parámetros");
    }
}

// 5. Uso de super() para invocar constructor de clase padre
class Animal {
    public Animal() {
        System.out.println("Constructor de la clase Animal");
    }
}

class Clase5 extends Animal {
    public Clase5() {
        super();
        System.out.println("Constructor de la clase Clase5");
    }
}

// Clase principal que ejecuta todos los ejemplos
public class EjemploConstructores {
    public static void main(String[] args) {
        System.out.println("---- Ejemplo 1: Constructor por defecto ----");
        Clase1 obj1 = new Clase1();
        obj1.mostrarMensaje();

        System.out.println("\n---- Ejemplo 2: Constructor con parámetros ----");
        Clase2 obj2 = new Clase2("Emiro");
        obj2.saludar();

        System.out.println("\n---- Ejemplo 3: Sobrecarga de constructores ----");
        Clase3 obj3a = new Clase3();
        Clase3 obj3b = new Clase3("Hola");
        Clase3 obj3c = new Clase3("Hola", 7);
        obj3a.mostrar();
        obj3b.mostrar();
        obj3c.mostrar();

        System.out.println("\n---- Ejemplo 4: Uso de this() ----");
        Clase4 obj4 = new Clase4();
        System.out.println("a = " + obj4.a + ", b = " + obj4.b);

        System.out.println("\n---- Ejemplo 5: Uso de super() ----");
    }
}