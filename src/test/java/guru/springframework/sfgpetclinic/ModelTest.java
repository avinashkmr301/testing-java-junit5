package guru.springframework.sfgpetclinic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.TestInfo;

@Tag("model")
public interface ModelTest {
    @BeforeEach
    default void beforeEachConsoleOutput(TestInfo testInfo){

        System.out.println("Running test:-" + testInfo.getDisplayName());
    }

}
