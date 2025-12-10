package Ej7;

import java.util.ArrayList;
import java.util.Scanner;

public class GestionAPP {
	public static void main(String[] args) {
		ArrayList<Alumno> alumnosList = new ArrayList<Alumno>();
		ArrayList<Curso> cursosList = new ArrayList<Curso>();
		int option;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("~~~~MENU~~~~");
			System.out.println("1. Crear nuevo alumno");
			System.out.println("2. Crear nuevo curso");
			System.out.println("3. Editar alumno");
			System.out.println("4. Editar curso");
			System.out.println("5. Eliminar alumno");
			System.out.println("6. Eliminar curso");
			System.out.println("7. Mostrar info alumno");
			System.out.println("8. Mostrar info curso");
			System.out.println("9. Salir");
			option = Integer.parseInt(sc.nextLine());

			switch (option) {
			case 1:
				crearAlumno(alumnosList, sc, cursosList);
				break;
			case 2:
				crearCurso(alumnosList, sc, cursosList);
				break;
			case 3:
			case 4:
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:
			default:
			}
		} while (option != 9);
	}

	// METHODS
	// Option 1
	public static void crearAlumno(ArrayList<Alumno> alumnosList, Scanner sc, ArrayList<Curso> cursosList) {
		// variables
		String nombre;
		int edad = 0;
		String curso;
		boolean repetido = false;
		boolean edadinv = false;
		boolean existe = false;

		// comprobar que existan cursos
		if (cursosList.isEmpty()) {
			// si el arrayList esta vacio, vuelve al menu para crear un curso
			System.out.println("No existen cursos todavia, cree uno");
			return;
		}

		// si existen, pedimos los datos para crear un alumno
		// verificamos que el nombre no exista
		do {
			repetido = false;
			System.out.println("Ingrese su nombre");
			nombre = sc.nextLine();

			for (int i = 0; i < alumnosList.size(); i++) {
				if (alumnosList.get(i).getNombre().equalsIgnoreCase(nombre)) {
					System.out.println("Ese nombre ya existe");
					repetido = true;
					break;
				}
			}
		} while (repetido);

		// verificamos que la edad sea un valor valido
		do {
			edadinv = false;
			System.out.println("Ingrese su edad");
			edad = sc.nextInt();
			sc.nextLine();

			if (edad <= 0) {
				System.out.println("Ingrese una edad valida");
				edadinv = true;
			}
		} while (edadinv);

		// mostramos los cursos para que elija uno
		do {
			existe = false;
			System.out.println("Cursos Disponibles: ");
			for (int i = 0; i < cursosList.size(); i++) {
				System.out.println("o " + cursosList.get(i).getTitulo());
			}

			System.out.println("\nElija un curso");
			curso = sc.nextLine();

			for (int i = 0; i < cursosList.size(); i++) {
				if (cursosList.get(i).getTitulo().equalsIgnoreCase(curso)) {
					curso = cursosList.get(i).getTitulo();
					existe = true;
					break;
				}
			}

			if (!existe) {
				System.out.println("El curso no existe");
			}
		} while (!existe);

		// guardamos los datos en el constructor
		Alumno alumno = new Alumno(nombre, edad);
		alumno.aniadirCursos(curso);
		alumnosList.add(alumno);
	}

	// Option 2
	public static void crearCurso(ArrayList<Alumno> alumnosList, Scanner sc, ArrayList<Curso> cursosList) {
		// variables
		String titulo;
		String descripcion;
		String profesor;

		for (int i = 0; i < alumnosList.size(); i++) {

		}
	}

}
