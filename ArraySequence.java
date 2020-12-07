import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence {
  int currentIndex;
  int[] data;

  public ArraySequence(int[] other) {
    currentIndex = 0;
    data = new int[other.length];
    for (int i = 0; i < other.length; i++) {
      data[i] = other[i];
    }
  }

  public ArraySequence(IntegerSequence otherseq) {
    otherseq.reset();
    data = new int[(otherseq.end - otherseq.start) + 1]; //idk about this
    for (int i = 0; i < (otherseq.end - otherseq.start) + 1; i++) {
      data[i] = otherseq.next();
    }
    otherseq.reset();
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
