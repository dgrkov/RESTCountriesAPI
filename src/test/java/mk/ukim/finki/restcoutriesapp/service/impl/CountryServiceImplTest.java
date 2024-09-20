package mk.ukim.finki.restcoutriesapp.service.impl;

import mk.ukim.finki.restcoutriesapp.repository.CountryRepository;
import mk.ukim.finki.restcoutriesapp.service.CountryService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.web.client.RestTemplate;

import static org.junit.jupiter.api.Assertions.*;
class CountryServiceImplTest {

    @InjectMocks
    private CountryService countryService;

    @Mock
    private CountryRepository countryRepository;

    @Mock
    private RestTemplate restTemplate;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void getAllCountries() {
    }

    @Test
    void getCountriesByRegion() {
    }

    @Test
    void countCountriesByRegion() {
    }

    @Test
    void getFavouriteCountries() {
    }

    @Test
    void findCountryById() {
    }

    @Test
    void deleteCountryById() {
    }

    @Test
    void save() {

    }

    @Test
    void update() {
    }
}