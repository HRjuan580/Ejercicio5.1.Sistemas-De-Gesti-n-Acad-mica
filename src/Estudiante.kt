class Estudiante(nombre: String, edad: Int, id: String, val curso: String, val calificacionPromedio: Double) : Persona(nombre, edad, id) {
    override fun mostrarRol() {
        println("Rol: Estudiante")
    }

    fun mostrarCalificacion() {
        println("Calificación promedio: $calificacionPromedio")
    }
}