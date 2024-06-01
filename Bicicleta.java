// Entidad que representa el TODO
class Bicicleta {
    private Rueda ruedaDelantera;
    private Rueda ruedaTrasera;
    private Cuadro cuadro;
    private String marca;
    private String modelo;
    private double peso;

    // Constructor
    public Bicicleta(Rueda ruedaDelantera, Rueda ruedaTrasera, Cuadro cuadro, String marca, String modelo, double peso) {
        this.ruedaDelantera = ruedaDelantera;
        this.ruedaTrasera = ruedaTrasera;
        this.cuadro = cuadro;
        this.marca = marca;
        this.modelo = modelo;
        this.peso = peso;
    }

    // Getters y Setters
    public Rueda getRuedaDelantera() {
        return ruedaDelantera;
    }

    public void setRuedaDelantera(Rueda ruedaDelantera) {
        this.ruedaDelantera = ruedaDelantera;
    }

    public Rueda getRuedaTrasera() {
        return ruedaTrasera;
    }

    public void setRuedaTrasera(Rueda ruedaTrasera) {
        this.ruedaTrasera = ruedaTrasera;
    }

    public Cuadro getCuadro() {
        return cuadro;
    }

    public void setCuadro(Cuadro cuadro) {
        this.cuadro = cuadro;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}

// Entidad que representa un componente
class Rueda {
    private double diametro;
    private String tipo;
    private String material;

    // Constructor
    public Rueda(double diametro, String tipo, String material) {
        this.diametro = diametro;
        this.tipo = tipo;
        this.material = material;
    }

    // Getters y Setters
    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}

// Entidad que representa un componente
class Cuadro {
    private String material;
    private double altura;
    private double peso;

    // Constructor
    public Cuadro(String material, double altura, double peso) {
        this.material = material;
        this.altura = altura;
        this.peso = peso;
    }

    // Getters y Setters
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
