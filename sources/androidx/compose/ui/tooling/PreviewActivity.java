package androidx.compose.ui.tooling;

import E1.I;
import G1.C4504g;
import HJ.C15854t;
import I0.C4592x0;
import I0.C4596z0;
import I0.G0;
import U0.C4877g1;
import U0.C4883j;
import U0.C4889m;
import U0.C4894o0;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import U0.r;
import XH.C16807N;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.j;
import androidx.compose.foundation.layout.C5077h;
import androidx.compose.foundation.layout.C5079j;
import androidx.compose.foundation.layout.D;
import androidx.compose.ui.d;
import com.google.ar.core.ImageMetadata;
import e.C5282e;
import i1.C5437c;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;
import nI.p;
import nI.q;
import p1.i1;
import s0.C5834E;
import s0.C5861g;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0014¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00048\u0002XD¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/tooling/PreviewActivity;", "Landroidx/activity/j;", "<init>", "()V", "", "composableFqn", "LXH/N;", "s", "(Ljava/lang/String;)V", "className", "methodName", "parameterProvider", "t", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "v", "Ljava/lang/String;", "TAG", "ui-tooling_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PreviewActivity extends j {

    /* renamed from: v  reason: collision with root package name */
    private final String f19691v = "PreviewActivity";

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "a", "(LU0/m;I)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f19692c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f19693d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(String str, String str2) {
            super(2);
            this.f19692c = str;
            this.f19693d = str2;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-840626948, i10, -1, "androidx.compose.ui.tooling.PreviewActivity.setComposableContent.<anonymous> (PreviewActivity.android.kt:76)");
                }
                Z1.a.f14953a.g(this.f19692c, this.f19693d, mVar, new Object[0]);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "a", "(LU0/m;I)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Object[] f19694c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f19695d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f19696e;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "a", "(LU0/m;I)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends C17544u implements p<C4889m, Integer, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ Object[] f19697c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C4894o0 f19698d;

            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.compose.ui.tooling.PreviewActivity$b$a$a  reason: collision with other inner class name */
            static final class C0306a extends C17544u implements C17631a<C16807N> {

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ C4894o0 f19699c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ Object[] f19700d;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0306a(C4894o0 o0Var, Object[] objArr) {
                    super(0);
                    this.f19699c = o0Var;
                    this.f19700d = objArr;
                }

                public final void invoke() {
                    C4894o0 o0Var = this.f19699c;
                    o0Var.g((o0Var.e() + 1) % this.f19700d.length);
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(Object[] objArr, C4894o0 o0Var) {
                super(2);
                this.f19697c = objArr;
                this.f19698d = o0Var;
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: nI.a} */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void a(U0.C4889m r16, int r17) {
                /*
                    r15 = this;
                    r0 = r15
                    r12 = r16
                    r1 = r17
                    r2 = r1 & 3
                    r3 = 2
                    if (r2 != r3) goto L_0x0015
                    boolean r2 = r16.l()
                    if (r2 != 0) goto L_0x0011
                    goto L_0x0015
                L_0x0011:
                    r16.L()
                    goto L_0x0067
                L_0x0015:
                    boolean r2 = U0.C4895p.J()
                    if (r2 == 0) goto L_0x0024
                    r2 = -1
                    java.lang.String r3 = "androidx.compose.ui.tooling.PreviewActivity.setParameterizedContent.<anonymous>.<anonymous> (PreviewActivity.android.kt:123)"
                    r4 = 958604965(0x392326a5, float:1.5559288E-4)
                    U0.C4895p.S(r4, r1, r2, r3)
                L_0x0024:
                    Z1.b r1 = Z1.b.f14954a
                    nI.p r1 = r1.a()
                    java.lang.Object[] r2 = r0.f19697c
                    boolean r2 = r12.F(r2)
                    U0.o0 r3 = r0.f19698d
                    java.lang.Object[] r4 = r0.f19697c
                    java.lang.Object r5 = r16.D()
                    if (r2 != 0) goto L_0x0042
                    U0.m$a r2 = U0.C4889m.f14007a
                    java.lang.Object r2 = r2.a()
                    if (r5 != r2) goto L_0x004a
                L_0x0042:
                    androidx.compose.ui.tooling.PreviewActivity$b$a$a r5 = new androidx.compose.ui.tooling.PreviewActivity$b$a$a
                    r5.<init>(r3, r4)
                    r12.u(r5)
                L_0x004a:
                    r2 = r5
                    nI.a r2 = (nI.C17631a) r2
                    r13 = 6
                    r14 = 508(0x1fc, float:7.12E-43)
                    r3 = 0
                    r4 = 0
                    r5 = 0
                    r6 = 0
                    r7 = 0
                    r9 = 0
                    r11 = 0
                    r12 = r16
                    I0.W.a(r1, r2, r3, r4, r5, r6, r7, r9, r11, r12, r13, r14)
                    boolean r1 = U0.C4895p.J()
                    if (r1 == 0) goto L_0x0067
                    U0.C4895p.R()
                L_0x0067:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.tooling.PreviewActivity.b.a.a(U0.m, int):void");
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((C4889m) obj, ((Number) obj2).intValue());
                return C16807N.f139792a;
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ls0/E;", "padding", "LXH/N;", "a", "(Ls0/E;LU0/m;I)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.ui.tooling.PreviewActivity$b$b  reason: collision with other inner class name */
        static final class C0307b extends C17544u implements q<C5834E, C4889m, Integer, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ String f19701c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ String f19702d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ Object[] f19703e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ C4894o0 f19704f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0307b(String str, String str2, Object[] objArr, C4894o0 o0Var) {
                super(3);
                this.f19701c = str;
                this.f19702d = str2;
                this.f19703e = objArr;
                this.f19704f = o0Var;
            }

            public final void a(C5834E e10, C4889m mVar, int i10) {
                if ((i10 & 6) == 0) {
                    i10 |= mVar.V(e10) ? 4 : 2;
                }
                if ((i10 & 19) != 18 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(57310875, i10, -1, "androidx.compose.ui.tooling.PreviewActivity.setParameterizedContent.<anonymous>.<anonymous> (PreviewActivity.android.kt:113)");
                    }
                    d h10 = D.h(d.f18749a, e10);
                    String str = this.f19701c;
                    String str2 = this.f19702d;
                    Object[] objArr = this.f19703e;
                    C4894o0 o0Var = this.f19704f;
                    I h11 = C5077h.h(C5437c.f24302a.o(), false);
                    int a10 = C4883j.a(mVar, 0);
                    C4912y s10 = mVar.s();
                    d e11 = androidx.compose.ui.c.e(mVar, h10);
                    C4504g.a aVar = C4504g.f6515W;
                    C17631a<C4504g> a11 = aVar.a();
                    if (mVar.m() == null) {
                        C4883j.c();
                    }
                    mVar.I();
                    if (mVar.i()) {
                        mVar.p(a11);
                    } else {
                        mVar.t();
                    }
                    C4889m a12 = F1.a(mVar);
                    F1.c(a12, h11, aVar.c());
                    F1.c(a12, s10, aVar.e());
                    p<C4504g, Integer, C16807N> b10 = aVar.b();
                    if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                        a12.u(Integer.valueOf(a10));
                        a12.w(Integer.valueOf(a10), b10);
                    }
                    F1.c(a12, e11, aVar.d());
                    C5079j jVar = C5079j.f18125a;
                    Z1.a.f14953a.g(str, str2, mVar, objArr[o0Var.e()]);
                    mVar.x();
                    if (C4895p.J()) {
                        C4895p.R();
                        return;
                    }
                    return;
                }
                mVar.L();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                a((C5834E) obj, (C4889m) obj2, ((Number) obj3).intValue());
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(Object[] objArr, String str, String str2) {
            super(2);
            this.f19694c = objArr;
            this.f19695d = str;
            this.f19696e = str2;
        }

        public final void a(C4889m mVar, int i10) {
            C4889m mVar2 = mVar;
            int i11 = i10;
            if ((i11 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-861939235, i11, -1, "androidx.compose.ui.tooling.PreviewActivity.setParameterizedContent.<anonymous> (PreviewActivity.android.kt:109)");
                }
                Object D10 = mVar.D();
                if (D10 == C4889m.f14007a.a()) {
                    D10 = C4877g1.a(0);
                    mVar2.u(D10);
                }
                C4894o0 o0Var = (C4894o0) D10;
                C4592x0.a((d) null, (C4596z0) null, (p<? super C4889m, ? super Integer, C16807N>) null, (p<? super C4889m, ? super Integer, C16807N>) null, (q<? super G0, ? super C4889m, ? super Integer, C16807N>) null, c1.c.e(958604965, true, new a(this.f19694c, o0Var), mVar2, 54), 0, false, (q<? super C5861g, ? super C4889m, ? super Integer, C16807N>) null, false, (i1) null, 0.0f, 0, 0, 0, 0, 0, c1.c.e(57310875, true, new C0307b(this.f19695d, this.f19696e, this.f19694c, o0Var), mVar2, 54), mVar, ImageMetadata.EDGE_MODE, 12582912, 131039);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "a", "(LU0/m;I)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f19705c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f19706d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Object[] f19707e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(String str, String str2, Object[] objArr) {
            super(2);
            this.f19705c = str;
            this.f19706d = str2;
            this.f19707e = objArr;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1901447514, i10, -1, "androidx.compose.ui.tooling.PreviewActivity.setParameterizedContent.<anonymous> (PreviewActivity.android.kt:134)");
                }
                Z1.a aVar = Z1.a.f14953a;
                String str = this.f19705c;
                String str2 = this.f19706d;
                Object[] objArr = this.f19707e;
                aVar.g(str, str2, mVar, Arrays.copyOf(objArr, objArr.length));
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    private final void s(String str) {
        String str2 = this.f19691v;
        Log.d(str2, "PreviewActivity has composable " + str);
        String w12 = C15854t.w1(str, '.', (String) null, 2, (Object) null);
        String o12 = C15854t.o1(str, '.', (String) null, 2, (Object) null);
        String stringExtra = getIntent().getStringExtra("parameterProviderClassName");
        if (stringExtra != null) {
            t(w12, o12, stringExtra);
            return;
        }
        String str3 = this.f19691v;
        Log.d(str3, "Previewing '" + o12 + "' without a parameter provider.");
        C5282e.b(this, (r) null, c1.c.c(-840626948, true, new a(w12, o12)), 1, (Object) null);
    }

    private final void t(String str, String str2, String str3) {
        String str4 = this.f19691v;
        Log.d(str4, "Previewing '" + str2 + "' with parameter provider: '" + str3 + '\'');
        Object[] b10 = Z1.d.b(Z1.d.a(str3), getIntent().getIntExtra("parameterProviderIndex", -1));
        if (b10.length > 1) {
            C5282e.b(this, (r) null, c1.c.c(-861939235, true, new b(b10, str, str2)), 1, (Object) null);
        } else {
            C5282e.b(this, (r) null, c1.c.c(-1901447514, true, new c(str, str2, b10)), 1, (Object) null);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        String stringExtra;
        super.onCreate(bundle);
        if ((getApplicationInfo().flags & 2) == 0) {
            Log.d(this.f19691v, "Application is not debuggable. Compose Preview not allowed.");
            finish();
            return;
        }
        Intent intent = getIntent();
        if (intent != null && (stringExtra = intent.getStringExtra("composable")) != null) {
            s(stringExtra);
        }
    }
}
