package androidx.compose.ui.platform;

import L1.p;
import N1.P;
import Y1.i;
import android.graphics.Rect;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tI.C17978n;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000  2\u00020\u0001:\u0001\u0015B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ%\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\u0016R\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Landroidx/compose/ui/platform/d;", "Landroidx/compose/ui/platform/a;", "<init>", "()V", "", "lineNumber", "LY1/i;", "direction", "i", "(ILY1/i;)I", "", "text", "LN1/P;", "layoutResult", "LL1/p;", "node", "LXH/N;", "j", "(Ljava/lang/String;LN1/P;LL1/p;)V", "current", "", "a", "(I)[I", "b", "c", "LN1/P;", "d", "LL1/p;", "Landroid/graphics/Rect;", "e", "Landroid/graphics/Rect;", "tempRect", "f", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.ui.platform.d  reason: case insensitive filesystem */
public final class C5093d extends C5084a {

    /* renamed from: f  reason: collision with root package name */
    public static final a f19431f = new a((DefaultConstructorMarker) null);

    /* renamed from: g  reason: collision with root package name */
    public static final int f19432g = 8;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static C5093d f19433h;

    /* renamed from: i  reason: collision with root package name */
    private static final i f19434i = i.Rtl;

    /* renamed from: j  reason: collision with root package name */
    private static final i f19435j = i.Ltr;

    /* renamed from: c  reason: collision with root package name */
    private P f19436c;

    /* renamed from: d  reason: collision with root package name */
    private p f19437d;

    /* renamed from: e  reason: collision with root package name */
    private Rect f19438e;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/ui/platform/d$a;", "", "<init>", "()V", "Landroidx/compose/ui/platform/d;", "a", "()Landroidx/compose/ui/platform/d;", "LY1/i;", "DirectionEnd", "LY1/i;", "DirectionStart", "pageInstance", "Landroidx/compose/ui/platform/d;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.platform.d$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C5093d a() {
            if (C5093d.f19433h == null) {
                C5093d.f19433h = new C5093d((DefaultConstructorMarker) null);
            }
            C5093d g10 = C5093d.f19433h;
            C17542s.h(g10, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.PageTextSegmentIterator");
            return g10;
        }

        private a() {
        }
    }

    public /* synthetic */ C5093d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final int i(int i10, i iVar) {
        P p10 = this.f19436c;
        P p11 = null;
        if (p10 == null) {
            C17542s.z("layoutResult");
            p10 = null;
        }
        int u10 = p10.u(i10);
        P p12 = this.f19436c;
        if (p12 == null) {
            C17542s.z("layoutResult");
            p12 = null;
        }
        if (iVar != p12.y(u10)) {
            P p13 = this.f19436c;
            if (p13 == null) {
                C17542s.z("layoutResult");
            } else {
                p11 = p13;
            }
            return p11.u(i10);
        }
        P p14 = this.f19436c;
        if (p14 == null) {
            C17542s.z("layoutResult");
            p14 = null;
        }
        return P.p(p14, i10, false, 2, (Object) null) - 1;
    }

    public int[] a(int i10) {
        int n10;
        P p10 = null;
        if (d().length() <= 0 || i10 >= d().length()) {
            return null;
        }
        try {
            p pVar = this.f19437d;
            if (pVar == null) {
                C17542s.z("node");
                pVar = null;
            }
            int round = Math.round(pVar.i().n());
            int e10 = C17978n.e(0, i10);
            P p11 = this.f19436c;
            if (p11 == null) {
                C17542s.z("layoutResult");
                p11 = null;
            }
            int q10 = p11.q(e10);
            P p12 = this.f19436c;
            if (p12 == null) {
                C17542s.z("layoutResult");
                p12 = null;
            }
            float v10 = p12.v(q10) + ((float) round);
            P p13 = this.f19436c;
            if (p13 == null) {
                C17542s.z("layoutResult");
                p13 = null;
            }
            P p14 = this.f19436c;
            if (p14 == null) {
                C17542s.z("layoutResult");
                p14 = null;
            }
            if (v10 < p13.v(p14.n() - 1)) {
                P p15 = this.f19436c;
                if (p15 == null) {
                    C17542s.z("layoutResult");
                } else {
                    p10 = p15;
                }
                n10 = p10.r(v10);
            } else {
                P p16 = this.f19436c;
                if (p16 == null) {
                    C17542s.z("layoutResult");
                } else {
                    p10 = p16;
                }
                n10 = p10.n();
            }
            return c(e10, i(n10 - 1, f19435j) + 1);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public int[] b(int i10) {
        int i11;
        P p10 = null;
        if (d().length() <= 0 || i10 <= 0) {
            return null;
        }
        try {
            p pVar = this.f19437d;
            if (pVar == null) {
                C17542s.z("node");
                pVar = null;
            }
            int round = Math.round(pVar.i().n());
            int i12 = C17978n.i(d().length(), i10);
            P p11 = this.f19436c;
            if (p11 == null) {
                C17542s.z("layoutResult");
                p11 = null;
            }
            int q10 = p11.q(i12);
            P p12 = this.f19436c;
            if (p12 == null) {
                C17542s.z("layoutResult");
                p12 = null;
            }
            float v10 = p12.v(q10) - ((float) round);
            if (v10 > 0.0f) {
                P p13 = this.f19436c;
                if (p13 == null) {
                    C17542s.z("layoutResult");
                } else {
                    p10 = p13;
                }
                i11 = p10.r(v10);
            } else {
                i11 = 0;
            }
            if (i12 == d().length() && i11 < q10) {
                i11++;
            }
            return c(i(i11, f19434i), i12);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public final void j(String str, P p10, p pVar) {
        f(str);
        this.f19436c = p10;
        this.f19437d = pVar;
    }

    private C5093d() {
        this.f19438e = new Rect();
    }
}
