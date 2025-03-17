package wK;

import E1.C4488v;
import E1.C4489w;
import E1.H;
import E1.I;
import E1.J;
import E1.K;
import E1.a0;
import G1.C4504g;
import L1.x;
import O0.V;
import U0.A1;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4899r0;
import U0.C4912y;
import U0.F1;
import U0.M0;
import XH.C16796C;
import XH.C16807N;
import XH.v;
import YH.C16877v;
import android.content.Context;
import android.util.DisplayMetrics;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5077h;
import androidx.compose.foundation.layout.C5079j;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
import androidx.compose.ui.d;
import c2.C5267b;
import c2.h;
import c2.n;
import c2.o;
import c2.r;
import c2.t;
import i1.C5437c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n0.C5599e;
import n0.C5602h;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import o1.C5667g;
import o1.C5668h;
import o1.C5673m;
import o1.C5674n;
import p1.C5747v0;
import p1.C5749w0;
import p1.V0;
import p1.i1;
import pI.C17752b;
import r0.i;
import r0.m;
import r1.f;
import r1.j;
import r1.k;
import s0.C5842M;
import s0.C5843N;
import s0.C5880z;
import sK.C17950a;
import tK.C18014e;
import tK.C18029u;
import tK.C18030v;
import vK.C18205e;
import wK.C18532wa;
import zK.C18756a;
import zK.C18767l;

@Metadata(d1 = {"\u0000°\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a£\u0001\u0010\u0013\u001a\u00020\u0010\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00018\u00002\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2.\b\u0002\u0010\u0011\u001a(\u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0004\u0012\u00020\u000f0\u000e0\u0003\u0012\u0004\u0012\u00020\u0010\u0018\u00010\r2\u0014\u0010\u0012\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020\u00100\rH\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001a³\u0001\u0010\"\u001a\u00020\u0010\"\u0004\b\u0000\u0010\u00002\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00152\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00032\b\u0010\b\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2.\b\u0002\u0010\u0011\u001a(\u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0004\u0012\u00020\u000f0\u000e0\u0003\u0012\u0004\u0012\u00020\u0010\u0018\u00010\r2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\t0\u001f2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00100\rH\u0003¢\u0006\u0004\b\"\u0010#\u001a7\u0010-\u001a\u00020)2\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020&2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b-\u0010.\u001a\u001f\u00100\u001a\u00020/2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020&H\u0002¢\u0006\u0004\b0\u00101\u001a'\u00105\u001a\u00020\t2\u0006\u00102\u001a\u00020)2\u0006\u00103\u001a\u00020)2\u0006\u00104\u001a\u00020+H\u0002¢\u0006\u0004\b5\u00106\u001a/\u0010;\u001a\u00020\t2\u0006\u00107\u001a\u00020)2\u0006\u00108\u001a\u00020+2\u0006\u00109\u001a\u00020)2\u0006\u0010:\u001a\u00020\u001dH\u0002¢\u0006\u0004\b;\u0010<\u001a9\u0010C\u001a\u00020\t2\u0006\u0010=\u001a\u00020+2\u0006\u0010>\u001a\u00020+2\u0006\u0010?\u001a\u00020$2\u0006\u0010@\u001a\u00020)2\b\b\u0002\u0010B\u001a\u00020AH\u0002¢\u0006\u0004\bC\u0010D\u001aG\u0010M\u001a\u00020\u00102\u0006\u0010E\u001a\u00020\t2\n\b\u0002\u0010F\u001a\u0004\u0018\u00010&2\b\b\u0002\u0010H\u001a\u00020G2\n\b\u0002\u0010J\u001a\u0004\u0018\u00010I2\f\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00100KH\u0003¢\u0006\u0004\bM\u0010N\u001aU\u0010S\u001a\u00020\u00102\f\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00100K2\u0006\u0010P\u001a\u00020\t2\n\b\u0002\u0010F\u001a\u0004\u0018\u00010&2\b\b\u0002\u0010R\u001a\u00020Q2\b\b\u0002\u0010H\u001a\u00020G2\u000e\u0010L\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010KH\u0003¢\u0006\u0004\bS\u0010T\u001a;\u0010V\u001a\u00020\u00102\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010P\u001a\u00020\t2\b\b\u0002\u0010U\u001a\u00020\t2\f\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00100KH\u0003¢\u0006\u0004\bV\u0010W¨\u0006_²\u0006\u000e\u0010X\u001a\u00020\u001d8\n@\nX\u0002²\u0006\u000e\u0010Y\u001a\u00020\u00198\n@\nX\u0002²\u0006\u000e\u0010\u001a\u001a\u00020\u00198\n@\nX\u0002²\u0006\u000e\u0010\u001c\u001a\u00020\u001b8\n@\nX\u0002²\u0006\u000e\u0010\u001e\u001a\u00020\u001d8\n@\nX\u0002²\u0006\f\u0010Z\u001a\u00020\t8\nX\u0002²\u0006\f\u0010[\u001a\u00020\t8\nX\u0002²\u0006\f\u0010,\u001a\u00020\\8\nX\u0002²\u0006\f\u0010]\u001a\u00020&8\nX\u0002²\u0006\f\u0010Z\u001a\u00020\t8\nX\u0002²\u0006\f\u0010^\u001a\u00020&8\nX\u0002²\u0006\u0010\u0010E\u001a\u0004\u0018\u00010I8\n@\nX\u0002²\u0006\u000e\u0010\n\u001a\u00020\t8\n@\nX\u0002²\u0006\u0010\u0010E\u001a\u0004\u0018\u00010I8\n@\nX\u0002²\u0006\u000e\u0010\n\u001a\u00020\t8\n@\nX\u0002"}, d2 = {"T", "LwK/g9;", "imageParams", "", "LwK/h9;", "products", "Landroidx/compose/ui/d;", "modifier", "selectedProduct", "", "showDots", "LwK/f9;", "shopAllButtonParams", "Lkotlin/Function1;", "LXH/v;", "LwK/N2;", "LXH/N;", "failedProductsCallback", "onSelected", "q", "(LwK/g9;Ljava/util/List;Landroidx/compose/ui/d;Ljava/lang/Object;ZLwK/f9;LnI/l;LnI/l;LU0/m;II)V", "LwK/s7;", "productStateManager", "LwK/H9;", "aspectRatio", "Lo1/m;", "scaledImageSize", "Lo1/g;", "cropOffset", "Lc2/r;", "shopAllButtonSize", "LU0/A1;", "imageHover", "dotOnClick", "o", "(LwK/s7;Ljava/util/List;Ljava/lang/Object;LwK/H9;JJJLnI/l;LU0/A1;LnI/l;LU0/m;II)V", "LE1/a0;", "tagPlaceable", "", "xCoordinate", "yCoordinate", "Lc2/n;", "transformedCoords", "", "dotRadius", "d0", "(LE1/a0;FFJI)J", "LwK/wa;", "Y", "(FF)LwK/wa;", "dotA", "dotB", "side", "b0", "(JJI)Z", "dot", "dotSide", "shopAllOffset", "shopAllSize", "c0", "(JIJJ)Z", "parentWidth", "parentHeight", "placable", "placablePosition", "LwK/T3;", "paddingValues", "Z", "(IILE1/a0;JLwK/T3;)Z", "selected", "traversalIndex", "Lr0/m;", "interactionSource", "", "customContentDescription", "Lkotlin/Function0;", "onClick", "E", "(ZLjava/lang/Float;Lr0/m;Ljava/lang/String;LnI/a;LU0/m;II)V", "content", "visible", "Lc2/t;", "layoutDirection", "L", "(LnI/p;ZLjava/lang/Float;Lc2/t;Lr0/m;LnI/a;LU0/m;II)V", "keepComposableForMeasuring", "k", "(Landroidx/compose/ui/d;ZZLnI/p;LU0/m;II)V", "containerSize", "intrinsicSize", "hover", "pressed", "Lc2/h;", "alpha", "targetAlpha", "design_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: wK.u9  reason: case insensitive filesystem */
public final class C18507u9 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: wK.u9$a */
    static final class a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ H9 f151715a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ t f151716b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f151717c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List<C18351h9<T>> f151718d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ long f151719e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ long f151720f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C18481s7<T> f151721g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C17642l<List<? extends v<C18351h9<T>, ? extends N2>>, C16807N> f151722h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ T f151723i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ A1<Boolean> f151724j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ C17642l<T, C16807N> f151725k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ C4899r0<Boolean> f151726l;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: wK.u9$a$a  reason: collision with other inner class name */
        static final class C4315a implements I {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ H9 f151727a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Context f151728b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ t f151729c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ long f151730d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ C4899r0<Boolean> f151731e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ C17642l<List<? extends v<C18351h9<T>, ? extends N2>>, C16807N> f151732f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ List<C18351h9<T>> f151733g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ long f151734h;

            /* renamed from: i  reason: collision with root package name */
            final /* synthetic */ long f151735i;

            /* renamed from: j  reason: collision with root package name */
            final /* synthetic */ C18481s7<T> f151736j;

            C4315a(H9 h92, Context context, t tVar, long j10, C4899r0<Boolean> r0Var, C17642l<? super List<? extends v<C18351h9<T>, ? extends N2>>, C16807N> lVar, List<C18351h9<T>> list, long j11, long j12, C18481s7<T> s7Var) {
                this.f151727a = h92;
                this.f151728b = context;
                this.f151729c = tVar;
                this.f151730d = j10;
                this.f151731e = r0Var;
                this.f151732f = lVar;
                this.f151733g = list;
                this.f151734h = j11;
                this.f151735i = j12;
                this.f151736j = s7Var;
            }

            /* access modifiers changed from: private */
            public static final C16807N c(Context context, int i10, t tVar, long j10, int i11, List list, C4899r0 r0Var, C17642l lVar, List list2, long j11, long j12, C18481s7 s7Var, a0.a aVar) {
                ArrayList arrayList;
                ArrayList arrayList2;
                C17642l lVar2 = lVar;
                a0.a aVar2 = aVar;
                C17542s.j(aVar2, "$this$layout");
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                C4488v d10 = aVar.d();
                int i12 = 0;
                int e10 = d10 != null ? C17752b.e(C5667g.m(C4489w.f(d10))) : 0;
                int i13 = displayMetrics.widthPixels;
                C4488v d11 = aVar.d();
                T3 t32 = new T3(e10, 0, (i13 - (d11 != null ? C17752b.e(C5667g.m(C4489w.f(d11))) : 0)) - i10, 0);
                long a10 = tVar == t.Rtl ? o.a(i10 - r.h(j10), i11 - r.g(j10)) : o.a(0, i11 - r.g(j10));
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                for (Object next : list) {
                    int i14 = i12 + 1;
                    if (i12 < 0) {
                        C16877v.x();
                    }
                    v vVar = (v) next;
                    a0 a0Var = (a0) vVar.a();
                    a0 a0Var2 = (a0) vVar.b();
                    C18351h9 h9Var = (C18351h9) list2.get(i12);
                    int E02 = a0Var.E0() / 2;
                    long g10 = h9Var.g(j11, j12);
                    long X10 = C18507u9.d0(a0Var2, h9Var.e(), h9Var.f(), g10, E02);
                    long a11 = o.a(n.h(g10) - E02, n.i(g10) - E02);
                    long j13 = X10;
                    if (!C18507u9.Z(i10, i11, a0Var2, X10, t32)) {
                        C18481s7 s7Var2 = s7Var;
                        arrayList = arrayList4;
                        arrayList2 = arrayList3;
                        arrayList.add(new v(h9Var, N2.TagOutsideViewport));
                    } else if (C18507u9.a0(i10, i11, a0Var, a11, (T3) null, 16, (Object) null)) {
                        if (!arrayList3.isEmpty() && !arrayList3.isEmpty()) {
                            Iterator it = arrayList3.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                long j14 = a11;
                                if (C18507u9.b0(j14, ((n) it.next()).n(), a0Var.E0())) {
                                    arrayList4.add(new v(h9Var, N2.CollisionWithOtherDot));
                                    C18481s7 s7Var3 = s7Var;
                                    arrayList = arrayList4;
                                    arrayList2 = arrayList3;
                                    break;
                                }
                                a11 = j14;
                            }
                        }
                        long j15 = a11;
                        if (!C18507u9.c0(j15, a0Var.E0(), a10, j10)) {
                            arrayList3.add(n.b(j15));
                            C18351h9 h9Var2 = h9Var;
                            long j16 = j15;
                            a0 a0Var3 = a0Var2;
                            arrayList = arrayList4;
                            arrayList2 = arrayList3;
                            a0.a.o(aVar, a0Var, j16, 0.0f, 2, (Object) null);
                            if (s7Var.b(h9Var2.c()).getValue().booleanValue()) {
                                aVar2.n(a0Var3, j13, 2.0f);
                            }
                        } else {
                            C18481s7 s7Var4 = s7Var;
                            arrayList = arrayList4;
                            arrayList2 = arrayList3;
                            arrayList.add(new v(h9Var, N2.CollisionWithButton));
                        }
                    } else {
                        C18481s7 s7Var5 = s7Var;
                        arrayList = arrayList4;
                        arrayList2 = arrayList3;
                        arrayList.add(new v(h9Var, N2.DotOutsideViewport));
                    }
                    arrayList3 = arrayList2;
                    arrayList4 = arrayList;
                    i12 = i14;
                }
                ArrayList arrayList5 = arrayList4;
                if (((Boolean) r0Var.getValue()).booleanValue()) {
                    if (lVar2 != null) {
                        lVar2.invoke(arrayList5);
                    }
                    r0Var.setValue(Boolean.FALSE);
                }
                return C16807N.f139792a;
            }

            public final J i(K k10, List<? extends H> list, long j10) {
                List<? extends H> list2 = list;
                long j11 = j10;
                C17542s.j(k10, "$this$Layout");
                C17542s.j(list2, "measurables");
                int l10 = C5267b.l(j10);
                int e10 = C17752b.e(((float) l10) / this.f151727a.b());
                Iterable<List> k02 = C16877v.k0(list2, 2);
                ArrayList arrayList = new ArrayList(C16877v.y(k02, 10));
                for (List list3 : k02) {
                    arrayList.add(C16796C.a(((H) list3.get(0)).i0(j11), ((H) list3.get(1)).i0(j11)));
                }
                return K.v0(k10, l10, e10, (Map) null, new C18495t9(this.f151728b, l10, this.f151729c, this.f151730d, e10, arrayList, this.f151731e, this.f151732f, this.f151733g, this.f151734h, this.f151735i, this.f151736j), 4, (Object) null);
            }
        }

        a(H9 h92, t tVar, long j10, List<C18351h9<T>> list, long j11, long j12, C18481s7<T> s7Var, C17642l<? super List<? extends v<C18351h9<T>, ? extends N2>>, C16807N> lVar, T t10, A1<Boolean> a12, C17642l<? super T, C16807N> lVar2, C4899r0<Boolean> r0Var) {
            this.f151715a = h92;
            this.f151716b = tVar;
            this.f151717c = j10;
            this.f151718d = list;
            this.f151719e = j11;
            this.f151720f = j12;
            this.f151721g = s7Var;
            this.f151722h = lVar;
            this.f151723i = t10;
            this.f151724j = a12;
            this.f151725k = lVar2;
            this.f151726l = r0Var;
        }

        /* access modifiers changed from: private */
        public static final C16807N c(boolean z10, boolean z11, C18351h9 h9Var, C17642l lVar) {
            if (z10 || z11) {
                C17631a<C16807N> d10 = h9Var.d();
                if (d10 != null) {
                    d10.invoke();
                }
            } else {
                lVar.invoke(h9Var.c());
            }
            return C16807N.f139792a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v24, resolved type: wK.u9$a$a} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: wK.u9$a$a} */
        /* JADX WARNING: type inference failed for: r0v2 */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x00a9, code lost:
            if (r0 == U0.C4889m.f14007a.a()) goto L_0x00ab;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(U0.C4889m r31, int r32) {
            /*
                r30 = this;
                r0 = r30
                r10 = r31
                r1 = r32
                r2 = r1 & 3
                r3 = 2
                if (r2 != r3) goto L_0x0017
                boolean r2 = r31.l()
                if (r2 != 0) goto L_0x0012
                goto L_0x0017
            L_0x0012:
                r31.L()
                goto L_0x02c8
            L_0x0017:
                boolean r2 = U0.C4895p.J()
                if (r2 == 0) goto L_0x0026
                r2 = -1
                java.lang.String r3 = "net.ikea.skapa.ui.components.DotsAndTagLayout.<anonymous> (ShoppableImage.kt:287)"
                r4 = -1221873762(0xffffffffb72baf9e, float:-1.0233283E-5)
                U0.C4895p.S(r4, r1, r2, r3)
            L_0x0026:
                U0.I0 r1 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
                java.lang.Object r1 = r10.Q(r1)
                r13 = r1
                android.content.Context r13 = (android.content.Context) r13
                java.util.List<wK.h9<T>> r1 = r0.f151718d
                wK.s7<T> r9 = r0.f151721g
                T r8 = r0.f151723i
                U0.A1<java.lang.Boolean> r7 = r0.f151724j
                nI.l<T, XH.N> r6 = r0.f151725k
                c2.t r5 = r0.f151716b
                r2 = -1245840331(0xffffffffb5bdfc35, float:-1.4154999E-6)
                r10.W(r2)
                wK.H9 r2 = r0.f151715a
                boolean r2 = r10.V(r2)
                boolean r3 = r10.F(r13)
                r2 = r2 | r3
                c2.t r3 = r0.f151716b
                boolean r3 = r10.V(r3)
                r2 = r2 | r3
                long r3 = r0.f151717c
                boolean r3 = r10.e(r3)
                r2 = r2 | r3
                java.util.List<wK.h9<T>> r3 = r0.f151718d
                boolean r3 = r10.F(r3)
                r2 = r2 | r3
                long r3 = r0.f151719e
                boolean r3 = r10.e(r3)
                r2 = r2 | r3
                long r3 = r0.f151720f
                boolean r3 = r10.e(r3)
                r2 = r2 | r3
                wK.s7<T> r3 = r0.f151721g
                boolean r3 = r10.F(r3)
                r2 = r2 | r3
                nI.l<java.util.List<? extends XH.v<wK.h9<T>, ? extends wK.N2>>, XH.N> r3 = r0.f151722h
                boolean r3 = r10.V(r3)
                r2 = r2 | r3
                wK.H9 r12 = r0.f151715a
                c2.t r14 = r0.f151716b
                long r3 = r0.f151717c
                U0.r0<java.lang.Boolean> r15 = r0.f151726l
                nI.l<java.util.List<? extends XH.v<wK.h9<T>, ? extends wK.N2>>, XH.N> r11 = r0.f151722h
                r32 = r5
                java.util.List<wK.h9<T>> r5 = r0.f151718d
                r26 = r6
                r25 = r7
                long r6 = r0.f151719e
                r28 = r8
                r27 = r9
                long r8 = r0.f151720f
                r29 = r1
                wK.s7<T> r1 = r0.f151721g
                java.lang.Object r0 = r31.D()
                if (r2 != 0) goto L_0x00ab
                U0.m$a r2 = U0.C4889m.f14007a
                java.lang.Object r2 = r2.a()
                if (r0 != r2) goto L_0x00c2
            L_0x00ab:
                wK.u9$a$a r0 = new wK.u9$a$a
                r2 = r11
                r11 = r0
                r17 = r15
                r15 = r3
                r18 = r2
                r19 = r5
                r20 = r6
                r22 = r8
                r24 = r1
                r11.<init>(r12, r13, r14, r15, r17, r18, r19, r20, r22, r24)
                r10.u(r0)
            L_0x00c2:
                E1.I r0 = (E1.I) r0
                r31.P()
                androidx.compose.ui.d$a r1 = androidx.compose.ui.d.f18749a
                r11 = 0
                int r2 = U0.C4883j.a(r10, r11)
                U0.y r3 = r31.s()
                androidx.compose.ui.d r1 = androidx.compose.ui.c.e(r10, r1)
                G1.g$a r4 = G1.C4504g.f6515W
                nI.a r5 = r4.a()
                U0.f r6 = r31.m()
                if (r6 != 0) goto L_0x00e5
                U0.C4883j.c()
            L_0x00e5:
                r31.I()
                boolean r6 = r31.i()
                if (r6 == 0) goto L_0x00f2
                r10.p(r5)
                goto L_0x00f5
            L_0x00f2:
                r31.t()
            L_0x00f5:
                U0.m r5 = U0.F1.a(r31)
                nI.p r6 = r4.c()
                U0.F1.c(r5, r0, r6)
                nI.p r0 = r4.e()
                U0.F1.c(r5, r3, r0)
                nI.p r0 = r4.b()
                boolean r3 = r5.i()
                if (r3 != 0) goto L_0x011f
                java.lang.Object r3 = r5.D()
                java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
                boolean r3 = kotlin.jvm.internal.C17542s.e(r3, r6)
                if (r3 != 0) goto L_0x012d
            L_0x011f:
                java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
                r5.u(r3)
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r5.w(r2, r0)
            L_0x012d:
                nI.p r0 = r4.d()
                U0.F1.c(r5, r1, r0)
                r0 = -937631003(0xffffffffc81ce2e5, float:-160651.58)
                r10.W(r0)
                r1 = r29
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                boolean r0 = r1 instanceof java.util.Collection
                if (r0 == 0) goto L_0x014f
                r0 = r1
                java.util.Collection r0 = (java.util.Collection) r0
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L_0x014f
                r0 = r11
                r9 = r27
                goto L_0x01a0
            L_0x014f:
                java.util.Iterator r0 = r1.iterator()
            L_0x0153:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L_0x019d
                java.lang.Object r2 = r0.next()
                wK.h9 r2 = (wK.C18351h9) r2
                java.lang.Object r2 = r2.c()
                r9 = r27
                r0.m r2 = r9.a(r2)
                r3 = -937626836(0xffffffffc81cf32c, float:-160716.69)
                r10.W(r3)
                U0.A1 r3 = r0.C5814f.a(r2, r10, r11)
                java.lang.Object r3 = r3.getValue()
                java.lang.Boolean r3 = (java.lang.Boolean) r3
                boolean r3 = r3.booleanValue()
                if (r3 != 0) goto L_0x0192
                U0.A1 r2 = r0.i.a(r2, r10, r11)
                java.lang.Object r2 = r2.getValue()
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 == 0) goto L_0x0190
                goto L_0x0192
            L_0x0190:
                r2 = r11
                goto L_0x0193
            L_0x0192:
                r2 = 1
            L_0x0193:
                r31.P()
                if (r2 == 0) goto L_0x019a
                r0 = 1
                goto L_0x01a0
            L_0x019a:
                r27 = r9
                goto L_0x0153
            L_0x019d:
                r9 = r27
                r0 = r11
            L_0x01a0:
                r31.P()
                r2 = -937620429(0xffffffffc81d0c33, float:-160816.8)
                r10.W(r2)
                java.util.Iterator r13 = r1.iterator()
                r1 = r11
            L_0x01ae:
                boolean r2 = r13.hasNext()
                if (r2 == 0) goto L_0x02b9
                java.lang.Object r2 = r13.next()
                int r14 = r1 + 1
                if (r1 >= 0) goto L_0x01bf
                YH.C16877v.x()
            L_0x01bf:
                r15 = r2
                wK.h9 r15 = (wK.C18351h9) r15
                java.lang.Object r2 = r15.c()
                r8 = r28
                boolean r2 = kotlin.jvm.internal.C17542s.e(r8, r2)
                java.lang.Object r3 = r15.c()
                r0.m r7 = r9.a(r3)
                U0.A1 r3 = r0.C5814f.a(r7, r10, r11)
                java.lang.Object r3 = r3.getValue()
                java.lang.Boolean r3 = (java.lang.Boolean) r3
                boolean r3 = r3.booleanValue()
                U0.A1 r4 = r0.i.a(r7, r10, r11)
                java.lang.Object r4 = r4.getValue()
                java.lang.Boolean r4 = (java.lang.Boolean) r4
                boolean r4 = r4.booleanValue()
                if (r2 == 0) goto L_0x0200
                if (r0 != 0) goto L_0x0200
                java.lang.Object r2 = r25.getValue()
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 == 0) goto L_0x0207
            L_0x0200:
                if (r3 != 0) goto L_0x0207
                if (r4 == 0) goto L_0x0205
                goto L_0x0207
            L_0x0205:
                r6 = r11
                goto L_0x0208
            L_0x0207:
                r6 = 1
            L_0x0208:
                java.lang.Object r2 = r15.c()
                r9.c(r2, r6)
                java.lang.Object r2 = r15.c()
                U0.A1 r2 = r9.b(r2)
                java.lang.Object r2 = r2.getValue()
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                double r11 = (double) r1
                r18 = 4608083138725491507(0x3ff3333333333333, double:1.2)
                r20 = r0
                double r0 = r11 + r18
                float r0 = (float) r0
                java.lang.Float r0 = java.lang.Float.valueOf(r0)
                java.lang.String r5 = r15.b()
                r1 = 444025240(0x1a774998, float:5.113785E-23)
                r10.W(r1)
                boolean r1 = r10.b(r3)
                boolean r18 = r10.b(r4)
                r1 = r1 | r18
                boolean r18 = r10.F(r15)
                r1 = r1 | r18
                r18 = r6
                r6 = r26
                boolean r19 = r10.V(r6)
                r1 = r1 | r19
                r28 = r8
                java.lang.Object r8 = r31.D()
                if (r1 != 0) goto L_0x0264
                U0.m$a r1 = U0.C4889m.f14007a
                java.lang.Object r1 = r1.a()
                if (r8 != r1) goto L_0x026c
            L_0x0264:
                wK.s9 r8 = new wK.s9
                r8.<init>(r3, r4, r15, r6)
                r10.u(r8)
            L_0x026c:
                nI.a r8 = (nI.C17631a) r8
                r31.P()
                r19 = 0
                r21 = 0
                r1 = r2
                r2 = r0
                r3 = r7
                r4 = r5
                r0 = r32
                r5 = r8
                r22 = r18
                r18 = r6
                r6 = r31
                r24 = r7
                r23 = r25
                r7 = r19
                r19 = r28
                r8 = r21
                wK.C18507u9.E(r1, r2, r3, r4, r5, r6, r7, r8)
                nI.p r1 = r15.a()
                r2 = 4607632778762754458(0x3ff199999999999a, double:1.1)
                double r11 = r11 + r2
                float r2 = (float) r11
                nI.a r6 = r15.d()
                java.lang.Float r3 = java.lang.Float.valueOf(r2)
                r8 = 0
                r11 = 0
                r2 = r22
                r4 = r0
                r5 = r24
                r7 = r31
                r12 = r9
                r9 = r11
                wK.C18507u9.L(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                r9 = r12
                r1 = r14
                r26 = r18
                r0 = r20
                r11 = 0
                goto L_0x01ae
            L_0x02b9:
                r31.P()
                r31.x()
                boolean r0 = U0.C4895p.J()
                if (r0 == 0) goto L_0x02c8
                U0.C4895p.R()
            L_0x02c8:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: wK.C18507u9.a.b(U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: wK.u9$b */
    static final class b implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C18481s7<T> f151737a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List<C18351h9<T>> f151738b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ T f151739c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C18339g9 f151740d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17642l<List<? extends v<C18351h9<T>, ? extends N2>>, C16807N> f151741e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ A1<Boolean> f151742f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C17642l<T, C16807N> f151743g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f151744h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ C4899r0<C5673m> f151745i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ C4899r0<C5667g> f151746j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ C4899r0<r> f151747k;

        b(C18481s7<T> s7Var, List<C18351h9<T>> list, T t10, C18339g9 g9Var, C17642l<? super List<? extends v<C18351h9<T>, ? extends N2>>, C16807N> lVar, A1<Boolean> a12, C17642l<? super T, C16807N> lVar2, int i10, C4899r0<C5673m> r0Var, C4899r0<C5667g> r0Var2, C4899r0<r> r0Var3) {
            this.f151737a = s7Var;
            this.f151738b = list;
            this.f151739c = t10;
            this.f151740d = g9Var;
            this.f151741e = lVar;
            this.f151742f = a12;
            this.f151743g = lVar2;
            this.f151744h = i10;
            this.f151745i = r0Var;
            this.f151746j = r0Var2;
            this.f151747k = r0Var3;
        }

        /* access modifiers changed from: private */
        public static final C16807N c(C17642l lVar, Object obj, Object obj2) {
            if (C17542s.e(obj, obj2)) {
                obj2 = null;
            }
            lVar.invoke(obj2);
            return C16807N.f139792a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: nI.l} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(U0.C4889m r19, int r20) {
            /*
                r18 = this;
                r0 = r18
                r14 = r19
                r1 = r20
                r2 = r1 & 3
                r3 = 2
                if (r2 != r3) goto L_0x0017
                boolean r2 = r19.l()
                if (r2 != 0) goto L_0x0012
                goto L_0x0017
            L_0x0012:
                r19.L()
                goto L_0x00b3
            L_0x0017:
                boolean r2 = U0.C4895p.J()
                if (r2 == 0) goto L_0x0026
                r2 = -1
                java.lang.String r3 = "net.ikea.skapa.ui.components.ShoppableImage.<anonymous>.<anonymous> (ShoppableImage.kt:172)"
                r4 = 2090949910(0x7ca15d16, float:6.7027824E36)
                U0.C4895p.S(r4, r1, r2, r3)
            L_0x0026:
                U0.r0<o1.m> r1 = r0.f151745i
                long r1 = wK.C18507u9.D(r1)
                r3 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
                int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r1 != 0) goto L_0x0036
                goto L_0x00aa
            L_0x0036:
                wK.s7<T> r1 = r0.f151737a
                java.util.List<wK.h9<T>> r2 = r0.f151738b
                T r3 = r0.f151739c
                wK.g9 r4 = r0.f151740d
                wK.H9 r4 = r4.a()
                U0.r0<o1.m> r5 = r0.f151745i
                long r5 = wK.C18507u9.D(r5)
                U0.r0<o1.g> r7 = r0.f151746j
                long r7 = wK.C18507u9.s(r7)
                U0.r0<c2.r> r9 = r0.f151747k
                long r9 = wK.C18507u9.v(r9)
                nI.l<java.util.List<? extends XH.v<wK.h9<T>, ? extends wK.N2>>, XH.N> r11 = r0.f151741e
                U0.A1<java.lang.Boolean> r12 = r0.f151742f
                r13 = 514521436(0x1eaaf95c, float:1.8102583E-20)
                r14.W(r13)
                nI.l<T, XH.N> r13 = r0.f151743g
                boolean r13 = r14.V(r13)
                T r15 = r0.f151739c
                boolean r15 = r14.F(r15)
                r13 = r13 | r15
                nI.l<T, XH.N> r15 = r0.f151743g
                r16 = r12
                T r12 = r0.f151739c
                r20 = r11
                java.lang.Object r11 = r19.D()
                if (r13 != 0) goto L_0x0081
                U0.m$a r13 = U0.C4889m.f14007a
                java.lang.Object r13 = r13.a()
                if (r11 != r13) goto L_0x0089
            L_0x0081:
                wK.v9 r11 = new wK.v9
                r11.<init>(r15, r12)
                r14.u(r11)
            L_0x0089:
                r13 = r11
                nI.l r13 = (nI.C17642l) r13
                r19.P()
                int r11 = r0.f151744h
                int r12 = r11 >> 9
                r12 = r12 & 8
                int r11 = r11 >> 9
                r11 = r11 & 8
                int r11 = r11 << 6
                r15 = r12 | r11
                r17 = 0
                r11 = r20
                r12 = r16
                r14 = r19
                r16 = r17
                wK.C18507u9.o(r1, r2, r3, r4, r5, r7, r9, r11, r12, r13, r14, r15, r16)
            L_0x00aa:
                boolean r1 = U0.C4895p.J()
                if (r1 == 0) goto L_0x00b3
                U0.C4895p.R()
            L_0x00b3:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: wK.C18507u9.b.b(U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: wK.u9$c */
    static final class c implements nI.r<androidx.compose.ui.d, Float, C4889m, Integer, androidx.compose.ui.d> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f151748a;

        c(String str) {
            this.f151748a = str;
        }

        /* access modifiers changed from: private */
        public static final C16807N c(String str, float f10, x xVar) {
            C17542s.j(xVar, "$this$semantics");
            if (str != null) {
                L1.v.d0(xVar, str);
            }
            L1.v.B0(xVar, f10);
            return C16807N.f139792a;
        }

        public final androidx.compose.ui.d b(androidx.compose.ui.d dVar, float f10, C4889m mVar, int i10) {
            C17542s.j(dVar, "$this$thenCheckNull");
            mVar.W(-2029357260);
            if (C4895p.J()) {
                C4895p.S(-2029357260, i10, -1, "net.ikea.skapa.ui.components.ShoppableImageDot.<anonymous> (ShoppableImage.kt:561)");
            }
            mVar.W(1769986516);
            boolean V10 = ((((i10 & 112) ^ 48) > 32 && mVar.c(f10)) || (i10 & 48) == 32) | mVar.V(this.f151748a);
            String str = this.f151748a;
            Object D10 = mVar.D();
            if (V10 || D10 == C4889m.f14007a.a()) {
                D10 = new C18531w9(str, f10);
                mVar.u(D10);
            }
            mVar.P();
            androidx.compose.ui.d d10 = L1.o.d(dVar, false, (C17642l) D10, 1, (Object) null);
            if (C4895p.J()) {
                C4895p.R();
            }
            mVar.P();
            return d10;
        }

        public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4) {
            return b((androidx.compose.ui.d) obj, ((Number) obj2).floatValue(), (C4889m) obj3, ((Number) obj4).intValue());
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: wK.u9$d */
    static final class d implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f151749a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f151750b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f151751c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Float f151752d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f151753e;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: wK.u9$d$a */
        static final class a implements p<C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ boolean f151754a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C17631a<C16807N> f151755b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ Float f151756c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ m f151757d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ A1<Boolean> f151758e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ p<C4889m, Integer, C16807N> f151759f;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: wK.u9$d$a$a  reason: collision with other inner class name */
            static final class C4316a implements q<androidx.compose.ui.d, C4889m, Integer, androidx.compose.ui.d> {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ m f151760a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ C17631a<C16807N> f151761b;

                C4316a(m mVar, C17631a<C16807N> aVar) {
                    this.f151760a = mVar;
                    this.f151761b = aVar;
                }

                /* access modifiers changed from: private */
                public static final C16807N c(C17631a aVar) {
                    if (aVar != null) {
                        aVar.invoke();
                    }
                    return C16807N.f139792a;
                }

                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: nI.a} */
                /* JADX WARNING: Multi-variable type inference failed */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final androidx.compose.ui.d b(androidx.compose.ui.d r13, U0.C4889m r14, int r15) {
                    /*
                        r12 = this;
                        java.lang.String r0 = "$this$thenCheckTrue"
                        kotlin.jvm.internal.C17542s.j(r13, r0)
                        r0 = -645571538(0xffffffffd9855c2e, float:-4.6921906E15)
                        r14.W(r0)
                        boolean r1 = U0.C4895p.J()
                        if (r1 == 0) goto L_0x0017
                        r1 = -1
                        java.lang.String r2 = "net.ikea.skapa.ui.components.ShoppableImageTag.<anonymous>.<anonymous>.<anonymous> (ShoppableImage.kt:633)"
                        U0.C4895p.S(r0, r15, r1, r2)
                    L_0x0017:
                        r0.m r4 = r12.f151760a
                        r15 = -1011122220(0xffffffffc3bb7fd4, float:-374.99866)
                        r14.W(r15)
                        nI.a<XH.N> r15 = r12.f151761b
                        boolean r15 = r14.V(r15)
                        nI.a<XH.N> r0 = r12.f151761b
                        java.lang.Object r1 = r14.D()
                        if (r15 != 0) goto L_0x0035
                        U0.m$a r15 = U0.C4889m.f14007a
                        java.lang.Object r15 = r15.a()
                        if (r1 != r15) goto L_0x003d
                    L_0x0035:
                        wK.y9 r1 = new wK.y9
                        r1.<init>(r0)
                        r14.u(r1)
                    L_0x003d:
                        r9 = r1
                        nI.a r9 = (nI.C17631a) r9
                        r14.P()
                        r10 = 28
                        r11 = 0
                        r5 = 0
                        r6 = 0
                        r7 = 0
                        r8 = 0
                        r3 = r13
                        androidx.compose.ui.d r13 = androidx.compose.foundation.d.b(r3, r4, r5, r6, r7, r8, r9, r10, r11)
                        boolean r15 = U0.C4895p.J()
                        if (r15 == 0) goto L_0x0058
                        U0.C4895p.R()
                    L_0x0058:
                        r14.P()
                        return r13
                    */
                    throw new UnsupportedOperationException("Method not decompiled: wK.C18507u9.d.a.C4316a.b(androidx.compose.ui.d, U0.m, int):androidx.compose.ui.d");
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    return b((androidx.compose.ui.d) obj, (C4889m) obj2, ((Number) obj3).intValue());
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: wK.u9$d$a$b */
            static final class b implements nI.r<androidx.compose.ui.d, Float, C4889m, Integer, androidx.compose.ui.d> {

                /* renamed from: a  reason: collision with root package name */
                public static final b f151762a = new b();

                b() {
                }

                /* access modifiers changed from: private */
                public static final C16807N c(float f10, x xVar) {
                    C17542s.j(xVar, "$this$semantics");
                    L1.v.B0(xVar, f10);
                    return C16807N.f139792a;
                }

                public final androidx.compose.ui.d b(androidx.compose.ui.d dVar, float f10, C4889m mVar, int i10) {
                    C17542s.j(dVar, "$this$thenCheckNull");
                    mVar.W(-712832330);
                    if (C4895p.J()) {
                        C4895p.S(-712832330, i10, -1, "net.ikea.skapa.ui.components.ShoppableImageTag.<anonymous>.<anonymous>.<anonymous> (ShoppableImage.kt:637)");
                    }
                    mVar.W(-1011116453);
                    boolean z10 = (((i10 & 112) ^ 48) > 32 && mVar.c(f10)) || (i10 & 48) == 32;
                    Object D10 = mVar.D();
                    if (z10 || D10 == C4889m.f14007a.a()) {
                        D10 = new C18565z9(f10);
                        mVar.u(D10);
                    }
                    mVar.P();
                    androidx.compose.ui.d d10 = L1.o.d(dVar, false, (C17642l) D10, 1, (Object) null);
                    if (C4895p.J()) {
                        C4895p.R();
                    }
                    mVar.P();
                    return d10;
                }

                public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4) {
                    return b((androidx.compose.ui.d) obj, ((Number) obj2).floatValue(), (C4889m) obj3, ((Number) obj4).intValue());
                }
            }

            a(boolean z10, C17631a<C16807N> aVar, Float f10, m mVar, A1<Boolean> a12, p<? super C4889m, ? super Integer, C16807N> pVar) {
                this.f151754a = z10;
                this.f151755b = aVar;
                this.f151756c = f10;
                this.f151757d = mVar;
                this.f151758e = a12;
                this.f151759f = pVar;
            }

            /* access modifiers changed from: private */
            public static final C16807N c(x xVar) {
                C17542s.j(xVar, "$this$semantics");
                return C16807N.f139792a;
            }

            public final void b(C4889m mVar, int i10) {
                C4889m mVar2 = mVar;
                int i11 = i10;
                if ((i11 & 3) != 2 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(-1892827870, i11, -1, "net.ikea.skapa.ui.components.ShoppableImageTag.<anonymous>.<anonymous> (ShoppableImage.kt:625)");
                    }
                    d.a aVar = androidx.compose.ui.d.f18749a;
                    float B10 = h.B((float) 0);
                    A9 a92 = A9.f149218a;
                    androidx.compose.ui.d e10 = C18767l.e(aVar, B10, 0, a92.f(), a92.j(), 0.0f, 18, (Object) null);
                    C18014e eVar = C18014e.f147445a;
                    float b10 = eVar.b();
                    C18030v vVar = C18030v.f147664a;
                    int i12 = C18030v.f147665b;
                    androidx.compose.ui.d g10 = C18205e.g(C18756a.j(C18205e.h(androidx.compose.foundation.b.d(androidx.compose.foundation.layout.x.a(androidx.compose.foundation.layout.J.z(C5599e.f(e10, C5602h.a(b10, vVar.a(mVar2, i12).j()), (i1) null, 2, (Object) null), a92.i(), a92.h()), C5880z.Min), vVar.a(mVar2, i12).i(), (i1) null, 2, (Object) null), this.f151754a && this.f151755b != null, new C4316a(this.f151757d, this.f151755b), mVar2, 0), d.c(this.f151758e), false, 2, (Object) null), this.f151756c, b.f151762a, mVar2, 0);
                    C17631a<C16807N> aVar2 = this.f151755b;
                    p<C4889m, Integer, C16807N> pVar = this.f151759f;
                    C5073d.e f10 = C5073d.f18068a.f();
                    C5437c.a aVar3 = C5437c.f24302a;
                    I b11 = G.b(f10, aVar3.l(), mVar2, 0);
                    int a10 = C4883j.a(mVar2, 0);
                    C4912y s10 = mVar.s();
                    androidx.compose.ui.d e11 = androidx.compose.ui.c.e(mVar2, g10);
                    C4504g.a aVar4 = C4504g.f6515W;
                    C17631a<C4504g> a11 = aVar4.a();
                    if (mVar.m() == null) {
                        C4883j.c();
                    }
                    mVar.I();
                    if (mVar.i()) {
                        mVar2.p(a11);
                    } else {
                        mVar.t();
                    }
                    C4889m a12 = F1.a(mVar);
                    F1.c(a12, b11, aVar4.c());
                    F1.c(a12, s10, aVar4.e());
                    p<C4504g, Integer, C16807N> b12 = aVar4.b();
                    if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                        a12.u(Integer.valueOf(a10));
                        a12.w(Integer.valueOf(a10), b12);
                    }
                    F1.c(a12, e11, aVar4.d());
                    C5843N n10 = C5843N.f28726a;
                    p<C4889m, Integer, C16807N> pVar2 = pVar;
                    androidx.compose.ui.d e12 = C5842M.e(n10, aVar, 1.0f, false, 2, (Object) null);
                    C18029u uVar = C18029u.f147649a;
                    androidx.compose.ui.d i13 = D.i(e12, uVar.l());
                    mVar2.W(-1011108158);
                    Object D10 = mVar.D();
                    if (D10 == C4889m.f14007a.a()) {
                        D10 = new C18543x9();
                        mVar2.u(D10);
                    }
                    mVar.P();
                    androidx.compose.ui.d c10 = L1.o.c(i13, true, (C17642l) D10);
                    I h10 = C5077h.h(aVar3.o(), false);
                    int a13 = C4883j.a(mVar2, 0);
                    C4912y s11 = mVar.s();
                    androidx.compose.ui.d e13 = androidx.compose.ui.c.e(mVar2, c10);
                    C17631a<C4504g> a14 = aVar4.a();
                    if (mVar.m() == null) {
                        C4883j.c();
                    }
                    mVar.I();
                    if (mVar.i()) {
                        mVar2.p(a14);
                    } else {
                        mVar.t();
                    }
                    C4889m a15 = F1.a(mVar);
                    F1.c(a15, h10, aVar4.c());
                    F1.c(a15, s11, aVar4.e());
                    p<C4504g, Integer, C16807N> b13 = aVar4.b();
                    if (a15.i() || !C17542s.e(a15.D(), Integer.valueOf(a13))) {
                        a15.u(Integer.valueOf(a13));
                        a15.w(Integer.valueOf(a13), b13);
                    }
                    F1.c(a15, e13, aVar4.d());
                    C5079j jVar = C5079j.f18125a;
                    pVar2.invoke(mVar2, 0);
                    mVar.x();
                    mVar2.W(-1011103034);
                    if (aVar2 != null) {
                        O0.H.b((androidx.compose.ui.d) null, eVar.b(), vVar.a(mVar2, i12).j(), mVar, 0, 1);
                        V.a(J1.e.c(C17950a.f147172u, mVar2, 0), (String) null, androidx.compose.foundation.layout.J.o(D.k(n10.c(aVar, aVar3.i()), uVar.f(), 0.0f, 2, (Object) null), a92.g()), vVar.a(mVar2, i12).G0(), mVar, 48, 0);
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
                b((C4889m) obj, ((Number) obj2).intValue());
                return C16807N.f139792a;
            }
        }

        d(m mVar, boolean z10, C17631a<C16807N> aVar, Float f10, p<? super C4889m, ? super Integer, C16807N> pVar) {
            this.f151749a = mVar;
            this.f151750b = z10;
            this.f151751c = aVar;
            this.f151752d = f10;
            this.f151753e = pVar;
        }

        /* access modifiers changed from: private */
        public static final boolean c(A1<Boolean> a12) {
            return a12.getValue().booleanValue();
        }

        public final void b(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1207932876, i10, -1, "net.ikea.skapa.ui.components.ShoppableImageTag.<anonymous> (ShoppableImage.kt:623)");
                }
                A1<Boolean> a10 = i.a(this.f151749a, mVar, 0);
                boolean z10 = this.f151750b;
                C18507u9.k((androidx.compose.ui.d) null, z10, true, c1.c.e(-1892827870, true, new a(z10, this.f151751c, this.f151752d, this.f151749a, a10, this.f151753e), mVar, 54), mVar, 3456, 1);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: wK.u9$e */
    public /* synthetic */ class e {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f151763a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                wK.wa$a[] r0 = wK.C18532wa.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                wK.wa$a r1 = wK.C18532wa.a.Vertical     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                wK.wa$a r1 = wK.C18532wa.a.Horizontal     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f151763a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: wK.C18507u9.e.<clinit>():void");
        }
    }

    private static final void A(C4899r0<r> r0Var, long j10) {
        r0Var.setValue(r.b(j10));
    }

    private static final long B(C4899r0<C5673m> r0Var) {
        return r0Var.getValue().q();
    }

    private static final void C(C4899r0<C5673m> r0Var, long j10) {
        r0Var.setValue(C5673m.c(j10));
    }

    /* access modifiers changed from: private */
    public static final long D(C4899r0<C5673m> r0Var) {
        return r0Var.getValue().q();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01d0  */
    /* JADX WARNING: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void E(boolean r30, java.lang.Float r31, r0.m r32, java.lang.String r33, nI.C17631a<XH.C16807N> r34, U0.C4889m r35, int r36, int r37) {
        /*
            r6 = r30
            r7 = r36
            r0 = 90252052(0x5612314, float:1.0585892E-35)
            r1 = r35
            U0.m r8 = r1.k(r0)
            r1 = r37 & 1
            r9 = 2
            if (r1 == 0) goto L_0x0015
            r1 = r7 | 6
            goto L_0x0025
        L_0x0015:
            r1 = r7 & 6
            if (r1 != 0) goto L_0x0024
            boolean r1 = r8.b(r6)
            if (r1 == 0) goto L_0x0021
            r1 = 4
            goto L_0x0022
        L_0x0021:
            r1 = r9
        L_0x0022:
            r1 = r1 | r7
            goto L_0x0025
        L_0x0024:
            r1 = r7
        L_0x0025:
            r2 = r37 & 2
            if (r2 == 0) goto L_0x002e
            r1 = r1 | 48
        L_0x002b:
            r3 = r31
            goto L_0x0040
        L_0x002e:
            r3 = r7 & 48
            if (r3 != 0) goto L_0x002b
            r3 = r31
            boolean r4 = r8.V(r3)
            if (r4 == 0) goto L_0x003d
            r4 = 32
            goto L_0x003f
        L_0x003d:
            r4 = 16
        L_0x003f:
            r1 = r1 | r4
        L_0x0040:
            r4 = r37 & 4
            if (r4 == 0) goto L_0x0049
            r1 = r1 | 384(0x180, float:5.38E-43)
        L_0x0046:
            r5 = r32
            goto L_0x005b
        L_0x0049:
            r5 = r7 & 384(0x180, float:5.38E-43)
            if (r5 != 0) goto L_0x0046
            r5 = r32
            boolean r10 = r8.V(r5)
            if (r10 == 0) goto L_0x0058
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x005a
        L_0x0058:
            r10 = 128(0x80, float:1.794E-43)
        L_0x005a:
            r1 = r1 | r10
        L_0x005b:
            r10 = r37 & 8
            if (r10 == 0) goto L_0x0064
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L_0x0061:
            r11 = r33
            goto L_0x0076
        L_0x0064:
            r11 = r7 & 3072(0xc00, float:4.305E-42)
            if (r11 != 0) goto L_0x0061
            r11 = r33
            boolean r12 = r8.V(r11)
            if (r12 == 0) goto L_0x0073
            r12 = 2048(0x800, float:2.87E-42)
            goto L_0x0075
        L_0x0073:
            r12 = 1024(0x400, float:1.435E-42)
        L_0x0075:
            r1 = r1 | r12
        L_0x0076:
            r12 = r37 & 16
            if (r12 == 0) goto L_0x0080
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
        L_0x007c:
            r12 = r34
        L_0x007e:
            r15 = r1
            goto L_0x0093
        L_0x0080:
            r12 = r7 & 24576(0x6000, float:3.4438E-41)
            if (r12 != 0) goto L_0x007c
            r12 = r34
            boolean r13 = r8.F(r12)
            if (r13 == 0) goto L_0x008f
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0091
        L_0x008f:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x0091:
            r1 = r1 | r13
            goto L_0x007e
        L_0x0093:
            r1 = r15 & 9363(0x2493, float:1.312E-41)
            r13 = 9362(0x2492, float:1.3119E-41)
            if (r1 != r13) goto L_0x00a8
            boolean r1 = r8.l()
            if (r1 != 0) goto L_0x00a0
            goto L_0x00a8
        L_0x00a0:
            r8.L()
            r2 = r3
            r3 = r5
            r4 = r11
            goto L_0x01ca
        L_0x00a8:
            r14 = 0
            if (r2 == 0) goto L_0x00ad
            r13 = r14
            goto L_0x00ae
        L_0x00ad:
            r13 = r3
        L_0x00ae:
            if (r4 == 0) goto L_0x00cf
            r1 = 1842010904(0x6dcadb18, float:7.847605E27)
            r8.W(r1)
            java.lang.Object r1 = r8.D()
            U0.m$a r2 = U0.C4889m.f14007a
            java.lang.Object r2 = r2.a()
            if (r1 != r2) goto L_0x00c9
            r0.m r1 = r0.l.a()
            r8.u(r1)
        L_0x00c9:
            r0.m r1 = (r0.m) r1
            r8.P()
            r5 = r1
        L_0x00cf:
            if (r10 == 0) goto L_0x00d2
            r11 = r14
        L_0x00d2:
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x00de
            r1 = -1
            java.lang.String r2 = "net.ikea.skapa.ui.components.ShoppableImageDot (ShoppableImage.kt:537)"
            U0.C4895p.S(r0, r15, r1, r2)
        L_0x00de:
            int r0 = r15 >> 6
            r0 = r0 & 14
            U0.A1 r10 = r0.C5814f.a(r5, r8, r0)
            U0.A1 r16 = r0.i.a(r5, r8, r0)
            U0.A1 r17 = r0.p.a(r5, r8, r0)
            wK.A9 r4 = wK.A9.f149218a
            r0 = 6
            wK.z2 r3 = r4.k(r8, r0)
            boolean r2 = F(r16)
            boolean r18 = G(r17)
            r1 = r15 & 14
            r0 = r3
            r31 = r1
            r1 = r30
            r19 = r15
            r15 = r3
            r3 = r18
            r26 = r4
            r4 = r8
            r27 = r5
            r5 = r31
            U0.A1 r0 = r0.b(r1, r2, r3, r4, r5)
            boolean r1 = G(r17)
            r2 = r31
            U0.A1 r1 = r15.a(r6, r1, r8, r2)
            androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
            boolean r3 = F(r16)
            r4 = 0
            androidx.compose.ui.d r2 = zK.C18756a.j(r2, r3, r4, r9, r14)
            L1.i$a r3 = L1.i.f8936b
            int r3 = r3.a()
            L1.i r18 = L1.i.h(r3)
            r20 = 8
            r21 = 0
            r3 = 0
            r16 = 1
            r17 = 0
            r5 = r13
            r13 = r2
            r2 = r14
            r14 = r27
            r29 = r15
            r28 = r19
            r15 = r3
            r19 = r34
            androidx.compose.ui.d r3 = androidx.compose.foundation.d.b(r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r13 = 3
            r14 = 0
            androidx.compose.ui.d r16 = zK.C18766k.b(r3, r14, r14, r13, r2)
            tK.d r3 = tK.C18013d.f147437a
            A0.f r19 = r3.a()
            zK.g r20 = zK.C18762g.StaticInverse
            r24 = 112(0x70, float:1.57E-43)
            r25 = 0
            r18 = 1
            r21 = 0
            r22 = 0
            r23 = 0
            r17 = r10
            androidx.compose.ui.d r3 = zK.C18756a.b(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            float r10 = r26.d()
            androidx.compose.ui.d r3 = androidx.compose.foundation.layout.J.o(r3, r10)
            i1.c$a r10 = i1.C5437c.f24302a
            i1.c r10 = r10.e()
            androidx.compose.ui.d r2 = androidx.compose.foundation.layout.J.E(r3, r10, r4, r9, r2)
            wK.u9$c r3 = new wK.u9$c
            r3.<init>(r11)
            r9 = r28 & 112(0x70, float:1.57E-43)
            androidx.compose.ui.d r2 = vK.C18205e.g(r2, r5, r3, r8, r9)
            r3 = 1842053498(0x6dcb817a, float:7.872748E27)
            r8.W(r3)
            r3 = r29
            boolean r9 = r8.V(r3)
            boolean r10 = r8.V(r1)
            r9 = r9 | r10
            boolean r10 = r8.V(r0)
            r9 = r9 | r10
            java.lang.Object r10 = r8.D()
            if (r9 != 0) goto L_0x01ad
            U0.m$a r9 = U0.C4889m.f14007a
            java.lang.Object r9 = r9.a()
            if (r10 != r9) goto L_0x01b5
        L_0x01ad:
            wK.p9 r10 = new wK.p9
            r10.<init>(r3, r1, r0)
            r8.u(r10)
        L_0x01b5:
            nI.l r10 = (nI.C17642l) r10
            r8.P()
            n0.C5603i.a(r2, r10, r8, r4)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x01c6
            U0.C4895p.R()
        L_0x01c6:
            r2 = r5
            r4 = r11
            r3 = r27
        L_0x01ca:
            U0.Y0 r8 = r8.n()
            if (r8 == 0) goto L_0x01e1
            wK.q9 r9 = new wK.q9
            r0 = r9
            r1 = r30
            r5 = r34
            r6 = r36
            r7 = r37
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.a(r9)
        L_0x01e1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wK.C18507u9.E(boolean, java.lang.Float, r0.m, java.lang.String, nI.a, U0.m, int, int):void");
    }

    private static final boolean F(A1<Boolean> a12) {
        return a12.getValue().booleanValue();
    }

    private static final boolean G(A1<Boolean> a12) {
        return a12.getValue().booleanValue();
    }

    private static final float H(A1<h> a12) {
        return a12.getValue().G();
    }

    private static final float I(A1<Float> a12) {
        return a12.getValue().floatValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N J(C18558z2 z2Var, A1 a12, A1 a13, f fVar) {
        f fVar2 = fVar;
        C17542s.j(fVar2, "$this$Canvas");
        A9 a92 = A9.f149218a;
        float H12 = fVar2.H1(a92.e());
        long o10 = C5747v0.o(z2Var.c(), I(a12), 0.0f, 0.0f, 0.0f, 14, (Object) null);
        float f10 = H12 / ((float) 2);
        float H13 = fVar2.H1(a92.c()) - f10;
        j jVar = j.f28627a;
        f.G1(fVar, o10, H13, 0, 0.0f, jVar, (C5749w0) null, 0, 108, (Object) null);
        f.G1(fVar, C5747v0.o(z2Var.e(), I(a12), 0.0f, 0.0f, 0.0f, 14, (Object) null), fVar2.H1(a92.c()) - f10, 0, 0.0f, new k(H12, 0.0f, 0, 0, (V0) null, 30, (DefaultConstructorMarker) null), (C5749w0) null, 0, 108, (Object) null);
        if (h.v(H(a13), h.B((float) 0)) > 0) {
            f.G1(fVar, z2Var.d(), fVar2.H1(H(a13)), 0, 0.0f, jVar, (C5749w0) null, 0, 108, (Object) null);
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N K(boolean z10, Float f10, m mVar, String str, C17631a aVar, int i10, int i11, C4889m mVar2, int i12) {
        E(z10, f10, mVar, str, aVar, mVar2, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x015a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void L(nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r17, boolean r18, java.lang.Float r19, c2.t r20, r0.m r21, nI.C17631a<XH.C16807N> r22, U0.C4889m r23, int r24, int r25) {
        /*
            r7 = r24
            r0 = 918352652(0x36bcf30c, float:5.631131E-6)
            r1 = r23
            U0.m r1 = r1.k(r0)
            r2 = r25 & 1
            if (r2 == 0) goto L_0x0015
            r2 = r7 | 6
            r3 = r2
            r2 = r17
            goto L_0x0029
        L_0x0015:
            r2 = r7 & 6
            if (r2 != 0) goto L_0x0026
            r2 = r17
            boolean r3 = r1.F(r2)
            if (r3 == 0) goto L_0x0023
            r3 = 4
            goto L_0x0024
        L_0x0023:
            r3 = 2
        L_0x0024:
            r3 = r3 | r7
            goto L_0x0029
        L_0x0026:
            r2 = r17
            r3 = r7
        L_0x0029:
            r4 = r25 & 2
            if (r4 == 0) goto L_0x0032
            r3 = r3 | 48
        L_0x002f:
            r4 = r18
            goto L_0x0044
        L_0x0032:
            r4 = r7 & 48
            if (r4 != 0) goto L_0x002f
            r4 = r18
            boolean r5 = r1.b(r4)
            if (r5 == 0) goto L_0x0041
            r5 = 32
            goto L_0x0043
        L_0x0041:
            r5 = 16
        L_0x0043:
            r3 = r3 | r5
        L_0x0044:
            r5 = r25 & 4
            if (r5 == 0) goto L_0x004d
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x004a:
            r6 = r19
            goto L_0x005f
        L_0x004d:
            r6 = r7 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L_0x004a
            r6 = r19
            boolean r8 = r1.V(r6)
            if (r8 == 0) goto L_0x005c
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x005e
        L_0x005c:
            r8 = 128(0x80, float:1.794E-43)
        L_0x005e:
            r3 = r3 | r8
        L_0x005f:
            r8 = r7 & 3072(0xc00, float:4.305E-42)
            if (r8 != 0) goto L_0x0078
            r8 = r25 & 8
            if (r8 != 0) goto L_0x0072
            r8 = r20
            boolean r9 = r1.V(r8)
            if (r9 == 0) goto L_0x0074
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x0076
        L_0x0072:
            r8 = r20
        L_0x0074:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x0076:
            r3 = r3 | r9
            goto L_0x007a
        L_0x0078:
            r8 = r20
        L_0x007a:
            r9 = r25 & 16
            if (r9 == 0) goto L_0x0083
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
        L_0x0080:
            r10 = r21
            goto L_0x0095
        L_0x0083:
            r10 = r7 & 24576(0x6000, float:3.4438E-41)
            if (r10 != 0) goto L_0x0080
            r10 = r21
            boolean r11 = r1.V(r10)
            if (r11 == 0) goto L_0x0092
            r11 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0094
        L_0x0092:
            r11 = 8192(0x2000, float:1.14794E-41)
        L_0x0094:
            r3 = r3 | r11
        L_0x0095:
            r11 = r25 & 32
            r12 = 196608(0x30000, float:2.75506E-40)
            if (r11 == 0) goto L_0x009f
            r3 = r3 | r12
            r14 = r22
            goto L_0x00b1
        L_0x009f:
            r11 = r7 & r12
            r14 = r22
            if (r11 != 0) goto L_0x00b1
            boolean r11 = r1.F(r14)
            if (r11 == 0) goto L_0x00ae
            r11 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b0
        L_0x00ae:
            r11 = 65536(0x10000, float:9.18355E-41)
        L_0x00b0:
            r3 = r3 | r11
        L_0x00b1:
            r11 = 74899(0x12493, float:1.04956E-40)
            r11 = r11 & r3
            r12 = 74898(0x12492, float:1.04954E-40)
            if (r11 != r12) goto L_0x00c8
            boolean r11 = r1.l()
            if (r11 != 0) goto L_0x00c1
            goto L_0x00c8
        L_0x00c1:
            r1.L()
            r3 = r6
            r5 = r10
            goto L_0x0160
        L_0x00c8:
            r1.G()
            r11 = r7 & 1
            if (r11 == 0) goto L_0x00e7
            boolean r11 = r1.O()
            if (r11 == 0) goto L_0x00d6
            goto L_0x00e7
        L_0x00d6:
            r1.L()
            r5 = r25 & 8
            if (r5 == 0) goto L_0x00df
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x00df:
            r5 = r6
        L_0x00e0:
            r6 = r10
        L_0x00e1:
            r16 = r8
            r8 = r3
            r3 = r16
            goto L_0x011e
        L_0x00e7:
            if (r5 == 0) goto L_0x00eb
            r5 = 0
            goto L_0x00ec
        L_0x00eb:
            r5 = r6
        L_0x00ec:
            r6 = r25 & 8
            if (r6 == 0) goto L_0x00fd
            U0.I0 r6 = androidx.compose.ui.platform.C5100f0.k()
            java.lang.Object r6 = r1.Q(r6)
            c2.t r6 = (c2.t) r6
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
            r8 = r6
        L_0x00fd:
            if (r9 == 0) goto L_0x00e0
            r6 = 1856455465(0x6ea74329, float:2.5882594E28)
            r1.W(r6)
            java.lang.Object r6 = r1.D()
            U0.m$a r9 = U0.C4889m.f14007a
            java.lang.Object r9 = r9.a()
            if (r6 != r9) goto L_0x0118
            r0.m r6 = r0.l.a()
            r1.u(r6)
        L_0x0118:
            r0.m r6 = (r0.m) r6
            r1.P()
            goto L_0x00e1
        L_0x011e:
            r1.y()
            boolean r9 = U0.C4895p.J()
            if (r9 == 0) goto L_0x012d
            r9 = -1
            java.lang.String r10 = "net.ikea.skapa.ui.components.ShoppableImageTag (ShoppableImage.kt:619)"
            U0.C4895p.S(r0, r8, r9, r10)
        L_0x012d:
            U0.I0 r0 = androidx.compose.ui.platform.C5100f0.k()
            U0.J0 r0 = r0.d(r3)
            wK.u9$d r15 = new wK.u9$d
            r8 = r15
            r9 = r6
            r10 = r18
            r11 = r22
            r12 = r5
            r13 = r17
            r8.<init>(r9, r10, r11, r12, r13)
            r8 = 54
            r9 = 1207932876(0x47ff97cc, float:130863.59)
            r10 = 1
            c1.a r8 = c1.c.e(r9, r10, r15, r1, r8)
            int r9 = U0.J0.f13770i
            r9 = r9 | 48
            U0.C4910x.a(r0, r8, r1, r9)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x015d
            U0.C4895p.R()
        L_0x015d:
            r8 = r3
            r3 = r5
            r5 = r6
        L_0x0160:
            U0.Y0 r9 = r1.n()
            if (r9 == 0) goto L_0x017a
            wK.r9 r10 = new wK.r9
            r0 = r10
            r1 = r17
            r2 = r18
            r4 = r8
            r6 = r22
            r7 = r24
            r8 = r25
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.a(r10)
        L_0x017a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wK.C18507u9.L(nI.p, boolean, java.lang.Float, c2.t, r0.m, nI.a, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N M(p pVar, boolean z10, Float f10, t tVar, m mVar, C17631a aVar, int i10, int i11, C4889m mVar2, int i12) {
        L(pVar, z10, f10, tVar, mVar, aVar, mVar2, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    private static final C18532wa Y(float f10, float f11) {
        int i10 = (0.35f > f10 ? 1 : (0.35f == f10 ? 0 : -1));
        if (i10 <= 0 && f10 <= 0.65f && f11 > 0.5f) {
            return C18532wa.b.f151883a.d();
        }
        if (i10 <= 0 && f10 <= 0.65f && f11 <= 0.5f) {
            return C18532wa.b.f151883a.a();
        }
        int i11 = (f10 > 0.5f ? 1 : (f10 == 0.5f ? 0 : -1));
        if (i11 <= 0 && f11 <= 0.5f) {
            return C18532wa.b.f151883a.b();
        }
        int i12 = (f10 > 0.5f ? 1 : (f10 == 0.5f ? 0 : -1));
        return (i12 <= 0 || f11 > 0.5f) ? (i11 > 0 || f11 <= 0.5f) ? (i12 <= 0 || f11 <= 0.5f) ? C18532wa.b.f151883a.d() : C18532wa.b.f151883a.f() : C18532wa.b.f151883a.e() : C18532wa.b.f151883a.c();
    }

    /* access modifiers changed from: private */
    public static final boolean Z(int i10, int i11, a0 a0Var, long j10, T3 t32) {
        return (n.h(j10) >= (-t32.c()) && n.h(j10) + a0Var.E0() < i10 + t32.b()) && (n.i(j10) >= (-t32.d()) && n.i(j10) + a0Var.z0() < i11 + t32.a());
    }

    static /* synthetic */ boolean a0(int i10, int i11, a0 a0Var, long j10, T3 t32, int i12, Object obj) {
        if ((i12 & 16) != 0) {
            t32 = new T3(0, 0, 0, 0);
        }
        return Z(i10, i11, a0Var, j10, t32);
    }

    /* access modifiers changed from: private */
    public static final boolean b0(long j10, long j11, int i10) {
        return (n.h(j10) < n.h(j11) + i10 && n.h(j11) < n.h(j10) + i10) && (n.i(j10) < n.i(j11) + i10 && n.i(j11) < n.i(j10) + i10);
    }

    /* access modifiers changed from: private */
    public static final boolean c0(long j10, int i10, long j11, long j12) {
        return (n.h(j10) < n.h(j11) + r.h(j12) && n.h(j10) + i10 > n.h(j11)) && (n.i(j10) < n.i(j11) + r.g(j12) && n.i(j10) + i10 > n.i(j11));
    }

    /* access modifiers changed from: private */
    public static final long d0(a0 a0Var, float f10, float f11, long j10, int i10) {
        int z02 = a0Var.z0() / 2;
        int E02 = a0Var.E0() / 2;
        C18532wa Y10 = Y(f10, f11);
        int i11 = e.f151763a[Y10.a().ordinal()];
        if (i11 == 1) {
            return o.a((n.h(j10) - E02) + (((-i10) + E02) * Y10.b()), (n.i(j10) - z02) + ((i10 + z02) * Y10.c()));
        }
        if (i11 == 2) {
            return o.a((n.h(j10) - E02) + ((E02 + i10) * Y10.b()), (n.i(j10) - z02) + (((-i10) + z02) * Y10.c()));
        }
        throw new XH.t();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x01b4  */
    /* JADX WARNING: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void k(androidx.compose.ui.d r18, boolean r19, boolean r20, nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r21, U0.C4889m r22, int r23, int r24) {
        /*
            r4 = r21
            r5 = r23
            r0 = 4
            r1 = -1544840244(0xffffffffa3eb9bcc, float:-2.5544734E-17)
            r2 = r22
            U0.m r2 = r2.k(r1)
            r3 = 1
            r6 = r24 & 1
            r7 = 2
            if (r6 == 0) goto L_0x001a
            r8 = r5 | 6
            r9 = r8
            r8 = r18
            goto L_0x002e
        L_0x001a:
            r8 = r5 & 6
            if (r8 != 0) goto L_0x002b
            r8 = r18
            boolean r9 = r2.V(r8)
            if (r9 == 0) goto L_0x0028
            r9 = r0
            goto L_0x0029
        L_0x0028:
            r9 = r7
        L_0x0029:
            r9 = r9 | r5
            goto L_0x002e
        L_0x002b:
            r8 = r18
            r9 = r5
        L_0x002e:
            r10 = r24 & 2
            if (r10 == 0) goto L_0x0037
            r9 = r9 | 48
        L_0x0034:
            r11 = r19
            goto L_0x0049
        L_0x0037:
            r11 = r5 & 48
            if (r11 != 0) goto L_0x0034
            r11 = r19
            boolean r12 = r2.b(r11)
            if (r12 == 0) goto L_0x0046
            r12 = 32
            goto L_0x0048
        L_0x0046:
            r12 = 16
        L_0x0048:
            r9 = r9 | r12
        L_0x0049:
            r0 = r24 & 4
            if (r0 == 0) goto L_0x0052
            r9 = r9 | 384(0x180, float:5.38E-43)
        L_0x004f:
            r12 = r20
            goto L_0x0064
        L_0x0052:
            r12 = r5 & 384(0x180, float:5.38E-43)
            if (r12 != 0) goto L_0x004f
            r12 = r20
            boolean r13 = r2.b(r12)
            if (r13 == 0) goto L_0x0061
            r13 = 256(0x100, float:3.59E-43)
            goto L_0x0063
        L_0x0061:
            r13 = 128(0x80, float:1.794E-43)
        L_0x0063:
            r9 = r9 | r13
        L_0x0064:
            r13 = r24 & 8
            if (r13 == 0) goto L_0x006c
            r9 = r9 | 3072(0xc00, float:4.305E-42)
        L_0x006a:
            r14 = r9
            goto L_0x007d
        L_0x006c:
            r13 = r5 & 3072(0xc00, float:4.305E-42)
            if (r13 != 0) goto L_0x006a
            boolean r13 = r2.F(r4)
            if (r13 == 0) goto L_0x0079
            r13 = 2048(0x800, float:2.87E-42)
            goto L_0x007b
        L_0x0079:
            r13 = 1024(0x400, float:1.435E-42)
        L_0x007b:
            r9 = r9 | r13
            goto L_0x006a
        L_0x007d:
            r9 = r14 & 1171(0x493, float:1.641E-42)
            r13 = 1170(0x492, float:1.64E-42)
            if (r9 != r13) goto L_0x0091
            boolean r9 = r2.l()
            if (r9 != 0) goto L_0x008a
            goto L_0x0091
        L_0x008a:
            r2.L()
            r1 = r8
            r3 = r12
            goto L_0x01ae
        L_0x0091:
            if (r6 == 0) goto L_0x0097
            androidx.compose.ui.d$a r6 = androidx.compose.ui.d.f18749a
            r15 = r6
            goto L_0x0098
        L_0x0097:
            r15 = r8
        L_0x0098:
            if (r10 == 0) goto L_0x009b
            goto L_0x009c
        L_0x009b:
            r3 = r11
        L_0x009c:
            r13 = 0
            if (r0 == 0) goto L_0x00a1
            r0 = r13
            goto L_0x00a2
        L_0x00a1:
            r0 = r12
        L_0x00a2:
            boolean r6 = U0.C4895p.J()
            if (r6 == 0) goto L_0x00ae
            r6 = -1
            java.lang.String r8 = "net.ikea.skapa.ui.components.AlphaAnimation (ShoppableImage.kt:679)"
            U0.C4895p.S(r1, r14, r6, r8)
        L_0x00ae:
            r1 = 401124578(0x17e8ace2, float:1.503629E-24)
            r2.W(r1)
            java.lang.Object r1 = r2.D()
            U0.m$a r16 = U0.C4889m.f14007a
            java.lang.Object r6 = r16.a()
            if (r1 != r6) goto L_0x00d0
            tK.t r1 = tK.C18028t.f147640a
            m0.x r1 = r1.d()
            r6 = 0
            r8 = 300(0x12c, float:4.2E-43)
            m0.y0 r1 = m0.C5548j.j(r8, r13, r1, r7, r6)
            r2.u(r1)
        L_0x00d0:
            r7 = r1
            m0.y0 r7 = (m0.y0) r7
            r2.P()
            r1 = 0
            if (r3 == 0) goto L_0x00dc
            r6 = 1065353216(0x3f800000, float:1.0)
            goto L_0x00dd
        L_0x00dc:
            r6 = r1
        L_0x00dd:
            r12 = 3120(0xc30, float:4.372E-42)
            r17 = 20
            r8 = 0
            java.lang.String r9 = "Alpha anim"
            r10 = 0
            r11 = r2
            r13 = r17
            U0.A1 r6 = m0.C5534c.d(r6, r7, r8, r9, r10, r11, r12, r13)
            if (r0 != 0) goto L_0x00f6
            float r7 = l(r6)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x01a2
        L_0x00f6:
            r1 = 401138382(0x17e8e2ce, float:1.5049902E-24)
            r2.W(r1)
            boolean r1 = r2.V(r6)
            java.lang.Object r7 = r2.D()
            if (r1 != 0) goto L_0x010c
            java.lang.Object r1 = r16.a()
            if (r7 != r1) goto L_0x0114
        L_0x010c:
            wK.m9 r7 = new wK.m9
            r7.<init>(r6)
            r2.u(r7)
        L_0x0114:
            nI.l r7 = (nI.C17642l) r7
            r2.P()
            androidx.compose.ui.d r1 = androidx.compose.ui.graphics.b.a(r15, r7)
            i1.c$a r6 = i1.C5437c.f24302a
            i1.c r6 = r6.o()
            r7 = 0
            E1.I r6 = androidx.compose.foundation.layout.C5077h.h(r6, r7)
            int r7 = U0.C4883j.a(r2, r7)
            U0.y r8 = r2.s()
            androidx.compose.ui.d r1 = androidx.compose.ui.c.e(r2, r1)
            G1.g$a r9 = G1.C4504g.f6515W
            nI.a r10 = r9.a()
            U0.f r11 = r2.m()
            if (r11 != 0) goto L_0x0143
            U0.C4883j.c()
        L_0x0143:
            r2.I()
            boolean r11 = r2.i()
            if (r11 == 0) goto L_0x0150
            r2.p(r10)
            goto L_0x0153
        L_0x0150:
            r2.t()
        L_0x0153:
            U0.m r10 = U0.F1.a(r2)
            nI.p r11 = r9.c()
            U0.F1.c(r10, r6, r11)
            nI.p r6 = r9.e()
            U0.F1.c(r10, r8, r6)
            nI.p r6 = r9.b()
            boolean r8 = r10.i()
            if (r8 != 0) goto L_0x017d
            java.lang.Object r8 = r10.D()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r7)
            boolean r8 = kotlin.jvm.internal.C17542s.e(r8, r11)
            if (r8 != 0) goto L_0x018b
        L_0x017d:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r10.u(r8)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r10.w(r7, r6)
        L_0x018b:
            nI.p r6 = r9.d()
            U0.F1.c(r10, r1, r6)
            androidx.compose.foundation.layout.j r1 = androidx.compose.foundation.layout.C5079j.f18125a
            int r1 = r14 >> 9
            r1 = r1 & 14
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4.invoke(r2, r1)
            r2.x()
        L_0x01a2:
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x01ab
            U0.C4895p.R()
        L_0x01ab:
            r11 = r3
            r1 = r15
            r3 = r0
        L_0x01ae:
            U0.Y0 r7 = r2.n()
            if (r7 == 0) goto L_0x01c4
            wK.n9 r8 = new wK.n9
            r0 = r8
            r2 = r11
            r4 = r21
            r5 = r23
            r6 = r24
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x01c4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wK.C18507u9.k(androidx.compose.ui.d, boolean, boolean, nI.p, U0.m, int, int):void");
    }

    private static final float l(A1<Float> a12) {
        return a12.getValue().floatValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N m(A1 a12, androidx.compose.ui.graphics.c cVar) {
        C17542s.j(cVar, "$this$graphicsLayer");
        cVar.d(l(a12));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N n(androidx.compose.ui.d dVar, boolean z10, boolean z11, p pVar, int i10, int i11, C4889m mVar, int i12) {
        k(dVar, z10, z11, pVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x01e2  */
    /* JADX WARNING: Removed duplicated region for block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0100  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> void o(wK.C18481s7<T> r23, java.util.List<wK.C18351h9<T>> r24, T r25, wK.H9 r26, long r27, long r29, long r31, nI.C17642l<? super java.util.List<? extends XH.v<wK.C18351h9<T>, ? extends wK.N2>>, XH.C16807N> r33, U0.A1<java.lang.Boolean> r34, nI.C17642l<? super T, XH.C16807N> r35, U0.C4889m r36, int r37, int r38) {
        /*
            r15 = r23
            r14 = r25
            r13 = r37
            r12 = r38
            r0 = 88697566(0x5496ade, float:9.470603E-36)
            r1 = r36
            U0.m r11 = r1.k(r0)
            r1 = r12 & 1
            if (r1 == 0) goto L_0x0018
            r1 = r13 | 6
            goto L_0x0031
        L_0x0018:
            r1 = r13 & 6
            if (r1 != 0) goto L_0x0030
            r1 = r13 & 8
            if (r1 != 0) goto L_0x0025
            boolean r1 = r11.V(r15)
            goto L_0x0029
        L_0x0025:
            boolean r1 = r11.F(r15)
        L_0x0029:
            if (r1 == 0) goto L_0x002d
            r1 = 4
            goto L_0x002e
        L_0x002d:
            r1 = 2
        L_0x002e:
            r1 = r1 | r13
            goto L_0x0031
        L_0x0030:
            r1 = r13
        L_0x0031:
            r3 = r12 & 2
            if (r3 == 0) goto L_0x003a
            r1 = r1 | 48
            r10 = r24
            goto L_0x004c
        L_0x003a:
            r3 = r13 & 48
            r10 = r24
            if (r3 != 0) goto L_0x004c
            boolean r3 = r11.F(r10)
            if (r3 == 0) goto L_0x0049
            r3 = 32
            goto L_0x004b
        L_0x0049:
            r3 = 16
        L_0x004b:
            r1 = r1 | r3
        L_0x004c:
            r3 = r12 & 4
            if (r3 == 0) goto L_0x0053
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x006c
        L_0x0053:
            r3 = r13 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L_0x006c
            r3 = r13 & 512(0x200, float:7.175E-43)
            if (r3 != 0) goto L_0x0060
            boolean r3 = r11.V(r14)
            goto L_0x0064
        L_0x0060:
            boolean r3 = r11.F(r14)
        L_0x0064:
            if (r3 == 0) goto L_0x0069
            r3 = 256(0x100, float:3.59E-43)
            goto L_0x006b
        L_0x0069:
            r3 = 128(0x80, float:1.794E-43)
        L_0x006b:
            r1 = r1 | r3
        L_0x006c:
            r3 = r12 & 8
            if (r3 == 0) goto L_0x0075
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            r8 = r26
            goto L_0x0087
        L_0x0075:
            r3 = r13 & 3072(0xc00, float:4.305E-42)
            r8 = r26
            if (r3 != 0) goto L_0x0087
            boolean r3 = r11.V(r8)
            if (r3 == 0) goto L_0x0084
            r3 = 2048(0x800, float:2.87E-42)
            goto L_0x0086
        L_0x0084:
            r3 = 1024(0x400, float:1.435E-42)
        L_0x0086:
            r1 = r1 | r3
        L_0x0087:
            r3 = r12 & 16
            if (r3 == 0) goto L_0x0090
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            r6 = r27
            goto L_0x00a2
        L_0x0090:
            r3 = r13 & 24576(0x6000, float:3.4438E-41)
            r6 = r27
            if (r3 != 0) goto L_0x00a2
            boolean r3 = r11.e(r6)
            if (r3 == 0) goto L_0x009f
            r3 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a1
        L_0x009f:
            r3 = 8192(0x2000, float:1.14794E-41)
        L_0x00a1:
            r1 = r1 | r3
        L_0x00a2:
            r3 = r12 & 32
            r4 = 196608(0x30000, float:2.75506E-40)
            if (r3 == 0) goto L_0x00ac
            r1 = r1 | r4
        L_0x00a9:
            r3 = r29
            goto L_0x00be
        L_0x00ac:
            r3 = r13 & r4
            if (r3 != 0) goto L_0x00a9
            r3 = r29
            boolean r5 = r11.e(r3)
            if (r5 == 0) goto L_0x00bb
            r5 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00bd
        L_0x00bb:
            r5 = 65536(0x10000, float:9.18355E-41)
        L_0x00bd:
            r1 = r1 | r5
        L_0x00be:
            r5 = r12 & 64
            r9 = 1572864(0x180000, float:2.204052E-39)
            if (r5 == 0) goto L_0x00c8
            r1 = r1 | r9
            r2 = r31
            goto L_0x00da
        L_0x00c8:
            r5 = r13 & r9
            r2 = r31
            if (r5 != 0) goto L_0x00da
            boolean r4 = r11.e(r2)
            if (r4 == 0) goto L_0x00d7
            r4 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d9
        L_0x00d7:
            r4 = 524288(0x80000, float:7.34684E-40)
        L_0x00d9:
            r1 = r1 | r4
        L_0x00da:
            r4 = r12 & 128(0x80, float:1.794E-43)
            r5 = 12582912(0xc00000, float:1.7632415E-38)
            if (r4 == 0) goto L_0x00e4
            r1 = r1 | r5
        L_0x00e1:
            r5 = r33
            goto L_0x00f5
        L_0x00e4:
            r5 = r5 & r13
            if (r5 != 0) goto L_0x00e1
            r5 = r33
            boolean r9 = r11.F(r5)
            if (r9 == 0) goto L_0x00f2
            r9 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f4
        L_0x00f2:
            r9 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f4:
            r1 = r1 | r9
        L_0x00f5:
            r9 = r12 & 256(0x100, float:3.59E-43)
            r16 = 100663296(0x6000000, float:2.4074124E-35)
            if (r9 == 0) goto L_0x0100
            r1 = r1 | r16
        L_0x00fd:
            r9 = r34
            goto L_0x0113
        L_0x0100:
            r9 = r13 & r16
            if (r9 != 0) goto L_0x00fd
            r9 = r34
            boolean r16 = r11.V(r9)
            if (r16 == 0) goto L_0x010f
            r16 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0111
        L_0x010f:
            r16 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0111:
            r1 = r1 | r16
        L_0x0113:
            r0 = r12 & 512(0x200, float:7.175E-43)
            r17 = 805306368(0x30000000, float:4.656613E-10)
            if (r0 == 0) goto L_0x011e
            r1 = r1 | r17
        L_0x011b:
            r0 = r35
            goto L_0x0131
        L_0x011e:
            r0 = r13 & r17
            if (r0 != 0) goto L_0x011b
            r0 = r35
            boolean r17 = r11.F(r0)
            if (r17 == 0) goto L_0x012d
            r17 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x012f
        L_0x012d:
            r17 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x012f:
            r1 = r1 | r17
        L_0x0131:
            r17 = 306783379(0x12492493, float:6.34695E-28)
            r0 = r1 & r17
            r2 = 306783378(0x12492492, float:6.3469493E-28)
            if (r0 != r2) goto L_0x0149
            boolean r0 = r11.l()
            if (r0 != 0) goto L_0x0142
            goto L_0x0149
        L_0x0142:
            r11.L()
            r3 = r11
            r11 = r5
            goto L_0x01dc
        L_0x0149:
            r0 = 0
            if (r4 == 0) goto L_0x014f
            r17 = r0
            goto L_0x0151
        L_0x014f:
            r17 = r5
        L_0x0151:
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x0160
            r2 = -1
            java.lang.String r3 = "net.ikea.skapa.ui.components.DotsAndTagLayout (ShoppableImage.kt:280)"
            r4 = 88697566(0x5496ade, float:9.470603E-36)
            U0.C4895p.S(r4, r1, r2, r3)
        L_0x0160:
            U0.I0 r1 = androidx.compose.ui.platform.C5100f0.k()
            java.lang.Object r1 = r11.Q(r1)
            r2 = r1
            c2.t r2 = (c2.t) r2
            r1 = -1929337143(0xffffffff8d00a6c9, float:-3.9643806E-31)
            r11.W(r1)
            java.lang.Object r1 = r11.D()
            U0.m$a r3 = U0.C4889m.f14007a
            java.lang.Object r3 = r3.a()
            if (r1 != r3) goto L_0x0187
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r3 = 2
            U0.r0 r1 = U0.u1.e(r1, r0, r3, r0)
            r11.u(r1)
        L_0x0187:
            r16 = r1
            U0.r0 r16 = (U0.C4899r0) r16
            r11.P()
            U0.I0 r0 = androidx.compose.ui.platform.C5100f0.k()
            c2.t r1 = c2.t.Ltr
            U0.J0 r5 = r0.d(r1)
            wK.u9$a r3 = new wK.u9$a
            r0 = r3
            r1 = r26
            r18 = r3
            r3 = r31
            r19 = r5
            r5 = r24
            r6 = r27
            r8 = r29
            r10 = r23
            r20 = r11
            r11 = r17
            r12 = r25
            r13 = r34
            r14 = r35
            r15 = r16
            r0.<init>(r1, r2, r3, r5, r6, r8, r10, r11, r12, r13, r14, r15)
            r0 = 54
            r1 = -1221873762(0xffffffffb72baf9e, float:-1.0233283E-5)
            r2 = 1
            r4 = r18
            r3 = r20
            c1.a r0 = c1.c.e(r1, r2, r4, r3, r0)
            int r1 = U0.J0.f13770i
            r1 = r1 | 48
            r2 = r19
            U0.C4910x.a(r2, r0, r3, r1)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x01da
            U0.C4895p.R()
        L_0x01da:
            r11 = r17
        L_0x01dc:
            U0.Y0 r15 = r3.n()
            if (r15 == 0) goto L_0x0209
            wK.o9 r14 = new wK.o9
            r0 = r14
            r1 = r23
            r2 = r24
            r3 = r25
            r4 = r26
            r5 = r27
            r7 = r29
            r9 = r31
            r12 = r34
            r13 = r35
            r21 = r14
            r14 = r37
            r22 = r15
            r15 = r38
            r0.<init>(r1, r2, r3, r4, r5, r7, r9, r11, r12, r13, r14, r15)
            r1 = r21
            r0 = r22
            r0.a(r1)
        L_0x0209:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wK.C18507u9.o(wK.s7, java.util.List, java.lang.Object, wK.H9, long, long, long, nI.l, U0.A1, nI.l, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N p(C18481s7 s7Var, List list, Object obj, H9 h92, long j10, long j11, long j12, C17642l lVar, A1 a12, C17642l lVar2, int i10, int i11, C4889m mVar, int i12) {
        o(s7Var, list, obj, h92, j10, j11, j12, lVar, a12, lVar2, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:165:0x0431  */
    /* JADX WARNING: Removed duplicated region for block: B:167:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0122  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> void q(wK.C18339g9 r44, java.util.List<wK.C18351h9<T>> r45, androidx.compose.ui.d r46, T r47, boolean r48, wK.C18327f9 r49, nI.C17642l<? super java.util.List<? extends XH.v<wK.C18351h9<T>, ? extends wK.N2>>, XH.C16807N> r50, nI.C17642l<? super T, XH.C16807N> r51, U0.C4889m r52, int r53, int r54) {
        /*
            r12 = r44
            r13 = r45
            r0 = r47
            r14 = r51
            r15 = r53
            r11 = r54
            r1 = 128(0x80, float:1.794E-43)
            r2 = 16
            r3 = 32
            r4 = 6
            java.lang.String r5 = "imageParams"
            kotlin.jvm.internal.C17542s.j(r12, r5)
            java.lang.String r5 = "products"
            kotlin.jvm.internal.C17542s.j(r13, r5)
            java.lang.String r5 = "onSelected"
            kotlin.jvm.internal.C17542s.j(r14, r5)
            r5 = 1532415346(0x5b56cd72, float:6.0461535E16)
            r6 = r52
            U0.m r10 = r6.k(r5)
            r9 = 1
            r6 = r11 & 1
            r7 = 4
            r8 = 2
            if (r6 == 0) goto L_0x0035
            r6 = r15 | 6
            goto L_0x0045
        L_0x0035:
            r6 = r15 & 6
            if (r6 != 0) goto L_0x0044
            boolean r6 = r10.V(r12)
            if (r6 == 0) goto L_0x0041
            r6 = r7
            goto L_0x0042
        L_0x0041:
            r6 = r8
        L_0x0042:
            r6 = r6 | r15
            goto L_0x0045
        L_0x0044:
            r6 = r15
        L_0x0045:
            r16 = r11 & 2
            if (r16 == 0) goto L_0x004c
            r6 = r6 | 48
            goto L_0x005d
        L_0x004c:
            r16 = r15 & 48
            if (r16 != 0) goto L_0x005d
            boolean r16 = r10.F(r13)
            if (r16 == 0) goto L_0x0059
            r16 = r3
            goto L_0x005b
        L_0x0059:
            r16 = r2
        L_0x005b:
            r6 = r6 | r16
        L_0x005d:
            r16 = r11 & 4
            if (r16 == 0) goto L_0x0066
            r6 = r6 | 384(0x180, float:5.38E-43)
        L_0x0063:
            r7 = r46
            goto L_0x0079
        L_0x0066:
            r7 = r15 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x0063
            r7 = r46
            boolean r17 = r10.V(r7)
            if (r17 == 0) goto L_0x0075
            r17 = 256(0x100, float:3.59E-43)
            goto L_0x0077
        L_0x0075:
            r17 = r1
        L_0x0077:
            r6 = r6 | r17
        L_0x0079:
            r17 = r11 & 8
            if (r17 == 0) goto L_0x0080
            r6 = r6 | 3072(0xc00, float:4.305E-42)
            goto L_0x0099
        L_0x0080:
            r9 = r15 & 3072(0xc00, float:4.305E-42)
            if (r9 != 0) goto L_0x0099
            r9 = r15 & 4096(0x1000, float:5.74E-42)
            if (r9 != 0) goto L_0x008d
            boolean r9 = r10.V(r0)
            goto L_0x0091
        L_0x008d:
            boolean r9 = r10.F(r0)
        L_0x0091:
            if (r9 == 0) goto L_0x0096
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x0098
        L_0x0096:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x0098:
            r6 = r6 | r9
        L_0x0099:
            r2 = r2 & r11
            if (r2 == 0) goto L_0x00a1
            r6 = r6 | 24576(0x6000, float:3.4438E-41)
        L_0x009e:
            r9 = r48
            goto L_0x00b4
        L_0x00a1:
            r9 = r15 & 24576(0x6000, float:3.4438E-41)
            if (r9 != 0) goto L_0x009e
            r9 = r48
            boolean r18 = r10.b(r9)
            if (r18 == 0) goto L_0x00b0
            r18 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00b2
        L_0x00b0:
            r18 = 8192(0x2000, float:1.14794E-41)
        L_0x00b2:
            r6 = r6 | r18
        L_0x00b4:
            r3 = r3 & r11
            r18 = 196608(0x30000, float:2.75506E-40)
            if (r3 == 0) goto L_0x00be
            r6 = r6 | r18
            r8 = r49
            goto L_0x00d1
        L_0x00be:
            r18 = r15 & r18
            r8 = r49
            if (r18 != 0) goto L_0x00d1
            boolean r19 = r10.V(r8)
            if (r19 == 0) goto L_0x00cd
            r19 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00cf
        L_0x00cd:
            r19 = 65536(0x10000, float:9.18355E-41)
        L_0x00cf:
            r6 = r6 | r19
        L_0x00d1:
            r19 = r11 & 64
            r20 = 1572864(0x180000, float:2.204052E-39)
            if (r19 == 0) goto L_0x00dc
            r6 = r6 | r20
            r4 = r50
            goto L_0x00ef
        L_0x00dc:
            r20 = r15 & r20
            r4 = r50
            if (r20 != 0) goto L_0x00ef
            boolean r21 = r10.F(r4)
            if (r21 == 0) goto L_0x00eb
            r21 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00ed
        L_0x00eb:
            r21 = 524288(0x80000, float:7.34684E-40)
        L_0x00ed:
            r6 = r6 | r21
        L_0x00ef:
            r1 = r1 & r11
            r21 = 12582912(0xc00000, float:1.7632415E-38)
            if (r1 == 0) goto L_0x00f7
            r6 = r6 | r21
            goto L_0x0107
        L_0x00f7:
            r1 = r15 & r21
            if (r1 != 0) goto L_0x0107
            boolean r1 = r10.F(r14)
            if (r1 == 0) goto L_0x0104
            r1 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0106
        L_0x0104:
            r1 = 4194304(0x400000, float:5.877472E-39)
        L_0x0106:
            r6 = r6 | r1
        L_0x0107:
            r1 = 4793491(0x492493, float:6.717112E-39)
            r1 = r1 & r6
            r5 = 4793490(0x492492, float:6.71711E-39)
            if (r1 != r5) goto L_0x0122
            boolean r1 = r10.l()
            if (r1 != 0) goto L_0x0117
            goto L_0x0122
        L_0x0117:
            r10.L()
            r3 = r7
            r6 = r8
            r5 = r9
            r13 = r10
            r7 = r4
            r4 = r0
            goto L_0x042b
        L_0x0122:
            if (r16 == 0) goto L_0x0127
            androidx.compose.ui.d$a r1 = androidx.compose.ui.d.f18749a
            r7 = r1
        L_0x0127:
            r5 = 0
            if (r17 == 0) goto L_0x012d
            r26 = r5
            goto L_0x012f
        L_0x012d:
            r26 = r0
        L_0x012f:
            if (r2 == 0) goto L_0x0134
            r27 = 1
            goto L_0x0136
        L_0x0134:
            r27 = r9
        L_0x0136:
            if (r3 == 0) goto L_0x013b
            r28 = r5
            goto L_0x013d
        L_0x013b:
            r28 = r8
        L_0x013d:
            if (r19 == 0) goto L_0x0142
            r29 = r5
            goto L_0x0144
        L_0x0142:
            r29 = r4
        L_0x0144:
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0153
            r0 = -1
            java.lang.String r1 = "net.ikea.skapa.ui.components.ShoppableImage (ShoppableImage.kt:98)"
            r2 = 1532415346(0x5b56cd72, float:6.0461535E16)
            U0.C4895p.S(r2, r6, r0, r1)
        L_0x0153:
            r0 = 926933149(0x373fe09d, float:1.1436784E-5)
            r10.W(r0)
            java.lang.Object r0 = r10.D()
            U0.m$a r8 = U0.C4889m.f14007a
            java.lang.Object r1 = r8.a()
            if (r0 != r1) goto L_0x016d
            wK.s7 r0 = new wK.s7
            r0.<init>()
            r10.u(r0)
        L_0x016d:
            r9 = r0
            wK.s7 r9 = (wK.C18481s7) r9
            r10.P()
            r0 = 926935455(0x373fe99f, float:1.1438881E-5)
            r10.W(r0)
            java.lang.Object r0 = r10.D()
            java.lang.Object r1 = r8.a()
            if (r0 != r1) goto L_0x018a
            r0.m r0 = r0.l.a()
            r10.u(r0)
        L_0x018a:
            r4 = r0
            r0.m r4 = (r0.m) r4
            r10.P()
            r0 = 6
            U0.A1 r16 = r0.C5814f.a(r4, r10, r0)
            U0.A1 r39 = r0.i.a(r4, r10, r0)
            r0 = 926941793(0x37400261, float:1.1444646E-5)
            r10.W(r0)
            java.lang.Object r0 = r10.D()
            java.lang.Object r1 = r8.a()
            if (r0 != r1) goto L_0x01bb
            c2.r$a r0 = c2.r.f23053b
            long r0 = r0.a()
            c2.r r0 = c2.r.b(r0)
            r1 = 2
            U0.r0 r0 = U0.u1.e(r0, r5, r1, r5)
            r10.u(r0)
        L_0x01bb:
            r3 = r0
            U0.r0 r3 = (U0.C4899r0) r3
            r10.P()
            r0 = 926943941(0x37400ac5, float:1.1446599E-5)
            r10.W(r0)
            java.lang.Object r0 = r10.D()
            java.lang.Object r1 = r8.a()
            if (r0 != r1) goto L_0x01e3
            o1.m$a r0 = o1.C5673m.f26722b
            long r0 = r0.a()
            o1.m r0 = o1.C5673m.c(r0)
            r1 = 2
            U0.r0 r0 = U0.u1.e(r0, r5, r1, r5)
            r10.u(r0)
        L_0x01e3:
            r2 = r0
            U0.r0 r2 = (U0.C4899r0) r2
            r10.P()
            r0 = 926947461(0x37401885, float:1.1449801E-5)
            r10.W(r0)
            java.lang.Object r0 = r10.D()
            java.lang.Object r1 = r8.a()
            if (r0 != r1) goto L_0x020b
            o1.m$a r0 = o1.C5673m.f26722b
            long r0 = r0.a()
            o1.m r0 = o1.C5673m.c(r0)
            r1 = 2
            U0.r0 r0 = U0.u1.e(r0, r5, r1, r5)
            r10.u(r0)
        L_0x020b:
            r40 = r0
            U0.r0 r40 = (U0.C4899r0) r40
            r10.P()
            r0 = 926951648(0x374028e0, float:1.1453609E-5)
            r10.W(r0)
            java.lang.Object r0 = r10.D()
            java.lang.Object r1 = r8.a()
            if (r0 != r1) goto L_0x0234
            o1.g$a r0 = o1.C5667g.f26701b
            long r0 = r0.c()
            o1.g r0 = o1.C5667g.d(r0)
            r1 = 2
            U0.r0 r0 = U0.u1.e(r0, r5, r1, r5)
            r10.u(r0)
        L_0x0234:
            r41 = r0
            U0.r0 r41 = (U0.C4899r0) r41
            r10.P()
            r0 = 926954195(0x374032d3, float:1.1455925E-5)
            r10.W(r0)
            java.lang.Object r0 = r10.D()
            java.lang.Object r1 = r8.a()
            if (r0 != r1) goto L_0x0253
            wK.i9 r0 = new wK.i9
            r0.<init>()
            r10.u(r0)
        L_0x0253:
            nI.l r0 = (nI.C17642l) r0
            r10.P()
            r1 = 0
            r46 = r4
            r4 = 1
            androidx.compose.ui.d r0 = L1.o.d(r7, r1, r0, r4, r5)
            i1.c$a r4 = i1.C5437c.f24302a
            i1.c r4 = r4.o()
            E1.I r4 = androidx.compose.foundation.layout.C5077h.h(r4, r1)
            int r17 = U0.C4883j.a(r10, r1)
            U0.y r5 = r10.s()
            androidx.compose.ui.d r0 = androidx.compose.ui.c.e(r10, r0)
            G1.g$a r20 = G1.C4504g.f6515W
            nI.a r1 = r20.a()
            U0.f r21 = r10.m()
            if (r21 != 0) goto L_0x0285
            U0.C4883j.c()
        L_0x0285:
            r10.I()
            boolean r21 = r10.i()
            if (r21 == 0) goto L_0x0292
            r10.p(r1)
            goto L_0x0295
        L_0x0292:
            r10.t()
        L_0x0295:
            U0.m r1 = U0.F1.a(r10)
            r42 = r7
            nI.p r7 = r20.c()
            U0.F1.c(r1, r4, r7)
            nI.p r4 = r20.e()
            U0.F1.c(r1, r5, r4)
            nI.p r4 = r20.b()
            boolean r5 = r1.i()
            if (r5 != 0) goto L_0x02c1
            java.lang.Object r5 = r1.D()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r17)
            boolean r5 = kotlin.jvm.internal.C17542s.e(r5, r7)
            if (r5 != 0) goto L_0x02cf
        L_0x02c1:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r17)
            r1.u(r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r17)
            r1.w(r5, r4)
        L_0x02cf:
            nI.p r4 = r20.d()
            U0.F1.c(r1, r0, r4)
            androidx.compose.foundation.layout.j r0 = androidx.compose.foundation.layout.C5079j.f18125a
            r0 = 2023536865(0x789cb8e1, float:2.5429628E34)
            r10.W(r0)
            java.lang.Object r0 = r10.D()
            java.lang.Object r1 = r8.a()
            if (r0 != r1) goto L_0x02fb
            r1 = 0
            long r4 = c2.s.a(r1, r1)
            c2.r r0 = c2.r.b(r4)
            r1 = 2
            r5 = 0
            U0.r0 r0 = U0.u1.e(r0, r5, r1, r5)
            r10.u(r0)
            goto L_0x02fc
        L_0x02fb:
            r5 = 0
        L_0x02fc:
            r43 = r0
            U0.r0 r43 = (U0.C4899r0) r43
            r10.P()
            t1.c r7 = r44.d()
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            r1 = 0
            r4 = 1
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.J.h(r0, r1, r4, r5)
            wK.H9 r1 = r44.a()
            float r1 = r1.b()
            r4 = 2
            r11 = 0
            androidx.compose.ui.d r4 = androidx.compose.foundation.layout.C5074e.b(r0, r1, r11, r4, r5)
            r0 = 2023546540(0x789cdeac, float:2.5453582E34)
            r10.W(r0)
            r0 = r6 & 14
            r1 = 4
            if (r0 != r1) goto L_0x032a
            r0 = 1
            goto L_0x032b
        L_0x032a:
            r0 = r11
        L_0x032b:
            java.lang.Object r1 = r10.D()
            if (r0 != 0) goto L_0x033f
            java.lang.Object r0 = r8.a()
            if (r1 != r0) goto L_0x0338
            goto L_0x033f
        L_0x0338:
            r17 = r46
            r12 = r5
            r52 = r6
            r6 = r4
            goto L_0x0356
        L_0x033f:
            wK.j9 r1 = new wK.j9
            r0 = r1
            r11 = r1
            r1 = r44
            r17 = r46
            r52 = r6
            r6 = r4
            r4 = r40
            r12 = r5
            r5 = r41
            r0.<init>(r1, r2, r3, r4, r5)
            r10.u(r11)
            r1 = r11
        L_0x0356:
            nI.l r1 = (nI.C17642l) r1
            r10.P()
            androidx.compose.ui.d r30 = androidx.compose.ui.layout.c.a(r6, r1)
            L1.i$a r0 = L1.i.f8936b
            int r0 = r0.a()
            L1.i r35 = L1.i.h(r0)
            nI.a r36 = r44.c()
            r37 = 12
            r38 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r31 = r17
            androidx.compose.ui.d r30 = androidx.compose.foundation.d.b(r30, r31, r32, r33, r34, r35, r36, r37, r38)
            zK.g r34 = zK.C18762g.Static
            r37 = 38
            r32 = 0
            r33 = 0
            r35 = 1
            r36 = 0
            r31 = r16
            androidx.compose.ui.d r0 = zK.C18756a.d(r30, r31, r32, r33, r34, r35, r36, r37, r38)
            r1 = 2023598766(0x789daaae, float:2.5582888E34)
            r10.W(r1)
            java.lang.Object r1 = r10.D()
            java.lang.Object r2 = r8.a()
            if (r1 != r2) goto L_0x03a7
            wK.k9 r1 = new wK.k9
            r1.<init>()
            r10.u(r1)
        L_0x03a7:
            nI.l r1 = (nI.C17642l) r1
            r10.P()
            r2 = 0
            r11 = 1
            androidx.compose.ui.d r18 = L1.o.d(r0, r2, r1, r11, r12)
            java.lang.String r17 = r44.b()
            E1.k$a r0 = E1.C4478k.f5915a
            E1.k r20 = r0.a()
            r24 = 24576(0x6000, float:3.4438E-41)
            r25 = 104(0x68, float:1.46E-43)
            r19 = 0
            r21 = 0
            r22 = 0
            r16 = r7
            r23 = r10
            n0.C5583F.a(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r0 = 2023605198(0x789dc3ce, float:2.5598812E34)
            r10.W(r0)
            r10.P()
            wK.u9$b r12 = new wK.u9$b
            r0 = r12
            r1 = r9
            r2 = r45
            r3 = r26
            r4 = r44
            r5 = r29
            r16 = r52
            r6 = r39
            r23 = r42
            r7 = r51
            r8 = r16
            r9 = r40
            r13 = r10
            r10 = r41
            r14 = r11
            r11 = r43
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r0 = 54
            r1 = 2090949910(0x7ca15d16, float:6.7027824E36)
            c1.a r19 = c1.c.e(r1, r14, r12, r13, r0)
            int r0 = r16 >> 9
            r0 = r0 & 112(0x70, float:1.57E-43)
            r0 = r0 | 3072(0xc00, float:4.305E-42)
            r22 = 5
            r16 = 0
            r18 = 0
            r17 = r27
            r20 = r13
            r21 = r0
            k(r16, r17, r18, r19, r20, r21, r22)
            r13.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0421
            U0.C4895p.R()
        L_0x0421:
            r3 = r23
            r4 = r26
            r5 = r27
            r6 = r28
            r7 = r29
        L_0x042b:
            U0.Y0 r11 = r13.n()
            if (r11 == 0) goto L_0x0444
            wK.l9 r12 = new wK.l9
            r0 = r12
            r1 = r44
            r2 = r45
            r8 = r51
            r9 = r53
            r10 = r54
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.a(r12)
        L_0x0444:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wK.C18507u9.q(wK.g9, java.util.List, androidx.compose.ui.d, java.lang.Object, boolean, wK.f9, nI.l, nI.l, U0.m, int, int):void");
    }

    private static final void r(C4899r0<C5673m> r0Var, long j10) {
        r0Var.setValue(C5673m.c(j10));
    }

    /* access modifiers changed from: private */
    public static final long s(C4899r0<C5667g> r0Var) {
        return r0Var.getValue().v();
    }

    private static final void t(C4899r0<C5667g> r0Var, long j10) {
        r0Var.setValue(C5667g.d(j10));
    }

    /* access modifiers changed from: private */
    public static final C16807N u(x xVar) {
        C17542s.j(xVar, "$this$semantics");
        L1.v.A0(xVar, true);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final long v(C4899r0<r> r0Var) {
        return r0Var.getValue().k();
    }

    /* access modifiers changed from: private */
    public static final C16807N w(C18339g9 g9Var, C4899r0 r0Var, C4899r0 r0Var2, C4899r0 r0Var3, C4899r0 r0Var4, C4488v vVar) {
        C17542s.j(vVar, "layoutCoordinates");
        long a10 = vVar.a();
        long h10 = g9Var.d().h();
        if (!C5673m.h(h10, C5673m.f26722b.a()) && (!C5673m.h(h10, B(r0Var)) || !r.f(a10, z(r0Var2)))) {
            C(r0Var, h10);
            A(r0Var2, a10);
            float max = Math.max(((float) r.h(z(r0Var2))) / C5673m.l(B(r0Var)), ((float) r.g(z(r0Var2))) / C5673m.i(B(r0Var)));
            r(r0Var3, C5674n.a(C5673m.l(B(r0Var)) * max, C5673m.i(B(r0Var)) * max));
            float f10 = (float) 2;
            t(r0Var4, C5668h.a((C5673m.l(D(r0Var3)) - ((float) r.h(z(r0Var2)))) / f10, (C5673m.i(D(r0Var3)) - ((float) r.g(z(r0Var2)))) / f10));
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N x(x xVar) {
        C17542s.j(xVar, "$this$semantics");
        L1.v.B0(xVar, 0.0f);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N y(C18339g9 g9Var, List list, androidx.compose.ui.d dVar, Object obj, boolean z10, C18327f9 f9Var, C17642l lVar, C17642l lVar2, int i10, int i11, C4889m mVar, int i12) {
        q(g9Var, list, dVar, obj, z10, f9Var, lVar, lVar2, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    private static final long z(C4899r0<r> r0Var) {
        return r0Var.getValue().k();
    }
}
