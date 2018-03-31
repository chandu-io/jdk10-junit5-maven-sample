package playground;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertTrue;

class AppTest {

  private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

  @BeforeEach
  void setUp() {
    LOG.info("Before running test...");
  }

  @AfterEach
  void tearDown() {
    LOG.info("After running test...");
  }

  @Test
  void test() {
    LOG.info("Running test...");
    assertTrue(true, () -> "Blah Blah Blah...");
  }
}
