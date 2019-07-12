package ru.kruvv.interfaces;

import ru.kruvv.objects.Book;

public interface EditBook {

	boolean save(Book book);

	boolean delete(Book book);

	boolean edit(Book book);

	boolean add(Book book);
}
