import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class ApplicationShould {
    @Test
    void works() {
        Application app = new Application();

        boolean isWorking = app.isWorking();

        Assertions.assertThat(isWorking).isTrue();
    }
}
