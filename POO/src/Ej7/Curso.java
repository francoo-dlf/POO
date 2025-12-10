package Ej7;

import java.util.ArrayList;

public class Curso {
	private String titulo;
	private String descripcion;
	private String profesor;
	private ArrayList<Alumno> alumnos;
	
	public Curso() {
		this.alumnos = new ArrayList<>();
	}
	
	public Curso(String titulo, String descripcion, String profesor, ArrayList<Alumno> alumnos) {
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.profesor = profesor;
		this.alumnos = new ArrayList<>();
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getProfesor() {
		return profesor;
	}

	public void setProfesor(String profesor) {
		this.profesor = profesor;
	}

	public ArrayList<Alumno> getAlumnos() {
		return alumnos;
	}

	public void agregarAlumno(Alumno alumno) {
		this.alumnos.add(alumno);
	}
	
	public boolean eliminarAlumno(Alumno alumno) {
		return this.alumnos.remove(alumno);
	}

	@Override
	public String toString() {
		return "Curso ~~~~ " + "\n" +
				" Titulo: " + titulo + "\n" +
				" Descripcion: " + descripcion + "\n" +
				" Profesor: " + profesor + "\n" +
				" Alumnos: [ " + alumnos + " ]" + "\n";
	}
	
	
}
