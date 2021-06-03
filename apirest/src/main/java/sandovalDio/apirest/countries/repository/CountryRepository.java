package sandovalDio.apirest.countries.repository;

import sandovalDio.apirest.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
