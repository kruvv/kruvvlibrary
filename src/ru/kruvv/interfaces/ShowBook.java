package ru.kruvv.interfaces;

import ru.kruvv.objects.Book;

public interface ShowBook {

	void showBook(Book book);

	void downloadBook(Book book);

	void votedBook(Book book);
}
