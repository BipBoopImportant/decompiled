package I0;

import B0.C4373q;
import N1.C4669d;
import N1.P;
import N1.Y;
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
import p1.C5753y0;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aÒ\u0001\u0010!\u001a\u00020\u001d2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00182\u0016\b\u0002\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001b2\b\b\u0002\u0010 \u001a\u00020\u001fH\u0007ø\u0001\u0000¢\u0006\u0004\b!\u0010\"\u001aÆ\u0001\u0010#\u001a\u00020\u001d2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\u0014\b\u0002\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001b2\b\b\u0002\u0010 \u001a\u00020\u001fH\u0007ø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001aæ\u0001\u0010)\u001a\u00020\u001d2\u0006\u0010\u0001\u001a\u00020%2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00182\u0014\b\u0002\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020'0&2\u0014\b\u0002\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001b2\b\b\u0002\u0010 \u001a\u00020\u001fH\u0007ø\u0001\u0000¢\u0006\u0004\b)\u0010*\u001a%\u0010.\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020\u001f2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u001d0,H\u0007¢\u0006\u0004\b.\u0010/\"\u001d\u00104\u001a\b\u0012\u0004\u0012\u00020\u001f008\u0006¢\u0006\f\n\u0004\b.\u00101\u001a\u0004\b2\u00103\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00065"}, d2 = {"", "text", "Landroidx/compose/ui/d;", "modifier", "Lp1/v0;", "color", "Lc2/v;", "fontSize", "LS1/x;", "fontStyle", "LS1/C;", "fontWeight", "LS1/m;", "fontFamily", "letterSpacing", "LY1/k;", "textDecoration", "LY1/j;", "textAlign", "lineHeight", "LY1/t;", "overflow", "", "softWrap", "", "maxLines", "minLines", "Lkotlin/Function1;", "LN1/P;", "LXH/N;", "onTextLayout", "LN1/Y;", "style", "b", "(Ljava/lang/String;Landroidx/compose/ui/d;JJLS1/x;LS1/C;LS1/m;JLY1/k;LY1/j;JIZIILnI/l;LN1/Y;LU0/m;III)V", "d", "(Ljava/lang/String;Landroidx/compose/ui/d;JJLS1/x;LS1/C;LS1/m;JLY1/k;LY1/j;JIZILnI/l;LN1/Y;LU0/m;III)V", "LN1/d;", "", "LB0/q;", "inlineContent", "c", "(LN1/d;Landroidx/compose/ui/d;JJLS1/x;LS1/C;LS1/m;JLY1/k;LY1/j;JIZIILjava/util/Map;LnI/l;LN1/Y;LU0/m;III)V", "value", "Lkotlin/Function0;", "content", "a", "(LN1/Y;LnI/p;LU0/m;I)V", "LU0/I0;", "LU0/I0;", "e", "()LU0/I0;", "LocalTextStyle", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class b1 {

    /* renamed from: a  reason: collision with root package name */
    private static final I0<Y> f7865a = C4910x.c(p1.s(), a.f7866c);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LN1/Y;", "b", "()LN1/Y;"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17631a<Y> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f7866c = new a();

        a() {
            super(0);
        }

        /* renamed from: b */
        public final Y invoke() {
            return e1.b();
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Y f7867c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f7868d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f7869e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(Y y10, p<? super C4889m, ? super Integer, C16807N> pVar, int i10) {
            super(2);
            this.f7867c = y10;
            this.f7868d = pVar;
            this.f7869e = i10;
        }

        public final void a(C4889m mVar, int i10) {
            b1.a(this.f7867c, this.f7868d, mVar, M0.a(this.f7869e | 1));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lp1/v0;", "a", "()J"}, k = 3, mv = {1, 8, 0})
    static final class c implements C5753y0 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f7870a;

        c(long j10) {
            this.f7870a = j10;
        }

        public final long a() {
            return this.f7870a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class d extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f7871c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f7872d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ long f7873e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ long f7874f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C4830x f7875g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C f7876h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ C4820m f7877i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ long f7878j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ k f7879k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ j f7880l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ long f7881m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ int f7882n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ boolean f7883o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ int f7884p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ int f7885q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ C17642l<P, C16807N> f7886r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ Y f7887s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ int f7888t;

        /* renamed from: u  reason: collision with root package name */
        final /* synthetic */ int f7889u;

        /* renamed from: v  reason: collision with root package name */
        final /* synthetic */ int f7890v;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(String str, androidx.compose.ui.d dVar, long j10, long j11, C4830x xVar, C c10, C4820m mVar, long j12, k kVar, j jVar, long j13, int i10, boolean z10, int i11, int i12, C17642l<? super P, C16807N> lVar, Y y10, int i13, int i14, int i15) {
            super(2);
            this.f7871c = str;
            this.f7872d = dVar;
            this.f7873e = j10;
            this.f7874f = j11;
            this.f7875g = xVar;
            this.f7876h = c10;
            this.f7877i = mVar;
            this.f7878j = j12;
            this.f7879k = kVar;
            this.f7880l = jVar;
            this.f7881m = j13;
            this.f7882n = i10;
            this.f7883o = z10;
            this.f7884p = i11;
            this.f7885q = i12;
            this.f7886r = lVar;
            this.f7887s = y10;
            this.f7888t = i13;
            this.f7889u = i14;
            this.f7890v = i15;
        }

        public final void a(C4889m mVar, int i10) {
            C4889m mVar2 = mVar;
            String str = this.f7871c;
            String str2 = str;
            b1.b(str2, this.f7872d, this.f7873e, this.f7874f, this.f7875g, this.f7876h, this.f7877i, this.f7878j, this.f7879k, this.f7880l, this.f7881m, this.f7882n, this.f7883o, this.f7884p, this.f7885q, this.f7886r, this.f7887s, mVar2, M0.a(this.f7888t | 1), M0.a(this.f7889u), this.f7890v);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class e extends C17544u implements C17642l<P, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public static final e f7891c = new e();

        e() {
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
    static final class f extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f7892c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f7893d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ long f7894e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ long f7895f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C4830x f7896g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C f7897h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ C4820m f7898i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ long f7899j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ k f7900k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ j f7901l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ long f7902m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ int f7903n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ boolean f7904o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ int f7905p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ C17642l<P, C16807N> f7906q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ Y f7907r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ int f7908s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ int f7909t;

        /* renamed from: u  reason: collision with root package name */
        final /* synthetic */ int f7910u;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(String str, androidx.compose.ui.d dVar, long j10, long j11, C4830x xVar, C c10, C4820m mVar, long j12, k kVar, j jVar, long j13, int i10, boolean z10, int i11, C17642l<? super P, C16807N> lVar, Y y10, int i12, int i13, int i14) {
            super(2);
            this.f7892c = str;
            this.f7893d = dVar;
            this.f7894e = j10;
            this.f7895f = j11;
            this.f7896g = xVar;
            this.f7897h = c10;
            this.f7898i = mVar;
            this.f7899j = j12;
            this.f7900k = kVar;
            this.f7901l = jVar;
            this.f7902m = j13;
            this.f7903n = i10;
            this.f7904o = z10;
            this.f7905p = i11;
            this.f7906q = lVar;
            this.f7907r = y10;
            this.f7908s = i12;
            this.f7909t = i13;
            this.f7910u = i14;
        }

        public final void a(C4889m mVar, int i10) {
            C4889m mVar2 = mVar;
            String str = this.f7892c;
            String str2 = str;
            b1.d(str2, this.f7893d, this.f7894e, this.f7895f, this.f7896g, this.f7897h, this.f7898i, this.f7899j, this.f7900k, this.f7901l, this.f7902m, this.f7903n, this.f7904o, this.f7905p, this.f7906q, this.f7907r, mVar2, M0.a(this.f7908s | 1), M0.a(this.f7909t), this.f7910u);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class g extends C17544u implements C17642l<P, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public static final g f7911c = new g();

        g() {
            super(1);
        }

        public final void a(P p10) {
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((P) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lp1/v0;", "a", "()J"}, k = 3, mv = {1, 8, 0})
    static final class h implements C5753y0 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f7912a;

        h(long j10) {
            this.f7912a = j10;
        }

        public final long a() {
            return this.f7912a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class i extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C4669d f7913c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f7914d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ long f7915e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ long f7916f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C4830x f7917g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C f7918h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ C4820m f7919i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ long f7920j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ k f7921k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ j f7922l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ long f7923m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ int f7924n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ boolean f7925o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ int f7926p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ int f7927q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ Map<String, C4373q> f7928r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ C17642l<P, C16807N> f7929s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ Y f7930t;

        /* renamed from: u  reason: collision with root package name */
        final /* synthetic */ int f7931u;

        /* renamed from: v  reason: collision with root package name */
        final /* synthetic */ int f7932v;

        /* renamed from: w  reason: collision with root package name */
        final /* synthetic */ int f7933w;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(C4669d dVar, androidx.compose.ui.d dVar2, long j10, long j11, C4830x xVar, C c10, C4820m mVar, long j12, k kVar, j jVar, long j13, int i10, boolean z10, int i11, int i12, Map<String, C4373q> map, C17642l<? super P, C16807N> lVar, Y y10, int i13, int i14, int i15) {
            super(2);
            this.f7913c = dVar;
            this.f7914d = dVar2;
            this.f7915e = j10;
            this.f7916f = j11;
            this.f7917g = xVar;
            this.f7918h = c10;
            this.f7919i = mVar;
            this.f7920j = j12;
            this.f7921k = kVar;
            this.f7922l = jVar;
            this.f7923m = j13;
            this.f7924n = i10;
            this.f7925o = z10;
            this.f7926p = i11;
            this.f7927q = i12;
            this.f7928r = map;
            this.f7929s = lVar;
            this.f7930t = y10;
            this.f7931u = i13;
            this.f7932v = i14;
            this.f7933w = i15;
        }

        public final void a(C4889m mVar, int i10) {
            C4889m mVar2 = mVar;
            C4669d dVar = this.f7913c;
            C4669d dVar2 = dVar;
            b1.c(dVar2, this.f7914d, this.f7915e, this.f7916f, this.f7917g, this.f7918h, this.f7919i, this.f7920j, this.f7921k, this.f7922l, this.f7923m, this.f7924n, this.f7925o, this.f7926p, this.f7927q, this.f7928r, this.f7929s, this.f7930t, mVar2, M0.a(this.f7931u | 1), M0.a(this.f7932v), this.f7933w);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    public static final void a(Y y10, p<? super C4889m, ? super Integer, C16807N> pVar, C4889m mVar, int i10) {
        int i11;
        C4889m k10 = mVar.k(1772272796);
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
                C4895p.S(1772272796, i11, -1, "androidx.compose.material.ProvideTextStyle (Text.kt:396)");
            }
            I0 i02 = f7865a;
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
    /* JADX WARNING: Removed duplicated region for block: B:247:0x0349  */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x034c  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x037e  */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x0385  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x041f  */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x0447  */
    /* JADX WARNING: Removed duplicated region for block: B:270:? A[RETURN, SYNTHETIC] */
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
            r0 = 1028090691(0x3d476b43, float:0.048686277)
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
            goto L_0x0441
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
            U0.I0<N1.Y> r0 = f7865a
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
            java.lang.String r14 = "androidx.compose.material.Text (Text.kt:110)"
            r81 = r12
            r12 = 1028090691(0x3d476b43, float:0.048686277)
            U0.C4895p.S(r12, r5, r13, r14)
            goto L_0x0327
        L_0x0325:
            r81 = r12
        L_0x0327:
            U0.I0 r12 = I0.C4581s.a()
            java.lang.Object r12 = r1.Q(r12)
            p1.v0 r12 = (p1.C5747v0) r12
            long r26 = r12.y()
            U0.I0 r12 = I0.r.a()
            java.lang.Object r12 = r1.Q(r12)
            java.lang.Number r12 = (java.lang.Number) r12
            float r12 = r12.floatValue()
            r28 = 16
            int r14 = (r10 > r28 ? 1 : (r10 == r28 ? 0 : -1))
            if (r14 == 0) goto L_0x034c
            r82 = r10
            goto L_0x037c
        L_0x034c:
            long r28 = r8.h()
            r30 = 16
            int r14 = (r28 > r30 ? 1 : (r28 == r30 ? 0 : -1))
            if (r14 == 0) goto L_0x035f
            long r26 = r8.h()
        L_0x035a:
            r82 = r10
            r10 = r26
            goto L_0x037c
        L_0x035f:
            r14 = 14
            r16 = 0
            r18 = 0
            r28 = 0
            r29 = 0
            r69 = r26
            r71 = r12
            r72 = r18
            r73 = r28
            r74 = r29
            r75 = r14
            r76 = r16
            long r26 = p1.C5747v0.o(r69, r71, r72, r73, r74, r75, r76)
            goto L_0x035a
        L_0x037c:
            if (r2 == 0) goto L_0x0385
            int r12 = r2.n()
        L_0x0382:
            r54 = r12
            goto L_0x038c
        L_0x0385:
            Y1.j$a r12 = Y1.j.f14783b
            int r12 = r12.g()
            goto L_0x0382
        L_0x038c:
            r64 = 16609105(0xfd6f51, float:2.3274313E-38)
            r65 = 0
            r35 = 0
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
            boolean r14 = r1.e(r10)
            r84 = r0
            java.lang.Object r0 = r1.D()
            if (r14 != 0) goto L_0x03d9
            U0.m$a r14 = U0.C4889m.f14007a
            java.lang.Object r14 = r14.a()
            if (r0 != r14) goto L_0x03e1
        L_0x03d9:
            I0.b1$c r0 = new I0.b1$c
            r0.<init>(r10)
            r1.u(r0)
        L_0x03e1:
            p1.y0 r0 = (p1.C5753y0) r0
            r5 = r5 & 126(0x7e, float:1.77E-43)
            int r10 = r13 >> 6
            r10 = r10 & 7168(0x1c00, float:1.0045E-41)
            r5 = r5 | r10
            int r10 = r13 << 9
            r11 = 57344(0xe000, float:8.0356E-41)
            r11 = r11 & r10
            r5 = r5 | r11
            r11 = 458752(0x70000, float:6.42848E-40)
            r11 = r11 & r10
            r5 = r5 | r11
            r11 = 3670016(0x380000, float:5.142788E-39)
            r11 = r11 & r10
            r5 = r5 | r11
            r11 = 29360128(0x1c00000, float:7.052966E-38)
            r10 = r10 & r11
            r5 = r5 | r10
            r10 = 0
            r69 = r68
            r70 = r6
            r71 = r12
            r72 = r15
            r73 = r7
            r74 = r9
            r75 = r81
            r76 = r25
            r77 = r0
            r78 = r1
            r79 = r5
            r80 = r10
            B0.C4360d.b(r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0422
            U0.C4895p.R()
        L_0x0422:
            r18 = r81
            r12 = r84
            r13 = r2
            r2 = r6
            r16 = r7
            r7 = r17
            r5 = r19
            r10 = r23
            r19 = r25
            r17 = r9
            r20 = r15
            r9 = r22
            r14 = r3
            r3 = r82
            r67 = r21
            r21 = r8
            r8 = r67
        L_0x0441:
            U0.Y0 r1 = r1.n()
            if (r1 == 0) goto L_0x045f
            I0.b1$d r0 = new I0.b1$d
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
        L_0x045f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: I0.b1.b(java.lang.String, androidx.compose.ui.d, long, long, S1.x, S1.C, S1.m, long, Y1.k, Y1.j, long, int, boolean, int, int, nI.l, N1.Y, U0.m, int, int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:273:0x0414, code lost:
        if (r1 == U0.C4889m.f14007a.a()) goto L_0x0419;
     */
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
    /* JADX WARNING: Removed duplicated region for block: B:282:0x048a  */
    /* JADX WARNING: Removed duplicated region for block: B:284:? A[RETURN, SYNTHETIC] */
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
    public static final void c(N1.C4669d r58, androidx.compose.ui.d r59, long r60, long r62, S1.C4830x r64, S1.C r65, S1.C4820m r66, long r67, Y1.k r69, Y1.j r70, long r71, int r73, boolean r74, int r75, int r76, java.util.Map<java.lang.String, B0.C4373q> r77, nI.C17642l<? super N1.P, XH.C16807N> r78, N1.Y r79, U0.C4889m r80, int r81, int r82, int r83) {
        /*
            r14 = r81
            r15 = r82
            r13 = r83
            r0 = 744129681(0x2c5a8491, float:3.1053252E-12)
            r1 = r80
            U0.m r0 = r1.k(r0)
            r1 = r13 & 1
            if (r1 == 0) goto L_0x0019
            r1 = r14 | 6
            r4 = r1
            r1 = r58
            goto L_0x002d
        L_0x0019:
            r1 = r14 & 6
            if (r1 != 0) goto L_0x002a
            r1 = r58
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
            r1 = r58
            r4 = r14
        L_0x002d:
            r5 = r13 & 2
            if (r5 == 0) goto L_0x0036
            r4 = r4 | 48
        L_0x0033:
            r8 = r59
            goto L_0x0048
        L_0x0036:
            r8 = r14 & 48
            if (r8 != 0) goto L_0x0033
            r8 = r59
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
            r2 = r60
            goto L_0x0064
        L_0x0051:
            r12 = r14 & 384(0x180, float:5.38E-43)
            r2 = r60
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
            r7 = r62
            goto L_0x0084
        L_0x0071:
            r6 = r14 & 3072(0xc00, float:4.305E-42)
            r7 = r62
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
            r6 = r64
            goto L_0x00a4
        L_0x0091:
            r6 = r14 & 24576(0x6000, float:3.4438E-41)
            if (r6 != 0) goto L_0x008e
            r6 = r64
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
            r10 = r65
            goto L_0x00c6
        L_0x00b3:
            r28 = r14 & r26
            r10 = r65
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
            r11 = r66
            goto L_0x00e4
        L_0x00d1:
            r31 = r14 & r30
            r11 = r66
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
            r1 = r67
            goto L_0x0101
        L_0x00ef:
            r34 = r14 & r33
            r1 = r67
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
            r1 = r69
            goto L_0x011e
        L_0x010c:
            r34 = r14 & r34
            r1 = r69
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
            r1 = r70
            goto L_0x013c
        L_0x0129:
            r34 = r14 & r34
            r1 = r70
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
            r6 = r71
            goto L_0x015b
        L_0x0145:
            r34 = r15 & 6
            r6 = r71
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
            r6 = r73
        L_0x0163:
            r7 = r32
            goto L_0x017a
        L_0x0166:
            r34 = r15 & 48
            r6 = r73
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
            r10 = r74
            goto L_0x0196
        L_0x0183:
            r10 = r15 & 384(0x180, float:5.38E-43)
            if (r10 != 0) goto L_0x0180
            r10 = r74
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
            r11 = r75
            goto L_0x01af
        L_0x019f:
            r11 = r15 & 3072(0xc00, float:4.305E-42)
            if (r11 != 0) goto L_0x019c
            r11 = r75
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
            r11 = r76
            goto L_0x01cc
        L_0x01ba:
            r17 = r11
            r11 = r15 & 24576(0x6000, float:3.4438E-41)
            if (r11 != 0) goto L_0x01b7
            r11 = r76
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
            r11 = r77
            goto L_0x01eb
        L_0x01d8:
            r19 = r15 & r26
            r11 = r77
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
            r11 = r78
            goto L_0x0207
        L_0x01f4:
            r21 = r15 & r30
            r11 = r78
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
            r11 = r79
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
            r11 = r79
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
            r2 = r59
            r3 = r60
            r5 = r62
            r7 = r64
            r8 = r65
            r9 = r66
            r10 = r67
            r12 = r69
            r13 = r70
            r14 = r71
            r16 = r73
            r17 = r74
            r18 = r75
            r19 = r76
            r20 = r77
            r21 = r78
            r22 = r79
            goto L_0x0484
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
            r5 = r59
            r21 = r60
            r15 = r62
            r11 = r64
            r20 = r65
            r1 = r66
            r2 = r67
            r6 = r69
            r9 = r70
            r10 = r73
            r12 = r74
            r17 = r75
            r18 = r76
            r19 = r77
            r55 = r78
            r56 = r79
            r13 = r7
            r7 = r71
            goto L_0x034c
        L_0x02a0:
            if (r5 == 0) goto L_0x02a5
            androidx.compose.ui.d$a r5 = androidx.compose.ui.d.f18749a
            goto L_0x02a7
        L_0x02a5:
            r5 = r59
        L_0x02a7:
            if (r9 == 0) goto L_0x02b0
            p1.v0$a r9 = p1.C5747v0.f27350b
            long r21 = r9.i()
            goto L_0x02b2
        L_0x02b0:
            r21 = r60
        L_0x02b2:
            if (r16 == 0) goto L_0x02bb
            c2.v$a r9 = c2.v.f23057b
            long r15 = r9.a()
            goto L_0x02bd
        L_0x02bb:
            r15 = r62
        L_0x02bd:
            r9 = 0
            if (r20 == 0) goto L_0x02c2
            r11 = r9
            goto L_0x02c4
        L_0x02c2:
            r11 = r64
        L_0x02c4:
            if (r24 == 0) goto L_0x02c9
            r20 = r9
            goto L_0x02cb
        L_0x02c9:
            r20 = r65
        L_0x02cb:
            if (r29 == 0) goto L_0x02d0
            r23 = r9
            goto L_0x02d2
        L_0x02d0:
            r23 = r66
        L_0x02d2:
            if (r12 == 0) goto L_0x02db
            c2.v$a r12 = c2.v.f23057b
            long r24 = r12.a()
            goto L_0x02dd
        L_0x02db:
            r24 = r67
        L_0x02dd:
            if (r3 == 0) goto L_0x02e1
            r3 = r9
            goto L_0x02e3
        L_0x02e1:
            r3 = r69
        L_0x02e3:
            if (r2 == 0) goto L_0x02e6
            goto L_0x02e8
        L_0x02e6:
            r9 = r70
        L_0x02e8:
            if (r1 == 0) goto L_0x02f1
            c2.v$a r1 = c2.v.f23057b
            long r1 = r1.a()
            goto L_0x02f3
        L_0x02f1:
            r1 = r71
        L_0x02f3:
            if (r8 == 0) goto L_0x02fc
            Y1.t$a r8 = Y1.t.f14827a
            int r8 = r8.a()
            goto L_0x02fe
        L_0x02fc:
            r8 = r73
        L_0x02fe:
            r12 = 1
            if (r6 == 0) goto L_0x0303
            r6 = r12
            goto L_0x0305
        L_0x0303:
            r6 = r74
        L_0x0305:
            if (r10 == 0) goto L_0x030b
            r10 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x030d
        L_0x030b:
            r10 = r75
        L_0x030d:
            if (r17 == 0) goto L_0x0310
            goto L_0x0312
        L_0x0310:
            r12 = r76
        L_0x0312:
            if (r18 == 0) goto L_0x0319
            java.util.Map r17 = YH.X.j()
            goto L_0x031b
        L_0x0319:
            r17 = r77
        L_0x031b:
            if (r19 == 0) goto L_0x0320
            I0.b1$g r18 = I0.b1.g.f7911c
            goto L_0x0322
        L_0x0320:
            r18 = r78
        L_0x0322:
            r19 = r13 & r27
            r59 = r1
            if (r19 == 0) goto L_0x0349
            U0.I0<N1.Y> r1 = f7865a
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
            r7 = r59
            r6 = r3
            r2 = r24
            goto L_0x034c
        L_0x0349:
            r56 = r79
            goto L_0x0336
        L_0x034c:
            r0.y()
            boolean r23 = U0.C4895p.J()
            if (r23 == 0) goto L_0x0360
            r14 = 744129681(0x2c5a8491, float:3.1053252E-12)
            r72 = r12
            java.lang.String r12 = "androidx.compose.material.Text (Text.kt:281)"
            U0.C4895p.S(r14, r4, r13, r12)
            goto L_0x0362
        L_0x0360:
            r72 = r12
        L_0x0362:
            U0.I0 r12 = I0.C4581s.a()
            java.lang.Object r12 = r0.Q(r12)
            p1.v0 r12 = (p1.C5747v0) r12
            long r23 = r12.y()
            U0.I0 r12 = I0.r.a()
            java.lang.Object r12 = r0.Q(r12)
            java.lang.Number r12 = (java.lang.Number) r12
            float r12 = r12.floatValue()
            r25 = 16
            int r14 = (r21 > r25 ? 1 : (r21 == r25 ? 0 : -1))
            if (r14 == 0) goto L_0x0388
            r14 = r13
            r12 = r21
            goto L_0x03b7
        L_0x0388:
            long r25 = r56.h()
            r27 = 16
            int r14 = (r25 > r27 ? 1 : (r25 == r27 ? 0 : -1))
            if (r14 == 0) goto L_0x039a
            long r23 = r56.h()
        L_0x0396:
            r14 = r13
            r12 = r23
            goto L_0x03b7
        L_0x039a:
            r14 = 14
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r59 = r23
            r61 = r12
            r62 = r26
            r63 = r27
            r64 = r28
            r65 = r14
            r66 = r25
            long r23 = p1.C5747v0.o(r59, r61, r62, r63, r64, r65, r66)
            goto L_0x0396
        L_0x03b7:
            if (r9 == 0) goto L_0x03c0
            int r23 = r9.n()
        L_0x03bd:
            r43 = r23
            goto L_0x03c7
        L_0x03c0:
            Y1.j$a r23 = Y1.j.f14783b
            int r23 = r23.g()
            goto L_0x03bd
        L_0x03c7:
            r53 = 16609105(0xfd6f51, float:2.3274313E-38)
            r54 = 0
            r24 = 0
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
            N1.Y r23 = N1.Y.L(r23, r24, r26, r28, r29, r30, r31, r32, r33, r35, r36, r37, r38, r40, r41, r42, r43, r44, r45, r47, r48, r49, r50, r51, r52, r53, r54)
            boolean r24 = r0.e(r12)
            r73 = r1
            java.lang.Object r1 = r0.D()
            if (r24 != 0) goto L_0x0417
            U0.m$a r24 = U0.C4889m.f14007a
            r74 = r2
            java.lang.Object r2 = r24.a()
            if (r1 != r2) goto L_0x0421
            goto L_0x0419
        L_0x0417:
            r74 = r2
        L_0x0419:
            I0.b1$h r1 = new I0.b1$h
            r1.<init>(r12)
            r0.u(r1)
        L_0x0421:
            p1.y0 r1 = (p1.C5753y0) r1
            r2 = r4 & 126(0x7e, float:1.77E-43)
            int r3 = r14 >> 9
            r3 = r3 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 | r3
            int r3 = r14 << 9
            r4 = 57344(0xe000, float:8.0356E-41)
            r4 = r4 & r3
            r2 = r2 | r4
            r4 = 458752(0x70000, float:6.42848E-40)
            r4 = r4 & r3
            r2 = r2 | r4
            r4 = 3670016(0x380000, float:5.142788E-39)
            r4 = r4 & r3
            r2 = r2 | r4
            r4 = 29360128(0x1c00000, float:7.052966E-38)
            r4 = r4 & r3
            r2 = r2 | r4
            r4 = 234881024(0xe000000, float:1.5777218E-30)
            r3 = r3 & r4
            r2 = r2 | r3
            r3 = 0
            r59 = r58
            r60 = r5
            r61 = r23
            r62 = r55
            r63 = r10
            r64 = r72
            r65 = r17
            r66 = r18
            r67 = r19
            r68 = r1
            r69 = r0
            r70 = r2
            r71 = r3
            B0.C4360d.a(r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71)
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x0468
            U0.C4895p.R()
        L_0x0468:
            r2 = r5
            r12 = r6
            r13 = r9
            r5 = r15
            r3 = r21
            r21 = r55
            r22 = r56
            r9 = r73
            r14 = r7
            r16 = r10
            r7 = r11
            r8 = r20
            r10 = r74
            r20 = r19
            r19 = r18
            r18 = r17
            r17 = r72
        L_0x0484:
            U0.Y0 r1 = r0.n()
            if (r1 == 0) goto L_0x04a2
            I0.b1$i r0 = new I0.b1$i
            r59 = r0
            r57 = r1
            r1 = r58
            r23 = r81
            r24 = r82
            r25 = r83
            r0.<init>(r1, r2, r3, r5, r7, r8, r9, r10, r12, r13, r14, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r1 = r59
            r0 = r57
            r0.a(r1)
        L_0x04a2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: I0.b1.c(N1.d, androidx.compose.ui.d, long, long, S1.x, S1.C, S1.m, long, Y1.k, Y1.j, long, int, boolean, int, int, java.util.Map, nI.l, N1.Y, U0.m, int, int, int):void");
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
    /* JADX WARNING: Removed duplicated region for block: B:166:0x01e5  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0201  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0226  */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x038c  */
    /* JADX WARNING: Removed duplicated region for block: B:241:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0051  */
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
    @XH.C16814e
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void d(java.lang.String r54, androidx.compose.ui.d r55, long r56, long r58, S1.C4830x r60, S1.C r61, S1.C4820m r62, long r63, Y1.k r65, Y1.j r66, long r67, int r69, boolean r70, int r71, nI.C17642l r72, N1.Y r73, U0.C4889m r74, int r75, int r76, int r77) {
        /*
            r14 = r75
            r15 = r76
            r13 = r77
            r0 = -366126944(0xffffffffea2d58a0, float:-5.239067E25)
            r1 = r74
            U0.m r1 = r1.k(r0)
            r2 = r13 & 1
            if (r2 == 0) goto L_0x0019
            r2 = r14 | 6
            r5 = r2
            r2 = r54
            goto L_0x002d
        L_0x0019:
            r2 = r14 & 6
            if (r2 != 0) goto L_0x002a
            r2 = r54
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
            r2 = r54
            r5 = r14
        L_0x002d:
            r6 = r13 & 2
            if (r6 == 0) goto L_0x0036
            r5 = r5 | 48
        L_0x0033:
            r9 = r55
            goto L_0x0048
        L_0x0036:
            r9 = r14 & 48
            if (r9 != 0) goto L_0x0033
            r9 = r55
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
            r7 = r56
            goto L_0x0064
        L_0x0051:
            r3 = r14 & 384(0x180, float:5.38E-43)
            r7 = r56
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
            r11 = r58
            goto L_0x0084
        L_0x0071:
            r3 = r14 & 3072(0xc00, float:4.305E-42)
            r11 = r58
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
            r3 = r60
            goto L_0x00a4
        L_0x0091:
            r3 = r14 & 24576(0x6000, float:3.4438E-41)
            if (r3 != 0) goto L_0x008e
            r3 = r60
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
            r27 = 65536(0x10000, float:9.18355E-41)
            r28 = 131072(0x20000, float:1.83671E-40)
            r29 = 196608(0x30000, float:2.75506E-40)
            if (r26 == 0) goto L_0x00b3
            r5 = r5 | r29
            r4 = r61
            goto L_0x00c6
        L_0x00b3:
            r30 = r14 & r29
            r4 = r61
            if (r30 != 0) goto L_0x00c6
            boolean r31 = r1.V(r4)
            if (r31 == 0) goto L_0x00c2
            r31 = r28
            goto L_0x00c4
        L_0x00c2:
            r31 = r27
        L_0x00c4:
            r5 = r5 | r31
        L_0x00c6:
            r31 = r13 & 64
            r32 = 1572864(0x180000, float:2.204052E-39)
            if (r31 == 0) goto L_0x00d1
            r5 = r5 | r32
            r0 = r62
            goto L_0x00e4
        L_0x00d1:
            r32 = r14 & r32
            r0 = r62
            if (r32 != 0) goto L_0x00e4
            boolean r33 = r1.V(r0)
            if (r33 == 0) goto L_0x00e0
            r33 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e2
        L_0x00e0:
            r33 = 524288(0x80000, float:7.34684E-40)
        L_0x00e2:
            r5 = r5 | r33
        L_0x00e4:
            r0 = r13 & 128(0x80, float:1.794E-43)
            r33 = 12582912(0xc00000, float:1.7632415E-38)
            if (r0 == 0) goto L_0x00ef
            r5 = r5 | r33
            r2 = r63
            goto L_0x0102
        L_0x00ef:
            r33 = r14 & r33
            r2 = r63
            if (r33 != 0) goto L_0x0102
            boolean r33 = r1.e(r2)
            if (r33 == 0) goto L_0x00fe
            r33 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0100
        L_0x00fe:
            r33 = 4194304(0x400000, float:5.877472E-39)
        L_0x0100:
            r5 = r5 | r33
        L_0x0102:
            r2 = r13 & 256(0x100, float:3.59E-43)
            r3 = 100663296(0x6000000, float:2.4074124E-35)
            if (r2 == 0) goto L_0x010c
            r5 = r5 | r3
        L_0x0109:
            r3 = r65
            goto L_0x011e
        L_0x010c:
            r3 = r3 & r14
            if (r3 != 0) goto L_0x0109
            r3 = r65
            boolean r33 = r1.V(r3)
            if (r33 == 0) goto L_0x011a
            r33 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x011c
        L_0x011a:
            r33 = 33554432(0x2000000, float:9.403955E-38)
        L_0x011c:
            r5 = r5 | r33
        L_0x011e:
            r3 = r13 & 512(0x200, float:7.175E-43)
            r33 = 805306368(0x30000000, float:4.656613E-10)
            if (r3 == 0) goto L_0x0129
            r5 = r5 | r33
            r4 = r66
            goto L_0x013c
        L_0x0129:
            r33 = r14 & r33
            r4 = r66
            if (r33 != 0) goto L_0x013c
            boolean r33 = r1.V(r4)
            if (r33 == 0) goto L_0x0138
            r33 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x013a
        L_0x0138:
            r33 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x013a:
            r5 = r5 | r33
        L_0x013c:
            r4 = r13 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto L_0x0145
            r30 = r15 | 6
            r7 = r67
            goto L_0x015b
        L_0x0145:
            r33 = r15 & 6
            r7 = r67
            if (r33 != 0) goto L_0x0159
            boolean r33 = r1.e(r7)
            if (r33 == 0) goto L_0x0154
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
            r8 = r69
            boolean r33 = r1.d(r8)
            if (r33 == 0) goto L_0x0173
            r16 = 32
            goto L_0x0175
        L_0x0173:
            r16 = 16
        L_0x0175:
            r30 = r30 | r16
            goto L_0x0161
        L_0x0178:
            r8 = r69
            goto L_0x0161
        L_0x017b:
            r9 = r13 & 4096(0x1000, float:5.74E-42)
            if (r9 == 0) goto L_0x0184
            r8 = r8 | 384(0x180, float:5.38E-43)
        L_0x0181:
            r11 = r70
            goto L_0x0197
        L_0x0184:
            r11 = r15 & 384(0x180, float:5.38E-43)
            if (r11 != 0) goto L_0x0181
            r11 = r70
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
            r11 = r71
            goto L_0x01b0
        L_0x01a0:
            r11 = r15 & 3072(0xc00, float:4.305E-42)
            if (r11 != 0) goto L_0x019d
            r11 = r71
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
            r11 = r72
            goto L_0x01cd
        L_0x01bb:
            r16 = r11
            r11 = r15 & 24576(0x6000, float:3.4438E-41)
            if (r11 != 0) goto L_0x01b8
            r11 = r72
            boolean r18 = r1.F(r11)
            if (r18 == 0) goto L_0x01cb
            r23 = r24
        L_0x01cb:
            r8 = r8 | r23
        L_0x01cd:
            r18 = r15 & r29
            r19 = 32768(0x8000, float:4.5918E-41)
            if (r18 != 0) goto L_0x01e5
            r18 = r13 & r19
            r11 = r73
            if (r18 != 0) goto L_0x01e2
            boolean r18 = r1.V(r11)
            if (r18 == 0) goto L_0x01e2
            r27 = r28
        L_0x01e2:
            r8 = r8 | r27
            goto L_0x01e7
        L_0x01e5:
            r11 = r73
        L_0x01e7:
            r18 = 306783379(0x12492493, float:6.34695E-28)
            r11 = r5 & r18
            r15 = 306783378(0x12492492, float:6.3469493E-28)
            if (r11 != r15) goto L_0x0226
            r11 = 74899(0x12493, float:1.04956E-40)
            r11 = r11 & r8
            r15 = 74898(0x12492, float:1.04954E-40)
            if (r11 != r15) goto L_0x0226
            boolean r11 = r1.l()
            if (r11 != 0) goto L_0x0201
            goto L_0x0226
        L_0x0201:
            r1.L()
            r2 = r55
            r3 = r56
            r5 = r58
            r7 = r60
            r8 = r61
            r9 = r62
            r10 = r63
            r12 = r65
            r13 = r66
            r14 = r67
            r16 = r69
            r17 = r70
            r18 = r71
            r19 = r72
            r20 = r73
            r74 = r1
            goto L_0x0386
        L_0x0226:
            r1.G()
            r11 = r14 & 1
            if (r11 == 0) goto L_0x0260
            boolean r11 = r1.O()
            if (r11 == 0) goto L_0x0234
            goto L_0x0260
        L_0x0234:
            r1.L()
            r0 = r13 & r19
            if (r0 == 0) goto L_0x023f
            r0 = -458753(0xfffffffffff8ffff, float:NaN)
            r8 = r8 & r0
        L_0x023f:
            r6 = r55
            r10 = r56
            r2 = r58
            r0 = r60
            r4 = r61
            r7 = r62
            r12 = r65
            r15 = r66
            r41 = r67
            r43 = r69
            r44 = r70
            r45 = r71
            r46 = r72
            r47 = r73
            r13 = r8
            r8 = r63
            goto L_0x0304
        L_0x0260:
            if (r6 == 0) goto L_0x0265
            androidx.compose.ui.d$a r6 = androidx.compose.ui.d.f18749a
            goto L_0x0267
        L_0x0265:
            r6 = r55
        L_0x0267:
            if (r10 == 0) goto L_0x0270
            p1.v0$a r10 = p1.C5747v0.f27350b
            long r10 = r10.i()
            goto L_0x0272
        L_0x0270:
            r10 = r56
        L_0x0272:
            if (r17 == 0) goto L_0x027b
            c2.v$a r15 = c2.v.f23057b
            long r17 = r15.a()
            goto L_0x027d
        L_0x027b:
            r17 = r58
        L_0x027d:
            r15 = 0
            if (r22 == 0) goto L_0x0283
            r20 = r15
            goto L_0x0285
        L_0x0283:
            r20 = r60
        L_0x0285:
            if (r26 == 0) goto L_0x028a
            r21 = r15
            goto L_0x028c
        L_0x028a:
            r21 = r61
        L_0x028c:
            if (r31 == 0) goto L_0x0291
            r22 = r15
            goto L_0x0293
        L_0x0291:
            r22 = r62
        L_0x0293:
            if (r0 == 0) goto L_0x029c
            c2.v$a r0 = c2.v.f23057b
            long r23 = r0.a()
            goto L_0x029e
        L_0x029c:
            r23 = r63
        L_0x029e:
            if (r2 == 0) goto L_0x02a2
            r0 = r15
            goto L_0x02a4
        L_0x02a2:
            r0 = r65
        L_0x02a4:
            if (r3 == 0) goto L_0x02a7
            goto L_0x02a9
        L_0x02a7:
            r15 = r66
        L_0x02a9:
            if (r4 == 0) goto L_0x02b2
            c2.v$a r2 = c2.v.f23057b
            long r2 = r2.a()
            goto L_0x02b4
        L_0x02b2:
            r2 = r67
        L_0x02b4:
            if (r7 == 0) goto L_0x02bd
            Y1.t$a r4 = Y1.t.f14827a
            int r4 = r4.a()
            goto L_0x02bf
        L_0x02bd:
            r4 = r69
        L_0x02bf:
            if (r9 == 0) goto L_0x02c3
            r7 = 1
            goto L_0x02c5
        L_0x02c3:
            r7 = r70
        L_0x02c5:
            if (r12 == 0) goto L_0x02cb
            r9 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x02cd
        L_0x02cb:
            r9 = r71
        L_0x02cd:
            if (r16 == 0) goto L_0x02d2
            I0.b1$e r12 = I0.b1.e.f7891c
            goto L_0x02d4
        L_0x02d2:
            r12 = r72
        L_0x02d4:
            r16 = r13 & r19
            r55 = r0
            if (r16 == 0) goto L_0x0301
            U0.I0<N1.Y> r0 = f7865a
            java.lang.Object r0 = r1.Q(r0)
            N1.Y r0 = (N1.Y) r0
            r16 = -458753(0xfffffffffff8ffff, float:NaN)
            r8 = r8 & r16
            r47 = r0
        L_0x02e9:
            r41 = r2
            r43 = r4
            r44 = r7
            r13 = r8
            r45 = r9
            r46 = r12
            r2 = r17
            r0 = r20
            r4 = r21
            r7 = r22
            r8 = r23
            r12 = r55
            goto L_0x0304
        L_0x0301:
            r47 = r73
            goto L_0x02e9
        L_0x0304:
            r1.y()
            boolean r16 = U0.C4895p.J()
            if (r16 == 0) goto L_0x0318
            java.lang.String r14 = "androidx.compose.material.Text (Text.kt:182)"
            r74 = r1
            r1 = -366126944(0xffffffffea2d58a0, float:-5.239067E25)
            U0.C4895p.S(r1, r5, r13, r14)
            goto L_0x031a
        L_0x0318:
            r74 = r1
        L_0x031a:
            r1 = 2147483646(0x7ffffffe, float:NaN)
            r38 = r5 & r1
            r1 = r13 & 14
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            r5 = r13 & 112(0x70, float:1.57E-43)
            r1 = r1 | r5
            r5 = r13 & 896(0x380, float:1.256E-42)
            r1 = r1 | r5
            r5 = r13 & 7168(0x1c00, float:1.0045E-41)
            r1 = r1 | r5
            int r5 = r13 << 3
            r13 = 458752(0x70000, float:6.42848E-40)
            r13 = r13 & r5
            r1 = r1 | r13
            r13 = 3670016(0x380000, float:5.142788E-39)
            r5 = r5 & r13
            r39 = r1 | r5
            r40 = 0
            r34 = 1
            r16 = r54
            r17 = r6
            r18 = r10
            r20 = r2
            r22 = r0
            r23 = r4
            r24 = r7
            r25 = r8
            r27 = r12
            r28 = r15
            r29 = r41
            r31 = r43
            r32 = r44
            r33 = r45
            r35 = r46
            r36 = r47
            r37 = r74
            b(r16, r17, r18, r20, r22, r23, r24, r25, r27, r28, r29, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x0369
            U0.C4895p.R()
        L_0x0369:
            r13 = r15
            r14 = r41
            r16 = r43
            r17 = r44
            r18 = r45
            r19 = r46
            r20 = r47
            r49 = r7
            r7 = r0
            r50 = r8
            r8 = r4
            r9 = r49
            r52 = r2
            r2 = r6
            r5 = r52
            r3 = r10
            r10 = r50
        L_0x0386:
            U0.Y0 r1 = r74.n()
            if (r1 == 0) goto L_0x03a4
            I0.b1$f r0 = new I0.b1$f
            r55 = r0
            r48 = r1
            r1 = r54
            r21 = r75
            r22 = r76
            r23 = r77
            r0.<init>(r1, r2, r3, r5, r7, r8, r9, r10, r12, r13, r14, r16, r17, r18, r19, r20, r21, r22, r23)
            r1 = r55
            r0 = r48
            r0.a(r1)
        L_0x03a4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: I0.b1.d(java.lang.String, androidx.compose.ui.d, long, long, S1.x, S1.C, S1.m, long, Y1.k, Y1.j, long, int, boolean, int, nI.l, N1.Y, U0.m, int, int, int):void");
    }

    public static final I0<Y> e() {
        return f7865a;
    }
}
