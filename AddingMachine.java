package cse360assignment02;

public class AddingMachine {
  private int total;
  private String memory;
  
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
    memory = "0";
  }
  
  public int getTotal () {
    return total;
  }
  // @param value adds value to the total
  public void add (int value) {
      total += value;
      memory = memory + " + " + String.parseInt(value);
  }
  // @param value subtracts from the total
  public void subtract (int value) {
      total -= value;
      memory = memory + " - " + String.parseInt(value);
  }

  public String toString () {
    //memory = memory + " = " + String.parseInt(total);
    return memory;
  }

  public void clear() {
      memory = "0";
  }
}