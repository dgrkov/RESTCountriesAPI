package mk.ukim.finki.restcoutriesapp.web;

import mk.ukim.finki.restcoutriesapp.model.Country;
import mk.ukim.finki.restcoutriesapp.model.dto.CountryDTO;
import mk.ukim.finki.restcoutriesapp.service.CountryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class CountriesController {
    private final CountryService countryService;

    public CountriesController(CountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping(path = {"/", "/countries"})
    public List<CountryDTO> findAll() {
        return countryService.getAllCountries();
    }

    @GetMapping("/countries/{region}")
    public List<CountryDTO> getCountriesByRegion(@PathVariable String region) {
        String trimmedParam = region.replaceAll(" ", "");
        return countryService.getCountriesByRegion(trimmedParam);
    }

    @GetMapping("/countries/region/count")
    public Map<String, Long> countByRegion() {
        return countryService.countCountriesByRegion();
    }
    // CRUD functionalities
    @GetMapping("/countries/favourites")
    public List<CountryDTO> getFavouriteCountries() {
        List<CountryDTO> allCountries = countryService.getAllCountries();
        return countryService.getFavouriteCountries(allCountries);
    }

    @PostMapping("/countries/favourites")
    public Country save(@RequestBody Country country) {
        country.setId(null);
        return this.countryService.save(country);
    }

    @PutMapping("/countries/favourites/{id}")
    public ResponseEntity<Country> update(@PathVariable Long id, @RequestBody Country country) {
        return this.countryService.update(id, country)
                .map(country1 -> ResponseEntity.ok().body(country1))
                .orElse(ResponseEntity.notFound().build());

    }


    @DeleteMapping("/countries/favourites/{id}")
    public ResponseEntity<Country> delete(@PathVariable Long id) {
        this.countryService.deleteCountryById(id);
        if (this.countryService.findCountryById(id).isEmpty()) {
            return ResponseEntity.ok().build();
        } else
            return ResponseEntity.badRequest().build();
    }
}
