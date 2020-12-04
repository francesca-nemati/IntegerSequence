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
  public boolean hasNext() { }

  //@throws NoSuchElementException
  public int next() { }

}
