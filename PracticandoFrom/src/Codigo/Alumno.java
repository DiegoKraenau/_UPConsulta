package Codigo;

public class Alumno {
private String nombre;
private int edad;
private int a�o;
private String colegio;
private String codigo;

public Alumno() {
	this.nombre="";
	this.edad=0;
	this.a�o=0;
	this.colegio="";
	this.codigo="";
}

public  Alumno(String nombre,int edad,int a�o,String colegio,String codigo) {
	this.nombre=nombre;
	this.edad=edad;
	this.a�o=a�o;
	this.colegio=colegio;
	this.codigo=codigo;
}

public void setNombre(String nombre) {
	this.nombre=nombre;
}

public void setEdad(int edad) {
	this.edad=edad;
}

public void setA�o(int a�o) {
	this.a�o=a�o;
}

public void setColegio(String colegio) {
	this.colegio=colegio;
}

public String getNombre() {
	return nombre;
}

public int geteEdad() {
	return edad;
}

public int getA�o() {
	return a�o;
}

public String getColegio() {
	return colegio;
}

public void setCodigo(String codigo) {
	this.codigo=codigo;
}

public String getCodigo() {
	return codigo;
}

}
