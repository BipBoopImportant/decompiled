package nts;

/* renamed from: nts.ᶗ  reason: contains not printable characters */
public class C4068 implements Cloneable {

    /* renamed from: ഇ  reason: contains not printable characters */
    public C3971 f3342;

    public C4068() {
        this.f3342 = null;
        this.f3342 = new C3971();
    }

    public Object clone() {
        return new C4068((C3971) this.f3342.clone());
    }

    public C4068(int i10, String str, String str2, String str3) {
        this.f3342 = null;
        try {
            this.f3342 = new C3971(i10, str, str2, str3);
        } catch (C3625 e10) {
            throw new C3675(e10);
        }
    }

    public C4068(C3971 r12) {
        this.f3342 = r12;
    }
}
