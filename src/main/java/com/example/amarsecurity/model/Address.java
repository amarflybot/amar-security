package com.example.amarsecurity.model;

import lombok.*;
import org.springframework.data.annotation.Id;


/**
 * Created by amarendra on 09/08/17.
 */
@Data
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@RequiredArgsConstructor(access = AccessLevel.PUBLIC)
public class Address {

    @Id
    private String id;

    @NonNull
    private String line1;

    @NonNull
    private String line2;

    @NonNull
    private String city;

    @NonNull
    private String country;
}
