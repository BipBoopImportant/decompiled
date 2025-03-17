package E7;

import C7.a;
import C7.f;
import E7.f;
import I7.o;
import Z7.b;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.util.List;

class c implements f, d.a<Object> {

    /* renamed from: a  reason: collision with root package name */
    private final List<f> f35027a;

    /* renamed from: b  reason: collision with root package name */
    private final g<?> f35028b;

    /* renamed from: c  reason: collision with root package name */
    private final f.a f35029c;

    /* renamed from: d  reason: collision with root package name */
    private int f35030d;

    /* renamed from: e  reason: collision with root package name */
    private C7.f f35031e;

    /* renamed from: f  reason: collision with root package name */
    private List<o<File, ?>> f35032f;

    /* renamed from: g  reason: collision with root package name */
    private int f35033g;

    /* renamed from: h  reason: collision with root package name */
    private volatile o.a<?> f35034h;

    /* renamed from: i  reason: collision with root package name */
    private File f35035i;

    c(g<?> gVar, f.a aVar) {
        this(gVar.c(), gVar, aVar);
    }

    private boolean b() {
        return this.f35033g < this.f35032f.size();
    }

    public boolean a() {
        b.a("DataCacheGenerator.startNext");
        while (true) {
            try {
                boolean z10 = false;
                if (this.f35032f != null) {
                    if (b()) {
                        this.f35034h = null;
                        while (!z10 && b()) {
                            List<o<File, ?>> list = this.f35032f;
                            int i10 = this.f35033g;
                            this.f35033g = i10 + 1;
                            this.f35034h = list.get(i10).b(this.f35035i, this.f35028b.t(), this.f35028b.f(), this.f35028b.k());
                            if (this.f35034h != null && this.f35028b.u(this.f35034h.f37039c.a())) {
                                this.f35034h.f37039c.f(this.f35028b.l(), this);
                                z10 = true;
                            }
                        }
                        b.e();
                        return z10;
                    }
                }
                int i11 = this.f35030d + 1;
                this.f35030d = i11;
                if (i11 >= this.f35027a.size()) {
                    return false;
                }
                C7.f fVar = this.f35027a.get(this.f35030d);
                File a10 = this.f35028b.d().a(new d(fVar, this.f35028b.p()));
                this.f35035i = a10;
                if (a10 != null) {
                    this.f35031e = fVar;
                    this.f35032f = this.f35028b.j(a10);
                    this.f35033g = 0;
                }
            } finally {
                b.e();
            }
        }
    }

    public void c(Exception exc) {
        this.f35029c.n(this.f35031e, exc, this.f35034h.f37039c, a.DATA_DISK_CACHE);
    }

    public void cancel() {
        o.a<?> aVar = this.f35034h;
        if (aVar != null) {
            aVar.f37039c.cancel();
        }
    }

    public void e(Object obj) {
        this.f35029c.b(this.f35031e, obj, this.f35034h.f37039c, a.DATA_DISK_CACHE, this.f35031e);
    }

    c(List<C7.f> list, g<?> gVar, f.a aVar) {
        this.f35030d = -1;
        this.f35027a = list;
        this.f35028b = gVar;
        this.f35029c = aVar;
    }
}
