package Ej7;

import java.util.Arrays;

public class Alumno {
	private String nombre;
	private int edad;
	private String[] cursos;

	public Alumno() {

	}

	public Alumno(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
		this.cursos = new String[0];
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

	public String[] getCursos() {
		return cursos;
	}

	public void aniadirCursos(String curso) {
		String[] nuevoArray = new String[cursos.length + 1];

		for (int i = 0; i < this.cursos.length; i++) {
			nuevoArray[i] = this.cursos[i];
		}

		nuevoArray[cursos.length - 1] = curso;

		this.cursos = nuevoArray;
	}

	public void eliminarCurso(String curso) {
		String[] newArray = new String[cursos.length - 1];
		boolean eliminado = false;
		int index = 0;

		for (int i = 0; i < cursos.length; i++) {
			if (cursos[i].equals(curso)) {
				eliminado = true;
				continue;
			}

			if (index < newArray.length) {
				newArray[index] = cursos[i];
				index++;
			}
		}

		this.cursos = newArray;

		// String[] nuevoArray = new String[cursos.length -1];
		// int index = 0;

		// for(int i = 0; i < cursos.length; i++) {
		// if(!cursos[i].equalsIgnoreCase(curso)) {
		// nuevoArray[index] = cursos[i];
		// index++
		// }
		// }
		// this.cursos = nuevoArray;
	}

	@Override
	public String toString() {
		return "Alumno ~~~~ " + "\n" + " Nombre:" + nombre + "\n" + " Edad:" + edad + "\n" + " Cursos: "
				+ Arrays.toString(cursos) + "\n";
	}

}
