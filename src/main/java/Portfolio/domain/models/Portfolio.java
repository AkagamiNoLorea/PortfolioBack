package portfolio.domain.models;

import jakarta.persistence.*;

import java.util.Objects;


@Entity
@Table

public class Portfolio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private String descripcion;
    private String img;
    private String lenguaje;
    private String enlace;
    private String despliegue;

    public Portfolio() {
    }

    public Portfolio(Integer id, String nombre, String descripcion, String img, String lenguaje, String enlace, String despliegue) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.img = img;
        this.lenguaje = lenguaje;
        this.enlace = enlace;
        this.despliegue = despliegue;
    }

    public Portfolio(String nombre, String descripcion, String img, String lenguaje, String enlace, String despliegue) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.img = img;
        this.lenguaje = lenguaje;
        this.enlace = enlace;
        this.despliegue = despliegue;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getEnlace() {
        return enlace;
    }

    public void setEnlace(String enlace) {
        this.enlace = enlace;
    }

    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }

    public String getDespliegue() {
        return despliegue;
    }

    public void setDespliegue(String despliegue) {
        this.despliegue = despliegue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Portfolio portfolio = (Portfolio) o;
        return Objects.equals(id, portfolio.id) && Objects.equals(nombre, portfolio.nombre) && Objects.equals(descripcion, portfolio.descripcion) && Objects.equals(img, portfolio.img) && Objects.equals(lenguaje, portfolio.lenguaje) && Objects.equals(enlace, portfolio.enlace) && Objects.equals(despliegue, portfolio.despliegue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, descripcion, img, lenguaje, enlace, despliegue);
    }
}

