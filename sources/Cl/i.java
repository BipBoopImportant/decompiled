package CL;

import android.util.Pair;

public class i extends Pair<Integer, Integer> {
    public i(Integer num, Integer num2) {
        super(num, num2);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (!((Integer) this.first).equals(iVar.first) || !((Integer) this.second).equals(iVar.second)) {
            return ((Integer) this.first).equals(iVar.second) && ((Integer) this.second).equals(iVar.first);
        }
        return true;
    }
}
