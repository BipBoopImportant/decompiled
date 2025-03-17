package eJ;

/* renamed from: eJ.m  reason: case insensitive filesystem */
public class C17202m {

    /* renamed from: a  reason: collision with root package name */
    private C17193d f143075a;

    /* renamed from: b  reason: collision with root package name */
    private C17196g f143076b;

    /* renamed from: c  reason: collision with root package name */
    private volatile boolean f143077c;

    /* renamed from: d  reason: collision with root package name */
    protected volatile C17206q f143078d;

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:10|11|(1:13)(1:14)|15|16|17) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0025 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(eJ.C17206q r3) {
        /*
            r2 = this;
            eJ.q r0 = r2.f143078d
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r2)
            eJ.q r0 = r2.f143078d     // Catch:{ all -> 0x000c }
            if (r0 == 0) goto L_0x000e
            monitor-exit(r2)     // Catch:{ all -> 0x000c }
            return
        L_0x000c:
            r3 = move-exception
            goto L_0x0027
        L_0x000e:
            eJ.d r0 = r2.f143075a     // Catch:{ IOException -> 0x0025 }
            if (r0 == 0) goto L_0x0023
            eJ.s r3 = r3.getParserForType()     // Catch:{ IOException -> 0x0025 }
            eJ.d r0 = r2.f143075a     // Catch:{ IOException -> 0x0025 }
            eJ.g r1 = r2.f143076b     // Catch:{ IOException -> 0x0025 }
            java.lang.Object r3 = r3.b(r0, r1)     // Catch:{ IOException -> 0x0025 }
            eJ.q r3 = (eJ.C17206q) r3     // Catch:{ IOException -> 0x0025 }
            r2.f143078d = r3     // Catch:{ IOException -> 0x0025 }
            goto L_0x0025
        L_0x0023:
            r2.f143078d = r3     // Catch:{ IOException -> 0x0025 }
        L_0x0025:
            monitor-exit(r2)     // Catch:{ all -> 0x000c }
            return
        L_0x0027:
            monitor-exit(r2)     // Catch:{ all -> 0x000c }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: eJ.C17202m.a(eJ.q):void");
    }

    public int b() {
        return this.f143077c ? this.f143078d.getSerializedSize() : this.f143075a.size();
    }

    public C17206q c(C17206q qVar) {
        a(qVar);
        return this.f143078d;
    }

    public C17206q d(C17206q qVar) {
        C17206q qVar2 = this.f143078d;
        this.f143078d = qVar;
        this.f143075a = null;
        this.f143077c = true;
        return qVar2;
    }
}
