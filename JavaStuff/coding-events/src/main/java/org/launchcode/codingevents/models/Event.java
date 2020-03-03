package org.launchcode.codingevents.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;

@Entity
public class Event {

    @Id
    @GeneratedValue
    private int id;

    @NotBlank(message = "What's in a name? Not sure, but it is required!")
    @Size(min=3, max=50, message = "Hey! Your event name needs to be between 3 and 50 characters long!")
    private String name;

    @Size(max=500, message = "Woah, that description was too long! Please keep it under 500 characters.")
    private String description;

    @NotBlank(message="You gotta put in an E-Mail!")
    @Email(message="That's not a real E-Mail!")
    private String contactEmail;

    @NotBlank(message = "Wait, where?!")
    @Size(max=50, message = "We don't need the postal address, just the name of the place!")
    private String location;

    @AssertTrue(message = "Your event must require registration for you to add your event to the event page on this weird web app.")
    private Boolean registrationRequired;

    @NotNull(message = "If you don't expect people to attend your event, your event has no place on this list.")
    @Positive(message = "If you don't expect people to attend your event, your event has no place on this list.")
    private Integer attendance;

    @Pattern(regexp="(\\d{4})?[-]?(\\d{2})?[-]?(\\d{2})", message = "You're living in the past!")
    private String date;

    private EventType type;

    public Event(String name, String description, String contactEmail, String location, Boolean registrationRequired, Integer attendance, String date, EventType type) {
        this.name = name;
        this.description = description;
        this.contactEmail = contactEmail;
        this.location = location;
        this.registrationRequired = registrationRequired;
        this.attendance = attendance;
        this.date = date;
        this.type = type;
    }

    public Event() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getLocation() {
        return location;
    }

    public Boolean getRegistrationRequired() {
        return registrationRequired;
    }

    public Integer getAttendance() {
        return attendance;
    }

    public String getDate() {
        return date;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setRegistrationRequired(Boolean registrationRequired) {
        this.registrationRequired = registrationRequired;
    }

    public void setAttendance(Integer attendance) {
        this.attendance = attendance;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public EventType getType() {
        return type;
    }

    public void setType(EventType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return id == event.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
