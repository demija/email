package ba.gabela.email.util;

@SuppressWarnings({"squid:S4823", "checkstyle:hideutilityclassconstructor"})
public final class Constants {
    public static final String ONE_EMAIL_REGEX = "^[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\" +
            ".[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?$";
    public static final String MULTIPLE_EMAILS_REGEX = "^$|^[\\W]*([\\w+\\-.%]+@[\\w\\-.]+\\." +
            "[A-Za-z]{2,4}[\\W]*,{1}[\\W]*)*([\\w+\\-.%]+@[\\w\\-.]+\\.[A-Za-z]{2,4})[\\W]*$";
}
