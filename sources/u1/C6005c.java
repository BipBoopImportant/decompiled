package u1;

import XH.C16807N;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import p1.C5728l0;
import p1.C5747v0;
import p1.O0;
import p1.U0;
import p1.Y;
import p1.j1;
import r1.d;
import r1.f;
import r1.h;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u001d\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0003J\u001d\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0001¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0013¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0013¢\u0006\u0004\b\u001d\u0010\u001eJ\u0013\u0010 \u001a\u00020\u0006*\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$R\u001e\u0010(\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b&\u0010'R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00010)8\u0002X\u0004¢\u0006\u0006\n\u0004\b*\u0010+R$\u00103\u001a\u00020-2\u0006\u0010.\u001a\u00020-8\u0006@BX\u000e¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R*\u00108\u001a\u00020\t2\u0006\u0010.\u001a\u00020\t8\u0006@BX\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R6\u0010A\u001a\b\u0012\u0004\u0012\u00020:092\f\u0010;\u001a\b\u0012\u0004\u0012\u00020:098\u0006@FX\u000e¢\u0006\u0012\n\u0004\b<\u0010+\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u0016\u0010B\u001a\u00020-8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b6\u00100R\u0018\u0010F\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bD\u0010ER0\u0010K\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0006\u0018\u00010G8\u0010@\u0010X\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010H\u001a\u0004\b&\u0010I\"\u0004\b/\u0010JR \u0010L\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00060G8\u0002X\u0004¢\u0006\u0006\n\u0004\b1\u0010HR*\u0010Q\u001a\u00020\"2\u0006\u0010;\u001a\u00020\"8\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010M\u001a\u0004\bN\u0010$\"\u0004\bO\u0010PR*\u0010X\u001a\u00020R2\u0006\u0010;\u001a\u00020R8\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR*\u0010[\u001a\u00020R2\u0006\u0010;\u001a\u00020R8\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010S\u001a\u0004\bY\u0010U\"\u0004\bZ\u0010WR*\u0010^\u001a\u00020R2\u0006\u0010;\u001a\u00020R8\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010S\u001a\u0004\b\\\u0010U\"\u0004\b]\u0010WR*\u0010a\u001a\u00020R2\u0006\u0010;\u001a\u00020R8\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010S\u001a\u0004\b_\u0010U\"\u0004\b`\u0010WR*\u0010d\u001a\u00020R2\u0006\u0010;\u001a\u00020R8\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010S\u001a\u0004\bb\u0010U\"\u0004\bc\u0010WR*\u0010g\u001a\u00020R2\u0006\u0010;\u001a\u00020R8\u0006@FX\u000e¢\u0006\u0012\n\u0004\b?\u0010S\u001a\u0004\be\u0010U\"\u0004\bf\u0010WR*\u0010j\u001a\u00020R2\u0006\u0010;\u001a\u00020R8\u0006@FX\u000e¢\u0006\u0012\n\u0004\bO\u0010S\u001a\u0004\bh\u0010U\"\u0004\bi\u0010WR\u0016\u0010k\u001a\u00020-8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bZ\u00100R\u0014\u0010l\u001a\u00020-8BX\u0004¢\u0006\u0006\u001a\u0004\bD\u00102R\u0011\u0010n\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b<\u0010m\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006o"}, d2 = {"Lu1/c;", "Lu1/l;", "<init>", "()V", "Lp1/l0;", "brush", "LXH/N;", "l", "(Lp1/l0;)V", "Lp1/v0;", "color", "m", "(J)V", "node", "n", "(Lu1/l;)V", "k", "z", "A", "", "index", "instance", "i", "(ILu1/l;)V", "from", "to", "count", "o", "(III)V", "p", "(II)V", "Lr1/f;", "a", "(Lr1/f;)V", "", "toString", "()Ljava/lang/String;", "Lp1/O0;", "b", "[F", "groupMatrix", "", "c", "Ljava/util/List;", "children", "", "<set-?>", "d", "Z", "j", "()Z", "isTintable", "e", "J", "g", "()J", "tintColor", "", "Lu1/h;", "value", "f", "getClipPathData", "()Ljava/util/List;", "q", "(Ljava/util/List;)V", "clipPathData", "isClipPathDirty", "Lp1/U0;", "h", "Lp1/U0;", "clipPath", "Lkotlin/Function1;", "LnI/l;", "()LnI/l;", "(LnI/l;)V", "invalidateListener", "wrappedListener", "Ljava/lang/String;", "getName", "r", "(Ljava/lang/String;)V", "name", "", "F", "getRotation", "()F", "u", "(F)V", "rotation", "getPivotX", "s", "pivotX", "getPivotY", "t", "pivotY", "getScaleX", "v", "scaleX", "getScaleY", "w", "scaleY", "getTranslationX", "x", "translationX", "getTranslationY", "y", "translationY", "isMatrixDirty", "willClipPath", "()I", "numChildren", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: u1.c  reason: case insensitive filesystem */
public final class C6005c extends l {

    /* renamed from: b  reason: collision with root package name */
    private float[] f29808b;

    /* renamed from: c  reason: collision with root package name */
    private final List<l> f29809c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private boolean f29810d = true;

    /* renamed from: e  reason: collision with root package name */
    private long f29811e = C5747v0.f27350b.i();

    /* renamed from: f  reason: collision with root package name */
    private List<? extends C6010h> f29812f = q.d();

    /* renamed from: g  reason: collision with root package name */
    private boolean f29813g = true;

    /* renamed from: h  reason: collision with root package name */
    private U0 f29814h;

    /* renamed from: i  reason: collision with root package name */
    private C17642l<? super l, C16807N> f29815i;

    /* renamed from: j  reason: collision with root package name */
    private final C17642l<l, C16807N> f29816j = new a(this);

    /* renamed from: k  reason: collision with root package name */
    private String f29817k = "";

    /* renamed from: l  reason: collision with root package name */
    private float f29818l;

    /* renamed from: m  reason: collision with root package name */
    private float f29819m;

    /* renamed from: n  reason: collision with root package name */
    private float f29820n;

    /* renamed from: o  reason: collision with root package name */
    private float f29821o = 1.0f;

    /* renamed from: p  reason: collision with root package name */
    private float f29822p = 1.0f;

    /* renamed from: q  reason: collision with root package name */
    private float f29823q;

    /* renamed from: r  reason: collision with root package name */
    private float f29824r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f29825s = true;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lu1/l;", "node", "LXH/N;", "a", "(Lu1/l;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: u1.c$a */
    static final class a extends C17544u implements C17642l<l, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C6005c f29826c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C6005c cVar) {
            super(1);
            this.f29826c = cVar;
        }

        public final void a(l lVar) {
            this.f29826c.n(lVar);
            C17642l<l, C16807N> b10 = this.f29826c.b();
            if (b10 != null) {
                b10.invoke(lVar);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((l) obj);
            return C16807N.f139792a;
        }
    }

    public C6005c() {
        super((DefaultConstructorMarker) null);
    }

    private final void A() {
        float[] fArr = this.f29808b;
        if (fArr == null) {
            fArr = O0.c((float[]) null, 1, (DefaultConstructorMarker) null);
            this.f29808b = fArr;
        } else {
            O0.h(fArr);
        }
        O0.q(fArr, this.f29819m + this.f29823q, this.f29820n + this.f29824r, 0.0f, 4, (Object) null);
        O0.k(fArr, this.f29818l);
        O0.l(fArr, this.f29821o, this.f29822p, 1.0f);
        O0.q(fArr, -this.f29819m, -this.f29820n, 0.0f, 4, (Object) null);
    }

    private final boolean h() {
        return !this.f29812f.isEmpty();
    }

    private final void k() {
        this.f29810d = false;
        this.f29811e = C5747v0.f27350b.i();
    }

    private final void l(C5728l0 l0Var) {
        if (!this.f29810d || l0Var == null) {
            return;
        }
        if (l0Var instanceof j1) {
            m(((j1) l0Var).b());
        } else {
            k();
        }
    }

    private final void m(long j10) {
        if (this.f29810d && j10 != 16) {
            long j11 = this.f29811e;
            if (j11 == 16) {
                this.f29811e = j10;
            } else if (!q.e(j11, j10)) {
                k();
            }
        }
    }

    /* access modifiers changed from: private */
    public final void n(l lVar) {
        if (lVar instanceof C6009g) {
            C6009g gVar = (C6009g) lVar;
            l(gVar.e());
            l(gVar.g());
        } else if (lVar instanceof C6005c) {
            C6005c cVar = (C6005c) lVar;
            if (!cVar.f29810d || !this.f29810d) {
                k();
            } else {
                m(cVar.f29811e);
            }
        }
    }

    private final void z() {
        if (h()) {
            U0 u02 = this.f29814h;
            if (u02 == null) {
                u02 = Y.a();
                this.f29814h = u02;
            }
            k.c(this.f29812f, u02);
        }
    }

    public void a(f fVar) {
        if (this.f29825s) {
            A();
            this.f29825s = false;
        }
        if (this.f29813g) {
            z();
            this.f29813g = false;
        }
        d I12 = fVar.I1();
        long b10 = I12.b();
        I12.e().t();
        try {
            h c10 = I12.c();
            float[] fArr = this.f29808b;
            if (fArr != null) {
                c10.a(O0.a(fArr).r());
            }
            U0 u02 = this.f29814h;
            if (h() && u02 != null) {
                h.k(c10, u02, 0, 2, (Object) null);
            }
            List<l> list = this.f29809c;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                list.get(i10).a(fVar);
            }
            I12.e().n();
            I12.g(b10);
        } catch (Throwable th2) {
            I12.e().n();
            I12.g(b10);
            throw th2;
        }
    }

    public C17642l<l, C16807N> b() {
        return this.f29815i;
    }

    public void d(C17642l<? super l, C16807N> lVar) {
        this.f29815i = lVar;
    }

    public final int f() {
        return this.f29809c.size();
    }

    public final long g() {
        return this.f29811e;
    }

    public final void i(int i10, l lVar) {
        if (i10 < f()) {
            this.f29809c.set(i10, lVar);
        } else {
            this.f29809c.add(lVar);
        }
        n(lVar);
        lVar.d(this.f29816j);
        c();
    }

    public final boolean j() {
        return this.f29810d;
    }

    public final void o(int i10, int i11, int i12) {
        int i13 = 0;
        if (i10 > i11) {
            while (i13 < i12) {
                this.f29809c.remove(i10);
                this.f29809c.add(i11, this.f29809c.get(i10));
                i11++;
                i13++;
            }
        } else {
            while (i13 < i12) {
                this.f29809c.remove(i10);
                this.f29809c.add(i11 - 1, this.f29809c.get(i10));
                i13++;
            }
        }
        c();
    }

    public final void p(int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            if (i10 < this.f29809c.size()) {
                this.f29809c.get(i10).d((C17642l<? super l, C16807N>) null);
                this.f29809c.remove(i10);
            }
        }
        c();
    }

    public final void q(List<? extends C6010h> list) {
        this.f29812f = list;
        this.f29813g = true;
        c();
    }

    public final void r(String str) {
        this.f29817k = str;
        c();
    }

    public final void s(float f10) {
        this.f29819m = f10;
        this.f29825s = true;
        c();
    }

    public final void t(float f10) {
        this.f29820n = f10;
        this.f29825s = true;
        c();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("VGroup: ");
        sb2.append(this.f29817k);
        List<l> list = this.f29809c;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            sb2.append("\t");
            sb2.append(list.get(i10).toString());
            sb2.append("\n");
        }
        return sb2.toString();
    }

    public final void u(float f10) {
        this.f29818l = f10;
        this.f29825s = true;
        c();
    }

    public final void v(float f10) {
        this.f29821o = f10;
        this.f29825s = true;
        c();
    }

    public final void w(float f10) {
        this.f29822p = f10;
        this.f29825s = true;
        c();
    }

    public final void x(float f10) {
        this.f29823q = f10;
        this.f29825s = true;
        c();
    }

    public final void y(float f10) {
        this.f29824r = f10;
        this.f29825s = true;
        c();
    }
}
