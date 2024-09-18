package mk.ukim.finki.restcoutriesapp.model.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
public class CountryDTO {
    private NameDTO name;
    private String[] tld;
    private String cca2;
    private String ccn3;
    private String cca3;
    private boolean independent;
    private String status;
    private boolean unMember;
    private Map<String, CurrencyDTO> currencies;
    private IDDDTO idd;
    private String[] capital;
    private String[] altSpellings;
    private String region;
    private Map<String, String> languages;
    private Map<String, TranslationDTO> translations;
    private double[] latlng;
    private boolean landlocked;
    private int area;
    private DemonymDTO demonyms;
    private String flag;
    private Map<String, String> maps;
    private int population;
    private CarDTO car;
    private String[] timezones;
    private String[] continents;
    private FlagDTO flags;
    private String startOfWeek;
    private CapitalInfoDTO capitalInfo;

}

