package User;

public class GastAccount extends Gebruiker {
    private Boolean isGuest;

    public GastAccount(String naam, Integer leeftijd, Boolean isGuest) {
        super(naam, leeftijd);
        this.isGuest = isGuest;
    }

    public Boolean getGuest() {
        return isGuest;
    }

    public void setGuest(Boolean guest) {
        isGuest = guest;
    }
}
