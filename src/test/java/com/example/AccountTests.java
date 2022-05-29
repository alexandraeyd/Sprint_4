package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AccountTests {

    private final String name;
    private final boolean expected;

    public AccountTests(String name, boolean expected){
        this.name = name;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getNameCheckData() {
        return new Object[][] {
                { "Name LastName", true},
                { "NameLastName", false},
                { "", false},
                { " ", false},
                { "Name  LastName", false},
                { " NameLastName", false},
                { "NameLastName ", false},
                { "Na", false},
                { "Name LastName111111", false}

        };
    }

    @Test
    public void shouldBeApproved() {
        Account account = new Account(name);
        boolean actual = account.checkNameToEmboss();
        assertEquals(expected, actual);
    }
}
