package aop;

import aop.AbstractLibrary;
import org.springframework.stereotype.Component;

@Component("schoolLibrary")
public class SchoolLibrary extends AbstractLibrary {

    @Override
    public void getBook() {
        System.out.println("Мы берем книгу из SchoolLibrary");
    }
}
