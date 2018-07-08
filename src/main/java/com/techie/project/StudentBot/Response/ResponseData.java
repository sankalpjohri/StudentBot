package com.techie.project.StudentBot.Response;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(doNotUseGetters = true)
public class ResponseData {

    private String type;
    private String text;

}
