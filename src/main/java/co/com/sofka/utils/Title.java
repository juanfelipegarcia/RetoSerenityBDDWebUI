package co.com.sofka.utils;

public enum Title {

    MR("Mr."),
    MRS("Mrs.");

    private final String value;

    public String getValue() {
        return value;
    }

    Title(String value){
        this.value = value;
    }

}
