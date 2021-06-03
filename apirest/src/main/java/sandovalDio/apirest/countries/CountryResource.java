package sandovalDio.apirest.countries;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import sandovalDio.apirest.countries.Country;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import sandovalDio.apirest.countries.repository.CountryRepository;

import java.util.List;

@RestController
public class CountryResource {

    private final CountryRepository repository;

    public CountryResource(final CountryRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/sandovalDio/apirest/countries")
    public Page<Country> countries(Pageable page) {

        return (Page<Country>) repository.findAll();
    }
}
