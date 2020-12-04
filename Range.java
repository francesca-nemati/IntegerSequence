import java.util.NoSuchElementException;

public class Range implements IntegerSequence{
  private int start, end, current;
  public Range(int start, int end) {
    this.start = start;
    this.end = end;
    current = start;
  }
  public void reset() {
    current = start;
  }
  public int length() {
    int len = (end - start) + 1;
    return len;
  }
  public boolean hasNext() {
    if (current <= end) return true;
    else return false;
  }

  //@throws NoSuchElementException
  public int next() {
    if (hasNext() == false) throw new NoSuchElementException ("There is no next value");
    int curr = current;
    current++;
    return curr;
  }

}
