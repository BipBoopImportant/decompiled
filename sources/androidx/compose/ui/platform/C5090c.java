package androidx.compose.ui.platform;

import N1.P;
import Y1.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0013B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0014R\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/platform/c;", "Landroidx/compose/ui/platform/a;", "<init>", "()V", "", "lineNumber", "LY1/i;", "direction", "i", "(ILY1/i;)I", "", "text", "LN1/P;", "layoutResult", "LXH/N;", "j", "(Ljava/lang/String;LN1/P;)V", "current", "", "a", "(I)[I", "b", "c", "LN1/P;", "d", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.ui.platform.c  reason: case insensitive filesystem */
public final class C5090c extends C5084a {

    /* renamed from: d  reason: collision with root package name */
    public static final a f19394d = new a((DefaultConstructorMarker) null);

    /* renamed from: e  reason: collision with root package name */
    public static final int f19395e = 8;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static C5090c f19396f;

    /* renamed from: g  reason: collision with root package name */
    private static final i f19397g = i.Rtl;

    /* renamed from: h  reason: collision with root package name */
    private static final i f19398h = i.Ltr;

    /* renamed from: c  reason: collision with root package name */
    private P f19399c;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/ui/platform/c$a;", "", "<init>", "()V", "Landroidx/compose/ui/platform/c;", "a", "()Landroidx/compose/ui/platform/c;", "LY1/i;", "DirectionEnd", "LY1/i;", "DirectionStart", "lineInstance", "Landroidx/compose/ui/platform/c;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.platform.c$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C5090c a() {
            if (C5090c.f19396f == null) {
                C5090c.f19396f = new C5090c((DefaultConstructorMarker) null);
            }
            C5090c g10 = C5090c.f19396f;
            C17542s.h(g10, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.LineTextSegmentIterator");
            return g10;
        }

        private a() {
        }
    }

    public /* synthetic */ C5090c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final int i(int i10, i iVar) {
        P p10 = this.f19399c;
        P p11 = null;
        if (p10 == null) {
            C17542s.z("layoutResult");
            p10 = null;
        }
        int u10 = p10.u(i10);
        P p12 = this.f19399c;
        if (p12 == null) {
            C17542s.z("layoutResult");
            p12 = null;
        }
        if (iVar != p12.y(u10)) {
            P p13 = this.f19399c;
            if (p13 == null) {
                C17542s.z("layoutResult");
            } else {
                p11 = p13;
            }
            return p11.u(i10);
        }
        P p14 = this.f19399c;
        if (p14 == null) {
            C17542s.z("layoutResult");
            p14 = null;
        }
        return P.p(p14, i10, false, 2, (Object) null) - 1;
    }

    public int[] a(int i10) {
        int i11;
        if (d().length() <= 0 || i10 >= d().length()) {
            return null;
        }
        if (i10 < 0) {
            P p10 = this.f19399c;
            if (p10 == null) {
                C17542s.z("layoutResult");
                p10 = null;
            }
            i11 = p10.q(0);
        } else {
            P p11 = this.f19399c;
            if (p11 == null) {
                C17542s.z("layoutResult");
                p11 = null;
            }
            int q10 = p11.q(i10);
            i11 = i(q10, f19397g) == i10 ? q10 : q10 + 1;
        }
        P p12 = this.f19399c;
        if (p12 == null) {
            C17542s.z("layoutResult");
            p12 = null;
        }
        if (i11 >= p12.n()) {
            return null;
        }
        return c(i(i11, f19397g), i(i11, f19398h) + 1);
    }

    public int[] b(int i10) {
        int i11;
        if (d().length() <= 0 || i10 <= 0) {
            return null;
        }
        if (i10 > d().length()) {
            P p10 = this.f19399c;
            if (p10 == null) {
                C17542s.z("layoutResult");
                p10 = null;
            }
            i11 = p10.q(d().length());
        } else {
            P p11 = this.f19399c;
            if (p11 == null) {
                C17542s.z("layoutResult");
                p11 = null;
            }
            int q10 = p11.q(i10);
            i11 = i(q10, f19398h) + 1 == i10 ? q10 : q10 - 1;
        }
        if (i11 < 0) {
            return null;
        }
        return c(i(i11, f19397g), i(i11, f19398h) + 1);
    }

    public final void j(String str, P p10) {
        f(str);
        this.f19399c = p10;
    }

    private C5090c() {
    }
}
