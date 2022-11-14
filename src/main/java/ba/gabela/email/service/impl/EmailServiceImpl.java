package ba.gabela.email.service.impl;

import ba.gabela.email.database.model.Email;
import ba.gabela.email.database.repository.EmailRepository;
import ba.gabela.email.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public final class EmailServiceImpl implements EmailService {
    @Autowired
    private EmailRepository emailRepository;

    @Override
    public void saveEmail(Email email) {
        emailRepository.save(email);
    }

    @Override
    public List<Email> getListOfEmails() {
        return emailRepository.findAll();
    }
}
