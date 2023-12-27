package com.dana.menalingo.services;

import com.dana.menalingo.dto.StudentDto;

import com.dana.menalingo.entities.Student;
import com.dana.menalingo.mappers.StudentMapper;
import com.dana.menalingo.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;
    private final StudentMapper studentMapper;

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository, StudentMapper studentMapper) {
        this.studentRepository = studentRepository;
        this.studentMapper = studentMapper;
    }

    @Override
    public List<StudentDto> getAllStudents() {
        return studentRepository.findAll().stream()
                .map(studentMapper::studentToStudentDto)
                .collect(Collectors.toList());
    }

    @Override
    public StudentDto getStudentById(Long id) {
        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Student not found with id: " + id));
        return studentMapper.studentToStudentDto(student);
    }

    @Override
    public StudentDto createStudent(StudentDto studentDto) {
        Student student = studentMapper.studentDtoToStudent(studentDto);
        Student savedStudent = studentRepository.save(student);
        return studentMapper.studentToStudentDto(savedStudent);
    }

    @Override
    public StudentDto updateStudent(Long id, StudentDto studentDto) {
        Student existingStudent = studentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Student not found with id: " + id));

        // Update existing student with the values from the DTO
        existingStudent.setName(studentDto.getName());
        existingStudent.setCountry(studentDto.getCountry());
        existingStudent.setSpeakLanguages(studentDto.getSpeakLanguages());
        existingStudent.setTeachLanguages(studentDto.getTeachLanguages());
        // Update other attributes as needed

        // Save the updated student
        Student updatedStudent = studentRepository.save(existingStudent);

        // Map the updated student back to DTO and return
        return studentMapper.entityToDto(updatedStudent);
    }

    @Override
    public void deleteStudent(Long id) {
        // Your implementation goes here
        // Example: Delete student by id
    }
}
