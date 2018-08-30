package com.github.zainzin.server.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class EmployeeDTO {
    @Id
    @GeneratedValue
    private int id;
    @Column(unique = true)
    private int badgeNumber;
    private String firstName;
    private String lastName;
    private float vacationAccrualRate;
    private float vacationAccrued;

    public EmployeeDTO() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBadgeNumber() {
        return badgeNumber;
    }

    public void setBadgeNumber(int badgeNumber) {
        this.badgeNumber = badgeNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public float getVacationAccrualRate() {
        return vacationAccrualRate;
    }

    public void setVacationAccrualRate(float vacationAccrualRate) {
        this.vacationAccrualRate = vacationAccrualRate;
    }

    public float getVacationAccrued() {
        return vacationAccrued;
    }

    public void setVacationAccrued(float vacationAccrued) {
        this.vacationAccrued = vacationAccrued;
    }


}
