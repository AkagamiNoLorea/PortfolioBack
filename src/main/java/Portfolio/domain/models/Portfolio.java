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
    private Integer htmlValue;
    private Integer cssValue;
    private Integer jsValue;
    private Integer javaValue;
    private String frameworksAndLibraries;
    private String enlace;
    private String despliegue;

    public Portfolio() {
    }

    public Portfolio(Integer id, String nombre, String descripcion, String img, Integer htmlValue, Integer cssValue, Integer jsValue, Integer javaValue, String frameworksAndLibraries, String enlace, String despliegue) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.img = img;
        this.htmlValue = htmlValue;
        this.cssValue = cssValue;
        this.jsValue = jsValue;
        this.javaValue = javaValue;
        this.frameworksAndLibraries = frameworksAndLibraries;
        this.enlace = enlace;
        this.despliegue = despliegue;
    }

    public Portfolio(String nombre, String descripcion, String img, Integer htmlValue, Integer cssValue, Integer jsValue, Integer javaValue, String frameworksAndLibraries, String enlace, String despliegue) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.img = img;
        this.htmlValue = htmlValue;
        this.cssValue = cssValue;
        this.jsValue = jsValue;
        this.javaValue = javaValue;
        this.frameworksAndLibraries = frameworksAndLibraries;
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

    public Integer getHtmlValue() {
        return htmlValue;
    }

    public void setHtmlValue(Integer htmlValue) {
        this.htmlValue = htmlValue;
    }

    public Integer getCssValue() {
        return cssValue;
    }

    public void setCssValue(Integer cssValue) {
        this.cssValue = cssValue;
    }

    public Integer getJsValue() {
        return jsValue;
    }

    public void setJsValue(Integer jsValue) {
        this.jsValue = jsValue;
    }

    public Integer getJavaValue() {
        return javaValue;
    }

    public void setJavaValue(Integer javaValue) {
        this.javaValue = javaValue;
    }

    public String getFrameworksAndLibraries() {
        return frameworksAndLibraries;
    }

    public void setFrameworksAndLibraries(String frameworksAndLibraries) {
        this.frameworksAndLibraries = frameworksAndLibraries;
    }

    public String getEnlace() {
        return enlace;
    }

    public void setEnlace(String enlace) {
        this.enlace = enlace;
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
        return Objects.equals(id, portfolio.id) && Objects.equals(nombre, portfolio.nombre) && Objects.equals(descripcion, portfolio.descripcion) && Objects.equals(img, portfolio.img) && Objects.equals(htmlValue, portfolio.htmlValue) && Objects.equals(cssValue, portfolio.cssValue) && Objects.equals(jsValue, portfolio.jsValue) && Objects.equals(javaValue, portfolio.javaValue) && Objects.equals(frameworksAndLibraries, portfolio.frameworksAndLibraries) && Objects.equals(enlace, portfolio.enlace) && Objects.equals(despliegue, portfolio.despliegue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, descripcion, img, htmlValue, cssValue, jsValue, javaValue, frameworksAndLibraries, enlace, despliegue);
    }
}
