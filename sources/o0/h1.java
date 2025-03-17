package O0;

import U0.C4892n0;
import U0.D0;
import YH.C16877v;
import f1.C5299a;
import f1.C5309k;
import f1.m;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import nI.p;
import tI.C17978n;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0011B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R+\u0010\u000f\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00028F@FX\u0002¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR+\u0010\u0013\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00028F@FX\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\nR$\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00028F@FX\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000eR\u0011\u0010\u001a\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u001c\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\f¨\u0006\u001d"}, d2 = {"LO0/h1;", "", "", "initialHeightOffsetLimit", "initialHeightOffset", "initialContentOffset", "<init>", "(FFF)V", "<set-?>", "a", "LU0/n0;", "e", "()F", "i", "(F)V", "heightOffsetLimit", "b", "c", "g", "contentOffset", "LU0/n0;", "_heightOffset", "newOffset", "d", "h", "heightOffset", "collapsedFraction", "f", "overlappedFraction", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class h1 {

    /* renamed from: d  reason: collision with root package name */
    public static final c f10824d = new c((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final C5309k<h1, ?> f10825e = C5299a.a(a.f10829c, b.f10830c);

    /* renamed from: a  reason: collision with root package name */
    private final C4892n0 f10826a;

    /* renamed from: b  reason: collision with root package name */
    private final C4892n0 f10827b;

    /* renamed from: c  reason: collision with root package name */
    private C4892n0 f10828c;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lf1/m;", "LO0/h1;", "it", "", "", "a", "(Lf1/m;LO0/h1;)Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements p<m, h1, List<? extends Float>> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f10829c = new a();

        a() {
            super(2);
        }

        /* renamed from: a */
        public final List<Float> invoke(m mVar, h1 h1Var) {
            return C16877v.q(Float.valueOf(h1Var.e()), Float.valueOf(h1Var.d()), Float.valueOf(h1Var.c()));
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "it", "LO0/h1;", "a", "(Ljava/util/List;)LO0/h1;"}, k = 3, mv = {1, 8, 0})
    static final class b extends C17544u implements C17642l<List<? extends Float>, h1> {

        /* renamed from: c  reason: collision with root package name */
        public static final b f10830c = new b();

        b() {
            super(1);
        }

        /* renamed from: a */
        public final h1 invoke(List<Float> list) {
            return new h1(list.get(0).floatValue(), list.get(1).floatValue(), list.get(2).floatValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R!\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LO0/h1$c;", "", "<init>", "()V", "Lf1/k;", "LO0/h1;", "Saver", "Lf1/k;", "a", "()Lf1/k;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C5309k<h1, ?> a() {
            return h1.f10825e;
        }

        private c() {
        }
    }

    public h1(float f10, float f11, float f12) {
        this.f10826a = D0.a(f10);
        this.f10827b = D0.a(f12);
        this.f10828c = D0.a(f11);
    }

    public final float b() {
        if (e() == 0.0f) {
            return 0.0f;
        }
        return d() / e();
    }

    public final float c() {
        return this.f10827b.a();
    }

    public final float d() {
        return this.f10828c.a();
    }

    public final float e() {
        return this.f10826a.a();
    }

    public final float f() {
        if (e() == 0.0f) {
            return 0.0f;
        }
        return ((float) 1) - (C17978n.l(e() - c(), e(), 0.0f) / e());
    }

    public final void g(float f10) {
        this.f10827b.n(f10);
    }

    public final void h(float f10) {
        this.f10828c.n(C17978n.l(f10, e(), 0.0f));
    }

    public final void i(float f10) {
        this.f10826a.n(f10);
    }
}
