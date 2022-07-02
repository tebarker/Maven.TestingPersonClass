package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {
    @Test
    public void testDefaultConstructor() {
        // Given
        String expectedName = "";
        Integer expectedAge = Integer.MAX_VALUE;

        // When
        Person person = new Person();

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Leon";

        // When
        Person person = new Person(expected);

        // Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 5;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithNameAndAge() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";
       String expectedPhoneNumber = "3025652864";
        String expectedZwcCohort = "Java 8.1";
        boolean expectedScholarship = false;
        String expectedBackground = "Research";
        int expectedLockerNumber = 66;

        // When
        Person person = new Person(expectedName, expectedAge, expectedPhoneNumber, expectedZwcCohort, expectedScholarship, expectedBackground, expectedLockerNumber);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();
        String actualPhoneNumber = person.getPhoneNumber();
        String actualZcwCohort = person.getZwcCohort();
        boolean actualScholarship = person.getScholarship();
        String actualBackground = person.getBackground();
        int actualLockerNumber = person.getLockerNumber();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedZwcCohort, actualZcwCohort);
        Assert.assertEquals(expectedPhoneNumber, actualPhoneNumber);
        Assert.assertEquals(expectedBackground, actualBackground);
        Assert.assertEquals(expectedScholarship, actualScholarship);
        Assert.assertEquals(expectedLockerNumber, actualLockerNumber);
    }

    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Leon";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetZcwCohort() {
        // Given
        Person person = new Person();
        String expected = "Java 8.1";

        // When
        person.setZwcCohort(expected);

        // Then
       String actual = person.getZwcCohort();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetPhoneNumber() {
        // Given
        Person person = new Person();
        String expected = "4871837362";

        // When
        person.setPhoneNumber(expected);

        // Then
        String actual = person.getPhoneNumber();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetBackground() {
        // Given
        Person person = new Person();
        String expected = "research";

        // When
        person.setBackground(expected);

        // Then
        String actual = person.getBackground();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetScholarship() {
        // Given
        Person person = new Person();
        Boolean expected = false;

        // When
        person.setScholarship(expected);

        // Then
        Boolean actual = person.getScholarship();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetLockerNumber() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setLockerNumber(expected);

        // Then
        Integer actual = person.getLockerNumber();
        Assert.assertEquals(expected, actual);
    }
}
