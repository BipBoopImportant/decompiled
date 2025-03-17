package G1;

import E1.C4468a;
import E1.C4469b;
import E1.C4483p;
import XH.C16807N;
import YH.X;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import o1.C5667g;
import o1.C5668h;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010%\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0014\u001a\u00020\b*\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H$¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u0010J\u000f\u0010\u0017\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0017\u0010\u0010J\r\u0010\u0018\u001a\u00020\f¢\u0006\u0004\b\u0018\u0010\u0010J\u001e\u0010\u001b\u001a\u00020\u0019*\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0019H$ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\"\u0010(\u001a\u00020!8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010+\u001a\u00020!8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\r\u0010#\u001a\u0004\b)\u0010%\"\u0004\b*\u0010'R\"\u0010.\u001a\u00020!8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010#\u001a\u0004\b,\u0010%\"\u0004\b-\u0010'R\"\u00102\u001a\u00020!8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b/\u0010#\u001a\u0004\b0\u0010%\"\u0004\b1\u0010'R\"\u00105\u001a\u00020!8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010#\u001a\u0004\b3\u0010%\"\u0004\b4\u0010'R\"\u00108\u001a\u00020!8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b$\u0010#\u001a\u0004\b6\u0010%\"\u0004\b7\u0010'R\u0018\u00109\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001eR \u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0:8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010;R\u0014\u0010>\u001a\u00020!8@X\u0004¢\u0006\u0006\u001a\u0004\b=\u0010%R\u0014\u0010@\u001a\u00020!8@X\u0004¢\u0006\u0006\u001a\u0004\b?\u0010%R$\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u0011*\u00020\n8$X¤\u0004¢\u0006\u0006\u001a\u0004\b/\u0010A\u0001\u0002CD\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006E"}, d2 = {"LG1/a;", "", "LG1/b;", "alignmentLinesOwner", "<init>", "(LG1/b;)V", "LE1/a;", "alignmentLine", "", "initialPosition", "LG1/c0;", "initialCoordinator", "LXH/N;", "c", "(LE1/a;ILG1/c0;)V", "o", "()V", "", "h", "()Ljava/util/Map;", "i", "(LG1/c0;LE1/a;)I", "n", "p", "m", "Lo1/g;", "position", "d", "(LG1/c0;J)J", "a", "LG1/b;", "f", "()LG1/b;", "", "b", "Z", "g", "()Z", "setDirty$ui_release", "(Z)V", "dirty", "getUsedDuringParentMeasurement$ui_release", "u", "usedDuringParentMeasurement", "l", "t", "usedDuringParentLayout", "e", "getPreviousUsedDuringParentLayout$ui_release", "q", "previousUsedDuringParentLayout", "getUsedByModifierMeasurement$ui_release", "s", "usedByModifierMeasurement", "getUsedByModifierLayout$ui_release", "r", "usedByModifierLayout", "queryOwner", "", "Ljava/util/Map;", "alignmentLineMap", "j", "queried", "k", "required", "(LG1/c0;)Ljava/util/Map;", "alignmentLinesMap", "LG1/H;", "LG1/O;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: G1.a  reason: case insensitive filesystem */
public abstract class C4493a {

    /* renamed from: a  reason: collision with root package name */
    private final C4495b f6410a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f6411b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f6412c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f6413d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f6414e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f6415f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f6416g;

    /* renamed from: h  reason: collision with root package name */
    private C4495b f6417h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final Map<C4468a, Integer> f6418i;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LG1/b;", "childOwner", "LXH/N;", "a", "(LG1/b;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: G1.a$a  reason: collision with other inner class name */
    static final class C0058a extends C17544u implements C17642l<C4495b, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C4493a f6419c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0058a(C4493a aVar) {
            super(1);
            this.f6419c = aVar;
        }

        public final void a(C4495b bVar) {
            if (bVar.p()) {
                if (bVar.w().g()) {
                    bVar.P();
                }
                Map b10 = bVar.w().f6418i;
                C4493a aVar = this.f6419c;
                for (Map.Entry entry : b10.entrySet()) {
                    aVar.c((C4468a) entry.getKey(), ((Number) entry.getValue()).intValue(), bVar.b0());
                }
                C4498c0 K22 = bVar.b0().K2();
                C17542s.g(K22);
                while (!C17542s.e(K22, this.f6419c.f().b0())) {
                    C4493a aVar2 = this.f6419c;
                    for (C4468a aVar3 : this.f6419c.e(K22).keySet()) {
                        aVar2.c(aVar3, aVar2.i(K22, aVar3), K22);
                    }
                    K22 = K22.K2();
                    C17542s.g(K22);
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C4495b) obj);
            return C16807N.f139792a;
        }
    }

    public /* synthetic */ C4493a(C4495b bVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar);
    }

    /* access modifiers changed from: private */
    public final void c(C4468a aVar, int i10, C4498c0 c0Var) {
        float f10 = (float) i10;
        long a10 = C5668h.a(f10, f10);
        while (true) {
            a10 = d(c0Var, a10);
            c0Var = c0Var.K2();
            C17542s.g(c0Var);
            if (C17542s.e(c0Var, this.f6410a.b0())) {
                break;
            } else if (e(c0Var).containsKey(aVar)) {
                float i11 = (float) i(c0Var, aVar);
                a10 = C5668h.a(i11, i11);
            }
        }
        int round = Math.round(aVar instanceof C4483p ? C5667g.n(a10) : C5667g.m(a10));
        Map<C4468a, Integer> map = this.f6418i;
        if (map.containsKey(aVar)) {
            round = C4469b.c(aVar, ((Number) X.k(this.f6418i, aVar)).intValue(), round);
        }
        map.put(aVar, Integer.valueOf(round));
    }

    /* access modifiers changed from: protected */
    public abstract long d(C4498c0 c0Var, long j10);

    /* access modifiers changed from: protected */
    public abstract Map<C4468a, Integer> e(C4498c0 c0Var);

    public final C4495b f() {
        return this.f6410a;
    }

    public final boolean g() {
        return this.f6411b;
    }

    public final Map<C4468a, Integer> h() {
        return this.f6418i;
    }

    /* access modifiers changed from: protected */
    public abstract int i(C4498c0 c0Var, C4468a aVar);

    public final boolean j() {
        return this.f6412c || this.f6414e || this.f6415f || this.f6416g;
    }

    public final boolean k() {
        o();
        return this.f6417h != null;
    }

    public final boolean l() {
        return this.f6413d;
    }

    public final void m() {
        this.f6411b = true;
        C4495b J10 = this.f6410a.J();
        if (J10 != null) {
            if (this.f6412c) {
                J10.s0();
            } else if (this.f6414e || this.f6413d) {
                J10.requestLayout();
            }
            if (this.f6415f) {
                this.f6410a.s0();
            }
            if (this.f6416g) {
                this.f6410a.requestLayout();
            }
            J10.w().m();
        }
    }

    public final void n() {
        this.f6418i.clear();
        this.f6410a.d0(new C0058a(this));
        this.f6418i.putAll(e(this.f6410a.b0()));
        this.f6411b = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0049, code lost:
        r0 = r0.w();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void o() {
        /*
            r2 = this;
            boolean r0 = r2.j()
            if (r0 == 0) goto L_0x0009
            G1.b r0 = r2.f6410a
            goto L_0x0053
        L_0x0009:
            G1.b r0 = r2.f6410a
            G1.b r0 = r0.J()
            if (r0 != 0) goto L_0x0012
            return
        L_0x0012:
            G1.a r0 = r0.w()
            G1.b r0 = r0.f6417h
            if (r0 == 0) goto L_0x0025
            G1.a r1 = r0.w()
            boolean r1 = r1.j()
            if (r1 == 0) goto L_0x0025
            goto L_0x0053
        L_0x0025:
            G1.b r0 = r2.f6417h
            if (r0 == 0) goto L_0x0055
            G1.a r1 = r0.w()
            boolean r1 = r1.j()
            if (r1 == 0) goto L_0x0034
            goto L_0x0055
        L_0x0034:
            G1.b r1 = r0.J()
            if (r1 == 0) goto L_0x0043
            G1.a r1 = r1.w()
            if (r1 == 0) goto L_0x0043
            r1.o()
        L_0x0043:
            G1.b r0 = r0.J()
            if (r0 == 0) goto L_0x0052
            G1.a r0 = r0.w()
            if (r0 == 0) goto L_0x0052
            G1.b r0 = r0.f6417h
            goto L_0x0053
        L_0x0052:
            r0 = 0
        L_0x0053:
            r2.f6417h = r0
        L_0x0055:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: G1.C4493a.o():void");
    }

    public final void p() {
        this.f6411b = true;
        this.f6412c = false;
        this.f6414e = false;
        this.f6413d = false;
        this.f6415f = false;
        this.f6416g = false;
        this.f6417h = null;
    }

    public final void q(boolean z10) {
        this.f6414e = z10;
    }

    public final void r(boolean z10) {
        this.f6416g = z10;
    }

    public final void s(boolean z10) {
        this.f6415f = z10;
    }

    public final void t(boolean z10) {
        this.f6413d = z10;
    }

    public final void u(boolean z10) {
        this.f6412c = z10;
    }

    private C4493a(C4495b bVar) {
        this.f6410a = bVar;
        this.f6411b = true;
        this.f6418i = new HashMap();
    }
}
