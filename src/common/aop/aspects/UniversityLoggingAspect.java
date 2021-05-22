package aop.aspects;

import aop.Student;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {

    @Before("execution(* getStudents())")
    public void beforeGetStudentsLoggingAdvice() {
        System.out.println("beforeGetStudentsLoggingAdvice: логируем получение списка" +
                "студентов перед методом getStudents");
    }

    @AfterReturning(pointcut = "execution(* getStudents())"
    ,returning = "students")
    public void afterReturnigGetStudentsLoggingAdvice(List<Student> students) {
        Student firsStudent = students.get(0);

        String nameSurname = firsStudent.getNameSurname();
        nameSurname = "Mr. " + nameSurname;
        firsStudent.setNameSurname(nameSurname);

        double avgGrade = firsStudent.getAvfGrade();
        avgGrade = avgGrade + 1;
        firsStudent.setAvfGrade(avgGrade);

        System.out.println("beforeGetStudentsLoggingAdvice: логируем получение списка" +
                "студентов после работы метода getStudents");
    }
}
