package O0;

import B0.C4373q;
import N1.C4669d;
import N1.P;
import N1.Y;
import S0.I;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import U0.C4889m;
import U0.C4895p;
import U0.C4910x;
import U0.I0;
import U0.J0;
import U0.M0;
import U0.Y0;
import U0.p1;
import XH.C16807N;
import Y1.j;
import Y1.k;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aÒ\u0001\u0010!\u001a\u00020\u001d2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00182\u0016\b\u0002\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001b2\b\b\u0002\u0010 \u001a\u00020\u001fH\u0007ø\u0001\u0000¢\u0006\u0004\b!\u0010\"\u001aæ\u0001\u0010'\u001a\u00020\u001d2\u0006\u0010\u0001\u001a\u00020#2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00182\u0014\b\u0002\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020%0$2\u0014\b\u0002\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001b2\b\b\u0002\u0010 \u001a\u00020\u001fH\u0007ø\u0001\u0000¢\u0006\u0004\b'\u0010(\u001a%\u0010,\u001a\u00020\u001d2\u0006\u0010)\u001a\u00020\u001f2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u001d0*H\u0007¢\u0006\u0004\b,\u0010-\"\u001d\u00102\u001a\b\u0012\u0004\u0012\u00020\u001f0.8\u0006¢\u0006\f\n\u0004\b,\u0010/\u001a\u0004\b0\u00101\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00063"}, d2 = {"", "text", "Landroidx/compose/ui/d;", "modifier", "Lp1/v0;", "color", "Lc2/v;", "fontSize", "LS1/x;", "fontStyle", "LS1/C;", "fontWeight", "LS1/m;", "fontFamily", "letterSpacing", "LY1/k;", "textDecoration", "LY1/j;", "textAlign", "lineHeight", "LY1/t;", "overflow", "", "softWrap", "", "maxLines", "minLines", "Lkotlin/Function1;", "LN1/P;", "LXH/N;", "onTextLayout", "LN1/Y;", "style", "b", "(Ljava/lang/String;Landroidx/compose/ui/d;JJLS1/x;LS1/C;LS1/m;JLY1/k;LY1/j;JIZIILnI/l;LN1/Y;LU0/m;III)V", "LN1/d;", "", "LB0/q;", "inlineContent", "c", "(LN1/d;Landroidx/compose/ui/d;JJLS1/x;LS1/C;LS1/m;JLY1/k;LY1/j;JIZIILjava/util/Map;LnI/l;LN1/Y;LU0/m;III)V", "value", "Lkotlin/Function0;", "content", "a", "(LN1/Y;LnI/p;LU0/m;I)V", "LU0/I0;", "LU0/I0;", "d", "()LU0/I0;", "LocalTextStyle", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class d1 {

    /* renamed from: a  reason: collision with root package name */
    private static final I0<Y> f10496a = C4910x.c(p1.s(), a.f10497c);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LN1/Y;", "b", "()LN1/Y;"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17631a<Y> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f10497c = new a();

        a() {
            super(0);
        }

        /* renamed from: b */
        public final Y invoke() {
            return I.a();
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Y f10498c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f10499d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f10500e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(Y y10, p<? super C4889m, ? super Integer, C16807N> pVar, int i10) {
            super(2);
            this.f10498c = y10;
            this.f10499d = pVar;
            this.f10500e = i10;
        }

        public final void a(C4889m mVar, int i10) {
            d1.a(this.f10498c, this.f10499d, mVar, M0.a(this.f10500e | 1));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class c extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f10501c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f10502d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ long f10503e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ long f10504f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C4830x f10505g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C f10506h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ C4820m f10507i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ long f10508j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ k f10509k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ j f10510l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ long f10511m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ int f10512n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ boolean f10513o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ int f10514p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ int f10515q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ C17642l<P, C16807N> f10516r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ Y f10517s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ int f10518t;

        /* renamed from: u  reason: collision with root package name */
        final /* synthetic */ int f10519u;

        /* renamed from: v  reason: collision with root package name */
        final /* synthetic */ int f10520v;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(String str, androidx.compose.ui.d dVar, long j10, long j11, C4830x xVar, C c10, C4820m mVar, long j12, k kVar, j jVar, long j13, int i10, boolean z10, int i11, int i12, C17642l<? super P, C16807N> lVar, Y y10, int i13, int i14, int i15) {
            super(2);
            this.f10501c = str;
            this.f10502d = dVar;
            this.f10503e = j10;
            this.f10504f = j11;
            this.f10505g = xVar;
            this.f10506h = c10;
            this.f10507i = mVar;
            this.f10508j = j12;
            this.f10509k = kVar;
            this.f10510l = jVar;
            this.f10511m = j13;
            this.f10512n = i10;
            this.f10513o = z10;
            this.f10514p = i11;
            this.f10515q = i12;
            this.f10516r = lVar;
            this.f10517s = y10;
            this.f10518t = i13;
            this.f10519u = i14;
            this.f10520v = i15;
        }

        public final void a(C4889m mVar, int i10) {
            C4889m mVar2 = mVar;
            String str = this.f10501c;
            String str2 = str;
            d1.b(str2, this.f10502d, this.f10503e, this.f10504f, this.f10505g, this.f10506h, this.f10507i, this.f10508j, this.f10509k, this.f10510l, this.f10511m, this.f10512n, this.f10513o, this.f10514p, this.f10515q, this.f10516r, this.f10517s, mVar2, M0.a(this.f10518t | 1), M0.a(this.f10519u), this.f10520v);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class d extends C17544u implements C17642l<P, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public static final d f10521c = new d();

        d() {
            super(1);
        }

        public final void a(P p10) {
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((P) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class e extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C4669d f10522c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f10523d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ long f10524e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ long f10525f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C4830x f10526g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C f10527h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ C4820m f10528i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ long f10529j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ k f10530k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ j f10531l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ long f10532m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ int f10533n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ boolean f10534o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ int f10535p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ int f10536q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ Map<String, C4373q> f10537r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ C17642l<P, C16807N> f10538s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ Y f10539t;

        /* renamed from: u  reason: collision with root package name */
        final /* synthetic */ int f10540u;

        /* renamed from: v  reason: collision with root package name */
        final /* synthetic */ int f10541v;

        /* renamed from: w  reason: collision with root package name */
        final /* synthetic */ int f10542w;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(C4669d dVar, androidx.compose.ui.d dVar2, long j10, long j11, C4830x xVar, C c10, C4820m mVar, long j12, k kVar, j jVar, long j13, int i10, boolean z10, int i11, int i12, Map<String, C4373q> map, C17642l<? super P, C16807N> lVar, Y y10, int i13, int i14, int i15) {
            super(2);
            this.f10522c = dVar;
            this.f10523d = dVar2;
            this.f10524e = j10;
            this.f10525f = j11;
            this.f10526g = xVar;
            this.f10527h = c10;
            this.f10528i = mVar;
            this.f10529j = j12;
            this.f10530k = kVar;
            this.f10531l = jVar;
            this.f10532m = j13;
            this.f10533n = i10;
            this.f10534o = z10;
            this.f10535p = i11;
            this.f10536q = i12;
            this.f10537r = map;
            this.f10538s = lVar;
            this.f10539t = y10;
            this.f10540u = i13;
            this.f10541v = i14;
            this.f10542w = i15;
        }

        public final void a(C4889m mVar, int i10) {
            C4889m mVar2 = mVar;
            C4669d dVar = this.f10522c;
            C4669d dVar2 = dVar;
            d1.c(dVar2, this.f10523d, this.f10524e, this.f10525f, this.f10526g, this.f10527h, this.f10528i, this.f10529j, this.f10530k, this.f10531l, this.f10532m, this.f10533n, this.f10534o, this.f10535p, this.f10536q, this.f10537r, this.f10538s, this.f10539t, mVar2, M0.a(this.f10540u | 1), M0.a(this.f10541v), this.f10542w);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    public static final void a(Y y10, p<? super C4889m, ? super Integer, C16807N> pVar, C4889m mVar, int i10) {
        int i11;
        C4889m k10 = mVar.k(-460300127);
        if ((i10 & 6) == 0) {
            i11 = (k10.V(y10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= k10.F(pVar) ? 32 : 16;
        }
        if ((i11 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-460300127, i11, -1, "androidx.compose.material3.ProvideTextStyle (Text.kt:346)");
            }
            I0 i02 = f10496a;
            C4910x.a(i02.d(((Y) k10.Q(i02)).J(y10)), pVar, k10, (i11 & 112) | J0.f13770i);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new b(y10, pVar, i10));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x01a0  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x01b4  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x01bb  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x01d4  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x01d9  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x01ee  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x0202  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x021e  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x0243  */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x031a  */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x0325  */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x0333  */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x0336  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x035f  */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x0366  */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x03e2  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x0408  */
    /* JADX WARNING: Removed duplicated region for block: B:265:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0129  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(java.lang.String r68, androidx.compose.ui.d r69, long r70, long r72, S1.C4830x r74, S1.C r75, S1.C4820m r76, long r77, Y1.k r79, Y1.j r80, long r81, int r83, boolean r84, int r85, int r86, nI.C17642l<? super N1.P, XH.C16807N> r87, N1.Y r88, U0.C4889m r89, int r90, int r91, int r92) {
        /*
            r14 = r90
            r15 = r91
            r13 = r92
            r0 = -2055108902(0xffffffff858186da, float:-1.2180638E-35)
            r1 = r89
            U0.m r1 = r1.k(r0)
            r2 = r13 & 1
            if (r2 == 0) goto L_0x0019
            r2 = r14 | 6
            r5 = r2
            r2 = r68
            goto L_0x002d
        L_0x0019:
            r2 = r14 & 6
            if (r2 != 0) goto L_0x002a
            r2 = r68
            boolean r5 = r1.V(r2)
            if (r5 == 0) goto L_0x0027
            r5 = 4
            goto L_0x0028
        L_0x0027:
            r5 = 2
        L_0x0028:
            r5 = r5 | r14
            goto L_0x002d
        L_0x002a:
            r2 = r68
            r5 = r14
        L_0x002d:
            r6 = r13 & 2
            if (r6 == 0) goto L_0x0036
            r5 = r5 | 48
        L_0x0033:
            r9 = r69
            goto L_0x0048
        L_0x0036:
            r9 = r14 & 48
            if (r9 != 0) goto L_0x0033
            r9 = r69
            boolean r10 = r1.V(r9)
            if (r10 == 0) goto L_0x0045
            r10 = 32
            goto L_0x0047
        L_0x0045:
            r10 = 16
        L_0x0047:
            r5 = r5 | r10
        L_0x0048:
            r10 = r13 & 4
            if (r10 == 0) goto L_0x0051
            r5 = r5 | 384(0x180, float:5.38E-43)
            r7 = r70
            goto L_0x0064
        L_0x0051:
            r3 = r14 & 384(0x180, float:5.38E-43)
            r7 = r70
            if (r3 != 0) goto L_0x0064
            boolean r17 = r1.e(r7)
            if (r17 == 0) goto L_0x0060
            r17 = 256(0x100, float:3.59E-43)
            goto L_0x0062
        L_0x0060:
            r17 = 128(0x80, float:1.794E-43)
        L_0x0062:
            r5 = r5 | r17
        L_0x0064:
            r17 = r13 & 8
            r18 = 1024(0x400, float:1.435E-42)
            r19 = 2048(0x800, float:2.87E-42)
            if (r17 == 0) goto L_0x0071
            r5 = r5 | 3072(0xc00, float:4.305E-42)
            r11 = r72
            goto L_0x0084
        L_0x0071:
            r3 = r14 & 3072(0xc00, float:4.305E-42)
            r11 = r72
            if (r3 != 0) goto L_0x0084
            boolean r22 = r1.e(r11)
            if (r22 == 0) goto L_0x0080
            r22 = r19
            goto L_0x0082
        L_0x0080:
            r22 = r18
        L_0x0082:
            r5 = r5 | r22
        L_0x0084:
            r22 = r13 & 16
            r23 = 8192(0x2000, float:1.14794E-41)
            r24 = 16384(0x4000, float:2.2959E-41)
            if (r22 == 0) goto L_0x0091
            r5 = r5 | 24576(0x6000, float:3.4438E-41)
        L_0x008e:
            r3 = r74
            goto L_0x00a4
        L_0x0091:
            r3 = r14 & 24576(0x6000, float:3.4438E-41)
            if (r3 != 0) goto L_0x008e
            r3 = r74
            boolean r26 = r1.V(r3)
            if (r26 == 0) goto L_0x00a0
            r26 = r24
            goto L_0x00a2
        L_0x00a0:
            r26 = r23
        L_0x00a2:
            r5 = r5 | r26
        L_0x00a4:
            r26 = r13 & 32
            r27 = 131072(0x20000, float:1.83671E-40)
            r28 = 196608(0x30000, float:2.75506E-40)
            r29 = 65536(0x10000, float:9.18355E-41)
            if (r26 == 0) goto L_0x00b3
            r5 = r5 | r28
            r4 = r75
            goto L_0x00c6
        L_0x00b3:
            r30 = r14 & r28
            r4 = r75
            if (r30 != 0) goto L_0x00c6
            boolean r31 = r1.V(r4)
            if (r31 == 0) goto L_0x00c2
            r31 = r27
            goto L_0x00c4
        L_0x00c2:
            r31 = r29
        L_0x00c4:
            r5 = r5 | r31
        L_0x00c6:
            r31 = r13 & 64
            r32 = 1572864(0x180000, float:2.204052E-39)
            if (r31 == 0) goto L_0x00d1
            r5 = r5 | r32
            r0 = r76
            goto L_0x00e4
        L_0x00d1:
            r33 = r14 & r32
            r0 = r76
            if (r33 != 0) goto L_0x00e4
            boolean r34 = r1.V(r0)
            if (r34 == 0) goto L_0x00e0
            r34 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e2
        L_0x00e0:
            r34 = 524288(0x80000, float:7.34684E-40)
        L_0x00e2:
            r5 = r5 | r34
        L_0x00e4:
            r0 = r13 & 128(0x80, float:1.794E-43)
            r34 = 12582912(0xc00000, float:1.7632415E-38)
            if (r0 == 0) goto L_0x00ef
            r5 = r5 | r34
            r2 = r77
            goto L_0x0102
        L_0x00ef:
            r34 = r14 & r34
            r2 = r77
            if (r34 != 0) goto L_0x0102
            boolean r34 = r1.e(r2)
            if (r34 == 0) goto L_0x00fe
            r34 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0100
        L_0x00fe:
            r34 = 4194304(0x400000, float:5.877472E-39)
        L_0x0100:
            r5 = r5 | r34
        L_0x0102:
            r2 = r13 & 256(0x100, float:3.59E-43)
            r3 = 100663296(0x6000000, float:2.4074124E-35)
            if (r2 == 0) goto L_0x010c
            r5 = r5 | r3
        L_0x0109:
            r3 = r79
            goto L_0x011e
        L_0x010c:
            r3 = r3 & r14
            if (r3 != 0) goto L_0x0109
            r3 = r79
            boolean r34 = r1.V(r3)
            if (r34 == 0) goto L_0x011a
            r34 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x011c
        L_0x011a:
            r34 = 33554432(0x2000000, float:9.403955E-38)
        L_0x011c:
            r5 = r5 | r34
        L_0x011e:
            r3 = r13 & 512(0x200, float:7.175E-43)
            r34 = 805306368(0x30000000, float:4.656613E-10)
            if (r3 == 0) goto L_0x0129
            r5 = r5 | r34
            r4 = r80
            goto L_0x013c
        L_0x0129:
            r34 = r14 & r34
            r4 = r80
            if (r34 != 0) goto L_0x013c
            boolean r34 = r1.V(r4)
            if (r34 == 0) goto L_0x0138
            r34 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x013a
        L_0x0138:
            r34 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x013a:
            r5 = r5 | r34
        L_0x013c:
            r4 = r13 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto L_0x0145
            r30 = r15 | 6
            r7 = r81
            goto L_0x015b
        L_0x0145:
            r34 = r15 & 6
            r7 = r81
            if (r34 != 0) goto L_0x0159
            boolean r34 = r1.e(r7)
            if (r34 == 0) goto L_0x0154
            r30 = 4
            goto L_0x0156
        L_0x0154:
            r30 = 2
        L_0x0156:
            r30 = r15 | r30
            goto L_0x015b
        L_0x0159:
            r30 = r15
        L_0x015b:
            r7 = r13 & 2048(0x800, float:2.87E-42)
            if (r7 == 0) goto L_0x0164
            r30 = r30 | 48
        L_0x0161:
            r8 = r30
            goto L_0x017b
        L_0x0164:
            r8 = r15 & 48
            if (r8 != 0) goto L_0x0178
            r8 = r83
            boolean r34 = r1.d(r8)
            if (r34 == 0) goto L_0x0173
            r16 = 32
            goto L_0x0175
        L_0x0173:
            r16 = 16
        L_0x0175:
            r30 = r30 | r16
            goto L_0x0161
        L_0x0178:
            r8 = r83
            goto L_0x0161
        L_0x017b:
            r9 = r13 & 4096(0x1000, float:5.74E-42)
            if (r9 == 0) goto L_0x0184
            r8 = r8 | 384(0x180, float:5.38E-43)
        L_0x0181:
            r11 = r84
            goto L_0x0197
        L_0x0184:
            r11 = r15 & 384(0x180, float:5.38E-43)
            if (r11 != 0) goto L_0x0181
            r11 = r84
            boolean r12 = r1.b(r11)
            if (r12 == 0) goto L_0x0193
            r25 = 256(0x100, float:3.59E-43)
            goto L_0x0195
        L_0x0193:
            r25 = 128(0x80, float:1.794E-43)
        L_0x0195:
            r8 = r8 | r25
        L_0x0197:
            r12 = r13 & 8192(0x2000, float:1.14794E-41)
            if (r12 == 0) goto L_0x01a0
            r8 = r8 | 3072(0xc00, float:4.305E-42)
        L_0x019d:
            r11 = r85
            goto L_0x01b0
        L_0x01a0:
            r11 = r15 & 3072(0xc00, float:4.305E-42)
            if (r11 != 0) goto L_0x019d
            r11 = r85
            boolean r16 = r1.d(r11)
            if (r16 == 0) goto L_0x01ae
            r18 = r19
        L_0x01ae:
            r8 = r8 | r18
        L_0x01b0:
            r11 = r13 & 16384(0x4000, float:2.2959E-41)
            if (r11 == 0) goto L_0x01bb
            r8 = r8 | 24576(0x6000, float:3.4438E-41)
            r16 = r11
        L_0x01b8:
            r11 = r86
            goto L_0x01cd
        L_0x01bb:
            r16 = r11
            r11 = r15 & 24576(0x6000, float:3.4438E-41)
            if (r11 != 0) goto L_0x01b8
            r11 = r86
            boolean r18 = r1.d(r11)
            if (r18 == 0) goto L_0x01cb
            r23 = r24
        L_0x01cb:
            r8 = r8 | r23
        L_0x01cd:
            r18 = 32768(0x8000, float:4.5918E-41)
            r18 = r13 & r18
            if (r18 == 0) goto L_0x01d9
            r8 = r8 | r28
            r11 = r87
            goto L_0x01ea
        L_0x01d9:
            r19 = r15 & r28
            r11 = r87
            if (r19 != 0) goto L_0x01ea
            boolean r19 = r1.F(r11)
            if (r19 == 0) goto L_0x01e6
            goto L_0x01e8
        L_0x01e6:
            r27 = r29
        L_0x01e8:
            r8 = r8 | r27
        L_0x01ea:
            r19 = r15 & r32
            if (r19 != 0) goto L_0x0202
            r19 = r13 & r29
            r11 = r88
            if (r19 != 0) goto L_0x01fd
            boolean r19 = r1.V(r11)
            if (r19 == 0) goto L_0x01fd
            r19 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x01ff
        L_0x01fd:
            r19 = 524288(0x80000, float:7.34684E-40)
        L_0x01ff:
            r8 = r8 | r19
            goto L_0x0204
        L_0x0202:
            r11 = r88
        L_0x0204:
            r19 = 306783379(0x12492493, float:6.34695E-28)
            r11 = r5 & r19
            r15 = 306783378(0x12492492, float:6.3469493E-28)
            if (r11 != r15) goto L_0x0243
            r11 = 599187(0x92493, float:8.3964E-40)
            r11 = r11 & r8
            r15 = 599186(0x92492, float:8.39638E-40)
            if (r11 != r15) goto L_0x0243
            boolean r11 = r1.l()
            if (r11 != 0) goto L_0x021e
            goto L_0x0243
        L_0x021e:
            r1.L()
            r2 = r69
            r3 = r70
            r5 = r72
            r7 = r74
            r8 = r75
            r9 = r76
            r10 = r77
            r12 = r79
            r13 = r80
            r14 = r81
            r16 = r83
            r17 = r84
            r18 = r85
            r19 = r86
            r20 = r87
            r21 = r88
            goto L_0x0402
        L_0x0243:
            r1.G()
            r11 = r14 & 1
            if (r11 == 0) goto L_0x027f
            boolean r11 = r1.O()
            if (r11 == 0) goto L_0x0251
            goto L_0x027f
        L_0x0251:
            r1.L()
            r0 = r13 & r29
            if (r0 == 0) goto L_0x025c
            r0 = -3670017(0xffffffffffc7ffff, float:NaN)
            r8 = r8 & r0
        L_0x025c:
            r6 = r69
            r10 = r70
            r19 = r72
            r17 = r74
            r21 = r75
            r22 = r76
            r23 = r77
            r0 = r79
            r2 = r80
            r3 = r81
            r7 = r83
            r9 = r84
            r12 = r85
            r25 = r86
            r15 = r87
        L_0x027a:
            r13 = r8
            r8 = r88
            goto L_0x0311
        L_0x027f:
            if (r6 == 0) goto L_0x0284
            androidx.compose.ui.d$a r6 = androidx.compose.ui.d.f18749a
            goto L_0x0286
        L_0x0284:
            r6 = r69
        L_0x0286:
            if (r10 == 0) goto L_0x028f
            p1.v0$a r10 = p1.C5747v0.f27350b
            long r10 = r10.i()
            goto L_0x0291
        L_0x028f:
            r10 = r70
        L_0x0291:
            if (r17 == 0) goto L_0x029a
            c2.v$a r15 = c2.v.f23057b
            long r19 = r15.a()
            goto L_0x029c
        L_0x029a:
            r19 = r72
        L_0x029c:
            r15 = 0
            if (r22 == 0) goto L_0x02a2
            r17 = r15
            goto L_0x02a4
        L_0x02a2:
            r17 = r74
        L_0x02a4:
            if (r26 == 0) goto L_0x02a9
            r21 = r15
            goto L_0x02ab
        L_0x02a9:
            r21 = r75
        L_0x02ab:
            if (r31 == 0) goto L_0x02b0
            r22 = r15
            goto L_0x02b2
        L_0x02b0:
            r22 = r76
        L_0x02b2:
            if (r0 == 0) goto L_0x02bb
            c2.v$a r0 = c2.v.f23057b
            long r23 = r0.a()
            goto L_0x02bd
        L_0x02bb:
            r23 = r77
        L_0x02bd:
            if (r2 == 0) goto L_0x02c1
            r0 = r15
            goto L_0x02c3
        L_0x02c1:
            r0 = r79
        L_0x02c3:
            if (r3 == 0) goto L_0x02c7
            r2 = r15
            goto L_0x02c9
        L_0x02c7:
            r2 = r80
        L_0x02c9:
            if (r4 == 0) goto L_0x02d2
            c2.v$a r3 = c2.v.f23057b
            long r3 = r3.a()
            goto L_0x02d4
        L_0x02d2:
            r3 = r81
        L_0x02d4:
            if (r7 == 0) goto L_0x02dd
            Y1.t$a r7 = Y1.t.f14827a
            int r7 = r7.a()
            goto L_0x02df
        L_0x02dd:
            r7 = r83
        L_0x02df:
            r25 = 1
            if (r9 == 0) goto L_0x02e6
            r9 = r25
            goto L_0x02e8
        L_0x02e6:
            r9 = r84
        L_0x02e8:
            if (r12 == 0) goto L_0x02ee
            r12 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x02f0
        L_0x02ee:
            r12 = r85
        L_0x02f0:
            if (r16 == 0) goto L_0x02f3
            goto L_0x02f5
        L_0x02f3:
            r25 = r86
        L_0x02f5:
            if (r18 == 0) goto L_0x02f8
            goto L_0x02fa
        L_0x02f8:
            r15 = r87
        L_0x02fa:
            r16 = r13 & r29
            r69 = r0
            if (r16 == 0) goto L_0x027a
            U0.I0<N1.Y> r0 = f10496a
            java.lang.Object r0 = r1.Q(r0)
            N1.Y r0 = (N1.Y) r0
            r16 = -3670017(0xffffffffffc7ffff, float:NaN)
            r8 = r8 & r16
            r13 = r8
            r8 = r0
            r0 = r69
        L_0x0311:
            r1.y()
            boolean r16 = U0.C4895p.J()
            if (r16 == 0) goto L_0x0325
            java.lang.String r14 = "androidx.compose.material3.Text (Text.kt:109)"
            r81 = r12
            r12 = -2055108902(0xffffffff858186da, float:-1.2180638E-35)
            U0.C4895p.S(r12, r5, r13, r14)
            goto L_0x0327
        L_0x0325:
            r81 = r12
        L_0x0327:
            r12 = -1827892941(0xffffffff930c9133, float:-1.7742073E-27)
            r1.W(r12)
            r26 = 16
            int r12 = (r10 > r26 ? 1 : (r10 == r26 ? 0 : -1))
            if (r12 == 0) goto L_0x0336
            r35 = r10
            goto L_0x035a
        L_0x0336:
            r12 = -1827892168(0xffffffff930c9438, float:-1.7743562E-27)
            r1.W(r12)
            long r26 = r8.h()
            r28 = 16
            int r12 = (r26 > r28 ? 1 : (r26 == r28 ? 0 : -1))
            if (r12 == 0) goto L_0x0347
            goto L_0x0355
        L_0x0347:
            U0.I0 r12 = O0.E.a()
            java.lang.Object r12 = r1.Q(r12)
            p1.v0 r12 = (p1.C5747v0) r12
            long r26 = r12.y()
        L_0x0355:
            r1.P()
            r35 = r26
        L_0x035a:
            r1.P()
            if (r2 == 0) goto L_0x0366
            int r12 = r2.n()
        L_0x0363:
            r54 = r12
            goto L_0x036d
        L_0x0366:
            Y1.j$a r12 = Y1.j.f14783b
            int r12 = r12.g()
            goto L_0x0363
        L_0x036d:
            r64 = 16609104(0xfd6f50, float:2.3274312E-38)
            r65 = 0
            r41 = 0
            r43 = 0
            r46 = 0
            r47 = 0
            r48 = 0
            r49 = 0
            r52 = 0
            r53 = 0
            r55 = 0
            r58 = 0
            r59 = 0
            r60 = 0
            r61 = 0
            r62 = 0
            r63 = 0
            r34 = r8
            r37 = r19
            r39 = r21
            r40 = r17
            r42 = r22
            r44 = r23
            r51 = r0
            r56 = r3
            N1.Y r12 = N1.Y.L(r34, r35, r37, r39, r40, r41, r42, r43, r44, r46, r47, r48, r49, r51, r52, r53, r54, r55, r56, r58, r59, r60, r61, r62, r63, r64, r65)
            r5 = r5 & 126(0x7e, float:1.77E-43)
            int r14 = r13 >> 6
            r14 = r14 & 7168(0x1c00, float:1.0045E-41)
            r5 = r5 | r14
            int r13 = r13 << 9
            r14 = 57344(0xe000, float:8.0356E-41)
            r14 = r14 & r13
            r5 = r5 | r14
            r14 = 458752(0x70000, float:6.42848E-40)
            r14 = r14 & r13
            r5 = r5 | r14
            r14 = 3670016(0x380000, float:5.142788E-39)
            r14 = r14 & r13
            r5 = r5 | r14
            r14 = 29360128(0x1c00000, float:7.052966E-38)
            r13 = r13 & r14
            r5 = r5 | r13
            r13 = 256(0x100, float:3.59E-43)
            r14 = 0
            r69 = r68
            r70 = r6
            r71 = r12
            r72 = r15
            r73 = r7
            r74 = r9
            r75 = r81
            r76 = r25
            r77 = r14
            r78 = r1
            r79 = r5
            r80 = r13
            B0.C4360d.b(r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80)
            boolean r5 = U0.C4895p.J()
            if (r5 == 0) goto L_0x03e5
            U0.C4895p.R()
        L_0x03e5:
            r18 = r81
            r12 = r0
            r13 = r2
            r2 = r6
            r16 = r7
            r7 = r17
            r5 = r19
            r19 = r25
            r17 = r9
            r20 = r15
            r9 = r22
            r14 = r3
            r3 = r10
            r10 = r23
            r67 = r21
            r21 = r8
            r8 = r67
        L_0x0402:
            U0.Y0 r1 = r1.n()
            if (r1 == 0) goto L_0x0420
            O0.d1$c r0 = new O0.d1$c
            r69 = r0
            r66 = r1
            r1 = r68
            r22 = r90
            r23 = r91
            r24 = r92
            r0.<init>(r1, r2, r3, r5, r7, r8, r9, r10, r12, r13, r14, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r1 = r69
            r0 = r66
            r0.a(r1)
        L_0x0420:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: O0.d1.b(java.lang.String, androidx.compose.ui.d, long, long, S1.x, S1.C, S1.m, long, Y1.k, Y1.j, long, int, boolean, int, int, nI.l, N1.Y, U0.m, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0183  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x01d3  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x01d8  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x01ef  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x01f4  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x020b  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x021f  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x023b  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x0262  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x044b  */
    /* JADX WARNING: Removed duplicated region for block: B:278:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0129  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(N1.C4669d r61, androidx.compose.ui.d r62, long r63, long r65, S1.C4830x r67, S1.C r68, S1.C4820m r69, long r70, Y1.k r72, Y1.j r73, long r74, int r76, boolean r77, int r78, int r79, java.util.Map<java.lang.String, B0.C4373q> r80, nI.C17642l<? super N1.P, XH.C16807N> r81, N1.Y r82, U0.C4889m r83, int r84, int r85, int r86) {
        /*
            r14 = r84
            r15 = r85
            r13 = r86
            r0 = 2027001676(0x78d1974c, float:3.4008085E34)
            r1 = r83
            U0.m r0 = r1.k(r0)
            r1 = r13 & 1
            if (r1 == 0) goto L_0x0019
            r1 = r14 | 6
            r4 = r1
            r1 = r61
            goto L_0x002d
        L_0x0019:
            r1 = r14 & 6
            if (r1 != 0) goto L_0x002a
            r1 = r61
            boolean r4 = r0.V(r1)
            if (r4 == 0) goto L_0x0027
            r4 = 4
            goto L_0x0028
        L_0x0027:
            r4 = 2
        L_0x0028:
            r4 = r4 | r14
            goto L_0x002d
        L_0x002a:
            r1 = r61
            r4 = r14
        L_0x002d:
            r5 = r13 & 2
            if (r5 == 0) goto L_0x0036
            r4 = r4 | 48
        L_0x0033:
            r8 = r62
            goto L_0x0048
        L_0x0036:
            r8 = r14 & 48
            if (r8 != 0) goto L_0x0033
            r8 = r62
            boolean r9 = r0.V(r8)
            if (r9 == 0) goto L_0x0045
            r9 = 32
            goto L_0x0047
        L_0x0045:
            r9 = 16
        L_0x0047:
            r4 = r4 | r9
        L_0x0048:
            r9 = r13 & 4
            if (r9 == 0) goto L_0x0051
            r4 = r4 | 384(0x180, float:5.38E-43)
            r2 = r63
            goto L_0x0064
        L_0x0051:
            r12 = r14 & 384(0x180, float:5.38E-43)
            r2 = r63
            if (r12 != 0) goto L_0x0064
            boolean r16 = r0.e(r2)
            if (r16 == 0) goto L_0x0060
            r16 = 256(0x100, float:3.59E-43)
            goto L_0x0062
        L_0x0060:
            r16 = 128(0x80, float:1.794E-43)
        L_0x0062:
            r4 = r4 | r16
        L_0x0064:
            r16 = r13 & 8
            r17 = 1024(0x400, float:1.435E-42)
            r18 = 2048(0x800, float:2.87E-42)
            if (r16 == 0) goto L_0x0071
            r4 = r4 | 3072(0xc00, float:4.305E-42)
            r7 = r65
            goto L_0x0084
        L_0x0071:
            r6 = r14 & 3072(0xc00, float:4.305E-42)
            r7 = r65
            if (r6 != 0) goto L_0x0084
            boolean r20 = r0.e(r7)
            if (r20 == 0) goto L_0x0080
            r20 = r18
            goto L_0x0082
        L_0x0080:
            r20 = r17
        L_0x0082:
            r4 = r4 | r20
        L_0x0084:
            r20 = r13 & 16
            r21 = 8192(0x2000, float:1.14794E-41)
            r22 = 16384(0x4000, float:2.2959E-41)
            if (r20 == 0) goto L_0x0091
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
        L_0x008e:
            r6 = r67
            goto L_0x00a4
        L_0x0091:
            r6 = r14 & 24576(0x6000, float:3.4438E-41)
            if (r6 != 0) goto L_0x008e
            r6 = r67
            boolean r24 = r0.V(r6)
            if (r24 == 0) goto L_0x00a0
            r24 = r22
            goto L_0x00a2
        L_0x00a0:
            r24 = r21
        L_0x00a2:
            r4 = r4 | r24
        L_0x00a4:
            r24 = r13 & 32
            r25 = 65536(0x10000, float:9.18355E-41)
            r26 = 196608(0x30000, float:2.75506E-40)
            r27 = 131072(0x20000, float:1.83671E-40)
            if (r24 == 0) goto L_0x00b3
            r4 = r4 | r26
            r10 = r68
            goto L_0x00c6
        L_0x00b3:
            r28 = r14 & r26
            r10 = r68
            if (r28 != 0) goto L_0x00c6
            boolean r29 = r0.V(r10)
            if (r29 == 0) goto L_0x00c2
            r29 = r27
            goto L_0x00c4
        L_0x00c2:
            r29 = r25
        L_0x00c4:
            r4 = r4 | r29
        L_0x00c6:
            r29 = r13 & 64
            r30 = 1572864(0x180000, float:2.204052E-39)
            if (r29 == 0) goto L_0x00d1
            r4 = r4 | r30
            r11 = r69
            goto L_0x00e4
        L_0x00d1:
            r31 = r14 & r30
            r11 = r69
            if (r31 != 0) goto L_0x00e4
            boolean r32 = r0.V(r11)
            if (r32 == 0) goto L_0x00e0
            r32 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e2
        L_0x00e0:
            r32 = 524288(0x80000, float:7.34684E-40)
        L_0x00e2:
            r4 = r4 | r32
        L_0x00e4:
            r12 = r13 & 128(0x80, float:1.794E-43)
            r33 = 12582912(0xc00000, float:1.7632415E-38)
            if (r12 == 0) goto L_0x00ef
            r4 = r4 | r33
            r1 = r70
            goto L_0x0101
        L_0x00ef:
            r34 = r14 & r33
            r1 = r70
            if (r34 != 0) goto L_0x0101
            boolean r3 = r0.e(r1)
            if (r3 == 0) goto L_0x00fe
            r3 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0100
        L_0x00fe:
            r3 = 4194304(0x400000, float:5.877472E-39)
        L_0x0100:
            r4 = r4 | r3
        L_0x0101:
            r3 = r13 & 256(0x100, float:3.59E-43)
            r34 = 100663296(0x6000000, float:2.4074124E-35)
            if (r3 == 0) goto L_0x010c
            r4 = r4 | r34
            r1 = r72
            goto L_0x011e
        L_0x010c:
            r34 = r14 & r34
            r1 = r72
            if (r34 != 0) goto L_0x011e
            boolean r2 = r0.V(r1)
            if (r2 == 0) goto L_0x011b
            r2 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x011d
        L_0x011b:
            r2 = 33554432(0x2000000, float:9.403955E-38)
        L_0x011d:
            r4 = r4 | r2
        L_0x011e:
            r2 = r13 & 512(0x200, float:7.175E-43)
            r34 = 805306368(0x30000000, float:4.656613E-10)
            if (r2 == 0) goto L_0x0129
            r4 = r4 | r34
            r1 = r73
            goto L_0x013c
        L_0x0129:
            r34 = r14 & r34
            r1 = r73
            if (r34 != 0) goto L_0x013c
            boolean r34 = r0.V(r1)
            if (r34 == 0) goto L_0x0138
            r34 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x013a
        L_0x0138:
            r34 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x013a:
            r4 = r4 | r34
        L_0x013c:
            r1 = r13 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x0145
            r32 = r15 | 6
            r6 = r74
            goto L_0x015b
        L_0x0145:
            r34 = r15 & 6
            r6 = r74
            if (r34 != 0) goto L_0x0159
            boolean r8 = r0.e(r6)
            if (r8 == 0) goto L_0x0154
            r32 = 4
            goto L_0x0156
        L_0x0154:
            r32 = 2
        L_0x0156:
            r32 = r15 | r32
            goto L_0x015b
        L_0x0159:
            r32 = r15
        L_0x015b:
            r8 = r13 & 2048(0x800, float:2.87E-42)
            if (r8 == 0) goto L_0x0166
            r32 = r32 | 48
            r6 = r76
        L_0x0163:
            r7 = r32
            goto L_0x017a
        L_0x0166:
            r34 = r15 & 48
            r6 = r76
            if (r34 != 0) goto L_0x0163
            boolean r7 = r0.d(r6)
            if (r7 == 0) goto L_0x0175
            r23 = 32
            goto L_0x0177
        L_0x0175:
            r23 = 16
        L_0x0177:
            r32 = r32 | r23
            goto L_0x0163
        L_0x017a:
            r6 = r13 & 4096(0x1000, float:5.74E-42)
            if (r6 == 0) goto L_0x0183
            r7 = r7 | 384(0x180, float:5.38E-43)
        L_0x0180:
            r10 = r77
            goto L_0x0196
        L_0x0183:
            r10 = r15 & 384(0x180, float:5.38E-43)
            if (r10 != 0) goto L_0x0180
            r10 = r77
            boolean r19 = r0.b(r10)
            if (r19 == 0) goto L_0x0192
            r28 = 256(0x100, float:3.59E-43)
            goto L_0x0194
        L_0x0192:
            r28 = 128(0x80, float:1.794E-43)
        L_0x0194:
            r7 = r7 | r28
        L_0x0196:
            r10 = r13 & 8192(0x2000, float:1.14794E-41)
            if (r10 == 0) goto L_0x019f
            r7 = r7 | 3072(0xc00, float:4.305E-42)
        L_0x019c:
            r11 = r78
            goto L_0x01af
        L_0x019f:
            r11 = r15 & 3072(0xc00, float:4.305E-42)
            if (r11 != 0) goto L_0x019c
            r11 = r78
            boolean r19 = r0.d(r11)
            if (r19 == 0) goto L_0x01ad
            r17 = r18
        L_0x01ad:
            r7 = r7 | r17
        L_0x01af:
            r11 = r13 & 16384(0x4000, float:2.2959E-41)
            if (r11 == 0) goto L_0x01ba
            r7 = r7 | 24576(0x6000, float:3.4438E-41)
            r17 = r11
        L_0x01b7:
            r11 = r79
            goto L_0x01cc
        L_0x01ba:
            r17 = r11
            r11 = r15 & 24576(0x6000, float:3.4438E-41)
            if (r11 != 0) goto L_0x01b7
            r11 = r79
            boolean r18 = r0.d(r11)
            if (r18 == 0) goto L_0x01ca
            r21 = r22
        L_0x01ca:
            r7 = r7 | r21
        L_0x01cc:
            r18 = 32768(0x8000, float:4.5918E-41)
            r18 = r13 & r18
            if (r18 == 0) goto L_0x01d8
            r7 = r7 | r26
            r11 = r80
            goto L_0x01eb
        L_0x01d8:
            r19 = r15 & r26
            r11 = r80
            if (r19 != 0) goto L_0x01eb
            boolean r19 = r0.F(r11)
            if (r19 == 0) goto L_0x01e7
            r19 = r27
            goto L_0x01e9
        L_0x01e7:
            r19 = r25
        L_0x01e9:
            r7 = r7 | r19
        L_0x01eb:
            r19 = r13 & r25
            if (r19 == 0) goto L_0x01f4
            r7 = r7 | r30
            r11 = r81
            goto L_0x0207
        L_0x01f4:
            r21 = r15 & r30
            r11 = r81
            if (r21 != 0) goto L_0x0207
            boolean r21 = r0.F(r11)
            if (r21 == 0) goto L_0x0203
            r21 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x0205
        L_0x0203:
            r21 = 524288(0x80000, float:7.34684E-40)
        L_0x0205:
            r7 = r7 | r21
        L_0x0207:
            r21 = r15 & r33
            if (r21 != 0) goto L_0x021f
            r21 = r13 & r27
            r11 = r82
            if (r21 != 0) goto L_0x021a
            boolean r21 = r0.V(r11)
            if (r21 == 0) goto L_0x021a
            r21 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x021c
        L_0x021a:
            r21 = 4194304(0x400000, float:5.877472E-39)
        L_0x021c:
            r7 = r7 | r21
            goto L_0x0221
        L_0x021f:
            r11 = r82
        L_0x0221:
            r21 = 306783379(0x12492493, float:6.34695E-28)
            r11 = r4 & r21
            r15 = 306783378(0x12492492, float:6.3469493E-28)
            if (r11 != r15) goto L_0x0262
            r11 = 4793491(0x492493, float:6.717112E-39)
            r11 = r11 & r7
            r15 = 4793490(0x492492, float:6.71711E-39)
            if (r11 != r15) goto L_0x0262
            boolean r11 = r0.l()
            if (r11 != 0) goto L_0x023b
            goto L_0x0262
        L_0x023b:
            r0.L()
            r2 = r62
            r3 = r63
            r5 = r65
            r7 = r67
            r8 = r68
            r9 = r69
            r10 = r70
            r12 = r72
            r13 = r73
            r14 = r74
            r16 = r76
            r17 = r77
            r18 = r78
            r19 = r79
            r20 = r80
            r21 = r81
            r22 = r82
            goto L_0x0445
        L_0x0262:
            r0.G()
            r11 = r14 & 1
            if (r11 == 0) goto L_0x02a0
            boolean r11 = r0.O()
            if (r11 == 0) goto L_0x0270
            goto L_0x02a0
        L_0x0270:
            r0.L()
            r1 = r13 & r27
            if (r1 == 0) goto L_0x027b
            r1 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r7 = r7 & r1
        L_0x027b:
            r5 = r62
            r21 = r63
            r15 = r65
            r11 = r67
            r20 = r68
            r1 = r69
            r2 = r70
            r6 = r72
            r9 = r73
            r10 = r76
            r12 = r77
            r17 = r78
            r18 = r79
            r19 = r80
            r55 = r81
            r56 = r82
            r13 = r7
            r7 = r74
            goto L_0x034c
        L_0x02a0:
            if (r5 == 0) goto L_0x02a5
            androidx.compose.ui.d$a r5 = androidx.compose.ui.d.f18749a
            goto L_0x02a7
        L_0x02a5:
            r5 = r62
        L_0x02a7:
            if (r9 == 0) goto L_0x02b0
            p1.v0$a r9 = p1.C5747v0.f27350b
            long r21 = r9.i()
            goto L_0x02b2
        L_0x02b0:
            r21 = r63
        L_0x02b2:
            if (r16 == 0) goto L_0x02bb
            c2.v$a r9 = c2.v.f23057b
            long r15 = r9.a()
            goto L_0x02bd
        L_0x02bb:
            r15 = r65
        L_0x02bd:
            r9 = 0
            if (r20 == 0) goto L_0x02c2
            r11 = r9
            goto L_0x02c4
        L_0x02c2:
            r11 = r67
        L_0x02c4:
            if (r24 == 0) goto L_0x02c9
            r20 = r9
            goto L_0x02cb
        L_0x02c9:
            r20 = r68
        L_0x02cb:
            if (r29 == 0) goto L_0x02d0
            r23 = r9
            goto L_0x02d2
        L_0x02d0:
            r23 = r69
        L_0x02d2:
            if (r12 == 0) goto L_0x02db
            c2.v$a r12 = c2.v.f23057b
            long r24 = r12.a()
            goto L_0x02dd
        L_0x02db:
            r24 = r70
        L_0x02dd:
            if (r3 == 0) goto L_0x02e1
            r3 = r9
            goto L_0x02e3
        L_0x02e1:
            r3 = r72
        L_0x02e3:
            if (r2 == 0) goto L_0x02e6
            goto L_0x02e8
        L_0x02e6:
            r9 = r73
        L_0x02e8:
            if (r1 == 0) goto L_0x02f1
            c2.v$a r1 = c2.v.f23057b
            long r1 = r1.a()
            goto L_0x02f3
        L_0x02f1:
            r1 = r74
        L_0x02f3:
            if (r8 == 0) goto L_0x02fc
            Y1.t$a r8 = Y1.t.f14827a
            int r8 = r8.a()
            goto L_0x02fe
        L_0x02fc:
            r8 = r76
        L_0x02fe:
            r12 = 1
            if (r6 == 0) goto L_0x0303
            r6 = r12
            goto L_0x0305
        L_0x0303:
            r6 = r77
        L_0x0305:
            if (r10 == 0) goto L_0x030b
            r10 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x030d
        L_0x030b:
            r10 = r78
        L_0x030d:
            if (r17 == 0) goto L_0x0310
            goto L_0x0312
        L_0x0310:
            r12 = r79
        L_0x0312:
            if (r18 == 0) goto L_0x0319
            java.util.Map r17 = YH.X.j()
            goto L_0x031b
        L_0x0319:
            r17 = r80
        L_0x031b:
            if (r19 == 0) goto L_0x0320
            O0.d1$d r18 = O0.d1.d.f10521c
            goto L_0x0322
        L_0x0320:
            r18 = r81
        L_0x0322:
            r19 = r13 & r27
            r62 = r1
            if (r19 == 0) goto L_0x0349
            U0.I0<N1.Y> r1 = f10496a
            java.lang.Object r1 = r0.Q(r1)
            N1.Y r1 = (N1.Y) r1
            r2 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r7 = r7 & r2
            r56 = r1
        L_0x0336:
            r13 = r7
            r19 = r17
            r55 = r18
            r1 = r23
            r17 = r10
            r18 = r12
            r12 = r6
            r10 = r8
            r7 = r62
            r6 = r3
            r2 = r24
            goto L_0x034c
        L_0x0349:
            r56 = r82
            goto L_0x0336
        L_0x034c:
            r0.y()
            boolean r23 = U0.C4895p.J()
            if (r23 == 0) goto L_0x0360
            r14 = 2027001676(0x78d1974c, float:3.4008085E34)
            r75 = r12
            java.lang.String r12 = "androidx.compose.material3.Text (Text.kt:255)"
            U0.C4895p.S(r14, r4, r13, r12)
            goto L_0x0362
        L_0x0360:
            r75 = r12
        L_0x0362:
            r12 = -1827697581(0xffffffff930f8c53, float:-1.8118323E-27)
            r0.W(r12)
            r23 = 16
            int r12 = (r21 > r23 ? 1 : (r21 == r23 ? 0 : -1))
            if (r12 == 0) goto L_0x0371
            r24 = r21
            goto L_0x0395
        L_0x0371:
            r12 = -1827696808(0xffffffff930f8f58, float:-1.8119811E-27)
            r0.W(r12)
            long r23 = r56.h()
            r25 = 16
            int r12 = (r23 > r25 ? 1 : (r23 == r25 ? 0 : -1))
            if (r12 == 0) goto L_0x0382
            goto L_0x0390
        L_0x0382:
            U0.I0 r12 = O0.E.a()
            java.lang.Object r12 = r0.Q(r12)
            p1.v0 r12 = (p1.C5747v0) r12
            long r23 = r12.y()
        L_0x0390:
            r0.P()
            r24 = r23
        L_0x0395:
            r0.P()
            if (r9 == 0) goto L_0x03a1
            int r12 = r9.n()
        L_0x039e:
            r43 = r12
            goto L_0x03a8
        L_0x03a1:
            Y1.j$a r12 = Y1.j.f14783b
            int r12 = r12.g()
            goto L_0x039e
        L_0x03a8:
            r53 = 16609104(0xfd6f50, float:2.3274312E-38)
            r54 = 0
            r30 = 0
            r32 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r41 = 0
            r42 = 0
            r44 = 0
            r47 = 0
            r48 = 0
            r49 = 0
            r50 = 0
            r51 = 0
            r52 = 0
            r23 = r56
            r26 = r15
            r28 = r20
            r29 = r11
            r31 = r1
            r33 = r2
            r40 = r6
            r45 = r7
            N1.Y r12 = N1.Y.L(r23, r24, r26, r28, r29, r30, r31, r32, r33, r35, r36, r37, r38, r40, r41, r42, r43, r44, r45, r47, r48, r49, r50, r51, r52, r53, r54)
            r4 = r4 & 126(0x7e, float:1.77E-43)
            int r14 = r13 >> 9
            r14 = r14 & 7168(0x1c00, float:1.0045E-41)
            r4 = r4 | r14
            int r13 = r13 << 9
            r14 = 57344(0xe000, float:8.0356E-41)
            r14 = r14 & r13
            r4 = r4 | r14
            r14 = 458752(0x70000, float:6.42848E-40)
            r14 = r14 & r13
            r4 = r4 | r14
            r14 = 3670016(0x380000, float:5.142788E-39)
            r14 = r14 & r13
            r4 = r4 | r14
            r14 = 29360128(0x1c00000, float:7.052966E-38)
            r14 = r14 & r13
            r4 = r4 | r14
            r14 = 234881024(0xe000000, float:1.5777218E-30)
            r13 = r13 & r14
            r4 = r4 | r13
            r13 = 512(0x200, float:7.175E-43)
            r14 = 0
            r62 = r61
            r63 = r5
            r64 = r12
            r65 = r55
            r66 = r10
            r67 = r75
            r68 = r17
            r69 = r18
            r70 = r19
            r71 = r14
            r72 = r0
            r73 = r4
            r74 = r13
            B0.C4360d.a(r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74)
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x0426
            U0.C4895p.R()
        L_0x0426:
            r12 = r6
            r13 = r9
            r9 = r1
            r58 = r17
            r17 = r75
            r59 = r2
            r2 = r5
            r5 = r15
            r3 = r21
            r21 = r55
            r22 = r56
            r14 = r7
            r16 = r10
            r7 = r11
            r8 = r20
            r10 = r59
            r20 = r19
            r19 = r18
            r18 = r58
        L_0x0445:
            U0.Y0 r1 = r0.n()
            if (r1 == 0) goto L_0x0463
            O0.d1$e r0 = new O0.d1$e
            r62 = r0
            r57 = r1
            r1 = r61
            r23 = r84
            r24 = r85
            r25 = r86
            r0.<init>(r1, r2, r3, r5, r7, r8, r9, r10, r12, r13, r14, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r1 = r62
            r0 = r57
            r0.a(r1)
        L_0x0463:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: O0.d1.c(N1.d, androidx.compose.ui.d, long, long, S1.x, S1.C, S1.m, long, Y1.k, Y1.j, long, int, boolean, int, int, java.util.Map, nI.l, N1.Y, U0.m, int, int, int):void");
    }

    public static final I0<Y> d() {
        return f10496a;
    }
}
