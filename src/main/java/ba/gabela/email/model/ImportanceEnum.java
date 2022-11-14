package ba.gabela.email.model;

public enum ImportanceEnum {
    LOW("Low"),
    NORMAL("Normal"),
    HIGH("High");

    private final String value;

    ImportanceEnum(String value) {
        this.value = value;
    }

    public String toString() {
        return String.valueOf(value);
    }
}
