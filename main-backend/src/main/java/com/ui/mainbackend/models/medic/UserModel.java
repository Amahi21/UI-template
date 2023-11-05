package com.ui.mainbackend.models.medic;

public class UserModel {
    Person person;
    BirthInfo birthInfo;
    WorkInfo workInfo;
    Medic medic;
    Passport passport;
    Other other;

    private String key;

    // test variables


    public UserModel(String firstName, String middleName, String lastName, String snils) {
        person = new Person(
                firstName,
                middleName,
                lastName,
                snils
        );
        key = person.getKey();
        birthInfo = new BirthInfo(key);
        workInfo = new WorkInfo(key);
        medic = new Medic(key);
        passport = new Passport(key);
        other = new Other(key);
    }
}
