package com.dana.menalingo.mappers;

import com.dana.menalingo.dto.StudentDto;
import com.dana.menalingo.entities.Student;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface StudentMapper {

    StudentMapper INSTANCE = Mappers.getMapper(StudentMapper.class);

    @Mapping(target = "languageIds", source = "languages")
    @Mapping(target = "teacherIds", source = "teachers")
    StudentDto studentToStudentDto(Student student);

    @Mapping(target = "languages", source = "languageIds")
    @Mapping(target = "teachers", source = "teacherIds")
    Student studentDtoToStudent(StudentDto studentDto);

}
