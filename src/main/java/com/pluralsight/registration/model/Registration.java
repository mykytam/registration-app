package com.pluralsight.registration.model;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class Registration {

    @NotEmpty
    private String name;
}
