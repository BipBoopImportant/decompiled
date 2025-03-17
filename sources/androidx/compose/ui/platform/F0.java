package androidx.compose.ui.platform;

import android.graphics.Outline;
import android.os.Build;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import o1.C5661a;
import o1.C5667g;
import o1.C5668h;
import o1.C5669i;
import o1.C5671k;
import o1.C5672l;
import o1.C5673m;
import o1.C5674n;
import p1.Q0;
import p1.T;
import p1.U0;
import p1.Y;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\"\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J0\u0010\u0019\u001a\u00020\u0018*\u0004\u0018\u00010\n2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ:\u0010 \u001a\u00020\u00182\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014ø\u0001\u0000¢\u0006\u0004\b \u0010!J\u0018\u0010#\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\u0012ø\u0001\u0000¢\u0006\u0004\b#\u0010$J\u0015\u0010'\u001a\u00020\u00042\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(R\u0016\u0010*\u001a\u00020\u00188\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b'\u0010)R\u0014\u0010.\u001a\u00020+8\u0002X\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00103\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00105\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b4\u00102R$\u00108\u001a\u00020\u00182\u0006\u00106\u001a\u00020\u00188\u0000@BX\u000e¢\u0006\f\n\u0004\b#\u0010)\u001a\u0004\b/\u00107R\u0016\u00109\u001a\u00020\u00188\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010)R\u0018\u0010:\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b \u00102R\u0018\u0010<\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010;R\u0016\u0010>\u001a\u00020\u00168\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010=R\u001c\u0010@\u001a\u00020\u00128\u0002@\u0002X\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\b\u0010?R\u001c\u0010A\u001a\u00020\u00148\u0002@\u0002X\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\f\u0010?R\u0016\u0010C\u001a\u00020\u00188\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bB\u0010)R\u0018\u0010E\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bD\u00102R\u0018\u0010G\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bF\u00102R\u0013\u0010I\u001a\u0004\u0018\u00010+8F¢\u0006\u0006\u001a\u0004\b,\u0010HR\u0011\u0010J\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b4\u00107R\u0013\u0010L\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b1\u0010K\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006M"}, d2 = {"Landroidx/compose/ui/platform/F0;", "", "<init>", "()V", "LXH/N;", "i", "Lo1/i;", "rect", "k", "(Lo1/i;)V", "Lo1/k;", "roundRect", "l", "(Lo1/k;)V", "Lp1/U0;", "composePath", "j", "(Lp1/U0;)V", "Lo1/g;", "offset", "Lo1/m;", "size", "", "radius", "", "g", "(Lo1/k;JJF)Z", "Lp1/Q0;", "outline", "alpha", "clipToOutline", "elevation", "h", "(Lp1/Q0;FZFJ)Z", "position", "f", "(J)Z", "Lp1/n0;", "canvas", "a", "(Lp1/n0;)V", "Z", "isSupportedOutline", "Landroid/graphics/Outline;", "b", "Landroid/graphics/Outline;", "cachedOutline", "c", "Lp1/Q0;", "d", "Lp1/U0;", "cachedRrectPath", "e", "outlinePath", "<set-?>", "()Z", "cacheIsDirty", "usePathForClip", "tmpPath", "Lo1/k;", "tmpRoundRect", "F", "roundedCornerRadius", "J", "rectTopLeft", "rectSize", "m", "outlineNeeded", "n", "tmpTouchPointPath", "o", "tmpOpPath", "()Landroid/graphics/Outline;", "androidOutline", "outlineClipSupported", "()Lp1/U0;", "clipPath", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class F0 {

    /* renamed from: a  reason: collision with root package name */
    private boolean f19190a = true;

    /* renamed from: b  reason: collision with root package name */
    private final Outline f19191b;

    /* renamed from: c  reason: collision with root package name */
    private Q0 f19192c;

    /* renamed from: d  reason: collision with root package name */
    private U0 f19193d;

    /* renamed from: e  reason: collision with root package name */
    private U0 f19194e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f19195f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f19196g;

    /* renamed from: h  reason: collision with root package name */
    private U0 f19197h;

    /* renamed from: i  reason: collision with root package name */
    private C5671k f19198i;

    /* renamed from: j  reason: collision with root package name */
    private float f19199j;

    /* renamed from: k  reason: collision with root package name */
    private long f19200k;

    /* renamed from: l  reason: collision with root package name */
    private long f19201l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f19202m;

    /* renamed from: n  reason: collision with root package name */
    private U0 f19203n;

    /* renamed from: o  reason: collision with root package name */
    private U0 f19204o;

    public F0() {
        Outline outline = new Outline();
        outline.setAlpha(1.0f);
        this.f19191b = outline;
        this.f19200k = C5667g.f26701b.c();
        this.f19201l = C5673m.f26722b.b();
    }

    private final boolean g(C5671k kVar, long j10, long j11, float f10) {
        return kVar != null && C5672l.h(kVar) && kVar.e() == C5667g.m(j10) && kVar.g() == C5667g.n(j10) && kVar.f() == C5667g.m(j10) + C5673m.l(j11) && kVar.a() == C5667g.n(j10) + C5673m.i(j11) && C5661a.d(kVar.h()) == f10;
    }

    private final void i() {
        if (this.f19195f) {
            this.f19200k = C5667g.f26701b.c();
            this.f19199j = 0.0f;
            this.f19194e = null;
            this.f19195f = false;
            this.f19196g = false;
            Q0 q02 = this.f19192c;
            if (q02 == null || !this.f19202m || C5673m.l(this.f19201l) <= 0.0f || C5673m.i(this.f19201l) <= 0.0f) {
                this.f19191b.setEmpty();
                return;
            }
            this.f19190a = true;
            if (q02 instanceof Q0.b) {
                k(((Q0.b) q02).b());
            } else if (q02 instanceof Q0.c) {
                l(((Q0.c) q02).b());
            } else if (q02 instanceof Q0.a) {
                j(((Q0.a) q02).b());
            }
        }
    }

    private final void j(U0 u02) {
        if (Build.VERSION.SDK_INT > 28 || u02.e()) {
            Outline outline = this.f19191b;
            if (u02 instanceof T) {
                outline.setConvexPath(((T) u02).w());
                this.f19196g = !this.f19191b.canClip();
            } else {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
        } else {
            this.f19190a = false;
            this.f19191b.setEmpty();
            this.f19196g = true;
        }
        this.f19194e = u02;
    }

    private final void k(C5669i iVar) {
        this.f19200k = C5668h.a(iVar.o(), iVar.r());
        this.f19201l = C5674n.a(iVar.t(), iVar.n());
        this.f19191b.setRect(Math.round(iVar.o()), Math.round(iVar.r()), Math.round(iVar.p()), Math.round(iVar.j()));
    }

    private final void l(C5671k kVar) {
        float d10 = C5661a.d(kVar.h());
        this.f19200k = C5668h.a(kVar.e(), kVar.g());
        this.f19201l = C5674n.a(kVar.j(), kVar.d());
        if (C5672l.h(kVar)) {
            this.f19191b.setRoundRect(Math.round(kVar.e()), Math.round(kVar.g()), Math.round(kVar.f()), Math.round(kVar.a()), d10);
            this.f19199j = d10;
            return;
        }
        U0 u02 = this.f19193d;
        if (u02 == null) {
            u02 = Y.a();
            this.f19193d = u02;
        }
        u02.a();
        U0.s(u02, kVar, (U0.b) null, 2, (Object) null);
        j(u02);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0029, code lost:
        if (g(r1, r7.f19200k, r7.f19201l, r6) == false) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(p1.C5732n0 r21) {
        /*
            r20 = this;
            r7 = r20
            r8 = r21
            p1.U0 r0 = r20.d()
            r9 = 0
            r10 = 2
            r11 = 0
            if (r0 == 0) goto L_0x0012
            p1.C5732n0.o(r8, r0, r9, r10, r11)
            goto L_0x00a3
        L_0x0012:
            float r6 = r7.f19199j
            r12 = 0
            int r0 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x0072
            p1.U0 r13 = r7.f19197h
            o1.k r1 = r7.f19198i
            if (r13 == 0) goto L_0x002b
            long r2 = r7.f19200k
            long r4 = r7.f19201l
            r0 = r20
            boolean r0 = r0.g(r1, r2, r4, r6)
            if (r0 != 0) goto L_0x006e
        L_0x002b:
            long r0 = r7.f19200k
            float r14 = o1.C5667g.m(r0)
            long r0 = r7.f19200k
            float r15 = o1.C5667g.n(r0)
            long r0 = r7.f19200k
            float r0 = o1.C5667g.m(r0)
            long r1 = r7.f19201l
            float r1 = o1.C5673m.l(r1)
            float r16 = r0 + r1
            long r0 = r7.f19200k
            float r0 = o1.C5667g.n(r0)
            long r1 = r7.f19201l
            float r1 = o1.C5673m.i(r1)
            float r17 = r0 + r1
            float r0 = r7.f19199j
            long r18 = o1.C5662b.b(r0, r12, r10, r11)
            o1.k r0 = o1.C5672l.e(r14, r15, r16, r17, r18)
            if (r13 != 0) goto L_0x0064
            p1.U0 r13 = p1.Y.a()
            goto L_0x0067
        L_0x0064:
            r13.a()
        L_0x0067:
            p1.U0.s(r13, r0, r11, r10, r11)
            r7.f19198i = r0
            r7.f19197h = r13
        L_0x006e:
            p1.C5732n0.o(r8, r13, r9, r10, r11)
            goto L_0x00a3
        L_0x0072:
            long r0 = r7.f19200k
            float r9 = o1.C5667g.m(r0)
            long r0 = r7.f19200k
            float r10 = o1.C5667g.n(r0)
            long r0 = r7.f19200k
            float r0 = o1.C5667g.m(r0)
            long r1 = r7.f19201l
            float r1 = o1.C5673m.l(r1)
            float r11 = r0 + r1
            long r0 = r7.f19200k
            float r0 = o1.C5667g.n(r0)
            long r1 = r7.f19201l
            float r1 = o1.C5673m.i(r1)
            float r12 = r0 + r1
            r14 = 16
            r15 = 0
            r13 = 0
            r8 = r21
            p1.C5732n0.g(r8, r9, r10, r11, r12, r13, r14, r15)
        L_0x00a3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.F0.a(p1.n0):void");
    }

    public final Outline b() {
        i();
        if (!this.f19202m || !this.f19190a) {
            return null;
        }
        return this.f19191b;
    }

    public final boolean c() {
        return this.f19195f;
    }

    public final U0 d() {
        i();
        return this.f19194e;
    }

    public final boolean e() {
        return !this.f19196g;
    }

    public final boolean f(long j10) {
        Q0 q02;
        if (this.f19202m && (q02 = this.f19192c) != null) {
            return C5110i1.b(q02, C5667g.m(j10), C5667g.n(j10), this.f19203n, this.f19204o);
        }
        return true;
    }

    public final boolean h(Q0 q02, float f10, boolean z10, float f11, long j10) {
        this.f19191b.setAlpha(f10);
        boolean e10 = C17542s.e(this.f19192c, q02);
        boolean z11 = !e10;
        if (!e10) {
            this.f19192c = q02;
            this.f19195f = true;
        }
        this.f19201l = j10;
        boolean z12 = q02 != null && (z10 || f11 > 0.0f);
        if (this.f19202m != z12) {
            this.f19202m = z12;
            this.f19195f = true;
        }
        return z11;
    }
}
