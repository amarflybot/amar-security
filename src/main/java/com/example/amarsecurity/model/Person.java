package com.example.amarsecurity.model;

import lombok.*;
import org.springframework.data.annotation.Id;


/**
 * Created by amarendra on 09/08/17.
 */
@Data
@NoArgsConstructor
@RequiredArgsConstructor(access = AccessLevel.PUBLIC)
public class Person {

    @Id
    private String id;

    @NonNull
    private String firstName;

    @NonNull
    private String lastName;

    @NonNull
    private Address address;

    private String username;

    private String password;

}
