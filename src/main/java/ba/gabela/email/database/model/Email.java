package ba.gabela.email.database.model;

import ba.gabela.email.util.Constants;
import ba.gabela.email.util.ValidationMessages;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table
@SuppressWarnings({"squid:S4823", "checkstyle:magicNumber"})
public final class Email {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, length = 100)
    @Size(max = 100, message = ValidationMessages.GREATER_THAN_100)
    @NotBlank(message = ValidationMessages.NOT_BLANK)
    @Pattern(regexp = Constants.ONE_EMAIL_REGEX, message = ValidationMessages.ONE_EMAIL_ADDRESS)
    private String fromAddress;

    @Column(nullable = false, length = 100)
    @Size(max = 100, message = ValidationMessages.GREATER_THAN_100)
    @NotBlank(message = ValidationMessages.NOT_BLANK)
    @Pattern(regexp = Constants.ONE_EMAIL_REGEX, message = ValidationMessages.ONE_EMAIL_ADDRESS)
    private String toAddress;

    @Column(length = 500)
    @Size(max = 500, message = ValidationMessages.GREATER_THAN_500)
    @Pattern(regexp = Constants.MULTIPLE_EMAILS_REGEX, message = ValidationMessages.COMMA_SEPARATED_EMAILS)
    private String carbonCopy;

    @Column(length = 200)
    @Size(max = 200, message = ValidationMessages.GREATER_THAN_200)
    private String subject;

    @Column(nullable = false, length = 10)
    private String importance;

    @Column(nullable = false, columnDefinition = "TEXT")
    @NotBlank(message = ValidationMessages.NOT_BLANK)
    private String content;
}
