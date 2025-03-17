package nts;

/* renamed from: nts.ᾤ  reason: contains not printable characters */
public final class C4111 extends C3766 {

    /* renamed from: ᰕ  reason: contains not printable characters */
    public final /* synthetic */ C4179 f3531;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4111(C3856 r12, Object obj, C4179 r32) {
        super(r12, obj);
        this.f3531 = r32;
    }

    public void fireSSLStatus(String str) {
        C4179 r02 = this.f3531;
        synchronized (r02.f375) {
            r02.fireSSLStatus(str);
        }
    }
}
