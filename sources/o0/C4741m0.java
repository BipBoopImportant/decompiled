package O0;

import B0.A;
import B0.C4359c;
import B0.C4381z;
import E1.I;
import E1.a0;
import G1.C4504g;
import L1.o;
import L1.x;
import N1.Y;
import Q0.t;
import Q0.u;
import Q0.w;
import S0.E;
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
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.C5100f0;
import androidx.recyclerview.widget.RecyclerView;
import bI.C17035a;
import c2.C5267b;
import c2.h;
import c2.i;
import c2.n;
import c2.v;
import com.google.ar.core.ImageMetadata;
import e2.C5295b;
import i1.C5437c;
import i1.j;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import o1.C5673m;
import p1.C5745u0;
import p1.i1;
import p1.j1;
import pI.C17752b;
import r0.m;
import r1.C5817c;
import s0.C5834E;
import tI.C17978n;

@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a·\u0002\u0010%\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f2\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f2\b\b\u0002\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00072\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u001c2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010\"\u001a\u00020!2\b\b\u0002\u0010$\u001a\u00020#H\u0007¢\u0006\u0004\b%\u0010&\u001aÕ\u0001\u00102\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f2\u000e\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f2\u000e\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f2\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f2\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010+\u001a\u00020*2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\u000e\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f2\u0006\u00101\u001a\u000200H\u0001¢\u0006\u0004\b2\u00103\u001a\u001b\u00105\u001a\u00020\u001c*\u00020\u001c2\u0006\u00104\u001a\u00020\u001cH\u0002¢\u0006\u0004\b5\u00106\u001aj\u0010A\u001a\u00020\u001c2\u0006\u00107\u001a\u00020\u001c2\u0006\u00108\u001a\u00020\u001c2\u0006\u00109\u001a\u00020\u001c2\u0006\u0010:\u001a\u00020\u001c2\u0006\u0010;\u001a\u00020\u001c2\u0006\u0010<\u001a\u00020\u001c2\u0006\u0010=\u001a\u00020\u001c2\u0006\u0010+\u001a\u00020*2\u0006\u0010?\u001a\u00020>2\u0006\u0010@\u001a\u00020*2\u0006\u00101\u001a\u000200H\u0002ø\u0001\u0000¢\u0006\u0004\bA\u0010B\u001ar\u0010K\u001a\u00020\u001c2\u0006\u0010C\u001a\u00020\u001c2\u0006\u0010D\u001a\u00020\u001c2\u0006\u0010E\u001a\u00020\u001c2\u0006\u0010F\u001a\u00020\u001c2\u0006\u0010G\u001a\u00020\u001c2\u0006\u0010H\u001a\u00020\u001c2\u0006\u0010I\u001a\u00020\u001c2\u0006\u0010J\u001a\u00020\u001c2\u0006\u0010+\u001a\u00020*2\u0006\u0010?\u001a\u00020>2\u0006\u0010@\u001a\u00020*2\u0006\u00101\u001a\u000200H\u0002ø\u0001\u0000¢\u0006\u0004\bK\u0010L\u001a¡\u0001\u0010\\\u001a\u00020\u0003*\u00020M2\u0006\u0010N\u001a\u00020\u001c2\u0006\u0010O\u001a\u00020\u001c2\b\u0010Q\u001a\u0004\u0018\u00010P2\b\u0010R\u001a\u0004\u0018\u00010P2\b\u0010S\u001a\u0004\u0018\u00010P2\b\u0010T\u001a\u0004\u0018\u00010P2\u0006\u0010U\u001a\u00020P2\b\u0010V\u001a\u0004\u0018\u00010P2\b\u0010W\u001a\u0004\u0018\u00010P2\u0006\u0010X\u001a\u00020P2\b\u0010Y\u001a\u0004\u0018\u00010P2\u0006\u0010+\u001a\u00020*2\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010@\u001a\u00020*2\u0006\u0010[\u001a\u00020Z2\u0006\u00101\u001a\u000200H\u0002¢\u0006\u0004\b\\\u0010]\u001a)\u0010_\u001a\u00020\u0005*\u00020\u00052\f\u0010^\u001a\b\u0012\u0004\u0012\u00020,0\f2\u0006\u00101\u001a\u000200H\u0000¢\u0006\u0004\b_\u0010`\"\u0014\u0010c\u001a\u00020a8\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010b\"\u001a\u0010h\u001a\u00020d8\u0000X\u0004¢\u0006\f\n\u0004\b2\u0010e\u001a\u0004\bf\u0010g\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006i"}, d2 = {"LT1/P;", "value", "Lkotlin/Function1;", "LXH/N;", "onValueChange", "Landroidx/compose/ui/d;", "modifier", "", "enabled", "readOnly", "LN1/Y;", "textStyle", "Lkotlin/Function0;", "label", "placeholder", "leadingIcon", "trailingIcon", "prefix", "suffix", "supportingText", "isError", "LT1/b0;", "visualTransformation", "LB0/A;", "keyboardOptions", "LB0/z;", "keyboardActions", "singleLine", "", "maxLines", "minLines", "Lr0/m;", "interactionSource", "Lp1/i1;", "shape", "LO0/Z0;", "colors", "a", "(LT1/P;LnI/l;Landroidx/compose/ui/d;ZZLN1/Y;LnI/p;LnI/p;LnI/p;LnI/p;LnI/p;LnI/p;LnI/p;ZLT1/b0;LB0/A;LB0/z;ZIILr0/m;Lp1/i1;LO0/Z0;LU0/m;IIII)V", "textField", "leading", "trailing", "", "animationProgress", "Lo1/m;", "onLabelMeasured", "container", "supporting", "Ls0/E;", "paddingValues", "b", "(Landroidx/compose/ui/d;LnI/p;LnI/q;LnI/p;LnI/p;LnI/p;LnI/p;LnI/p;ZFLnI/l;LnI/p;LnI/p;Ls0/E;LU0/m;II)V", "from", "n", "(II)I", "leadingPlaceableWidth", "trailingPlaceableWidth", "prefixPlaceableWidth", "suffixPlaceableWidth", "textFieldPlaceableWidth", "labelPlaceableWidth", "placeholderPlaceableWidth", "Lc2/b;", "constraints", "density", "i", "(IIIIIIIFJFLs0/E;)I", "leadingHeight", "trailingHeight", "prefixHeight", "suffixHeight", "textFieldHeight", "labelHeight", "placeholderHeight", "supportingHeight", "h", "(IIIIIIIIFJFLs0/E;)I", "LE1/a0$a;", "totalHeight", "width", "LE1/a0;", "leadingPlaceable", "trailingPlaceable", "prefixPlaceable", "suffixPlaceable", "textFieldPlaceable", "labelPlaceable", "placeholderPlaceable", "containerPlaceable", "supportingPlaceable", "Lc2/t;", "layoutDirection", "l", "(LE1/a0$a;IILE1/a0;LE1/a0;LE1/a0;LE1/a0;LE1/a0;LE1/a0;LE1/a0;LE1/a0;LE1/a0;FZFLc2/t;Ls0/E;)V", "labelSize", "k", "(Landroidx/compose/ui/d;LnI/a;Ls0/E;)Landroidx/compose/ui/d;", "Lc2/h;", "F", "OutlinedTextFieldInnerPadding", "Lc2/v;", "J", "j", "()J", "OutlinedTextFieldTopPadding", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: O0.m0  reason: case insensitive filesystem */
public final class C4741m0 {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final float f11200a = h.B((float) 4);

    /* renamed from: b  reason: collision with root package name */
    private static final long f11201b;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "a", "(LU0/m;I)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: O0.m0$a */
    static final class a extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f11202c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f11203d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ c2.d f11204e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f11205f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ Z0 f11206g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ P f11207h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ C17642l<P, C16807N> f11208i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ boolean f11209j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ boolean f11210k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ Y f11211l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ A f11212m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ C4381z f11213n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ boolean f11214o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ int f11215p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ int f11216q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ b0 f11217r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ m f11218s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f11219t;

        /* renamed from: u  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f11220u;

        /* renamed from: v  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f11221v;

        /* renamed from: w  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f11222w;

        /* renamed from: x  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f11223x;

        /* renamed from: y  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f11224y;

        /* renamed from: z  reason: collision with root package name */
        final /* synthetic */ i1 f11225z;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LL1/x;", "LXH/N;", "a", "(LL1/x;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: O0.m0$a$a  reason: collision with other inner class name */
        static final class C0169a extends C17544u implements C17642l<x, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            public static final C0169a f11226c = new C0169a();

            C0169a() {
                super(1);
            }

            public final void a(x xVar) {
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((x) obj);
                return C16807N.f139792a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Function0;", "LXH/N;", "innerTextField", "a", "(LnI/p;LU0/m;I)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: O0.m0$a$b */
        static final class b extends C17544u implements q<p<? super C4889m, ? super Integer, ? extends C16807N>, C4889m, Integer, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ P f11227c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ boolean f11228d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ boolean f11229e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ b0 f11230f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ m f11231g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ boolean f11232h;

            /* renamed from: i  reason: collision with root package name */
            final /* synthetic */ p<C4889m, Integer, C16807N> f11233i;

            /* renamed from: j  reason: collision with root package name */
            final /* synthetic */ p<C4889m, Integer, C16807N> f11234j;

            /* renamed from: k  reason: collision with root package name */
            final /* synthetic */ p<C4889m, Integer, C16807N> f11235k;

            /* renamed from: l  reason: collision with root package name */
            final /* synthetic */ p<C4889m, Integer, C16807N> f11236l;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ p<C4889m, Integer, C16807N> f11237m;

            /* renamed from: n  reason: collision with root package name */
            final /* synthetic */ p<C4889m, Integer, C16807N> f11238n;

            /* renamed from: o  reason: collision with root package name */
            final /* synthetic */ p<C4889m, Integer, C16807N> f11239o;

            /* renamed from: p  reason: collision with root package name */
            final /* synthetic */ Z0 f11240p;

            /* renamed from: q  reason: collision with root package name */
            final /* synthetic */ i1 f11241q;

            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "a", "(LU0/m;I)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: O0.m0$a$b$a  reason: collision with other inner class name */
            static final class C0170a extends C17544u implements p<C4889m, Integer, C16807N> {

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ boolean f11242c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ boolean f11243d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ m f11244e;

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ Z0 f11245f;

                /* renamed from: g  reason: collision with root package name */
                final /* synthetic */ i1 f11246g;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0170a(boolean z10, boolean z11, m mVar, Z0 z02, i1 i1Var) {
                    super(2);
                    this.f11242c = z10;
                    this.f11243d = z11;
                    this.f11244e = mVar;
                    this.f11245f = z02;
                    this.f11246g = i1Var;
                }

                public final void a(C4889m mVar, int i10) {
                    int i11 = i10;
                    if ((i11 & 3) != 2 || !mVar.l()) {
                        if (C4895p.J()) {
                            C4895p.S(255570733, i11, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous>.<anonymous> (OutlinedTextField.kt:433)");
                        }
                        C4739l0.f11144a.a(this.f11242c, this.f11243d, this.f11244e, (androidx.compose.ui.d) null, this.f11245f, this.f11246g, 0.0f, 0.0f, mVar, 100663296, 200);
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
            b(P p10, boolean z10, boolean z11, b0 b0Var, m mVar, boolean z12, p<? super C4889m, ? super Integer, C16807N> pVar, p<? super C4889m, ? super Integer, C16807N> pVar2, p<? super C4889m, ? super Integer, C16807N> pVar3, p<? super C4889m, ? super Integer, C16807N> pVar4, p<? super C4889m, ? super Integer, C16807N> pVar5, p<? super C4889m, ? super Integer, C16807N> pVar6, p<? super C4889m, ? super Integer, C16807N> pVar7, Z0 z02, i1 i1Var) {
                super(3);
                this.f11227c = p10;
                this.f11228d = z10;
                this.f11229e = z11;
                this.f11230f = b0Var;
                this.f11231g = mVar;
                this.f11232h = z12;
                this.f11233i = pVar;
                this.f11234j = pVar2;
                this.f11235k = pVar3;
                this.f11236l = pVar4;
                this.f11237m = pVar5;
                this.f11238n = pVar6;
                this.f11239o = pVar7;
                this.f11240p = z02;
                this.f11241q = i1Var;
            }

            public final void a(p<? super C4889m, ? super Integer, C16807N> pVar, C4889m mVar, int i10) {
                int i11;
                C4889m mVar2 = mVar;
                p<? super C4889m, ? super Integer, C16807N> pVar2 = pVar;
                if ((i10 & 6) == 0) {
                    i11 = i10 | (mVar2.F(pVar2) ? 4 : 2);
                } else {
                    i11 = i10;
                }
                if ((i11 & 19) != 18 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(-757328870, i11, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous> (OutlinedTextField.kt:416)");
                    }
                    C4739l0 l0Var = C4739l0.f11144a;
                    String i12 = this.f11227c.i();
                    boolean z10 = this.f11228d;
                    boolean z11 = this.f11229e;
                    b0 b0Var = this.f11230f;
                    m mVar3 = this.f11231g;
                    boolean z12 = this.f11232h;
                    boolean z13 = z12;
                    m mVar4 = mVar3;
                    int i13 = i11;
                    p<C4889m, Integer, C16807N> pVar3 = this.f11238n;
                    int i14 = i13;
                    p<C4889m, Integer, C16807N> pVar4 = this.f11239o;
                    C4739l0 l0Var2 = l0Var;
                    Z0 z02 = this.f11240p;
                    p<? super C4889m, ? super Integer, C16807N> pVar5 = pVar;
                    C4889m mVar5 = mVar;
                    C4739l0 l0Var3 = l0Var2;
                    String str = i12;
                    boolean z14 = z10;
                    l0Var3.b(str, pVar5, z14, z11, b0Var, mVar3, z12, this.f11233i, this.f11234j, this.f11235k, this.f11236l, this.f11237m, pVar3, pVar4, z02, (C5834E) null, c1.c.e(255570733, true, new C0170a(z10, z13, mVar4, z02, this.f11241q), mVar2, 54), mVar5, (i14 << 3) & 112, 14155776, 32768);
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

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(androidx.compose.ui.d dVar, p<? super C4889m, ? super Integer, C16807N> pVar, c2.d dVar2, boolean z10, Z0 z02, P p10, C17642l<? super P, C16807N> lVar, boolean z11, boolean z12, Y y10, A a10, C4381z zVar, boolean z13, int i10, int i11, b0 b0Var, m mVar, p<? super C4889m, ? super Integer, C16807N> pVar2, p<? super C4889m, ? super Integer, C16807N> pVar3, p<? super C4889m, ? super Integer, C16807N> pVar4, p<? super C4889m, ? super Integer, C16807N> pVar5, p<? super C4889m, ? super Integer, C16807N> pVar6, p<? super C4889m, ? super Integer, C16807N> pVar7, i1 i1Var) {
            super(2);
            this.f11202c = dVar;
            this.f11203d = pVar;
            this.f11204e = dVar2;
            this.f11205f = z10;
            this.f11206g = z02;
            this.f11207h = p10;
            this.f11208i = lVar;
            this.f11209j = z11;
            this.f11210k = z12;
            this.f11211l = y10;
            this.f11212m = a10;
            this.f11213n = zVar;
            this.f11214o = z13;
            this.f11215p = i10;
            this.f11216q = i11;
            this.f11217r = b0Var;
            this.f11218s = mVar;
            this.f11219t = pVar2;
            this.f11220u = pVar3;
            this.f11221v = pVar4;
            this.f11222w = pVar5;
            this.f11223x = pVar6;
            this.f11224y = pVar7;
            this.f11225z = i1Var;
        }

        public final void a(C4889m mVar, int i10) {
            C4889m mVar2 = mVar;
            int i11 = i10;
            if ((i11 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1830921872, i11, -1, "androidx.compose.material3.OutlinedTextField.<anonymous> (OutlinedTextField.kt:382)");
                }
                androidx.compose.ui.d s10 = this.f11202c.s(this.f11203d != null ? D.m(o.c(androidx.compose.ui.d.f18749a, true, C0169a.f11226c), 0.0f, this.f11204e.q(C4741m0.j()), 0.0f, 0.0f, 13, (Object) null) : androidx.compose.ui.d.f18749a);
                boolean z10 = this.f11205f;
                t.a aVar = t.f12046a;
                androidx.compose.ui.d i12 = w.i(s10, z10, u.a(t.a(j.f24369c), mVar2, 0));
                C4739l0 l0Var = C4739l0.f11144a;
                androidx.compose.ui.d a10 = J.a(i12, l0Var.j(), l0Var.i());
                j1 j1Var = r1;
                j1 j1Var2 = new j1(this.f11206g.c(this.f11205f), (DefaultConstructorMarker) null);
                P p10 = this.f11207h;
                C17642l<P, C16807N> lVar = this.f11208i;
                boolean z11 = this.f11209j;
                boolean z12 = z11;
                boolean z13 = this.f11210k;
                Y y10 = this.f11211l;
                A a11 = this.f11212m;
                C4381z zVar = this.f11213n;
                boolean z14 = this.f11214o;
                boolean z15 = z14;
                boolean z16 = z14;
                int i13 = this.f11215p;
                boolean z17 = z11;
                int i14 = this.f11216q;
                b0 b0Var = this.f11217r;
                P p11 = p10;
                P p12 = p10;
                m mVar3 = this.f11218s;
                C4359c.a(p12, lVar, a10, z12, z13, y10, a11, zVar, z15, i13, i14, b0Var, (C17642l<? super N1.P, C16807N>) null, mVar3, j1Var, c1.c.e(-757328870, true, new b(p11, z17, z16, b0Var, mVar3, this.f11205f, this.f11203d, this.f11219t, this.f11220u, this.f11221v, this.f11222w, this.f11223x, this.f11224y, this.f11206g, this.f11225z), mVar2, 54), mVar, 0, ImageMetadata.EDGE_MODE, RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT);
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

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: O0.m0$b */
    static final class b extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: A  reason: collision with root package name */
        final /* synthetic */ int f11247A;

        /* renamed from: B  reason: collision with root package name */
        final /* synthetic */ int f11248B;

        /* renamed from: C  reason: collision with root package name */
        final /* synthetic */ int f11249C;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ P f11250c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17642l<P, C16807N> f11251d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f11252e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f11253f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ boolean f11254g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Y f11255h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f11256i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f11257j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f11258k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f11259l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f11260m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f11261n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f11262o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ boolean f11263p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ b0 f11264q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ A f11265r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ C4381z f11266s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ boolean f11267t;

        /* renamed from: u  reason: collision with root package name */
        final /* synthetic */ int f11268u;

        /* renamed from: v  reason: collision with root package name */
        final /* synthetic */ int f11269v;

        /* renamed from: w  reason: collision with root package name */
        final /* synthetic */ m f11270w;

        /* renamed from: x  reason: collision with root package name */
        final /* synthetic */ i1 f11271x;

        /* renamed from: y  reason: collision with root package name */
        final /* synthetic */ Z0 f11272y;

        /* renamed from: z  reason: collision with root package name */
        final /* synthetic */ int f11273z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(P p10, C17642l<? super P, C16807N> lVar, androidx.compose.ui.d dVar, boolean z10, boolean z11, Y y10, p<? super C4889m, ? super Integer, C16807N> pVar, p<? super C4889m, ? super Integer, C16807N> pVar2, p<? super C4889m, ? super Integer, C16807N> pVar3, p<? super C4889m, ? super Integer, C16807N> pVar4, p<? super C4889m, ? super Integer, C16807N> pVar5, p<? super C4889m, ? super Integer, C16807N> pVar6, p<? super C4889m, ? super Integer, C16807N> pVar7, boolean z12, b0 b0Var, A a10, C4381z zVar, boolean z13, int i10, int i11, m mVar, i1 i1Var, Z0 z02, int i12, int i13, int i14, int i15) {
            super(2);
            this.f11250c = p10;
            this.f11251d = lVar;
            this.f11252e = dVar;
            this.f11253f = z10;
            this.f11254g = z11;
            this.f11255h = y10;
            this.f11256i = pVar;
            this.f11257j = pVar2;
            this.f11258k = pVar3;
            this.f11259l = pVar4;
            this.f11260m = pVar5;
            this.f11261n = pVar6;
            this.f11262o = pVar7;
            this.f11263p = z12;
            this.f11264q = b0Var;
            this.f11265r = a10;
            this.f11266s = zVar;
            this.f11267t = z13;
            this.f11268u = i10;
            this.f11269v = i11;
            this.f11270w = mVar;
            this.f11271x = i1Var;
            this.f11272y = z02;
            this.f11273z = i12;
            this.f11247A = i13;
            this.f11248B = i14;
            this.f11249C = i15;
        }

        public final void a(C4889m mVar, int i10) {
            C4889m mVar2 = mVar;
            P p10 = this.f11250c;
            P p11 = p10;
            C4741m0.a(p11, this.f11251d, this.f11252e, this.f11253f, this.f11254g, this.f11255h, this.f11256i, this.f11257j, this.f11258k, this.f11259l, this.f11260m, this.f11261n, this.f11262o, this.f11263p, this.f11264q, this.f11265r, this.f11266s, this.f11267t, this.f11268u, this.f11269v, this.f11270w, this.f11271x, this.f11272y, mVar2, M0.a(this.f11273z | 1), M0.a(this.f11247A), M0.a(this.f11248B), this.f11249C);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: O0.m0$c */
    static final class c extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f11274c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f11275d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ q<androidx.compose.ui.d, C4889m, Integer, C16807N> f11276e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f11277f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f11278g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f11279h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f11280i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f11281j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ boolean f11282k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ float f11283l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ C17642l<C5673m, C16807N> f11284m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f11285n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f11286o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ C5834E f11287p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ int f11288q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ int f11289r;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(androidx.compose.ui.d dVar, p<? super C4889m, ? super Integer, C16807N> pVar, q<? super androidx.compose.ui.d, ? super C4889m, ? super Integer, C16807N> qVar, p<? super C4889m, ? super Integer, C16807N> pVar2, p<? super C4889m, ? super Integer, C16807N> pVar3, p<? super C4889m, ? super Integer, C16807N> pVar4, p<? super C4889m, ? super Integer, C16807N> pVar5, p<? super C4889m, ? super Integer, C16807N> pVar6, boolean z10, float f10, C17642l<? super C5673m, C16807N> lVar, p<? super C4889m, ? super Integer, C16807N> pVar7, p<? super C4889m, ? super Integer, C16807N> pVar8, C5834E e10, int i10, int i11) {
            super(2);
            this.f11274c = dVar;
            this.f11275d = pVar;
            this.f11276e = qVar;
            this.f11277f = pVar2;
            this.f11278g = pVar3;
            this.f11279h = pVar4;
            this.f11280i = pVar5;
            this.f11281j = pVar6;
            this.f11282k = z10;
            this.f11283l = f10;
            this.f11284m = lVar;
            this.f11285n = pVar7;
            this.f11286o = pVar8;
            this.f11287p = e10;
            this.f11288q = i10;
            this.f11289r = i11;
        }

        public final void a(C4889m mVar, int i10) {
            C4889m mVar2 = mVar;
            androidx.compose.ui.d dVar = this.f11274c;
            androidx.compose.ui.d dVar2 = dVar;
            C4741m0.b(dVar2, this.f11275d, this.f11276e, this.f11277f, this.f11278g, this.f11279h, this.f11280i, this.f11281j, this.f11282k, this.f11283l, this.f11284m, this.f11285n, this.f11286o, this.f11287p, mVar2, M0.a(this.f11288q | 1), M0.a(this.f11289r));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lr1/c;", "LXH/N;", "a", "(Lr1/c;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: O0.m0$d */
    static final class d extends C17544u implements C17642l<C5817c, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a<C5673m> f11290c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C5834E f11291d;

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: O0.m0$d$a */
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f11292a;

            static {
                int[] iArr = new int[c2.t.values().length];
                try {
                    iArr[c2.t.Rtl.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f11292a = iArr;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C17631a<C5673m> aVar, C5834E e10) {
            super(1);
            this.f11290c = aVar;
            this.f11291d = e10;
        }

        public final void a(C5817c cVar) {
            C5817c cVar2 = cVar;
            long q10 = this.f11290c.invoke().q();
            float l10 = C5673m.l(q10);
            if (l10 > 0.0f) {
                float H12 = cVar2.H1(C4741m0.f11200a);
                float H13 = cVar2.H1(this.f11291d.c(cVar.getLayoutDirection())) - H12;
                float f10 = (float) 2;
                float f11 = l10 + H13 + (H12 * f10);
                c2.t layoutDirection = cVar.getLayoutDirection();
                int[] iArr = a.f11292a;
                float l11 = iArr[layoutDirection.ordinal()] == 1 ? C5673m.l(cVar.b()) - f11 : C17978n.d(H13, 0.0f);
                if (iArr[cVar.getLayoutDirection().ordinal()] == 1) {
                    f11 = C5673m.l(cVar.b()) - C17978n.d(H13, 0.0f);
                }
                float f12 = f11;
                float i10 = C5673m.i(q10);
                float f13 = (-i10) / f10;
                float f14 = i10 / f10;
                int a10 = C5745u0.f27347a.a();
                r1.d I12 = cVar.I1();
                long b10 = I12.b();
                I12.e().t();
                try {
                    I12.c().c(l11, f13, f12, f14, a10);
                    cVar.V1();
                } finally {
                    I12.e().n();
                    I12.g(b10);
                }
            } else {
                cVar.V1();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C5817c) obj);
            return C16807N.f139792a;
        }
    }

    static {
        long l10 = E.f12650a.l();
        c2.w.b(l10);
        f11201b = c2.w.l(v.f(l10), v.h(l10) / ((float) 2));
    }

    /* JADX WARNING: Removed duplicated region for block: B:107:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x01b8  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x01d3  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x01d8  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x01f1  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x01f6  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x020f  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0214  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x022d  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x0243  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x024b  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x0250  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x0269  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x026e  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x0288  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x029e  */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x02a4  */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x02bc  */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x02df  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x030e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:353:0x0586  */
    /* JADX WARNING: Removed duplicated region for block: B:355:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0129  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(T1.P r83, nI.C17642l<? super T1.P, XH.C16807N> r84, androidx.compose.ui.d r85, boolean r86, boolean r87, N1.Y r88, nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r89, nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r90, nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r91, nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r92, nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r93, nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r94, nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r95, boolean r96, T1.b0 r97, B0.A r98, B0.C4381z r99, boolean r100, int r101, int r102, r0.m r103, p1.i1 r104, O0.Z0 r105, U0.C4889m r106, int r107, int r108, int r109, int r110) {
        /*
            r15 = r107
            r14 = r108
            r13 = r109
            r12 = r110
            r0 = -1570442800(0xffffffffa264f1d0, float:-3.1027776E-18)
            r1 = r106
            U0.m r0 = r1.k(r0)
            r1 = r12 & 1
            if (r1 == 0) goto L_0x001b
            r1 = r15 | 6
            r4 = r1
            r1 = r83
            goto L_0x002f
        L_0x001b:
            r1 = r15 & 6
            if (r1 != 0) goto L_0x002c
            r1 = r83
            boolean r4 = r0.V(r1)
            if (r4 == 0) goto L_0x0029
            r4 = 4
            goto L_0x002a
        L_0x0029:
            r4 = 2
        L_0x002a:
            r4 = r4 | r15
            goto L_0x002f
        L_0x002c:
            r1 = r83
            r4 = r15
        L_0x002f:
            r5 = r12 & 2
            if (r5 == 0) goto L_0x0038
            r4 = r4 | 48
        L_0x0035:
            r5 = r84
            goto L_0x004a
        L_0x0038:
            r5 = r15 & 48
            if (r5 != 0) goto L_0x0035
            r5 = r84
            boolean r8 = r0.F(r5)
            if (r8 == 0) goto L_0x0047
            r8 = 32
            goto L_0x0049
        L_0x0047:
            r8 = 16
        L_0x0049:
            r4 = r4 | r8
        L_0x004a:
            r8 = r12 & 4
            if (r8 == 0) goto L_0x0053
            r4 = r4 | 384(0x180, float:5.38E-43)
        L_0x0050:
            r11 = r85
            goto L_0x0066
        L_0x0053:
            r11 = r15 & 384(0x180, float:5.38E-43)
            if (r11 != 0) goto L_0x0050
            r11 = r85
            boolean r16 = r0.V(r11)
            if (r16 == 0) goto L_0x0062
            r16 = 256(0x100, float:3.59E-43)
            goto L_0x0064
        L_0x0062:
            r16 = 128(0x80, float:1.794E-43)
        L_0x0064:
            r4 = r4 | r16
        L_0x0066:
            r16 = r12 & 8
            r17 = 1024(0x400, float:1.435E-42)
            r18 = 2048(0x800, float:2.87E-42)
            if (r16 == 0) goto L_0x0073
            r4 = r4 | 3072(0xc00, float:4.305E-42)
        L_0x0070:
            r2 = r86
            goto L_0x0086
        L_0x0073:
            r2 = r15 & 3072(0xc00, float:4.305E-42)
            if (r2 != 0) goto L_0x0070
            r2 = r86
            boolean r19 = r0.b(r2)
            if (r19 == 0) goto L_0x0082
            r19 = r18
            goto L_0x0084
        L_0x0082:
            r19 = r17
        L_0x0084:
            r4 = r4 | r19
        L_0x0086:
            r19 = r12 & 16
            r20 = 8192(0x2000, float:1.14794E-41)
            r21 = 16384(0x4000, float:2.2959E-41)
            if (r19 == 0) goto L_0x0093
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
        L_0x0090:
            r3 = r87
            goto L_0x00a6
        L_0x0093:
            r3 = r15 & 24576(0x6000, float:3.4438E-41)
            if (r3 != 0) goto L_0x0090
            r3 = r87
            boolean r23 = r0.b(r3)
            if (r23 == 0) goto L_0x00a2
            r23 = r21
            goto L_0x00a4
        L_0x00a2:
            r23 = r20
        L_0x00a4:
            r4 = r4 | r23
        L_0x00a6:
            r23 = 196608(0x30000, float:2.75506E-40)
            r23 = r15 & r23
            if (r23 != 0) goto L_0x00c0
            r23 = r12 & 32
            r6 = r88
            if (r23 != 0) goto L_0x00bb
            boolean r24 = r0.V(r6)
            if (r24 == 0) goto L_0x00bb
            r24 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00bd
        L_0x00bb:
            r24 = 65536(0x10000, float:9.18355E-41)
        L_0x00bd:
            r4 = r4 | r24
            goto L_0x00c2
        L_0x00c0:
            r6 = r88
        L_0x00c2:
            r24 = r12 & 64
            r25 = 1572864(0x180000, float:2.204052E-39)
            if (r24 == 0) goto L_0x00cd
            r4 = r4 | r25
            r7 = r89
            goto L_0x00e0
        L_0x00cd:
            r26 = r15 & r25
            r7 = r89
            if (r26 != 0) goto L_0x00e0
            boolean r27 = r0.F(r7)
            if (r27 == 0) goto L_0x00dc
            r27 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00de
        L_0x00dc:
            r27 = 524288(0x80000, float:7.34684E-40)
        L_0x00de:
            r4 = r4 | r27
        L_0x00e0:
            r9 = r12 & 128(0x80, float:1.794E-43)
            r28 = 4194304(0x400000, float:5.877472E-39)
            r29 = 12582912(0xc00000, float:1.7632415E-38)
            if (r9 == 0) goto L_0x00ed
            r4 = r4 | r29
            r10 = r90
            goto L_0x0100
        L_0x00ed:
            r30 = r15 & r29
            r10 = r90
            if (r30 != 0) goto L_0x0100
            boolean r31 = r0.F(r10)
            if (r31 == 0) goto L_0x00fc
            r31 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00fe
        L_0x00fc:
            r31 = r28
        L_0x00fe:
            r4 = r4 | r31
        L_0x0100:
            r1 = r12 & 256(0x100, float:3.59E-43)
            r31 = 100663296(0x6000000, float:2.4074124E-35)
            if (r1 == 0) goto L_0x010b
            r4 = r4 | r31
            r2 = r91
            goto L_0x011e
        L_0x010b:
            r31 = r15 & r31
            r2 = r91
            if (r31 != 0) goto L_0x011e
            boolean r31 = r0.F(r2)
            if (r31 == 0) goto L_0x011a
            r31 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x011c
        L_0x011a:
            r31 = 33554432(0x2000000, float:9.403955E-38)
        L_0x011c:
            r4 = r4 | r31
        L_0x011e:
            r2 = r12 & 512(0x200, float:7.175E-43)
            r31 = 805306368(0x30000000, float:4.656613E-10)
            if (r2 == 0) goto L_0x0129
            r4 = r4 | r31
            r3 = r92
            goto L_0x013c
        L_0x0129:
            r32 = r15 & r31
            r3 = r92
            if (r32 != 0) goto L_0x013c
            boolean r32 = r0.F(r3)
            if (r32 == 0) goto L_0x0138
            r32 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x013a
        L_0x0138:
            r32 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x013a:
            r4 = r4 | r32
        L_0x013c:
            r3 = r12 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L_0x0145
            r32 = r14 | 6
            r5 = r93
            goto L_0x015b
        L_0x0145:
            r32 = r14 & 6
            r5 = r93
            if (r32 != 0) goto L_0x0159
            boolean r32 = r0.F(r5)
            if (r32 == 0) goto L_0x0154
            r32 = 4
            goto L_0x0156
        L_0x0154:
            r32 = 2
        L_0x0156:
            r32 = r14 | r32
            goto L_0x015b
        L_0x0159:
            r32 = r14
        L_0x015b:
            r5 = r12 & 2048(0x800, float:2.87E-42)
            if (r5 == 0) goto L_0x0164
            r32 = r32 | 48
        L_0x0161:
            r6 = r32
            goto L_0x0178
        L_0x0164:
            r33 = r14 & 48
            r6 = r94
            if (r33 != 0) goto L_0x0161
            boolean r33 = r0.F(r6)
            if (r33 == 0) goto L_0x0173
            r33 = 32
            goto L_0x0175
        L_0x0173:
            r33 = 16
        L_0x0175:
            r32 = r32 | r33
            goto L_0x0161
        L_0x0178:
            r7 = r12 & 4096(0x1000, float:5.74E-42)
            if (r7 == 0) goto L_0x0181
            r6 = r6 | 384(0x180, float:5.38E-43)
        L_0x017e:
            r10 = r95
            goto L_0x0194
        L_0x0181:
            r10 = r14 & 384(0x180, float:5.38E-43)
            if (r10 != 0) goto L_0x017e
            r10 = r95
            boolean r32 = r0.F(r10)
            if (r32 == 0) goto L_0x0190
            r32 = 256(0x100, float:3.59E-43)
            goto L_0x0192
        L_0x0190:
            r32 = 128(0x80, float:1.794E-43)
        L_0x0192:
            r6 = r6 | r32
        L_0x0194:
            r10 = r12 & 8192(0x2000, float:1.14794E-41)
            if (r10 == 0) goto L_0x019d
            r6 = r6 | 3072(0xc00, float:4.305E-42)
        L_0x019a:
            r11 = r96
            goto L_0x01ad
        L_0x019d:
            r11 = r14 & 3072(0xc00, float:4.305E-42)
            if (r11 != 0) goto L_0x019a
            r11 = r96
            boolean r32 = r0.b(r11)
            if (r32 == 0) goto L_0x01ab
            r17 = r18
        L_0x01ab:
            r6 = r6 | r17
        L_0x01ad:
            r11 = r12 & 16384(0x4000, float:2.2959E-41)
            if (r11 == 0) goto L_0x01b8
            r6 = r6 | 24576(0x6000, float:3.4438E-41)
            r17 = r11
        L_0x01b5:
            r11 = r97
            goto L_0x01ca
        L_0x01b8:
            r17 = r11
            r11 = r14 & 24576(0x6000, float:3.4438E-41)
            if (r11 != 0) goto L_0x01b5
            r11 = r97
            boolean r18 = r0.V(r11)
            if (r18 == 0) goto L_0x01c8
            r20 = r21
        L_0x01c8:
            r6 = r6 | r20
        L_0x01ca:
            r18 = 32768(0x8000, float:4.5918E-41)
            r18 = r12 & r18
            r20 = 196608(0x30000, float:2.75506E-40)
            if (r18 == 0) goto L_0x01d8
            r6 = r6 | r20
            r11 = r98
            goto L_0x01eb
        L_0x01d8:
            r20 = r14 & r20
            r11 = r98
            if (r20 != 0) goto L_0x01eb
            boolean r20 = r0.V(r11)
            if (r20 == 0) goto L_0x01e7
            r20 = 131072(0x20000, float:1.83671E-40)
            goto L_0x01e9
        L_0x01e7:
            r20 = 65536(0x10000, float:9.18355E-41)
        L_0x01e9:
            r6 = r6 | r20
        L_0x01eb:
            r20 = 65536(0x10000, float:9.18355E-41)
            r20 = r12 & r20
            if (r20 == 0) goto L_0x01f6
            r6 = r6 | r25
            r11 = r99
            goto L_0x0209
        L_0x01f6:
            r21 = r14 & r25
            r11 = r99
            if (r21 != 0) goto L_0x0209
            boolean r21 = r0.V(r11)
            if (r21 == 0) goto L_0x0205
            r21 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x0207
        L_0x0205:
            r21 = 524288(0x80000, float:7.34684E-40)
        L_0x0207:
            r6 = r6 | r21
        L_0x0209:
            r21 = 131072(0x20000, float:1.83671E-40)
            r21 = r12 & r21
            if (r21 == 0) goto L_0x0214
            r6 = r6 | r29
            r11 = r100
            goto L_0x0227
        L_0x0214:
            r25 = r14 & r29
            r11 = r100
            if (r25 != 0) goto L_0x0227
            boolean r25 = r0.b(r11)
            if (r25 == 0) goto L_0x0223
            r25 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0225
        L_0x0223:
            r25 = r28
        L_0x0225:
            r6 = r6 | r25
        L_0x0227:
            r25 = 100663296(0x6000000, float:2.4074124E-35)
            r25 = r14 & r25
            if (r25 != 0) goto L_0x0243
            r25 = 262144(0x40000, float:3.67342E-40)
            r25 = r12 & r25
            r11 = r101
            if (r25 != 0) goto L_0x023e
            boolean r25 = r0.d(r11)
            if (r25 == 0) goto L_0x023e
            r25 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0240
        L_0x023e:
            r25 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0240:
            r6 = r6 | r25
            goto L_0x0245
        L_0x0243:
            r11 = r101
        L_0x0245:
            r25 = 524288(0x80000, float:7.34684E-40)
            r25 = r12 & r25
            if (r25 == 0) goto L_0x0250
            r6 = r6 | r31
            r11 = r102
            goto L_0x0263
        L_0x0250:
            r29 = r14 & r31
            r11 = r102
            if (r29 != 0) goto L_0x0263
            boolean r29 = r0.d(r11)
            if (r29 == 0) goto L_0x025f
            r29 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0261
        L_0x025f:
            r29 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0261:
            r6 = r6 | r29
        L_0x0263:
            r29 = 1048576(0x100000, float:1.469368E-39)
            r29 = r12 & r29
            if (r29 == 0) goto L_0x026e
            r22 = r13 | 6
            r11 = r103
            goto L_0x0284
        L_0x026e:
            r31 = r13 & 6
            r11 = r103
            if (r31 != 0) goto L_0x0282
            boolean r31 = r0.V(r11)
            if (r31 == 0) goto L_0x027d
            r22 = 4
            goto L_0x027f
        L_0x027d:
            r22 = 2
        L_0x027f:
            r22 = r13 | r22
            goto L_0x0284
        L_0x0282:
            r22 = r13
        L_0x0284:
            r31 = r13 & 48
            if (r31 != 0) goto L_0x029e
            r31 = 2097152(0x200000, float:2.938736E-39)
            r31 = r12 & r31
            r11 = r104
            if (r31 != 0) goto L_0x0299
            boolean r31 = r0.V(r11)
            if (r31 == 0) goto L_0x0299
            r23 = 32
            goto L_0x029b
        L_0x0299:
            r23 = 16
        L_0x029b:
            r22 = r22 | r23
            goto L_0x02a0
        L_0x029e:
            r11 = r104
        L_0x02a0:
            r11 = r13 & 384(0x180, float:5.38E-43)
            if (r11 != 0) goto L_0x02bc
            r11 = r12 & r28
            if (r11 != 0) goto L_0x02b3
            r11 = r105
            boolean r23 = r0.V(r11)
            if (r23 == 0) goto L_0x02b5
            r27 = 256(0x100, float:3.59E-43)
            goto L_0x02b7
        L_0x02b3:
            r11 = r105
        L_0x02b5:
            r27 = 128(0x80, float:1.794E-43)
        L_0x02b7:
            r22 = r22 | r27
        L_0x02b9:
            r11 = r22
            goto L_0x02bf
        L_0x02bc:
            r11 = r105
            goto L_0x02b9
        L_0x02bf:
            r22 = 306783379(0x12492493, float:6.34695E-28)
            r13 = r4 & r22
            r14 = 306783378(0x12492492, float:6.3469493E-28)
            if (r13 != r14) goto L_0x030e
            r13 = 306783379(0x12492493, float:6.34695E-28)
            r13 = r13 & r6
            r14 = 306783378(0x12492492, float:6.3469493E-28)
            if (r13 != r14) goto L_0x030e
            r11 = r11 & 147(0x93, float:2.06E-43)
            r13 = 146(0x92, float:2.05E-43)
            if (r11 != r13) goto L_0x030e
            boolean r11 = r0.l()
            if (r11 != 0) goto L_0x02df
            goto L_0x030e
        L_0x02df:
            r0.L()
            r3 = r85
            r4 = r86
            r5 = r87
            r6 = r88
            r7 = r89
            r8 = r90
            r9 = r91
            r10 = r92
            r11 = r93
            r12 = r94
            r13 = r95
            r14 = r96
            r15 = r97
            r16 = r98
            r17 = r99
            r18 = r100
            r19 = r101
            r20 = r102
            r21 = r103
            r22 = r104
            r23 = r105
            goto L_0x0580
        L_0x030e:
            r0.G()
            r11 = r15 & 1
            if (r11 == 0) goto L_0x035e
            boolean r11 = r0.O()
            if (r11 == 0) goto L_0x031c
            goto L_0x035e
        L_0x031c:
            r0.L()
            r1 = r12 & 32
            if (r1 == 0) goto L_0x0327
            r1 = -458753(0xfffffffffff8ffff, float:NaN)
            r4 = r4 & r1
        L_0x0327:
            r1 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 & r12
            if (r1 == 0) goto L_0x0330
            r1 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r6 = r6 & r1
        L_0x0330:
            r8 = r85
            r11 = r86
            r1 = r87
            r14 = r88
            r2 = r89
            r9 = r90
            r3 = r91
            r5 = r93
            r85 = r95
            r10 = r96
            r13 = r97
            r41 = r98
            r42 = r99
            r43 = r100
            r44 = r101
            r45 = r102
            r46 = r103
            r47 = r104
            r12 = r105
            r15 = r4
            r7 = r6
            r4 = r92
            r6 = r94
            goto L_0x0450
        L_0x035e:
            if (r8 == 0) goto L_0x0363
            androidx.compose.ui.d$a r8 = androidx.compose.ui.d.f18749a
            goto L_0x0365
        L_0x0363:
            r8 = r85
        L_0x0365:
            if (r16 == 0) goto L_0x0369
            r11 = 1
            goto L_0x036b
        L_0x0369:
            r11 = r86
        L_0x036b:
            if (r19 == 0) goto L_0x0370
            r16 = 0
            goto L_0x0372
        L_0x0370:
            r16 = r87
        L_0x0372:
            r19 = r12 & 32
            if (r19 == 0) goto L_0x0386
            U0.I0 r14 = O0.d1.d()
            java.lang.Object r14 = r0.Q(r14)
            N1.Y r14 = (N1.Y) r14
            r19 = -458753(0xfffffffffff8ffff, float:NaN)
            r4 = r4 & r19
            goto L_0x0388
        L_0x0386:
            r14 = r88
        L_0x0388:
            r19 = 0
            if (r24 == 0) goto L_0x038f
            r22 = r19
            goto L_0x0391
        L_0x038f:
            r22 = r89
        L_0x0391:
            if (r9 == 0) goto L_0x0396
            r9 = r19
            goto L_0x0398
        L_0x0396:
            r9 = r90
        L_0x0398:
            if (r1 == 0) goto L_0x039d
            r1 = r19
            goto L_0x039f
        L_0x039d:
            r1 = r91
        L_0x039f:
            if (r2 == 0) goto L_0x03a4
            r2 = r19
            goto L_0x03a6
        L_0x03a4:
            r2 = r92
        L_0x03a6:
            if (r3 == 0) goto L_0x03ab
            r3 = r19
            goto L_0x03ad
        L_0x03ab:
            r3 = r93
        L_0x03ad:
            if (r5 == 0) goto L_0x03b2
            r5 = r19
            goto L_0x03b4
        L_0x03b2:
            r5 = r94
        L_0x03b4:
            if (r7 == 0) goto L_0x03b9
            r7 = r19
            goto L_0x03bb
        L_0x03b9:
            r7 = r95
        L_0x03bb:
            if (r10 == 0) goto L_0x03bf
            r10 = 0
            goto L_0x03c1
        L_0x03bf:
            r10 = r96
        L_0x03c1:
            if (r17 == 0) goto L_0x03ca
            T1.b0$a r17 = T1.b0.f13577a
            T1.b0 r17 = r17.c()
            goto L_0x03cc
        L_0x03ca:
            r17 = r97
        L_0x03cc:
            if (r18 == 0) goto L_0x03d5
            B0.A$a r18 = B0.A.f4480g
            B0.A r18 = r18.a()
            goto L_0x03d7
        L_0x03d5:
            r18 = r98
        L_0x03d7:
            if (r20 == 0) goto L_0x03e0
            B0.z$a r20 = B0.C4381z.f5150g
            B0.z r20 = r20.a()
            goto L_0x03e2
        L_0x03e0:
            r20 = r99
        L_0x03e2:
            if (r21 == 0) goto L_0x03e7
            r21 = 0
            goto L_0x03e9
        L_0x03e7:
            r21 = r100
        L_0x03e9:
            r23 = 262144(0x40000, float:3.67342E-40)
            r23 = r12 & r23
            if (r23 == 0) goto L_0x03fd
            if (r21 == 0) goto L_0x03f4
            r23 = 1
            goto L_0x03f7
        L_0x03f4:
            r23 = 2147483647(0x7fffffff, float:NaN)
        L_0x03f7:
            r24 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r6 = r6 & r24
            goto L_0x03ff
        L_0x03fd:
            r23 = r101
        L_0x03ff:
            if (r25 == 0) goto L_0x0404
            r24 = 1
            goto L_0x0406
        L_0x0404:
            r24 = r102
        L_0x0406:
            if (r29 == 0) goto L_0x0409
            goto L_0x040b
        L_0x0409:
            r19 = r103
        L_0x040b:
            r25 = 2097152(0x200000, float:2.938736E-39)
            r25 = r12 & r25
            r13 = 6
            r85 = r1
            if (r25 == 0) goto L_0x041b
            O0.l0 r1 = O0.C4739l0.f11144a
            p1.i1 r1 = r1.k(r0, r13)
            goto L_0x041d
        L_0x041b:
            r1 = r104
        L_0x041d:
            r25 = r12 & r28
            r86 = r1
            if (r25 == 0) goto L_0x044b
            O0.l0 r1 = O0.C4739l0.f11144a
            O0.Z0 r1 = r1.c(r0, r13)
            r47 = r86
            r12 = r1
        L_0x042c:
            r15 = r4
            r1 = r16
            r13 = r17
            r41 = r18
            r46 = r19
            r42 = r20
            r43 = r21
            r44 = r23
            r45 = r24
            r4 = r2
            r2 = r22
            r82 = r3
            r3 = r85
            r85 = r7
            r7 = r6
            r6 = r5
            r5 = r82
            goto L_0x0450
        L_0x044b:
            r47 = r86
            r12 = r105
            goto L_0x042c
        L_0x0450:
            r0.y()
            boolean r16 = U0.C4895p.J()
            if (r16 == 0) goto L_0x0466
            r86 = r6
            r6 = -1570442800(0xffffffffa264f1d0, float:-3.1027776E-18)
            r87 = r5
            java.lang.String r5 = "androidx.compose.material3.OutlinedTextField (OutlinedTextField.kt:368)"
            U0.C4895p.S(r6, r15, r7, r5)
            goto L_0x046a
        L_0x0466:
            r87 = r5
            r86 = r6
        L_0x046a:
            r5 = 30368324(0x1cf6244, float:7.6180795E-38)
            r0.W(r5)
            if (r46 != 0) goto L_0x0488
            java.lang.Object r5 = r0.D()
            U0.m$a r6 = U0.C4889m.f14007a
            java.lang.Object r6 = r6.a()
            if (r5 != r6) goto L_0x0485
            r0.m r5 = r0.l.a()
            r0.u(r5)
        L_0x0485:
            r0.m r5 = (r0.m) r5
            goto L_0x048a
        L_0x0488:
            r5 = r46
        L_0x048a:
            r0.P()
            r6 = 30374434(0x1cf7a22, float:7.6215043E-38)
            r0.W(r6)
            long r6 = r14.h()
            r15 = 16
            int r15 = (r6 > r15 ? 1 : (r6 == r15 ? 0 : -1))
            if (r15 == 0) goto L_0x04a0
        L_0x049d:
            r49 = r6
            goto L_0x04b4
        L_0x04a0:
            r6 = 0
            U0.A1 r6 = r0.C5814f.a(r5, r0, r6)
            java.lang.Object r6 = r6.getValue()
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            long r6 = r12.m(r11, r10, r6)
            goto L_0x049d
        L_0x04b4:
            r0.P()
            N1.Y r6 = new N1.Y
            r48 = r6
            r78 = 16777214(0xfffffe, float:2.3509884E-38)
            r79 = 0
            r51 = 0
            r53 = 0
            r54 = 0
            r55 = 0
            r56 = 0
            r57 = 0
            r58 = 0
            r60 = 0
            r61 = 0
            r62 = 0
            r63 = 0
            r65 = 0
            r66 = 0
            r67 = 0
            r68 = 0
            r69 = 0
            r70 = 0
            r72 = 0
            r73 = 0
            r74 = 0
            r75 = 0
            r76 = 0
            r77 = 0
            r48.<init>(r49, r51, r53, r54, r55, r56, r57, r58, r60, r61, r62, r63, r65, r66, r67, r68, r69, r70, r72, r73, r74, r75, r76, r77, r78, r79)
            N1.Y r26 = r14.J(r6)
            U0.I0 r6 = androidx.compose.ui.platform.C5100f0.e()
            java.lang.Object r6 = r0.Q(r6)
            r19 = r6
            c2.d r19 = (c2.d) r19
            U0.I0 r6 = H0.W.b()
            H0.V r7 = r12.d()
            U0.J0 r6 = r6.d(r7)
            O0.m0$a r7 = new O0.m0$a
            r16 = r7
            r17 = r8
            r18 = r2
            r20 = r10
            r21 = r12
            r22 = r83
            r23 = r84
            r24 = r11
            r25 = r1
            r27 = r41
            r28 = r42
            r29 = r43
            r30 = r44
            r31 = r45
            r32 = r13
            r33 = r5
            r34 = r9
            r35 = r3
            r36 = r4
            r37 = r87
            r38 = r86
            r39 = r85
            r40 = r47
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            r5 = 54
            r15 = 1830921872(0x6d21a690, float:3.126778E27)
            r88 = r1
            r1 = 1
            c1.a r1 = c1.c.e(r15, r1, r7, r0, r5)
            int r5 = U0.J0.f13770i
            r5 = r5 | 48
            U0.C4910x.a(r6, r1, r0, r5)
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x055c
            U0.C4895p.R()
        L_0x055c:
            r5 = r88
            r7 = r2
            r23 = r12
            r15 = r13
            r6 = r14
            r16 = r41
            r17 = r42
            r18 = r43
            r19 = r44
            r20 = r45
            r21 = r46
            r22 = r47
            r13 = r85
            r12 = r86
            r14 = r10
            r10 = r4
            r4 = r11
            r11 = r87
            r82 = r9
            r9 = r3
            r3 = r8
            r8 = r82
        L_0x0580:
            U0.Y0 r2 = r0.n()
            if (r2 == 0) goto L_0x05a3
            O0.m0$b r1 = new O0.m0$b
            r0 = r1
            r80 = r1
            r1 = r83
            r81 = r2
            r2 = r84
            r24 = r107
            r25 = r108
            r26 = r109
            r27 = r110
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r1 = r80
            r0 = r81
            r0.a(r1)
        L_0x05a3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: O0.C4741m0.a(T1.P, nI.l, androidx.compose.ui.d, boolean, boolean, N1.Y, nI.p, nI.p, nI.p, nI.p, nI.p, nI.p, nI.p, boolean, T1.b0, B0.A, B0.z, boolean, int, int, r0.m, p1.i1, O0.Z0, U0.m, int, int, int, int):void");
    }

    public static final void b(androidx.compose.ui.d dVar, p<? super C4889m, ? super Integer, C16807N> pVar, q<? super androidx.compose.ui.d, ? super C4889m, ? super Integer, C16807N> qVar, p<? super C4889m, ? super Integer, C16807N> pVar2, p<? super C4889m, ? super Integer, C16807N> pVar3, p<? super C4889m, ? super Integer, C16807N> pVar4, p<? super C4889m, ? super Integer, C16807N> pVar5, p<? super C4889m, ? super Integer, C16807N> pVar6, boolean z10, float f10, C17642l<? super C5673m, C16807N> lVar, p<? super C4889m, ? super Integer, C16807N> pVar7, p<? super C4889m, ? super Integer, C16807N> pVar8, C5834E e10, C4889m mVar, int i10, int i11) {
        int i12;
        int i13;
        C5834E e11;
        int i14;
        float f11;
        androidx.compose.ui.d dVar2 = dVar;
        p<? super C4889m, ? super Integer, C16807N> pVar9 = pVar;
        q<? super androidx.compose.ui.d, ? super C4889m, ? super Integer, C16807N> qVar2 = qVar;
        p<? super C4889m, ? super Integer, C16807N> pVar10 = pVar2;
        p<? super C4889m, ? super Integer, C16807N> pVar11 = pVar3;
        p<? super C4889m, ? super Integer, C16807N> pVar12 = pVar4;
        p<? super C4889m, ? super Integer, C16807N> pVar13 = pVar5;
        p<? super C4889m, ? super Integer, C16807N> pVar14 = pVar6;
        boolean z11 = z10;
        float f12 = f10;
        C17642l<? super C5673m, C16807N> lVar2 = lVar;
        p<? super C4889m, ? super Integer, C16807N> pVar15 = pVar7;
        p<? super C4889m, ? super Integer, C16807N> pVar16 = pVar8;
        C5834E e12 = e10;
        int i15 = i10;
        int i16 = i11;
        C4889m k10 = mVar.k(1408290209);
        if ((i15 & 6) == 0) {
            i12 = i15 | (k10.V(dVar2) ? 4 : 2);
        } else {
            i12 = i15;
        }
        int i17 = 16;
        if ((i15 & 48) == 0) {
            i12 |= k10.F(pVar9) ? 32 : 16;
        }
        int i18 = 128;
        if ((i15 & 384) == 0) {
            i12 |= k10.F(qVar2) ? 256 : 128;
        }
        int i19 = 1024;
        if ((i15 & 3072) == 0) {
            i12 |= k10.F(pVar10) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        if ((i15 & 24576) == 0) {
            i12 |= k10.F(pVar11) ? 16384 : 8192;
        }
        if ((196608 & i15) == 0) {
            i12 |= k10.F(pVar12) ? 131072 : ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        }
        if ((1572864 & i15) == 0) {
            i12 |= k10.F(pVar13) ? ImageMetadata.SHADING_MODE : ImageMetadata.LENS_APERTURE;
        }
        if ((12582912 & i15) == 0) {
            i12 |= k10.F(pVar14) ? 8388608 : 4194304;
        }
        if ((100663296 & i15) == 0) {
            i12 |= k10.b(z11) ? 67108864 : 33554432;
        }
        if ((805306368 & i15) == 0) {
            i12 |= k10.c(f12) ? 536870912 : 268435456;
        }
        int i20 = i12;
        if ((i16 & 6) == 0) {
            i13 = i16 | (k10.F(lVar2) ? 4 : 2);
        } else {
            i13 = i16;
        }
        if ((i16 & 48) == 0) {
            if (k10.F(pVar15)) {
                i17 = 32;
            }
            i13 |= i17;
        }
        if ((i16 & 384) == 0) {
            if (k10.F(pVar8)) {
                i18 = 256;
            }
            i13 |= i18;
        } else {
            p<? super C4889m, ? super Integer, C16807N> pVar17 = pVar8;
        }
        if ((i16 & 3072) == 0) {
            e11 = e10;
            if (k10.V(e11)) {
                i19 = RecyclerView.n.FLAG_MOVED;
            }
            i13 |= i19;
        } else {
            e11 = e10;
        }
        int i21 = i13;
        if ((i20 & 306783379) == 306783378 && (i21 & 1171) == 1170 && k10.l()) {
            k10.L();
            p<? super C4889m, ? super Integer, C16807N> pVar18 = pVar2;
            p<? super C4889m, ? super Integer, C16807N> pVar19 = pVar8;
        } else {
            if (C4895p.J()) {
                C4895p.S(1408290209, i20, i21, "androidx.compose.material3.OutlinedTextFieldLayout (OutlinedTextField.kt:468)");
            }
            boolean z12 = ((i21 & 14) == 4) | ((234881024 & i20) == 67108864) | ((1879048192 & i20) == 536870912) | ((i21 & 7168) == 2048);
            Object D10 = k10.D();
            if (z12 || D10 == C4889m.f14007a.a()) {
                D10 = new C4743n0(lVar2, z11, f12, e11);
                k10.u(D10);
            }
            C4743n0 n0Var = (C4743n0) D10;
            c2.t tVar = (c2.t) k10.Q(C5100f0.k());
            int a10 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            androidx.compose.ui.d e13 = androidx.compose.ui.c.e(k10, dVar2);
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
            F1.c(a12, n0Var, aVar.c());
            F1.c(a12, s10, aVar.e());
            p<C4504g, Integer, C16807N> b10 = aVar.b();
            if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                a12.u(Integer.valueOf(a10));
                a12.w(Integer.valueOf(a10), b10);
            }
            F1.c(a12, e13, aVar.d());
            pVar15.invoke(k10, Integer.valueOf((i21 >> 3) & 14));
            k10.W(250370369);
            if (pVar11 != null) {
                androidx.compose.ui.d s11 = androidx.compose.ui.layout.a.b(androidx.compose.ui.d.f18749a, "Leading").s(w.k());
                I h10 = C5077h.h(C5437c.f24302a.e(), false);
                int a13 = C4883j.a(k10, 0);
                C4912y s12 = k10.s();
                androidx.compose.ui.d e14 = androidx.compose.ui.c.e(k10, s11);
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
                F1.c(a15, e14, aVar.d());
                C5079j jVar = C5079j.f18125a;
                pVar11.invoke(k10, Integer.valueOf((i20 >> 12) & 14));
                k10.x();
            }
            k10.P();
            k10.W(250379492);
            if (pVar12 != null) {
                androidx.compose.ui.d s13 = androidx.compose.ui.layout.a.b(androidx.compose.ui.d.f18749a, "Trailing").s(w.k());
                I h11 = C5077h.h(C5437c.f24302a.e(), false);
                int a16 = C4883j.a(k10, 0);
                C4912y s14 = k10.s();
                androidx.compose.ui.d e15 = androidx.compose.ui.c.e(k10, s13);
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
                F1.c(a18, e15, aVar.d());
                C5079j jVar2 = C5079j.f18125a;
                pVar12.invoke(k10, Integer.valueOf((i20 >> 15) & 14));
                k10.x();
            }
            k10.P();
            float g10 = D.g(e11, tVar);
            float f13 = D.f(e11, tVar);
            if (pVar11 != null) {
                i14 = 0;
                g10 = h.B(C17978n.d(h.B(g10 - w.j()), h.B((float) 0)));
            } else {
                i14 = 0;
            }
            if (pVar12 != null) {
                f13 = h.B(C17978n.d(h.B(f13 - w.j()), h.B((float) i14)));
            }
            k10.W(250410106);
            if (pVar13 != null) {
                androidx.compose.ui.d m10 = D.m(J.C(J.k(androidx.compose.ui.layout.a.b(androidx.compose.ui.d.f18749a, "Prefix"), w.o(), 0.0f, 2, (Object) null), (C5437c.C0386c) null, false, 3, (Object) null), g10, 0.0f, w.p(), 0.0f, 10, (Object) null);
                I h12 = C5077h.h(C5437c.f24302a.o(), false);
                int a19 = C4883j.a(k10, 0);
                C4912y s15 = k10.s();
                androidx.compose.ui.d e16 = androidx.compose.ui.c.e(k10, m10);
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
                F1.c(a21, s15, aVar.e());
                p<C4504g, Integer, C16807N> b13 = aVar.b();
                if (a21.i() || !C17542s.e(a21.D(), Integer.valueOf(a19))) {
                    a21.u(Integer.valueOf(a19));
                    a21.w(Integer.valueOf(a19), b13);
                }
                F1.c(a21, e16, aVar.d());
                C5079j jVar3 = C5079j.f18125a;
                pVar13.invoke(k10, Integer.valueOf((i20 >> 18) & 14));
                k10.x();
            }
            k10.P();
            k10.W(250422072);
            if (pVar14 != null) {
                androidx.compose.ui.d m11 = D.m(J.C(J.k(androidx.compose.ui.layout.a.b(androidx.compose.ui.d.f18749a, "Suffix"), w.o(), 0.0f, 2, (Object) null), (C5437c.C0386c) null, false, 3, (Object) null), w.p(), 0.0f, f13, 0.0f, 10, (Object) null);
                I h13 = C5077h.h(C5437c.f24302a.o(), false);
                int a22 = C4883j.a(k10, 0);
                C4912y s16 = k10.s();
                androidx.compose.ui.d e17 = androidx.compose.ui.c.e(k10, m11);
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
                f11 = g10;
                F1.c(a24, h13, aVar.c());
                F1.c(a24, s16, aVar.e());
                p<C4504g, Integer, C16807N> b14 = aVar.b();
                if (a24.i() || !C17542s.e(a24.D(), Integer.valueOf(a22))) {
                    a24.u(Integer.valueOf(a22));
                    a24.w(Integer.valueOf(a22), b14);
                }
                F1.c(a24, e17, aVar.d());
                C5079j jVar4 = C5079j.f18125a;
                pVar14.invoke(k10, Integer.valueOf((i20 >> 21) & 14));
                k10.x();
            } else {
                f11 = g10;
            }
            k10.P();
            d.a aVar2 = androidx.compose.ui.d.f18749a;
            androidx.compose.ui.d C10 = J.C(J.k(aVar2, w.o(), 0.0f, 2, (Object) null), (C5437c.C0386c) null, false, 3, (Object) null);
            float B10 = pVar13 == null ? f11 : h.B((float) 0);
            if (pVar14 != null) {
                f13 = h.B((float) 0);
            }
            androidx.compose.ui.d m12 = D.m(C10, B10, 0.0f, f13, 0.0f, 10, (Object) null);
            k10.W(250444361);
            q<? super androidx.compose.ui.d, ? super C4889m, ? super Integer, C16807N> qVar3 = qVar;
            if (qVar3 != null) {
                qVar3.invoke(androidx.compose.ui.layout.a.b(aVar2, "Hint").s(m12), k10, Integer.valueOf((i20 >> 3) & 112));
            }
            k10.P();
            androidx.compose.ui.d s17 = androidx.compose.ui.layout.a.b(aVar2, "TextField").s(m12);
            C5437c.a aVar3 = C5437c.f24302a;
            I h14 = C5077h.h(aVar3.o(), true);
            int a25 = C4883j.a(k10, 0);
            C4912y s18 = k10.s();
            androidx.compose.ui.d e18 = androidx.compose.ui.c.e(k10, s17);
            C17631a<C4504g> a26 = aVar.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a26);
            } else {
                k10.t();
            }
            C4889m a27 = F1.a(k10);
            F1.c(a27, h14, aVar.c());
            F1.c(a27, s18, aVar.e());
            p<C4504g, Integer, C16807N> b15 = aVar.b();
            if (a27.i() || !C17542s.e(a27.D(), Integer.valueOf(a25))) {
                a27.u(Integer.valueOf(a25));
                a27.w(Integer.valueOf(a25), b15);
            }
            F1.c(a27, e18, aVar.d());
            C5079j jVar5 = C5079j.f18125a;
            pVar.invoke(k10, Integer.valueOf((i20 >> 3) & 14));
            k10.x();
            k10.W(250455481);
            p<? super C4889m, ? super Integer, C16807N> pVar20 = pVar2;
            if (pVar20 != null) {
                androidx.compose.ui.d b16 = androidx.compose.ui.layout.a.b(J.C(J.k(aVar2, i.c(w.o(), w.m(), f12), 0.0f, 2, (Object) null), (C5437c.C0386c) null, false, 3, (Object) null), "Label");
                I h15 = C5077h.h(aVar3.o(), false);
                int a28 = C4883j.a(k10, 0);
                C4912y s19 = k10.s();
                androidx.compose.ui.d e19 = androidx.compose.ui.c.e(k10, b16);
                C17631a<C4504g> a29 = aVar.a();
                if (k10.m() == null) {
                    C4883j.c();
                }
                k10.I();
                if (k10.i()) {
                    k10.p(a29);
                } else {
                    k10.t();
                }
                C4889m a30 = F1.a(k10);
                F1.c(a30, h15, aVar.c());
                F1.c(a30, s19, aVar.e());
                p<C4504g, Integer, C16807N> b17 = aVar.b();
                if (a30.i() || !C17542s.e(a30.D(), Integer.valueOf(a28))) {
                    a30.u(Integer.valueOf(a28));
                    a30.w(Integer.valueOf(a28), b17);
                }
                F1.c(a30, e19, aVar.d());
                pVar20.invoke(k10, Integer.valueOf((i20 >> 9) & 14));
                k10.x();
            }
            k10.P();
            k10.W(250473414);
            p<? super C4889m, ? super Integer, C16807N> pVar21 = pVar8;
            if (pVar21 != null) {
                androidx.compose.ui.d h16 = D.h(J.C(J.k(androidx.compose.ui.layout.a.b(aVar2, "Supporting"), w.n(), 0.0f, 2, (Object) null), (C5437c.C0386c) null, false, 3, (Object) null), a1.b(a1.f10253a, 0.0f, 0.0f, 0.0f, 0.0f, 15, (Object) null));
                I h17 = C5077h.h(aVar3.o(), false);
                int a31 = C4883j.a(k10, 0);
                C4912y s20 = k10.s();
                androidx.compose.ui.d e20 = androidx.compose.ui.c.e(k10, h16);
                C17631a<C4504g> a32 = aVar.a();
                if (k10.m() == null) {
                    C4883j.c();
                }
                k10.I();
                if (k10.i()) {
                    k10.p(a32);
                } else {
                    k10.t();
                }
                C4889m a33 = F1.a(k10);
                F1.c(a33, h17, aVar.c());
                F1.c(a33, s20, aVar.e());
                p<C4504g, Integer, C16807N> b18 = aVar.b();
                if (a33.i() || !C17542s.e(a33.D(), Integer.valueOf(a31))) {
                    a33.u(Integer.valueOf(a31));
                    a33.w(Integer.valueOf(a31), b18);
                }
                F1.c(a33, e20, aVar.d());
                pVar21.invoke(k10, Integer.valueOf((i21 >> 6) & 14));
                k10.x();
            }
            k10.P();
            k10.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            c cVar = r0;
            c cVar2 = new c(dVar, pVar, qVar, pVar2, pVar3, pVar4, pVar5, pVar6, z10, f10, lVar, pVar7, pVar8, e10, i10, i11);
            n10.a(cVar);
        }
    }

    /* access modifiers changed from: private */
    public static final int h(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, float f10, long j10, float f11, C5834E e10) {
        int j11 = C17035a.j(i14, i16, i12, i13, C5295b.c(i15, 0, f10));
        float d10 = e10.d() * f11;
        return Math.max(C5267b.m(j10), Math.max(i10, Math.max(i11, C17752b.e(C5295b.b(d10, Math.max(d10, ((float) i15) / 2.0f), f10) + ((float) j11) + (e10.a() * f11)))) + i17);
    }

    /* access modifiers changed from: private */
    public static final int i(int i10, int i11, int i12, int i13, int i14, int i15, int i16, float f10, long j10, float f11, C5834E e10) {
        int i17 = i12 + i13;
        int max = i10 + Math.max(i14 + i17, Math.max(i16 + i17, C5295b.c(i15, 0, f10))) + i11;
        c2.t tVar = c2.t.Ltr;
        return Math.max(max, Math.max(C17752b.e((((float) i15) + (h.B(e10.c(tVar) + e10.b(tVar)) * f11)) * f10), C5267b.n(j10)));
    }

    public static final long j() {
        return f11201b;
    }

    public static final androidx.compose.ui.d k(androidx.compose.ui.d dVar, C17631a<C5673m> aVar, C5834E e10) {
        return androidx.compose.ui.draw.b.d(dVar, new d(aVar, e10));
    }

    /* access modifiers changed from: private */
    public static final void l(a0.a aVar, int i10, int i11, a0 a0Var, a0 a0Var2, a0 a0Var3, a0 a0Var4, a0 a0Var5, a0 a0Var6, a0 a0Var7, a0 a0Var8, a0 a0Var9, float f10, boolean z10, float f11, c2.t tVar, C5834E e10) {
        a0 a0Var10 = a0Var3;
        a0 a0Var11 = a0Var4;
        a0 a0Var12 = a0Var6;
        a0 a0Var13 = a0Var7;
        float f12 = f10;
        boolean z11 = z10;
        a0.a.k(aVar, a0Var8, n.f23044b.a(), 0.0f, 2, (Object) null);
        int t10 = i10 - w.t(a0Var9);
        int e11 = C17752b.e(e10.d() * f11);
        int e12 = C17752b.e(D.g(e10, tVar) * f11);
        float j10 = w.j() * f11;
        if (a0Var != null) {
            a0.a.m(aVar, a0Var, 0, C5437c.f24302a.i().a(a0Var.z0(), t10), 0.0f, 4, (Object) null);
        }
        if (a0Var12 != null) {
            a0.a.m(aVar, a0Var6, C17752b.e(a0Var == null ? 0.0f : (((float) w.v(a0Var)) - j10) * (((float) 1) - f12)) + e12, C5295b.c(z11 ? C5437c.f24302a.i().a(a0Var6.z0(), t10) : e11, -(a0Var6.z0() / 2), f12), 0.0f, 4, (Object) null);
        }
        if (a0Var10 != null) {
            a0.a.m(aVar, a0Var3, w.v(a0Var), m(z11, t10, e11, a0Var12, a0Var10), 0.0f, 4, (Object) null);
        }
        int v10 = w.v(a0Var) + w.v(a0Var3);
        a0.a.m(aVar, a0Var5, v10, m(z11, t10, e11, a0Var12, a0Var5), 0.0f, 4, (Object) null);
        if (a0Var13 != null) {
            a0.a.m(aVar, a0Var7, v10, m(z11, t10, e11, a0Var12, a0Var13), 0.0f, 4, (Object) null);
        }
        if (a0Var11 != null) {
            a0.a.m(aVar, a0Var4, (i11 - w.v(a0Var2)) - a0Var4.E0(), m(z11, t10, e11, a0Var12, a0Var11), 0.0f, 4, (Object) null);
        }
        if (a0Var2 != null) {
            a0.a.m(aVar, a0Var2, i11 - a0Var2.E0(), C5437c.f24302a.i().a(a0Var2.z0(), t10), 0.0f, 4, (Object) null);
        }
        if (a0Var9 != null) {
            a0.a.m(aVar, a0Var9, 0, t10, 0.0f, 4, (Object) null);
        }
    }

    private static final int m(boolean z10, int i10, int i11, a0 a0Var, a0 a0Var2) {
        if (z10) {
            i11 = C5437c.f24302a.i().a(a0Var2.z0(), i10);
        }
        return Math.max(i11, w.t(a0Var) / 2);
    }

    /* access modifiers changed from: private */
    public static final int n(int i10, int i11) {
        return i10 == Integer.MAX_VALUE ? i10 : i10 - i11;
    }
}
