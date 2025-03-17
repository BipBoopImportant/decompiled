package O0;

import E1.C4469b;
import E1.H;
import E1.I;
import E1.J;
import E1.K;
import E1.a0;
import G1.C4504g;
import N1.P;
import N1.Y;
import S0.y;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4910x;
import U0.C4912y;
import U0.F1;
import U0.J0;
import U0.Y0;
import XH.C16807N;
import Y1.j;
import Y1.k;
import androidx.compose.foundation.layout.C5070a;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5077h;
import androidx.compose.foundation.layout.C5079j;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
import androidx.compose.ui.d;
import androidx.recyclerview.widget.RecyclerView;
import c2.C5267b;
import com.google.ar.core.ImageMetadata;
import i1.C5437c;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import p1.C5747v0;
import p1.i1;
import s0.C5842M;
import s0.C5843N;
import s0.C5862h;
import tI.C17978n;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\u001a\u0001\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001aj\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u0014\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001aV\u0010\u001a\u001a\u00020\u00032\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH\u0003ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001aX\u0010\u001e\u001a\u00020\u00032\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\nH\u0003ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001b\"\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010 \"\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010 \"\u0014\u0010#\u001a\u00020\u001f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010 \"\u0014\u0010$\u001a\u00020\u001f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010 \"\u0014\u0010&\u001a\u00020\u001f8\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010 \"\u0014\u0010(\u001a\u00020\u001f8\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010 \"\u0014\u0010*\u001a\u00020\u001f8\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010 \"\u0014\u0010,\u001a\u00020\u001f8\u0002X\u0004¢\u0006\u0006\n\u0004\b+\u0010 \u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006-"}, d2 = {"Landroidx/compose/ui/d;", "modifier", "Lkotlin/Function0;", "LXH/N;", "action", "dismissAction", "", "actionOnNewLine", "Lp1/i1;", "shape", "Lp1/v0;", "containerColor", "contentColor", "actionContentColor", "dismissActionContentColor", "content", "c", "(Landroidx/compose/ui/d;LnI/p;LnI/p;ZLp1/i1;JJJJLnI/p;LU0/m;II)V", "LO0/H0;", "snackbarData", "actionColor", "d", "(LO0/H0;Landroidx/compose/ui/d;ZLp1/i1;JJJJJLU0/m;II)V", "text", "LN1/Y;", "actionTextStyle", "a", "(LnI/p;LnI/p;LnI/p;LN1/Y;JJLU0/m;I)V", "actionTextColor", "dismissActionColor", "b", "Lc2/h;", "F", "ContainerMaxWidth", "HeightToFirstLine", "HorizontalSpacing", "HorizontalSpacingButtonSide", "e", "SeparateButtonExtraY", "f", "SnackbarVerticalPadding", "g", "TextEndExtraSpacing", "h", "LongButtonVerticalOffset", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class M0 {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final float f9855a = c2.h.B((float) 600);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final float f9856b = c2.h.B((float) 30);

    /* renamed from: c  reason: collision with root package name */
    private static final float f9857c = c2.h.B((float) 16);

    /* renamed from: d  reason: collision with root package name */
    private static final float f9858d;

    /* renamed from: e  reason: collision with root package name */
    private static final float f9859e = c2.h.B((float) 2);

    /* renamed from: f  reason: collision with root package name */
    private static final float f9860f = c2.h.B((float) 6);
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final float f9861g;

    /* renamed from: h  reason: collision with root package name */
    private static final float f9862h = c2.h.B((float) 12);

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f9863c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f9864d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f9865e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Y f9866f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ long f9867g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ long f9868h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ int f9869i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(p<? super C4889m, ? super Integer, C16807N> pVar, p<? super C4889m, ? super Integer, C16807N> pVar2, p<? super C4889m, ? super Integer, C16807N> pVar3, Y y10, long j10, long j11, int i10) {
            super(2);
            this.f9863c = pVar;
            this.f9864d = pVar2;
            this.f9865e = pVar3;
            this.f9866f = y10;
            this.f9867g = j10;
            this.f9868h = j11;
            this.f9869i = i10;
        }

        public final void a(C4889m mVar, int i10) {
            M0.a(this.f9863c, this.f9864d, this.f9865e, this.f9866f, this.f9867g, this.f9868h, mVar, U0.M0.a(this.f9869i | 1));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"LE1/K;", "", "LE1/H;", "measurables", "Lc2/b;", "constraints", "LE1/J;", "i", "(LE1/K;Ljava/util/List;J)LE1/J;"}, k = 3, mv = {1, 8, 0})
    static final class b implements I {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f9870a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f9871b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f9872c;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LE1/a0$a;", "LXH/N;", "a", "(LE1/a0$a;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends C17544u implements C17642l<a0.a, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ a0 f9873c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ int f9874d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ a0 f9875e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ int f9876f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ int f9877g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ a0 f9878h;

            /* renamed from: i  reason: collision with root package name */
            final /* synthetic */ int f9879i;

            /* renamed from: j  reason: collision with root package name */
            final /* synthetic */ int f9880j;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(a0 a0Var, int i10, a0 a0Var2, int i11, int i12, a0 a0Var3, int i13, int i14) {
                super(1);
                this.f9873c = a0Var;
                this.f9874d = i10;
                this.f9875e = a0Var2;
                this.f9876f = i11;
                this.f9877g = i12;
                this.f9878h = a0Var3;
                this.f9879i = i13;
                this.f9880j = i14;
            }

            public final void a(a0.a aVar) {
                a0.a.m(aVar, this.f9873c, 0, this.f9874d, 0.0f, 4, (Object) null);
                a0 a0Var = this.f9875e;
                if (a0Var != null) {
                    a0.a.m(aVar, a0Var, this.f9876f, this.f9877g, 0.0f, 4, (Object) null);
                }
                a0 a0Var2 = this.f9878h;
                if (a0Var2 != null) {
                    a0.a.m(aVar, a0Var2, this.f9879i, this.f9880j, 0.0f, 4, (Object) null);
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((a0.a) obj);
                return C16807N.f139792a;
            }
        }

        b(String str, String str2, String str3) {
            this.f9870a = str;
            this.f9871b = str2;
            this.f9872c = str3;
        }

        public final J i(K k10, List<? extends H> list, long j10) {
            a0 a0Var;
            Object obj;
            Object obj2;
            int i10;
            int i11;
            a0 a0Var2;
            int i12;
            int i13;
            K k11 = k10;
            List<? extends H> list2 = list;
            long j11 = j10;
            int min = Math.min(C5267b.l(j10), k11.K0(M0.f9855a));
            String str = this.f9870a;
            int size = list.size();
            int i14 = 0;
            while (true) {
                a0Var = null;
                if (i14 >= size) {
                    obj = null;
                    break;
                }
                obj = list2.get(i14);
                if (C17542s.e(androidx.compose.ui.layout.a.a((H) obj), str)) {
                    break;
                }
                i14++;
            }
            H h10 = (H) obj;
            a0 i02 = h10 != null ? h10.i0(j11) : null;
            String str2 = this.f9871b;
            int size2 = list.size();
            int i15 = 0;
            while (true) {
                if (i15 >= size2) {
                    obj2 = null;
                    break;
                }
                obj2 = list2.get(i15);
                if (C17542s.e(androidx.compose.ui.layout.a.a((H) obj2), str2)) {
                    break;
                }
                i15++;
            }
            H h11 = (H) obj2;
            if (h11 != null) {
                a0Var = h11.i0(j11);
            }
            a0 a0Var3 = a0Var;
            int E02 = i02 != null ? i02.E0() : 0;
            int z02 = i02 != null ? i02.z0() : 0;
            int E03 = a0Var3 != null ? a0Var3.E0() : 0;
            int z03 = a0Var3 != null ? a0Var3.z0() : 0;
            int e10 = C17978n.e(((min - E02) - E03) - (E03 == 0 ? k11.K0(M0.f9861g) : 0), C5267b.n(j10));
            String str3 = this.f9872c;
            int size3 = list.size();
            int i16 = 0;
            while (i16 < size3) {
                H h12 = (H) list2.get(i16);
                if (C17542s.e(androidx.compose.ui.layout.a.a(h12), str3)) {
                    a0 a0Var4 = i02;
                    int i17 = z03;
                    a0 i03 = h12.i0(C5267b.d(j10, 0, e10, 0, 0, 9, (Object) null));
                    int n02 = i03.n0(C4469b.a());
                    int n03 = i03.n0(C4469b.b());
                    boolean z10 = true;
                    boolean z11 = (n02 == Integer.MIN_VALUE || n03 == Integer.MIN_VALUE) ? false : true;
                    if (n02 != n03 && z11) {
                        z10 = false;
                    }
                    int i18 = min - E03;
                    int i19 = i18 - E02;
                    if (z10) {
                        i12 = Math.max(k11.K0(y.f13281a.g()), Math.max(z02, i17));
                        int z04 = (i12 - i03.z0()) / 2;
                        if (a0Var4 != null) {
                            a0Var2 = a0Var4;
                            int n04 = a0Var2.n0(C4469b.a());
                            if (n04 != Integer.MIN_VALUE) {
                                i13 = (n02 + z04) - n04;
                                i10 = i13;
                                i11 = z04;
                            }
                        } else {
                            a0Var2 = a0Var4;
                        }
                        i13 = 0;
                        i10 = i13;
                        i11 = z04;
                    } else {
                        a0Var2 = a0Var4;
                        int K02 = k11.K0(M0.f9856b) - n02;
                        int max = Math.max(k11.K0(y.f13281a.j()), i03.z0() + K02);
                        i11 = K02;
                        i10 = a0Var2 != null ? (max - a0Var2.z0()) / 2 : 0;
                        i12 = max;
                    }
                    return K.v0(k10, min, i12, (Map) null, new a(i03, i11, a0Var3, i18, a0Var3 != null ? (i12 - a0Var3.z0()) / 2 : 0, a0Var2, i19, i10), 4, (Object) null);
                }
                a0 a0Var5 = i02;
                int i20 = z03;
                i16++;
                i02 = a0Var5;
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class c extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f9881c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f9882d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f9883e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Y f9884f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ long f9885g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ long f9886h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ int f9887i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(p<? super C4889m, ? super Integer, C16807N> pVar, p<? super C4889m, ? super Integer, C16807N> pVar2, p<? super C4889m, ? super Integer, C16807N> pVar3, Y y10, long j10, long j11, int i10) {
            super(2);
            this.f9881c = pVar;
            this.f9882d = pVar2;
            this.f9883e = pVar3;
            this.f9884f = y10;
            this.f9885g = j10;
            this.f9886h = j11;
            this.f9887i = i10;
        }

        public final void a(C4889m mVar, int i10) {
            M0.b(this.f9881c, this.f9882d, this.f9883e, this.f9884f, this.f9885g, this.f9886h, mVar, U0.M0.a(this.f9887i | 1));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "a", "(LU0/m;I)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f9888c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f9889d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f9890e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f9891f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ long f9892g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ long f9893h;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "a", "(LU0/m;I)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends C17544u implements p<C4889m, Integer, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ boolean f9894c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ p<C4889m, Integer, C16807N> f9895d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ p<C4889m, Integer, C16807N> f9896e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ p<C4889m, Integer, C16807N> f9897f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ Y f9898g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ long f9899h;

            /* renamed from: i  reason: collision with root package name */
            final /* synthetic */ long f9900i;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(boolean z10, p<? super C4889m, ? super Integer, C16807N> pVar, p<? super C4889m, ? super Integer, C16807N> pVar2, p<? super C4889m, ? super Integer, C16807N> pVar3, Y y10, long j10, long j11) {
                super(2);
                this.f9894c = z10;
                this.f9895d = pVar;
                this.f9896e = pVar2;
                this.f9897f = pVar3;
                this.f9898g = y10;
                this.f9899h = j10;
                this.f9900i = j11;
            }

            public final void a(C4889m mVar, int i10) {
                if ((i10 & 3) != 2 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(835891690, i10, -1, "androidx.compose.material3.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:124)");
                    }
                    if (!this.f9894c || this.f9895d == null) {
                        mVar.W(-810701708);
                        M0.b(this.f9896e, this.f9895d, this.f9897f, this.f9898g, this.f9899h, this.f9900i, mVar, 0);
                        mVar.P();
                    } else {
                        mVar.W(-810715387);
                        M0.a(this.f9896e, this.f9895d, this.f9897f, this.f9898g, this.f9899h, this.f9900i, mVar, 0);
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
        d(boolean z10, p<? super C4889m, ? super Integer, C16807N> pVar, p<? super C4889m, ? super Integer, C16807N> pVar2, p<? super C4889m, ? super Integer, C16807N> pVar3, long j10, long j11) {
            super(2);
            this.f9888c = z10;
            this.f9889d = pVar;
            this.f9890e = pVar2;
            this.f9891f = pVar3;
            this.f9892g = j10;
            this.f9893h = j11;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1829663446, i10, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:121)");
                }
                y yVar = y.f13281a;
                C4910x.a(d1.d().d(j1.c(yVar.i(), mVar, 6)), c1.c.e(835891690, true, new a(this.f9888c, this.f9889d, this.f9890e, this.f9891f, j1.c(yVar.b(), mVar, 6), this.f9892g, this.f9893h), mVar, 54), mVar, J0.f13770i | 48);
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
    static final class e extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f9901c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f9902d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f9903e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f9904f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ i1 f9905g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ long f9906h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ long f9907i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ long f9908j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ long f9909k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f9910l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ int f9911m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ int f9912n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(androidx.compose.ui.d dVar, p<? super C4889m, ? super Integer, C16807N> pVar, p<? super C4889m, ? super Integer, C16807N> pVar2, boolean z10, i1 i1Var, long j10, long j11, long j12, long j13, p<? super C4889m, ? super Integer, C16807N> pVar3, int i10, int i11) {
            super(2);
            this.f9901c = dVar;
            this.f9902d = pVar;
            this.f9903e = pVar2;
            this.f9904f = z10;
            this.f9905g = i1Var;
            this.f9906h = j10;
            this.f9907i = j11;
            this.f9908j = j12;
            this.f9909k = j13;
            this.f9910l = pVar3;
            this.f9911m = i10;
            this.f9912n = i11;
        }

        public final void a(C4889m mVar, int i10) {
            C4889m mVar2 = mVar;
            androidx.compose.ui.d dVar = this.f9901c;
            androidx.compose.ui.d dVar2 = dVar;
            M0.c(dVar2, this.f9902d, this.f9903e, this.f9904f, this.f9905g, this.f9906h, this.f9907i, this.f9908j, this.f9909k, this.f9910l, mVar2, U0.M0.a(this.f9911m | 1), this.f9912n);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "a", "(LU0/m;I)V"}, k = 3, mv = {1, 8, 0})
    static final class f extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ H0 f9913c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(H0 h02) {
            super(2);
            this.f9913c = h02;
        }

        public final void a(C4889m mVar, int i10) {
            int i11 = i10;
            if ((i11 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1266389126, i11, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:251)");
                }
                d1.b(this.f9913c.a().getMessage(), (androidx.compose.ui.d) null, 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, (Y) null, mVar, 0, 0, 131070);
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
    static final class g extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ H0 f9914c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f9915d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f9916e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ i1 f9917f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ long f9918g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ long f9919h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ long f9920i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ long f9921j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ long f9922k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ int f9923l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ int f9924m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(H0 h02, androidx.compose.ui.d dVar, boolean z10, i1 i1Var, long j10, long j11, long j12, long j13, long j14, int i10, int i11) {
            super(2);
            this.f9914c = h02;
            this.f9915d = dVar;
            this.f9916e = z10;
            this.f9917f = i1Var;
            this.f9918g = j10;
            this.f9919h = j11;
            this.f9920i = j12;
            this.f9921j = j13;
            this.f9922k = j14;
            this.f9923l = i10;
            this.f9924m = i11;
        }

        public final void a(C4889m mVar, int i10) {
            C4889m mVar2 = mVar;
            H0 h02 = this.f9914c;
            H0 h03 = h02;
            M0.d(h03, this.f9915d, this.f9916e, this.f9917f, this.f9918g, this.f9919h, this.f9920i, this.f9921j, this.f9922k, mVar2, U0.M0.a(this.f9923l | 1), this.f9924m);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "a", "(LU0/m;I)V"}, k = 3, mv = {1, 8, 0})
    static final class h extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f9925c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ H0 f9926d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f9927e;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        static final class a extends C17544u implements C17631a<C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ H0 f9928c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(H0 h02) {
                super(0);
                this.f9928c = h02;
            }

            public final void invoke() {
                this.f9928c.c();
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ls0/M;", "LXH/N;", "a", "(Ls0/M;LU0/m;I)V"}, k = 3, mv = {1, 8, 0})
        static final class b extends C17544u implements q<C5842M, C4889m, Integer, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ String f9929c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(String str) {
                super(3);
                this.f9929c = str;
            }

            public final void a(C5842M m10, C4889m mVar, int i10) {
                int i11 = i10;
                if ((i11 & 17) != 16 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(521110564, i11, -1, "androidx.compose.material3.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:219)");
                    }
                    d1.b(this.f9929c, (androidx.compose.ui.d) null, 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, (Y) null, mVar, 0, 0, 131070);
                    if (C4895p.J()) {
                        C4895p.R();
                        return;
                    }
                    return;
                }
                mVar.L();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                a((C5842M) obj, (C4889m) obj2, ((Number) obj3).intValue());
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(long j10, H0 h02, String str) {
            super(2);
            this.f9925c = j10;
            this.f9926d = h02;
            this.f9927e = str;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: nI.a} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(U0.C4889m r16, int r17) {
            /*
                r15 = this;
                r0 = r15
                r13 = r16
                r1 = r17
                r2 = r1 & 3
                r3 = 2
                if (r2 != r3) goto L_0x0015
                boolean r2 = r16.l()
                if (r2 != 0) goto L_0x0011
                goto L_0x0015
            L_0x0011:
                r16.L()
                goto L_0x0084
            L_0x0015:
                boolean r2 = U0.C4895p.J()
                if (r2 == 0) goto L_0x0024
                r2 = -1
                java.lang.String r3 = "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:216)"
                r4 = -1378313599(0xffffffffadd89a81, float:-2.462497E-11)
                U0.C4895p.S(r4, r1, r2, r3)
            L_0x0024:
                O0.m r1 = O0.C4740m.f11185a
                long r4 = r0.f9925c
                r11 = 24576(0x6000, float:3.4438E-41)
                r12 = 13
                r2 = 0
                r6 = 0
                r8 = 0
                r10 = r16
                O0.l r5 = r1.m(r2, r4, r6, r8, r10, r11, r12)
                O0.H0 r1 = r0.f9926d
                boolean r1 = r13.V(r1)
                O0.H0 r2 = r0.f9926d
                java.lang.Object r3 = r16.D()
                if (r1 != 0) goto L_0x004e
                U0.m$a r1 = U0.C4889m.f14007a
                java.lang.Object r1 = r1.a()
                if (r3 != r1) goto L_0x0056
            L_0x004e:
                O0.M0$h$a r3 = new O0.M0$h$a
                r3.<init>(r2)
                r13.u(r3)
            L_0x0056:
                r1 = r3
                nI.a r1 = (nI.C17631a) r1
                O0.M0$h$b r2 = new O0.M0$h$b
                java.lang.String r3 = r0.f9927e
                r2.<init>(r3)
                r3 = 54
                r4 = 521110564(0x1f0f8424, float:3.0390732E-20)
                r6 = 1
                c1.a r10 = c1.c.e(r4, r6, r2, r13, r3)
                r12 = 805306368(0x30000000, float:4.656613E-10)
                r14 = 494(0x1ee, float:6.92E-43)
                r2 = 0
                r3 = 0
                r4 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r11 = r16
                r13 = r14
                O0.C4744o.b(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
                boolean r1 = U0.C4895p.J()
                if (r1 == 0) goto L_0x0084
                U0.C4895p.R()
            L_0x0084:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: O0.M0.h.a(U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "a", "(LU0/m;I)V"}, k = 3, mv = {1, 8, 0})
    static final class i extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ H0 f9930c;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        static final class a extends C17544u implements C17631a<C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ H0 f9931c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(H0 h02) {
                super(0);
                this.f9931c = h02;
            }

            public final void invoke() {
                this.f9931c.dismiss();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(H0 h02) {
            super(2);
            this.f9930c = h02;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: nI.a} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(U0.C4889m r12, int r13) {
            /*
                r11 = this;
                r0 = r13 & 3
                r1 = 2
                if (r0 != r1) goto L_0x0010
                boolean r0 = r12.l()
                if (r0 != 0) goto L_0x000c
                goto L_0x0010
            L_0x000c:
                r12.L()
                goto L_0x005b
            L_0x0010:
                boolean r0 = U0.C4895p.J()
                if (r0 == 0) goto L_0x001f
                r0 = -1
                java.lang.String r1 = "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:228)"
                r2 = -1812633777(0xffffffff93f5674f, float:-6.1948565E-27)
                U0.C4895p.S(r2, r13, r0, r1)
            L_0x001f:
                O0.H0 r13 = r11.f9930c
                boolean r13 = r12.V(r13)
                O0.H0 r0 = r11.f9930c
                java.lang.Object r1 = r12.D()
                if (r13 != 0) goto L_0x0035
                U0.m$a r13 = U0.C4889m.f14007a
                java.lang.Object r13 = r13.a()
                if (r1 != r13) goto L_0x003d
            L_0x0035:
                O0.M0$i$a r1 = new O0.M0$i$a
                r1.<init>(r0)
                r12.u(r1)
            L_0x003d:
                r2 = r1
                nI.a r2 = (nI.C17631a) r2
                O0.C r13 = O0.C.f9694a
                nI.p r7 = r13.a()
                r9 = 196608(0x30000, float:2.75506E-40)
                r10 = 30
                r3 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                r8 = r12
                O0.U.a(r2, r3, r4, r5, r6, r7, r8, r9, r10)
                boolean r12 = U0.C4895p.J()
                if (r12 == 0) goto L_0x005b
                U0.C4895p.R()
            L_0x005b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: O0.M0.i.a(U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    static {
        float f10 = (float) 8;
        f9858d = c2.h.B(f10);
        f9861g = c2.h.B(f10);
    }

    /* access modifiers changed from: private */
    public static final void a(p<? super C4889m, ? super Integer, C16807N> pVar, p<? super C4889m, ? super Integer, C16807N> pVar2, p<? super C4889m, ? super Integer, C16807N> pVar3, Y y10, long j10, long j11, C4889m mVar, int i10) {
        int i11;
        p<? super C4889m, ? super Integer, C16807N> pVar4 = pVar;
        p<? super C4889m, ? super Integer, C16807N> pVar5 = pVar2;
        p<? super C4889m, ? super Integer, C16807N> pVar6 = pVar3;
        Y y11 = y10;
        int i12 = i10;
        C4889m k10 = mVar.k(-1332496681);
        if ((i12 & 6) == 0) {
            i11 = (k10.F(pVar4) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.F(pVar5) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i11 |= k10.F(pVar6) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i11 |= k10.V(y11) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        if ((i12 & 24576) == 0) {
            i11 |= k10.e(j10) ? 16384 : 8192;
        } else {
            long j12 = j10;
        }
        if ((196608 & i12) == 0) {
            i11 |= k10.e(j11) ? 131072 : ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        } else {
            long j13 = j11;
        }
        if ((74899 & i11) != 74898 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1332496681, i11, -1, "androidx.compose.material3.NewLineButtonSnackbar (Snackbar.kt:263)");
            }
            d.a aVar = androidx.compose.ui.d.f18749a;
            androidx.compose.ui.d m10 = D.m(androidx.compose.foundation.layout.J.h(androidx.compose.foundation.layout.J.A(aVar, 0.0f, f9855a, 1, (Object) null), 0.0f, 1, (Object) null), f9857c, 0.0f, 0.0f, f9859e, 6, (Object) null);
            C5073d dVar = C5073d.f18068a;
            C5073d.m g10 = dVar.g();
            C5437c.a aVar2 = C5437c.f24302a;
            I a10 = C5080k.a(g10, aVar2.k(), k10, 0);
            int a11 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            androidx.compose.ui.d e10 = androidx.compose.ui.c.e(k10, m10);
            C4504g.a aVar3 = C4504g.f6515W;
            C17631a<C4504g> a12 = aVar3.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a12);
            } else {
                k10.t();
            }
            C4889m a13 = F1.a(k10);
            F1.c(a13, a10, aVar3.c());
            F1.c(a13, s10, aVar3.e());
            p<C4504g, Integer, C16807N> b10 = aVar3.b();
            if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                a13.u(Integer.valueOf(a11));
                a13.w(Integer.valueOf(a11), b10);
            }
            F1.c(a13, e10, aVar3.d());
            C5862h hVar = C5862h.f28810a;
            androidx.compose.ui.d g11 = C5070a.g(aVar, f9856b, f9862h);
            float f10 = f9858d;
            androidx.compose.ui.d m11 = D.m(g11, 0.0f, 0.0f, f10, 0.0f, 11, (Object) null);
            I h10 = C5077h.h(aVar2.o(), false);
            int a14 = C4883j.a(k10, 0);
            C4912y s11 = k10.s();
            androidx.compose.ui.d e11 = androidx.compose.ui.c.e(k10, m11);
            C17631a<C4504g> a15 = aVar3.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a15);
            } else {
                k10.t();
            }
            C4889m a16 = F1.a(k10);
            float f11 = f10;
            F1.c(a16, h10, aVar3.c());
            F1.c(a16, s11, aVar3.e());
            p<C4504g, Integer, C16807N> b11 = aVar3.b();
            if (a16.i() || !C17542s.e(a16.D(), Integer.valueOf(a14))) {
                a16.u(Integer.valueOf(a14));
                a16.w(Integer.valueOf(a14), b11);
            }
            F1.c(a16, e11, aVar3.d());
            C5079j jVar = C5079j.f18125a;
            pVar4.invoke(k10, Integer.valueOf(i11 & 14));
            k10.x();
            androidx.compose.ui.d m12 = D.m(hVar.b(aVar, aVar2.j()), 0.0f, 0.0f, pVar6 == null ? f11 : c2.h.B((float) 0), 0.0f, 11, (Object) null);
            I h11 = C5077h.h(aVar2.o(), false);
            int a17 = C4883j.a(k10, 0);
            C4912y s12 = k10.s();
            androidx.compose.ui.d e12 = androidx.compose.ui.c.e(k10, m12);
            C17631a<C4504g> a18 = aVar3.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a18);
            } else {
                k10.t();
            }
            C4889m a19 = F1.a(k10);
            F1.c(a19, h11, aVar3.c());
            F1.c(a19, s12, aVar3.e());
            p<C4504g, Integer, C16807N> b12 = aVar3.b();
            if (a19.i() || !C17542s.e(a19.D(), Integer.valueOf(a17))) {
                a19.u(Integer.valueOf(a17));
                a19.w(Integer.valueOf(a17), b12);
            }
            F1.c(a19, e12, aVar3.d());
            I b13 = G.b(dVar.f(), aVar2.l(), k10, 0);
            int a20 = C4883j.a(k10, 0);
            C4912y s13 = k10.s();
            androidx.compose.ui.d e13 = androidx.compose.ui.c.e(k10, aVar);
            C17631a<C4504g> a21 = aVar3.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a21);
            } else {
                k10.t();
            }
            C4889m a22 = F1.a(k10);
            F1.c(a22, b13, aVar3.c());
            F1.c(a22, s13, aVar3.e());
            p<C4504g, Integer, C16807N> b14 = aVar3.b();
            if (a22.i() || !C17542s.e(a22.D(), Integer.valueOf(a20))) {
                a22.u(Integer.valueOf(a20));
                a22.w(Integer.valueOf(a20), b14);
            }
            F1.c(a22, e13, aVar3.d());
            C5843N n10 = C5843N.f28726a;
            J0[] j0Arr = {E.a().d(C5747v0.k(j10)), d1.d().d(y11)};
            int i13 = J0.f13770i;
            C4910x.b(j0Arr, pVar5, k10, (i11 & 112) | i13);
            k10.W(618603253);
            if (pVar6 != null) {
                C4910x.a(E.a().d(C5747v0.k(j11)), pVar6, k10, ((i11 >> 3) & 112) | i13);
            }
            k10.P();
            k10.x();
            k10.x();
            k10.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n11 = k10.n();
        if (n11 != null) {
            n11.a(new a(pVar, pVar2, pVar3, y10, j10, j11, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final void b(p<? super C4889m, ? super Integer, C16807N> pVar, p<? super C4889m, ? super Integer, C16807N> pVar2, p<? super C4889m, ? super Integer, C16807N> pVar3, Y y10, long j10, long j11, C4889m mVar, int i10) {
        int i11;
        p<? super C4889m, ? super Integer, C16807N> pVar4 = pVar;
        p<? super C4889m, ? super Integer, C16807N> pVar5 = pVar2;
        p<? super C4889m, ? super Integer, C16807N> pVar6 = pVar3;
        Y y11 = y10;
        int i12 = i10;
        C4889m k10 = mVar.k(-903235475);
        if ((i12 & 6) == 0) {
            i11 = (k10.F(pVar4) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.F(pVar5) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i11 |= k10.F(pVar6) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i11 |= k10.V(y11) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        if ((i12 & 24576) == 0) {
            i11 |= k10.e(j10) ? 16384 : 8192;
        } else {
            long j12 = j10;
        }
        if ((196608 & i12) == 0) {
            i11 |= k10.e(j11) ? 131072 : ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        } else {
            long j13 = j11;
        }
        if ((74899 & i11) != 74898 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-903235475, i11, -1, "androidx.compose.material3.OneRowSnackbar (Snackbar.kt:308)");
            }
            d.a aVar = androidx.compose.ui.d.f18749a;
            androidx.compose.ui.d m10 = D.m(aVar, f9857c, 0.0f, pVar6 == null ? f9858d : c2.h.B((float) 0), 0.0f, 10, (Object) null);
            Object D10 = k10.D();
            if (D10 == C4889m.f14007a.a()) {
                D10 = new b("action", "dismissAction", "text");
                k10.u(D10);
            }
            I i13 = (I) D10;
            int a10 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            androidx.compose.ui.d e10 = androidx.compose.ui.c.e(k10, m10);
            C4504g.a aVar2 = C4504g.f6515W;
            C17631a<C4504g> a11 = aVar2.a();
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
            F1.c(a12, i13, aVar2.c());
            F1.c(a12, s10, aVar2.e());
            p<C4504g, Integer, C16807N> b10 = aVar2.b();
            if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                a12.u(Integer.valueOf(a10));
                a12.w(Integer.valueOf(a10), b10);
            }
            F1.c(a12, e10, aVar2.d());
            androidx.compose.ui.d k11 = D.k(androidx.compose.ui.layout.a.b(aVar, "text"), 0.0f, f9860f, 1, (Object) null);
            C5437c.a aVar3 = C5437c.f24302a;
            I h10 = C5077h.h(aVar3.o(), false);
            int a13 = C4883j.a(k10, 0);
            C4912y s11 = k10.s();
            androidx.compose.ui.d e11 = androidx.compose.ui.c.e(k10, k11);
            C17631a<C4504g> a14 = aVar2.a();
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
            F1.c(a15, h10, aVar2.c());
            F1.c(a15, s11, aVar2.e());
            p<C4504g, Integer, C16807N> b11 = aVar2.b();
            if (a15.i() || !C17542s.e(a15.D(), Integer.valueOf(a13))) {
                a15.u(Integer.valueOf(a13));
                a15.w(Integer.valueOf(a13), b11);
            }
            F1.c(a15, e11, aVar2.d());
            C5079j jVar = C5079j.f18125a;
            pVar4.invoke(k10, Integer.valueOf(i11 & 14));
            k10.x();
            k10.W(-904778058);
            if (pVar5 != null) {
                androidx.compose.ui.d b12 = androidx.compose.ui.layout.a.b(aVar, "action");
                I h11 = C5077h.h(aVar3.o(), false);
                int a16 = C4883j.a(k10, 0);
                C4912y s12 = k10.s();
                androidx.compose.ui.d e12 = androidx.compose.ui.c.e(k10, b12);
                C17631a<C4504g> a17 = aVar2.a();
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
                F1.c(a18, h11, aVar2.c());
                F1.c(a18, s12, aVar2.e());
                p<C4504g, Integer, C16807N> b13 = aVar2.b();
                if (a18.i() || !C17542s.e(a18.D(), Integer.valueOf(a16))) {
                    a18.u(Integer.valueOf(a16));
                    a18.w(Integer.valueOf(a16), b13);
                }
                F1.c(a18, e12, aVar2.d());
                C4910x.b(new J0[]{E.a().d(C5747v0.k(j10)), d1.d().d(y11)}, pVar5, k10, J0.f13770i | (i11 & 112));
                k10.x();
            }
            k10.P();
            k10.W(-904766579);
            if (pVar6 != null) {
                androidx.compose.ui.d b14 = androidx.compose.ui.layout.a.b(aVar, "dismissAction");
                I h12 = C5077h.h(aVar3.o(), false);
                int a19 = C4883j.a(k10, 0);
                C4912y s13 = k10.s();
                androidx.compose.ui.d e13 = androidx.compose.ui.c.e(k10, b14);
                C17631a<C4504g> a20 = aVar2.a();
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
                F1.c(a21, h12, aVar2.c());
                F1.c(a21, s13, aVar2.e());
                p<C4504g, Integer, C16807N> b15 = aVar2.b();
                if (a21.i() || !C17542s.e(a21.D(), Integer.valueOf(a19))) {
                    a21.u(Integer.valueOf(a19));
                    a21.w(Integer.valueOf(a19), b15);
                }
                F1.c(a21, e13, aVar2.d());
                C4910x.a(E.a().d(C5747v0.k(j11)), pVar6, k10, ((i11 >> 3) & 112) | J0.f13770i);
                k10.x();
            }
            k10.P();
            k10.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new c(pVar, pVar2, pVar3, y10, j10, j11, i10));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x026b  */
    /* JADX WARNING: Removed duplicated region for block: B:172:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x010b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(androidx.compose.ui.d r25, nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r26, nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r27, boolean r28, p1.i1 r29, long r30, long r32, long r34, long r36, nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r38, U0.C4889m r39, int r40, int r41) {
        /*
            r15 = r40
            r14 = r41
            r0 = -1235788955(0xffffffffb6575b65, float:-3.2090695E-6)
            r1 = r39
            U0.m r1 = r1.k(r0)
            r2 = r14 & 1
            if (r2 == 0) goto L_0x0017
            r3 = r15 | 6
            r4 = r3
            r3 = r25
            goto L_0x002b
        L_0x0017:
            r3 = r15 & 6
            if (r3 != 0) goto L_0x0028
            r3 = r25
            boolean r4 = r1.V(r3)
            if (r4 == 0) goto L_0x0025
            r4 = 4
            goto L_0x0026
        L_0x0025:
            r4 = 2
        L_0x0026:
            r4 = r4 | r15
            goto L_0x002b
        L_0x0028:
            r3 = r25
            r4 = r15
        L_0x002b:
            r5 = r14 & 2
            if (r5 == 0) goto L_0x0034
            r4 = r4 | 48
        L_0x0031:
            r6 = r26
            goto L_0x0046
        L_0x0034:
            r6 = r15 & 48
            if (r6 != 0) goto L_0x0031
            r6 = r26
            boolean r7 = r1.F(r6)
            if (r7 == 0) goto L_0x0043
            r7 = 32
            goto L_0x0045
        L_0x0043:
            r7 = 16
        L_0x0045:
            r4 = r4 | r7
        L_0x0046:
            r7 = r14 & 4
            if (r7 == 0) goto L_0x004f
            r4 = r4 | 384(0x180, float:5.38E-43)
        L_0x004c:
            r8 = r27
            goto L_0x0061
        L_0x004f:
            r8 = r15 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L_0x004c
            r8 = r27
            boolean r9 = r1.F(r8)
            if (r9 == 0) goto L_0x005e
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x0060
        L_0x005e:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0060:
            r4 = r4 | r9
        L_0x0061:
            r9 = r14 & 8
            if (r9 == 0) goto L_0x006a
            r4 = r4 | 3072(0xc00, float:4.305E-42)
        L_0x0067:
            r10 = r28
            goto L_0x007c
        L_0x006a:
            r10 = r15 & 3072(0xc00, float:4.305E-42)
            if (r10 != 0) goto L_0x0067
            r10 = r28
            boolean r11 = r1.b(r10)
            if (r11 == 0) goto L_0x0079
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x007b
        L_0x0079:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x007b:
            r4 = r4 | r11
        L_0x007c:
            r11 = r15 & 24576(0x6000, float:3.4438E-41)
            if (r11 != 0) goto L_0x0095
            r11 = r14 & 16
            if (r11 != 0) goto L_0x008f
            r11 = r29
            boolean r12 = r1.V(r11)
            if (r12 == 0) goto L_0x0091
            r12 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0093
        L_0x008f:
            r11 = r29
        L_0x0091:
            r12 = 8192(0x2000, float:1.14794E-41)
        L_0x0093:
            r4 = r4 | r12
            goto L_0x0097
        L_0x0095:
            r11 = r29
        L_0x0097:
            r12 = 196608(0x30000, float:2.75506E-40)
            r12 = r12 & r15
            if (r12 != 0) goto L_0x00b2
            r12 = r14 & 32
            if (r12 != 0) goto L_0x00ab
            r12 = r30
            boolean r16 = r1.e(r12)
            if (r16 == 0) goto L_0x00ad
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00af
        L_0x00ab:
            r12 = r30
        L_0x00ad:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00af:
            r4 = r4 | r16
            goto L_0x00b4
        L_0x00b2:
            r12 = r30
        L_0x00b4:
            r16 = 1572864(0x180000, float:2.204052E-39)
            r16 = r15 & r16
            if (r16 != 0) goto L_0x00ce
            r16 = r14 & 64
            r10 = r32
            if (r16 != 0) goto L_0x00c9
            boolean r16 = r1.e(r10)
            if (r16 == 0) goto L_0x00c9
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00cb
        L_0x00c9:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00cb:
            r4 = r4 | r16
            goto L_0x00d0
        L_0x00ce:
            r10 = r32
        L_0x00d0:
            r16 = 12582912(0xc00000, float:1.7632415E-38)
            r16 = r15 & r16
            if (r16 != 0) goto L_0x00e9
            r0 = r14 & 128(0x80, float:1.794E-43)
            r10 = r34
            if (r0 != 0) goto L_0x00e5
            boolean r0 = r1.e(r10)
            if (r0 == 0) goto L_0x00e5
            r0 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00e7
        L_0x00e5:
            r0 = 4194304(0x400000, float:5.877472E-39)
        L_0x00e7:
            r4 = r4 | r0
            goto L_0x00eb
        L_0x00e9:
            r10 = r34
        L_0x00eb:
            r0 = 100663296(0x6000000, float:2.4074124E-35)
            r0 = r0 & r15
            if (r0 != 0) goto L_0x0103
            r0 = r14 & 256(0x100, float:3.59E-43)
            r10 = r36
            if (r0 != 0) goto L_0x00ff
            boolean r0 = r1.e(r10)
            if (r0 == 0) goto L_0x00ff
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0101
        L_0x00ff:
            r0 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0101:
            r4 = r4 | r0
            goto L_0x0105
        L_0x0103:
            r10 = r36
        L_0x0105:
            r0 = r14 & 512(0x200, float:7.175E-43)
            r17 = 805306368(0x30000000, float:4.656613E-10)
            if (r0 == 0) goto L_0x0110
            r4 = r4 | r17
        L_0x010d:
            r0 = r38
            goto L_0x0123
        L_0x0110:
            r0 = r15 & r17
            if (r0 != 0) goto L_0x010d
            r0 = r38
            boolean r17 = r1.F(r0)
            if (r17 == 0) goto L_0x011f
            r17 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0121
        L_0x011f:
            r17 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0121:
            r4 = r4 | r17
        L_0x0123:
            r17 = 306783379(0x12492493, float:6.34695E-28)
            r0 = r4 & r17
            r3 = 306783378(0x12492492, float:6.3469493E-28)
            if (r0 != r3) goto L_0x0146
            boolean r0 = r1.l()
            if (r0 != 0) goto L_0x0134
            goto L_0x0146
        L_0x0134:
            r1.L()
            r2 = r25
            r4 = r28
            r5 = r29
            r3 = r8
            r16 = r10
            r8 = r32
            r10 = r34
            goto L_0x0265
        L_0x0146:
            r1.G()
            r0 = r15 & 1
            r3 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r17 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r18 = -3670017(0xffffffffffc7ffff, float:NaN)
            r19 = -458753(0xfffffffffff8ffff, float:NaN)
            r20 = -57345(0xffffffffffff1fff, float:NaN)
            if (r0 == 0) goto L_0x018f
            boolean r0 = r1.O()
            if (r0 == 0) goto L_0x0163
            goto L_0x018f
        L_0x0163:
            r1.L()
            r0 = r14 & 16
            if (r0 == 0) goto L_0x016c
            r4 = r4 & r20
        L_0x016c:
            r0 = r14 & 32
            if (r0 == 0) goto L_0x0172
            r4 = r4 & r19
        L_0x0172:
            r0 = r14 & 64
            if (r0 == 0) goto L_0x0178
            r4 = r4 & r18
        L_0x0178:
            r0 = r14 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x017e
            r4 = r4 & r17
        L_0x017e:
            r0 = r14 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0183
            r4 = r4 & r3
        L_0x0183:
            r0 = r25
            r5 = r28
            r7 = r29
            r19 = r32
            r21 = r34
            r2 = r8
            goto L_0x01ea
        L_0x018f:
            if (r2 == 0) goto L_0x0194
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            goto L_0x0196
        L_0x0194:
            r0 = r25
        L_0x0196:
            r2 = 0
            if (r5 == 0) goto L_0x019a
            r6 = r2
        L_0x019a:
            if (r7 == 0) goto L_0x019d
            goto L_0x019e
        L_0x019d:
            r2 = r8
        L_0x019e:
            if (r9 == 0) goto L_0x01a2
            r5 = 0
            goto L_0x01a4
        L_0x01a2:
            r5 = r28
        L_0x01a4:
            r7 = r14 & 16
            r8 = 6
            if (r7 == 0) goto L_0x01b2
            O0.I0 r7 = O0.I0.f9774a
            p1.i1 r7 = r7.f(r1, r8)
            r4 = r4 & r20
            goto L_0x01b4
        L_0x01b2:
            r7 = r29
        L_0x01b4:
            r9 = r14 & 32
            if (r9 == 0) goto L_0x01c0
            O0.I0 r9 = O0.I0.f9774a
            long r12 = r9.c(r1, r8)
            r4 = r4 & r19
        L_0x01c0:
            r9 = r14 & 64
            if (r9 == 0) goto L_0x01cd
            O0.I0 r9 = O0.I0.f9774a
            long r19 = r9.d(r1, r8)
            r4 = r4 & r18
            goto L_0x01cf
        L_0x01cd:
            r19 = r32
        L_0x01cf:
            r9 = r14 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x01dc
            O0.I0 r9 = O0.I0.f9774a
            long r21 = r9.b(r1, r8)
            r4 = r4 & r17
            goto L_0x01de
        L_0x01dc:
            r21 = r34
        L_0x01de:
            r9 = r14 & 256(0x100, float:3.59E-43)
            if (r9 == 0) goto L_0x01ea
            O0.I0 r9 = O0.I0.f9774a
            long r8 = r9.e(r1, r8)
            r4 = r4 & r3
            r10 = r8
        L_0x01ea:
            r1.y()
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x01fc
            r3 = -1
            java.lang.String r8 = "androidx.compose.material3.Snackbar (Snackbar.kt:113)"
            r9 = -1235788955(0xffffffffb6575b65, float:-3.2090695E-6)
            U0.C4895p.S(r9, r4, r3, r8)
        L_0x01fc:
            S0.y r3 = S0.y.f13281a
            float r3 = r3.d()
            O0.M0$d r8 = new O0.M0$d
            r25 = r8
            r26 = r5
            r27 = r6
            r28 = r38
            r29 = r2
            r30 = r21
            r32 = r10
            r25.<init>(r26, r27, r28, r29, r30, r32)
            r9 = 54
            r39 = r2
            r2 = -1829663446(0xffffffff92f18d2a, float:-1.5244038E-27)
            r16 = r5
            r5 = 1
            c1.a r2 = c1.c.e(r2, r5, r8, r1, r9)
            r5 = r4 & 14
            r8 = 12779520(0xc30000, float:1.7907922E-38)
            r5 = r5 | r8
            int r4 = r4 >> 9
            r8 = r4 & 112(0x70, float:1.57E-43)
            r5 = r5 | r8
            r8 = r4 & 896(0x380, float:1.256E-42)
            r5 = r5 | r8
            r4 = r4 & 7168(0x1c00, float:1.0045E-41)
            r4 = r4 | r5
            r5 = 80
            r8 = 0
            r9 = 0
            r25 = r0
            r26 = r7
            r27 = r12
            r29 = r19
            r31 = r8
            r32 = r3
            r33 = r9
            r34 = r2
            r35 = r1
            r36 = r4
            r37 = r5
            O0.P0.a(r25, r26, r27, r29, r31, r32, r33, r34, r35, r36, r37)
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x0259
            U0.C4895p.R()
        L_0x0259:
            r3 = r39
            r2 = r0
            r5 = r7
            r4 = r16
            r8 = r19
            r16 = r10
            r10 = r21
        L_0x0265:
            U0.Y0 r7 = r1.n()
            if (r7 == 0) goto L_0x0287
            O0.M0$e r1 = new O0.M0$e
            r0 = r1
            r23 = r1
            r1 = r2
            r2 = r6
            r24 = r7
            r6 = r12
            r12 = r16
            r14 = r38
            r15 = r40
            r16 = r41
            r0.<init>(r1, r2, r3, r4, r5, r6, r8, r10, r12, r14, r15, r16)
            r1 = r23
            r0 = r24
            r0.a(r1)
        L_0x0287:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: O0.M0.c(androidx.compose.ui.d, nI.p, nI.p, boolean, p1.i1, long, long, long, long, nI.p, U0.m, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x02a0  */
    /* JADX WARNING: Removed duplicated region for block: B:173:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x00fc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void d(O0.H0 r39, androidx.compose.ui.d r40, boolean r41, p1.i1 r42, long r43, long r45, long r47, long r49, long r51, U0.C4889m r53, int r54, int r55) {
        /*
            r1 = r39
            r15 = r54
            r13 = r55
            r0 = 274621471(0x105e641f, float:4.385891E-29)
            r2 = r53
            U0.m r2 = r2.k(r0)
            r3 = r13 & 1
            if (r3 == 0) goto L_0x0016
            r3 = r15 | 6
            goto L_0x0026
        L_0x0016:
            r3 = r15 & 6
            if (r3 != 0) goto L_0x0025
            boolean r3 = r2.V(r1)
            if (r3 == 0) goto L_0x0022
            r3 = 4
            goto L_0x0023
        L_0x0022:
            r3 = 2
        L_0x0023:
            r3 = r3 | r15
            goto L_0x0026
        L_0x0025:
            r3 = r15
        L_0x0026:
            r4 = r13 & 2
            if (r4 == 0) goto L_0x002f
            r3 = r3 | 48
        L_0x002c:
            r5 = r40
            goto L_0x0041
        L_0x002f:
            r5 = r15 & 48
            if (r5 != 0) goto L_0x002c
            r5 = r40
            boolean r6 = r2.V(r5)
            if (r6 == 0) goto L_0x003e
            r6 = 32
            goto L_0x0040
        L_0x003e:
            r6 = 16
        L_0x0040:
            r3 = r3 | r6
        L_0x0041:
            r6 = r13 & 4
            if (r6 == 0) goto L_0x004a
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x0047:
            r7 = r41
            goto L_0x005c
        L_0x004a:
            r7 = r15 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x0047
            r7 = r41
            boolean r8 = r2.b(r7)
            if (r8 == 0) goto L_0x0059
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x005b
        L_0x0059:
            r8 = 128(0x80, float:1.794E-43)
        L_0x005b:
            r3 = r3 | r8
        L_0x005c:
            r8 = r15 & 3072(0xc00, float:4.305E-42)
            if (r8 != 0) goto L_0x0075
            r8 = r13 & 8
            if (r8 != 0) goto L_0x006f
            r8 = r42
            boolean r9 = r2.V(r8)
            if (r9 == 0) goto L_0x0071
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x0073
        L_0x006f:
            r8 = r42
        L_0x0071:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x0073:
            r3 = r3 | r9
            goto L_0x0077
        L_0x0075:
            r8 = r42
        L_0x0077:
            r9 = r15 & 24576(0x6000, float:3.4438E-41)
            if (r9 != 0) goto L_0x0090
            r9 = r13 & 16
            if (r9 != 0) goto L_0x008a
            r9 = r43
            boolean r11 = r2.e(r9)
            if (r11 == 0) goto L_0x008c
            r11 = 16384(0x4000, float:2.2959E-41)
            goto L_0x008e
        L_0x008a:
            r9 = r43
        L_0x008c:
            r11 = 8192(0x2000, float:1.14794E-41)
        L_0x008e:
            r3 = r3 | r11
            goto L_0x0092
        L_0x0090:
            r9 = r43
        L_0x0092:
            r11 = 196608(0x30000, float:2.75506E-40)
            r11 = r11 & r15
            if (r11 != 0) goto L_0x00ac
            r11 = r13 & 32
            if (r11 != 0) goto L_0x00a6
            r11 = r45
            boolean r14 = r2.e(r11)
            if (r14 == 0) goto L_0x00a8
            r14 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00aa
        L_0x00a6:
            r11 = r45
        L_0x00a8:
            r14 = 65536(0x10000, float:9.18355E-41)
        L_0x00aa:
            r3 = r3 | r14
            goto L_0x00ae
        L_0x00ac:
            r11 = r45
        L_0x00ae:
            r14 = 1572864(0x180000, float:2.204052E-39)
            r14 = r14 & r15
            if (r14 != 0) goto L_0x00c7
            r14 = r13 & 64
            r0 = r47
            if (r14 != 0) goto L_0x00c2
            boolean r16 = r2.e(r0)
            if (r16 == 0) goto L_0x00c2
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00c4
        L_0x00c2:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00c4:
            r3 = r3 | r16
            goto L_0x00c9
        L_0x00c7:
            r0 = r47
        L_0x00c9:
            r16 = 12582912(0xc00000, float:1.7632415E-38)
            r16 = r15 & r16
            if (r16 != 0) goto L_0x00e2
            r14 = r13 & 128(0x80, float:1.794E-43)
            r0 = r49
            if (r14 != 0) goto L_0x00de
            boolean r14 = r2.e(r0)
            if (r14 == 0) goto L_0x00de
            r14 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00e0
        L_0x00de:
            r14 = 4194304(0x400000, float:5.877472E-39)
        L_0x00e0:
            r3 = r3 | r14
            goto L_0x00e4
        L_0x00e2:
            r0 = r49
        L_0x00e4:
            r14 = 100663296(0x6000000, float:2.4074124E-35)
            r14 = r14 & r15
            if (r14 != 0) goto L_0x00fc
            r14 = r13 & 256(0x100, float:3.59E-43)
            r0 = r51
            if (r14 != 0) goto L_0x00f8
            boolean r14 = r2.e(r0)
            if (r14 == 0) goto L_0x00f8
            r14 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x00fa
        L_0x00f8:
            r14 = 33554432(0x2000000, float:9.403955E-38)
        L_0x00fa:
            r3 = r3 | r14
            goto L_0x00fe
        L_0x00fc:
            r0 = r51
        L_0x00fe:
            r14 = 38347923(0x2492493, float:1.4777644E-37)
            r14 = r14 & r3
            r0 = 38347922(0x2492492, float:1.4777643E-37)
            if (r14 != r0) goto L_0x011f
            boolean r0 = r2.l()
            if (r0 != 0) goto L_0x010e
            goto L_0x011f
        L_0x010e:
            r2.L()
            r14 = r39
            r33 = r49
            r35 = r51
            r3 = r7
            r4 = r8
            r7 = r9
            r9 = r11
            r11 = r47
            goto L_0x029a
        L_0x011f:
            r2.G()
            r0 = r15 & 1
            r1 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r14 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r16 = -3670017(0xffffffffffc7ffff, float:NaN)
            r17 = -458753(0xfffffffffff8ffff, float:NaN)
            r18 = -57345(0xffffffffffff1fff, float:NaN)
            if (r0 == 0) goto L_0x016e
            boolean r0 = r2.O()
            if (r0 == 0) goto L_0x013c
            goto L_0x016e
        L_0x013c:
            r2.L()
            r0 = r13 & 8
            if (r0 == 0) goto L_0x0145
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x0145:
            r0 = r13 & 16
            if (r0 == 0) goto L_0x014b
            r3 = r3 & r18
        L_0x014b:
            r0 = r13 & 32
            if (r0 == 0) goto L_0x0151
            r3 = r3 & r17
        L_0x0151:
            r0 = r13 & 64
            if (r0 == 0) goto L_0x0157
            r3 = r3 & r16
        L_0x0157:
            r0 = r13 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x015c
            r3 = r3 & r14
        L_0x015c:
            r0 = r13 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0161
            r3 = r3 & r1
        L_0x0161:
            r33 = r49
            r35 = r51
            r0 = r5
            r4 = r7
            r5 = r8
            r7 = r9
            r9 = r11
            r11 = r47
            goto L_0x01da
        L_0x016e:
            if (r4 == 0) goto L_0x0173
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            goto L_0x0174
        L_0x0173:
            r0 = r5
        L_0x0174:
            if (r6 == 0) goto L_0x0178
            r4 = 0
            goto L_0x0179
        L_0x0178:
            r4 = r7
        L_0x0179:
            r5 = r13 & 8
            r6 = 6
            if (r5 == 0) goto L_0x0187
            O0.I0 r5 = O0.I0.f9774a
            p1.i1 r5 = r5.f(r2, r6)
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
            goto L_0x0188
        L_0x0187:
            r5 = r8
        L_0x0188:
            r7 = r13 & 16
            if (r7 == 0) goto L_0x0195
            O0.I0 r7 = O0.I0.f9774a
            long r7 = r7.c(r2, r6)
            r3 = r3 & r18
            goto L_0x0196
        L_0x0195:
            r7 = r9
        L_0x0196:
            r9 = r13 & 32
            if (r9 == 0) goto L_0x01a3
            O0.I0 r9 = O0.I0.f9774a
            long r9 = r9.d(r2, r6)
            r3 = r3 & r17
            goto L_0x01a4
        L_0x01a3:
            r9 = r11
        L_0x01a4:
            r11 = r13 & 64
            if (r11 == 0) goto L_0x01b1
            O0.I0 r11 = O0.I0.f9774a
            long r11 = r11.a(r2, r6)
            r3 = r3 & r16
            goto L_0x01b3
        L_0x01b1:
            r11 = r47
        L_0x01b3:
            r1 = r13 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x01c1
            O0.I0 r1 = O0.I0.f9774a
            long r17 = r1.b(r2, r6)
            r1 = r3 & r14
            r3 = r1
            goto L_0x01c3
        L_0x01c1:
            r17 = r49
        L_0x01c3:
            r1 = r13 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x01d6
            O0.I0 r1 = O0.I0.f9774a
            long r19 = r1.e(r2, r6)
            r1 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r3 = r3 & r1
            r33 = r17
            r35 = r19
            goto L_0x01da
        L_0x01d6:
            r35 = r51
            r33 = r17
        L_0x01da:
            r2.y()
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x01ec
            r1 = -1
            java.lang.String r6 = "androidx.compose.material3.Snackbar (Snackbar.kt:211)"
            r14 = 274621471(0x105e641f, float:4.385891E-29)
            U0.C4895p.S(r14, r3, r1, r6)
        L_0x01ec:
            O0.O0 r1 = r39.a()
            java.lang.String r1 = r1.b()
            r6 = 1561344786(0x5d103b12, float:6.4955752E17)
            r2.W(r6)
            if (r1 == 0) goto L_0x0212
            O0.M0$h r6 = new O0.M0$h
            r14 = r39
            r6.<init>(r11, r14, r1)
            r1 = -1378313599(0xffffffffadd89a81, float:-2.462497E-11)
            r43 = r11
            r11 = 54
            r12 = 1
            c1.a r1 = c1.c.e(r1, r12, r6, r2, r11)
            r17 = r1
            goto L_0x0218
        L_0x0212:
            r14 = r39
            r43 = r11
            r17 = 0
        L_0x0218:
            r2.P()
            r1 = 1561358724(0x5d107184, float:6.5051533E17)
            r2.W(r1)
            O0.O0 r1 = r39.a()
            boolean r1 = r1.c()
            if (r1 == 0) goto L_0x023d
            O0.M0$i r1 = new O0.M0$i
            r1.<init>(r14)
            r6 = -1812633777(0xffffffff93f5674f, float:-6.1948565E-27)
            r11 = 54
            r12 = 1
            c1.a r1 = c1.c.e(r6, r12, r1, r2, r11)
            r18 = r1
            goto L_0x023f
        L_0x023d:
            r18 = 0
        L_0x023f:
            r2.P()
            r1 = 12
            float r1 = (float) r1
            float r1 = c2.h.B(r1)
            androidx.compose.ui.d r16 = androidx.compose.foundation.layout.D.i(r0, r1)
            O0.M0$f r1 = new O0.M0$f
            r1.<init>(r14)
            r6 = -1266389126(0xffffffffb4846f7a, float:-2.4668026E-7)
            r11 = 54
            r12 = 1
            c1.a r29 = c1.c.e(r6, r12, r1, r2, r11)
            int r1 = r3 << 3
            r6 = r1 & 7168(0x1c00, float:1.0045E-41)
            r11 = 805306368(0x30000000, float:4.656613E-10)
            r6 = r6 | r11
            r11 = 57344(0xe000, float:8.0356E-41)
            r11 = r11 & r1
            r6 = r6 | r11
            r11 = 458752(0x70000, float:6.42848E-40)
            r11 = r11 & r1
            r6 = r6 | r11
            r11 = 3670016(0x380000, float:5.142788E-39)
            r1 = r1 & r11
            r1 = r1 | r6
            r6 = 29360128(0x1c00000, float:7.052966E-38)
            r6 = r6 & r3
            r1 = r1 | r6
            r6 = 234881024(0xe000000, float:1.5777218E-30)
            r3 = r3 & r6
            r31 = r1 | r3
            r32 = 0
            r19 = r4
            r20 = r5
            r21 = r7
            r23 = r9
            r25 = r33
            r27 = r35
            r30 = r2
            c(r16, r17, r18, r19, r20, r21, r23, r25, r27, r29, r30, r31, r32)
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x0295
            U0.C4895p.R()
        L_0x0295:
            r11 = r43
            r3 = r4
            r4 = r5
            r5 = r0
        L_0x029a:
            U0.Y0 r6 = r2.n()
            if (r6 == 0) goto L_0x02c0
            O0.M0$g r2 = new O0.M0$g
            r0 = r2
            r1 = r39
            r14 = r2
            r2 = r5
            r37 = r6
            r5 = r7
            r7 = r9
            r9 = r11
            r11 = r33
            r38 = r14
            r13 = r35
            r15 = r54
            r16 = r55
            r0.<init>(r1, r2, r3, r4, r5, r7, r9, r11, r13, r15, r16)
            r0 = r37
            r1 = r38
            r0.a(r1)
        L_0x02c0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: O0.M0.d(O0.H0, androidx.compose.ui.d, boolean, p1.i1, long, long, long, long, long, U0.m, int, int):void");
    }
}
