
class Main {
  public static void main(String[] args) {

    StackArray stackArray = new StackArray(5);
    stackArray.push(10);
    stackArray.push(20);
    stackArray.push(30);
    stackArray.push(40);

    System.out.println("Size of the StackArray: " + stackArray.size());

    System.out.println("Top element of the StackArray: " + stackArray.peek());
    System.out.println("Pop element from the StackArray: " + stackArray.pop());
    System.out.println("StackArray is full: " + stackArray.isFull());
  }

}