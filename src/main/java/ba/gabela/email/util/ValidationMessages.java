package ba.gabela.email.util;

@SuppressWarnings({"squid:S4823", "checkstyle:hideutilityclassconstructor"})
public final class ValidationMessages {
    public static final String NOT_BLANK = "Value may not be blank";
    public static final String GREATER_THAN_100 = "Value length may not be greater than 100";
    public static final String GREATER_THAN_200 = "Value length may not be greater than 200";
    public static final String GREATER_THAN_500 = "Value length may not be greater than 500";
    public static final String ONE_EMAIL_ADDRESS = "Value should be one email address";
    public static final String COMMA_SEPARATED_EMAILS =
            "Value should be email address and comma separated if more than one";
}

