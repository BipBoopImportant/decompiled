package p1;

import XH.v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o1.C5667g;
import o1.C5668h;
import o1.C5673m;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00112\u00020\u0001:\u0001\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fR \u0010\u0010\u001a\u00020\u00048\u0016X\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\u000e\u0010\u000f\u0001\u0002\u0012\u0013\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0014"}, d2 = {"Lp1/l0;", "", "<init>", "()V", "Lo1/m;", "size", "Lp1/S0;", "p", "", "alpha", "LXH/N;", "a", "(JLp1/S0;F)V", "J", "getIntrinsicSize-NH-jbRc", "()J", "intrinsicSize", "b", "Lp1/e1;", "Lp1/j1;", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: p1.l0  reason: case insensitive filesystem */
public abstract class C5728l0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f27325b = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final long f27326a;

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0012\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\\\u0010\u000f\u001a\u00020\u000e2*\u0010\b\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u0004\"\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J>\u0010\u0013\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u00112\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J>\u0010\u0017\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00062\b\b\u0002\u0010\u0016\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\\\u0010\u0019\u001a\u00020\u000e2*\u0010\b\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u0004\"\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u00062\b\b\u0002\u0010\u0016\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ>\u0010\u001d\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u00112\b\b\u0002\u0010\u001b\u001a\u00020\u00062\b\b\u0002\u0010\u001c\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u0018J\\\u0010\u001e\u001a\u00020\u000e2*\u0010\b\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u0004\"\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\b\b\u0002\u0010\u001b\u001a\u00020\u00062\b\b\u0002\u0010\u001c\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001aJ>\u0010!\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u00112\b\b\u0002\u0010\u001f\u001a\u00020\t2\b\b\u0002\u0010 \u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0004\b!\u0010\"\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006#"}, d2 = {"Lp1/l0$a;", "", "<init>", "()V", "", "LXH/v;", "", "Lp1/v0;", "colorStops", "Lo1/g;", "start", "end", "Lp1/m1;", "tileMode", "Lp1/l0;", "f", "([LXH/v;JJI)Lp1/l0;", "", "colors", "e", "(Ljava/util/List;JJI)Lp1/l0;", "startX", "endX", "a", "(Ljava/util/List;FFI)Lp1/l0;", "b", "([LXH/v;FFI)Lp1/l0;", "startY", "endY", "j", "k", "center", "radius", "i", "(Ljava/util/List;JFI)Lp1/l0;", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: p1.l0$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ C5728l0 c(a aVar, List list, float f10, float f11, int i10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                f10 = 0.0f;
            }
            if ((i11 & 4) != 0) {
                f11 = Float.POSITIVE_INFINITY;
            }
            if ((i11 & 8) != 0) {
                i10 = m1.f27333b.a();
            }
            return aVar.a(list, f10, f11, i10);
        }

        public static /* synthetic */ C5728l0 d(a aVar, v[] vVarArr, float f10, float f11, int i10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                f10 = 0.0f;
            }
            if ((i11 & 4) != 0) {
                f11 = Float.POSITIVE_INFINITY;
            }
            if ((i11 & 8) != 0) {
                i10 = m1.f27333b.a();
            }
            return aVar.b(vVarArr, f10, f11, i10);
        }

        public static /* synthetic */ C5728l0 g(a aVar, List list, long j10, long j11, int i10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                j10 = C5667g.f26701b.c();
            }
            long j12 = j10;
            if ((i11 & 4) != 0) {
                j11 = C5667g.f26701b.a();
            }
            long j13 = j11;
            if ((i11 & 8) != 0) {
                i10 = m1.f27333b.a();
            }
            return aVar.e(list, j12, j13, i10);
        }

        public static /* synthetic */ C5728l0 h(a aVar, v[] vVarArr, long j10, long j11, int i10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                j10 = C5667g.f26701b.c();
            }
            long j12 = j10;
            if ((i11 & 4) != 0) {
                j11 = C5667g.f26701b.a();
            }
            long j13 = j11;
            if ((i11 & 8) != 0) {
                i10 = m1.f27333b.a();
            }
            return aVar.f(vVarArr, j12, j13, i10);
        }

        public static /* synthetic */ C5728l0 l(a aVar, List list, float f10, float f11, int i10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                f10 = 0.0f;
            }
            if ((i11 & 4) != 0) {
                f11 = Float.POSITIVE_INFINITY;
            }
            if ((i11 & 8) != 0) {
                i10 = m1.f27333b.a();
            }
            return aVar.j(list, f10, f11, i10);
        }

        public static /* synthetic */ C5728l0 m(a aVar, v[] vVarArr, float f10, float f11, int i10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                f10 = 0.0f;
            }
            if ((i11 & 4) != 0) {
                f11 = Float.POSITIVE_INFINITY;
            }
            if ((i11 & 8) != 0) {
                i10 = m1.f27333b.a();
            }
            return aVar.k(vVarArr, f10, f11, i10);
        }

        public final C5728l0 a(List<C5747v0> list, float f10, float f11, int i10) {
            return e(list, C5668h.a(f10, 0.0f), C5668h.a(f11, 0.0f), i10);
        }

        public final C5728l0 b(v<Float, C5747v0>[] vVarArr, float f10, float f11, int i10) {
            return f((v[]) Arrays.copyOf(vVarArr, vVarArr.length), C5668h.a(f10, 0.0f), C5668h.a(f11, 0.0f), i10);
        }

        public final C5728l0 e(List<C5747v0> list, long j10, long j11, int i10) {
            return new N0(list, (List) null, j10, j11, i10, (DefaultConstructorMarker) null);
        }

        public final C5728l0 f(v<Float, C5747v0>[] vVarArr, long j10, long j11, int i10) {
            v<Float, C5747v0>[] vVarArr2 = vVarArr;
            ArrayList arrayList = new ArrayList(r1);
            for (v<Float, C5747v0> d10 : vVarArr2) {
                arrayList.add(C5747v0.k(d10.d().y()));
            }
            ArrayList arrayList2 = new ArrayList(r1);
            for (v<Float, C5747v0> c10 : vVarArr2) {
                arrayList2.add(Float.valueOf(c10.c().floatValue()));
            }
            return new N0(arrayList, arrayList2, j10, j11, i10, (DefaultConstructorMarker) null);
        }

        public final C5728l0 i(List<C5747v0> list, long j10, float f10, int i10) {
            return new a1(list, (List) null, j10, f10, i10, (DefaultConstructorMarker) null);
        }

        public final C5728l0 j(List<C5747v0> list, float f10, float f11, int i10) {
            return e(list, C5668h.a(0.0f, f10), C5668h.a(0.0f, f11), i10);
        }

        public final C5728l0 k(v<Float, C5747v0>[] vVarArr, float f10, float f11, int i10) {
            return f((v[]) Arrays.copyOf(vVarArr, vVarArr.length), C5668h.a(0.0f, f10), C5668h.a(0.0f, f11), i10);
        }

        private a() {
        }
    }

    public /* synthetic */ C5728l0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract void a(long j10, S0 s02, float f10);

    private C5728l0() {
        this.f27326a = C5673m.f26722b.a();
    }
}
