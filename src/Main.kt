fun main() {
    val estudiante = Estudiante("Juan Pérez", 20, "E001", "Matemáticas", 8.5)
    val profesor = Profesor("Ana Gómez", 35, "P001", "Informática", 10)

    estudiante.mostrarRol()
    println("Nombre: ${estudiante.nombre}, Edad: ${estudiante.edad}, ID: ${estudiante.id}, Curso: ${estudiante.curso}")
    estudiante.mostrarCalificacion()

    println()

    profesor.mostrarRol()
    println("Nombre: ${profesor.nombre}, Edad: ${profesor.edad}, ID: ${profesor.id}, Departamento: ${profesor.departamento}")
    profesor.mostrarExperiencia()
}