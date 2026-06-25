package com.library;

import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

    public static void main(String[] args) {

        System.out.println("--- Loading Spring Context ---");

        // Load context — this triggers bean creation and DI automatically
        ApplicationContext context =
            new ClassPathXmlApplicationContext("applicationContext.xml");

        System.out.println("--- Spring Context Loaded ---");

        // Get BookService — Spring has already injected BookRepository into it
        BookService bookService = (BookService) context.getBean("bookService");

        // Test methods
        bookService.addBook("Spring in Action");
        bookService.getBook(101);

        // Close context
        ((ClassPathXmlApplicationContext) context).close();
        System.out.println("--- Context Closed ---");
    }
}