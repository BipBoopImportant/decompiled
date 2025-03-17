package H0;

import E1.C4488v;
import N1.P;
import XH.t;
import YH.C16877v;
import j0.C5463t;
import j0.G;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\r¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJU\u0010&\u001a\u00020%2\u0006\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u00132\u0006\u0010!\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b&\u0010'R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b&\u0010(\u001a\u0004\b)\u0010*R\u001d\u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0019\u0010(\u001a\u0004\b+\u0010*R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b,\u0010.R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b)\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b+\u00102\u001a\u0004\b3\u00104R'\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\r8\u0006¢\u0006\f\n\u0004\b3\u00105\u001a\u0004\b6\u00107R\u0014\u0010:\u001a\u0002088\u0002X\u0004¢\u0006\u0006\n\u0004\b6\u00109R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020%0;8\u0002X\u0004¢\u0006\u0006\n\u0004\b0\u0010<R\u0016\u0010?\u001a\u00020\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010>R\u0016\u0010A\u001a\u00020\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b@\u0010>R\u0016\u0010C\u001a\u00020\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bB\u0010>\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006D"}, d2 = {"LH0/D;", "", "Lo1/g;", "currentPosition", "previousHandlePosition", "LE1/v;", "containerCoordinates", "", "isStartHandle", "LH0/p;", "previousSelection", "Ljava/util/Comparator;", "", "Lkotlin/Comparator;", "selectableIdOrderingComparator", "<init>", "(JJLE1/v;ZLH0/p;Ljava/util/Comparator;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "slot", "LH0/f;", "xPositionDirection", "yPositionDirection", "i", "(ILH0/f;LH0/f;)I", "LH0/C;", "b", "()LH0/C;", "selectableId", "rawStartHandleOffset", "startXHandleDirection", "startYHandleDirection", "rawEndHandleOffset", "endXHandleDirection", "endYHandleDirection", "rawPreviousHandleOffset", "LN1/P;", "textLayoutResult", "LH0/o;", "a", "(JILH0/f;LH0/f;ILH0/f;LH0/f;ILN1/P;)LH0/o;", "J", "d", "()J", "e", "c", "LE1/v;", "()LE1/v;", "Z", "h", "()Z", "LH0/p;", "f", "()LH0/p;", "Ljava/util/Comparator;", "g", "()Ljava/util/Comparator;", "Lj0/G;", "Lj0/G;", "selectableIdToInfoListIndex", "", "Ljava/util/List;", "infoList", "I", "startSlot", "j", "endSlot", "k", "currentSlot", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class D {

    /* renamed from: a  reason: collision with root package name */
    private final long f6690a;

    /* renamed from: b  reason: collision with root package name */
    private final long f6691b;

    /* renamed from: c  reason: collision with root package name */
    private final C4488v f6692c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f6693d;

    /* renamed from: e  reason: collision with root package name */
    private final C4538p f6694e;

    /* renamed from: f  reason: collision with root package name */
    private final Comparator<Long> f6695f;

    /* renamed from: g  reason: collision with root package name */
    private final G f6696g;

    /* renamed from: h  reason: collision with root package name */
    private final List<C4537o> f6697h;

    /* renamed from: i  reason: collision with root package name */
    private int f6698i;

    /* renamed from: j  reason: collision with root package name */
    private int f6699j;

    /* renamed from: k  reason: collision with root package name */
    private int f6700k;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f6701a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                H0.f[] r0 = H0.C4528f.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                H0.f r1 = H0.C4528f.BEFORE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                H0.f r1 = H0.C4528f.ON     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                H0.f r1 = H0.C4528f.AFTER     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f6701a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: H0.D.a.<clinit>():void");
        }
    }

    public /* synthetic */ D(long j10, long j11, C4488v vVar, boolean z10, C4538p pVar, Comparator comparator, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, vVar, z10, pVar, comparator);
    }

    private final int i(int i10, C4528f fVar, C4528f fVar2) {
        if (i10 != -1) {
            return i10;
        }
        int i11 = a.f6701a[E.f(fVar, fVar2).ordinal()];
        if (i11 == 1) {
            return this.f6700k - 1;
        }
        if (i11 == 2) {
            return this.f6700k;
        }
        if (i11 == 3) {
            return i10;
        }
        throw new t();
    }

    public final C4537o a(long j10, int i10, C4528f fVar, C4528f fVar2, int i11, C4528f fVar3, C4528f fVar4, int i12, P p10) {
        this.f6700k += 2;
        C4537o oVar = new C4537o(j10, this.f6700k, i10, i11, i12, p10);
        C4528f fVar5 = fVar;
        C4528f fVar6 = fVar2;
        this.f6698i = i(this.f6698i, fVar, fVar2);
        this.f6699j = i(this.f6699j, fVar3, fVar4);
        long j11 = j10;
        this.f6696g.n(j10, this.f6697h.size());
        this.f6697h.add(oVar);
        return oVar;
    }

    public final C b() {
        int i10 = this.f6700k + 1;
        int size = this.f6697h.size();
        if (size == 0) {
            throw new IllegalStateException("SelectionLayout must not be empty.");
        } else if (size != 1) {
            G g10 = this.f6696g;
            List<C4537o> list = this.f6697h;
            int i11 = this.f6698i;
            int i12 = i11 == -1 ? i10 : i11;
            int i13 = this.f6699j;
            return new C4532j(g10, list, i12, i13 == -1 ? i10 : i13, this.f6693d, this.f6694e);
        } else {
            C4537o oVar = (C4537o) C16877v.b1(this.f6697h);
            int i14 = this.f6698i;
            int i15 = i14 == -1 ? i10 : i14;
            int i16 = this.f6699j;
            return new O(this.f6693d, i15, i16 == -1 ? i10 : i16, this.f6694e, oVar);
        }
    }

    public final C4488v c() {
        return this.f6692c;
    }

    public final long d() {
        return this.f6690a;
    }

    public final long e() {
        return this.f6691b;
    }

    public final C4538p f() {
        return this.f6694e;
    }

    public final Comparator<Long> g() {
        return this.f6695f;
    }

    public final boolean h() {
        return this.f6693d;
    }

    private D(long j10, long j11, C4488v vVar, boolean z10, C4538p pVar, Comparator<Long> comparator) {
        this.f6690a = j10;
        this.f6691b = j11;
        this.f6692c = vVar;
        this.f6693d = z10;
        this.f6694e = pVar;
        this.f6695f = comparator;
        this.f6696g = C5463t.a();
        this.f6697h = new ArrayList();
        this.f6698i = -1;
        this.f6699j = -1;
        this.f6700k = -1;
    }
}
