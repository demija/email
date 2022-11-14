package ba.gabela.email.service;

import ba.gabela.email.database.model.Email;
import java.util.List;

public interface EmailService {
    void saveEmail(Email email);

    List<Email> getListOfEmails();
}
