package w0;

import E1.C4468a;
import E1.J;
import QJ.S;
import YH.C16877v;
import YH.X;
import c2.f;
import c2.r;
import dI.C17169j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import v0.I;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\"\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0007\" \u0010\u000f\u001a\u00020\t8\u0000X\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\n\u0010\f¨\u0006\u0010"}, d2 = {"Lw0/q;", "", "itemIndex", "Lw0/i;", "a", "(Lw0/q;I)Lw0/i;", "", "[I", "EmptyArray", "Lw0/v;", "b", "Lw0/v;", "()Lw0/v;", "getEmptyLazyStaggeredGridLayoutInfo$annotations", "()V", "EmptyLazyStaggeredGridLayoutInfo", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class w {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f31292a;

    /* renamed from: b  reason: collision with root package name */
    private static final v f31293b;

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0016XD¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00058\u0016XD¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR,\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\u000e8\u0016X\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u0012\u0004\b\u0014\u0010\u0004\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"w0/w$a", "LE1/J;", "LXH/N;", "x", "()V", "", "a", "I", "getWidth", "()I", "width", "b", "getHeight", "height", "", "LE1/a;", "c", "Ljava/util/Map;", "w", "()Ljava/util/Map;", "getAlignmentLines$annotations", "alignmentLines", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements J {

        /* renamed from: a  reason: collision with root package name */
        private final int f31294a;

        /* renamed from: b  reason: collision with root package name */
        private final int f31295b;

        /* renamed from: c  reason: collision with root package name */
        private final Map<C4468a, Integer> f31296c = X.j();

        a() {
        }

        public int getHeight() {
            return this.f31295b;
        }

        public int getWidth() {
            return this.f31294a;
        }

        public Map<C4468a, Integer> w() {
            return this.f31296c;
        }

        public void x() {
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lw0/i;", "it", "", "a", "(Lw0/i;)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class b extends C17544u implements C17642l<C6202i, Integer> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f31297c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(int i10) {
            super(1);
            this.f31297c = i10;
        }

        /* renamed from: a */
        public final Integer invoke(C6202i iVar) {
            return Integer.valueOf(iVar.getIndex() - this.f31297c);
        }
    }

    static {
        int[] iArr = new int[0];
        int[] iArr2 = iArr;
        int[] iArr3 = iArr;
        f31292a = iArr;
        a aVar = r1;
        a aVar2 = new a();
        List n10 = C16877v.n();
        long a10 = r.f23053b.a();
        C6190C c10 = r1;
        C6190C c11 = new C6190C(iArr, iArr);
        C6191D d10 = r0;
        C6191D d11 = new C6191D(new I());
        f31293b = new v(iArr2, iArr3, 0.0f, aVar, false, false, false, c10, d10, f.b(1.0f, 0.0f, 2, (Object) null), 0, n10, a10, 0, 0, 0, 0, 0, S.a(C17169j.f142968a), (DefaultConstructorMarker) null);
    }

    public static final C6202i a(q qVar, int i10) {
        if (qVar.i().isEmpty()) {
            return null;
        }
        int index = ((C6202i) C16877v.w0(qVar.i())).getIndex();
        if (i10 > ((C6202i) C16877v.I0(qVar.i())).getIndex() || index > i10) {
            return null;
        }
        return (C6202i) C16877v.z0(qVar.i(), C16877v.l(qVar.i(), 0, 0, new b(i10), 3, (Object) null));
    }

    public static final v b() {
        return f31293b;
    }
}
