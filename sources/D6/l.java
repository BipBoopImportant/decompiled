package D6;

import C6.b;
import C6.m;
import android.graphics.PointF;
import com.airbnb.lottie.o;
import w6.C8927i;
import y6.C8986c;

public class l implements c {

    /* renamed from: a  reason: collision with root package name */
    private final String f34518a;

    /* renamed from: b  reason: collision with root package name */
    private final m<PointF, PointF> f34519b;

    /* renamed from: c  reason: collision with root package name */
    private final m<PointF, PointF> f34520c;

    /* renamed from: d  reason: collision with root package name */
    private final b f34521d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f34522e;

    public l(String str, m<PointF, PointF> mVar, m<PointF, PointF> mVar2, b bVar, boolean z10) {
        this.f34518a = str;
        this.f34519b = mVar;
        this.f34520c = mVar2;
        this.f34521d = bVar;
        this.f34522e = z10;
    }

    public C8986c a(o oVar, C8927i iVar, E6.b bVar) {
        return new y6.o(oVar, bVar, this);
    }

    public b b() {
        return this.f34521d;
    }

    public String c() {
        return this.f34518a;
    }

    public m<PointF, PointF> d() {
        return this.f34519b;
    }

    public m<PointF, PointF> e() {
        return this.f34520c;
    }

    public boolean f() {
        return this.f34522e;
    }

    public String toString() {
        return "RectangleShape{position=" + this.f34519b + ", size=" + this.f34520c + '}';
    }
}
