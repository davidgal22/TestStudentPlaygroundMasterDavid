package edu.iesam.student_playground_master_david.features.students.domain

/**
 * Importante: por constructor la interfaz (abstraccion)
 */
class GetStudentsUseCase (private val studentRepository: StudentRepository){
    operator  fun invoke(): List<Student>{
        return     studentRepository.findAll()

    }
}