package edu.clarape.al.allspfpetclinic.model;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Pet {
    private PetType petType;
    private Owner owner;
    private LocalDate birthDate;

}
