package androidx.compose.foundation.layout;

import E1.C4484q;
import E1.H;
import E1.J;
import E1.K;
import E1.O;
import E1.a0;
import E1.r;
import XH.C16807N;
import YH.C16877v;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.q;
import c2.C5267b;
import j0.C5456l;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import nI.q;
import s0.C5830A;
import s0.C5833D;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\r\b\b\u0018\u00002\u00020\u00012\u00020\u0002BO\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J2\u0010\u001c\u001a\u00020\u001b*\u00020\u00152\u0012\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u00162\u0006\u0010\u001a\u001a\u00020\u0019H\u0016ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ/\u0010!\u001a\u00020\u000e*\u00020\u001e2\u0012\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00160\u00162\u0006\u0010 \u001a\u00020\u000eH\u0016¢\u0006\u0004\b!\u0010\"J/\u0010$\u001a\u00020\u000e*\u00020\u001e2\u0012\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00160\u00162\u0006\u0010#\u001a\u00020\u000eH\u0016¢\u0006\u0004\b$\u0010\"J/\u0010%\u001a\u00020\u000e*\u00020\u001e2\u0012\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00160\u00162\u0006\u0010#\u001a\u00020\u000eH\u0016¢\u0006\u0004\b%\u0010\"J/\u0010&\u001a\u00020\u000e*\u00020\u001e2\u0012\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00160\u00162\u0006\u0010 \u001a\u00020\u000eH\u0016¢\u0006\u0004\b&\u0010\"JK\u0010)\u001a\u00020\u000e2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00162\u0006\u0010'\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b)\u0010*J+\u0010,\u001a\u00020\u000e2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00162\u0006\u0010 \u001a\u00020\u000e2\u0006\u0010+\u001a\u00020\u000e¢\u0006\u0004\b,\u0010-JK\u0010/\u001a\u00020\u000e2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00162\u0006\u0010.\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b/\u0010*J\u0010\u00101\u001a\u000200HÖ\u0001¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b3\u00104J\u001a\u00107\u001a\u00020\u00032\b\u00106\u001a\u0004\u0018\u000105HÖ\u0003¢\u0006\u0004\b7\u00108R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0004¢\u0006\f\n\u0004\b!\u00109\u001a\u0004\b:\u0010;R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u001a\u0010\n\u001a\u00020\t8\u0002X\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b&\u0010DR\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0004¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u001a\u0010\r\u001a\u00020\t8\u0002X\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b:\u0010DR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010JR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010KR/\u0010P\u001a\u001a\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0L8\u0006¢\u0006\f\n\u0004\b$\u0010M\u001a\u0004\bN\u0010OR/\u0010S\u001a\u001a\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0L8\u0006¢\u0006\f\n\u0004\bQ\u0010M\u001a\u0004\bR\u0010OR/\u0010U\u001a\u001a\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0L8\u0006¢\u0006\f\n\u0004\bG\u0010M\u001a\u0004\bT\u0010OR/\u0010X\u001a\u001a\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0L8\u0006¢\u0006\f\n\u0004\bV\u0010M\u001a\u0004\bW\u0010O\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Y"}, d2 = {"Landroidx/compose/foundation/layout/t;", "LE1/O;", "Landroidx/compose/foundation/layout/s;", "", "isHorizontal", "Landroidx/compose/foundation/layout/d$e;", "horizontalArrangement", "Landroidx/compose/foundation/layout/d$m;", "verticalArrangement", "Lc2/h;", "mainAxisSpacing", "Landroidx/compose/foundation/layout/m;", "crossAxisAlignment", "crossAxisArrangementSpacing", "", "maxItemsInMainAxis", "maxLines", "Landroidx/compose/foundation/layout/r;", "overflow", "<init>", "(ZLandroidx/compose/foundation/layout/d$e;Landroidx/compose/foundation/layout/d$m;FLandroidx/compose/foundation/layout/m;FIILandroidx/compose/foundation/layout/r;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "LE1/K;", "", "LE1/H;", "measurables", "Lc2/b;", "constraints", "LE1/J;", "i", "(LE1/K;Ljava/util/List;J)LE1/J;", "LE1/r;", "LE1/q;", "height", "a", "(LE1/r;Ljava/util/List;I)I", "width", "j", "h", "d", "crossAxisAvailable", "crossAxisSpacing", "s", "(Ljava/util/List;IIIIILandroidx/compose/foundation/layout/r;)I", "arrangementSpacing", "r", "(Ljava/util/List;II)I", "mainAxisAvailable", "q", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "f", "()Z", "b", "Landroidx/compose/foundation/layout/d$e;", "n", "()Landroidx/compose/foundation/layout/d$e;", "c", "Landroidx/compose/foundation/layout/d$m;", "o", "()Landroidx/compose/foundation/layout/d$m;", "F", "e", "Landroidx/compose/foundation/layout/m;", "l", "()Landroidx/compose/foundation/layout/m;", "g", "I", "Landroidx/compose/foundation/layout/r;", "Lkotlin/Function3;", "LnI/q;", "getMaxMainAxisIntrinsicItemSize", "()LnI/q;", "maxMainAxisIntrinsicItemSize", "k", "getMaxCrossAxisIntrinsicItemSize", "maxCrossAxisIntrinsicItemSize", "getMinCrossAxisIntrinsicItemSize", "minCrossAxisIntrinsicItemSize", "m", "getMinMainAxisIntrinsicItemSize", "minMainAxisIntrinsicItemSize", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class t implements O, s {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f18211a;

    /* renamed from: b  reason: collision with root package name */
    private final C5073d.e f18212b;

    /* renamed from: c  reason: collision with root package name */
    private final C5073d.m f18213c;

    /* renamed from: d  reason: collision with root package name */
    private final float f18214d;

    /* renamed from: e  reason: collision with root package name */
    private final C5082m f18215e;

    /* renamed from: f  reason: collision with root package name */
    private final float f18216f;

    /* renamed from: g  reason: collision with root package name */
    private final int f18217g;

    /* renamed from: h  reason: collision with root package name */
    private final int f18218h;

    /* renamed from: i  reason: collision with root package name */
    private final r f18219i;

    /* renamed from: j  reason: collision with root package name */
    private final q<C4484q, Integer, Integer, Integer> f18220j;

    /* renamed from: k  reason: collision with root package name */
    private final q<C4484q, Integer, Integer, Integer> f18221k;

    /* renamed from: l  reason: collision with root package name */
    private final q<C4484q, Integer, Integer, Integer> f18222l;

    /* renamed from: m  reason: collision with root package name */
    private final q<C4484q, Integer, Integer, Integer> f18223m;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LE1/q;", "", "<anonymous parameter 0>", "w", "a", "(LE1/q;II)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements q<C4484q, Integer, Integer, Integer> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f18224c = new a();

        a() {
            super(3);
        }

        public final Integer a(C4484q qVar, int i10, int i11) {
            return Integer.valueOf(qVar.x(i11));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((C4484q) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LE1/q;", "", "<anonymous parameter 0>", "h", "a", "(LE1/q;II)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class b extends C17544u implements q<C4484q, Integer, Integer, Integer> {

        /* renamed from: c  reason: collision with root package name */
        public static final b f18225c = new b();

        b() {
            super(3);
        }

        public final Integer a(C4484q qVar, int i10, int i11) {
            return Integer.valueOf(qVar.h0(i11));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((C4484q) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LE1/q;", "", "<anonymous parameter 0>", "h", "a", "(LE1/q;II)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class c extends C17544u implements q<C4484q, Integer, Integer, Integer> {

        /* renamed from: c  reason: collision with root package name */
        public static final c f18226c = new c();

        c() {
            super(3);
        }

        public final Integer a(C4484q qVar, int i10, int i11) {
            return Integer.valueOf(qVar.h0(i11));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((C4484q) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LE1/q;", "", "<anonymous parameter 0>", "w", "a", "(LE1/q;II)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class d extends C17544u implements q<C4484q, Integer, Integer, Integer> {

        /* renamed from: c  reason: collision with root package name */
        public static final d f18227c = new d();

        d() {
            super(3);
        }

        public final Integer a(C4484q qVar, int i10, int i11) {
            return Integer.valueOf(qVar.x(i11));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((C4484q) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LE1/a0$a;", "LXH/N;", "a", "(LE1/a0$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class e extends C17544u implements C17642l<a0.a, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public static final e f18228c = new e();

        e() {
            super(1);
        }

        public final void a(a0.a aVar) {
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((a0.a) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LE1/a0$a;", "LXH/N;", "a", "(LE1/a0$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class f extends C17544u implements C17642l<a0.a, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public static final f f18229c = new f();

        f() {
            super(1);
        }

        public final void a(a0.a aVar) {
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((a0.a) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LE1/q;", "", "<anonymous parameter 0>", "w", "a", "(LE1/q;II)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class g extends C17544u implements q<C4484q, Integer, Integer, Integer> {

        /* renamed from: c  reason: collision with root package name */
        public static final g f18230c = new g();

        g() {
            super(3);
        }

        public final Integer a(C4484q qVar, int i10, int i11) {
            return Integer.valueOf(qVar.V(i11));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((C4484q) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LE1/q;", "", "<anonymous parameter 0>", "h", "a", "(LE1/q;II)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class h extends C17544u implements q<C4484q, Integer, Integer, Integer> {

        /* renamed from: c  reason: collision with root package name */
        public static final h f18231c = new h();

        h() {
            super(3);
        }

        public final Integer a(C4484q qVar, int i10, int i11) {
            return Integer.valueOf(qVar.g0(i11));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((C4484q) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LE1/q;", "", "<anonymous parameter 0>", "h", "a", "(LE1/q;II)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class i extends C17544u implements q<C4484q, Integer, Integer, Integer> {

        /* renamed from: c  reason: collision with root package name */
        public static final i f18232c = new i();

        i() {
            super(3);
        }

        public final Integer a(C4484q qVar, int i10, int i11) {
            return Integer.valueOf(qVar.g0(i11));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((C4484q) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LE1/q;", "", "<anonymous parameter 0>", "w", "a", "(LE1/q;II)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class j extends C17544u implements q<C4484q, Integer, Integer, Integer> {

        /* renamed from: c  reason: collision with root package name */
        public static final j f18233c = new j();

        j() {
            super(3);
        }

        public final Integer a(C4484q qVar, int i10, int i11) {
            return Integer.valueOf(qVar.V(i11));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((C4484q) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
        }
    }

    public /* synthetic */ t(boolean z10, C5073d.e eVar, C5073d.m mVar, float f10, C5082m mVar2, float f11, int i10, int i11, r rVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, eVar, mVar, f10, mVar2, f11, i10, i11, rVar);
    }

    public int a(r rVar, List<? extends List<? extends C4484q>> list, int i10) {
        r rVar2 = this.f18219i;
        List list2 = (List) C16877v.z0(list, 1);
        C4484q qVar = null;
        C4484q qVar2 = list2 != null ? (C4484q) C16877v.y0(list2) : null;
        List list3 = (List) C16877v.z0(list, 2);
        if (list3 != null) {
            qVar = (C4484q) C16877v.y0(list3);
        }
        rVar2.l(qVar2, qVar, f(), c2.c.b(0, 0, 0, i10, 7, (Object) null));
        if (f()) {
            List list4 = (List) C16877v.y0(list);
            if (list4 == null) {
                list4 = C16877v.n();
            }
            return s(list4, i10, rVar.K0(this.f18214d), rVar.K0(this.f18216f), this.f18217g, this.f18218h, this.f18219i);
        }
        List list5 = (List) C16877v.y0(list);
        if (list5 == null) {
            list5 = C16877v.n();
        }
        return q(list5, i10, rVar.K0(this.f18214d), rVar.K0(this.f18216f), this.f18217g, this.f18218h, this.f18219i);
    }

    public int d(r rVar, List<? extends List<? extends C4484q>> list, int i10) {
        r rVar2 = this.f18219i;
        List list2 = (List) C16877v.z0(list, 1);
        C4484q qVar = null;
        C4484q qVar2 = list2 != null ? (C4484q) C16877v.y0(list2) : null;
        List list3 = (List) C16877v.z0(list, 2);
        if (list3 != null) {
            qVar = (C4484q) C16877v.y0(list3);
        }
        rVar2.l(qVar2, qVar, f(), c2.c.b(0, 0, 0, i10, 7, (Object) null));
        if (f()) {
            List list4 = (List) C16877v.y0(list);
            if (list4 == null) {
                list4 = C16877v.n();
            }
            return r(list4, i10, rVar.K0(this.f18214d));
        }
        List list5 = (List) C16877v.y0(list);
        if (list5 == null) {
            list5 = C16877v.n();
        }
        return q(list5, i10, rVar.K0(this.f18214d), rVar.K0(this.f18216f), this.f18217g, this.f18218h, this.f18219i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f18211a == tVar.f18211a && C17542s.e(this.f18212b, tVar.f18212b) && C17542s.e(this.f18213c, tVar.f18213c) && c2.h.D(this.f18214d, tVar.f18214d) && C17542s.e(this.f18215e, tVar.f18215e) && c2.h.D(this.f18216f, tVar.f18216f) && this.f18217g == tVar.f18217g && this.f18218h == tVar.f18218h && C17542s.e(this.f18219i, tVar.f18219i);
    }

    public boolean f() {
        return this.f18211a;
    }

    public int h(r rVar, List<? extends List<? extends C4484q>> list, int i10) {
        r rVar2 = this.f18219i;
        List list2 = (List) C16877v.z0(list, 1);
        C4484q qVar = null;
        C4484q qVar2 = list2 != null ? (C4484q) C16877v.y0(list2) : null;
        List list3 = (List) C16877v.z0(list, 2);
        if (list3 != null) {
            qVar = (C4484q) C16877v.y0(list3);
        }
        rVar2.l(qVar2, qVar, f(), c2.c.b(0, i10, 0, 0, 13, (Object) null));
        if (f()) {
            List list4 = (List) C16877v.y0(list);
            if (list4 == null) {
                list4 = C16877v.n();
            }
            return q(list4, i10, rVar.K0(this.f18214d), rVar.K0(this.f18216f), this.f18217g, this.f18218h, this.f18219i);
        }
        List list5 = (List) C16877v.y0(list);
        if (list5 == null) {
            list5 = C16877v.n();
        }
        return r(list5, i10, rVar.K0(this.f18214d));
    }

    public int hashCode() {
        return (((((((((((((((Boolean.hashCode(this.f18211a) * 31) + this.f18212b.hashCode()) * 31) + this.f18213c.hashCode()) * 31) + c2.h.E(this.f18214d)) * 31) + this.f18215e.hashCode()) * 31) + c2.h.E(this.f18216f)) * 31) + Integer.hashCode(this.f18217g)) * 31) + Integer.hashCode(this.f18218h)) * 31) + this.f18219i.hashCode();
    }

    public J i(K k10, List<? extends List<? extends H>> list, long j10) {
        List<? extends List<? extends H>> list2 = list;
        if (this.f18218h == 0 || this.f18217g == 0 || list.isEmpty() || (C5267b.k(j10) == 0 && this.f18219i.i() != q.a.Visible)) {
            return K.v0(k10, 0, 0, (Map) null, e.f18228c, 4, (Object) null);
        }
        List list3 = (List) C16877v.w0(list);
        if (list3.isEmpty()) {
            return K.v0(k10, 0, 0, (Map) null, f.f18229c, 4, (Object) null);
        }
        List list4 = (List) C16877v.z0(list2, 1);
        H h10 = list4 != null ? (H) C16877v.y0(list4) : null;
        List list5 = (List) C16877v.z0(list2, 2);
        H h11 = list5 != null ? (H) C16877v.y0(list5) : null;
        this.f18219i.j(list3.size());
        this.f18219i.m(this, h10, h11, j10);
        return p.e(k10, this, list3.iterator(), this.f18214d, this.f18216f, C5833D.c(j10, f() ? C5830A.Horizontal : C5830A.Vertical), this.f18217g, this.f18218h, this.f18219i);
    }

    public int j(r rVar, List<? extends List<? extends C4484q>> list, int i10) {
        r rVar2 = this.f18219i;
        List list2 = (List) C16877v.z0(list, 1);
        C4484q qVar = null;
        C4484q qVar2 = list2 != null ? (C4484q) C16877v.y0(list2) : null;
        List list3 = (List) C16877v.z0(list, 2);
        if (list3 != null) {
            qVar = (C4484q) C16877v.y0(list3);
        }
        rVar2.l(qVar2, qVar, f(), c2.c.b(0, i10, 0, 0, 13, (Object) null));
        if (f()) {
            List list4 = (List) C16877v.y0(list);
            if (list4 == null) {
                list4 = C16877v.n();
            }
            return q(list4, i10, rVar.K0(this.f18214d), rVar.K0(this.f18216f), this.f18217g, this.f18218h, this.f18219i);
        }
        List list5 = (List) C16877v.y0(list);
        if (list5 == null) {
            list5 = C16877v.n();
        }
        return s(list5, i10, rVar.K0(this.f18214d), rVar.K0(this.f18216f), this.f18217g, this.f18218h, this.f18219i);
    }

    public C5082m l() {
        return this.f18215e;
    }

    public C5073d.e n() {
        return this.f18212b;
    }

    public C5073d.m o() {
        return this.f18213c;
    }

    public final int q(List<? extends C4484q> list, int i10, int i11, int i12, int i13, int i14, r rVar) {
        return C5456l.e(p.g(list, this.f18223m, this.f18222l, i10, i11, i12, i13, i14, rVar));
    }

    public final int r(List<? extends C4484q> list, int i10, int i11) {
        return p.j(list, this.f18220j, i10, i11, this.f18217g);
    }

    public final int s(List<? extends C4484q> list, int i10, int i11, int i12, int i13, int i14, r rVar) {
        return p.l(list, this.f18223m, this.f18222l, i10, i11, i12, i13, i14, rVar);
    }

    public String toString() {
        return "FlowMeasurePolicy(isHorizontal=" + this.f18211a + ", horizontalArrangement=" + this.f18212b + ", verticalArrangement=" + this.f18213c + ", mainAxisSpacing=" + c2.h.F(this.f18214d) + ", crossAxisAlignment=" + this.f18215e + ", crossAxisArrangementSpacing=" + c2.h.F(this.f18216f) + ", maxItemsInMainAxis=" + this.f18217g + ", maxLines=" + this.f18218h + ", overflow=" + this.f18219i + ')';
    }

    private t(boolean z10, C5073d.e eVar, C5073d.m mVar, float f10, C5082m mVar2, float f11, int i10, int i11, r rVar) {
        nI.q<C4484q, Integer, Integer, Integer> qVar;
        nI.q<C4484q, Integer, Integer, Integer> qVar2;
        nI.q<C4484q, Integer, Integer, Integer> qVar3;
        nI.q<C4484q, Integer, Integer, Integer> qVar4;
        this.f18211a = z10;
        this.f18212b = eVar;
        this.f18213c = mVar;
        this.f18214d = f10;
        this.f18215e = mVar2;
        this.f18216f = f11;
        this.f18217g = i10;
        this.f18218h = i11;
        this.f18219i = rVar;
        if (f()) {
            qVar = c.f18226c;
        } else {
            qVar = d.f18227c;
        }
        this.f18220j = qVar;
        if (f()) {
            qVar2 = a.f18224c;
        } else {
            qVar2 = b.f18225c;
        }
        this.f18221k = qVar2;
        if (f()) {
            qVar3 = g.f18230c;
        } else {
            qVar3 = h.f18231c;
        }
        this.f18222l = qVar3;
        if (f()) {
            qVar4 = i.f18232c;
        } else {
            qVar4 = j.f18233c;
        }
        this.f18223m = qVar4;
    }
}
