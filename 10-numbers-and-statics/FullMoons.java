import java.util.*;
import static java.lang.System.out;

class FullMoons{
  static int DAY_IM = 1000 * 60 * 60 * 24;

  public static void main(String[] args) {
    out.println(DAY_IM);
    Calendar c = Calendar.getInstance();
    c.set(2017, 0, 12, 4, 35);
    long day1 = c.getTimeInMillis();
      for(int x=0; x<10; x++){
        day1 += (DAY_IM * 29.52);
        c.setTimeInMillis(day1);
          out.println(c);
        out.println(String.format("full moon on %tc", c));
      }
  }
}
