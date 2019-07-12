package ru.kruvv.interfaces;

import ru.kruvv.objects.User;

public interface SecureLibrary {

	boolean login(User user);

	void logout(User user);
}
