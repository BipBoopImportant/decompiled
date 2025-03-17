package I0;

import T1.b0;
import U0.C4889m;
import U0.C4895p;
import U0.M0;
import XH.C16807N;
import androidx.compose.foundation.layout.D;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.C5137v0;
import androidx.recyclerview.widget.RecyclerView;
import c2.h;
import com.google.ar.core.ImageMetadata;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n0.C5601g;
import nI.C17642l;
import nI.p;
import nI.q;
import p1.C5747v0;
import p1.i1;
import r0.k;
import s0.C5834E;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JJ\u0010\u000f\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J:\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\f2\b\b\u0002\u0010\u0013\u001a\u00020\f2\b\b\u0002\u0010\u0014\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J:\u0010\u0018\u001a\u00020\u00152\b\b\u0002\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0013\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\f2\b\b\u0002\u0010\u0014\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0017Jä\u0001\u0010/\u001a\u00020\n2\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u00192\b\b\u0002\u0010\u001d\u001a\u00020\u00192\b\b\u0002\u0010\u001e\u001a\u00020\u00192\b\b\u0002\u0010\u001f\u001a\u00020\u00192\b\b\u0002\u0010 \u001a\u00020\u00192\b\b\u0002\u0010!\u001a\u00020\u00192\b\b\u0002\u0010\"\u001a\u00020\u00192\b\b\u0002\u0010#\u001a\u00020\u00192\b\b\u0002\u0010$\u001a\u00020\u00192\b\b\u0002\u0010%\u001a\u00020\u00192\b\b\u0002\u0010&\u001a\u00020\u00192\b\b\u0002\u0010'\u001a\u00020\u00192\b\b\u0002\u0010(\u001a\u00020\u00192\b\b\u0002\u0010)\u001a\u00020\u00192\b\b\u0002\u0010*\u001a\u00020\u00192\b\b\u0002\u0010+\u001a\u00020\u00192\b\b\u0002\u0010,\u001a\u00020\u00192\b\b\u0002\u0010-\u001a\u00020\u00192\b\b\u0002\u0010.\u001a\u00020\u0019H\u0007ø\u0001\u0000¢\u0006\u0004\b/\u00100Jµ\u0001\u0010@\u001a\u0002042\u0006\u00102\u001a\u0002012\f\u00105\u001a\b\u0012\u0004\u0012\u000204032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u00106\u001a\u00020\u00052\u0006\u00108\u001a\u0002072\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0007\u001a\u00020\u00052\u0010\b\u0002\u00109\u001a\n\u0012\u0004\u0012\u000204\u0018\u0001032\u0010\b\u0002\u0010:\u001a\n\u0012\u0004\u0012\u000204\u0018\u0001032\u0010\b\u0002\u0010;\u001a\n\u0012\u0004\u0012\u000204\u0018\u0001032\u0010\b\u0002\u0010<\u001a\n\u0012\u0004\u0012\u000204\u0018\u0001032\b\b\u0002\u0010>\u001a\u00020=2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010?\u001a\u00020\u0015H\u0007¢\u0006\u0004\b@\u0010AR\u001d\u0010E\u001a\u00020\f8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bB\u0010DR\u001d\u0010G\u001a\u00020\f8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bF\u0010C\u001a\u0004\bF\u0010DR\u001d\u0010J\u001a\u00020\f8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bH\u0010C\u001a\u0004\bI\u0010DR\u001d\u0010L\u001a\u00020\f8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000f\u0010C\u001a\u0004\bK\u0010DR\u0011\u0010N\u001a\u00020=8G¢\u0006\u0006\u001a\u0004\bH\u0010M\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006O"}, d2 = {"LI0/U0;", "", "<init>", "()V", "Landroidx/compose/ui/d;", "", "enabled", "isError", "Lr0/k;", "interactionSource", "LI0/T0;", "colors", "Lc2/h;", "focusedIndicatorLineThickness", "unfocusedIndicatorLineThickness", "e", "(Landroidx/compose/ui/d;ZZLr0/k;LI0/T0;FF)Landroidx/compose/ui/d;", "start", "end", "top", "bottom", "Ls0/E;", "h", "(FFFF)Ls0/E;", "j", "Lp1/v0;", "textColor", "disabledTextColor", "backgroundColor", "cursorColor", "errorCursorColor", "focusedIndicatorColor", "unfocusedIndicatorColor", "disabledIndicatorColor", "errorIndicatorColor", "leadingIconColor", "disabledLeadingIconColor", "errorLeadingIconColor", "trailingIconColor", "disabledTrailingIconColor", "errorTrailingIconColor", "focusedLabelColor", "unfocusedLabelColor", "disabledLabelColor", "errorLabelColor", "placeholderColor", "disabledPlaceholderColor", "g", "(JJJJJJJJJJJJJJJJJJJJJLU0/m;IIII)LI0/T0;", "", "value", "Lkotlin/Function0;", "LXH/N;", "innerTextField", "singleLine", "LT1/b0;", "visualTransformation", "label", "placeholder", "leadingIcon", "trailingIcon", "Lp1/i1;", "shape", "contentPadding", "a", "(Ljava/lang/String;LnI/p;ZZLT1/b0;Lr0/k;ZLnI/p;LnI/p;LnI/p;LnI/p;Lp1/i1;LI0/T0;Ls0/E;LU0/m;III)V", "b", "F", "()F", "MinHeight", "c", "MinWidth", "d", "getUnfocusedBorderThickness-D9Ej5fM", "UnfocusedBorderThickness", "getFocusedBorderThickness-D9Ej5fM", "FocusedBorderThickness", "(LU0/m;I)Lp1/i1;", "TextFieldShape", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class U0 {

    /* renamed from: a  reason: collision with root package name */
    public static final U0 f7558a = new U0();

    /* renamed from: b  reason: collision with root package name */
    private static final float f7559b = h.B((float) 56);

    /* renamed from: c  reason: collision with root package name */
    private static final float f7560c = h.B((float) 280);

    /* renamed from: d  reason: collision with root package name */
    private static final float f7561d = h.B((float) 1);

    /* renamed from: e  reason: collision with root package name */
    private static final float f7562e = h.B((float) 2);

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ U0 f7563c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f7564d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f7565e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f7566f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ boolean f7567g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ b0 f7568h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ k f7569i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ boolean f7570j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f7571k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f7572l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f7573m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f7574n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ i1 f7575o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ T0 f7576p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ C5834E f7577q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ int f7578r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ int f7579s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ int f7580t;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(U0 u02, String str, p<? super C4889m, ? super Integer, C16807N> pVar, boolean z10, boolean z11, b0 b0Var, k kVar, boolean z12, p<? super C4889m, ? super Integer, C16807N> pVar2, p<? super C4889m, ? super Integer, C16807N> pVar3, p<? super C4889m, ? super Integer, C16807N> pVar4, p<? super C4889m, ? super Integer, C16807N> pVar5, i1 i1Var, T0 t02, C5834E e10, int i10, int i11, int i12) {
            super(2);
            this.f7563c = u02;
            this.f7564d = str;
            this.f7565e = pVar;
            this.f7566f = z10;
            this.f7567g = z11;
            this.f7568h = b0Var;
            this.f7569i = kVar;
            this.f7570j = z12;
            this.f7571k = pVar2;
            this.f7572l = pVar3;
            this.f7573m = pVar4;
            this.f7574n = pVar5;
            this.f7575o = i1Var;
            this.f7576p = t02;
            this.f7577q = e10;
            this.f7578r = i10;
            this.f7579s = i11;
            this.f7580t = i12;
        }

        public final void a(C4889m mVar, int i10) {
            C4889m mVar2 = mVar;
            U0 u02 = this.f7563c;
            U0 u03 = u02;
            u03.a(this.f7564d, this.f7565e, this.f7566f, this.f7567g, this.f7568h, this.f7569i, this.f7570j, this.f7571k, this.f7572l, this.f7573m, this.f7574n, this.f7575o, this.f7576p, this.f7577q, mVar2, M0.a(this.f7578r | 1), M0.a(this.f7579s), this.f7580t);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/d;", "a", "(Landroidx/compose/ui/d;LU0/m;I)Landroidx/compose/ui/d;"}, k = 3, mv = {1, 8, 0})
    static final class b extends C17544u implements q<d, C4889m, Integer, d> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f7581c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f7582d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ k f7583e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ T0 f7584f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ float f7585g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ float f7586h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(boolean z10, boolean z11, k kVar, T0 t02, float f10, float f11) {
            super(3);
            this.f7581c = z10;
            this.f7582d = z11;
            this.f7583e = kVar;
            this.f7584f = t02;
            this.f7585g = f10;
            this.f7586h = f11;
        }

        public final d a(d dVar, C4889m mVar, int i10) {
            mVar.W(1398930845);
            if (C4895p.J()) {
                C4895p.S(1398930845, i10, -1, "androidx.compose.material.TextFieldDefaults.indicatorLine.<anonymous> (TextFieldDefaults.kt:299)");
            }
            d j10 = X0.j(d.f18749a, (C5601g) V0.b(this.f7581c, this.f7582d, this.f7583e, this.f7584f, this.f7585g, this.f7586h, mVar, 0).getValue());
            if (C4895p.J()) {
                C4895p.R();
            }
            mVar.P();
            return j10;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((d) obj, (C4889m) obj2, ((Number) obj3).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/v0;", "LXH/N;", "a", "(Landroidx/compose/ui/platform/v0;)V"}, k = 3, mv = {1, 8, 0})
    public static final class c extends C17544u implements C17642l<C5137v0, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f7587c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f7588d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ k f7589e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ T0 f7590f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ float f7591g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ float f7592h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(boolean z10, boolean z11, k kVar, T0 t02, float f10, float f11) {
            super(1);
            this.f7587c = z10;
            this.f7588d = z11;
            this.f7589e = kVar;
            this.f7590f = t02;
            this.f7591g = f10;
            this.f7592h = f11;
        }

        public final void a(C5137v0 v0Var) {
            v0Var.b("indicatorLine");
            v0Var.a().c("enabled", Boolean.valueOf(this.f7587c));
            v0Var.a().c("isError", Boolean.valueOf(this.f7588d));
            v0Var.a().c("interactionSource", this.f7589e);
            v0Var.a().c("colors", this.f7590f);
            v0Var.a().c("focusedIndicatorLineThickness", h.m(this.f7591g));
            v0Var.a().c("unfocusedIndicatorLineThickness", h.m(this.f7592h));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C5137v0) obj);
            return C16807N.f139792a;
        }
    }

    private U0() {
    }

    public static /* synthetic */ d f(U0 u02, d dVar, boolean z10, boolean z11, k kVar, T0 t02, float f10, float f11, int i10, Object obj) {
        return u02.e(dVar, z10, z11, kVar, t02, (i10 & 16) != 0 ? f7562e : f10, (i10 & 32) != 0 ? f7561d : f11);
    }

    public static /* synthetic */ C5834E i(U0 u02, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = W0.g();
        }
        if ((i10 & 2) != 0) {
            f11 = W0.g();
        }
        if ((i10 & 4) != 0) {
            f12 = X0.k();
        }
        if ((i10 & 8) != 0) {
            f13 = X0.l();
        }
        return u02.h(f10, f11, f12, f13);
    }

    public static /* synthetic */ C5834E k(U0 u02, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = W0.g();
        }
        if ((i10 & 2) != 0) {
            f11 = W0.g();
        }
        if ((i10 & 4) != 0) {
            f12 = W0.g();
        }
        if ((i10 & 8) != 0) {
            f13 = W0.g();
        }
        return u02.j(f10, f11, f12, f13);
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x01aa  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x01b4  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x01db  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x01f2  */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x039f  */
    /* JADX WARNING: Removed duplicated region for block: B:222:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0126  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r61, nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r62, boolean r63, boolean r64, T1.b0 r65, r0.k r66, boolean r67, nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r68, nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r69, nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r70, nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r71, p1.i1 r72, I0.T0 r73, s0.C5834E r74, U0.C4889m r75, int r76, int r77, int r78) {
        /*
            r60 = this;
            r0 = r60
            r15 = r76
            r13 = r77
            r14 = r78
            r11 = -1391531252(0xffffffffad0eeb0c, float:-8.123956E-12)
            r1 = r75
            U0.m r12 = r1.k(r11)
            r1 = r14 & 1
            if (r1 == 0) goto L_0x001a
            r1 = r15 | 6
            r9 = r61
            goto L_0x002c
        L_0x001a:
            r1 = r15 & 6
            r9 = r61
            if (r1 != 0) goto L_0x002b
            boolean r1 = r12.V(r9)
            if (r1 == 0) goto L_0x0028
            r1 = 4
            goto L_0x0029
        L_0x0028:
            r1 = 2
        L_0x0029:
            r1 = r1 | r15
            goto L_0x002c
        L_0x002b:
            r1 = r15
        L_0x002c:
            r4 = r14 & 2
            if (r4 == 0) goto L_0x0035
            r1 = r1 | 48
            r10 = r62
            goto L_0x0047
        L_0x0035:
            r4 = r15 & 48
            r10 = r62
            if (r4 != 0) goto L_0x0047
            boolean r4 = r12.F(r10)
            if (r4 == 0) goto L_0x0044
            r4 = 32
            goto L_0x0046
        L_0x0044:
            r4 = 16
        L_0x0046:
            r1 = r1 | r4
        L_0x0047:
            r4 = r14 & 4
            if (r4 == 0) goto L_0x0050
            r1 = r1 | 384(0x180, float:5.38E-43)
        L_0x004d:
            r4 = r63
            goto L_0x0063
        L_0x0050:
            r4 = r15 & 384(0x180, float:5.38E-43)
            if (r4 != 0) goto L_0x004d
            r4 = r63
            boolean r16 = r12.b(r4)
            if (r16 == 0) goto L_0x005f
            r16 = 256(0x100, float:3.59E-43)
            goto L_0x0061
        L_0x005f:
            r16 = 128(0x80, float:1.794E-43)
        L_0x0061:
            r1 = r1 | r16
        L_0x0063:
            r16 = r14 & 8
            r17 = 1024(0x400, float:1.435E-42)
            r18 = 2048(0x800, float:2.87E-42)
            if (r16 == 0) goto L_0x0070
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L_0x006d:
            r2 = r64
            goto L_0x0083
        L_0x0070:
            r2 = r15 & 3072(0xc00, float:4.305E-42)
            if (r2 != 0) goto L_0x006d
            r2 = r64
            boolean r16 = r12.b(r2)
            if (r16 == 0) goto L_0x007f
            r16 = r18
            goto L_0x0081
        L_0x007f:
            r16 = r17
        L_0x0081:
            r1 = r1 | r16
        L_0x0083:
            r16 = r14 & 16
            r19 = 16384(0x4000, float:2.2959E-41)
            r20 = 8192(0x2000, float:1.14794E-41)
            if (r16 == 0) goto L_0x0090
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
        L_0x008d:
            r3 = r65
            goto L_0x00a3
        L_0x0090:
            r3 = r15 & 24576(0x6000, float:3.4438E-41)
            if (r3 != 0) goto L_0x008d
            r3 = r65
            boolean r21 = r12.V(r3)
            if (r21 == 0) goto L_0x009f
            r21 = r19
            goto L_0x00a1
        L_0x009f:
            r21 = r20
        L_0x00a1:
            r1 = r1 | r21
        L_0x00a3:
            r21 = r14 & 32
            r48 = 196608(0x30000, float:2.75506E-40)
            if (r21 == 0) goto L_0x00ae
            r1 = r1 | r48
            r11 = r66
            goto L_0x00c1
        L_0x00ae:
            r21 = r15 & r48
            r11 = r66
            if (r21 != 0) goto L_0x00c1
            boolean r22 = r12.V(r11)
            if (r22 == 0) goto L_0x00bd
            r22 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00bf
        L_0x00bd:
            r22 = 65536(0x10000, float:9.18355E-41)
        L_0x00bf:
            r1 = r1 | r22
        L_0x00c1:
            r22 = r14 & 64
            r23 = 1572864(0x180000, float:2.204052E-39)
            if (r22 == 0) goto L_0x00cc
            r1 = r1 | r23
            r5 = r67
            goto L_0x00df
        L_0x00cc:
            r23 = r15 & r23
            r5 = r67
            if (r23 != 0) goto L_0x00df
            boolean r24 = r12.b(r5)
            if (r24 == 0) goto L_0x00db
            r24 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00dd
        L_0x00db:
            r24 = 524288(0x80000, float:7.34684E-40)
        L_0x00dd:
            r1 = r1 | r24
        L_0x00df:
            r6 = r14 & 128(0x80, float:1.794E-43)
            r25 = 12582912(0xc00000, float:1.7632415E-38)
            if (r6 == 0) goto L_0x00ea
            r1 = r1 | r25
            r7 = r68
            goto L_0x00fd
        L_0x00ea:
            r25 = r15 & r25
            r7 = r68
            if (r25 != 0) goto L_0x00fd
            boolean r26 = r12.F(r7)
            if (r26 == 0) goto L_0x00f9
            r26 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00fb
        L_0x00f9:
            r26 = 4194304(0x400000, float:5.877472E-39)
        L_0x00fb:
            r1 = r1 | r26
        L_0x00fd:
            r8 = r14 & 256(0x100, float:3.59E-43)
            r27 = 100663296(0x6000000, float:2.4074124E-35)
            if (r8 == 0) goto L_0x0108
            r1 = r1 | r27
            r2 = r69
            goto L_0x011b
        L_0x0108:
            r27 = r15 & r27
            r2 = r69
            if (r27 != 0) goto L_0x011b
            boolean r27 = r12.F(r2)
            if (r27 == 0) goto L_0x0117
            r27 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0119
        L_0x0117:
            r27 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0119:
            r1 = r1 | r27
        L_0x011b:
            r2 = r14 & 512(0x200, float:7.175E-43)
            r27 = 805306368(0x30000000, float:4.656613E-10)
            if (r2 == 0) goto L_0x0126
            r1 = r1 | r27
            r3 = r70
            goto L_0x0139
        L_0x0126:
            r27 = r15 & r27
            r3 = r70
            if (r27 != 0) goto L_0x0139
            boolean r27 = r12.F(r3)
            if (r27 == 0) goto L_0x0135
            r27 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0137
        L_0x0135:
            r27 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0137:
            r1 = r1 | r27
        L_0x0139:
            r3 = r14 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L_0x0142
            r16 = r13 | 6
            r4 = r71
            goto L_0x0158
        L_0x0142:
            r27 = r13 & 6
            r4 = r71
            if (r27 != 0) goto L_0x0156
            boolean r27 = r12.F(r4)
            if (r27 == 0) goto L_0x0151
            r16 = 4
            goto L_0x0153
        L_0x0151:
            r16 = 2
        L_0x0153:
            r16 = r13 | r16
            goto L_0x0158
        L_0x0156:
            r16 = r13
        L_0x0158:
            r27 = r13 & 48
            if (r27 != 0) goto L_0x0172
            r4 = r14 & 2048(0x800, float:2.87E-42)
            if (r4 != 0) goto L_0x016b
            r4 = r72
            boolean r27 = r12.V(r4)
            if (r27 == 0) goto L_0x016d
            r23 = 32
            goto L_0x016f
        L_0x016b:
            r4 = r72
        L_0x016d:
            r23 = 16
        L_0x016f:
            r16 = r16 | r23
            goto L_0x0174
        L_0x0172:
            r4 = r72
        L_0x0174:
            r4 = r13 & 384(0x180, float:5.38E-43)
            if (r4 != 0) goto L_0x018e
            r4 = r14 & 4096(0x1000, float:5.74E-42)
            if (r4 != 0) goto L_0x0187
            r4 = r73
            boolean r23 = r12.V(r4)
            if (r23 == 0) goto L_0x0189
            r25 = 256(0x100, float:3.59E-43)
            goto L_0x018b
        L_0x0187:
            r4 = r73
        L_0x0189:
            r25 = 128(0x80, float:1.794E-43)
        L_0x018b:
            r16 = r16 | r25
            goto L_0x0190
        L_0x018e:
            r4 = r73
        L_0x0190:
            r4 = r13 & 3072(0xc00, float:4.305E-42)
            if (r4 != 0) goto L_0x01aa
            r4 = r14 & 8192(0x2000, float:1.14794E-41)
            if (r4 != 0) goto L_0x01a3
            r4 = r74
            boolean r23 = r12.V(r4)
            if (r23 == 0) goto L_0x01a5
            r17 = r18
            goto L_0x01a5
        L_0x01a3:
            r4 = r74
        L_0x01a5:
            r16 = r16 | r17
        L_0x01a7:
            r4 = r16
            goto L_0x01ad
        L_0x01aa:
            r4 = r74
            goto L_0x01a7
        L_0x01ad:
            r5 = r14 & 16384(0x4000, float:2.2959E-41)
            if (r5 == 0) goto L_0x01b4
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
            goto L_0x01c3
        L_0x01b4:
            r5 = r13 & 24576(0x6000, float:3.4438E-41)
            if (r5 != 0) goto L_0x01c3
            boolean r5 = r12.V(r0)
            if (r5 == 0) goto L_0x01bf
            goto L_0x01c1
        L_0x01bf:
            r19 = r20
        L_0x01c1:
            r4 = r4 | r19
        L_0x01c3:
            r5 = 306783379(0x12492493, float:6.34695E-28)
            r5 = r5 & r1
            r75 = r1
            r1 = 306783378(0x12492492, float:6.3469493E-28)
            if (r5 != r1) goto L_0x01f2
            r1 = r4 & 9363(0x2493, float:1.312E-41)
            r5 = 9362(0x2492, float:1.3119E-41)
            if (r1 != r5) goto L_0x01f2
            boolean r1 = r12.l()
            if (r1 != 0) goto L_0x01db
            goto L_0x01f2
        L_0x01db:
            r12.L()
            r8 = r67
            r10 = r69
            r52 = r70
            r13 = r72
            r15 = r74
            r9 = r7
            r57 = r12
            r11 = r14
            r12 = r71
            r14 = r73
            goto L_0x0399
        L_0x01f2:
            r12.G()
            r1 = r15 & 1
            if (r1 == 0) goto L_0x022c
            boolean r1 = r12.O()
            if (r1 == 0) goto L_0x0200
            goto L_0x022c
        L_0x0200:
            r12.L()
            r1 = r14 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x0209
            r4 = r4 & -113(0xffffffffffffff8f, float:NaN)
        L_0x0209:
            r1 = r14 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x020f
            r4 = r4 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x020f:
            r1 = r14 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x0215
            r4 = r4 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x0215:
            r49 = r67
            r51 = r69
            r52 = r70
            r53 = r71
            r54 = r72
            r0 = r73
            r1 = r74
            r55 = r75
            r50 = r7
            r57 = r12
            r11 = r14
            goto L_0x02fe
        L_0x022c:
            if (r22 == 0) goto L_0x0232
            r1 = 0
            r49 = r1
            goto L_0x0234
        L_0x0232:
            r49 = r67
        L_0x0234:
            r1 = 0
            if (r6 == 0) goto L_0x023a
            r50 = r1
            goto L_0x023c
        L_0x023a:
            r50 = r7
        L_0x023c:
            if (r8 == 0) goto L_0x0241
            r51 = r1
            goto L_0x0243
        L_0x0241:
            r51 = r69
        L_0x0243:
            if (r2 == 0) goto L_0x0248
            r52 = r1
            goto L_0x024a
        L_0x0248:
            r52 = r70
        L_0x024a:
            if (r3 == 0) goto L_0x024f
            r53 = r1
            goto L_0x0251
        L_0x024f:
            r53 = r71
        L_0x0251:
            r1 = r14 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x0263
            int r1 = r4 >> 12
            r1 = r1 & 14
            p1.i1 r1 = r0.d(r12, r1)
            r4 = r4 & -113(0xffffffffffffff8f, float:NaN)
            r54 = r1
        L_0x0261:
            r7 = r4
            goto L_0x0266
        L_0x0263:
            r54 = r72
            goto L_0x0261
        L_0x0266:
            r1 = r14 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x02b7
            int r1 = r7 >> 9
            r46 = r1 & 112(0x70, float:1.57E-43)
            r47 = 2097151(0x1fffff, float:2.938734E-39)
            r1 = 0
            r8 = r75
            r3 = 0
            r5 = 0
            r16 = 0
            r56 = r7
            r55 = r8
            r7 = r16
            r9 = r16
            r57 = r12
            r11 = r16
            r13 = r16
            r15 = r16
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
            r44 = 0
            r45 = 0
            r0 = r60
            r43 = r57
            I0.T0 r0 = r0.g(r1, r3, r5, r7, r9, r11, r13, r15, r17, r19, r21, r23, r25, r27, r29, r31, r33, r35, r37, r39, r41, r43, r44, r45, r46, r47)
            r4 = r56
            r1 = r4 & -897(0xfffffffffffffc7f, float:NaN)
            r4 = r1
            goto L_0x02be
        L_0x02b7:
            r55 = r75
            r4 = r7
            r57 = r12
            r0 = r73
        L_0x02be:
            r11 = r78
            r1 = r11 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x02fc
            if (r50 != 0) goto L_0x02e0
            r1 = 15
            r2 = 0
            r3 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r67 = r60
            r68 = r3
            r69 = r5
            r70 = r6
            r71 = r7
            r72 = r1
            r73 = r2
            s0.E r1 = k(r67, r68, r69, r70, r71, r72, r73)
            goto L_0x02f9
        L_0x02e0:
            r1 = 15
            r2 = 0
            r3 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r67 = r60
            r68 = r3
            r69 = r5
            r70 = r6
            r71 = r7
            r72 = r1
            r73 = r2
            s0.E r1 = i(r67, r68, r69, r70, r71, r72, r73)
        L_0x02f9:
            r4 = r4 & -7169(0xffffffffffffe3ff, float:NaN)
            goto L_0x02fe
        L_0x02fc:
            r1 = r74
        L_0x02fe:
            r57.y()
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x0312
            java.lang.String r2 = "androidx.compose.material.TextFieldDefaults.TextFieldDecorationBox (TextFieldDefaults.kt:581)"
            r5 = r55
            r3 = -1391531252(0xffffffffad0eeb0c, float:-8.123956E-12)
            U0.C4895p.S(r3, r5, r4, r2)
            goto L_0x0314
        L_0x0312:
            r5 = r55
        L_0x0314:
            I0.a1 r12 = I0.a1.Filled
            int r2 = r5 << 3
            r3 = r2 & 112(0x70, float:1.57E-43)
            r3 = r3 | 6
            r2 = r2 & 896(0x380, float:1.256E-42)
            r2 = r2 | r3
            int r3 = r5 >> 3
            r3 = r3 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 | r3
            int r3 = r5 >> 9
            r6 = 57344(0xe000, float:8.0356E-41)
            r6 = r6 & r3
            r2 = r2 | r6
            r6 = 458752(0x70000, float:6.42848E-40)
            r6 = r6 & r3
            r2 = r2 | r6
            r6 = 3670016(0x380000, float:5.142788E-39)
            r3 = r3 & r6
            r2 = r2 | r3
            int r3 = r4 << 21
            r6 = 29360128(0x1c00000, float:7.052966E-38)
            r3 = r3 & r6
            r2 = r2 | r3
            int r3 = r5 << 15
            r6 = 234881024(0xe000000, float:1.5777218E-30)
            r3 = r3 & r6
            r2 = r2 | r3
            int r3 = r5 << 21
            r6 = 1879048192(0x70000000, float:1.58456325E29)
            r3 = r3 & r6
            r29 = r2 | r3
            int r2 = r5 >> 18
            r2 = r2 & 14
            r2 = r2 | r48
            int r3 = r5 >> 12
            r3 = r3 & 112(0x70, float:1.57E-43)
            r2 = r2 | r3
            int r3 = r4 >> 3
            r3 = r3 & 896(0x380, float:1.256E-42)
            r2 = r2 | r3
            int r3 = r4 << 6
            r4 = r3 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 | r4
            r4 = 57344(0xe000, float:8.0356E-41)
            r3 = r3 & r4
            r30 = r2 | r3
            r27 = 0
            r13 = r61
            r14 = r62
            r15 = r65
            r16 = r50
            r17 = r51
            r18 = r52
            r19 = r53
            r20 = r64
            r21 = r63
            r22 = r49
            r23 = r66
            r24 = r1
            r25 = r54
            r26 = r0
            r28 = r57
            I0.W0.a(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x038d
            U0.C4895p.R()
        L_0x038d:
            r14 = r0
            r15 = r1
            r8 = r49
            r9 = r50
            r10 = r51
            r12 = r53
            r13 = r54
        L_0x0399:
            U0.Y0 r7 = r57.n()
            if (r7 == 0) goto L_0x03c6
            I0.U0$a r6 = new I0.U0$a
            r0 = r6
            r1 = r60
            r2 = r61
            r3 = r62
            r4 = r63
            r5 = r64
            r58 = r6
            r6 = r65
            r59 = r7
            r7 = r66
            r11 = r52
            r16 = r76
            r17 = r77
            r18 = r78
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r1 = r58
            r0 = r59
            r0.a(r1)
        L_0x03c6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: I0.U0.a(java.lang.String, nI.p, boolean, boolean, T1.b0, r0.k, boolean, nI.p, nI.p, nI.p, nI.p, p1.i1, I0.T0, s0.E, U0.m, int, int, int):void");
    }

    public final float b() {
        return f7559b;
    }

    public final float c() {
        return f7560c;
    }

    public final i1 d(C4889m mVar, int i10) {
        if (C4895p.J()) {
            C4895p.S(-1117199624, i10, -1, "androidx.compose.material.TextFieldDefaults.<get-TextFieldShape> (TextFieldDefaults.kt:233)");
        }
        A0.a d10 = A0.a.d(C4553d0.f7988a.b(mVar, 6).c(), (A0.b) null, (A0.b) null, A0.c.c(), A0.c.c(), 3, (Object) null);
        if (C4895p.J()) {
            C4895p.R();
        }
        return d10;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: nI.l<androidx.compose.ui.platform.v0, XH.N>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: I0.U0$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: I0.U0$c} */
    /* JADX WARNING: type inference failed for: r0v1, types: [nI.l] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.ui.d e(androidx.compose.ui.d r10, boolean r11, boolean r12, r0.k r13, I0.T0 r14, float r15, float r16) {
        /*
            r9 = this;
            boolean r0 = androidx.compose.ui.platform.C5133t0.b()
            if (r0 == 0) goto L_0x0014
            I0.U0$c r0 = new I0.U0$c
            r1 = r0
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7)
            goto L_0x0018
        L_0x0014:
            nI.l r0 = androidx.compose.ui.platform.C5133t0.a()
        L_0x0018:
            I0.U0$b r8 = new I0.U0$b
            r1 = r8
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r1 = r10
            androidx.compose.ui.d r0 = androidx.compose.ui.c.b(r10, r0, r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: I0.U0.e(androidx.compose.ui.d, boolean, boolean, r0.k, I0.T0, float, float):androidx.compose.ui.d");
    }

    public final T0 g(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, C4889m mVar, int i10, int i11, int i12, int i13) {
        long j31;
        long j32;
        long j33;
        long j34;
        int i14;
        long j35;
        long j36;
        long j37;
        long j38;
        long j39;
        long j40;
        long j41;
        long j42;
        int i15;
        long j43;
        long j44;
        long j45;
        long j46;
        long j47;
        long j48;
        int i16;
        long j49;
        long j50;
        C4889m mVar2 = mVar;
        int i17 = i13;
        long o10 = (i17 & 1) != 0 ? C5747v0.o(((C5747v0) mVar2.Q(C4581s.a())).y(), ((Number) mVar2.Q(r.a())).floatValue(), 0.0f, 0.0f, 0.0f, 14, (Object) null) : j10;
        long o11 = (i17 & 2) != 0 ? C5747v0.o(o10, C4578q.f8304a.b(mVar2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null) : j11;
        long o12 = (i17 & 4) != 0 ? C5747v0.o(C4553d0.f7988a.a(mVar2, 6).i(), 0.12f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j12;
        long j51 = (i17 & 8) != 0 ? C4553d0.f7988a.a(mVar2, 6).j() : j13;
        long d10 = (i17 & 16) != 0 ? C4553d0.f7988a.a(mVar2, 6).d() : j14;
        long o13 = (i17 & 32) != 0 ? C5747v0.o(C4553d0.f7988a.a(mVar2, 6).j(), C4578q.f8304a.c(mVar2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null) : j15;
        long o14 = (i17 & 64) != 0 ? C5747v0.o(C4553d0.f7988a.a(mVar2, 6).i(), 0.42f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j16;
        if ((i17 & 128) != 0) {
            j31 = o12;
            j32 = C5747v0.o(o14, C4578q.f8304a.b(mVar2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j31 = o12;
            j32 = j17;
        }
        if ((i17 & 256) != 0) {
            j34 = j32;
            i14 = 6;
            j33 = C4553d0.f7988a.a(mVar2, 6).d();
        } else {
            j34 = j32;
            i14 = 6;
            j33 = j18;
        }
        long o15 = (i17 & 512) != 0 ? C5747v0.o(C4553d0.f7988a.a(mVar2, i14).i(), 0.54f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j19;
        if ((i17 & 1024) != 0) {
            j35 = o14;
            j36 = C5747v0.o(o15, C4578q.f8304a.b(mVar2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j35 = o14;
            j36 = j20;
        }
        long j52 = (i17 & RecyclerView.n.FLAG_MOVED) != 0 ? o15 : j21;
        if ((i17 & RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
            j37 = j36;
            j38 = C5747v0.o(C4553d0.f7988a.a(mVar2, 6).i(), 0.54f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j37 = j36;
            j38 = j22;
        }
        if ((i17 & 8192) != 0) {
            j39 = o15;
            j40 = C5747v0.o(j38, C4578q.f8304a.b(mVar2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j39 = o15;
            j40 = j23;
        }
        if ((i17 & 16384) != 0) {
            j41 = j40;
            i15 = 6;
            j42 = C4553d0.f7988a.a(mVar2, 6).d();
        } else {
            j41 = j40;
            i15 = 6;
            j42 = j24;
        }
        long o16 = (32768 & i17) != 0 ? C5747v0.o(C4553d0.f7988a.a(mVar2, i15).j(), C4578q.f8304a.c(mVar2, i15), 0.0f, 0.0f, 0.0f, 14, (Object) null) : j25;
        if ((65536 & i17) != 0) {
            j43 = o16;
            j44 = C5747v0.o(C4553d0.f7988a.a(mVar2, 6).i(), C4578q.f8304a.d(mVar2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j43 = o16;
            j44 = j26;
        }
        if ((131072 & i17) != 0) {
            j45 = j38;
            j46 = C5747v0.o(j44, C4578q.f8304a.b(mVar2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j45 = j38;
            j46 = j27;
        }
        if ((262144 & i17) != 0) {
            j48 = j46;
            i16 = 6;
            j47 = C4553d0.f7988a.a(mVar2, 6).d();
        } else {
            j48 = j46;
            i16 = 6;
            j47 = j28;
        }
        long o17 = (524288 & i17) != 0 ? C5747v0.o(C4553d0.f7988a.a(mVar2, i16).i(), C4578q.f8304a.d(mVar2, i16), 0.0f, 0.0f, 0.0f, 14, (Object) null) : j29;
        long o18 = (i17 & ImageMetadata.SHADING_MODE) != 0 ? C5747v0.o(o17, C4578q.f8304a.b(mVar2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null) : j30;
        if (C4895p.J()) {
            j49 = o18;
            j50 = o17;
            C4895p.S(231892599, i10, i11, "androidx.compose.material.TextFieldDefaults.textFieldColors (TextFieldDefaults.kt:422)");
        } else {
            j49 = o18;
            j50 = o17;
        }
        C4595z zVar = new C4595z(o10, o11, j51, d10, o13, j35, j33, j34, j39, j37, j52, j45, j41, j42, j31, j43, j44, j48, j47, j50, j49, (DefaultConstructorMarker) null);
        if (C4895p.J()) {
            C4895p.R();
        }
        return zVar;
    }

    public final C5834E h(float f10, float f11, float f12, float f13) {
        return D.d(f10, f12, f11, f13);
    }

    public final C5834E j(float f10, float f11, float f12, float f13) {
        return D.d(f10, f11, f12, f13);
    }
}
