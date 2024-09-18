package mk.ukim.finki.restcoutriesapp.model.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Setter
@Getter
public class NameDTO {
    public String common;
    private String official;
    private Map<String, NativeNameDTO> nativeName;

    // Getters and setters

}
