package Za;

/* renamed from: Za.e  reason: case insensitive filesystem */
public final class C9380e implements C9382g {

    /* renamed from: c  reason: collision with root package name */
    private static final Object f65035c = new Object();

    /* renamed from: a  reason: collision with root package name */
    private volatile C9382g f65036a;

    /* renamed from: b  reason: collision with root package name */
    private volatile Object f65037b = f65035c;

    private C9380e(C9382g gVar) {
        this.f65036a = gVar;
    }

    public static C9382g a(C9382g gVar) {
        gVar.getClass();
        return gVar instanceof C9380e ? gVar : new C9380e(gVar);
    }

    public final Object zza() {
        Object obj = this.f65037b;
        Object obj2 = f65035c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f65037b;
                    if (obj == obj2) {
                        obj = this.f65036a.zza();
                        Object obj3 = this.f65037b;
                        if (obj3 != obj2) {
                            if (obj3 != obj) {
                                throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + obj + ". This is likely due to a circular dependency.");
                            }
                        }
                        this.f65037b = obj;
                        this.f65036a = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return obj;
    }
}
