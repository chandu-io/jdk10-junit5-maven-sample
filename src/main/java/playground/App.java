package playground;

import java.util.logging.Logger;

public class App {

  private static final Logger LOG = Logger.getLogger(App.class.getName());

  public static void main(String[] args) {
    final var a = "Hello World!";
    LOG.info(a);
  }
}
