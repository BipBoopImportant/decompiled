package I0;

import E1.C4469b;
import E1.H;
import E1.I;
import E1.J;
import E1.K;
import E1.a0;
import G1.C4504g;
import N1.P;
import N1.Y;
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
import U0.M0;
import U0.Y0;
import XH.C16807N;
import Y1.k;
import androidx.compose.foundation.layout.C5070a;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5077h;
import androidx.compose.foundation.layout.C5079j;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.D;
import androidx.compose.ui.d;
import c2.C5267b;
import i1.C5437c;
import java.util.ArrayList;
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
import p1.i1;
import s0.C5842M;
import s0.C5862h;
import tI.C17978n;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0019\u001an\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a`\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001d\u0010\u0016\u001a\u00020\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b\u0016\u0010\u0017\u001a+\u0010\u0019\u001a\u00020\u00032\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b\u0019\u0010\u001a\u001a+\u0010\u001b\u001a\u00020\u00032\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b\u001b\u0010\u001a\"\u0014\u0010\u001d\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001c\"\u0014\u0010\u001e\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c\"\u0014\u0010\u001f\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001c\"\u0014\u0010 \u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001c\"\u0014\u0010!\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001c\"\u0014\u0010#\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001c\"\u0014\u0010%\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010\u001c\"\u0014\u0010'\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010\u001c\"\u0014\u0010)\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010\u001c\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006*"}, d2 = {"Landroidx/compose/ui/d;", "modifier", "Lkotlin/Function0;", "LXH/N;", "action", "", "actionOnNewLine", "Lp1/i1;", "shape", "Lp1/v0;", "backgroundColor", "contentColor", "Lc2/h;", "elevation", "content", "c", "(Landroidx/compose/ui/d;LnI/p;ZLp1/i1;JJFLnI/p;LU0/m;II)V", "LI0/C0;", "snackbarData", "actionColor", "d", "(LI0/C0;Landroidx/compose/ui/d;ZLp1/i1;JJJFLU0/m;II)V", "e", "(LnI/p;LU0/m;I)V", "text", "a", "(LnI/p;LnI/p;LU0/m;I)V", "b", "F", "HeightToFirstLine", "HorizontalSpacing", "HorizontalSpacingButtonSide", "SeparateButtonExtraY", "SnackbarVerticalPadding", "f", "TextEndExtraSpacing", "g", "LongButtonVerticalOffset", "h", "SnackbarMinHeightOneLine", "i", "SnackbarMinHeightTwoLines", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class H0 {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final float f7268a = c2.h.B((float) 30);

    /* renamed from: b  reason: collision with root package name */
    private static final float f7269b = c2.h.B((float) 16);

    /* renamed from: c  reason: collision with root package name */
    private static final float f7270c;

    /* renamed from: d  reason: collision with root package name */
    private static final float f7271d = c2.h.B((float) 2);

    /* renamed from: e  reason: collision with root package name */
    private static final float f7272e = c2.h.B((float) 6);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final float f7273f;

    /* renamed from: g  reason: collision with root package name */
    private static final float f7274g = c2.h.B((float) 12);
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final float f7275h = c2.h.B((float) 48);
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public static final float f7276i = c2.h.B((float) 68);

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f7277c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f7278d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f7279e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(p<? super C4889m, ? super Integer, C16807N> pVar, p<? super C4889m, ? super Integer, C16807N> pVar2, int i10) {
            super(2);
            this.f7277c = pVar;
            this.f7278d = pVar2;
            this.f7279e = i10;
        }

        public final void a(C4889m mVar, int i10) {
            H0.a(this.f7277c, this.f7278d, mVar, M0.a(this.f7279e | 1));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"LE1/K;", "", "LE1/H;", "measurables", "Lc2/b;", "constraints", "LE1/J;", "i", "(LE1/K;Ljava/util/List;J)LE1/J;"}, k = 3, mv = {1, 8, 0})
    static final class b implements I {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f7280a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f7281b;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LE1/a0$a;", "LXH/N;", "a", "(LE1/a0$a;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends C17544u implements C17642l<a0.a, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ a0 f7282c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ int f7283d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ a0 f7284e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ int f7285f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ int f7286g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(a0 a0Var, int i10, a0 a0Var2, int i11, int i12) {
                super(1);
                this.f7282c = a0Var;
                this.f7283d = i10;
                this.f7284e = a0Var2;
                this.f7285f = i11;
                this.f7286g = i12;
            }

            public final void a(a0.a aVar) {
                a0.a.m(aVar, this.f7282c, 0, this.f7283d, 0.0f, 4, (Object) null);
                a0.a.m(aVar, this.f7284e, this.f7285f, this.f7286g, 0.0f, 4, (Object) null);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((a0.a) obj);
                return C16807N.f139792a;
            }
        }

        b(String str, String str2) {
            this.f7280a = str;
            this.f7281b = str2;
        }

        public final J i(K k10, List<? extends H> list, long j10) {
            int i10;
            int i11;
            int i12;
            K k11 = k10;
            List<? extends H> list2 = list;
            String str = this.f7280a;
            int size = list.size();
            int i13 = 0;
            for (int i14 = 0; i14 < size; i14++) {
                H h10 = (H) list2.get(i14);
                if (C17542s.e(androidx.compose.ui.layout.a.a(h10), str)) {
                    a0 i02 = h10.i0(j10);
                    int e10 = C17978n.e((C5267b.l(j10) - i02.E0()) - k11.K0(H0.f7273f), C5267b.n(j10));
                    String str2 = this.f7281b;
                    int size2 = list.size();
                    int i15 = 0;
                    while (i15 < size2) {
                        H h11 = (H) list2.get(i15);
                        if (C17542s.e(androidx.compose.ui.layout.a.a(h11), str2)) {
                            a0 i03 = h11.i0(C5267b.d(j10, 0, e10, 0, 0, 9, (Object) null));
                            int n02 = i03.n0(C4469b.a());
                            int n03 = i03.n0(C4469b.b());
                            boolean z10 = true;
                            boolean z11 = (n02 == Integer.MIN_VALUE || n03 == Integer.MIN_VALUE) ? false : true;
                            if (n02 != n03 && z11) {
                                z10 = false;
                            }
                            int l10 = C5267b.l(j10) - i02.E0();
                            if (z10) {
                                i12 = Math.max(k11.K0(H0.f7275h), i02.z0());
                                int z02 = (i12 - i03.z0()) / 2;
                                int n04 = i02.n0(C4469b.a());
                                if (n04 != Integer.MIN_VALUE) {
                                    i13 = (n02 + z02) - n04;
                                }
                                i10 = i13;
                                i11 = z02;
                            } else {
                                int K02 = k11.K0(H0.f7268a) - n02;
                                int max = Math.max(k11.K0(H0.f7276i), i03.z0() + K02);
                                i11 = K02;
                                i10 = (max - i02.z0()) / 2;
                                i12 = max;
                            }
                            return K.v0(k10, C5267b.l(j10), i12, (Map) null, new a(i03, i11, i02, l10, i10), 4, (Object) null);
                        }
                        i15++;
                        long j11 = j10;
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class c extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f7287c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f7288d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f7289e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(p<? super C4889m, ? super Integer, C16807N> pVar, p<? super C4889m, ? super Integer, C16807N> pVar2, int i10) {
            super(2);
            this.f7287c = pVar;
            this.f7288d = pVar2;
            this.f7289e = i10;
        }

        public final void a(C4889m mVar, int i10) {
            H0.b(this.f7287c, this.f7288d, mVar, M0.a(this.f7289e | 1));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "a", "(LU0/m;I)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f7290c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f7291d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f7292e;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "a", "(LU0/m;I)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends C17544u implements p<C4889m, Integer, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ p<C4889m, Integer, C16807N> f7293c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ p<C4889m, Integer, C16807N> f7294d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ boolean f7295e;

            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "a", "(LU0/m;I)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: I0.H0$d$a$a  reason: collision with other inner class name */
            static final class C0094a extends C17544u implements p<C4889m, Integer, C16807N> {

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ p<C4889m, Integer, C16807N> f7296c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ p<C4889m, Integer, C16807N> f7297d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ boolean f7298e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0094a(p<? super C4889m, ? super Integer, C16807N> pVar, p<? super C4889m, ? super Integer, C16807N> pVar2, boolean z10) {
                    super(2);
                    this.f7296c = pVar;
                    this.f7297d = pVar2;
                    this.f7298e = z10;
                }

                public final void a(C4889m mVar, int i10) {
                    if ((i10 & 3) != 2 || !mVar.l()) {
                        if (C4895p.J()) {
                            C4895p.S(225114541, i10, -1, "androidx.compose.material.Snackbar.<anonymous>.<anonymous>.<anonymous> (Snackbar.kt:103)");
                        }
                        if (this.f7296c == null) {
                            mVar.W(1850967489);
                            H0.e(this.f7297d, mVar, 0);
                            mVar.P();
                        } else if (this.f7298e) {
                            mVar.W(1850969582);
                            H0.a(this.f7297d, this.f7296c, mVar, 0);
                            mVar.P();
                        } else {
                            mVar.W(1850971719);
                            H0.b(this.f7297d, this.f7296c, mVar, 0);
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
            a(p<? super C4889m, ? super Integer, C16807N> pVar, p<? super C4889m, ? super Integer, C16807N> pVar2, boolean z10) {
                super(2);
                this.f7293c = pVar;
                this.f7294d = pVar2;
                this.f7295e = z10;
            }

            public final void a(C4889m mVar, int i10) {
                if ((i10 & 3) != 2 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(1939362236, i10, -1, "androidx.compose.material.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:101)");
                    }
                    b1.a(C4553d0.f7988a.c(mVar, 6).b(), c1.c.e(225114541, true, new C0094a(this.f7293c, this.f7294d, this.f7295e), mVar, 54), mVar, 48);
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
        d(p<? super C4889m, ? super Integer, C16807N> pVar, p<? super C4889m, ? super Integer, C16807N> pVar2, boolean z10) {
            super(2);
            this.f7290c = pVar;
            this.f7291d = pVar2;
            this.f7292e = z10;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-2084221700, i10, -1, "androidx.compose.material.Snackbar.<anonymous> (Snackbar.kt:100)");
                }
                C4910x.a(r.a().d(Float.valueOf(C4578q.f8304a.c(mVar, 6))), c1.c.e(1939362236, true, new a(this.f7290c, this.f7291d, this.f7292e), mVar, 54), mVar, J0.f13770i | 48);
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
        final /* synthetic */ androidx.compose.ui.d f7299c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f7300d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f7301e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ i1 f7302f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ long f7303g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ long f7304h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ float f7305i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f7306j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ int f7307k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ int f7308l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(androidx.compose.ui.d dVar, p<? super C4889m, ? super Integer, C16807N> pVar, boolean z10, i1 i1Var, long j10, long j11, float f10, p<? super C4889m, ? super Integer, C16807N> pVar2, int i10, int i11) {
            super(2);
            this.f7299c = dVar;
            this.f7300d = pVar;
            this.f7301e = z10;
            this.f7302f = i1Var;
            this.f7303g = j10;
            this.f7304h = j11;
            this.f7305i = f10;
            this.f7306j = pVar2;
            this.f7307k = i10;
            this.f7308l = i11;
        }

        public final void a(C4889m mVar, int i10) {
            H0.c(this.f7299c, this.f7300d, this.f7301e, this.f7302f, this.f7303g, this.f7304h, this.f7305i, this.f7306j, mVar, M0.a(this.f7307k | 1), this.f7308l);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "a", "(LU0/m;I)V"}, k = 3, mv = {1, 8, 0})
    static final class f extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C0 f7309c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(C0 c02) {
            super(2);
            this.f7309c = c02;
        }

        public final void a(C4889m mVar, int i10) {
            int i11 = i10;
            if ((i11 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-261845785, i11, -1, "androidx.compose.material.Snackbar.<anonymous> (Snackbar.kt:178)");
                }
                b1.b(this.f7309c.getMessage(), (androidx.compose.ui.d) null, 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (Y1.j) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, (Y) null, mVar, 0, 0, 131070);
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
        final /* synthetic */ C0 f7310c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f7311d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f7312e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ i1 f7313f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ long f7314g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ long f7315h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ long f7316i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ float f7317j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ int f7318k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ int f7319l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(C0 c02, androidx.compose.ui.d dVar, boolean z10, i1 i1Var, long j10, long j11, long j12, float f10, int i10, int i11) {
            super(2);
            this.f7310c = c02;
            this.f7311d = dVar;
            this.f7312e = z10;
            this.f7313f = i1Var;
            this.f7314g = j10;
            this.f7315h = j11;
            this.f7316i = j12;
            this.f7317j = f10;
            this.f7318k = i10;
            this.f7319l = i11;
        }

        public final void a(C4889m mVar, int i10) {
            H0.d(this.f7310c, this.f7311d, this.f7312e, this.f7313f, this.f7314g, this.f7315h, this.f7316i, this.f7317j, mVar, M0.a(this.f7318k | 1), this.f7319l);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "a", "(LU0/m;I)V"}, k = 3, mv = {1, 8, 0})
    static final class h extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f7320c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C0 f7321d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f7322e;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        static final class a extends C17544u implements C17631a<C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C0 f7323c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(C0 c02) {
                super(0);
                this.f7323c = c02;
            }

            public final void invoke() {
                this.f7323c.c();
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ls0/M;", "LXH/N;", "a", "(Ls0/M;LU0/m;I)V"}, k = 3, mv = {1, 8, 0})
        static final class b extends C17544u implements q<C5842M, C4889m, Integer, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ String f7324c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(String str) {
                super(3);
                this.f7324c = str;
            }

            public final void a(C5842M m10, C4889m mVar, int i10) {
                int i11 = i10;
                if ((i11 & 17) != 16 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(-929149933, i11, -1, "androidx.compose.material.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:170)");
                    }
                    b1.b(this.f7324c, (androidx.compose.ui.d) null, 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (Y1.j) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, (Y) null, mVar, 0, 0, 131070);
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
        h(long j10, C0 c02, String str) {
            super(2);
            this.f7320c = j10;
            this.f7321d = c02;
            this.f7322e = str;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: nI.a} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(U0.C4889m r15, int r16) {
            /*
                r14 = this;
                r0 = r14
                r11 = r15
                r1 = r16
                r2 = r1 & 3
                r3 = 2
                if (r2 != r3) goto L_0x0014
                boolean r2 = r15.l()
                if (r2 != 0) goto L_0x0010
                goto L_0x0014
            L_0x0010:
                r15.L()
                goto L_0x007d
            L_0x0014:
                boolean r2 = U0.C4895p.J()
                if (r2 == 0) goto L_0x0023
                r2 = -1
                java.lang.String r3 = "androidx.compose.material.Snackbar.<anonymous> (Snackbar.kt:167)"
                r4 = 1843479216(0x6de142b0, float:8.7143434E27)
                U0.C4895p.S(r4, r1, r2, r3)
            L_0x0023:
                I0.h r1 = I0.C4560h.f8076a
                long r4 = r0.f7320c
                r9 = 3072(0xc00, float:4.305E-42)
                r10 = 5
                r2 = 0
                r6 = 0
                r8 = r15
                I0.g r8 = r1.i(r2, r4, r6, r8, r9, r10)
                I0.C0 r1 = r0.f7321d
                boolean r1 = r15.F(r1)
                I0.C0 r2 = r0.f7321d
                java.lang.Object r3 = r15.D()
                if (r1 != 0) goto L_0x0049
                U0.m$a r1 = U0.C4889m.f14007a
                java.lang.Object r1 = r1.a()
                if (r3 != r1) goto L_0x0051
            L_0x0049:
                I0.H0$h$a r3 = new I0.H0$h$a
                r3.<init>(r2)
                r15.u(r3)
            L_0x0051:
                r1 = r3
                nI.a r1 = (nI.C17631a) r1
                I0.H0$h$b r2 = new I0.H0$h$b
                java.lang.String r3 = r0.f7322e
                r2.<init>(r3)
                r3 = 54
                r4 = -929149933(0xffffffffc89e4c13, float:-324192.6)
                r5 = 1
                c1.a r10 = c1.c.e(r4, r5, r2, r15, r3)
                r12 = 805306368(0x30000000, float:4.656613E-10)
                r13 = 382(0x17e, float:5.35E-43)
                r2 = 0
                r3 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r9 = 0
                r11 = r15
                I0.C4564j.d(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
                boolean r1 = U0.C4895p.J()
                if (r1 == 0) goto L_0x007d
                U0.C4895p.R()
            L_0x007d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: I0.H0.h.a(U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"LE1/K;", "", "LE1/H;", "measurables", "Lc2/b;", "constraints", "LE1/J;", "i", "(LE1/K;Ljava/util/List;J)LE1/J;"}, k = 3, mv = {1, 8, 0})
    static final class i implements I {

        /* renamed from: a  reason: collision with root package name */
        public static final i f7325a = new i();

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LE1/a0$a;", "LXH/N;", "a", "(LE1/a0$a;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends C17544u implements C17642l<a0.a, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ ArrayList<a0> f7326c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ int f7327d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(ArrayList<a0> arrayList, int i10) {
                super(1);
                this.f7326c = arrayList;
                this.f7327d = i10;
            }

            public final void a(a0.a aVar) {
                ArrayList<a0> arrayList = this.f7326c;
                int i10 = this.f7327d;
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    a0 a0Var = arrayList.get(i11);
                    a0.a.m(aVar, a0Var, 0, (i10 - a0Var.z0()) / 2, 0.0f, 4, (Object) null);
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((a0.a) obj);
                return C16807N.f139792a;
            }
        }

        i() {
        }

        public final J i(K k10, List<? extends H> list, long j10) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            boolean z10 = false;
            int i10 = Integer.MIN_VALUE;
            int i11 = Integer.MIN_VALUE;
            int i12 = 0;
            for (int i13 = 0; i13 < size; i13++) {
                a0 i02 = ((H) list.get(i13)).i0(j10);
                arrayList.add(i02);
                if (i02.n0(C4469b.a()) != Integer.MIN_VALUE && (i10 == Integer.MIN_VALUE || i02.n0(C4469b.a()) < i10)) {
                    i10 = i02.n0(C4469b.a());
                }
                if (i02.n0(C4469b.b()) != Integer.MIN_VALUE && (i11 == Integer.MIN_VALUE || i02.n0(C4469b.b()) > i11)) {
                    i11 = i02.n0(C4469b.b());
                }
                i12 = Math.max(i12, i02.z0());
            }
            long j11 = j10;
            if (!(i10 == Integer.MIN_VALUE || i11 == Integer.MIN_VALUE)) {
                z10 = true;
            }
            int max = Math.max(k10.K0((i10 == i11 || !z10) ? H0.f7275h : H0.f7276i), i12);
            return K.v0(k10, C5267b.l(j10), max, (Map) null, new a(arrayList, max), 4, (Object) null);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class j extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f7328c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f7329d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(p<? super C4889m, ? super Integer, C16807N> pVar, int i10) {
            super(2);
            this.f7328c = pVar;
            this.f7329d = i10;
        }

        public final void a(C4889m mVar, int i10) {
            H0.e(this.f7328c, mVar, M0.a(this.f7329d | 1));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    static {
        float f10 = (float) 8;
        f7270c = c2.h.B(f10);
        f7273f = c2.h.B(f10);
    }

    /* access modifiers changed from: private */
    public static final void a(p<? super C4889m, ? super Integer, C16807N> pVar, p<? super C4889m, ? super Integer, C16807N> pVar2, C4889m mVar, int i10) {
        int i11;
        p<? super C4889m, ? super Integer, C16807N> pVar3 = pVar;
        p<? super C4889m, ? super Integer, C16807N> pVar4 = pVar2;
        int i12 = i10;
        C4889m k10 = mVar.k(-1229075900);
        if ((i12 & 6) == 0) {
            i11 = (k10.F(pVar3) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.F(pVar4) ? 32 : 16;
        }
        if ((i11 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1229075900, i11, -1, "androidx.compose.material.NewLineButtonSnackbar (Snackbar.kt:293)");
            }
            d.a aVar = androidx.compose.ui.d.f18749a;
            androidx.compose.ui.d h10 = androidx.compose.foundation.layout.J.h(aVar, 0.0f, 1, (Object) null);
            float f10 = f7269b;
            float f11 = f7270c;
            androidx.compose.ui.d m10 = D.m(h10, f10, 0.0f, f11, f7271d, 2, (Object) null);
            C5073d.m g10 = C5073d.f18068a.g();
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
            androidx.compose.ui.d m11 = D.m(C5070a.g(aVar, f7268a, f7274g), 0.0f, 0.0f, f11, 0.0f, 11, (Object) null);
            I h11 = C5077h.h(aVar2.o(), false);
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
            F1.c(a16, h11, aVar3.c());
            F1.c(a16, s11, aVar3.e());
            p<C4504g, Integer, C16807N> b11 = aVar3.b();
            if (a16.i() || !C17542s.e(a16.D(), Integer.valueOf(a14))) {
                a16.u(Integer.valueOf(a14));
                a16.w(Integer.valueOf(a14), b11);
            }
            F1.c(a16, e11, aVar3.d());
            C5079j jVar = C5079j.f18125a;
            pVar3.invoke(k10, Integer.valueOf(i11 & 14));
            k10.x();
            androidx.compose.ui.d b12 = hVar.b(aVar, aVar2.j());
            I h12 = C5077h.h(aVar2.o(), false);
            int a17 = C4883j.a(k10, 0);
            C4912y s12 = k10.s();
            androidx.compose.ui.d e12 = androidx.compose.ui.c.e(k10, b12);
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
            F1.c(a19, h12, aVar3.c());
            F1.c(a19, s12, aVar3.e());
            p<C4504g, Integer, C16807N> b13 = aVar3.b();
            if (a19.i() || !C17542s.e(a19.D(), Integer.valueOf(a17))) {
                a19.u(Integer.valueOf(a17));
                a19.w(Integer.valueOf(a17), b13);
            }
            F1.c(a19, e12, aVar3.d());
            pVar4.invoke(k10, Integer.valueOf((i11 >> 3) & 14));
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
            n10.a(new a(pVar3, pVar4, i12));
        }
    }

    /* access modifiers changed from: private */
    public static final void b(p<? super C4889m, ? super Integer, C16807N> pVar, p<? super C4889m, ? super Integer, C16807N> pVar2, C4889m mVar, int i10) {
        int i11;
        C4889m k10 = mVar.k(-534813202);
        if ((i10 & 6) == 0) {
            i11 = (k10.F(pVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= k10.F(pVar2) ? 32 : 16;
        }
        if ((i11 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-534813202, i11, -1, "androidx.compose.material.OneRowSnackbar (Snackbar.kt:314)");
            }
            d.a aVar = androidx.compose.ui.d.f18749a;
            androidx.compose.ui.d m10 = D.m(aVar, f7269b, 0.0f, f7270c, 0.0f, 10, (Object) null);
            Object D10 = k10.D();
            if (D10 == C4889m.f14007a.a()) {
                D10 = new b("action", "text");
                k10.u(D10);
            }
            I i12 = (I) D10;
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
            F1.c(a12, i12, aVar2.c());
            F1.c(a12, s10, aVar2.e());
            p<C4504g, Integer, C16807N> b10 = aVar2.b();
            if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                a12.u(Integer.valueOf(a10));
                a12.w(Integer.valueOf(a10), b10);
            }
            F1.c(a12, e10, aVar2.d());
            androidx.compose.ui.d k11 = D.k(androidx.compose.ui.layout.a.b(aVar, "text"), 0.0f, f7272e, 1, (Object) null);
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
            pVar.invoke(k10, Integer.valueOf(i11 & 14));
            k10.x();
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
            pVar2.invoke(k10, Integer.valueOf((i11 >> 3) & 14));
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
            n10.a(new c(pVar, pVar2, i10));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:128:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x01d7  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x01ea  */
    /* JADX WARNING: Removed duplicated region for block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0108  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(androidx.compose.ui.d r27, nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r28, boolean r29, p1.i1 r30, long r31, long r33, float r35, nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r36, U0.C4889m r37, int r38, int r39) {
        /*
            r10 = r36
            r11 = r38
            r12 = r39
            r0 = -558258760(0xffffffffdeb9a5b8, float:-6.6886503E18)
            r1 = r37
            U0.m r1 = r1.k(r0)
            r2 = r12 & 1
            if (r2 == 0) goto L_0x0019
            r3 = r11 | 6
            r4 = r3
            r3 = r27
            goto L_0x002d
        L_0x0019:
            r3 = r11 & 6
            if (r3 != 0) goto L_0x002a
            r3 = r27
            boolean r4 = r1.V(r3)
            if (r4 == 0) goto L_0x0027
            r4 = 4
            goto L_0x0028
        L_0x0027:
            r4 = 2
        L_0x0028:
            r4 = r4 | r11
            goto L_0x002d
        L_0x002a:
            r3 = r27
            r4 = r11
        L_0x002d:
            r5 = r12 & 2
            if (r5 == 0) goto L_0x0036
            r4 = r4 | 48
        L_0x0033:
            r6 = r28
            goto L_0x0048
        L_0x0036:
            r6 = r11 & 48
            if (r6 != 0) goto L_0x0033
            r6 = r28
            boolean r7 = r1.F(r6)
            if (r7 == 0) goto L_0x0045
            r7 = 32
            goto L_0x0047
        L_0x0045:
            r7 = 16
        L_0x0047:
            r4 = r4 | r7
        L_0x0048:
            r7 = r12 & 4
            if (r7 == 0) goto L_0x0051
            r4 = r4 | 384(0x180, float:5.38E-43)
        L_0x004e:
            r8 = r29
            goto L_0x0063
        L_0x0051:
            r8 = r11 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L_0x004e
            r8 = r29
            boolean r9 = r1.b(r8)
            if (r9 == 0) goto L_0x0060
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x0062
        L_0x0060:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0062:
            r4 = r4 | r9
        L_0x0063:
            r9 = r11 & 3072(0xc00, float:4.305E-42)
            if (r9 != 0) goto L_0x007c
            r9 = r12 & 8
            if (r9 != 0) goto L_0x0076
            r9 = r30
            boolean r13 = r1.V(r9)
            if (r13 == 0) goto L_0x0078
            r13 = 2048(0x800, float:2.87E-42)
            goto L_0x007a
        L_0x0076:
            r9 = r30
        L_0x0078:
            r13 = 1024(0x400, float:1.435E-42)
        L_0x007a:
            r4 = r4 | r13
            goto L_0x007e
        L_0x007c:
            r9 = r30
        L_0x007e:
            r13 = r11 & 24576(0x6000, float:3.4438E-41)
            if (r13 != 0) goto L_0x0097
            r13 = r12 & 16
            if (r13 != 0) goto L_0x0091
            r13 = r31
            boolean r15 = r1.e(r13)
            if (r15 == 0) goto L_0x0093
            r15 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0095
        L_0x0091:
            r13 = r31
        L_0x0093:
            r15 = 8192(0x2000, float:1.14794E-41)
        L_0x0095:
            r4 = r4 | r15
            goto L_0x0099
        L_0x0097:
            r13 = r31
        L_0x0099:
            r15 = 196608(0x30000, float:2.75506E-40)
            r15 = r15 & r11
            if (r15 != 0) goto L_0x00b1
            r15 = r12 & 32
            r8 = r33
            if (r15 != 0) goto L_0x00ad
            boolean r15 = r1.e(r8)
            if (r15 == 0) goto L_0x00ad
            r15 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00af
        L_0x00ad:
            r15 = 65536(0x10000, float:9.18355E-41)
        L_0x00af:
            r4 = r4 | r15
            goto L_0x00b3
        L_0x00b1:
            r8 = r33
        L_0x00b3:
            r15 = r12 & 64
            r16 = 1572864(0x180000, float:2.204052E-39)
            if (r15 == 0) goto L_0x00be
            r4 = r4 | r16
            r0 = r35
            goto L_0x00d1
        L_0x00be:
            r17 = r11 & r16
            r0 = r35
            if (r17 != 0) goto L_0x00d1
            boolean r18 = r1.c(r0)
            if (r18 == 0) goto L_0x00cd
            r18 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00cf
        L_0x00cd:
            r18 = 524288(0x80000, float:7.34684E-40)
        L_0x00cf:
            r4 = r4 | r18
        L_0x00d1:
            r0 = r12 & 128(0x80, float:1.794E-43)
            r18 = 12582912(0xc00000, float:1.7632415E-38)
            if (r0 == 0) goto L_0x00da
            r4 = r4 | r18
            goto L_0x00ea
        L_0x00da:
            r0 = r11 & r18
            if (r0 != 0) goto L_0x00ea
            boolean r0 = r1.F(r10)
            if (r0 == 0) goto L_0x00e7
            r0 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00e9
        L_0x00e7:
            r0 = 4194304(0x400000, float:5.877472E-39)
        L_0x00e9:
            r4 = r4 | r0
        L_0x00ea:
            r0 = 4793491(0x492493, float:6.717112E-39)
            r0 = r0 & r4
            r3 = 4793490(0x492492, float:6.71711E-39)
            if (r0 != r3) goto L_0x0108
            boolean r0 = r1.l()
            if (r0 != 0) goto L_0x00fa
            goto L_0x0108
        L_0x00fa:
            r1.L()
            r2 = r27
            r3 = r29
            r4 = r30
            r7 = r8
            r9 = r35
            goto L_0x01e4
        L_0x0108:
            r1.G()
            r0 = r11 & 1
            r3 = -458753(0xfffffffffff8ffff, float:NaN)
            r18 = -57345(0xffffffffffff1fff, float:NaN)
            if (r0 == 0) goto L_0x013e
            boolean r0 = r1.O()
            if (r0 == 0) goto L_0x011c
            goto L_0x013e
        L_0x011c:
            r1.L()
            r0 = r12 & 8
            if (r0 == 0) goto L_0x0125
            r4 = r4 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x0125:
            r0 = r12 & 16
            if (r0 == 0) goto L_0x012b
            r4 = r4 & r18
        L_0x012b:
            r0 = r12 & 32
            if (r0 == 0) goto L_0x0130
            r4 = r4 & r3
        L_0x0130:
            r0 = r27
            r2 = r29
            r5 = r30
        L_0x0136:
            r7 = r35
        L_0x0138:
            r25 = r13
            r13 = r4
            r3 = r25
            goto L_0x0188
        L_0x013e:
            if (r2 == 0) goto L_0x0143
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            goto L_0x0145
        L_0x0143:
            r0 = r27
        L_0x0145:
            if (r5 == 0) goto L_0x0149
            r2 = 0
            r6 = r2
        L_0x0149:
            if (r7 == 0) goto L_0x014d
            r2 = 0
            goto L_0x014f
        L_0x014d:
            r2 = r29
        L_0x014f:
            r5 = r12 & 8
            r7 = 6
            if (r5 == 0) goto L_0x0161
            I0.d0 r5 = I0.C4553d0.f7988a
            I0.A0 r5 = r5.b(r1, r7)
            A0.a r5 = r5.c()
            r4 = r4 & -7169(0xffffffffffffe3ff, float:NaN)
            goto L_0x0163
        L_0x0161:
            r5 = r30
        L_0x0163:
            r19 = r12 & 16
            if (r19 == 0) goto L_0x016f
            I0.D0 r13 = I0.D0.f7140a
            long r13 = r13.a(r1, r7)
            r4 = r4 & r18
        L_0x016f:
            r18 = r12 & 32
            if (r18 == 0) goto L_0x017f
            I0.d0 r8 = I0.C4553d0.f7988a
            I0.l r8 = r8.a(r1, r7)
            long r8 = r8.n()
            r3 = r3 & r4
            r4 = r3
        L_0x017f:
            if (r15 == 0) goto L_0x0136
            float r3 = (float) r7
            float r3 = c2.h.B(r3)
            r7 = r3
            goto L_0x0138
        L_0x0188:
            r1.y()
            boolean r14 = U0.C4895p.J()
            if (r14 == 0) goto L_0x019a
            r14 = -1
            java.lang.String r15 = "androidx.compose.material.Snackbar (Snackbar.kt:92)"
            r11 = -558258760(0xffffffffdeb9a5b8, float:-6.6886503E18)
            U0.C4895p.S(r11, r13, r14, r15)
        L_0x019a:
            I0.H0$d r11 = new I0.H0$d
            r11.<init>(r6, r10, r2)
            r14 = 54
            r15 = -2084221700(0xffffffff83c54cfc, float:-1.1596294E-36)
            r27 = r2
            r2 = 1
            c1.a r21 = c1.c.e(r15, r2, r11, r1, r14)
            r2 = r13 & 14
            r2 = r2 | r16
            int r11 = r13 >> 6
            r14 = r11 & 112(0x70, float:1.57E-43)
            r2 = r2 | r14
            r14 = r11 & 896(0x380, float:1.256E-42)
            r2 = r2 | r14
            r11 = r11 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 | r11
            int r11 = r13 >> 3
            r13 = 458752(0x70000, float:6.42848E-40)
            r11 = r11 & r13
            r23 = r2 | r11
            r24 = 16
            r19 = 0
            r13 = r0
            r14 = r5
            r15 = r3
            r17 = r8
            r20 = r7
            r22 = r1
            I0.L0.a(r13, r14, r15, r17, r19, r20, r21, r22, r23, r24)
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x01da
            U0.C4895p.R()
        L_0x01da:
            r2 = r0
            r13 = r3
            r4 = r5
            r3 = r27
            r25 = r8
            r9 = r7
            r7 = r25
        L_0x01e4:
            U0.Y0 r15 = r1.n()
            if (r15 == 0) goto L_0x01fd
            I0.H0$e r11 = new I0.H0$e
            r0 = r11
            r1 = r2
            r2 = r6
            r5 = r13
            r10 = r36
            r13 = r11
            r11 = r38
            r12 = r39
            r0.<init>(r1, r2, r3, r4, r5, r7, r9, r10, r11, r12)
            r15.a(r13)
        L_0x01fd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: I0.H0.c(androidx.compose.ui.d, nI.p, boolean, p1.i1, long, long, float, nI.p, U0.m, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:144:0x0238  */
    /* JADX WARNING: Removed duplicated region for block: B:146:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0109  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void d(I0.C0 r27, androidx.compose.ui.d r28, boolean r29, p1.i1 r30, long r31, long r33, long r35, float r37, U0.C4889m r38, int r39, int r40) {
        /*
            r1 = r27
            r12 = r39
            r13 = r40
            r0 = 258660814(0xf6ad9ce, float:1.15790384E-29)
            r2 = r38
            U0.m r2 = r2.k(r0)
            r3 = r13 & 1
            if (r3 == 0) goto L_0x0016
            r3 = r12 | 6
            goto L_0x002f
        L_0x0016:
            r3 = r12 & 6
            if (r3 != 0) goto L_0x002e
            r3 = r12 & 8
            if (r3 != 0) goto L_0x0023
            boolean r3 = r2.V(r1)
            goto L_0x0027
        L_0x0023:
            boolean r3 = r2.F(r1)
        L_0x0027:
            if (r3 == 0) goto L_0x002b
            r3 = 4
            goto L_0x002c
        L_0x002b:
            r3 = 2
        L_0x002c:
            r3 = r3 | r12
            goto L_0x002f
        L_0x002e:
            r3 = r12
        L_0x002f:
            r4 = r13 & 2
            if (r4 == 0) goto L_0x0038
            r3 = r3 | 48
        L_0x0035:
            r5 = r28
            goto L_0x004a
        L_0x0038:
            r5 = r12 & 48
            if (r5 != 0) goto L_0x0035
            r5 = r28
            boolean r6 = r2.V(r5)
            if (r6 == 0) goto L_0x0047
            r6 = 32
            goto L_0x0049
        L_0x0047:
            r6 = 16
        L_0x0049:
            r3 = r3 | r6
        L_0x004a:
            r6 = r13 & 4
            if (r6 == 0) goto L_0x0053
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x0050:
            r7 = r29
            goto L_0x0065
        L_0x0053:
            r7 = r12 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x0050
            r7 = r29
            boolean r8 = r2.b(r7)
            if (r8 == 0) goto L_0x0062
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0064
        L_0x0062:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0064:
            r3 = r3 | r8
        L_0x0065:
            r8 = r12 & 3072(0xc00, float:4.305E-42)
            if (r8 != 0) goto L_0x007e
            r8 = r13 & 8
            if (r8 != 0) goto L_0x0078
            r8 = r30
            boolean r9 = r2.V(r8)
            if (r9 == 0) goto L_0x007a
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x007c
        L_0x0078:
            r8 = r30
        L_0x007a:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x007c:
            r3 = r3 | r9
            goto L_0x0080
        L_0x007e:
            r8 = r30
        L_0x0080:
            r9 = r12 & 24576(0x6000, float:3.4438E-41)
            if (r9 != 0) goto L_0x0099
            r9 = r13 & 16
            if (r9 != 0) goto L_0x0093
            r9 = r31
            boolean r11 = r2.e(r9)
            if (r11 == 0) goto L_0x0095
            r11 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0097
        L_0x0093:
            r9 = r31
        L_0x0095:
            r11 = 8192(0x2000, float:1.14794E-41)
        L_0x0097:
            r3 = r3 | r11
            goto L_0x009b
        L_0x0099:
            r9 = r31
        L_0x009b:
            r11 = 196608(0x30000, float:2.75506E-40)
            r11 = r11 & r12
            if (r11 != 0) goto L_0x00b3
            r11 = r13 & 32
            r14 = r33
            if (r11 != 0) goto L_0x00af
            boolean r11 = r2.e(r14)
            if (r11 == 0) goto L_0x00af
            r11 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b1
        L_0x00af:
            r11 = 65536(0x10000, float:9.18355E-41)
        L_0x00b1:
            r3 = r3 | r11
            goto L_0x00b5
        L_0x00b3:
            r14 = r33
        L_0x00b5:
            r11 = 1572864(0x180000, float:2.204052E-39)
            r11 = r11 & r12
            if (r11 != 0) goto L_0x00ce
            r11 = r13 & 64
            r0 = r35
            if (r11 != 0) goto L_0x00c9
            boolean r16 = r2.e(r0)
            if (r16 == 0) goto L_0x00c9
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00cb
        L_0x00c9:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00cb:
            r3 = r3 | r16
            goto L_0x00d0
        L_0x00ce:
            r0 = r35
        L_0x00d0:
            r11 = r13 & 128(0x80, float:1.794E-43)
            r16 = 12582912(0xc00000, float:1.7632415E-38)
            if (r11 == 0) goto L_0x00db
            r3 = r3 | r16
            r0 = r37
            goto L_0x00ed
        L_0x00db:
            r17 = r12 & r16
            r0 = r37
            if (r17 != 0) goto L_0x00ed
            boolean r1 = r2.c(r0)
            if (r1 == 0) goto L_0x00ea
            r1 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00ec
        L_0x00ea:
            r1 = 4194304(0x400000, float:5.877472E-39)
        L_0x00ec:
            r3 = r3 | r1
        L_0x00ed:
            r1 = 4793491(0x492493, float:6.717112E-39)
            r1 = r1 & r3
            r0 = 4793490(0x492492, float:6.71711E-39)
            if (r1 != r0) goto L_0x0109
            boolean r0 = r2.l()
            if (r0 != 0) goto L_0x00fd
            goto L_0x0109
        L_0x00fd:
            r2.L()
            r11 = r35
            r13 = r37
            r3 = r7
            r4 = r8
            r7 = r14
            goto L_0x0232
        L_0x0109:
            r2.G()
            r0 = r12 & 1
            r1 = -3670017(0xffffffffffc7ffff, float:NaN)
            r17 = -458753(0xfffffffffff8ffff, float:NaN)
            r18 = -57345(0xffffffffffff1fff, float:NaN)
            if (r0 == 0) goto L_0x0141
            boolean r0 = r2.O()
            if (r0 == 0) goto L_0x0120
            goto L_0x0141
        L_0x0120:
            r2.L()
            r0 = r13 & 8
            if (r0 == 0) goto L_0x0129
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x0129:
            r0 = r13 & 16
            if (r0 == 0) goto L_0x012f
            r3 = r3 & r18
        L_0x012f:
            r0 = r13 & 32
            if (r0 == 0) goto L_0x0135
            r3 = r3 & r17
        L_0x0135:
            r0 = r13 & 64
            if (r0 == 0) goto L_0x013a
            r3 = r3 & r1
        L_0x013a:
            r6 = r37
            r11 = r3
            r0 = r14
            r3 = r35
            goto L_0x0198
        L_0x0141:
            if (r4 == 0) goto L_0x0146
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            r5 = r0
        L_0x0146:
            if (r6 == 0) goto L_0x014a
            r0 = 0
            r7 = r0
        L_0x014a:
            r0 = r13 & 8
            r4 = 6
            if (r0 == 0) goto L_0x015c
            I0.d0 r0 = I0.C4553d0.f7988a
            I0.A0 r0 = r0.b(r2, r4)
            A0.a r0 = r0.c()
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
            r8 = r0
        L_0x015c:
            r0 = r13 & 16
            if (r0 == 0) goto L_0x0168
            I0.D0 r0 = I0.D0.f7140a
            long r9 = r0.a(r2, r4)
            r3 = r3 & r18
        L_0x0168:
            r0 = r13 & 32
            if (r0 == 0) goto L_0x0178
            I0.d0 r0 = I0.C4553d0.f7988a
            I0.l r0 = r0.a(r2, r4)
            long r14 = r0.n()
            r3 = r3 & r17
        L_0x0178:
            r0 = r13 & 64
            if (r0 == 0) goto L_0x0186
            I0.D0 r0 = I0.D0.f7140a
            long r17 = r0.b(r2, r4)
            r0 = r3 & r1
            r3 = r0
            goto L_0x0188
        L_0x0186:
            r17 = r35
        L_0x0188:
            if (r11 == 0) goto L_0x0195
            float r0 = (float) r4
            float r0 = c2.h.B(r0)
            r6 = r0
        L_0x0190:
            r11 = r3
            r0 = r14
            r3 = r17
            goto L_0x0198
        L_0x0195:
            r6 = r37
            goto L_0x0190
        L_0x0198:
            r2.y()
            boolean r14 = U0.C4895p.J()
            if (r14 == 0) goto L_0x01aa
            r14 = -1
            java.lang.String r15 = "androidx.compose.material.Snackbar (Snackbar.kt:163)"
            r12 = 258660814(0xf6ad9ce, float:1.15790384E-29)
            U0.C4895p.S(r12, r11, r14, r15)
        L_0x01aa:
            java.lang.String r12 = r27.b()
            if (r12 == 0) goto L_0x01ce
            r14 = 1609178760(0x5fea1e88, float:3.3740142E19)
            r2.W(r14)
            I0.H0$h r14 = new I0.H0$h
            r15 = r27
            r14.<init>(r3, r15, r12)
            r12 = 1843479216(0x6de142b0, float:8.7143434E27)
            r30 = r3
            r3 = 54
            r4 = 1
            c1.a r12 = c1.c.e(r12, r4, r14, r2, r3)
            r2.P()
            r3 = r12
            goto L_0x01dc
        L_0x01ce:
            r15 = r27
            r30 = r3
            r3 = 1609445763(0x5fee3183, float:3.4327287E19)
            r2.W(r3)
            r2.P()
            r3 = 0
        L_0x01dc:
            r4 = 12
            float r4 = (float) r4
            float r4 = c2.h.B(r4)
            androidx.compose.ui.d r14 = androidx.compose.foundation.layout.D.i(r5, r4)
            I0.H0$f r4 = new I0.H0$f
            r4.<init>(r15)
            r12 = -261845785(0xfffffffff0648ce7, float:-2.829317E29)
            r32 = r5
            r5 = 54
            r13 = 1
            c1.a r23 = c1.c.e(r12, r13, r4, r2, r5)
            r4 = r11 & 896(0x380, float:1.256E-42)
            r4 = r4 | r16
            r5 = r11 & 7168(0x1c00, float:1.0045E-41)
            r4 = r4 | r5
            r5 = 57344(0xe000, float:8.0356E-41)
            r5 = r5 & r11
            r4 = r4 | r5
            r5 = 458752(0x70000, float:6.42848E-40)
            r5 = r5 & r11
            r4 = r4 | r5
            int r5 = r11 >> 3
            r11 = 3670016(0x380000, float:5.142788E-39)
            r5 = r5 & r11
            r25 = r4 | r5
            r26 = 0
            r15 = r3
            r16 = r7
            r17 = r8
            r18 = r9
            r20 = r0
            r22 = r6
            r24 = r2
            c(r14, r15, r16, r17, r18, r20, r22, r23, r24, r25, r26)
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x022a
            U0.C4895p.R()
        L_0x022a:
            r11 = r30
            r5 = r32
            r13 = r6
            r3 = r7
            r4 = r8
            r7 = r0
        L_0x0232:
            U0.Y0 r14 = r2.n()
            if (r14 == 0) goto L_0x024b
            I0.H0$g r15 = new I0.H0$g
            r0 = r15
            r1 = r27
            r2 = r5
            r5 = r9
            r9 = r11
            r11 = r13
            r12 = r39
            r13 = r40
            r0.<init>(r1, r2, r3, r4, r5, r7, r9, r11, r12, r13)
            r14.a(r15)
        L_0x024b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: I0.H0.d(I0.C0, androidx.compose.ui.d, boolean, p1.i1, long, long, long, float, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final void e(p<? super C4889m, ? super Integer, C16807N> pVar, C4889m mVar, int i10) {
        int i11;
        C4889m k10 = mVar.k(917397959);
        if ((i10 & 6) == 0) {
            i11 = (k10.F(pVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) != 2 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(917397959, i11, -1, "androidx.compose.material.TextOnlySnackbar (Snackbar.kt:238)");
            }
            i iVar = i.f7325a;
            d.a aVar = androidx.compose.ui.d.f18749a;
            int a10 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            androidx.compose.ui.d e10 = androidx.compose.ui.c.e(k10, aVar);
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
            F1.c(a12, iVar, aVar2.c());
            F1.c(a12, s10, aVar2.e());
            p<C4504g, Integer, C16807N> b10 = aVar2.b();
            if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                a12.u(Integer.valueOf(a10));
                a12.w(Integer.valueOf(a10), b10);
            }
            F1.c(a12, e10, aVar2.d());
            androidx.compose.ui.d j10 = D.j(aVar, f7269b, f7272e);
            I h10 = C5077h.h(C5437c.f24302a.o(), false);
            int a13 = C4883j.a(k10, 0);
            C4912y s11 = k10.s();
            androidx.compose.ui.d e11 = androidx.compose.ui.c.e(k10, j10);
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
            pVar.invoke(k10, Integer.valueOf(i11 & 14));
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
            n10.a(new j(pVar, i10));
        }
    }
}
