package Framework.generies.SetInterface;

import java.util.EnumSet;

public class enumSet {
    enum name{
        RAVI,RAJ,SINGH,THAKUR;
    }
    public static void main(String[] args) {
        EnumSet<name> enumSet= EnumSet.allOf(name.class);
        System.out.println(name.RAJ);
    }
}
