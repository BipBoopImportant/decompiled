package D6;

import C6.f;
import C6.m;
import android.graphics.PointF;
import com.airbnb.lottie.o;
import w6.C8927i;
import y6.C8986c;
import y6.C8989f;

public class b implements c {

    /* renamed from: a  reason: collision with root package name */
    private final String f34469a;

    /* renamed from: b  reason: collision with root package name */
    private final m<PointF, PointF> f34470b;

    /* renamed from: c  reason: collision with root package name */
    private final f f34471c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f34472d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f34473e;

    public b(String str, m<PointF, PointF> mVar, f fVar, boolean z10, boolean z11) {
        this.f34469a = str;
        this.f34470b = mVar;
        this.f34471c = fVar;
        this.f34472d = z10;
        this.f34473e = z11;
    }

    public C8986c a(o oVar, C8927i iVar, E6.b bVar) {
        return new C8989f(oVar, bVar, this);
    }

    public String b() {
        return this.f34469a;
    }

    public m<PointF, PointF> c() {
        return this.f34470b;
    }

    public f d() {
        return this.f34471c;
    }

    public boolean e() {
        return this.f34473e;
    }

    public boolean f() {
        return this.f34472d;
    }
}
