package K9;

/* renamed from: K9.t  reason: case insensitive filesystem */
public final class C6621t {

    /* renamed from: b  reason: collision with root package name */
    private static C6621t f37918b;

    /* renamed from: c  reason: collision with root package name */
    private static final C6622u f37919c = new C6622u(0, false, false, 0, 0);

    /* renamed from: a  reason: collision with root package name */
    private C6622u f37920a;

    private C6621t() {
    }

    public static synchronized C6621t b() {
        C6621t tVar;
        synchronized (C6621t.class) {
            try {
                if (f37918b == null) {
                    f37918b = new C6621t();
                }
                tVar = f37918b;
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        return tVar;
    }

    public C6622u a() {
        return this.f37920a;
    }

    public final synchronized void c(C6622u uVar) {
        if (uVar == null) {
            this.f37920a = f37919c;
            return;
        }
        C6622u uVar2 = this.f37920a;
        if (uVar2 == null || uVar2.U() < uVar.U()) {
            this.f37920a = uVar;
        }
    }
}
