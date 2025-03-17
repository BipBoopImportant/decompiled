package E7;

import E7.f;
import I7.o;
import android.util.Log;
import com.bumptech.glide.load.data.d;
import java.io.IOException;
import java.util.List;

class z implements f, f.a {

    /* renamed from: a  reason: collision with root package name */
    private final g<?> f35228a;

    /* renamed from: b  reason: collision with root package name */
    private final f.a f35229b;

    /* renamed from: c  reason: collision with root package name */
    private volatile int f35230c;

    /* renamed from: d  reason: collision with root package name */
    private volatile c f35231d;

    /* renamed from: e  reason: collision with root package name */
    private volatile Object f35232e;

    /* renamed from: f  reason: collision with root package name */
    private volatile o.a<?> f35233f;

    /* renamed from: g  reason: collision with root package name */
    private volatile d f35234g;

    class a implements d.a<Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o.a f35235a;

        a(o.a aVar) {
            this.f35235a = aVar;
        }

        public void c(Exception exc) {
            if (z.this.e(this.f35235a)) {
                z.this.g(this.f35235a, exc);
            }
        }

        public void e(Object obj) {
            if (z.this.e(this.f35235a)) {
                z.this.f(this.f35235a, obj);
            }
        }
    }

    z(g<?> gVar, f.a aVar) {
        this.f35228a = gVar;
        this.f35229b = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x00e1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean c(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.String r0 = "SourceGenerator"
            long r1 = Y7.g.b()
            r3 = 0
            E7.g<?> r4 = r11.f35228a     // Catch:{ all -> 0x0072 }
            com.bumptech.glide.load.data.e r4 = r4.o(r12)     // Catch:{ all -> 0x0072 }
            java.lang.Object r5 = r4.a()     // Catch:{ all -> 0x0072 }
            E7.g<?> r6 = r11.f35228a     // Catch:{ all -> 0x0072 }
            C7.d r6 = r6.q(r5)     // Catch:{ all -> 0x0072 }
            E7.e r7 = new E7.e     // Catch:{ all -> 0x0072 }
            E7.g<?> r8 = r11.f35228a     // Catch:{ all -> 0x0072 }
            C7.i r8 = r8.k()     // Catch:{ all -> 0x0072 }
            r7.<init>(r6, r5, r8)     // Catch:{ all -> 0x0072 }
            E7.d r5 = new E7.d     // Catch:{ all -> 0x0072 }
            I7.o$a<?> r8 = r11.f35233f     // Catch:{ all -> 0x0072 }
            C7.f r8 = r8.f37037a     // Catch:{ all -> 0x0072 }
            E7.g<?> r9 = r11.f35228a     // Catch:{ all -> 0x0072 }
            C7.f r9 = r9.p()     // Catch:{ all -> 0x0072 }
            r5.<init>(r8, r9)     // Catch:{ all -> 0x0072 }
            E7.g<?> r8 = r11.f35228a     // Catch:{ all -> 0x0072 }
            G7.a r8 = r8.d()     // Catch:{ all -> 0x0072 }
            r8.b(r5, r7)     // Catch:{ all -> 0x0072 }
            r7 = 2
            boolean r7 = android.util.Log.isLoggable(r0, r7)     // Catch:{ all -> 0x0072 }
            java.lang.String r9 = ", data: "
            if (r7 == 0) goto L_0x0074
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0072 }
            r7.<init>()     // Catch:{ all -> 0x0072 }
            java.lang.String r10 = "Finished encoding source to cache, key: "
            r7.append(r10)     // Catch:{ all -> 0x0072 }
            r7.append(r5)     // Catch:{ all -> 0x0072 }
            r7.append(r9)     // Catch:{ all -> 0x0072 }
            r7.append(r12)     // Catch:{ all -> 0x0072 }
            java.lang.String r10 = ", encoder: "
            r7.append(r10)     // Catch:{ all -> 0x0072 }
            r7.append(r6)     // Catch:{ all -> 0x0072 }
            java.lang.String r6 = ", duration: "
            r7.append(r6)     // Catch:{ all -> 0x0072 }
            double r1 = Y7.g.a(r1)     // Catch:{ all -> 0x0072 }
            r7.append(r1)     // Catch:{ all -> 0x0072 }
            java.lang.String r1 = r7.toString()     // Catch:{ all -> 0x0072 }
            android.util.Log.v(r0, r1)     // Catch:{ all -> 0x0072 }
            goto L_0x0074
        L_0x0072:
            r12 = move-exception
            goto L_0x00df
        L_0x0074:
            java.io.File r1 = r8.a(r5)     // Catch:{ all -> 0x0072 }
            r2 = 1
            if (r1 == 0) goto L_0x0096
            r11.f35234g = r5     // Catch:{ all -> 0x0072 }
            E7.c r12 = new E7.c     // Catch:{ all -> 0x0072 }
            I7.o$a<?> r0 = r11.f35233f     // Catch:{ all -> 0x0072 }
            C7.f r0 = r0.f37037a     // Catch:{ all -> 0x0072 }
            java.util.List r0 = java.util.Collections.singletonList(r0)     // Catch:{ all -> 0x0072 }
            E7.g<?> r1 = r11.f35228a     // Catch:{ all -> 0x0072 }
            r12.<init>(r0, r1, r11)     // Catch:{ all -> 0x0072 }
            r11.f35231d = r12     // Catch:{ all -> 0x0072 }
            I7.o$a<?> r12 = r11.f35233f
            com.bumptech.glide.load.data.d<Data> r12 = r12.f37039c
            r12.b()
            return r2
        L_0x0096:
            r1 = 3
            boolean r1 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x0072 }
            if (r1 == 0) goto L_0x00be
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0072 }
            r1.<init>()     // Catch:{ all -> 0x0072 }
            java.lang.String r5 = "Attempt to write: "
            r1.append(r5)     // Catch:{ all -> 0x0072 }
            E7.d r5 = r11.f35234g     // Catch:{ all -> 0x0072 }
            r1.append(r5)     // Catch:{ all -> 0x0072 }
            r1.append(r9)     // Catch:{ all -> 0x0072 }
            r1.append(r12)     // Catch:{ all -> 0x0072 }
            java.lang.String r12 = " to the disk cache failed, maybe the disk cache is disabled? Trying to decode the data directly..."
            r1.append(r12)     // Catch:{ all -> 0x0072 }
            java.lang.String r12 = r1.toString()     // Catch:{ all -> 0x0072 }
            android.util.Log.d(r0, r12)     // Catch:{ all -> 0x0072 }
        L_0x00be:
            E7.f$a r12 = r11.f35229b     // Catch:{ all -> 0x00dd }
            I7.o$a<?> r0 = r11.f35233f     // Catch:{ all -> 0x00dd }
            C7.f r5 = r0.f37037a     // Catch:{ all -> 0x00dd }
            java.lang.Object r6 = r4.a()     // Catch:{ all -> 0x00dd }
            I7.o$a<?> r0 = r11.f35233f     // Catch:{ all -> 0x00dd }
            com.bumptech.glide.load.data.d<Data> r7 = r0.f37039c     // Catch:{ all -> 0x00dd }
            I7.o$a<?> r0 = r11.f35233f     // Catch:{ all -> 0x00dd }
            com.bumptech.glide.load.data.d<Data> r0 = r0.f37039c     // Catch:{ all -> 0x00dd }
            C7.a r8 = r0.d()     // Catch:{ all -> 0x00dd }
            I7.o$a<?> r0 = r11.f35233f     // Catch:{ all -> 0x00dd }
            C7.f r9 = r0.f37037a     // Catch:{ all -> 0x00dd }
            r4 = r12
            r4.b(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x00dd }
            return r3
        L_0x00dd:
            r12 = move-exception
            r3 = r2
        L_0x00df:
            if (r3 != 0) goto L_0x00e8
            I7.o$a<?> r0 = r11.f35233f
            com.bumptech.glide.load.data.d<Data> r0 = r0.f37039c
            r0.b()
        L_0x00e8:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: E7.z.c(java.lang.Object):boolean");
    }

    private boolean d() {
        return this.f35230c < this.f35228a.g().size();
    }

    private void h(o.a<?> aVar) {
        this.f35233f.f37039c.f(this.f35228a.l(), new a(aVar));
    }

    public boolean a() {
        if (this.f35232e != null) {
            Object obj = this.f35232e;
            this.f35232e = null;
            try {
                if (!c(obj)) {
                    return true;
                }
            } catch (IOException e10) {
                if (Log.isLoggable("SourceGenerator", 3)) {
                    Log.d("SourceGenerator", "Failed to properly rewind or write data to cache", e10);
                }
            }
        }
        if (this.f35231d != null && this.f35231d.a()) {
            return true;
        }
        this.f35231d = null;
        this.f35233f = null;
        boolean z10 = false;
        while (!z10 && d()) {
            List<o.a<?>> g10 = this.f35228a.g();
            int i10 = this.f35230c;
            this.f35230c = i10 + 1;
            this.f35233f = g10.get(i10);
            if (this.f35233f != null && (this.f35228a.e().c(this.f35233f.f37039c.d()) || this.f35228a.u(this.f35233f.f37039c.a()))) {
                h(this.f35233f);
                z10 = true;
            }
        }
        return z10;
    }

    public void b(C7.f fVar, Object obj, d<?> dVar, C7.a aVar, C7.f fVar2) {
        this.f35229b.b(fVar, obj, dVar, this.f35233f.f37039c.d(), fVar);
    }

    public void cancel() {
        o.a<?> aVar = this.f35233f;
        if (aVar != null) {
            aVar.f37039c.cancel();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean e(o.a<?> aVar) {
        o.a<?> aVar2 = this.f35233f;
        return aVar2 != null && aVar2 == aVar;
    }

    /* access modifiers changed from: package-private */
    public void f(o.a<?> aVar, Object obj) {
        j e10 = this.f35228a.e();
        if (obj == null || !e10.c(aVar.f37039c.d())) {
            f.a aVar2 = this.f35229b;
            C7.f fVar = aVar.f37037a;
            d<Data> dVar = aVar.f37039c;
            aVar2.b(fVar, obj, dVar, dVar.d(), this.f35234g);
            return;
        }
        this.f35232e = obj;
        this.f35229b.m();
    }

    /* access modifiers changed from: package-private */
    public void g(o.a<?> aVar, Exception exc) {
        f.a aVar2 = this.f35229b;
        d dVar = this.f35234g;
        d<Data> dVar2 = aVar.f37039c;
        aVar2.n(dVar, exc, dVar2, dVar2.d());
    }

    public void m() {
        throw new UnsupportedOperationException();
    }

    public void n(C7.f fVar, Exception exc, d<?> dVar, C7.a aVar) {
        this.f35229b.n(fVar, exc, dVar, this.f35233f.f37039c.d());
    }
}
