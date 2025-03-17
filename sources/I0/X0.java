package I0;

import B0.A;
import B0.C4381z;
import E1.I;
import E1.a0;
import G1.C4504g;
import N1.Y;
import T1.P;
import T1.b0;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import androidx.compose.foundation.layout.C5077h;
import androidx.compose.foundation.layout.C5079j;
import androidx.compose.foundation.layout.D;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.C5100f0;
import androidx.recyclerview.widget.RecyclerView;
import c2.C5267b;
import c2.h;
import c2.t;
import com.google.ar.core.ImageMetadata;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import n0.C5601g;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import o1.C5668h;
import o1.C5673m;
import p1.C5749w0;
import p1.V0;
import p1.i1;
import pI.C17752b;
import r0.m;
import r1.C5817c;
import r1.f;
import s0.C5834E;
import tI.C17978n;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u0002\u0010\"\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f2\b\b\u0002\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00072\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00192\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010!\u001a\u00020 H\u0007¢\u0006\u0004\b\"\u0010#\u001a\u0001\u0010+\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f2\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f2\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)H\u0001¢\u0006\u0004\b+\u0010,\u001a\u001b\u0010.\u001a\u00020\u0019*\u00020\u00192\u0006\u0010-\u001a\u00020\u0019H\u0002¢\u0006\u0004\b.\u0010/\u001aB\u00107\u001a\u00020\u00192\u0006\u00100\u001a\u00020\u00192\u0006\u00101\u001a\u00020\u00192\u0006\u00102\u001a\u00020\u00192\u0006\u00103\u001a\u00020\u00192\u0006\u00104\u001a\u00020\u00192\u0006\u00106\u001a\u000205H\u0002ø\u0001\u0000¢\u0006\u0004\b7\u00108\u001aZ\u0010@\u001a\u00020\u00192\u0006\u00109\u001a\u00020\u00192\u0006\u0010:\u001a\u00020\u00072\u0006\u0010;\u001a\u00020\u00192\u0006\u0010<\u001a\u00020\u00192\u0006\u0010=\u001a\u00020\u00192\u0006\u0010>\u001a\u00020\u00192\u0006\u00106\u001a\u0002052\u0006\u0010?\u001a\u00020'2\u0006\u0010*\u001a\u00020)H\u0002ø\u0001\u0000¢\u0006\u0004\b@\u0010A\u001a{\u0010M\u001a\u00020\u0003*\u00020B2\u0006\u0010C\u001a\u00020\u00192\u0006\u0010D\u001a\u00020\u00192\u0006\u0010F\u001a\u00020E2\b\u0010G\u001a\u0004\u0018\u00010E2\b\u0010H\u001a\u0004\u0018\u00010E2\b\u0010I\u001a\u0004\u0018\u00010E2\b\u0010J\u001a\u0004\u0018\u00010E2\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010K\u001a\u00020\u00192\u0006\u0010L\u001a\u00020\u00192\u0006\u0010(\u001a\u00020'2\u0006\u0010?\u001a\u00020'H\u0002¢\u0006\u0004\bM\u0010N\u001aa\u0010P\u001a\u00020\u0003*\u00020B2\u0006\u0010C\u001a\u00020\u00192\u0006\u0010D\u001a\u00020\u00192\u0006\u0010O\u001a\u00020E2\b\u0010H\u001a\u0004\u0018\u00010E2\b\u0010I\u001a\u0004\u0018\u00010E2\b\u0010J\u001a\u0004\u0018\u00010E2\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010?\u001a\u00020'2\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\bP\u0010Q\u001a\u001b\u0010T\u001a\u00020\u0005*\u00020\u00052\u0006\u0010S\u001a\u00020RH\u0000¢\u0006\u0004\bT\u0010U\"\u001a\u0010Z\u001a\u00020V8\u0000X\u0004¢\u0006\f\n\u0004\b\"\u0010W\u001a\u0004\bX\u0010Y\"\u001a\u0010\\\u001a\u00020V8\u0000X\u0004¢\u0006\f\n\u0004\b+\u0010W\u001a\u0004\b[\u0010Y\"\u001a\u0010_\u001a\u00020V8\u0000X\u0004¢\u0006\f\n\u0004\b]\u0010W\u001a\u0004\b^\u0010Y\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006`"}, d2 = {"LT1/P;", "value", "Lkotlin/Function1;", "LXH/N;", "onValueChange", "Landroidx/compose/ui/d;", "modifier", "", "enabled", "readOnly", "LN1/Y;", "textStyle", "Lkotlin/Function0;", "label", "placeholder", "leadingIcon", "trailingIcon", "isError", "LT1/b0;", "visualTransformation", "LB0/A;", "keyboardOptions", "LB0/z;", "keyboardActions", "singleLine", "", "maxLines", "minLines", "Lr0/m;", "interactionSource", "Lp1/i1;", "shape", "LI0/T0;", "colors", "a", "(LT1/P;LnI/l;Landroidx/compose/ui/d;ZZLN1/Y;LnI/p;LnI/p;LnI/p;LnI/p;ZLT1/b0;LB0/A;LB0/z;ZIILr0/m;Lp1/i1;LI0/T0;LU0/m;III)V", "textField", "leading", "trailing", "", "animationProgress", "Ls0/E;", "paddingValues", "b", "(Landroidx/compose/ui/d;LnI/p;LnI/p;LnI/q;LnI/p;LnI/p;ZFLs0/E;LU0/m;I)V", "from", "p", "(II)I", "leadingWidth", "trailingWidth", "textFieldWidth", "labelWidth", "placeholderWidth", "Lc2/b;", "constraints", "i", "(IIIIIJ)I", "textFieldHeight", "hasLabel", "labelBaseline", "leadingHeight", "trailingHeight", "placeholderHeight", "density", "h", "(IZIIIIJFLs0/E;)I", "LE1/a0$a;", "width", "height", "LE1/a0;", "textfieldPlaceable", "labelPlaceable", "placeholderPlaceable", "leadingPlaceable", "trailingPlaceable", "labelEndPosition", "textPosition", "n", "(LE1/a0$a;IILE1/a0;LE1/a0;LE1/a0;LE1/a0;LE1/a0;ZIIFF)V", "textPlaceable", "o", "(LE1/a0$a;IILE1/a0;LE1/a0;LE1/a0;LE1/a0;ZFLs0/E;)V", "Ln0/g;", "indicatorBorder", "j", "(Landroidx/compose/ui/d;Ln0/g;)Landroidx/compose/ui/d;", "Lc2/h;", "F", "k", "()F", "FirstBaselineOffset", "l", "TextFieldBottomPadding", "c", "m", "TextFieldTopPadding", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class X0 {

    /* renamed from: a  reason: collision with root package name */
    private static final float f7716a = h.B((float) 20);

    /* renamed from: b  reason: collision with root package name */
    private static final float f7717b = h.B((float) 10);

    /* renamed from: c  reason: collision with root package name */
    private static final float f7718c = h.B((float) 2);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Function0;", "LXH/N;", "innerTextField", "a", "(LnI/p;LU0/m;I)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements q<p<? super C4889m, ? super Integer, ? extends C16807N>, C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ P f7719c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f7720d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f7721e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ b0 f7722f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ m f7723g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ boolean f7724h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f7725i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f7726j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f7727k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f7728l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ i1 f7729m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ T0 f7730n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(P p10, boolean z10, boolean z11, b0 b0Var, m mVar, boolean z12, p<? super C4889m, ? super Integer, C16807N> pVar, p<? super C4889m, ? super Integer, C16807N> pVar2, p<? super C4889m, ? super Integer, C16807N> pVar3, p<? super C4889m, ? super Integer, C16807N> pVar4, i1 i1Var, T0 t02) {
            super(3);
            this.f7719c = p10;
            this.f7720d = z10;
            this.f7721e = z11;
            this.f7722f = b0Var;
            this.f7723g = mVar;
            this.f7724h = z12;
            this.f7725i = pVar;
            this.f7726j = pVar2;
            this.f7727k = pVar3;
            this.f7728l = pVar4;
            this.f7729m = i1Var;
            this.f7730n = t02;
        }

        public final void a(p<? super C4889m, ? super Integer, C16807N> pVar, C4889m mVar, int i10) {
            int i11;
            if ((i10 & 6) == 0) {
                i11 = i10 | (mVar.F(pVar) ? 4 : 2);
            } else {
                p<? super C4889m, ? super Integer, C16807N> pVar2 = pVar;
                C4889m mVar2 = mVar;
                i11 = i10;
            }
            if ((i11 & 19) != 18 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-126640971, i11, -1, "androidx.compose.material.TextField.<anonymous> (TextField.kt:404)");
                }
                U0.f7558a.a(this.f7719c.i(), pVar, this.f7720d, this.f7721e, this.f7722f, this.f7723g, this.f7724h, this.f7725i, this.f7726j, this.f7727k, this.f7728l, this.f7729m, this.f7730n, (C5834E) null, mVar, (i11 << 3) & 112, 24576, 8192);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((p) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ P f7731c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17642l<P, C16807N> f7732d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f7733e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f7734f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ boolean f7735g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Y f7736h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f7737i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f7738j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f7739k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f7740l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ boolean f7741m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ b0 f7742n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ A f7743o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ C4381z f7744p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ boolean f7745q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ int f7746r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ int f7747s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ m f7748t;

        /* renamed from: u  reason: collision with root package name */
        final /* synthetic */ i1 f7749u;

        /* renamed from: v  reason: collision with root package name */
        final /* synthetic */ T0 f7750v;

        /* renamed from: w  reason: collision with root package name */
        final /* synthetic */ int f7751w;

        /* renamed from: x  reason: collision with root package name */
        final /* synthetic */ int f7752x;

        /* renamed from: y  reason: collision with root package name */
        final /* synthetic */ int f7753y;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(P p10, C17642l<? super P, C16807N> lVar, androidx.compose.ui.d dVar, boolean z10, boolean z11, Y y10, p<? super C4889m, ? super Integer, C16807N> pVar, p<? super C4889m, ? super Integer, C16807N> pVar2, p<? super C4889m, ? super Integer, C16807N> pVar3, p<? super C4889m, ? super Integer, C16807N> pVar4, boolean z12, b0 b0Var, A a10, C4381z zVar, boolean z13, int i10, int i11, m mVar, i1 i1Var, T0 t02, int i12, int i13, int i14) {
            super(2);
            this.f7731c = p10;
            this.f7732d = lVar;
            this.f7733e = dVar;
            this.f7734f = z10;
            this.f7735g = z11;
            this.f7736h = y10;
            this.f7737i = pVar;
            this.f7738j = pVar2;
            this.f7739k = pVar3;
            this.f7740l = pVar4;
            this.f7741m = z12;
            this.f7742n = b0Var;
            this.f7743o = a10;
            this.f7744p = zVar;
            this.f7745q = z13;
            this.f7746r = i10;
            this.f7747s = i11;
            this.f7748t = mVar;
            this.f7749u = i1Var;
            this.f7750v = t02;
            this.f7751w = i12;
            this.f7752x = i13;
            this.f7753y = i14;
        }

        public final void a(C4889m mVar, int i10) {
            C4889m mVar2 = mVar;
            P p10 = this.f7731c;
            P p11 = p10;
            X0.a(p11, this.f7732d, this.f7733e, this.f7734f, this.f7735g, this.f7736h, this.f7737i, this.f7738j, this.f7739k, this.f7740l, this.f7741m, this.f7742n, this.f7743o, this.f7744p, this.f7745q, this.f7746r, this.f7747s, this.f7748t, this.f7749u, this.f7750v, mVar2, M0.a(this.f7751w | 1), M0.a(this.f7752x), this.f7753y);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class c extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f7754c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f7755d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f7756e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ q<androidx.compose.ui.d, C4889m, Integer, C16807N> f7757f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f7758g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f7759h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ boolean f7760i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ float f7761j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ C5834E f7762k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ int f7763l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(androidx.compose.ui.d dVar, p<? super C4889m, ? super Integer, C16807N> pVar, p<? super C4889m, ? super Integer, C16807N> pVar2, q<? super androidx.compose.ui.d, ? super C4889m, ? super Integer, C16807N> qVar, p<? super C4889m, ? super Integer, C16807N> pVar3, p<? super C4889m, ? super Integer, C16807N> pVar4, boolean z10, float f10, C5834E e10, int i10) {
            super(2);
            this.f7754c = dVar;
            this.f7755d = pVar;
            this.f7756e = pVar2;
            this.f7757f = qVar;
            this.f7758g = pVar3;
            this.f7759h = pVar4;
            this.f7760i = z10;
            this.f7761j = f10;
            this.f7762k = e10;
            this.f7763l = i10;
        }

        public final void a(C4889m mVar, int i10) {
            X0.b(this.f7754c, this.f7755d, this.f7756e, this.f7757f, this.f7758g, this.f7759h, this.f7760i, this.f7761j, this.f7762k, mVar, M0.a(this.f7763l | 1));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lr1/c;", "LXH/N;", "a", "(Lr1/c;)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends C17544u implements C17642l<C5817c, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ float f7764c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C5601g f7765d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(float f10, C5601g gVar) {
            super(1);
            this.f7764c = f10;
            this.f7765d = gVar;
        }

        public final void a(C5817c cVar) {
            cVar.V1();
            if (!h.D(this.f7764c, h.f23031b.a())) {
                float density = this.f7764c * cVar.getDensity();
                float i10 = C5673m.i(cVar.b()) - (density / ((float) 2));
                f.h1(cVar, this.f7765d.a(), C5668h.a(0.0f, i10), C5668h.a(C5673m.l(cVar.b()), i10), density, 0, (V0) null, 0.0f, (C5749w0) null, 0, 496, (Object) null);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C5817c) obj);
            return C16807N.f139792a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:107:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0179  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x01af  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x01b4  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x01c9  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x01e0  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x01e8  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x01ed  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0206  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x020b  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x0224  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x023a  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x0242  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x0256  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x0272  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x029b  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:319:0x05d9  */
    /* JADX WARNING: Removed duplicated region for block: B:321:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0126  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(T1.P r103, nI.C17642l<? super T1.P, XH.C16807N> r104, androidx.compose.ui.d r105, boolean r106, boolean r107, N1.Y r108, nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r109, nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r110, nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r111, nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r112, boolean r113, T1.b0 r114, B0.A r115, B0.C4381z r116, boolean r117, int r118, int r119, r0.m r120, p1.i1 r121, I0.T0 r122, U0.C4889m r123, int r124, int r125, int r126) {
        /*
            r15 = r124
            r14 = r125
            r13 = r126
            r0 = -359119489(0xffffffffea98457f, float:-9.2042455E25)
            r1 = r123
            U0.m r0 = r1.k(r0)
            r1 = r13 & 1
            if (r1 == 0) goto L_0x0019
            r1 = r15 | 6
            r4 = r1
            r1 = r103
            goto L_0x002d
        L_0x0019:
            r1 = r15 & 6
            if (r1 != 0) goto L_0x002a
            r1 = r103
            boolean r4 = r0.V(r1)
            if (r4 == 0) goto L_0x0027
            r4 = 4
            goto L_0x0028
        L_0x0027:
            r4 = 2
        L_0x0028:
            r4 = r4 | r15
            goto L_0x002d
        L_0x002a:
            r1 = r103
            r4 = r15
        L_0x002d:
            r5 = r13 & 2
            if (r5 == 0) goto L_0x0036
            r4 = r4 | 48
        L_0x0033:
            r5 = r104
            goto L_0x0048
        L_0x0036:
            r5 = r15 & 48
            if (r5 != 0) goto L_0x0033
            r5 = r104
            boolean r8 = r0.F(r5)
            if (r8 == 0) goto L_0x0045
            r8 = 32
            goto L_0x0047
        L_0x0045:
            r8 = 16
        L_0x0047:
            r4 = r4 | r8
        L_0x0048:
            r8 = r13 & 4
            if (r8 == 0) goto L_0x0051
            r4 = r4 | 384(0x180, float:5.38E-43)
        L_0x004e:
            r11 = r105
            goto L_0x0063
        L_0x0051:
            r11 = r15 & 384(0x180, float:5.38E-43)
            if (r11 != 0) goto L_0x004e
            r11 = r105
            boolean r12 = r0.V(r11)
            if (r12 == 0) goto L_0x0060
            r12 = 256(0x100, float:3.59E-43)
            goto L_0x0062
        L_0x0060:
            r12 = 128(0x80, float:1.794E-43)
        L_0x0062:
            r4 = r4 | r12
        L_0x0063:
            r12 = r13 & 8
            r16 = 1024(0x400, float:1.435E-42)
            r17 = 2048(0x800, float:2.87E-42)
            if (r12 == 0) goto L_0x0070
            r4 = r4 | 3072(0xc00, float:4.305E-42)
        L_0x006d:
            r2 = r106
            goto L_0x0083
        L_0x0070:
            r2 = r15 & 3072(0xc00, float:4.305E-42)
            if (r2 != 0) goto L_0x006d
            r2 = r106
            boolean r18 = r0.b(r2)
            if (r18 == 0) goto L_0x007f
            r18 = r17
            goto L_0x0081
        L_0x007f:
            r18 = r16
        L_0x0081:
            r4 = r4 | r18
        L_0x0083:
            r18 = r13 & 16
            r19 = 16384(0x4000, float:2.2959E-41)
            r20 = 8192(0x2000, float:1.14794E-41)
            if (r18 == 0) goto L_0x0090
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
        L_0x008d:
            r3 = r107
            goto L_0x00a3
        L_0x0090:
            r3 = r15 & 24576(0x6000, float:3.4438E-41)
            if (r3 != 0) goto L_0x008d
            r3 = r107
            boolean r22 = r0.b(r3)
            if (r22 == 0) goto L_0x009f
            r22 = r19
            goto L_0x00a1
        L_0x009f:
            r22 = r20
        L_0x00a1:
            r4 = r4 | r22
        L_0x00a3:
            r64 = 196608(0x30000, float:2.75506E-40)
            r22 = r15 & r64
            if (r22 != 0) goto L_0x00bd
            r22 = r13 & 32
            r6 = r108
            if (r22 != 0) goto L_0x00b8
            boolean r23 = r0.V(r6)
            if (r23 == 0) goto L_0x00b8
            r23 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ba
        L_0x00b8:
            r23 = 65536(0x10000, float:9.18355E-41)
        L_0x00ba:
            r4 = r4 | r23
            goto L_0x00bf
        L_0x00bd:
            r6 = r108
        L_0x00bf:
            r23 = r13 & 64
            r24 = 1572864(0x180000, float:2.204052E-39)
            r25 = 524288(0x80000, float:7.34684E-40)
            if (r23 == 0) goto L_0x00cc
            r4 = r4 | r24
            r7 = r109
            goto L_0x00df
        L_0x00cc:
            r26 = r15 & r24
            r7 = r109
            if (r26 != 0) goto L_0x00df
            boolean r27 = r0.F(r7)
            if (r27 == 0) goto L_0x00db
            r27 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00dd
        L_0x00db:
            r27 = r25
        L_0x00dd:
            r4 = r4 | r27
        L_0x00df:
            r9 = r13 & 128(0x80, float:1.794E-43)
            r28 = 12582912(0xc00000, float:1.7632415E-38)
            if (r9 == 0) goto L_0x00ea
            r4 = r4 | r28
            r10 = r110
            goto L_0x00fd
        L_0x00ea:
            r29 = r15 & r28
            r10 = r110
            if (r29 != 0) goto L_0x00fd
            boolean r30 = r0.F(r10)
            if (r30 == 0) goto L_0x00f9
            r30 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00fb
        L_0x00f9:
            r30 = 4194304(0x400000, float:5.877472E-39)
        L_0x00fb:
            r4 = r4 | r30
        L_0x00fd:
            r1 = r13 & 256(0x100, float:3.59E-43)
            r30 = 100663296(0x6000000, float:2.4074124E-35)
            if (r1 == 0) goto L_0x0108
            r4 = r4 | r30
            r2 = r111
            goto L_0x011b
        L_0x0108:
            r30 = r15 & r30
            r2 = r111
            if (r30 != 0) goto L_0x011b
            boolean r30 = r0.F(r2)
            if (r30 == 0) goto L_0x0117
            r30 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0119
        L_0x0117:
            r30 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0119:
            r4 = r4 | r30
        L_0x011b:
            r2 = r13 & 512(0x200, float:7.175E-43)
            r30 = 805306368(0x30000000, float:4.656613E-10)
            if (r2 == 0) goto L_0x0126
            r4 = r4 | r30
            r3 = r112
            goto L_0x0139
        L_0x0126:
            r30 = r15 & r30
            r3 = r112
            if (r30 != 0) goto L_0x0139
            boolean r30 = r0.F(r3)
            if (r30 == 0) goto L_0x0135
            r30 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0137
        L_0x0135:
            r30 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0137:
            r4 = r4 | r30
        L_0x0139:
            r3 = r13 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L_0x0142
            r21 = r14 | 6
            r5 = r113
            goto L_0x0158
        L_0x0142:
            r30 = r14 & 6
            r5 = r113
            if (r30 != 0) goto L_0x0156
            boolean r30 = r0.b(r5)
            if (r30 == 0) goto L_0x0151
            r21 = 4
            goto L_0x0153
        L_0x0151:
            r21 = 2
        L_0x0153:
            r21 = r14 | r21
            goto L_0x0158
        L_0x0156:
            r21 = r14
        L_0x0158:
            r5 = r13 & 2048(0x800, float:2.87E-42)
            if (r5 == 0) goto L_0x0161
            r21 = r21 | 48
        L_0x015e:
            r6 = r21
            goto L_0x0175
        L_0x0161:
            r30 = r14 & 48
            r6 = r114
            if (r30 != 0) goto L_0x015e
            boolean r30 = r0.V(r6)
            if (r30 == 0) goto L_0x0170
            r26 = 32
            goto L_0x0172
        L_0x0170:
            r26 = 16
        L_0x0172:
            r21 = r21 | r26
            goto L_0x015e
        L_0x0175:
            r7 = r13 & 4096(0x1000, float:5.74E-42)
            if (r7 == 0) goto L_0x017e
            r6 = r6 | 384(0x180, float:5.38E-43)
        L_0x017b:
            r10 = r115
            goto L_0x0191
        L_0x017e:
            r10 = r14 & 384(0x180, float:5.38E-43)
            if (r10 != 0) goto L_0x017b
            r10 = r115
            boolean r21 = r0.V(r10)
            if (r21 == 0) goto L_0x018d
            r27 = 256(0x100, float:3.59E-43)
            goto L_0x018f
        L_0x018d:
            r27 = 128(0x80, float:1.794E-43)
        L_0x018f:
            r6 = r6 | r27
        L_0x0191:
            r10 = r14 & 3072(0xc00, float:4.305E-42)
            if (r10 != 0) goto L_0x01a9
            r10 = r13 & 8192(0x2000, float:1.14794E-41)
            if (r10 != 0) goto L_0x01a4
            r10 = r116
            boolean r21 = r0.V(r10)
            if (r21 == 0) goto L_0x01a6
            r16 = r17
            goto L_0x01a6
        L_0x01a4:
            r10 = r116
        L_0x01a6:
            r6 = r6 | r16
            goto L_0x01ab
        L_0x01a9:
            r10 = r116
        L_0x01ab:
            r10 = r13 & 16384(0x4000, float:2.2959E-41)
            if (r10 == 0) goto L_0x01b4
            r6 = r6 | 24576(0x6000, float:3.4438E-41)
        L_0x01b1:
            r11 = r117
            goto L_0x01c5
        L_0x01b4:
            r11 = r14 & 24576(0x6000, float:3.4438E-41)
            if (r11 != 0) goto L_0x01b1
            r11 = r117
            boolean r16 = r0.b(r11)
            if (r16 == 0) goto L_0x01c1
            goto L_0x01c3
        L_0x01c1:
            r19 = r20
        L_0x01c3:
            r6 = r6 | r19
        L_0x01c5:
            r16 = r14 & r64
            if (r16 != 0) goto L_0x01e0
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r13 & r16
            r11 = r118
            if (r16 != 0) goto L_0x01db
            boolean r16 = r0.d(r11)
            if (r16 == 0) goto L_0x01db
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x01dd
        L_0x01db:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x01dd:
            r6 = r6 | r16
            goto L_0x01e2
        L_0x01e0:
            r11 = r118
        L_0x01e2:
            r16 = 65536(0x10000, float:9.18355E-41)
            r16 = r13 & r16
            if (r16 == 0) goto L_0x01ed
            r6 = r6 | r24
            r11 = r119
            goto L_0x0200
        L_0x01ed:
            r17 = r14 & r24
            r11 = r119
            if (r17 != 0) goto L_0x0200
            boolean r17 = r0.d(r11)
            if (r17 == 0) goto L_0x01fc
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x01fe
        L_0x01fc:
            r17 = r25
        L_0x01fe:
            r6 = r6 | r17
        L_0x0200:
            r17 = 131072(0x20000, float:1.83671E-40)
            r17 = r13 & r17
            if (r17 == 0) goto L_0x020b
            r6 = r6 | r28
            r11 = r120
            goto L_0x021e
        L_0x020b:
            r19 = r14 & r28
            r11 = r120
            if (r19 != 0) goto L_0x021e
            boolean r19 = r0.V(r11)
            if (r19 == 0) goto L_0x021a
            r19 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x021c
        L_0x021a:
            r19 = 4194304(0x400000, float:5.877472E-39)
        L_0x021c:
            r6 = r6 | r19
        L_0x021e:
            r19 = 100663296(0x6000000, float:2.4074124E-35)
            r19 = r14 & r19
            if (r19 != 0) goto L_0x023a
            r19 = 262144(0x40000, float:3.67342E-40)
            r19 = r13 & r19
            r11 = r121
            if (r19 != 0) goto L_0x0235
            boolean r19 = r0.V(r11)
            if (r19 == 0) goto L_0x0235
            r19 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0237
        L_0x0235:
            r19 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0237:
            r6 = r6 | r19
            goto L_0x023c
        L_0x023a:
            r11 = r121
        L_0x023c:
            r19 = 805306368(0x30000000, float:4.656613E-10)
            r19 = r14 & r19
            if (r19 != 0) goto L_0x0256
            r19 = r13 & r25
            r11 = r122
            if (r19 != 0) goto L_0x0251
            boolean r19 = r0.V(r11)
            if (r19 == 0) goto L_0x0251
            r19 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0253
        L_0x0251:
            r19 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0253:
            r6 = r6 | r19
            goto L_0x0258
        L_0x0256:
            r11 = r122
        L_0x0258:
            r19 = 306783379(0x12492493, float:6.34695E-28)
            r11 = r4 & r19
            r14 = 306783378(0x12492492, float:6.3469493E-28)
            if (r11 != r14) goto L_0x029b
            r11 = 306783379(0x12492493, float:6.34695E-28)
            r11 = r11 & r6
            r14 = 306783378(0x12492492, float:6.3469493E-28)
            if (r11 != r14) goto L_0x029b
            boolean r11 = r0.l()
            if (r11 != 0) goto L_0x0272
            goto L_0x029b
        L_0x0272:
            r0.L()
            r3 = r105
            r4 = r106
            r5 = r107
            r6 = r108
            r7 = r109
            r8 = r110
            r9 = r111
            r10 = r112
            r11 = r113
            r12 = r114
            r13 = r115
            r14 = r116
            r15 = r117
            r16 = r118
            r17 = r119
            r18 = r120
            r19 = r121
            r20 = r122
            goto L_0x05d3
        L_0x029b:
            r0.G()
            r11 = r15 & 1
            if (r11 == 0) goto L_0x02fa
            boolean r11 = r0.O()
            if (r11 == 0) goto L_0x02a9
            goto L_0x02fa
        L_0x02a9:
            r0.L()
            r1 = r13 & 32
            if (r1 == 0) goto L_0x02b4
            r1 = -458753(0xfffffffffff8ffff, float:NaN)
            r4 = r4 & r1
        L_0x02b4:
            r1 = r13 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x02ba
            r6 = r6 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x02ba:
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r13
            if (r1 == 0) goto L_0x02c4
            r1 = -458753(0xfffffffffff8ffff, float:NaN)
            r6 = r6 & r1
        L_0x02c4:
            r1 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 & r13
            if (r1 == 0) goto L_0x02cd
            r1 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r6 = r6 & r1
        L_0x02cd:
            r1 = r13 & r25
            if (r1 == 0) goto L_0x02d5
            r1 = -1879048193(0xffffffff8fffffff, float:-2.5243547E-29)
            r6 = r6 & r1
        L_0x02d5:
            r8 = r105
            r11 = r106
            r12 = r107
            r14 = r108
            r65 = r109
            r9 = r110
            r1 = r111
            r2 = r112
            r3 = r113
            r5 = r114
            r7 = r115
            r10 = r117
            r66 = r119
            r67 = r120
            r36 = r121
            r13 = r122
            r15 = r4
            r4 = r116
            goto L_0x0436
        L_0x02fa:
            if (r8 == 0) goto L_0x02ff
            androidx.compose.ui.d$a r8 = androidx.compose.ui.d.f18749a
            goto L_0x0301
        L_0x02ff:
            r8 = r105
        L_0x0301:
            if (r12 == 0) goto L_0x0305
            r11 = 1
            goto L_0x0307
        L_0x0305:
            r11 = r106
        L_0x0307:
            if (r18 == 0) goto L_0x030b
            r12 = 0
            goto L_0x030d
        L_0x030b:
            r12 = r107
        L_0x030d:
            r18 = r13 & 32
            if (r18 == 0) goto L_0x0321
            U0.I0 r14 = I0.b1.e()
            java.lang.Object r14 = r0.Q(r14)
            N1.Y r14 = (N1.Y) r14
            r18 = -458753(0xfffffffffff8ffff, float:NaN)
            r4 = r4 & r18
            goto L_0x0323
        L_0x0321:
            r14 = r108
        L_0x0323:
            if (r23 == 0) goto L_0x0328
            r65 = 0
            goto L_0x032a
        L_0x0328:
            r65 = r109
        L_0x032a:
            if (r9 == 0) goto L_0x032e
            r9 = 0
            goto L_0x0330
        L_0x032e:
            r9 = r110
        L_0x0330:
            if (r1 == 0) goto L_0x0334
            r1 = 0
            goto L_0x0336
        L_0x0334:
            r1 = r111
        L_0x0336:
            if (r2 == 0) goto L_0x033a
            r2 = 0
            goto L_0x033c
        L_0x033a:
            r2 = r112
        L_0x033c:
            if (r3 == 0) goto L_0x0340
            r3 = 0
            goto L_0x0342
        L_0x0340:
            r3 = r113
        L_0x0342:
            if (r5 == 0) goto L_0x034b
            T1.b0$a r5 = T1.b0.f13577a
            T1.b0 r5 = r5.c()
            goto L_0x034d
        L_0x034b:
            r5 = r114
        L_0x034d:
            if (r7 == 0) goto L_0x0356
            B0.A$a r7 = B0.A.f4480g
            B0.A r7 = r7.a()
            goto L_0x0358
        L_0x0356:
            r7 = r115
        L_0x0358:
            r105 = r1
            r1 = r13 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x0388
            B0.z r1 = new B0.z
            r18 = 63
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r26 = 0
            r106 = r1
            r107 = r20
            r108 = r21
            r109 = r22
            r110 = r23
            r111 = r24
            r112 = r26
            r113 = r18
            r114 = r19
            r106.<init>(r107, r108, r109, r110, r111, r112, r113, r114)
            r6 = r6 & -7169(0xffffffffffffe3ff, float:NaN)
            goto L_0x038a
        L_0x0388:
            r1 = r116
        L_0x038a:
            if (r10 == 0) goto L_0x038e
            r10 = 0
            goto L_0x0390
        L_0x038e:
            r10 = r117
        L_0x0390:
            r18 = 32768(0x8000, float:4.5918E-41)
            r18 = r13 & r18
            if (r18 == 0) goto L_0x03ac
            if (r10 == 0) goto L_0x039f
            r18 = 1
        L_0x039b:
            r19 = -458753(0xfffffffffff8ffff, float:NaN)
            goto L_0x03a3
        L_0x039f:
            r18 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x039b
        L_0x03a3:
            r6 = r6 & r19
            r102 = r18
            r18 = r6
            r6 = r102
            goto L_0x03b0
        L_0x03ac:
            r18 = r6
            r6 = r118
        L_0x03b0:
            if (r16 == 0) goto L_0x03b5
            r66 = 1
            goto L_0x03b7
        L_0x03b5:
            r66 = r119
        L_0x03b7:
            if (r17 == 0) goto L_0x03bc
            r67 = 0
            goto L_0x03be
        L_0x03bc:
            r67 = r120
        L_0x03be:
            r16 = 262144(0x40000, float:3.67342E-40)
            r16 = r13 & r16
            r106 = r1
            if (r16 == 0) goto L_0x03d5
            I0.U0 r1 = I0.U0.f7558a
            r107 = r2
            r2 = 6
            p1.i1 r1 = r1.d(r0, r2)
            r2 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r2 = r18 & r2
            goto L_0x03db
        L_0x03d5:
            r107 = r2
            r1 = r121
            r2 = r18
        L_0x03db:
            r16 = r13 & r25
            if (r16 == 0) goto L_0x042e
            I0.U0 r16 = I0.U0.f7558a
            r62 = 48
            r63 = 2097151(0x1fffff, float:2.938734E-39)
            r17 = 0
            r19 = 0
            r21 = 0
            r23 = 0
            r25 = 0
            r27 = 0
            r29 = 0
            r31 = 0
            r33 = 0
            r35 = 0
            r37 = 0
            r39 = 0
            r41 = 0
            r43 = 0
            r45 = 0
            r47 = 0
            r49 = 0
            r51 = 0
            r53 = 0
            r55 = 0
            r57 = 0
            r60 = 0
            r61 = 0
            r59 = r0
            I0.T0 r16 = r16.g(r17, r19, r21, r23, r25, r27, r29, r31, r33, r35, r37, r39, r41, r43, r45, r47, r49, r51, r53, r55, r57, r59, r60, r61, r62, r63)
            r17 = -1879048193(0xffffffff8fffffff, float:-2.5243547E-29)
            r2 = r2 & r17
            r36 = r1
            r15 = r4
            r118 = r6
            r13 = r16
        L_0x0426:
            r1 = r105
            r4 = r106
            r6 = r2
            r2 = r107
            goto L_0x0436
        L_0x042e:
            r13 = r122
            r36 = r1
            r15 = r4
            r118 = r6
            goto L_0x0426
        L_0x0436:
            r0.y()
            boolean r16 = U0.C4895p.J()
            r119 = r4
            if (r16 == 0) goto L_0x044c
            r4 = -359119489(0xffffffffea98457f, float:-9.2042455E25)
            r120 = r7
            java.lang.String r7 = "androidx.compose.material.TextField (TextField.kt:371)"
            U0.C4895p.S(r4, r15, r6, r7)
            goto L_0x044e
        L_0x044c:
            r120 = r7
        L_0x044e:
            if (r67 != 0) goto L_0x0471
            r4 = -1665951468(0xffffffff9cb39914, float:-1.1884796E-21)
            r0.W(r4)
            java.lang.Object r4 = r0.D()
            U0.m$a r7 = U0.C4889m.f14007a
            java.lang.Object r7 = r7.a()
            if (r4 != r7) goto L_0x0469
            r0.m r4 = r0.l.a()
            r0.u(r4)
        L_0x0469:
            r0.m r4 = (r0.m) r4
            r0.P()
            r29 = r4
            goto L_0x047c
        L_0x0471:
            r4 = -53741021(0xfffffffffccbfa23, float:-8.472877E36)
            r0.W(r4)
            r0.P()
            r29 = r67
        L_0x047c:
            r4 = -53735263(0xfffffffffccc10a1, float:-8.4765267E36)
            r0.W(r4)
            long r16 = r14.h()
            r18 = 16
            int r4 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r4 == 0) goto L_0x048f
        L_0x048c:
            r69 = r16
            goto L_0x04a7
        L_0x048f:
            int r4 = r15 >> 9
            r4 = r4 & 14
            int r7 = r6 >> 24
            r7 = r7 & 112(0x70, float:1.57E-43)
            r4 = r4 | r7
            U0.A1 r4 = r13.c(r11, r0, r4)
            java.lang.Object r4 = r4.getValue()
            p1.v0 r4 = (p1.C5747v0) r4
            long r16 = r4.y()
            goto L_0x048c
        L_0x04a7:
            r0.P()
            N1.Y r4 = new N1.Y
            r68 = r4
            r98 = 16777214(0xfffffe, float:2.3509884E-38)
            r99 = 0
            r71 = 0
            r73 = 0
            r74 = 0
            r75 = 0
            r76 = 0
            r77 = 0
            r78 = 0
            r80 = 0
            r81 = 0
            r82 = 0
            r83 = 0
            r85 = 0
            r86 = 0
            r87 = 0
            r88 = 0
            r89 = 0
            r90 = 0
            r92 = 0
            r93 = 0
            r94 = 0
            r95 = 0
            r96 = 0
            r97 = 0
            r68.<init>(r69, r71, r73, r74, r75, r76, r77, r78, r80, r81, r82, r83, r85, r86, r87, r88, r89, r90, r92, r93, r94, r95, r96, r97, r98, r99)
            N1.Y r21 = r14.J(r4)
            I0.U0 r4 = I0.U0.f7558a
            r7 = 48
            r16 = 0
            r17 = 0
            r18 = 0
            r108 = r4
            r109 = r8
            r110 = r11
            r111 = r3
            r112 = r29
            r113 = r13
            r114 = r17
            r115 = r18
            r116 = r7
            r117 = r16
            androidx.compose.ui.d r7 = I0.U0.f(r108, r109, r110, r111, r112, r113, r114, r115, r116, r117)
            I0.J0$a r16 = I0.J0.f7334a
            r121 = r8
            int r8 = r16.c()
            r122 = r14
            r14 = 6
            java.lang.String r8 = I0.K0.a(r8, r0, r14)
            androidx.compose.ui.d r7 = I0.W0.c(r7, r3, r8)
            float r8 = r4.c()
            float r4 = r4.b()
            androidx.compose.ui.d r18 = androidx.compose.foundation.layout.J.a(r7, r8, r4)
            p1.j1 r4 = new p1.j1
            r30 = r4
            r7 = r6 & 14
            int r8 = r6 >> 24
            r8 = r8 & 112(0x70, float:1.57E-43)
            r7 = r7 | r8
            U0.A1 r7 = r13.b(r3, r0, r7)
            java.lang.Object r7 = r7.getValue()
            p1.v0 r7 = (p1.C5747v0) r7
            long r7 = r7.y()
            r14 = 0
            r4.<init>(r7, r14)
            I0.X0$a r4 = new I0.X0$a
            r105 = r4
            r106 = r103
            r107 = r11
            r108 = r10
            r109 = r5
            r110 = r29
            r112 = r65
            r113 = r9
            r114 = r1
            r115 = r2
            r116 = r36
            r117 = r13
            r105.<init>(r106, r107, r108, r109, r110, r111, r112, r113, r114, r115, r116, r117)
            r7 = 54
            r8 = -126640971(0xfffffffff8739cb5, float:-1.9764165E34)
            r14 = 1
            c1.a r31 = c1.c.e(r8, r14, r4, r0, r7)
            r4 = 64638(0xfc7e, float:9.0577E-41)
            r4 = r4 & r15
            int r7 = r6 << 12
            r8 = 3670016(0x380000, float:5.142788E-39)
            r8 = r8 & r7
            r4 = r4 | r8
            r8 = 29360128(0x1c00000, float:7.052966E-38)
            r8 = r8 & r7
            r4 = r4 | r8
            r8 = 234881024(0xe000000, float:1.5777218E-30)
            r8 = r8 & r7
            r4 = r4 | r8
            r8 = 1879048192(0x70000000, float:1.58456325E29)
            r7 = r7 & r8
            r33 = r4 | r7
            int r4 = r6 >> 18
            r4 = r4 & 14
            r4 = r4 | r64
            r6 = r6 & 112(0x70, float:1.57E-43)
            r34 = r4 | r6
            r35 = 4096(0x1000, float:5.74E-42)
            r28 = 0
            r16 = r103
            r17 = r104
            r19 = r11
            r20 = r12
            r22 = r120
            r23 = r119
            r24 = r10
            r25 = r118
            r26 = r66
            r27 = r5
            r32 = r0
            B0.C4359c.a(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x05b4
            U0.C4895p.R()
        L_0x05b4:
            r16 = r118
            r14 = r119
            r6 = r122
            r8 = r9
            r15 = r10
            r4 = r11
            r20 = r13
            r19 = r36
            r7 = r65
            r17 = r66
            r18 = r67
            r13 = r120
            r9 = r1
            r10 = r2
            r11 = r3
            r3 = r121
            r102 = r12
            r12 = r5
            r5 = r102
        L_0x05d3:
            U0.Y0 r2 = r0.n()
            if (r2 == 0) goto L_0x05f4
            I0.X0$b r1 = new I0.X0$b
            r0 = r1
            r100 = r1
            r1 = r103
            r101 = r2
            r2 = r104
            r21 = r124
            r22 = r125
            r23 = r126
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r1 = r100
            r0 = r101
            r0.a(r1)
        L_0x05f4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: I0.X0.a(T1.P, nI.l, androidx.compose.ui.d, boolean, boolean, N1.Y, nI.p, nI.p, nI.p, nI.p, boolean, T1.b0, B0.A, B0.z, boolean, int, int, r0.m, p1.i1, I0.T0, U0.m, int, int, int):void");
    }

    public static final void b(androidx.compose.ui.d dVar, p<? super C4889m, ? super Integer, C16807N> pVar, p<? super C4889m, ? super Integer, C16807N> pVar2, q<? super androidx.compose.ui.d, ? super C4889m, ? super Integer, C16807N> qVar, p<? super C4889m, ? super Integer, C16807N> pVar3, p<? super C4889m, ? super Integer, C16807N> pVar4, boolean z10, float f10, C5834E e10, C4889m mVar, int i10) {
        int i11;
        int i12;
        androidx.compose.ui.d dVar2 = dVar;
        p<? super C4889m, ? super Integer, C16807N> pVar5 = pVar;
        p<? super C4889m, ? super Integer, C16807N> pVar6 = pVar2;
        q<? super androidx.compose.ui.d, ? super C4889m, ? super Integer, C16807N> qVar2 = qVar;
        p<? super C4889m, ? super Integer, C16807N> pVar7 = pVar3;
        p<? super C4889m, ? super Integer, C16807N> pVar8 = pVar4;
        boolean z11 = z10;
        float f11 = f10;
        C5834E e11 = e10;
        int i13 = i10;
        C4889m k10 = mVar.k(-2112507061);
        if ((i13 & 6) == 0) {
            i11 = (k10.V(dVar2) ? 4 : 2) | i13;
        } else {
            i11 = i13;
        }
        if ((i13 & 48) == 0) {
            i11 |= k10.F(pVar5) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i11 |= k10.F(pVar6) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i11 |= k10.F(qVar2) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        if ((i13 & 24576) == 0) {
            i11 |= k10.F(pVar7) ? 16384 : 8192;
        }
        if ((196608 & i13) == 0) {
            i11 |= k10.F(pVar8) ? 131072 : ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        }
        if ((1572864 & i13) == 0) {
            i11 |= k10.b(z11) ? 1048576 : ImageMetadata.LENS_APERTURE;
        }
        if ((12582912 & i13) == 0) {
            i11 |= k10.c(f11) ? 8388608 : 4194304;
        }
        if ((100663296 & i13) == 0) {
            i11 |= k10.V(e11) ? 67108864 : 33554432;
        }
        if ((38347923 & i11) != 38347922 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-2112507061, i11, -1, "androidx.compose.material.TextFieldLayout (TextField.kt:488)");
            }
            boolean z12 = ((3670016 & i11) == 1048576) | ((29360128 & i11) == 8388608) | ((234881024 & i11) == 67108864);
            Object D10 = k10.D();
            if (z12 || D10 == C4889m.f14007a.a()) {
                D10 = new Y0(z11, f11, e11);
                k10.u(D10);
            }
            Y0 y02 = (Y0) D10;
            t tVar = (t) k10.Q(C5100f0.k());
            int a10 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            androidx.compose.ui.d e12 = androidx.compose.ui.c.e(k10, dVar2);
            C4504g.a aVar = C4504g.f6515W;
            C17631a<C4504g> a11 = aVar.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a11);
            } else {
                k10.t();
            }
            C4889m a12 = F1.a(k10);
            F1.c(a12, y02, aVar.c());
            F1.c(a12, s10, aVar.e());
            p<C4504g, Integer, C16807N> b10 = aVar.b();
            if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                a12.u(Integer.valueOf(a10));
                a12.w(Integer.valueOf(a10), b10);
            }
            F1.c(a12, e12, aVar.d());
            if (pVar7 != null) {
                k10.W(69542167);
                androidx.compose.ui.d s11 = androidx.compose.ui.layout.a.b(androidx.compose.ui.d.f18749a, "Leading").s(W0.e());
                I h10 = C5077h.h(C5437c.f24302a.e(), false);
                int a13 = C4883j.a(k10, 0);
                C4912y s12 = k10.s();
                androidx.compose.ui.d e13 = androidx.compose.ui.c.e(k10, s11);
                C17631a<C4504g> a14 = aVar.a();
                if (k10.m() == null) {
                    C4883j.c();
                }
                k10.I();
                if (k10.i()) {
                    k10.p(a14);
                } else {
                    k10.t();
                }
                C4889m a15 = F1.a(k10);
                F1.c(a15, h10, aVar.c());
                F1.c(a15, s12, aVar.e());
                p<C4504g, Integer, C16807N> b11 = aVar.b();
                if (a15.i() || !C17542s.e(a15.D(), Integer.valueOf(a13))) {
                    a15.u(Integer.valueOf(a13));
                    a15.w(Integer.valueOf(a13), b11);
                }
                F1.c(a15, e13, aVar.d());
                C5079j jVar = C5079j.f18125a;
                pVar7.invoke(k10, Integer.valueOf((i11 >> 12) & 14));
                k10.x();
                k10.P();
            } else {
                k10.W(69783378);
                k10.P();
            }
            if (pVar8 != null) {
                k10.W(69825941);
                androidx.compose.ui.d s13 = androidx.compose.ui.layout.a.b(androidx.compose.ui.d.f18749a, "Trailing").s(W0.e());
                I h11 = C5077h.h(C5437c.f24302a.e(), false);
                int a16 = C4883j.a(k10, 0);
                C4912y s14 = k10.s();
                androidx.compose.ui.d e14 = androidx.compose.ui.c.e(k10, s13);
                C17631a<C4504g> a17 = aVar.a();
                if (k10.m() == null) {
                    C4883j.c();
                }
                k10.I();
                if (k10.i()) {
                    k10.p(a17);
                } else {
                    k10.t();
                }
                C4889m a18 = F1.a(k10);
                F1.c(a18, h11, aVar.c());
                F1.c(a18, s14, aVar.e());
                p<C4504g, Integer, C16807N> b12 = aVar.b();
                if (a18.i() || !C17542s.e(a18.D(), Integer.valueOf(a16))) {
                    a18.u(Integer.valueOf(a16));
                    a18.w(Integer.valueOf(a16), b12);
                }
                F1.c(a18, e14, aVar.d());
                C5079j jVar2 = C5079j.f18125a;
                pVar8.invoke(k10, Integer.valueOf((i11 >> 15) & 14));
                k10.x();
                k10.P();
            } else {
                k10.W(70069074);
                k10.P();
            }
            float g10 = D.g(e11, tVar);
            float f12 = D.f(e11, tVar);
            d.a aVar2 = androidx.compose.ui.d.f18749a;
            if (pVar7 != null) {
                i12 = 0;
                g10 = h.B(C17978n.d(h.B(g10 - W0.d()), h.B((float) 0)));
            } else {
                i12 = 0;
            }
            float f13 = g10;
            if (pVar8 != null) {
                f12 = h.B(C17978n.d(h.B(f12 - W0.d()), h.B((float) i12)));
            }
            androidx.compose.ui.d m10 = D.m(aVar2, f13, 0.0f, f12, 0.0f, 10, (Object) null);
            if (qVar2 != null) {
                k10.W(70826807);
                qVar2.invoke(androidx.compose.ui.layout.a.b(aVar2, "Hint").s(m10), k10, Integer.valueOf((i11 >> 6) & 112));
                k10.P();
            } else {
                k10.W(70914258);
                k10.P();
            }
            if (pVar6 != null) {
                k10.W(70948761);
                androidx.compose.ui.d s15 = androidx.compose.ui.layout.a.b(aVar2, "Label").s(m10);
                I h12 = C5077h.h(C5437c.f24302a.o(), false);
                int a19 = C4883j.a(k10, 0);
                C4912y s16 = k10.s();
                androidx.compose.ui.d e15 = androidx.compose.ui.c.e(k10, s15);
                C17631a<C4504g> a20 = aVar.a();
                if (k10.m() == null) {
                    C4883j.c();
                }
                k10.I();
                if (k10.i()) {
                    k10.p(a20);
                } else {
                    k10.t();
                }
                C4889m a21 = F1.a(k10);
                F1.c(a21, h12, aVar.c());
                F1.c(a21, s16, aVar.e());
                p<C4504g, Integer, C16807N> b13 = aVar.b();
                if (a21.i() || !C17542s.e(a21.D(), Integer.valueOf(a19))) {
                    a21.u(Integer.valueOf(a19));
                    a21.w(Integer.valueOf(a19), b13);
                }
                F1.c(a21, e15, aVar.d());
                C5079j jVar3 = C5079j.f18125a;
                pVar6.invoke(k10, Integer.valueOf((i11 >> 6) & 14));
                k10.x();
                k10.P();
            } else {
                k10.W(71034290);
                k10.P();
            }
            androidx.compose.ui.d s17 = androidx.compose.ui.layout.a.b(aVar2, "TextField").s(m10);
            I h13 = C5077h.h(C5437c.f24302a.o(), true);
            int a22 = C4883j.a(k10, 0);
            C4912y s18 = k10.s();
            androidx.compose.ui.d e16 = androidx.compose.ui.c.e(k10, s17);
            C17631a<C4504g> a23 = aVar.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a23);
            } else {
                k10.t();
            }
            C4889m a24 = F1.a(k10);
            F1.c(a24, h13, aVar.c());
            F1.c(a24, s18, aVar.e());
            p<C4504g, Integer, C16807N> b14 = aVar.b();
            if (a24.i() || !C17542s.e(a24.D(), Integer.valueOf(a22))) {
                a24.u(Integer.valueOf(a22));
                a24.w(Integer.valueOf(a22), b14);
            }
            F1.c(a24, e16, aVar.d());
            C5079j jVar4 = C5079j.f18125a;
            pVar5.invoke(k10, Integer.valueOf((i11 >> 3) & 14));
            k10.x();
            k10.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new c(dVar, pVar, pVar2, qVar, pVar3, pVar4, z10, f10, e10, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final int h(int i10, boolean z10, int i11, int i12, int i13, int i14, long j10, float f10, C5834E e10) {
        float f11 = f7718c * f10;
        float d10 = e10.d() * f10;
        float a10 = e10.a() * f10;
        int max = Math.max(i10, i14);
        return Math.max(C17752b.e(z10 ? ((float) i11) + f11 + ((float) max) + a10 : d10 + ((float) max) + a10), Math.max(Math.max(i12, i13), C5267b.m(j10)));
    }

    /* access modifiers changed from: private */
    public static final int i(int i10, int i11, int i12, int i13, int i14, long j10) {
        return Math.max(i10 + Math.max(i12, Math.max(i13, i14)) + i11, C5267b.n(j10));
    }

    public static final androidx.compose.ui.d j(androidx.compose.ui.d dVar, C5601g gVar) {
        return androidx.compose.ui.draw.b.d(dVar, new d(gVar.b(), gVar));
    }

    public static final float k() {
        return f7716a;
    }

    public static final float l() {
        return f7717b;
    }

    public static final float m() {
        return f7718c;
    }

    /* access modifiers changed from: private */
    public static final void n(a0.a aVar, int i10, int i11, a0 a0Var, a0 a0Var2, a0 a0Var3, a0 a0Var4, a0 a0Var5, boolean z10, int i12, int i13, float f10, float f11) {
        int i14 = i11;
        if (a0Var4 != null) {
            a0.a.m(aVar, a0Var4, 0, C5437c.f24302a.i().a(a0Var4.z0(), i14), 0.0f, 4, (Object) null);
        }
        if (a0Var5 != null) {
            a0.a.m(aVar, a0Var5, i10 - a0Var5.E0(), C5437c.f24302a.i().a(a0Var5.z0(), i14), 0.0f, 4, (Object) null);
        }
        if (a0Var2 != null) {
            int a10 = z10 ? C5437c.f24302a.i().a(a0Var2.z0(), i14) : C17752b.e(W0.g() * f11);
            a0.a.m(aVar, a0Var2, W0.j(a0Var4), a10 - C17752b.e(((float) (a10 - i12)) * f10), 0.0f, 4, (Object) null);
        }
        a0.a.m(aVar, a0Var, W0.j(a0Var4), i13, 0.0f, 4, (Object) null);
        if (a0Var3 != null) {
            a0.a.m(aVar, a0Var3, W0.j(a0Var4), i13, 0.0f, 4, (Object) null);
        }
    }

    /* access modifiers changed from: private */
    public static final void o(a0.a aVar, int i10, int i11, a0 a0Var, a0 a0Var2, a0 a0Var3, a0 a0Var4, boolean z10, float f10, C5834E e10) {
        int i12 = i11;
        int e11 = C17752b.e(e10.d() * f10);
        if (a0Var3 != null) {
            a0.a.m(aVar, a0Var3, 0, C5437c.f24302a.i().a(a0Var3.z0(), i11), 0.0f, 4, (Object) null);
        }
        if (a0Var4 != null) {
            a0.a.m(aVar, a0Var4, i10 - a0Var4.E0(), C5437c.f24302a.i().a(a0Var4.z0(), i11), 0.0f, 4, (Object) null);
        }
        a0.a.m(aVar, a0Var, W0.j(a0Var3), z10 ? C5437c.f24302a.i().a(a0Var.z0(), i11) : e11, 0.0f, 4, (Object) null);
        if (a0Var2 != null) {
            if (z10) {
                e11 = C5437c.f24302a.i().a(a0Var2.z0(), i11);
            }
            a0.a.m(aVar, a0Var2, W0.j(a0Var3), e11, 0.0f, 4, (Object) null);
        }
    }

    /* access modifiers changed from: private */
    public static final int p(int i10, int i11) {
        return i10 == Integer.MAX_VALUE ? i10 : i10 - i11;
    }
}
