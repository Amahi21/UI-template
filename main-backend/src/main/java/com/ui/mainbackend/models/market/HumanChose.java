package com.ui.mainbackend.models.market;

public class HumanChose extends ClientInfo {

    private Human human;
    private Chose chose;

    public HumanChose(String firstName, String middleName, String lastName) {
        super(firstName, middleName, lastName);
    }

    public Human getHuman() {
        return human;
    }

    public void setHuman(Human human) {
        this.human = human;
    }

    public Chose getChose() {
        return chose;
    }

    public void setChose(Chose chose) {
        this.chose = chose;
    }
}
