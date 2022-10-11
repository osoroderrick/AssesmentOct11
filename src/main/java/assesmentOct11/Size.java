package assesmentOct11;

public enum Size {
    S("Small"),M("Medium"),L("Large"),X("Xtra Large"),NULL(null);

    private final String description;


    Size(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
