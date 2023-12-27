package kz.singularity.solidbankapp.model;

public enum AccountType {
    CHECKING("CHECKING"),
    SAVING("SAVING"),
    FIXED("FIXED");

    private String type;

    AccountType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
