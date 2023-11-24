package Seminar4;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookServiceTest {
    private InMemoryBookRepository br;
    private BookService bs;

    @BeforeEach
    void setUp() {
        br = Mockito.mock(InMemoryBookRepository.class);
        Mockito.when(br.findById("c1c658dd-cced-4605-8041-4ee98ce4c230")).thenReturn(
                new Book("c1c658dd-cced-4605-8041-4ee98ce4c230", "Book", "Author"));
        Mockito.when(br.findAll()).thenReturn(Arrays.asList(
                new Book("abf75a7f-60b0-45b7-be67-8bec73a6ebd4", "Book1", "Author1"),
                new Book("6d69f913-cd62-4ea7-9167-c1eb49d58cfb", "Book2", "Author2"),
                new Book("1992899c-7a6b-4fd3-aaa3-7d37b46b8d25", "Book3", "Author3")
        ));
        bs = new BookService(br);
   }
    @AfterEach
    void tearDown() {
        br = null;
        bs = null;
    }

    @Test
    @DisplayName("Тестирование BookReposetory. Метод getID")
    void findByIdGetIdTest() {
        assertEquals ("c1c658dd-cced-4605-8041-4ee98ce4c230",
                br.findById("c1c658dd-cced-4605-8041-4ee98ce4c230").getId());
    }

    @Test
    @DisplayName("Тестирование BookReposetory. Метод getAuthor")
    void findByIdGetAuthorTest() {
        assertEquals ("Author",
                br.findById("c1c658dd-cced-4605-8041-4ee98ce4c230").getAuthor());
    }

    @Test
    @DisplayName("Тестирование BookReposetory. Метод getTitle")
    void findByIdGetTitleTest() {
        assertEquals ("Book",
                br.findById("c1c658dd-cced-4605-8041-4ee98ce4c230").getTitle());
    }

    @Test
    @DisplayName("Тестирование BookReposetory. Метод findAll. Id")
    void findAllIdTest() {
        assertEquals ("abf75a7f-60b0-45b7-be67-8bec73a6ebd4", br.findAll().get(0).getId());
        assertEquals ("6d69f913-cd62-4ea7-9167-c1eb49d58cfb", br.findAll().get(1).getId());
        assertEquals ("1992899c-7a6b-4fd3-aaa3-7d37b46b8d25", br.findAll().get(2).getId());
    }
    @Test
    @DisplayName("Тестирование BookReposetory. Метод findAll. Title")
    void findAllTitleTest() {
        assertEquals ("Book1", br.findAll().get(0).getTitle());
        assertEquals ("Book2", br.findAll().get(1).getTitle());
        assertEquals ("Book3", br.findAll().get(2).getTitle());
    }
    @Test
    @DisplayName("Тестирование BookReposetory. Метод findAll. Author")
    void findAllAuthorTest() {
        assertEquals ("Author1", br.findAll().get(0).getAuthor());
        assertEquals ("Author2", br.findAll().get(1).getAuthor());
        assertEquals ("Author3", br.findAll().get(2).getAuthor());
    }
}
