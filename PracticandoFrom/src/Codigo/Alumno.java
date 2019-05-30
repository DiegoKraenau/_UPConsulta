package Codigo;

public class Alumno {
private String nombre;
private int edad;
private int año;
private String colegio;
private String codigo;

public Alumno() {
	this.nombre="";
	this.edad=0;
	this.año=0;
	this.colegio="";
	this.codigo="";
}

public  Alumno(String nombre,int edad,int año,String colegio,String codigo) {
	this.nombre=nombre;
	this.edad=edad;
	this.año=año;
	this.colegio=colegio;
	this.codigo=codigo;
}

public void setNombre(String nombre) {
	this.nombre=nombre;
}

public void setEdad(int edad) {
	this.edad=edad;
}

public void setAño(int año) {
	this.año=año;
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

public int getAño() {
	return año;
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
