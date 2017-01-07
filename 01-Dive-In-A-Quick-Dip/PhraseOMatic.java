public class PhraseOMatic{
  public static void main(String[] args){
    String[] wordListOne = { "24/7", "multi-Tier", "30,000 foot", "B-to-B"};
    String[] wordListTwo ={"empowered", "sticky", "targeted", "shared"};
    String[] wordListThree={"solution", "mission", "portal", "space"};
    int oneLength = wordListOne.length;
    int twoLength = wordListTwo.length;
    int threeLength = wordListThree.length;
    int ran1 = (int) (Math.random() * oneLength);
    int ran2 = (int) (Math.random() * twoLength);
    int ran3 = (int) (Math.random() * threeLength);
    String phrase = wordListOne[ran1] + " " + wordListTwo[ran2] + " " + wordListThree[ran3];

    System.out.println("what we need is a " + phrase);
    }
  }
