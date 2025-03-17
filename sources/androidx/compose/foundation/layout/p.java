package androidx.compose.foundation.layout;

import E1.C4484q;
import E1.H;
import E1.J;
import E1.K;
import E1.a0;
import U0.C4889m;
import U0.C4895p;
import U0.M0;
import XH.C16807N;
import YH.C16870n;
import YH.C16877v;
import YH.U;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5082m;
import androidx.compose.foundation.layout.o;
import androidx.compose.foundation.layout.q;
import c2.C5267b;
import i1.C5437c;
import j0.C5456l;
import j0.C5460p;
import j0.D;
import j0.E;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.O;
import nI.C17642l;
import nI.q;
import s0.C5830A;
import s0.C5833D;
import s0.C5838I;
import s0.C5840K;
import s0.C5841L;
import s0.C5864j;
import s0.C5871q;
import s0.C5872r;
import s0.C5873s;
import tI.C17974j;
import tI.C17978n;

@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u001a_\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a7\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001aU\u0010\u001e\u001a\u00020\u00062\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u001e\u0010\u001b\u001a\u001a\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u001a2\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0001\u0010\"\u001a\u00020\u00062\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u001e\u0010\u001b\u001a\u001a\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u001a2\u001e\u0010 \u001a\u001a\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u001a2\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\"\u0010#\u001a]\u0010)\u001a\u00020(2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020$2\u0006\u0010'\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0012H\u0002¢\u0006\u0004\b)\u0010*\u001a\u0001\u0010+\u001a\u00020(2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u001e\u0010\u001b\u001a\u001a\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u001a2\u001e\u0010 \u001a\u001a\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u001a2\u0006\u0010'\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0012H\u0002¢\u0006\u0004\b+\u0010,\u001a\\\u00109\u001a\u000208*\u00020-2\u0006\u0010/\u001a\u00020.2\f\u00102\u001a\b\u0012\u0004\u0012\u000201002\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u0002032\u0006\u00107\u001a\u0002062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0012H\u0000ø\u0001\u0000¢\u0006\u0004\b9\u0010:\u001a%\u0010=\u001a\u0004\u0018\u000101*\b\u0012\u0004\u0012\u000201002\b\u0010<\u001a\u0004\u0018\u00010;H\u0002¢\u0006\u0004\b=\u0010>\u001a#\u0010A\u001a\u00020\u0006*\u00020\u00182\u0006\u0010@\u001a\u00020?2\u0006\u0010 \u001a\u00020\u0006H\u0000¢\u0006\u0004\bA\u0010B\u001a#\u0010C\u001a\u00020\u0006*\u00020\u00182\u0006\u0010@\u001a\u00020?2\u0006\u0010\u001b\u001a\u00020\u0006H\u0000¢\u0006\u0004\bC\u0010B\u001a<\u0010G\u001a\u00020(*\u0002012\u0006\u0010/\u001a\u00020.2\u0006\u00107\u001a\u00020D2\u0014\u0010F\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010E\u0012\u0004\u0012\u00020\r0\u000bH\u0000ø\u0001\u0000¢\u0006\u0004\bG\u0010H\u001aT\u0010O\u001a\u000208*\u00020-2\u0006\u00107\u001a\u0002062\u0006\u0010I\u001a\u00020\u00062\u0006\u0010J\u001a\u00020\u00062\u0006\u0010&\u001a\u00020$2\f\u0010L\u001a\b\u0012\u0004\u0012\u0002080K2\u0006\u0010M\u001a\u00020.2\u0006\u0010N\u001a\u00020$H\u0000ø\u0001\u0000¢\u0006\u0004\bO\u0010P\"\u001a\u0010U\u001a\u00020Q8\u0000X\u0004¢\u0006\f\n\u0004\b\u000f\u0010R\u001a\u0004\bS\u0010T\"\u001a\u0010X\u001a\u00020Q8\u0000X\u0004¢\u0006\f\n\u0004\bV\u0010R\u001a\u0004\bW\u0010T\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006Y"}, d2 = {"Landroidx/compose/ui/d;", "modifier", "Landroidx/compose/foundation/layout/d$e;", "horizontalArrangement", "Landroidx/compose/foundation/layout/d$m;", "verticalArrangement", "", "maxItemsInEachRow", "maxLines", "Landroidx/compose/foundation/layout/u;", "overflow", "Lkotlin/Function1;", "Ls0/r;", "LXH/N;", "content", "a", "(Landroidx/compose/ui/d;Landroidx/compose/foundation/layout/d$e;Landroidx/compose/foundation/layout/d$m;IILandroidx/compose/foundation/layout/u;LnI/q;LU0/m;II)V", "maxItemsInMainAxis", "Landroidx/compose/foundation/layout/r;", "overflowState", "LE1/O;", "n", "(Landroidx/compose/foundation/layout/d$e;Landroidx/compose/foundation/layout/d$m;IILandroidx/compose/foundation/layout/r;LU0/m;I)LE1/O;", "", "LE1/q;", "children", "Lkotlin/Function3;", "mainAxisSize", "crossAxisAvailable", "mainAxisSpacing", "j", "(Ljava/util/List;LnI/q;III)I", "crossAxisSize", "crossAxisSpacing", "l", "(Ljava/util/List;LnI/q;LnI/q;IIIIILandroidx/compose/foundation/layout/r;)I", "", "mainAxisSizes", "crossAxisSizes", "mainAxisAvailable", "Lj0/l;", "h", "(Ljava/util/List;[I[IIIIIILandroidx/compose/foundation/layout/r;)J", "g", "(Ljava/util/List;LnI/q;LnI/q;IIIIILandroidx/compose/foundation/layout/r;)J", "LE1/K;", "Landroidx/compose/foundation/layout/s;", "measurePolicy", "", "LE1/H;", "measurablesIterator", "Lc2/h;", "mainAxisSpacingDp", "crossAxisSpacingDp", "Ls0/D;", "constraints", "LE1/J;", "e", "(LE1/K;Landroidx/compose/foundation/layout/s;Ljava/util/Iterator;FFJIILandroidx/compose/foundation/layout/r;)LE1/J;", "Ls0/q;", "info", "o", "(Ljava/util/Iterator;Ls0/q;)LE1/H;", "", "isHorizontal", "i", "(LE1/q;ZI)I", "f", "Lc2/b;", "LE1/a0;", "storePlaceable", "k", "(LE1/H;Landroidx/compose/foundation/layout/s;JLnI/l;)J", "mainAxisTotalSize", "crossAxisTotalSize", "LW0/b;", "items", "measureHelper", "outPosition", "m", "(LE1/K;JII[ILW0/b;Landroidx/compose/foundation/layout/s;[I)LE1/J;", "Landroidx/compose/foundation/layout/m;", "Landroidx/compose/foundation/layout/m;", "getCROSS_AXIS_ALIGNMENT_TOP", "()Landroidx/compose/foundation/layout/m;", "CROSS_AXIS_ALIGNMENT_TOP", "b", "getCROSS_AXIS_ALIGNMENT_START", "CROSS_AXIS_ALIGNMENT_START", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class p {

    /* renamed from: a  reason: collision with root package name */
    private static final C5082m f18161a;

    /* renamed from: b  reason: collision with root package name */
    private static final C5082m f18162b;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends C17544u implements nI.p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f18163c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C5073d.e f18164d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C5073d.m f18165e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f18166f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f18167g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ u f18168h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ q<C5872r, C4889m, Integer, C16807N> f18169i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ int f18170j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ int f18171k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(androidx.compose.ui.d dVar, C5073d.e eVar, C5073d.m mVar, int i10, int i11, u uVar, q<? super C5872r, ? super C4889m, ? super Integer, C16807N> qVar, int i12, int i13) {
            super(2);
            this.f18163c = dVar;
            this.f18164d = eVar;
            this.f18165e = mVar;
            this.f18166f = i10;
            this.f18167g = i11;
            this.f18168h = uVar;
            this.f18169i = qVar;
            this.f18170j = i12;
            this.f18171k = i13;
        }

        public final void a(C4889m mVar, int i10) {
            p.a(this.f18163c, this.f18164d, this.f18165e, this.f18166f, this.f18167g, this.f18168h, this.f18169i, mVar, M0.a(this.f18170j | 1), this.f18171k);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "a", "(LU0/m;I)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends C17544u implements nI.p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ q<C5872r, C4889m, Integer, C16807N> f18172c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(q<? super C5872r, ? super C4889m, ? super Integer, C16807N> qVar) {
            super(2);
            this.f18172c = qVar;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-139531073, i10, -1, "androidx.compose.foundation.layout.FlowRow.<anonymous>.<anonymous> (FlowLayout.kt:105)");
                }
                this.f18172c.invoke(C5873s.f28837b, mVar, 6);
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

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LE1/a0;", "placeable", "LXH/N;", "a", "(LE1/a0;)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends C17544u implements C17642l<a0, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ O<a0> f18173c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(O<a0> o10) {
            super(1);
            this.f18173c = o10;
        }

        public final void a(a0 a0Var) {
            this.f18173c.f144348a = a0Var;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((a0) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LE1/a0;", "placeable", "LXH/N;", "a", "(LE1/a0;)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends C17544u implements C17642l<a0, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ O<a0> f18174c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(O<a0> o10) {
            super(1);
            this.f18174c = o10;
        }

        public final void a(a0 a0Var) {
            this.f18174c.f144348a = a0Var;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((a0) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LE1/q;", "", "index", "<anonymous parameter 1>", "a", "(LE1/q;II)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class e extends C17544u implements q<C4484q, Integer, Integer, Integer> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int[] f18175c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(int[] iArr) {
            super(3);
            this.f18175c = iArr;
        }

        public final Integer a(C4484q qVar, int i10, int i11) {
            return Integer.valueOf(this.f18175c[i10]);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((C4484q) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LE1/q;", "", "index", "<anonymous parameter 1>", "a", "(LE1/q;II)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class f extends C17544u implements q<C4484q, Integer, Integer, Integer> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int[] f18176c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(int[] iArr) {
            super(3);
            this.f18176c = iArr;
        }

        public final Integer a(C4484q qVar, int i10, int i11) {
            return Integer.valueOf(this.f18176c[i10]);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((C4484q) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LE1/a0$a;", "LXH/N;", "a", "(LE1/a0$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class g extends C17544u implements C17642l<a0.a, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ W0.b<J> f18177c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(W0.b<J> bVar) {
            super(1);
            this.f18177c = bVar;
        }

        public final void a(a0.a aVar) {
            W0.b<J> bVar = this.f18177c;
            int r10 = bVar.r();
            if (r10 > 0) {
                Object[] q10 = bVar.q();
                int i10 = 0;
                do {
                    ((J) q10[i10]).x();
                    i10++;
                } while (i10 < r10);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((a0.a) obj);
            return C16807N.f139792a;
        }
    }

    static {
        C5082m.c cVar = C5082m.f18136a;
        C5437c.a aVar = C5437c.f24302a;
        f18161a = cVar.c(aVar.l());
        f18162b = cVar.b(aVar.k());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: androidx.compose.foundation.layout.r} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v44, resolved type: java.util.ArrayList} */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x018c, code lost:
        if (r4 == U0.C4889m.f14007a.a()) goto L_0x018e;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0257  */
    /* JADX WARNING: Removed duplicated region for block: B:147:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00ec  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(androidx.compose.ui.d r18, androidx.compose.foundation.layout.C5073d.e r19, androidx.compose.foundation.layout.C5073d.m r20, int r21, int r22, androidx.compose.foundation.layout.u r23, nI.q<? super s0.C5872r, ? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r24, U0.C4889m r25, int r26, int r27) {
        /*
            r7 = r24
            r8 = r26
            r0 = 437853230(0x1a191c2e, float:3.1662422E-23)
            r1 = r25
            U0.m r1 = r1.k(r0)
            r2 = r27 & 1
            if (r2 == 0) goto L_0x0017
            r3 = r8 | 6
            r4 = r3
            r3 = r18
            goto L_0x002b
        L_0x0017:
            r3 = r8 & 6
            if (r3 != 0) goto L_0x0028
            r3 = r18
            boolean r4 = r1.V(r3)
            if (r4 == 0) goto L_0x0025
            r4 = 4
            goto L_0x0026
        L_0x0025:
            r4 = 2
        L_0x0026:
            r4 = r4 | r8
            goto L_0x002b
        L_0x0028:
            r3 = r18
            r4 = r8
        L_0x002b:
            r5 = r27 & 2
            if (r5 == 0) goto L_0x0034
            r4 = r4 | 48
        L_0x0031:
            r6 = r19
            goto L_0x0046
        L_0x0034:
            r6 = r8 & 48
            if (r6 != 0) goto L_0x0031
            r6 = r19
            boolean r9 = r1.V(r6)
            if (r9 == 0) goto L_0x0043
            r9 = 32
            goto L_0x0045
        L_0x0043:
            r9 = 16
        L_0x0045:
            r4 = r4 | r9
        L_0x0046:
            r9 = r27 & 4
            if (r9 == 0) goto L_0x004f
            r4 = r4 | 384(0x180, float:5.38E-43)
        L_0x004c:
            r10 = r20
            goto L_0x0061
        L_0x004f:
            r10 = r8 & 384(0x180, float:5.38E-43)
            if (r10 != 0) goto L_0x004c
            r10 = r20
            boolean r11 = r1.V(r10)
            if (r11 == 0) goto L_0x005e
            r11 = 256(0x100, float:3.59E-43)
            goto L_0x0060
        L_0x005e:
            r11 = 128(0x80, float:1.794E-43)
        L_0x0060:
            r4 = r4 | r11
        L_0x0061:
            r11 = r27 & 8
            if (r11 == 0) goto L_0x006a
            r4 = r4 | 3072(0xc00, float:4.305E-42)
        L_0x0067:
            r12 = r21
            goto L_0x007c
        L_0x006a:
            r12 = r8 & 3072(0xc00, float:4.305E-42)
            if (r12 != 0) goto L_0x0067
            r12 = r21
            boolean r13 = r1.d(r12)
            if (r13 == 0) goto L_0x0079
            r13 = 2048(0x800, float:2.87E-42)
            goto L_0x007b
        L_0x0079:
            r13 = 1024(0x400, float:1.435E-42)
        L_0x007b:
            r4 = r4 | r13
        L_0x007c:
            r13 = r27 & 16
            if (r13 == 0) goto L_0x0085
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
        L_0x0082:
            r14 = r22
            goto L_0x0097
        L_0x0085:
            r14 = r8 & 24576(0x6000, float:3.4438E-41)
            if (r14 != 0) goto L_0x0082
            r14 = r22
            boolean r15 = r1.d(r14)
            if (r15 == 0) goto L_0x0094
            r15 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0096
        L_0x0094:
            r15 = 8192(0x2000, float:1.14794E-41)
        L_0x0096:
            r4 = r4 | r15
        L_0x0097:
            r15 = r27 & 32
            r16 = 196608(0x30000, float:2.75506E-40)
            if (r15 == 0) goto L_0x00a2
            r4 = r4 | r16
            r0 = r23
            goto L_0x00b5
        L_0x00a2:
            r16 = r8 & r16
            r0 = r23
            if (r16 != 0) goto L_0x00b5
            boolean r16 = r1.V(r0)
            if (r16 == 0) goto L_0x00b1
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b3
        L_0x00b1:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00b3:
            r4 = r4 | r16
        L_0x00b5:
            r16 = r27 & 64
            r17 = 1572864(0x180000, float:2.204052E-39)
            if (r16 == 0) goto L_0x00be
            r4 = r4 | r17
            goto L_0x00cf
        L_0x00be:
            r16 = r8 & r17
            if (r16 != 0) goto L_0x00cf
            boolean r16 = r1.F(r7)
            if (r16 == 0) goto L_0x00cb
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00cd
        L_0x00cb:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00cd:
            r4 = r4 | r16
        L_0x00cf:
            r16 = 599187(0x92493, float:8.3964E-40)
            r0 = r4 & r16
            r3 = 599186(0x92492, float:8.39638E-40)
            if (r0 != r3) goto L_0x00ec
            boolean r0 = r1.l()
            if (r0 != 0) goto L_0x00e0
            goto L_0x00ec
        L_0x00e0:
            r1.L()
            r2 = r18
            r9 = r23
            r3 = r10
            r4 = r12
            r5 = r14
            goto L_0x0251
        L_0x00ec:
            if (r2 == 0) goto L_0x00f1
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            goto L_0x00f3
        L_0x00f1:
            r0 = r18
        L_0x00f3:
            if (r5 == 0) goto L_0x00fc
            androidx.compose.foundation.layout.d r2 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$e r2 = r2.f()
            r6 = r2
        L_0x00fc:
            if (r9 == 0) goto L_0x0105
            androidx.compose.foundation.layout.d r2 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r2 = r2.g()
            goto L_0x0106
        L_0x0105:
            r2 = r10
        L_0x0106:
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r11 == 0) goto L_0x010d
            r5 = r3
            goto L_0x010e
        L_0x010d:
            r5 = r12
        L_0x010e:
            if (r13 == 0) goto L_0x0111
            goto L_0x0112
        L_0x0111:
            r3 = r14
        L_0x0112:
            if (r15 == 0) goto L_0x011c
            androidx.compose.foundation.layout.u$a r9 = androidx.compose.foundation.layout.u.f18234f
            androidx.compose.foundation.layout.u r9 = r9.a()
            r15 = r9
            goto L_0x011e
        L_0x011c:
            r15 = r23
        L_0x011e:
            boolean r9 = U0.C4895p.J()
            if (r9 == 0) goto L_0x012d
            r9 = -1
            java.lang.String r10 = "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:92)"
            r11 = 437853230(0x1a191c2e, float:3.1662422E-23)
            U0.C4895p.S(r11, r4, r9, r10)
        L_0x012d:
            r9 = 458752(0x70000, float:6.42848E-40)
            r14 = r4 & r9
            r13 = 0
            r12 = 1
            r9 = 131072(0x20000, float:1.83671E-40)
            if (r14 != r9) goto L_0x0139
            r9 = r12
            goto L_0x013a
        L_0x0139:
            r9 = r13
        L_0x013a:
            java.lang.Object r10 = r1.D()
            if (r9 != 0) goto L_0x0148
            U0.m$a r9 = U0.C4889m.f14007a
            java.lang.Object r9 = r9.a()
            if (r10 != r9) goto L_0x014f
        L_0x0148:
            androidx.compose.foundation.layout.r r10 = r15.b()
            r1.u(r10)
        L_0x014f:
            r11 = r10
            androidx.compose.foundation.layout.r r11 = (androidx.compose.foundation.layout.r) r11
            int r9 = r4 >> 3
            r10 = r9 & 8190(0x1ffe, float:1.1477E-41)
            r9 = r6
            r16 = r10
            r10 = r2
            r18 = r11
            r11 = r5
            r19 = r2
            r2 = r12
            r12 = r3
            r13 = r18
            r2 = r14
            r14 = r1
            r20 = r3
            r3 = r15
            r15 = r16
            E1.O r9 = n(r9, r10, r11, r12, r13, r14, r15)
            r10 = 131072(0x20000, float:1.83671E-40)
            if (r2 != r10) goto L_0x0174
            r13 = 1
            goto L_0x0175
        L_0x0174:
            r13 = 0
        L_0x0175:
            r2 = 3670016(0x380000, float:5.142788E-39)
            r2 = r2 & r4
            r4 = 1048576(0x100000, float:1.469368E-39)
            if (r2 != r4) goto L_0x017e
            r2 = 1
            goto L_0x017f
        L_0x017e:
            r2 = 0
        L_0x017f:
            r2 = r2 | r13
            java.lang.Object r4 = r1.D()
            if (r2 != 0) goto L_0x018e
            U0.m$a r2 = U0.C4889m.f14007a
            java.lang.Object r2 = r2.a()
            if (r4 != r2) goto L_0x01ab
        L_0x018e:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            androidx.compose.foundation.layout.p$b r2 = new androidx.compose.foundation.layout.p$b
            r2.<init>(r7)
            r10 = -139531073(0xfffffffff7aeecbf, float:-7.0957925E33)
            r11 = 1
            c1.a r2 = c1.c.c(r10, r11, r2)
            r4.add(r2)
            r10 = r18
            r3.a(r10, r4)
            r1.u(r4)
        L_0x01ab:
            java.util.List r4 = (java.util.List) r4
            nI.p r2 = E1.A.b(r4)
            boolean r4 = r1.V(r9)
            java.lang.Object r10 = r1.D()
            if (r4 != 0) goto L_0x01c3
            U0.m$a r4 = U0.C4889m.f14007a
            java.lang.Object r4 = r4.a()
            if (r10 != r4) goto L_0x01ca
        L_0x01c3:
            E1.I r10 = E1.Q.a(r9)
            r1.u(r10)
        L_0x01ca:
            E1.I r10 = (E1.I) r10
            r4 = 0
            int r9 = U0.C4883j.a(r1, r4)
            U0.y r11 = r1.s()
            androidx.compose.ui.d r12 = androidx.compose.ui.c.e(r1, r0)
            G1.g$a r13 = G1.C4504g.f6515W
            nI.a r14 = r13.a()
            U0.f r15 = r1.m()
            if (r15 != 0) goto L_0x01e8
            U0.C4883j.c()
        L_0x01e8:
            r1.I()
            boolean r15 = r1.i()
            if (r15 == 0) goto L_0x01f5
            r1.p(r14)
            goto L_0x01f8
        L_0x01f5:
            r1.t()
        L_0x01f8:
            U0.m r14 = U0.F1.a(r1)
            nI.p r15 = r13.c()
            U0.F1.c(r14, r10, r15)
            nI.p r10 = r13.e()
            U0.F1.c(r14, r11, r10)
            nI.p r10 = r13.b()
            boolean r11 = r14.i()
            if (r11 != 0) goto L_0x0222
            java.lang.Object r11 = r14.D()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r9)
            boolean r11 = kotlin.jvm.internal.C17542s.e(r11, r15)
            if (r11 != 0) goto L_0x0230
        L_0x0222:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r9)
            r14.u(r11)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r14.w(r9, r10)
        L_0x0230:
            nI.p r9 = r13.d()
            U0.F1.c(r14, r12, r9)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2.invoke(r1, r4)
            r1.x()
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x024a
            U0.C4895p.R()
        L_0x024a:
            r2 = r0
            r9 = r3
            r4 = r5
            r3 = r19
            r5 = r20
        L_0x0251:
            U0.Y0 r10 = r1.n()
            if (r10 == 0) goto L_0x0269
            androidx.compose.foundation.layout.p$a r11 = new androidx.compose.foundation.layout.p$a
            r0 = r11
            r1 = r2
            r2 = r6
            r6 = r9
            r7 = r24
            r8 = r26
            r9 = r27
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.a(r11)
        L_0x0269:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.p.a(androidx.compose.ui.d, androidx.compose.foundation.layout.d$e, androidx.compose.foundation.layout.d$m, int, int, androidx.compose.foundation.layout.u, nI.q, U0.m, int, int):void");
    }

    public static final J e(K k10, s sVar, Iterator<? extends H> it, float f10, float f11, long j10, int i10, int i11, r rVar) {
        H h10;
        Integer num;
        long j11;
        O o10;
        D d10;
        int i12;
        W0.b bVar;
        int i13;
        boolean z10;
        H h11;
        D d11;
        ArrayList arrayList;
        C5871q qVar;
        o.a aVar;
        ArrayList arrayList2;
        E e10;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        ArrayList arrayList3;
        E e11;
        long j12;
        C5456l lVar;
        C5456l lVar2;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        D d12;
        int i27;
        int i28;
        o.a aVar2;
        D d13;
        Integer num2;
        int i29;
        int i30;
        int i31;
        int i32;
        K k11 = k10;
        s sVar2 = sVar;
        Iterator<? extends H> it2 = it;
        W0.b bVar2 = new W0.b(new J[16], 0);
        int l10 = C5267b.l(j10);
        int n10 = C5267b.n(j10);
        int k12 = C5267b.k(j10);
        E b10 = C5460p.b();
        ArrayList arrayList4 = new ArrayList();
        int ceil = (int) ((float) Math.ceil((double) k11.H1(f10)));
        int ceil2 = (int) ((float) Math.ceil((double) k11.H1(f11)));
        long a10 = C5833D.a(0, l10, 0, k12);
        long f12 = C5833D.f(C5833D.e(a10, 0, 0, 0, 0, 14, (Object) null), sVar.f() ? C5830A.Horizontal : C5830A.Vertical);
        O o11 = new O();
        ArrayList arrayList5 = arrayList4;
        int i33 = 0;
        C5871q qVar2 = it2 instanceof C5864j ? new C5871q(0, 0, k11.H(l10), k11.H(k12), (DefaultConstructorMarker) null) : null;
        H o12 = !it.hasNext() ? null : o(it2, qVar2);
        C5456l a11 = o12 != null ? C5456l.a(k(o12, sVar2, f12, new d(o11))) : null;
        Integer valueOf = a11 != null ? Integer.valueOf(C5456l.e(a11.i())) : null;
        if (a11 != null) {
            h10 = o12;
            num = Integer.valueOf(C5456l.f(a11.i()));
        } else {
            h10 = o12;
            num = null;
        }
        long j13 = f12;
        int i34 = n10;
        D d14 = new D(0, 1, (DefaultConstructorMarker) null);
        D d15 = new D(0, 1, (DefaultConstructorMarker) null);
        o oVar = new o(i10, rVar, j10, i11, ceil, ceil2, (DefaultConstructorMarker) null);
        o.b b11 = oVar.b(it.hasNext(), 0, C5456l.b(l10, k12), a11, 0, 0, 0, false, false);
        if (b11.a()) {
            boolean z11 = a11 != null;
            qVar = qVar2;
            o10 = o11;
            j11 = j13;
            z10 = true;
            i13 = ceil2;
            i12 = ceil;
            d10 = d14;
            h11 = h10;
            arrayList = arrayList5;
            bVar = bVar2;
            d11 = d15;
            aVar = oVar.a(b11, z11, -1, 0, l10, 0);
        } else {
            h11 = h10;
            qVar = qVar2;
            o10 = o11;
            z10 = true;
            i13 = ceil2;
            arrayList = arrayList5;
            j11 = j13;
            d10 = d14;
            i12 = ceil;
            bVar = bVar2;
            d11 = d15;
            aVar = null;
        }
        int i35 = l10;
        o.a aVar3 = aVar;
        H h12 = h11;
        int i36 = i34;
        int i37 = 0;
        int i38 = 0;
        int i39 = 0;
        int i40 = 0;
        int i41 = 0;
        int i42 = k12;
        while (!b11.a() && h12 != null) {
            C17542s.g(valueOf);
            int intValue = valueOf.intValue();
            C17542s.g(num);
            D d16 = d11;
            int i43 = i40 + intValue;
            int max = Math.max(i41, num.intValue());
            int i44 = i35 - intValue;
            int i45 = l10;
            int i46 = i38 + 1;
            int i47 = i36;
            rVar.k(i46);
            arrayList.add(h12);
            O o13 = o10;
            b10.t(i38, o13.f144348a);
            int i48 = i46 - i39;
            boolean z12 = i48 < i10 ? z10 : false;
            if (qVar != null) {
                if (z12) {
                    i18 = i39;
                    i29 = i33;
                } else {
                    i18 = i39;
                    i29 = i33 + 1;
                }
                int i49 = z12 ? i48 : 0;
                if (z12) {
                    e11 = b10;
                    arrayList3 = arrayList;
                    i30 = 0;
                    i31 = C17978n.e(i44 - i12, 0);
                } else {
                    e11 = b10;
                    arrayList3 = arrayList;
                    i30 = 0;
                    i31 = i45;
                }
                float H10 = k11.H(i31);
                if (z12) {
                    i19 = i46;
                    i32 = k12;
                } else {
                    i19 = i46;
                    i32 = C17978n.e((k12 - max) - i13, i30);
                }
                qVar.a(i29, i49, H10, k11.H(i32));
            } else {
                i19 = i46;
                i18 = i39;
                e11 = b10;
                arrayList3 = arrayList;
            }
            H o14 = !it.hasNext() ? null : o(it2, qVar);
            o13.f144348a = null;
            if (o14 != null) {
                j12 = j11;
                lVar = C5456l.a(k(o14, sVar2, j12, new c(o13)));
            } else {
                j12 = j11;
                lVar = null;
            }
            Integer valueOf2 = lVar != null ? Integer.valueOf(C5456l.e(lVar.i()) + i12) : null;
            Integer valueOf3 = lVar != null ? Integer.valueOf(C5456l.f(lVar.i())) : null;
            boolean hasNext = it.hasNext();
            long b12 = C5456l.b(i44, k12);
            if (lVar == null) {
                lVar2 = null;
            } else {
                C17542s.g(valueOf2);
                int intValue2 = valueOf2.intValue();
                C17542s.g(valueOf3);
                lVar2 = C5456l.a(C5456l.b(intValue2, valueOf3.intValue()));
            }
            o.b b13 = oVar.b(hasNext, i48, b12, lVar2, i33, i37, max, false, false);
            if (b13.b()) {
                int max2 = Math.max(i47, i43);
                int i50 = i45;
                int min = Math.min(max2, i50);
                int i51 = i37 + max;
                o.a a12 = oVar.a(b13, lVar != null ? z10 : false, i33, i51, i44, i48);
                d12 = d16;
                d12.i(max);
                int i52 = (i42 - i51) - i13;
                D d17 = d10;
                i23 = i19;
                d17.i(i23);
                i33++;
                i20 = i50;
                i21 = i52;
                i22 = i23;
                num2 = valueOf2 != null ? Integer.valueOf(valueOf2.intValue() - i12) : null;
                i24 = 0;
                b11 = b13;
                i26 = min;
                d13 = d17;
                i25 = 0;
                i27 = i51 + i13;
                aVar2 = a12;
                i28 = i20;
            } else {
                int i53 = i47;
                d12 = d16;
                i28 = i45;
                i22 = i19;
                b11 = b13;
                d13 = d10;
                i21 = k12;
                i20 = i44;
                num2 = valueOf2;
                i23 = i18;
                i24 = max;
                i25 = i43;
                i26 = i53;
                i27 = i37;
                aVar2 = aVar3;
            }
            d10 = d13;
            aVar3 = aVar2;
            i37 = i27;
            i39 = i23;
            num = valueOf3;
            it2 = it;
            d11 = d12;
            i36 = i26;
            i40 = i25;
            i41 = i24;
            j11 = j12;
            k12 = i21;
            b10 = e11;
            arrayList = arrayList3;
            o10 = o13;
            h12 = o14;
            l10 = i28;
            i38 = i22;
            i35 = i20;
        }
        int i54 = i36;
        E e12 = b10;
        ArrayList arrayList6 = arrayList;
        D d18 = d11;
        D d19 = d10;
        if (aVar3 != null) {
            arrayList2 = arrayList6;
            arrayList2.add(aVar3.a());
            e10 = e12;
            e10.t(arrayList2.size() - 1, aVar3.d());
            int i55 = d19.f24631b - 1;
            if (aVar3.c()) {
                d18.o(i55, Math.max(d18.a(i55), C5456l.f(aVar3.b())));
                d19.o(d19.b() - 1, d19.g() + 1);
            } else {
                d18.i(C5456l.f(aVar3.b()));
                d19.i(d19.g() + 1);
            }
        } else {
            e10 = e12;
            arrayList2 = arrayList6;
        }
        int size = arrayList2.size();
        a0[] a0VarArr = new a0[size];
        for (int i56 = 0; i56 < size; i56++) {
            a0VarArr[i56] = e10.c(i56);
        }
        int b14 = d19.b();
        int[] iArr = new int[b14];
        for (int i57 = 0; i57 < b14; i57++) {
            iArr[i57] = 0;
        }
        int b15 = d19.b();
        int[] iArr2 = new int[b15];
        for (int i58 = 0; i58 < b15; i58++) {
            iArr2[i58] = 0;
        }
        int[] iArr3 = d19.f24630a;
        int i59 = d19.f24631b;
        int i60 = i54;
        int i61 = 0;
        int i62 = 0;
        int i63 = 0;
        while (i61 < i59) {
            int i64 = iArr3[i61];
            D d20 = d18;
            int i65 = i60;
            int i66 = i61;
            int i67 = i59;
            int[] iArr4 = iArr3;
            int i68 = i63;
            int[] iArr5 = iArr2;
            int[] iArr6 = iArr;
            ArrayList arrayList7 = arrayList2;
            J a13 = C5840K.a(sVar, i60, C5267b.m(a10), C5267b.l(a10), d18.a(i61), i12, k10, arrayList2, a0VarArr, i68, i64, iArr, i66);
            if (sVar.f()) {
                i17 = a13.getWidth();
                i16 = a13.getHeight();
            } else {
                i17 = a13.getHeight();
                i16 = a13.getWidth();
            }
            iArr5[i66] = i16;
            i62 += i16;
            i60 = Math.max(i65, i17);
            bVar.b(a13);
            K k13 = k10;
            iArr2 = iArr5;
            i63 = i64;
            d18 = d20;
            i59 = i67;
            iArr3 = iArr4;
            iArr = iArr6;
            arrayList2 = arrayList7;
            i61 = i66 + 1;
        }
        int i69 = i60;
        int[] iArr7 = iArr2;
        int[] iArr8 = iArr;
        W0.b bVar3 = bVar;
        if (bVar3.t()) {
            i15 = 0;
            i14 = 0;
        } else {
            i15 = i69;
            i14 = i62;
        }
        return m(k10, j10, i15, i14, iArr7, bVar3, sVar, iArr8);
    }

    public static final int f(C4484q qVar, boolean z10, int i10) {
        return z10 ? qVar.V(i10) : qVar.g0(i10);
    }

    /* access modifiers changed from: private */
    public static final long g(List<? extends C4484q> list, q<? super C4484q, ? super Integer, ? super Integer, Integer> qVar, q<? super C4484q, ? super Integer, ? super Integer, Integer> qVar2, int i10, int i11, int i12, int i13, int i14, r rVar) {
        int i15;
        List<? extends C4484q> list2 = list;
        q<? super C4484q, ? super Integer, ? super Integer, Integer> qVar3 = qVar;
        q<? super C4484q, ? super Integer, ? super Integer, Integer> qVar4 = qVar2;
        int i16 = i10;
        if (list.isEmpty()) {
            return C5456l.b(0, 0);
        }
        o oVar = new o(i13, rVar, C5833D.a(0, i16, 0, Integer.MAX_VALUE), i14, i11, i12, (DefaultConstructorMarker) null);
        C4484q qVar5 = (C4484q) C16877v.z0(list2, 0);
        int intValue = qVar5 != null ? qVar4.invoke(qVar5, 0, Integer.valueOf(i10)).intValue() : 0;
        int intValue2 = qVar5 != null ? qVar3.invoke(qVar5, 0, Integer.valueOf(intValue)).intValue() : 0;
        boolean z10 = true;
        int i17 = 0;
        int i18 = 0;
        if (oVar.b(list.size() > 1, 0, C5456l.b(i16, Integer.MAX_VALUE), qVar5 == null ? null : C5456l.a(C5456l.b(intValue2, intValue)), 0, 0, 0, false, false).a()) {
            r rVar2 = rVar;
            if (qVar5 == null) {
                z10 = false;
            }
            C5456l f10 = rVar2.f(z10, 0, 0);
            return C5456l.b(f10 != null ? C5456l.f(f10.i()) : 0, 0);
        }
        int size = list.size();
        int i19 = i16;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        while (true) {
            if (i20 >= size) {
                break;
            }
            int i24 = i19 - intValue2;
            int i25 = i20 + 1;
            int max = Math.max(i22, intValue);
            C4484q qVar6 = (C4484q) C16877v.z0(list2, i25);
            int intValue3 = qVar6 != null ? qVar4.invoke(qVar6, Integer.valueOf(i25), Integer.valueOf(i10)).intValue() : 0;
            int intValue4 = qVar6 != null ? qVar3.invoke(qVar6, Integer.valueOf(i25), Integer.valueOf(intValue3)).intValue() + i11 : 0;
            int i26 = i25 - i23;
            C4484q qVar7 = qVar6;
            int i27 = i25;
            o.b b10 = oVar.b(i20 + 2 < list.size(), i26, C5456l.b(i24, Integer.MAX_VALUE), qVar6 == null ? null : C5456l.a(C5456l.b(intValue4, intValue3)), i17, i18, max, false, false);
            if (b10.b()) {
                i18 += max + i12;
                o.a a10 = oVar.a(b10, qVar7 != null, i17, i18, i24, i26);
                int i28 = intValue4 - i11;
                i17++;
                if (b10.a()) {
                    if (a10 != null) {
                        long b11 = a10.b();
                        if (!a10.c()) {
                            i18 += C5456l.f(b11) + i12;
                        }
                    }
                    i21 = i27;
                } else {
                    i19 = i16;
                    i15 = i28;
                    i23 = i27;
                    i22 = 0;
                }
            } else {
                i19 = i24;
                i22 = max;
                i15 = intValue4;
            }
            intValue = intValue3;
            i20 = i27;
            i21 = i20;
        }
        return C5456l.b(i18 - i12, i21);
    }

    private static final long h(List<? extends C4484q> list, int[] iArr, int[] iArr2, int i10, int i11, int i12, int i13, int i14, r rVar) {
        int[] iArr3 = iArr;
        int[] iArr4 = iArr2;
        return g(list, new e(iArr), new f(iArr2), i10, i11, i12, i13, i14, rVar);
    }

    public static final int i(C4484q qVar, boolean z10, int i10) {
        return z10 ? qVar.g0(i10) : qVar.V(i10);
    }

    /* access modifiers changed from: private */
    public static final int j(List<? extends C4484q> list, q<? super C4484q, ? super Integer, ? super Integer, Integer> qVar, int i10, int i11, int i12) {
        int size = list.size();
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (i13 < size) {
            int intValue = qVar.invoke((C4484q) list.get(i13), Integer.valueOf(i13), Integer.valueOf(i10)).intValue() + i11;
            int i17 = i13 + 1;
            if (i17 - i15 == i12 || i17 == list.size()) {
                i14 = Math.max(i14, (i16 + intValue) - i11);
                i16 = 0;
                i15 = i13;
            } else {
                i16 += intValue;
            }
            i13 = i17;
        }
        return i14;
    }

    public static final long k(H h10, s sVar, long j10, C17642l<? super a0, C16807N> lVar) {
        if (C5838I.e(C5838I.c(h10)) == 0.0f) {
            C5841L c10 = C5838I.c(h10);
            if (c10 != null) {
                c10.c();
            }
            a0 i02 = h10.i0(j10);
            lVar.invoke(i02);
            return C5456l.b(sVar.c(i02), sVar.e(i02));
        }
        int i10 = i(h10, sVar.f(), Integer.MAX_VALUE);
        return C5456l.b(i10, f(h10, sVar.f(), i10));
    }

    /* access modifiers changed from: private */
    public static final int l(List<? extends C4484q> list, q<? super C4484q, ? super Integer, ? super Integer, Integer> qVar, q<? super C4484q, ? super Integer, ? super Integer, Integer> qVar2, int i10, int i11, int i12, int i13, int i14, r rVar) {
        int i15 = i10;
        int i16 = i13;
        int i17 = i14;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int[] iArr = new int[size];
        for (int i18 = 0; i18 < size; i18++) {
            iArr[i18] = 0;
        }
        int size2 = list.size();
        int[] iArr2 = new int[size2];
        for (int i19 = 0; i19 < size2; i19++) {
            iArr2[i19] = 0;
        }
        int size3 = list.size();
        for (int i20 = 0; i20 < size3; i20++) {
            C4484q qVar3 = (C4484q) list.get(i20);
            int intValue = qVar.invoke(qVar3, Integer.valueOf(i20), Integer.valueOf(i10)).intValue();
            iArr[i20] = intValue;
            iArr2[i20] = qVar2.invoke(qVar3, Integer.valueOf(i20), Integer.valueOf(intValue)).intValue();
        }
        List<? extends C4484q> list2 = list;
        int i21 = Integer.MAX_VALUE;
        if (!(i17 == Integer.MAX_VALUE || i16 == Integer.MAX_VALUE)) {
            i21 = i16 * i17;
        }
        int min = Math.min(i21 - (((i21 >= list.size() || !(rVar.i() == q.a.ExpandIndicator || rVar.i() == q.a.ExpandOrCollapseIndicator)) && (i21 < list.size() || i17 < rVar.g() || rVar.i() != q.a.ExpandOrCollapseIndicator)) ? 0 : 1), list.size());
        int T02 = C16870n.T0(iArr) + ((list.size() - 1) * i11);
        if (size2 != 0) {
            int i22 = iArr2[0];
            U t10 = new C17974j(1, C16870n.l0(iArr2)).iterator();
            while (t10.hasNext()) {
                int i23 = iArr2[t10.c()];
                if (i22 < i23) {
                    i22 = i23;
                }
            }
            if (size != 0) {
                int i24 = iArr[0];
                U t11 = new C17974j(1, C16870n.l0(iArr)).iterator();
                while (t11.hasNext()) {
                    int i25 = iArr[t11.c()];
                    if (i24 < i25) {
                        i24 = i25;
                    }
                }
                int i26 = i24;
                int i27 = T02;
                while (i26 <= i27 && i22 != i15) {
                    int i28 = (i26 + i27) / 2;
                    int i29 = i27;
                    int i30 = i26;
                    long h10 = h(list, iArr, iArr2, i28, i11, i12, i13, i14, rVar);
                    i22 = C5456l.e(h10);
                    int f10 = C5456l.f(h10);
                    if (i22 > i15 || f10 < min) {
                        i26 = i28 + 1;
                        if (i26 > i29) {
                            return i26;
                        }
                        i27 = i29;
                        T02 = i28;
                        int i31 = i13;
                    } else if (i22 >= i15) {
                        return i28;
                    } else {
                        i27 = i28 - 1;
                        int i32 = i13;
                        T02 = i28;
                        i26 = i30;
                    }
                }
                return T02;
            }
            throw new NoSuchElementException();
        }
        throw new NoSuchElementException();
    }

    public static final J m(K k10, long j10, int i10, int i11, int[] iArr, W0.b<J> bVar, s sVar, int[] iArr2) {
        int i12;
        K k11 = k10;
        boolean f10 = sVar.f();
        C5073d.m o10 = sVar.o();
        C5073d.e n10 = sVar.n();
        if (!f10) {
            int[] iArr3 = iArr;
            int[] iArr4 = iArr2;
            if (n10 != null) {
                int m10 = C17978n.m((k10.K0(n10.a()) * (bVar.r() - 1)) + i11, C5267b.m(j10), C5267b.k(j10));
                n10.b(k10, m10, iArr, k10.getLayoutDirection(), iArr2);
                i12 = m10;
            } else {
                throw new IllegalArgumentException("null horizontalArrangement");
            }
        } else if (o10 != null) {
            i12 = C17978n.m((k10.K0(o10.a()) * (bVar.r() - 1)) + i11, C5267b.m(j10), C5267b.k(j10));
            int[] iArr5 = iArr;
            o10.c(k10, i12, iArr, iArr2);
        } else {
            throw new IllegalArgumentException("null verticalArrangement");
        }
        int i13 = i10;
        int m11 = C17978n.m(i10, C5267b.n(j10), C5267b.l(j10));
        if (!f10) {
            int i14 = i12;
            i12 = m11;
            m11 = i14;
        }
        return K.v0(k10, m11, i12, (Map) null, new g(bVar), 4, (Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: androidx.compose.foundation.layout.t} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v20, resolved type: androidx.compose.foundation.layout.t} */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0088, code lost:
        if (r4 == U0.C4889m.f14007a.a()) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0022, code lost:
        if (r0.V(r17) == false) goto L_0x0027;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final E1.O n(androidx.compose.foundation.layout.C5073d.e r17, androidx.compose.foundation.layout.C5073d.m r18, int r19, int r20, androidx.compose.foundation.layout.r r21, U0.C4889m r22, int r23) {
        /*
            r0 = r22
            r1 = r23
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x0013
            r2 = -1
            java.lang.String r3 = "androidx.compose.foundation.layout.rowMeasurementMultiContentHelper (FlowLayout.kt:413)"
            r4 = -2134502475(0xffffffff80c613b5, float:-1.8190498E-38)
            U0.C4895p.S(r4, r1, r2, r3)
        L_0x0013:
            r2 = r1 & 14
            r2 = r2 ^ 6
            r3 = 4
            r4 = 0
            r5 = 1
            if (r2 <= r3) goto L_0x0025
            r2 = r17
            boolean r6 = r0.V(r2)
            if (r6 != 0) goto L_0x002b
            goto L_0x0027
        L_0x0025:
            r2 = r17
        L_0x0027:
            r6 = r1 & 6
            if (r6 != r3) goto L_0x002d
        L_0x002b:
            r3 = r5
            goto L_0x002e
        L_0x002d:
            r3 = r4
        L_0x002e:
            r6 = r1 & 112(0x70, float:1.57E-43)
            r6 = r6 ^ 48
            r7 = 32
            r9 = r18
            if (r6 <= r7) goto L_0x003e
            boolean r6 = r0.V(r9)
            if (r6 != 0) goto L_0x0042
        L_0x003e:
            r6 = r1 & 48
            if (r6 != r7) goto L_0x0044
        L_0x0042:
            r6 = r5
            goto L_0x0045
        L_0x0044:
            r6 = r4
        L_0x0045:
            r3 = r3 | r6
            r6 = r1 & 896(0x380, float:1.256E-42)
            r6 = r6 ^ 384(0x180, float:5.38E-43)
            r7 = 256(0x100, float:3.59E-43)
            r13 = r19
            if (r6 <= r7) goto L_0x0056
            boolean r6 = r0.d(r13)
            if (r6 != 0) goto L_0x005a
        L_0x0056:
            r6 = r1 & 384(0x180, float:5.38E-43)
            if (r6 != r7) goto L_0x005c
        L_0x005a:
            r6 = r5
            goto L_0x005d
        L_0x005c:
            r6 = r4
        L_0x005d:
            r3 = r3 | r6
            r6 = r1 & 7168(0x1c00, float:1.0045E-41)
            r6 = r6 ^ 3072(0xc00, float:4.305E-42)
            r7 = 2048(0x800, float:2.87E-42)
            r14 = r20
            if (r6 <= r7) goto L_0x006e
            boolean r6 = r0.d(r14)
            if (r6 != 0) goto L_0x0072
        L_0x006e:
            r1 = r1 & 3072(0xc00, float:4.305E-42)
            if (r1 != r7) goto L_0x0073
        L_0x0072:
            r4 = r5
        L_0x0073:
            r1 = r3 | r4
            r3 = r21
            boolean r4 = r0.V(r3)
            r1 = r1 | r4
            java.lang.Object r4 = r22.D()
            if (r1 != 0) goto L_0x008a
            U0.m$a r1 = U0.C4889m.f14007a
            java.lang.Object r1 = r1.a()
            if (r4 != r1) goto L_0x00aa
        L_0x008a:
            float r10 = r17.a()
            androidx.compose.foundation.layout.m r11 = f18161a
            float r12 = r18.a()
            androidx.compose.foundation.layout.t r4 = new androidx.compose.foundation.layout.t
            r7 = 1
            r16 = 0
            r6 = r4
            r8 = r17
            r9 = r18
            r13 = r19
            r14 = r20
            r15 = r21
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r0.u(r4)
        L_0x00aa:
            androidx.compose.foundation.layout.t r4 = (androidx.compose.foundation.layout.t) r4
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x00b5
            U0.C4895p.R()
        L_0x00b5:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.p.n(androidx.compose.foundation.layout.d$e, androidx.compose.foundation.layout.d$m, int, int, androidx.compose.foundation.layout.r, U0.m, int):E1.O");
    }

    private static final H o(Iterator<? extends H> it, C5871q qVar) {
        try {
            if (!(it instanceof C5864j)) {
                return (H) it.next();
            }
            C17542s.g(qVar);
            return ((C5864j) it).d(qVar);
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }
}
