package sandovalDio.apirest.staties;
import sandovalDio.apirest.staties.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
