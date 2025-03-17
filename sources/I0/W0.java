package I0;

import E1.C4484q;
import E1.C4491y;
import E1.I;
import E1.a0;
import G1.C4504g;
import L1.v;
import L1.x;
import N1.C4669d;
import N1.E;
import N1.Y;
import N1.Z;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import S1.C4831y;
import T1.b0;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4899r0;
import U0.C4910x;
import U0.C4912y;
import U0.F1;
import U0.J0;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import Y1.o;
import Y1.q;
import Y1.s;
import androidx.compose.foundation.layout.C5077h;
import androidx.compose.foundation.layout.C5079j;
import androidx.compose.foundation.layout.J;
import androidx.recyclerview.widget.RecyclerView;
import c2.h;
import com.google.ar.core.ImageMetadata;
import i1.C5437c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m1.C5571a;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.t;
import o1.C5673m;
import o1.C5674n;
import p1.C5747v0;
import p1.g1;
import p1.i1;
import r0.C5814f;
import r0.k;
import s0.C5834E;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a½\u0001\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0001¢\u0006\u0004\b\u001a\u0010\u001b\u001a@\u0010#\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001c2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001ø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001a#\u0010'\u001a\u00020%*\u00020%2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010&\u001a\u00020\u0002H\u0000¢\u0006\u0004\b'\u0010(\u001a\u0019\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)H\u0000¢\u0006\u0004\b,\u0010-\u001a\u0019\u0010.\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)H\u0000¢\u0006\u0004\b.\u0010-\"\u001a\u00103\u001a\u00020/8\u0000X\u0004¢\u0006\f\n\u0004\b\u001a\u00100\u001a\u0004\b1\u00102\"\u001a\u00108\u001a\u0002048\u0000X\u0004¢\u0006\f\n\u0004\b#\u00105\u001a\u0004\b6\u00107\"\u001a\u0010:\u001a\u0002048\u0000X\u0004¢\u0006\f\n\u0004\b'\u00105\u001a\u0004\b9\u00107\"\u001a\u0010>\u001a\u00020%8\u0000X\u0004¢\u0006\f\n\u0004\b9\u0010;\u001a\u0004\b<\u0010=\"\u001a\u0010C\u001a\u0004\u0018\u00010@*\u00020?8@X\u0004¢\u0006\u0006\u001a\u0004\bA\u0010B\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006D"}, d2 = {"LI0/a1;", "type", "", "value", "Lkotlin/Function0;", "LXH/N;", "innerTextField", "LT1/b0;", "visualTransformation", "label", "placeholder", "leadingIcon", "trailingIcon", "", "singleLine", "enabled", "isError", "Lr0/k;", "interactionSource", "Ls0/E;", "contentPadding", "Lp1/i1;", "shape", "LI0/T0;", "colors", "border", "a", "(LI0/a1;Ljava/lang/String;LnI/p;LT1/b0;LnI/p;LnI/p;LnI/p;LnI/p;ZZZLr0/k;Ls0/E;Lp1/i1;LI0/T0;LnI/p;LU0/m;II)V", "Lp1/v0;", "contentColor", "LN1/Y;", "typography", "", "contentAlpha", "content", "b", "(JLN1/Y;Ljava/lang/Float;LnI/p;LU0/m;II)V", "Landroidx/compose/ui/d;", "defaultErrorMessage", "c", "(Landroidx/compose/ui/d;ZLjava/lang/String;)Landroidx/compose/ui/d;", "LE1/a0;", "placeable", "", "j", "(LE1/a0;)I", "i", "Lc2/b;", "J", "h", "()J", "ZeroConstraints", "Lc2/h;", "F", "g", "()F", "TextFieldPadding", "d", "HorizontalIconPadding", "Landroidx/compose/ui/d;", "e", "()Landroidx/compose/ui/d;", "IconDefaultSizeModifier", "LE1/q;", "", "f", "(LE1/q;)Ljava/lang/Object;", "layoutId", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class W0 {

    /* renamed from: a  reason: collision with root package name */
    private static final long f7641a = c2.c.a(0, 0, 0, 0);

    /* renamed from: b  reason: collision with root package name */
    private static final float f7642b = h.B((float) 16);

    /* renamed from: c  reason: collision with root package name */
    private static final float f7643c = h.B((float) 12);

    /* renamed from: d  reason: collision with root package name */
    private static final androidx.compose.ui.d f7644d;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "labelProgress", "Lp1/v0;", "labelTextStyleColor", "labelContentColor", "placeholderAlphaProgress", "LXH/N;", "a", "(FJJFLU0/m;I)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements t<Float, C5747v0, C5747v0, Float, C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f7645c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f7646d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f7647e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ T0 f7648f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ boolean f7649g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ boolean f7650h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ k f7651i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f7652j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f7653k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ i1 f7654l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ a1 f7655m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f7656n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ boolean f7657o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ C5834E f7658p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ boolean f7659q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f7660r;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo1/m;", "it", "LXH/N;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: I0.W0$a$a  reason: collision with other inner class name */
        static final class C0101a extends C17544u implements C17642l<C5673m, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ float f7661c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C4899r0<C5673m> f7662d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0101a(float f10, C4899r0<C5673m> r0Var) {
                super(1);
                this.f7661c = f10;
                this.f7662d = r0Var;
            }

            public final void a(long j10) {
                float l10 = C5673m.l(j10) * this.f7661c;
                float i10 = C5673m.i(j10) * this.f7661c;
                if (C5673m.l(this.f7662d.getValue().q()) != l10 || C5673m.i(this.f7662d.getValue().q()) != i10) {
                    this.f7662d.setValue(C5673m.c(C5674n.a(l10, i10)));
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a(((C5673m) obj).q());
                return C16807N.f139792a;
            }
        }

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class b {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f7663a;

            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            static {
                /*
                    I0.a1[] r0 = I0.a1.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    I0.a1 r1 = I0.a1.Filled     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    I0.a1 r1 = I0.a1.Outlined     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    f7663a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: I0.W0.a.b.<clinit>():void");
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "a", "(LU0/m;I)V"}, k = 3, mv = {1, 8, 0})
        static final class c extends C17544u implements p<C4889m, Integer, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ float f7664c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ long f7665d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ p<C4889m, Integer, C16807N> f7666e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ boolean f7667f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ long f7668g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            c(float f10, long j10, p<? super C4889m, ? super Integer, C16807N> pVar, boolean z10, long j11) {
                super(2);
                this.f7664c = f10;
                this.f7665d = j10;
                this.f7666e = pVar;
                this.f7667f = z10;
                this.f7668g = j11;
            }

            public final void a(C4889m mVar, int i10) {
                C4889m mVar2 = mVar;
                int i11 = i10;
                if ((i11 & 3) != 2 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(-1865025495, i11, -1, "androidx.compose.material.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:124)");
                    }
                    C4553d0 d0Var = C4553d0.f7988a;
                    Y c10 = Z.c(d0Var.c(mVar2, 6).e(), d0Var.c(mVar2, 6).d(), this.f7664c);
                    W0.b(this.f7665d, this.f7667f ? Y.c(c10, this.f7668g, 0, (C) null, (C4830x) null, (C4831y) null, (C4820m) null, (String) null, 0, (Y1.a) null, (o) null, (U1.e) null, 0, (Y1.k) null, (g1) null, (r1.g) null, 0, 0, 0, (q) null, (E) null, (Y1.h) null, 0, 0, (s) null, 16777214, (Object) null) : c10, (Float) null, this.f7666e, mVar, 384, 0);
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
        static final class d extends C17544u implements p<C4889m, Integer, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ long f7669c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ p<C4889m, Integer, C16807N> f7670d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            d(long j10, p<? super C4889m, ? super Integer, C16807N> pVar) {
                super(2);
                this.f7669c = j10;
                this.f7670d = pVar;
            }

            public final void a(C4889m mVar, int i10) {
                if ((i10 & 3) != 2 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(-1165144581, i10, -1, "androidx.compose.material.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:153)");
                    }
                    W0.b(this.f7669c, (Y) null, (Float) null, this.f7670d, mVar, 0, 6);
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

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/d;", "modifier", "LXH/N;", "a", "(Landroidx/compose/ui/d;LU0/m;I)V"}, k = 3, mv = {1, 8, 0})
        static final class e extends C17544u implements nI.q<androidx.compose.ui.d, C4889m, Integer, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ float f7671c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ T0 f7672d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ boolean f7673e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ p<C4889m, Integer, C16807N> f7674f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            e(float f10, T0 t02, boolean z10, p<? super C4889m, ? super Integer, C16807N> pVar) {
                super(3);
                this.f7671c = f10;
                this.f7672d = t02;
                this.f7673e = z10;
                this.f7674f = pVar;
            }

            public final void a(androidx.compose.ui.d dVar, C4889m mVar, int i10) {
                if ((i10 & 6) == 0) {
                    i10 |= mVar.V(dVar) ? 4 : 2;
                }
                if ((i10 & 19) != 18 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(-413527723, i10, -1, "androidx.compose.material.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:140)");
                    }
                    androidx.compose.ui.d a10 = C5571a.a(dVar, this.f7671c);
                    T0 t02 = this.f7672d;
                    boolean z10 = this.f7673e;
                    p<C4889m, Integer, C16807N> pVar = this.f7674f;
                    I h10 = C5077h.h(C5437c.f24302a.o(), false);
                    int a11 = C4883j.a(mVar, 0);
                    C4912y s10 = mVar.s();
                    androidx.compose.ui.d e10 = androidx.compose.ui.c.e(mVar, a10);
                    C4504g.a aVar = C4504g.f6515W;
                    C17631a<C4504g> a12 = aVar.a();
                    if (mVar.m() == null) {
                        C4883j.c();
                    }
                    mVar.I();
                    if (mVar.i()) {
                        mVar.p(a12);
                    } else {
                        mVar.t();
                    }
                    C4889m a13 = F1.a(mVar);
                    F1.c(a13, h10, aVar.c());
                    F1.c(a13, s10, aVar.e());
                    p<C4504g, Integer, C16807N> b10 = aVar.b();
                    if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                        a13.u(Integer.valueOf(a11));
                        a13.w(Integer.valueOf(a11), b10);
                    }
                    F1.c(a13, e10, aVar.d());
                    C5079j jVar = C5079j.f18125a;
                    W0.b(t02.f(z10, mVar, 0).getValue().y(), C4553d0.f7988a.c(mVar, 6).e(), (Float) null, pVar, mVar, 0, 4);
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
                a((androidx.compose.ui.d) obj, (C4889m) obj2, ((Number) obj3).intValue());
                return C16807N.f139792a;
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "a", "(LU0/m;I)V"}, k = 3, mv = {1, 8, 0})
        static final class f extends C17544u implements p<C4889m, Integer, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ long f7675c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ p<C4889m, Integer, C16807N> f7676d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            f(long j10, p<? super C4889m, ? super Integer, C16807N> pVar) {
                super(2);
                this.f7675c = j10;
                this.f7676d = pVar;
            }

            public final void a(C4889m mVar, int i10) {
                if ((i10 & 3) != 2 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(1694126319, i10, -1, "androidx.compose.material.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:160)");
                    }
                    W0.b(this.f7675c, (Y) null, (Float) null, this.f7676d, mVar, 0, 6);
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
        static final class g extends C17544u implements p<C4889m, Integer, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C4899r0<C5673m> f7677c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C5834E f7678d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ p<C4889m, Integer, C16807N> f7679e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            g(C4899r0<C5673m> r0Var, C5834E e10, p<? super C4889m, ? super Integer, C16807N> pVar) {
                super(2);
                this.f7677c = r0Var;
                this.f7678d = e10;
                this.f7679e = pVar;
            }

            public final void a(C4889m mVar, int i10) {
                if ((i10 & 3) != 2 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(-1212965554, i10, -1, "androidx.compose.material.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:185)");
                    }
                    androidx.compose.ui.d i11 = C4575o0.i(androidx.compose.ui.layout.a.b(androidx.compose.ui.d.f18749a, "border"), this.f7677c.getValue().q(), this.f7678d);
                    p<C4889m, Integer, C16807N> pVar = this.f7679e;
                    I h10 = C5077h.h(C5437c.f24302a.o(), true);
                    int a10 = C4883j.a(mVar, 0);
                    C4912y s10 = mVar.s();
                    androidx.compose.ui.d e10 = androidx.compose.ui.c.e(mVar, i11);
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
                    F1.c(a12, h10, aVar.c());
                    F1.c(a12, s10, aVar.e());
                    p<C4504g, Integer, C16807N> b10 = aVar.b();
                    if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                        a12.u(Integer.valueOf(a10));
                        a12.w(Integer.valueOf(a10), b10);
                    }
                    F1.c(a12, e10, aVar.d());
                    C5079j jVar = C5079j.f18125a;
                    if (pVar == null) {
                        mVar.W(719996434);
                    } else {
                        mVar.W(-392416305);
                        pVar.invoke(mVar, 0);
                    }
                    mVar.P();
                    mVar.x();
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

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(p<? super C4889m, ? super Integer, C16807N> pVar, p<? super C4889m, ? super Integer, C16807N> pVar2, String str, T0 t02, boolean z10, boolean z11, k kVar, p<? super C4889m, ? super Integer, C16807N> pVar3, p<? super C4889m, ? super Integer, C16807N> pVar4, i1 i1Var, a1 a1Var, p<? super C4889m, ? super Integer, C16807N> pVar5, boolean z12, C5834E e10, boolean z13, p<? super C4889m, ? super Integer, C16807N> pVar6) {
            super(6);
            this.f7645c = pVar;
            this.f7646d = pVar2;
            this.f7647e = str;
            this.f7648f = t02;
            this.f7649g = z10;
            this.f7650h = z11;
            this.f7651i = kVar;
            this.f7652j = pVar3;
            this.f7653k = pVar4;
            this.f7654l = i1Var;
            this.f7655m = a1Var;
            this.f7656n = pVar5;
            this.f7657o = z12;
            this.f7658p = e10;
            this.f7659q = z13;
            this.f7660r = pVar6;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: nI.l} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(float r21, long r22, long r24, float r26, U0.C4889m r27, int r28) {
            /*
                r20 = this;
                r0 = r20
                r9 = r21
                r10 = r26
                r15 = r27
                r1 = r28
                r2 = r1 & 6
                if (r2 != 0) goto L_0x0019
                boolean r2 = r15.c(r9)
                if (r2 == 0) goto L_0x0016
                r2 = 4
                goto L_0x0017
            L_0x0016:
                r2 = 2
            L_0x0017:
                r2 = r2 | r1
                goto L_0x001a
            L_0x0019:
                r2 = r1
            L_0x001a:
                r3 = r1 & 48
                r7 = r22
                if (r3 != 0) goto L_0x002c
                boolean r3 = r15.e(r7)
                if (r3 == 0) goto L_0x0029
                r3 = 32
                goto L_0x002b
            L_0x0029:
                r3 = 16
            L_0x002b:
                r2 = r2 | r3
            L_0x002c:
                r3 = r1 & 384(0x180, float:5.38E-43)
                if (r3 != 0) goto L_0x003f
                r3 = r24
                boolean r5 = r15.e(r3)
                if (r5 == 0) goto L_0x003b
                r5 = 256(0x100, float:3.59E-43)
                goto L_0x003d
            L_0x003b:
                r5 = 128(0x80, float:1.794E-43)
            L_0x003d:
                r2 = r2 | r5
                goto L_0x0041
            L_0x003f:
                r3 = r24
            L_0x0041:
                r1 = r1 & 3072(0xc00, float:4.305E-42)
                if (r1 != 0) goto L_0x0051
                boolean r1 = r15.c(r10)
                if (r1 == 0) goto L_0x004e
                r1 = 2048(0x800, float:2.87E-42)
                goto L_0x0050
            L_0x004e:
                r1 = 1024(0x400, float:1.435E-42)
            L_0x0050:
                r2 = r2 | r1
            L_0x0051:
                r13 = r2
                r1 = r13 & 9363(0x2493, float:1.312E-41)
                r2 = 9362(0x2492, float:1.3119E-41)
                if (r1 != r2) goto L_0x0064
                boolean r1 = r27.l()
                if (r1 != 0) goto L_0x005f
                goto L_0x0064
            L_0x005f:
                r27.L()
                goto L_0x0240
            L_0x0064:
                boolean r1 = U0.C4895p.J()
                if (r1 == 0) goto L_0x0073
                r1 = -1
                java.lang.String r2 = "androidx.compose.material.CommonDecorationBox.<anonymous> (TextFieldImpl.kt:122)"
                r5 = 225557475(0xd71bbe3, float:7.449002E-31)
                U0.C4895p.S(r5, r13, r1, r2)
            L_0x0073:
                nI.p<U0.m, java.lang.Integer, XH.N> r5 = r0.f7645c
                r14 = 54
                r6 = 0
                r2 = 1
                if (r5 != 0) goto L_0x0087
                r1 = -1572365903(0xffffffffa24799b1, float:-2.7050893E-18)
                r15.W(r1)
                r27.P()
                r12 = r2
                r7 = r6
                goto L_0x00ab
            L_0x0087:
                r1 = -1572365902(0xffffffffa24799b2, float:-2.7050895E-18)
                r15.W(r1)
                boolean r1 = r0.f7659q
                I0.W0$a$c r11 = new I0.W0$a$c
                r17 = r1
                r1 = r11
                r12 = r2
                r2 = r21
                r3 = r24
                r6 = r17
                r7 = r22
                r1.<init>(r2, r3, r5, r6, r7)
                r1 = -1865025495(0xffffffff90d5f829, float:-8.439604E-29)
                c1.a r1 = c1.c.e(r1, r12, r11, r15, r14)
                r27.P()
                r7 = r1
            L_0x00ab:
                nI.p<U0.m, java.lang.Integer, XH.N> r1 = r0.f7646d
                if (r1 == 0) goto L_0x00d9
                java.lang.String r1 = r0.f7647e
                int r1 = r1.length()
                if (r1 != 0) goto L_0x00d9
                r1 = 0
                int r1 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
                if (r1 <= 0) goto L_0x00d9
                r1 = -1571586748(0xffffffffa2537d44, float:-2.8662147E-18)
                r15.W(r1)
                I0.W0$a$e r1 = new I0.W0$a$e
                I0.T0 r2 = r0.f7648f
                boolean r3 = r0.f7649g
                nI.p<U0.m, java.lang.Integer, XH.N> r4 = r0.f7646d
                r1.<init>(r10, r2, r3, r4)
                r2 = -413527723(0xffffffffe75a1155, float:-1.0297956E24)
                c1.a r1 = c1.c.e(r2, r12, r1, r15, r14)
                r27.P()
                r8 = r1
                goto L_0x00e3
            L_0x00d9:
                r1 = -1571160716(0xffffffffa259fd74, float:-2.954316E-18)
                r15.W(r1)
                r27.P()
                r8 = 0
            L_0x00e3:
                I0.T0 r1 = r0.f7648f
                boolean r2 = r0.f7649g
                boolean r3 = r0.f7650h
                r0.k r4 = r0.f7651i
                r6 = 0
                r5 = r27
                U0.A1 r1 = r1.g(r2, r3, r4, r5, r6)
                java.lang.Object r1 = r1.getValue()
                p1.v0 r1 = (p1.C5747v0) r1
                long r1 = r1.y()
                nI.p<U0.m, java.lang.Integer, XH.N> r3 = r0.f7652j
                if (r3 != 0) goto L_0x010b
                r1 = -1570983241(0xffffffffa25cb2b7, float:-2.991017E-18)
                r15.W(r1)
                r27.P()
                r10 = 0
                goto L_0x0121
            L_0x010b:
                r4 = -1570983240(0xffffffffa25cb2b8, float:-2.9910173E-18)
                r15.W(r4)
                I0.W0$a$d r4 = new I0.W0$a$d
                r4.<init>(r1, r3)
                r1 = -1165144581(0xffffffffba8d4dfb, float:-0.0010780686)
                c1.a r1 = c1.c.e(r1, r12, r4, r15, r14)
                r27.P()
                r10 = r1
            L_0x0121:
                I0.T0 r1 = r0.f7648f
                boolean r2 = r0.f7649g
                boolean r3 = r0.f7650h
                r0.k r4 = r0.f7651i
                r6 = 0
                r5 = r27
                U0.A1 r1 = r1.j(r2, r3, r4, r5, r6)
                java.lang.Object r1 = r1.getValue()
                p1.v0 r1 = (p1.C5747v0) r1
                long r1 = r1.y()
                nI.p<U0.m, java.lang.Integer, XH.N> r3 = r0.f7653k
                if (r3 != 0) goto L_0x0149
                r1 = -1570681642(0xffffffffa2614cd6, float:-3.0533863E-18)
                r15.W(r1)
                r27.P()
                r6 = 0
                goto L_0x015f
            L_0x0149:
                r4 = -1570681641(0xffffffffa2614cd7, float:-3.0533865E-18)
                r15.W(r4)
                I0.W0$a$f r4 = new I0.W0$a$f
                r4.<init>(r1, r3)
                r1 = 1694126319(0x64fa50ef, float:3.6940143E22)
                c1.a r1 = c1.c.e(r1, r12, r4, r15, r14)
                r27.P()
                r6 = r1
            L_0x015f:
                androidx.compose.ui.d$a r1 = androidx.compose.ui.d.f18749a
                I0.T0 r2 = r0.f7648f
                boolean r3 = r0.f7649g
                r4 = 0
                U0.A1 r2 = r2.a(r3, r15, r4)
                java.lang.Object r2 = r2.getValue()
                p1.v0 r2 = (p1.C5747v0) r2
                long r2 = r2.y()
                p1.i1 r5 = r0.f7654l
                androidx.compose.ui.d r1 = androidx.compose.foundation.b.c(r1, r2, r5)
                I0.a1 r2 = r0.f7655m
                int[] r3 = I0.W0.a.b.f7663a
                int r2 = r2.ordinal()
                r2 = r3[r2]
                if (r2 == r12) goto L_0x0215
                r5 = 2
                if (r2 == r5) goto L_0x0194
                r1 = -1568365383(0xffffffffa284a4b9, float:-3.595308E-18)
                r15.W(r1)
                r27.P()
                goto L_0x0237
            L_0x0194:
                r2 = -1569791817(0xffffffffa26ee0b7, float:-3.2373978E-18)
                r15.W(r2)
                java.lang.Object r2 = r27.D()
                U0.m$a r5 = U0.C4889m.f14007a
                java.lang.Object r11 = r5.a()
                if (r2 != r11) goto L_0x01b9
                o1.m$a r2 = o1.C5673m.f26722b
                long r18 = r2.b()
                o1.m r2 = o1.C5673m.c(r18)
                r4 = 0
                r11 = 2
                U0.r0 r2 = U0.u1.e(r2, r4, r11, r4)
                r15.u(r2)
            L_0x01b9:
                U0.r0 r2 = (U0.C4899r0) r2
                I0.W0$a$g r4 = new I0.W0$a$g
                s0.E r11 = r0.f7658p
                nI.p<U0.m, java.lang.Integer, XH.N> r3 = r0.f7660r
                r4.<init>(r2, r11, r3)
                r3 = -1212965554(0xffffffffb7b39d4e, float:-2.1411714E-5)
                c1.a r11 = c1.c.e(r3, r12, r4, r15, r14)
                nI.p<U0.m, java.lang.Integer, XH.N> r3 = r0.f7656n
                boolean r14 = r0.f7657o
                r4 = r13 & 14
                r12 = 4
                if (r4 != r12) goto L_0x01d7
                r17 = 1
                goto L_0x01d9
            L_0x01d7:
                r17 = 0
            L_0x01d9:
                java.lang.Object r4 = r27.D()
                if (r17 != 0) goto L_0x01e5
                java.lang.Object r5 = r5.a()
                if (r4 != r5) goto L_0x01ed
            L_0x01e5:
                I0.W0$a$a r4 = new I0.W0$a$a
                r4.<init>(r9, r2)
                r15.u(r4)
            L_0x01ed:
                r12 = r4
                nI.l r12 = (nI.C17642l) r12
                s0.E r5 = r0.f7658p
                int r2 = r13 << 21
                r4 = 29360128(0x1c00000, float:7.052966E-38)
                r2 = r2 & r4
                r4 = 805306368(0x30000000, float:4.656613E-10)
                r13 = r2 | r4
                r16 = 0
                r2 = r3
                r3 = r8
                r4 = r7
                r17 = r5
                r5 = r10
                r7 = r14
                r8 = r21
                r9 = r12
                r10 = r11
                r11 = r17
                r12 = r27
                r14 = r16
                I0.C4575o0.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
                r27.P()
                goto L_0x0237
            L_0x0215:
                r2 = -1570370153(0xffffffffa2660d97, float:-3.1178007E-18)
                r15.W(r2)
                nI.p<U0.m, java.lang.Integer, XH.N> r2 = r0.f7656n
                boolean r11 = r0.f7657o
                s0.E r12 = r0.f7658p
                int r3 = r13 << 21
                r4 = 29360128(0x1c00000, float:7.052966E-38)
                r13 = r3 & r4
                r3 = r7
                r4 = r8
                r5 = r10
                r7 = r11
                r8 = r21
                r9 = r12
                r10 = r27
                r11 = r13
                I0.X0.b(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                r27.P()
            L_0x0237:
                boolean r1 = U0.C4895p.J()
                if (r1 == 0) goto L_0x0240
                U0.C4895p.R()
            L_0x0240:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: I0.W0.a.a(float, long, long, float, U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object o(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
            a(((Number) obj).floatValue(), ((C5747v0) obj2).y(), ((C5747v0) obj3).y(), ((Number) obj4).floatValue(), (C4889m) obj5, ((Number) obj6).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a1 f7680c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f7681d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f7682e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ b0 f7683f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f7684g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f7685h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f7686i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f7687j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ boolean f7688k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ boolean f7689l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ boolean f7690m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ k f7691n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ C5834E f7692o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ i1 f7693p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ T0 f7694q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f7695r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ int f7696s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ int f7697t;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a1 a1Var, String str, p<? super C4889m, ? super Integer, C16807N> pVar, b0 b0Var, p<? super C4889m, ? super Integer, C16807N> pVar2, p<? super C4889m, ? super Integer, C16807N> pVar3, p<? super C4889m, ? super Integer, C16807N> pVar4, p<? super C4889m, ? super Integer, C16807N> pVar5, boolean z10, boolean z11, boolean z12, k kVar, C5834E e10, i1 i1Var, T0 t02, p<? super C4889m, ? super Integer, C16807N> pVar6, int i10, int i11) {
            super(2);
            this.f7680c = a1Var;
            this.f7681d = str;
            this.f7682e = pVar;
            this.f7683f = b0Var;
            this.f7684g = pVar2;
            this.f7685h = pVar3;
            this.f7686i = pVar4;
            this.f7687j = pVar5;
            this.f7688k = z10;
            this.f7689l = z11;
            this.f7690m = z12;
            this.f7691n = kVar;
            this.f7692o = e10;
            this.f7693p = i1Var;
            this.f7694q = t02;
            this.f7695r = pVar6;
            this.f7696s = i10;
            this.f7697t = i11;
        }

        public final void a(C4889m mVar, int i10) {
            C4889m mVar2 = mVar;
            a1 a1Var = this.f7680c;
            a1 a1Var2 = a1Var;
            W0.a(a1Var2, this.f7681d, this.f7682e, this.f7683f, this.f7684g, this.f7685h, this.f7686i, this.f7687j, this.f7688k, this.f7689l, this.f7690m, this.f7691n, this.f7692o, this.f7693p, this.f7694q, this.f7695r, mVar2, M0.a(this.f7696s | 1), M0.a(this.f7697t));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LI0/Z;", "it", "Lp1/v0;", "a", "(LI0/Z;LU0/m;I)J"}, k = 3, mv = {1, 8, 0})
    static final class c extends C17544u implements nI.q<Z, C4889m, Integer, C5747v0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ T0 f7698c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f7699d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f7700e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ k f7701f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(T0 t02, boolean z10, boolean z11, k kVar) {
            super(3);
            this.f7698c = t02;
            this.f7699d = z10;
            this.f7700e = z11;
            this.f7701f = kVar;
        }

        public final long a(Z z10, C4889m mVar, int i10) {
            mVar.W(-1272940975);
            if (C4895p.J()) {
                C4895p.S(-1272940975, i10, -1, "androidx.compose.material.CommonDecorationBox.<anonymous> (TextFieldImpl.kt:94)");
            }
            long y10 = this.f7698c.e(this.f7699d, z10 == Z.UnfocusedEmpty ? false : this.f7700e, this.f7701f, mVar, 0).getValue().y();
            if (C4895p.J()) {
                C4895p.R();
            }
            mVar.P();
            return y10;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return C5747v0.k(a((Z) obj, (C4889m) obj2, ((Number) obj3).intValue()));
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class d extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f7702c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Y f7703d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Float f7704e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f7705f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f7706g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f7707h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(long j10, Y y10, Float f10, p<? super C4889m, ? super Integer, C16807N> pVar, int i10, int i11) {
            super(2);
            this.f7702c = j10;
            this.f7703d = y10;
            this.f7704e = f10;
            this.f7705f = pVar;
            this.f7706g = i10;
            this.f7707h = i11;
        }

        public final void a(C4889m mVar, int i10) {
            W0.b(this.f7702c, this.f7703d, this.f7704e, this.f7705f, mVar, M0.a(this.f7706g | 1), this.f7707h);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "a", "(LU0/m;I)V"}, k = 3, mv = {1, 8, 0})
    static final class e extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f7708c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Float f7709d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f7710e;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "a", "(LU0/m;I)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends C17544u implements p<C4889m, Integer, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ Float f7711c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ p<C4889m, Integer, C16807N> f7712d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ long f7713e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(Float f10, p<? super C4889m, ? super Integer, C16807N> pVar, long j10) {
                super(2);
                this.f7711c = f10;
                this.f7712d = pVar;
                this.f7713e = j10;
            }

            public final void a(C4889m mVar, int i10) {
                if ((i10 & 3) != 2 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(-1132188434, i10, -1, "androidx.compose.material.Decoration.<anonymous>.<anonymous> (TextFieldImpl.kt:232)");
                    }
                    if (this.f7711c != null) {
                        mVar.W(-1178229056);
                        C4910x.a(r.a().d(this.f7711c), this.f7712d, mVar, J0.f13770i);
                        mVar.P();
                    } else {
                        mVar.W(-1178050310);
                        C4910x.a(r.a().d(Float.valueOf(C5747v0.r(this.f7713e))), this.f7712d, mVar, J0.f13770i);
                        mVar.P();
                    }
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

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(long j10, Float f10, p<? super C4889m, ? super Integer, C16807N> pVar) {
            super(2);
            this.f7708c = j10;
            this.f7709d = f10;
            this.f7710e = pVar;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(494684590, i10, -1, "androidx.compose.material.Decoration.<anonymous> (TextFieldImpl.kt:231)");
                }
                C4910x.a(C4581s.a().d(C5747v0.k(this.f7708c)), c1.c.e(-1132188434, true, new a(this.f7709d, this.f7710e, this.f7708c), mVar, 54), mVar, J0.f13770i | 48);
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LL1/x;", "LXH/N;", "a", "(LL1/x;)V"}, k = 3, mv = {1, 8, 0})
    static final class f extends C17544u implements C17642l<x, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f7714c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(String str) {
            super(1);
            this.f7714c = str;
        }

        public final void a(x xVar) {
            v.o(xVar, this.f7714c);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((x) obj);
            return C16807N.f139792a;
        }
    }

    static {
        float f10 = (float) 48;
        f7644d = J.a(androidx.compose.ui.d.f18749a, h.B(f10), h.B(f10));
    }

    public static final void a(a1 a1Var, String str, p<? super C4889m, ? super Integer, C16807N> pVar, b0 b0Var, p<? super C4889m, ? super Integer, C16807N> pVar2, p<? super C4889m, ? super Integer, C16807N> pVar3, p<? super C4889m, ? super Integer, C16807N> pVar4, p<? super C4889m, ? super Integer, C16807N> pVar5, boolean z10, boolean z11, boolean z12, k kVar, C5834E e10, i1 i1Var, T0 t02, p<? super C4889m, ? super Integer, C16807N> pVar6, C4889m mVar, int i10, int i11) {
        int i12;
        int i13;
        C4889m mVar2;
        b0 b0Var2 = b0Var;
        p<? super C4889m, ? super Integer, C16807N> pVar7 = pVar2;
        boolean z13 = z11;
        boolean z14 = z12;
        k kVar2 = kVar;
        T0 t03 = t02;
        int i14 = i10;
        int i15 = i11;
        C4889m k10 = mVar.k(341783750);
        a1 a1Var2 = a1Var;
        if ((i14 & 6) == 0) {
            i12 = (k10.V(a1Var2) ? 4 : 2) | i14;
        } else {
            i12 = i14;
        }
        if ((i14 & 48) == 0) {
            i12 |= k10.V(str) ? 32 : 16;
        } else {
            String str2 = str;
        }
        int i16 = 128;
        if ((i14 & 384) == 0) {
            i12 |= k10.F(pVar) ? 256 : 128;
        } else {
            p<? super C4889m, ? super Integer, C16807N> pVar8 = pVar;
        }
        int i17 = 1024;
        if ((i14 & 3072) == 0) {
            i12 |= k10.V(b0Var2) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        int i18 = 8192;
        if ((i14 & 24576) == 0) {
            i12 |= k10.F(pVar7) ? 16384 : 8192;
        }
        int i19 = i14 & ImageMetadata.EDGE_MODE;
        int i20 = ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        p<? super C4889m, ? super Integer, C16807N> pVar9 = pVar3;
        if (i19 == 0) {
            i12 |= k10.F(pVar9) ? 131072 : 65536;
        }
        p<? super C4889m, ? super Integer, C16807N> pVar10 = pVar4;
        if ((i14 & 1572864) == 0) {
            i12 |= k10.F(pVar10) ? ImageMetadata.SHADING_MODE : ImageMetadata.LENS_APERTURE;
        }
        p<? super C4889m, ? super Integer, C16807N> pVar11 = pVar5;
        if ((i14 & 12582912) == 0) {
            i12 |= k10.F(pVar11) ? 8388608 : 4194304;
        }
        boolean z15 = z10;
        if ((i14 & 100663296) == 0) {
            i12 |= k10.b(z15) ? 67108864 : 33554432;
        }
        if ((i14 & 805306368) == 0) {
            i12 |= k10.b(z13) ? 536870912 : 268435456;
        }
        if ((i15 & 6) == 0) {
            i13 = i15 | (k10.b(z14) ? 4 : 2);
        } else {
            i13 = i15;
        }
        if ((i15 & 48) == 0) {
            i13 |= k10.V(kVar2) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            if (k10.V(e10)) {
                i16 = 256;
            }
            i13 |= i16;
        } else {
            C5834E e11 = e10;
        }
        if ((i15 & 3072) == 0) {
            if (k10.V(i1Var)) {
                i17 = RecyclerView.n.FLAG_MOVED;
            }
            i13 |= i17;
        } else {
            i1 i1Var2 = i1Var;
        }
        if ((i15 & 24576) == 0) {
            if (k10.V(t03)) {
                i18 = 16384;
            }
            i13 |= i18;
        }
        if ((196608 & i15) == 0) {
            if (k10.F(pVar6)) {
                i20 = 131072;
            }
            i13 |= i20;
        } else {
            p<? super C4889m, ? super Integer, C16807N> pVar12 = pVar6;
        }
        int i21 = i13;
        if ((i12 & 306783379) == 306783378 && (74899 & i21) == 74898 && k10.l()) {
            k10.L();
            mVar2 = k10;
        } else {
            if (C4895p.J()) {
                C4895p.S(341783750, i12, i21, "androidx.compose.material.CommonDecorationBox (TextFieldImpl.kt:81)");
            }
            boolean z16 = false;
            boolean z17 = ((i12 & 7168) == 2048) | ((i12 & 112) == 32);
            Object D10 = k10.D();
            if (z17 || D10 == C4889m.f14007a.a()) {
                D10 = b0Var2.a(new C4669d(str, (List) null, (List) null, 6, (DefaultConstructorMarker) null));
                k10.u(D10);
            }
            String j10 = ((T1.Z) D10).b().j();
            Z z18 = C5814f.a(kVar2, k10, (i21 >> 3) & 14).getValue().booleanValue() ? Z.Focused : j10.length() == 0 ? Z.UnfocusedEmpty : Z.UnfocusedNotEmpty;
            c cVar = new c(t03, z13, z14, kVar2);
            C4553d0 d0Var = C4553d0.f7988a;
            d1 c10 = d0Var.c(k10, 6);
            Y e12 = c10.e();
            Y d10 = c10.d();
            long h10 = e12.h();
            C5747v0.a aVar = C5747v0.f27350b;
            boolean z19 = (C5747v0.q(h10, aVar.i()) && !C5747v0.q(d10.h(), aVar.i())) || (!C5747v0.q(e12.h(), aVar.i()) && C5747v0.q(d10.h(), aVar.i()));
            Z0 z02 = Z0.f7794a;
            k10.W(1578865765);
            long h11 = d0Var.c(k10, 6).d().h();
            if (z19) {
                k10.W(-1572851052);
                if (h11 == 16) {
                    h11 = ((C5747v0) cVar.invoke(z18, k10, 0)).y();
                }
            } else {
                k10.W(780548205);
            }
            k10.P();
            long j11 = h11;
            k10.P();
            k10.W(1578871879);
            long h12 = d0Var.c(k10, 6).e().h();
            if (z19) {
                k10.W(-1572659596);
                if (h12 == 16) {
                    h12 = ((C5747v0) cVar.invoke(z18, k10, 0)).y();
                }
            } else {
                k10.W(780554381);
            }
            k10.P();
            long j12 = h12;
            k10.P();
            if (pVar7 != null) {
                z16 = true;
            }
            mVar2 = k10;
            z02.a(z18, j11, j12, cVar, z16, c1.c.e(225557475, true, new a(pVar2, pVar3, j10, t02, z11, z12, kVar, pVar4, pVar5, i1Var, a1Var, pVar, z10, e10, z19, pVar6), mVar2, 54), mVar2, 1769472);
            if (C4895p.J()) {
                C4895p.R();
            }
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            b bVar = r0;
            b bVar2 = new b(a1Var, str, pVar, b0Var, pVar2, pVar3, pVar4, pVar5, z10, z11, z12, kVar, e10, i1Var, t02, pVar6, i10, i11);
            n10.a(bVar);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(long r13, N1.Y r15, java.lang.Float r16, nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r17, U0.C4889m r18, int r19, int r20) {
        /*
            r1 = r13
            r5 = r17
            r6 = r19
            r0 = -399493340(0xffffffffe8303724, float:-3.3286147E24)
            r3 = r18
            U0.m r3 = r3.k(r0)
            r4 = r20 & 1
            if (r4 == 0) goto L_0x0015
            r4 = r6 | 6
            goto L_0x0025
        L_0x0015:
            r4 = r6 & 6
            if (r4 != 0) goto L_0x0024
            boolean r4 = r3.e(r13)
            if (r4 == 0) goto L_0x0021
            r4 = 4
            goto L_0x0022
        L_0x0021:
            r4 = 2
        L_0x0022:
            r4 = r4 | r6
            goto L_0x0025
        L_0x0024:
            r4 = r6
        L_0x0025:
            r7 = r20 & 2
            if (r7 == 0) goto L_0x002d
            r4 = r4 | 48
        L_0x002b:
            r8 = r15
            goto L_0x003e
        L_0x002d:
            r8 = r6 & 48
            if (r8 != 0) goto L_0x002b
            r8 = r15
            boolean r9 = r3.V(r15)
            if (r9 == 0) goto L_0x003b
            r9 = 32
            goto L_0x003d
        L_0x003b:
            r9 = 16
        L_0x003d:
            r4 = r4 | r9
        L_0x003e:
            r9 = r20 & 4
            if (r9 == 0) goto L_0x0047
            r4 = r4 | 384(0x180, float:5.38E-43)
        L_0x0044:
            r10 = r16
            goto L_0x0059
        L_0x0047:
            r10 = r6 & 384(0x180, float:5.38E-43)
            if (r10 != 0) goto L_0x0044
            r10 = r16
            boolean r11 = r3.V(r10)
            if (r11 == 0) goto L_0x0056
            r11 = 256(0x100, float:3.59E-43)
            goto L_0x0058
        L_0x0056:
            r11 = 128(0x80, float:1.794E-43)
        L_0x0058:
            r4 = r4 | r11
        L_0x0059:
            r11 = r20 & 8
            if (r11 == 0) goto L_0x0060
            r4 = r4 | 3072(0xc00, float:4.305E-42)
            goto L_0x0070
        L_0x0060:
            r11 = r6 & 3072(0xc00, float:4.305E-42)
            if (r11 != 0) goto L_0x0070
            boolean r11 = r3.F(r5)
            if (r11 == 0) goto L_0x006d
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x006f
        L_0x006d:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x006f:
            r4 = r4 | r11
        L_0x0070:
            r11 = r4 & 1171(0x493, float:1.641E-42)
            r12 = 1170(0x492, float:1.64E-42)
            if (r11 != r12) goto L_0x0082
            boolean r11 = r3.l()
            if (r11 != 0) goto L_0x007d
            goto L_0x0082
        L_0x007d:
            r3.L()
        L_0x0080:
            r4 = r10
            goto L_0x00d2
        L_0x0082:
            r11 = 0
            if (r7 == 0) goto L_0x0086
            r8 = r11
        L_0x0086:
            if (r9 == 0) goto L_0x0089
            r10 = r11
        L_0x0089:
            boolean r7 = U0.C4895p.J()
            if (r7 == 0) goto L_0x0095
            r7 = -1
            java.lang.String r9 = "androidx.compose.material.Decoration (TextFieldImpl.kt:229)"
            U0.C4895p.S(r0, r4, r7, r9)
        L_0x0095:
            I0.W0$e r0 = new I0.W0$e
            r0.<init>(r13, r10, r5)
            r7 = 54
            r9 = 494684590(0x1d7c49ae, float:3.3390014E-21)
            r11 = 1
            c1.a r0 = c1.c.e(r9, r11, r0, r3, r7)
            if (r8 == 0) goto L_0x00b9
            r7 = 2115969060(0x7e1f2024, float:5.2878534E37)
            r3.W(r7)
            int r4 = r4 >> 3
            r4 = r4 & 14
            r4 = r4 | 48
            I0.b1.a(r8, r0, r3, r4)
        L_0x00b5:
            r3.P()
            goto L_0x00c8
        L_0x00b9:
            r4 = 2115970696(0x7e1f2688, float:5.288683E37)
            r3.W(r4)
            r4 = 6
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0.invoke(r3, r4)
            goto L_0x00b5
        L_0x00c8:
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0080
            U0.C4895p.R()
            goto L_0x0080
        L_0x00d2:
            U0.Y0 r9 = r3.n()
            if (r9 == 0) goto L_0x00e9
            I0.W0$d r10 = new I0.W0$d
            r0 = r10
            r1 = r13
            r3 = r8
            r5 = r17
            r6 = r19
            r7 = r20
            r0.<init>(r1, r3, r4, r5, r6, r7)
            r9.a(r10)
        L_0x00e9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: I0.W0.b(long, N1.Y, java.lang.Float, nI.p, U0.m, int, int):void");
    }

    public static final androidx.compose.ui.d c(androidx.compose.ui.d dVar, boolean z10, String str) {
        return z10 ? L1.o.d(dVar, false, new f(str), 1, (Object) null) : dVar;
    }

    public static final float d() {
        return f7643c;
    }

    public static final androidx.compose.ui.d e() {
        return f7644d;
    }

    public static final Object f(C4484q qVar) {
        Object h10 = qVar.h();
        C4491y yVar = h10 instanceof C4491y ? (C4491y) h10 : null;
        if (yVar != null) {
            return yVar.e1();
        }
        return null;
    }

    public static final float g() {
        return f7642b;
    }

    public static final long h() {
        return f7641a;
    }

    public static final int i(a0 a0Var) {
        if (a0Var != null) {
            return a0Var.z0();
        }
        return 0;
    }

    public static final int j(a0 a0Var) {
        if (a0Var != null) {
            return a0Var.E0();
        }
        return 0;
    }
}
