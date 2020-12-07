import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence {
  int currentIndex;
  int[] data;

  public ArraySequence(int[] other) {
    data = other;
    currentIndex = 0;
  }

  public void reset() {
    currentIndex = 0;
  }
  public int length() {
    int len = data.length;
    return len;
  }
  public boolean hasNext() {
    if (currentIndex < length()-1) return true;
    else return false;
  }

  //@throws NoSuchElementException
  public int next() {
    if (hasNext() == false) throw new NoSuchElementException ("There is no next value");
    int curr = data[currentIndex];
    currentIndex++;
    return curr;
  }

}
