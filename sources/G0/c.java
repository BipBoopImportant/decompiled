package G0;

import N1.C4688x;
import N1.Y;
import N1.Z;
import S1.C4820m;
import c2.C5267b;
import c2.d;
import c2.f;
import c2.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tI.C17978n;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0000\u0018\u0000 %2\u00020\u0001:\u0001\u0012B)\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\"\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0017R\u0016\u0010#\u001a\u00020!8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\"R\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\"\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006&"}, d2 = {"LG0/c;", "", "Lc2/t;", "layoutDirection", "LN1/Y;", "inputTextStyle", "Lc2/d;", "density", "LS1/m$b;", "fontFamilyResolver", "<init>", "(Lc2/t;LN1/Y;Lc2/d;LS1/m$b;)V", "Lc2/b;", "inConstraints", "", "minLines", "c", "(JI)J", "a", "Lc2/t;", "g", "()Lc2/t;", "b", "LN1/Y;", "f", "()LN1/Y;", "Lc2/d;", "d", "()Lc2/d;", "LS1/m$b;", "e", "()LS1/m$b;", "resolvedStyle", "", "F", "lineHeightCache", "oneLineHeightCache", "h", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c {

    /* renamed from: h  reason: collision with root package name */
    public static final a f6109h = new a((DefaultConstructorMarker) null);

    /* renamed from: i  reason: collision with root package name */
    public static final int f6110i = 8;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public static c f6111j;

    /* renamed from: a  reason: collision with root package name */
    private final t f6112a;

    /* renamed from: b  reason: collision with root package name */
    private final Y f6113b;

    /* renamed from: c  reason: collision with root package name */
    private final d f6114c;

    /* renamed from: d  reason: collision with root package name */
    private final C4820m.b f6115d;

    /* renamed from: e  reason: collision with root package name */
    private final Y f6116e;

    /* renamed from: f  reason: collision with root package name */
    private float f6117f;

    /* renamed from: g  reason: collision with root package name */
    private float f6118g;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u000e\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"LG0/c$a;", "", "<init>", "()V", "LG0/c;", "minMaxUtil", "Lc2/t;", "layoutDirection", "LN1/Y;", "paramStyle", "Lc2/d;", "density", "LS1/m$b;", "fontFamilyResolver", "a", "(LG0/c;Lc2/t;LN1/Y;Lc2/d;LS1/m$b;)LG0/c;", "last", "LG0/c;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final c a(c cVar, t tVar, Y y10, d dVar, C4820m.b bVar) {
            if (cVar != null && tVar == cVar.g() && C17542s.e(y10, cVar.f()) && dVar.getDensity() == cVar.d().getDensity() && bVar == cVar.e()) {
                return cVar;
            }
            c a10 = c.f6111j;
            if (a10 != null && tVar == a10.g() && C17542s.e(y10, a10.f()) && dVar.getDensity() == a10.d().getDensity() && bVar == a10.e()) {
                return a10;
            }
            c cVar2 = new c(tVar, Z.d(y10, tVar), f.a(dVar.getDensity(), dVar.D1()), bVar, (DefaultConstructorMarker) null);
            c.f6111j = cVar2;
            return cVar2;
        }

        private a() {
        }
    }

    public /* synthetic */ c(t tVar, Y y10, d dVar, C4820m.b bVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(tVar, y10, dVar, bVar);
    }

    public final long c(long j10, int i10) {
        int i11 = i10;
        float f10 = this.f6118g;
        float f11 = this.f6117f;
        if (Float.isNaN(f10) || Float.isNaN(f11)) {
            f10 = C4688x.b(d.f6119a, this.f6116e, c2.c.b(0, 0, 0, 0, 15, (Object) null), this.f6114c, this.f6115d, (List) null, (List) null, 1, false, 96, (Object) null).getHeight();
            f11 = C4688x.b(d.f6120b, this.f6116e, c2.c.b(0, 0, 0, 0, 15, (Object) null), this.f6114c, this.f6115d, (List) null, (List) null, 2, false, 96, (Object) null).getHeight() - f10;
            this.f6118g = f10;
            this.f6117f = f11;
        }
        return c2.c.a(C5267b.n(j10), C5267b.l(j10), i11 != 1 ? C17978n.i(C17978n.e(Math.round(f10 + (f11 * ((float) (i11 - 1)))), 0), C5267b.k(j10)) : C5267b.m(j10), C5267b.k(j10));
    }

    public final d d() {
        return this.f6114c;
    }

    public final C4820m.b e() {
        return this.f6115d;
    }

    public final Y f() {
        return this.f6113b;
    }

    public final t g() {
        return this.f6112a;
    }

    private c(t tVar, Y y10, d dVar, C4820m.b bVar) {
        this.f6112a = tVar;
        this.f6113b = y10;
        this.f6114c = dVar;
        this.f6115d = bVar;
        this.f6116e = Z.d(y10, tVar);
        this.f6117f = Float.NaN;
        this.f6118g = Float.NaN;
    }
}
