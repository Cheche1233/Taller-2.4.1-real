// Entidad que representa el TODO
class CuerpoHumano {
    private Corazon corazon;
    private Pulmon pulmonIzquierdo;
    private Pulmon pulmonDerecho;
    private Higado higado;
    private Apendice apendice;
    private String nombre;
    private int edad;
    private double peso;

    // Constructor
    public CuerpoHumano(Corazon corazon, Pulmon pulmonIzquierdo, Pulmon pulmonDerecho, Higado higado, Apendice apendice, String nombre, int edad, double peso) {
        this.corazon = corazon;
        this.pulmonIzquierdo = pulmonIzquierdo;
        this.pulmonDerecho = pulmonDerecho;
        this.higado = higado;
        this.apendice = apendice;
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }

    // Getters y Setters
    public Corazon getCorazon() {
        return corazon;
    }

    public void setCorazon(Corazon corazon) {
        this.corazon = corazon;
    }

    public Pulmon getPulmonIzquierdo() {
        return pulmonIzquierdo;
    }

    public void setPulmonIzquierdo(Pulmon pulmonIzquierdo) {
        this.pulmonIzquierdo = pulmonIzquierdo;
    }

    public Pulmon getPulmonDerecho() {
        return pulmonDerecho;
    }

    public void setPulmonDerecho(Pulmon pulmonDerecho) {
        this.pulmonDerecho = pulmonDerecho;
    }

    public Higado getHigado() {
        return higado;
    }

    public void setHigado(Higado higado) {
        this.higado = higado;
    }

    public Apendice getApendice() {
        return apendice;
    }

    public void setApendice(Apendice apendice) {
        this.apendice = apendice;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}

// Entidad que representa un componente
class Corazon {
    private int latidosPorMinuto;
    private String tipoSangre;
    private double peso;

    // Constructor
    public Corazon(int latidosPorMinuto, String tipoSangre, double peso) {
        this.latidosPorMinuto = latidosPorMinuto;
        this.tipoSangre = tipoSangre;
        this.peso = peso;
    }

    // Getters y Setters
    public int getLatidosPorMinuto() {
        return latidosPorMinuto;
    }

    public void setLatidosPorMinuto(int latidosPorMinuto) {
        this.latidosPorMinuto = latidosPorMinuto;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}

// Entidad que representa un componente
class Pulmon {
    private double capacidad;
    private String salud;
    private boolean funcional;

    // Constructor
    public Pulmon(double capacidad, String salud, boolean funcional) {
        this.capacidad = capacidad;
        this.salud = salud;
        this.funcional = funcional;
    }

    // Getters y Setters
    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    public String getSalud() {
        return salud;
    }

    public void setSalud(String salud) {
        this.salud = salud;
    }

    public boolean isFuncional() {
        return funcional;
    }

    public void setFuncional(boolean funcional) {
        this.funcional = funcional;
    }
}

// Entidad que representa un componente
class Higado {
    private double peso;
    private String estado;
    private boolean saludable;

    // Constructor
    public Higado(double peso, String estado, boolean saludable) {
        this.peso = peso;
        this.estado = estado;
        this.saludable = saludable;
    }

    // Getters y Setters
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public boolean isSaludable() {
        return saludable;
    }

    public void setSaludable(boolean saludable) {
        this.saludable = saludable;
    }
}

// Entidad que representa un componente
class Apendice {
    private double longitud;
    private boolean inflamado;
    private String estado;

    // Constructor
    public Apendice(double longitud, boolean inflamado, String estado) {
        this.longitud = longitud;
        this.inflamado = inflamado;
        this.estado = estado;
    }

    // Getters y Setters
    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public boolean isInflamado() {
        return inflamado;
    }

    public void setInflamado(boolean inflamado) {
        this.inflamado = inflamado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
