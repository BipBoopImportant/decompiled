package D2;

import H2.c;

public class m extends RuntimeException {
    public m(String str) {
        super(c.e(str, "The operation has been canceled."));
    }
}
