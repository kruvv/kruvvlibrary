package ru.kruvv.interfaces;

import java.util.List;

import ru.kruvv.objects.Author;
import ru.kruvv.objects.Book;
import ru.kruvv.objects.Genre;

public interface BookSearch {

	List<Book> getBooks();

	List<Book> getBooks(Author author);

	List<Book> getBooks(String bookName);

	List<Book> getBooks(Genre genre);

	List<Book> getBooks(Character letter);
}
