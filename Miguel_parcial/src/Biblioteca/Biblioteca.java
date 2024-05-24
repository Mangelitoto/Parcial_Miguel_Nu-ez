package Biblioteca;

public class Biblioteca {
	  public static void main(String[] args) {
	        // Crear instancias de Alumno y Profesor
	        Alumno alumno1 = new Alumno(123456789, "Miguel Nuñez", "miguelangelalfonso005@gmail.com", "0981245612", 1001);
	        Profesor profesor1 = new Profesor(987654321, "Roberto", "Roberto@example.com", "0971290798", "Programación");

	        // Crear instancias de Libro y RevistaCientifica
	        Libro libro1 = new Libro(101, "Luisa", "Como agua caliente para chocolate", 1999, "Disponible", "NewRecord");
	        RevistaCientifica revista1 = new RevistaCientifica(201, "Lex Luthor", "La Criptonita", 2021, "Prestado", "Ciencia");

	        // Realizar préstamos
	        Prestamo prestamo1 = new Prestamo(libro1, alumno1, "2024-05-24", "2024-06-24");
	        Prestamo prestamo2 = new Prestamo(revista1, profesor1, "2024-05-24", "2024-06-24");

	        // Mostrar información de los préstamos
	        System.out.println("Prestamo 1:\n" + prestamo1 + "\n");
	        System.out.println("Prestamo 2:\n" + prestamo2);	
	  }
}