package annotations.examples.fruits.entity;

@Ready
public class Pineapple implements Nameable {
  @Override
  public String name() {
    return "I'm Pineapple";
  }
}