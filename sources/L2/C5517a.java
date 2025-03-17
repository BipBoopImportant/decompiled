package l2;

/* renamed from: l2.a  reason: case insensitive filesystem */
public class C5517a extends C5518b {
    public C5517a(char[] cArr) {
        super(cArr);
    }

    public static C5519c m0(char[] cArr) {
        return new C5517a(cArr);
    }

    /* access modifiers changed from: protected */
    public String K() {
        StringBuilder sb2 = new StringBuilder(m() + "[");
        boolean z10 = true;
        for (int i10 = 0; i10 < this.f25463f.size(); i10++) {
            if (!z10) {
                sb2.append(", ");
            } else {
                z10 = false;
            }
            sb2.append(this.f25463f.get(i10).K());
        }
        return sb2 + "]";
    }
}
