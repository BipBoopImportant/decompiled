package l2;

public class i extends C5519c {
    public i(char[] cArr) {
        super(cArr);
    }

    public static C5519c L(char[] cArr) {
        return new i(cArr);
    }

    public static i M(String str) {
        i iVar = new i(str.toCharArray());
        iVar.I(0);
        iVar.G((long) (str.length() - 1));
        return iVar;
    }

    /* access modifiers changed from: protected */
    public String K() {
        return "'" + j() + "'";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i) || !j().equals(((i) obj).j())) {
            return super.equals(obj);
        }
        return true;
    }

    public int hashCode() {
        return super.hashCode();
    }
}
