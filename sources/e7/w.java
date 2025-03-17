package E7;

import C7.a;
import E7.f;
import I7.o;
import Z7.b;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.util.List;

class w implements f, d.a<Object> {

    /* renamed from: a  reason: collision with root package name */
    private final f.a f35207a;

    /* renamed from: b  reason: collision with root package name */
    private final g<?> f35208b;

    /* renamed from: c  reason: collision with root package name */
    private int f35209c;

    /* renamed from: d  reason: collision with root package name */
    private int f35210d = -1;

    /* renamed from: e  reason: collision with root package name */
    private C7.f f35211e;

    /* renamed from: f  reason: collision with root package name */
    private List<o<File, ?>> f35212f;

    /* renamed from: g  reason: collision with root package name */
    private int f35213g;

    /* renamed from: h  reason: collision with root package name */
    private volatile o.a<?> f35214h;

    /* renamed from: i  reason: collision with root package name */
    private File f35215i;

    /* renamed from: j  reason: collision with root package name */
    private x f35216j;

    w(g<?> gVar, f.a aVar) {
        this.f35208b = gVar;
        this.f35207a = aVar;
    }

    private boolean b() {
        return this.f35213g < this.f35212f.size();
    }

    public boolean a() {
        b.a("ResourceCacheGenerator.startNext");
        try {
            List<C7.f> c10 = this.f35208b.c();
            boolean z10 = false;
            if (c10.isEmpty()) {
                b.e();
                return false;
            }
            List<Class<?>> m10 = this.f35208b.m();
            if (!m10.isEmpty()) {
                while (true) {
                    if (this.f35212f != null) {
                        if (b()) {
                            this.f35214h = null;
                            while (!z10 && b()) {
                                List<o<File, ?>> list = this.f35212f;
                                int i10 = this.f35213g;
                                this.f35213g = i10 + 1;
                                this.f35214h = list.get(i10).b(this.f35215i, this.f35208b.t(), this.f35208b.f(), this.f35208b.k());
                                if (this.f35214h != null && this.f35208b.u(this.f35214h.f37039c.a())) {
                                    this.f35214h.f37039c.f(this.f35208b.l(), this);
                                    z10 = true;
                                }
                            }
                            b.e();
                            return z10;
                        }
                    }
                    int i11 = this.f35210d + 1;
                    this.f35210d = i11;
                    if (i11 >= m10.size()) {
                        int i12 = this.f35209c + 1;
                        this.f35209c = i12;
                        if (i12 >= c10.size()) {
                            b.e();
                            return false;
                        }
                        this.f35210d = 0;
                    }
                    C7.f fVar = c10.get(this.f35209c);
                    Class cls = m10.get(this.f35210d);
                    this.f35216j = new x(this.f35208b.b(), fVar, this.f35208b.p(), this.f35208b.t(), this.f35208b.f(), this.f35208b.s(cls), cls, this.f35208b.k());
                    File a10 = this.f35208b.d().a(this.f35216j);
                    this.f35215i = a10;
                    if (a10 != null) {
                        this.f35211e = fVar;
                        this.f35212f = this.f35208b.j(a10);
                        this.f35213g = 0;
                    }
                }
            } else if (File.class.equals(this.f35208b.r())) {
                b.e();
                return false;
            } else {
                throw new IllegalStateException("Failed to find any load path from " + this.f35208b.i() + " to " + this.f35208b.r());
            }
        } catch (Throwable th2) {
            b.e();
            throw th2;
        }
    }

    public void c(Exception exc) {
        this.f35207a.n(this.f35216j, exc, this.f35214h.f37039c, a.RESOURCE_DISK_CACHE);
    }

    public void cancel() {
        o.a<?> aVar = this.f35214h;
        if (aVar != null) {
            aVar.f37039c.cancel();
        }
    }

    public void e(Object obj) {
        this.f35207a.b(this.f35211e, obj, this.f35214h.f37039c, a.RESOURCE_DISK_CACHE, this.f35216j);
    }
}
