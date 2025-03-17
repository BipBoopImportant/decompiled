package O0;

import H0.V;
import H0.W;
import Q0.w;
import S0.q;
import T1.b0;
import U0.A1;
import U0.C4889m;
import U0.C4895p;
import U0.M0;
import XH.C16807N;
import androidx.compose.foundation.layout.D;
import androidx.recyclerview.widget.RecyclerView;
import c2.h;
import com.sugarcube.app.base.data.source.CatalogRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.E;
import nI.p;
import p1.C5747v0;
import p1.i1;
import r0.k;
import s0.C5834E;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b/\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\\\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014Jñ\u0001\u0010&\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00120\u00172\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0006\u001a\u00020\u00042\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00172\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00172\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00172\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00172\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00172\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00172\u0010\b\u0002\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00172\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010$\u001a\u00020#2\u000e\b\u0002\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00120\u0017H\u0007¢\u0006\u0004\b&\u0010'J8\u0010,\u001a\u00020#2\b\b\u0002\u0010(\u001a\u00020\u000f2\b\b\u0002\u0010)\u001a\u00020\u000f2\b\b\u0002\u0010*\u001a\u00020\u000f2\b\b\u0002\u0010+\u001a\u00020\u000fø\u0001\u0000¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u000bH\u0007¢\u0006\u0004\b.\u0010/JÂ\u0003\u0010]\u001a\u00020\u000b2\b\b\u0002\u00101\u001a\u0002002\b\b\u0002\u00102\u001a\u0002002\b\b\u0002\u00103\u001a\u0002002\b\b\u0002\u00104\u001a\u0002002\b\b\u0002\u00105\u001a\u0002002\b\b\u0002\u00106\u001a\u0002002\b\b\u0002\u00107\u001a\u0002002\b\b\u0002\u00108\u001a\u0002002\b\b\u0002\u00109\u001a\u0002002\b\b\u0002\u0010:\u001a\u0002002\n\b\u0002\u0010<\u001a\u0004\u0018\u00010;2\b\b\u0002\u0010=\u001a\u0002002\b\b\u0002\u0010>\u001a\u0002002\b\b\u0002\u0010?\u001a\u0002002\b\b\u0002\u0010@\u001a\u0002002\b\b\u0002\u0010A\u001a\u0002002\b\b\u0002\u0010B\u001a\u0002002\b\b\u0002\u0010C\u001a\u0002002\b\b\u0002\u0010D\u001a\u0002002\b\b\u0002\u0010E\u001a\u0002002\b\b\u0002\u0010F\u001a\u0002002\b\b\u0002\u0010G\u001a\u0002002\b\b\u0002\u0010H\u001a\u0002002\b\b\u0002\u0010I\u001a\u0002002\b\b\u0002\u0010J\u001a\u0002002\b\b\u0002\u0010K\u001a\u0002002\b\b\u0002\u0010L\u001a\u0002002\b\b\u0002\u0010M\u001a\u0002002\b\b\u0002\u0010N\u001a\u0002002\b\b\u0002\u0010O\u001a\u0002002\b\b\u0002\u0010P\u001a\u0002002\b\b\u0002\u0010Q\u001a\u0002002\b\b\u0002\u0010R\u001a\u0002002\b\b\u0002\u0010S\u001a\u0002002\b\b\u0002\u0010T\u001a\u0002002\b\b\u0002\u0010U\u001a\u0002002\b\b\u0002\u0010V\u001a\u0002002\b\b\u0002\u0010W\u001a\u0002002\b\b\u0002\u0010X\u001a\u0002002\b\b\u0002\u0010Y\u001a\u0002002\b\b\u0002\u0010Z\u001a\u0002002\b\b\u0002\u0010[\u001a\u0002002\b\b\u0002\u0010\\\u001a\u000200H\u0007ø\u0001\u0000¢\u0006\u0004\b]\u0010^R\u001d\u0010b\u001a\u00020\u000f8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b&\u0010_\u001a\u0004\b`\u0010aR\u001d\u0010d\u001a\u00020\u000f8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b.\u0010_\u001a\u0004\bc\u0010aR\u001d\u0010f\u001a\u00020\u000f8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b]\u0010_\u001a\u0004\be\u0010aR\u001d\u0010h\u001a\u00020\u000f8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b,\u0010_\u001a\u0004\bg\u0010aR\u0011\u0010\u000e\u001a\u00020\r8G¢\u0006\u0006\u001a\u0004\bi\u0010jR\u0018\u0010n\u001a\u00020\u000b*\u00020k8AX\u0004¢\u0006\u0006\u001a\u0004\bl\u0010m\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006o"}, d2 = {"LO0/l0;", "", "<init>", "()V", "", "enabled", "isError", "Lr0/k;", "interactionSource", "Landroidx/compose/ui/d;", "modifier", "LO0/Z0;", "colors", "Lp1/i1;", "shape", "Lc2/h;", "focusedBorderThickness", "unfocusedBorderThickness", "LXH/N;", "a", "(ZZLr0/k;Landroidx/compose/ui/d;LO0/Z0;Lp1/i1;FFLU0/m;II)V", "", "value", "Lkotlin/Function0;", "innerTextField", "singleLine", "LT1/b0;", "visualTransformation", "label", "placeholder", "leadingIcon", "trailingIcon", "prefix", "suffix", "supportingText", "Ls0/E;", "contentPadding", "container", "b", "(Ljava/lang/String;LnI/p;ZZLT1/b0;Lr0/k;ZLnI/p;LnI/p;LnI/p;LnI/p;LnI/p;LnI/p;LnI/p;LO0/Z0;Ls0/E;LnI/p;LU0/m;III)V", "start", "top", "end", "bottom", "e", "(FFFF)Ls0/E;", "c", "(LU0/m;I)LO0/Z0;", "Lp1/v0;", "focusedTextColor", "unfocusedTextColor", "disabledTextColor", "errorTextColor", "focusedContainerColor", "unfocusedContainerColor", "disabledContainerColor", "errorContainerColor", "cursorColor", "errorCursorColor", "LH0/V;", "selectionColors", "focusedBorderColor", "unfocusedBorderColor", "disabledBorderColor", "errorBorderColor", "focusedLeadingIconColor", "unfocusedLeadingIconColor", "disabledLeadingIconColor", "errorLeadingIconColor", "focusedTrailingIconColor", "unfocusedTrailingIconColor", "disabledTrailingIconColor", "errorTrailingIconColor", "focusedLabelColor", "unfocusedLabelColor", "disabledLabelColor", "errorLabelColor", "focusedPlaceholderColor", "unfocusedPlaceholderColor", "disabledPlaceholderColor", "errorPlaceholderColor", "focusedSupportingTextColor", "unfocusedSupportingTextColor", "disabledSupportingTextColor", "errorSupportingTextColor", "focusedPrefixColor", "unfocusedPrefixColor", "disabledPrefixColor", "errorPrefixColor", "focusedSuffixColor", "unfocusedSuffixColor", "disabledSuffixColor", "errorSuffixColor", "d", "(JJJJJJJJJJLH0/V;JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJLU0/m;IIIIIII)LO0/Z0;", "F", "i", "()F", "MinHeight", "j", "MinWidth", "l", "UnfocusedBorderThickness", "h", "FocusedBorderThickness", "k", "(LU0/m;I)Lp1/i1;", "LO0/t;", "g", "(LO0/t;LU0/m;I)LO0/Z0;", "defaultOutlinedTextFieldColors", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: O0.l0  reason: case insensitive filesystem */
public final class C4739l0 {

    /* renamed from: a  reason: collision with root package name */
    public static final C4739l0 f11144a = new C4739l0();

    /* renamed from: b  reason: collision with root package name */
    private static final float f11145b = h.B((float) 56);

    /* renamed from: c  reason: collision with root package name */
    private static final float f11146c = h.B((float) 280);

    /* renamed from: d  reason: collision with root package name */
    private static final float f11147d = h.B((float) 1);

    /* renamed from: e  reason: collision with root package name */
    private static final float f11148e = h.B((float) 2);

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: O0.l0$a */
    /* synthetic */ class a extends E {
        a(Object obj) {
            super(obj, A1.class, "value", "getValue()Ljava/lang/Object;", 0);
        }

        public Object get() {
            return ((A1) this.receiver).getValue();
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: O0.l0$b */
    static final class b extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C4739l0 f11149c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f11150d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f11151e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ k f11152f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f11153g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Z0 f11154h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ i1 f11155i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ float f11156j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ float f11157k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ int f11158l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ int f11159m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C4739l0 l0Var, boolean z10, boolean z11, k kVar, androidx.compose.ui.d dVar, Z0 z02, i1 i1Var, float f10, float f11, int i10, int i11) {
            super(2);
            this.f11149c = l0Var;
            this.f11150d = z10;
            this.f11151e = z11;
            this.f11152f = kVar;
            this.f11153g = dVar;
            this.f11154h = z02;
            this.f11155i = i1Var;
            this.f11156j = f10;
            this.f11157k = f11;
            this.f11158l = i10;
            this.f11159m = i11;
        }

        public final void a(C4889m mVar, int i10) {
            this.f11149c.a(this.f11150d, this.f11151e, this.f11152f, this.f11153g, this.f11154h, this.f11155i, this.f11156j, this.f11157k, mVar, M0.a(this.f11158l | 1), this.f11159m);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: O0.l0$c */
    static final class c extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f11160c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f11161d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ k f11162e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Z0 f11163f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(boolean z10, boolean z11, k kVar, Z0 z02) {
            super(2);
            this.f11160c = z10;
            this.f11161d = z11;
            this.f11162e = kVar;
            this.f11163f = z02;
        }

        public final void a(C4889m mVar, int i10) {
            int i11 = i10;
            if ((i11 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1448570018, i11, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:873)");
                }
                C4739l0 l0Var = C4739l0.f11144a;
                l0Var.a(this.f11160c, this.f11161d, this.f11162e, androidx.compose.ui.d.f18749a, this.f11163f, l0Var.k(mVar, 6), l0Var.h(), l0Var.l(), mVar, 114822144, 0);
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
    /* renamed from: O0.l0$d */
    static final class d extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C4739l0 f11164c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f11165d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f11166e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f11167f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ boolean f11168g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ b0 f11169h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ k f11170i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ boolean f11171j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f11172k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f11173l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f11174m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f11175n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f11176o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f11177p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f11178q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ Z0 f11179r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ C5834E f11180s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f11181t;

        /* renamed from: u  reason: collision with root package name */
        final /* synthetic */ int f11182u;

        /* renamed from: v  reason: collision with root package name */
        final /* synthetic */ int f11183v;

        /* renamed from: w  reason: collision with root package name */
        final /* synthetic */ int f11184w;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C4739l0 l0Var, String str, p<? super C4889m, ? super Integer, C16807N> pVar, boolean z10, boolean z11, b0 b0Var, k kVar, boolean z12, p<? super C4889m, ? super Integer, C16807N> pVar2, p<? super C4889m, ? super Integer, C16807N> pVar3, p<? super C4889m, ? super Integer, C16807N> pVar4, p<? super C4889m, ? super Integer, C16807N> pVar5, p<? super C4889m, ? super Integer, C16807N> pVar6, p<? super C4889m, ? super Integer, C16807N> pVar7, p<? super C4889m, ? super Integer, C16807N> pVar8, Z0 z02, C5834E e10, p<? super C4889m, ? super Integer, C16807N> pVar9, int i10, int i11, int i12) {
            super(2);
            this.f11164c = l0Var;
            this.f11165d = str;
            this.f11166e = pVar;
            this.f11167f = z10;
            this.f11168g = z11;
            this.f11169h = b0Var;
            this.f11170i = kVar;
            this.f11171j = z12;
            this.f11172k = pVar2;
            this.f11173l = pVar3;
            this.f11174m = pVar4;
            this.f11175n = pVar5;
            this.f11176o = pVar6;
            this.f11177p = pVar7;
            this.f11178q = pVar8;
            this.f11179r = z02;
            this.f11180s = e10;
            this.f11181t = pVar9;
            this.f11182u = i10;
            this.f11183v = i11;
            this.f11184w = i12;
        }

        public final void a(C4889m mVar, int i10) {
            C4889m mVar2 = mVar;
            C4739l0 l0Var = this.f11164c;
            C4739l0 l0Var2 = l0Var;
            l0Var2.b(this.f11165d, this.f11166e, this.f11167f, this.f11168g, this.f11169h, this.f11170i, this.f11171j, this.f11172k, this.f11173l, this.f11174m, this.f11175n, this.f11176o, this.f11177p, this.f11178q, this.f11179r, this.f11180s, this.f11181t, mVar2, M0.a(this.f11182u | 1), M0.a(this.f11183v), this.f11184w);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    private C4739l0() {
    }

    public static /* synthetic */ C5834E f(C4739l0 l0Var, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = w.r();
        }
        if ((i10 & 2) != 0) {
            f11 = w.r();
        }
        if ((i10 & 4) != 0) {
            f12 = w.r();
        }
        if ((i10 & 8) != 0) {
            f13 = w.r();
        }
        return l0Var.e(f10, f11, f12, f13);
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x022b  */
    /* JADX WARNING: Removed duplicated region for block: B:146:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x00ed  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(boolean r25, boolean r26, r0.k r27, androidx.compose.ui.d r28, O0.Z0 r29, p1.i1 r30, float r31, float r32, U0.C4889m r33, int r34, int r35) {
        /*
            r24 = this;
            r12 = r24
            r8 = r25
            r9 = r26
            r10 = r27
            r11 = r34
            r13 = r35
            r0 = 1035477640(0x3db82288, float:0.08990961)
            r1 = r33
            U0.m r14 = r1.k(r0)
            r1 = r13 & 1
            if (r1 == 0) goto L_0x001c
            r1 = r11 | 6
            goto L_0x002c
        L_0x001c:
            r1 = r11 & 6
            if (r1 != 0) goto L_0x002b
            boolean r1 = r14.b(r8)
            if (r1 == 0) goto L_0x0028
            r1 = 4
            goto L_0x0029
        L_0x0028:
            r1 = 2
        L_0x0029:
            r1 = r1 | r11
            goto L_0x002c
        L_0x002b:
            r1 = r11
        L_0x002c:
            r2 = r13 & 2
            if (r2 == 0) goto L_0x0033
            r1 = r1 | 48
            goto L_0x0043
        L_0x0033:
            r2 = r11 & 48
            if (r2 != 0) goto L_0x0043
            boolean r2 = r14.b(r9)
            if (r2 == 0) goto L_0x0040
            r2 = 32
            goto L_0x0042
        L_0x0040:
            r2 = 16
        L_0x0042:
            r1 = r1 | r2
        L_0x0043:
            r2 = r13 & 4
            if (r2 == 0) goto L_0x004a
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x005a
        L_0x004a:
            r2 = r11 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L_0x005a
            boolean r2 = r14.V(r10)
            if (r2 == 0) goto L_0x0057
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x0059
        L_0x0057:
            r2 = 128(0x80, float:1.794E-43)
        L_0x0059:
            r1 = r1 | r2
        L_0x005a:
            r2 = r13 & 8
            if (r2 == 0) goto L_0x0063
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L_0x0060:
            r3 = r28
            goto L_0x0075
        L_0x0063:
            r3 = r11 & 3072(0xc00, float:4.305E-42)
            if (r3 != 0) goto L_0x0060
            r3 = r28
            boolean r4 = r14.V(r3)
            if (r4 == 0) goto L_0x0072
            r4 = 2048(0x800, float:2.87E-42)
            goto L_0x0074
        L_0x0072:
            r4 = 1024(0x400, float:1.435E-42)
        L_0x0074:
            r1 = r1 | r4
        L_0x0075:
            r4 = r11 & 24576(0x6000, float:3.4438E-41)
            if (r4 != 0) goto L_0x008e
            r4 = r13 & 16
            if (r4 != 0) goto L_0x0088
            r4 = r29
            boolean r5 = r14.V(r4)
            if (r5 == 0) goto L_0x008a
            r5 = 16384(0x4000, float:2.2959E-41)
            goto L_0x008c
        L_0x0088:
            r4 = r29
        L_0x008a:
            r5 = 8192(0x2000, float:1.14794E-41)
        L_0x008c:
            r1 = r1 | r5
            goto L_0x0090
        L_0x008e:
            r4 = r29
        L_0x0090:
            r5 = 196608(0x30000, float:2.75506E-40)
            r5 = r5 & r11
            if (r5 != 0) goto L_0x00aa
            r5 = r13 & 32
            if (r5 != 0) goto L_0x00a4
            r5 = r30
            boolean r6 = r14.V(r5)
            if (r6 == 0) goto L_0x00a6
            r6 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00a8
        L_0x00a4:
            r5 = r30
        L_0x00a6:
            r6 = 65536(0x10000, float:9.18355E-41)
        L_0x00a8:
            r1 = r1 | r6
            goto L_0x00ac
        L_0x00aa:
            r5 = r30
        L_0x00ac:
            r6 = 1572864(0x180000, float:2.204052E-39)
            r6 = r6 & r11
            if (r6 != 0) goto L_0x00c6
            r6 = r13 & 64
            if (r6 != 0) goto L_0x00c0
            r6 = r31
            boolean r7 = r14.c(r6)
            if (r7 == 0) goto L_0x00c2
            r7 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00c4
        L_0x00c0:
            r6 = r31
        L_0x00c2:
            r7 = 524288(0x80000, float:7.34684E-40)
        L_0x00c4:
            r1 = r1 | r7
            goto L_0x00c8
        L_0x00c6:
            r6 = r31
        L_0x00c8:
            r7 = 12582912(0xc00000, float:1.7632415E-38)
            r7 = r7 & r11
            if (r7 != 0) goto L_0x00e2
            r7 = r13 & 128(0x80, float:1.794E-43)
            if (r7 != 0) goto L_0x00dc
            r7 = r32
            boolean r15 = r14.c(r7)
            if (r15 == 0) goto L_0x00de
            r15 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00e0
        L_0x00dc:
            r7 = r32
        L_0x00de:
            r15 = 4194304(0x400000, float:5.877472E-39)
        L_0x00e0:
            r1 = r1 | r15
            goto L_0x00e4
        L_0x00e2:
            r7 = r32
        L_0x00e4:
            r15 = r13 & 256(0x100, float:3.59E-43)
            r16 = 100663296(0x6000000, float:2.4074124E-35)
            if (r15 == 0) goto L_0x00ed
            r1 = r1 | r16
            goto L_0x00fd
        L_0x00ed:
            r15 = r11 & r16
            if (r15 != 0) goto L_0x00fd
            boolean r15 = r14.V(r12)
            if (r15 == 0) goto L_0x00fa
            r15 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x00fc
        L_0x00fa:
            r15 = 33554432(0x2000000, float:9.403955E-38)
        L_0x00fc:
            r1 = r1 | r15
        L_0x00fd:
            r15 = 38347923(0x2492493, float:1.4777644E-37)
            r15 = r15 & r1
            r0 = 38347922(0x2492492, float:1.4777643E-37)
            if (r15 != r0) goto L_0x011a
            boolean r0 = r14.l()
            if (r0 != 0) goto L_0x010d
            goto L_0x011a
        L_0x010d:
            r14.L()
            r22 = r6
            r23 = r7
            r6 = r4
            r7 = r5
            r5 = r3
            r3 = r14
            goto L_0x0225
        L_0x011a:
            r14.G()
            r0 = r11 & 1
            r17 = -3670017(0xffffffffffc7ffff, float:NaN)
            r18 = -458753(0xfffffffffff8ffff, float:NaN)
            r19 = -57345(0xffffffffffff1fff, float:NaN)
            r15 = 6
            if (r0 == 0) goto L_0x0156
            boolean r0 = r14.O()
            if (r0 == 0) goto L_0x0132
            goto L_0x0156
        L_0x0132:
            r14.L()
            r0 = r13 & 16
            if (r0 == 0) goto L_0x013b
            r1 = r1 & r19
        L_0x013b:
            r0 = r13 & 32
            if (r0 == 0) goto L_0x0141
            r1 = r1 & r18
        L_0x0141:
            r0 = r13 & 64
            if (r0 == 0) goto L_0x0147
            r1 = r1 & r17
        L_0x0147:
            r0 = r13 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x014f
            r0 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r1 = r1 & r0
        L_0x014f:
            r22 = r6
            r23 = r7
            r7 = r3
        L_0x0154:
            r6 = r4
            goto L_0x0197
        L_0x0156:
            if (r2 == 0) goto L_0x015b
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            goto L_0x015c
        L_0x015b:
            r0 = r3
        L_0x015c:
            r2 = r13 & 16
            if (r2 == 0) goto L_0x016b
            int r2 = r1 >> 24
            r2 = r2 & 14
            O0.Z0 r2 = r12.c(r14, r2)
            r1 = r1 & r19
            r4 = r2
        L_0x016b:
            r2 = r13 & 32
            if (r2 == 0) goto L_0x0178
            O0.l0 r2 = f11144a
            p1.i1 r2 = r2.k(r14, r15)
            r1 = r1 & r18
            r5 = r2
        L_0x0178:
            r2 = r13 & 64
            if (r2 == 0) goto L_0x0181
            float r2 = f11148e
            r1 = r1 & r17
            r6 = r2
        L_0x0181:
            r2 = r13 & 128(0x80, float:1.794E-43)
            if (r2 == 0) goto L_0x0191
            float r2 = f11147d
            r3 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r1 = r1 & r3
            r7 = r0
            r23 = r2
            r22 = r6
            goto L_0x0154
        L_0x0191:
            r22 = r6
            r23 = r7
            r7 = r0
            goto L_0x0154
        L_0x0197:
            r14.y()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x01a9
            r0 = -1
            java.lang.String r2 = "androidx.compose.material3.OutlinedTextFieldDefaults.Container (TextFieldDefaults.kt:776)"
            r3 = 1035477640(0x3db82288, float:0.08990961)
            U0.C4895p.S(r3, r1, r0, r2)
        L_0x01a9:
            int r0 = r1 >> 6
            r2 = r0 & 14
            U0.A1 r2 = r0.C5814f.a(r10, r14, r2)
            java.lang.Object r2 = r2.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r4 = r2.booleanValue()
            r2 = r1 & 126(0x7e, float:1.77E-43)
            int r1 = r1 >> 3
            r1 = r1 & 7168(0x1c00, float:1.0045E-41)
            r1 = r1 | r2
            r2 = 57344(0xe000, float:8.0356E-41)
            r2 = r2 & r0
            r1 = r1 | r2
            r2 = 458752(0x70000, float:6.42848E-40)
            r0 = r0 & r2
            r16 = r1 | r0
            r0 = r25
            r1 = r26
            r2 = r4
            r3 = r6
            r15 = r4
            r4 = r22
            r10 = r5
            r5 = r23
            r11 = r6
            r6 = r14
            r12 = r7
            r7 = r16
            U0.A1 r0 = Q0.w.h(r0, r1, r2, r3, r4, r5, r6, r7)
            long r1 = r11.a(r8, r9, r15)
            r3 = 150(0x96, float:2.1E-43)
            r4 = 0
            r5 = 0
            r6 = 6
            m0.y0 r16 = m0.C5548j.j(r3, r4, r5, r6, r5)
            r20 = 48
            r21 = 12
            r17 = 0
            r18 = 0
            r3 = r14
            r14 = r1
            r19 = r3
            U0.A1 r1 = l0.u.a(r14, r16, r17, r18, r19, r20, r21)
            java.lang.Object r0 = r0.getValue()
            n0.g r0 = (n0.C5601g) r0
            androidx.compose.ui.d r0 = n0.C5599e.e(r12, r0, r10)
            O0.l0$a r2 = new O0.l0$a
            r2.<init>(r1)
            O0.a1$a r1 = new O0.a1$a
            r1.<init>(r2)
            androidx.compose.ui.d r0 = Q0.w.u(r0, r1, r10)
            androidx.compose.foundation.layout.C5077h.a(r0, r3, r4)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0222
            U0.C4895p.R()
        L_0x0222:
            r7 = r10
            r6 = r11
            r5 = r12
        L_0x0225:
            U0.Y0 r12 = r3.n()
            if (r12 == 0) goto L_0x0244
            O0.l0$b r14 = new O0.l0$b
            r0 = r14
            r1 = r24
            r2 = r25
            r3 = r26
            r4 = r27
            r8 = r22
            r9 = r23
            r10 = r34
            r11 = r35
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.a(r14)
        L_0x0244:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: O0.C4739l0.a(boolean, boolean, r0.k, androidx.compose.ui.d, O0.Z0, p1.i1, float, float, U0.m, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x01af  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x01c3  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x01c9  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x01e0  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x01e6  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x01eb  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0202  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0205  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x0230  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x024b  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x03e4  */
    /* JADX WARNING: Removed duplicated region for block: B:253:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0127  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(java.lang.String r42, nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r43, boolean r44, boolean r45, T1.b0 r46, r0.k r47, boolean r48, nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r49, nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r50, nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r51, nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r52, nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r53, nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r54, nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r55, O0.Z0 r56, s0.C5834E r57, nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r58, U0.C4889m r59, int r60, int r61, int r62) {
        /*
            r41 = this;
            r15 = r41
            r4 = r44
            r7 = r47
            r14 = r60
            r13 = r61
            r12 = r62
            r0 = -350442135(0xffffffffeb1cad69, float:-1.8941133E26)
            r1 = r59
            U0.m r0 = r1.k(r0)
            r1 = r12 & 1
            if (r1 == 0) goto L_0x001e
            r1 = r14 | 6
            r5 = r42
            goto L_0x0030
        L_0x001e:
            r1 = r14 & 6
            r5 = r42
            if (r1 != 0) goto L_0x002f
            boolean r1 = r0.V(r5)
            if (r1 == 0) goto L_0x002c
            r1 = 4
            goto L_0x002d
        L_0x002c:
            r1 = 2
        L_0x002d:
            r1 = r1 | r14
            goto L_0x0030
        L_0x002f:
            r1 = r14
        L_0x0030:
            r6 = r12 & 2
            if (r6 == 0) goto L_0x0039
            r1 = r1 | 48
        L_0x0036:
            r6 = r43
            goto L_0x004b
        L_0x0039:
            r6 = r14 & 48
            if (r6 != 0) goto L_0x0036
            r6 = r43
            boolean r10 = r0.F(r6)
            if (r10 == 0) goto L_0x0048
            r10 = 32
            goto L_0x004a
        L_0x0048:
            r10 = 16
        L_0x004a:
            r1 = r1 | r10
        L_0x004b:
            r10 = r12 & 4
            r16 = 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0054
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0064
        L_0x0054:
            r10 = r14 & 384(0x180, float:5.38E-43)
            if (r10 != 0) goto L_0x0064
            boolean r10 = r0.b(r4)
            if (r10 == 0) goto L_0x0061
            r10 = r16
            goto L_0x0063
        L_0x0061:
            r10 = 128(0x80, float:1.794E-43)
        L_0x0063:
            r1 = r1 | r10
        L_0x0064:
            r10 = r12 & 8
            r17 = 1024(0x400, float:1.435E-42)
            r18 = 2048(0x800, float:2.87E-42)
            if (r10 == 0) goto L_0x0071
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L_0x006e:
            r10 = r45
            goto L_0x0084
        L_0x0071:
            r10 = r14 & 3072(0xc00, float:4.305E-42)
            if (r10 != 0) goto L_0x006e
            r10 = r45
            boolean r19 = r0.b(r10)
            if (r19 == 0) goto L_0x0080
            r19 = r18
            goto L_0x0082
        L_0x0080:
            r19 = r17
        L_0x0082:
            r1 = r1 | r19
        L_0x0084:
            r19 = r12 & 16
            r20 = 8192(0x2000, float:1.14794E-41)
            r21 = 16384(0x4000, float:2.2959E-41)
            if (r19 == 0) goto L_0x0091
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
        L_0x008e:
            r2 = r46
            goto L_0x00a4
        L_0x0091:
            r2 = r14 & 24576(0x6000, float:3.4438E-41)
            if (r2 != 0) goto L_0x008e
            r2 = r46
            boolean r19 = r0.V(r2)
            if (r19 == 0) goto L_0x00a0
            r19 = r21
            goto L_0x00a2
        L_0x00a0:
            r19 = r20
        L_0x00a2:
            r1 = r1 | r19
        L_0x00a4:
            r19 = r12 & 32
            r22 = 65536(0x10000, float:9.18355E-41)
            r23 = 131072(0x20000, float:1.83671E-40)
            r24 = 196608(0x30000, float:2.75506E-40)
            if (r19 == 0) goto L_0x00b1
            r1 = r1 | r24
            goto L_0x00c2
        L_0x00b1:
            r19 = r14 & r24
            if (r19 != 0) goto L_0x00c2
            boolean r19 = r0.V(r7)
            if (r19 == 0) goto L_0x00be
            r19 = r23
            goto L_0x00c0
        L_0x00be:
            r19 = r22
        L_0x00c0:
            r1 = r1 | r19
        L_0x00c2:
            r19 = r12 & 64
            r25 = 1572864(0x180000, float:2.204052E-39)
            if (r19 == 0) goto L_0x00cd
            r1 = r1 | r25
            r3 = r48
            goto L_0x00e0
        L_0x00cd:
            r26 = r14 & r25
            r3 = r48
            if (r26 != 0) goto L_0x00e0
            boolean r27 = r0.b(r3)
            if (r27 == 0) goto L_0x00dc
            r27 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00de
        L_0x00dc:
            r27 = 524288(0x80000, float:7.34684E-40)
        L_0x00de:
            r1 = r1 | r27
        L_0x00e0:
            r8 = r12 & 128(0x80, float:1.794E-43)
            r28 = 12582912(0xc00000, float:1.7632415E-38)
            if (r8 == 0) goto L_0x00eb
            r1 = r1 | r28
            r9 = r49
            goto L_0x00fe
        L_0x00eb:
            r29 = r14 & r28
            r9 = r49
            if (r29 != 0) goto L_0x00fe
            boolean r30 = r0.F(r9)
            if (r30 == 0) goto L_0x00fa
            r30 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00fc
        L_0x00fa:
            r30 = 4194304(0x400000, float:5.877472E-39)
        L_0x00fc:
            r1 = r1 | r30
        L_0x00fe:
            r11 = r12 & 256(0x100, float:3.59E-43)
            r31 = 100663296(0x6000000, float:2.4074124E-35)
            if (r11 == 0) goto L_0x0109
            r1 = r1 | r31
            r2 = r50
            goto L_0x011c
        L_0x0109:
            r31 = r14 & r31
            r2 = r50
            if (r31 != 0) goto L_0x011c
            boolean r31 = r0.F(r2)
            if (r31 == 0) goto L_0x0118
            r31 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x011a
        L_0x0118:
            r31 = 33554432(0x2000000, float:9.403955E-38)
        L_0x011a:
            r1 = r1 | r31
        L_0x011c:
            r2 = r12 & 512(0x200, float:7.175E-43)
            r31 = 805306368(0x30000000, float:4.656613E-10)
            if (r2 == 0) goto L_0x0127
            r1 = r1 | r31
            r3 = r51
            goto L_0x013a
        L_0x0127:
            r31 = r14 & r31
            r3 = r51
            if (r31 != 0) goto L_0x013a
            boolean r31 = r0.F(r3)
            if (r31 == 0) goto L_0x0136
            r31 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0138
        L_0x0136:
            r31 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0138:
            r1 = r1 | r31
        L_0x013a:
            r3 = r12 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L_0x0143
            r26 = r13 | 6
            r5 = r52
            goto L_0x0159
        L_0x0143:
            r31 = r13 & 6
            r5 = r52
            if (r31 != 0) goto L_0x0157
            boolean r31 = r0.F(r5)
            if (r31 == 0) goto L_0x0152
            r26 = 4
            goto L_0x0154
        L_0x0152:
            r26 = 2
        L_0x0154:
            r26 = r13 | r26
            goto L_0x0159
        L_0x0157:
            r26 = r13
        L_0x0159:
            r5 = r12 & 2048(0x800, float:2.87E-42)
            if (r5 == 0) goto L_0x0162
            r26 = r26 | 48
        L_0x015f:
            r6 = r26
            goto L_0x0176
        L_0x0162:
            r31 = r13 & 48
            r6 = r53
            if (r31 != 0) goto L_0x015f
            boolean r31 = r0.F(r6)
            if (r31 == 0) goto L_0x0171
            r27 = 32
            goto L_0x0173
        L_0x0171:
            r27 = 16
        L_0x0173:
            r26 = r26 | r27
            goto L_0x015f
        L_0x0176:
            r9 = r12 & 4096(0x1000, float:5.74E-42)
            if (r9 == 0) goto L_0x017f
            r6 = r6 | 384(0x180, float:5.38E-43)
        L_0x017c:
            r10 = r54
            goto L_0x0192
        L_0x017f:
            r10 = r13 & 384(0x180, float:5.38E-43)
            if (r10 != 0) goto L_0x017c
            r10 = r54
            boolean r26 = r0.F(r10)
            if (r26 == 0) goto L_0x018e
            r30 = r16
            goto L_0x0190
        L_0x018e:
            r30 = 128(0x80, float:1.794E-43)
        L_0x0190:
            r6 = r6 | r30
        L_0x0192:
            r10 = r12 & 8192(0x2000, float:1.14794E-41)
            if (r10 == 0) goto L_0x019b
            r6 = r6 | 3072(0xc00, float:4.305E-42)
        L_0x0198:
            r4 = r55
            goto L_0x01ab
        L_0x019b:
            r4 = r13 & 3072(0xc00, float:4.305E-42)
            if (r4 != 0) goto L_0x0198
            r4 = r55
            boolean r16 = r0.F(r4)
            if (r16 == 0) goto L_0x01a9
            r17 = r18
        L_0x01a9:
            r6 = r6 | r17
        L_0x01ab:
            r4 = r13 & 24576(0x6000, float:3.4438E-41)
            if (r4 != 0) goto L_0x01c3
            r4 = r12 & 16384(0x4000, float:2.2959E-41)
            if (r4 != 0) goto L_0x01be
            r4 = r56
            boolean r16 = r0.V(r4)
            if (r16 == 0) goto L_0x01c0
            r20 = r21
            goto L_0x01c0
        L_0x01be:
            r4 = r56
        L_0x01c0:
            r6 = r6 | r20
            goto L_0x01c5
        L_0x01c3:
            r4 = r56
        L_0x01c5:
            r16 = r13 & r24
            if (r16 != 0) goto L_0x01e0
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r12 & r16
            r4 = r57
            if (r16 != 0) goto L_0x01db
            boolean r16 = r0.V(r4)
            if (r16 == 0) goto L_0x01db
            r16 = r23
            goto L_0x01dd
        L_0x01db:
            r16 = r22
        L_0x01dd:
            r6 = r6 | r16
            goto L_0x01e2
        L_0x01e0:
            r4 = r57
        L_0x01e2:
            r16 = r12 & r22
            if (r16 == 0) goto L_0x01eb
            r6 = r6 | r25
            r4 = r58
            goto L_0x01fe
        L_0x01eb:
            r17 = r13 & r25
            r4 = r58
            if (r17 != 0) goto L_0x01fe
            boolean r17 = r0.F(r4)
            if (r17 == 0) goto L_0x01fa
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x01fc
        L_0x01fa:
            r17 = 524288(0x80000, float:7.34684E-40)
        L_0x01fc:
            r6 = r6 | r17
        L_0x01fe:
            r17 = r12 & r23
            if (r17 == 0) goto L_0x0205
            r6 = r6 | r28
            goto L_0x0216
        L_0x0205:
            r17 = r13 & r28
            if (r17 != 0) goto L_0x0216
            boolean r17 = r0.V(r15)
            if (r17 == 0) goto L_0x0212
            r17 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0214
        L_0x0212:
            r17 = 4194304(0x400000, float:5.877472E-39)
        L_0x0214:
            r6 = r6 | r17
        L_0x0216:
            r17 = 306783379(0x12492493, float:6.34695E-28)
            r4 = r1 & r17
            r13 = 306783378(0x12492492, float:6.3469493E-28)
            if (r4 != r13) goto L_0x024b
            r4 = 4793491(0x492493, float:6.717112E-39)
            r4 = r4 & r6
            r13 = 4793490(0x492492, float:6.71711E-39)
            if (r4 != r13) goto L_0x024b
            boolean r4 = r0.l()
            if (r4 != 0) goto L_0x0230
            goto L_0x024b
        L_0x0230:
            r0.L()
            r8 = r48
            r9 = r49
            r10 = r50
            r11 = r51
            r12 = r52
            r13 = r53
            r14 = r54
            r15 = r55
            r16 = r56
            r17 = r57
            r18 = r58
            goto L_0x03de
        L_0x024b:
            r0.G()
            r4 = r14 & 1
            if (r4 == 0) goto L_0x0287
            boolean r4 = r0.O()
            if (r4 == 0) goto L_0x0259
            goto L_0x0287
        L_0x0259:
            r0.L()
            r2 = r12 & 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L_0x0264
            r2 = -57345(0xffffffffffff1fff, float:NaN)
            r6 = r6 & r2
        L_0x0264:
            r2 = 32768(0x8000, float:4.5918E-41)
            r2 = r2 & r12
            if (r2 == 0) goto L_0x026e
            r2 = -458753(0xfffffffffff8ffff, float:NaN)
            r6 = r6 & r2
        L_0x026e:
            r2 = r48
            r8 = r49
            r11 = r50
            r3 = r51
            r4 = r52
            r5 = r53
            r9 = r54
            r13 = r55
            r10 = r56
            r38 = r58
            r7 = r6
            r6 = r57
            goto L_0x032e
        L_0x0287:
            if (r19 == 0) goto L_0x028b
            r4 = 0
            goto L_0x028d
        L_0x028b:
            r4 = r48
        L_0x028d:
            r13 = 0
            if (r8 == 0) goto L_0x0292
            r8 = r13
            goto L_0x0294
        L_0x0292:
            r8 = r49
        L_0x0294:
            if (r11 == 0) goto L_0x0298
            r11 = r13
            goto L_0x029a
        L_0x0298:
            r11 = r50
        L_0x029a:
            if (r2 == 0) goto L_0x029e
            r2 = r13
            goto L_0x02a0
        L_0x029e:
            r2 = r51
        L_0x02a0:
            if (r3 == 0) goto L_0x02a4
            r3 = r13
            goto L_0x02a6
        L_0x02a4:
            r3 = r52
        L_0x02a6:
            if (r5 == 0) goto L_0x02aa
            r5 = r13
            goto L_0x02ac
        L_0x02aa:
            r5 = r53
        L_0x02ac:
            if (r9 == 0) goto L_0x02b0
            r9 = r13
            goto L_0x02b2
        L_0x02b0:
            r9 = r54
        L_0x02b2:
            if (r10 == 0) goto L_0x02b5
            goto L_0x02b7
        L_0x02b5:
            r13 = r55
        L_0x02b7:
            r10 = r12 & 16384(0x4000, float:2.2959E-41)
            if (r10 == 0) goto L_0x02c9
            int r10 = r6 >> 21
            r10 = r10 & 14
            O0.Z0 r10 = r15.c(r0, r10)
            r17 = -57345(0xffffffffffff1fff, float:NaN)
            r6 = r6 & r17
            goto L_0x02cb
        L_0x02c9:
            r10 = r56
        L_0x02cb:
            r17 = 32768(0x8000, float:4.5918E-41)
            r17 = r12 & r17
            if (r17 == 0) goto L_0x02f6
            r17 = 15
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r48 = r41
            r49 = r19
            r50 = r20
            r51 = r21
            r52 = r22
            r53 = r17
            r54 = r18
            s0.E r17 = f(r48, r49, r50, r51, r52, r53, r54)
            r18 = -458753(0xfffffffffff8ffff, float:NaN)
            r6 = r6 & r18
            goto L_0x02f8
        L_0x02f6:
            r17 = r57
        L_0x02f8:
            r48 = r2
            if (r16 == 0) goto L_0x0321
            O0.l0$c r2 = new O0.l0$c
            r49 = r5
            r5 = r44
            r2.<init>(r5, r4, r7, r10)
            r50 = r3
            r3 = 54
            r16 = r4
            r4 = -1448570018(0xffffffffa9a8935e, float:-7.486263E-14)
            r5 = 1
            c1.a r2 = c1.c.e(r4, r5, r2, r0, r3)
            r3 = r48
            r5 = r49
            r4 = r50
            r38 = r2
        L_0x031b:
            r7 = r6
            r2 = r16
            r6 = r17
            goto L_0x032e
        L_0x0321:
            r50 = r3
            r16 = r4
            r49 = r5
            r3 = r48
            r4 = r50
            r38 = r58
            goto L_0x031b
        L_0x032e:
            r0.y()
            boolean r16 = U0.C4895p.J()
            if (r16 == 0) goto L_0x033f
            r12 = -350442135(0xffffffffeb1cad69, float:-1.8941133E26)
            java.lang.String r14 = "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:884)"
            U0.C4895p.S(r12, r1, r7, r14)
        L_0x033f:
            Q0.C r16 = Q0.C.Outlined
            int r12 = r1 << 3
            r14 = r12 & 112(0x70, float:1.57E-43)
            r14 = r14 | 6
            r12 = r12 & 896(0x380, float:1.256E-42)
            r12 = r12 | r14
            int r14 = r1 >> 3
            r15 = r14 & 7168(0x1c00, float:1.0045E-41)
            r12 = r12 | r15
            int r15 = r1 >> 9
            r17 = 57344(0xe000, float:8.0356E-41)
            r17 = r15 & r17
            r12 = r12 | r17
            r17 = 458752(0x70000, float:6.42848E-40)
            r17 = r15 & r17
            r12 = r12 | r17
            r17 = 3670016(0x380000, float:5.142788E-39)
            r17 = r15 & r17
            r12 = r12 | r17
            int r17 = r7 << 21
            r18 = 29360128(0x1c00000, float:7.052966E-38)
            r18 = r17 & r18
            r12 = r12 | r18
            r18 = 234881024(0xe000000, float:1.5777218E-30)
            r18 = r17 & r18
            r12 = r12 | r18
            r18 = 1879048192(0x70000000, float:1.58456325E29)
            r17 = r17 & r18
            r35 = r12 | r17
            int r12 = r7 >> 9
            r12 = r12 & 14
            int r17 = r1 >> 6
            r17 = r17 & 112(0x70, float:1.57E-43)
            r12 = r12 | r17
            r1 = r1 & 896(0x380, float:1.256E-42)
            r1 = r1 | r12
            r12 = r15 & 7168(0x1c00, float:1.0045E-41)
            r1 = r1 | r12
            r12 = 57344(0xe000, float:8.0356E-41)
            r12 = r12 & r14
            r1 = r1 | r12
            r12 = 458752(0x70000, float:6.42848E-40)
            r12 = r12 & r7
            r1 = r1 | r12
            int r12 = r7 << 6
            r14 = 3670016(0x380000, float:5.142788E-39)
            r12 = r12 & r14
            r1 = r1 | r12
            int r7 = r7 << 3
            r12 = 29360128(0x1c00000, float:7.052966E-38)
            r7 = r7 & r12
            r36 = r1 | r7
            r37 = 0
            r17 = r42
            r18 = r43
            r19 = r46
            r20 = r8
            r21 = r11
            r22 = r3
            r23 = r4
            r24 = r5
            r25 = r9
            r26 = r13
            r27 = r45
            r28 = r44
            r29 = r2
            r30 = r47
            r31 = r6
            r32 = r10
            r33 = r38
            r34 = r0
            Q0.w.a(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x03d0
            U0.C4895p.R()
        L_0x03d0:
            r12 = r4
            r17 = r6
            r14 = r9
            r16 = r10
            r10 = r11
            r15 = r13
            r18 = r38
            r11 = r3
            r13 = r5
            r9 = r8
            r8 = r2
        L_0x03de:
            U0.Y0 r7 = r0.n()
            if (r7 == 0) goto L_0x0409
            O0.l0$d r6 = new O0.l0$d
            r0 = r6
            r1 = r41
            r2 = r42
            r3 = r43
            r4 = r44
            r5 = r45
            r39 = r6
            r6 = r46
            r40 = r7
            r7 = r47
            r19 = r60
            r20 = r61
            r21 = r62
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r1 = r39
            r0 = r40
            r0.a(r1)
        L_0x0409:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: O0.C4739l0.b(java.lang.String, nI.p, boolean, boolean, T1.b0, r0.k, boolean, nI.p, nI.p, nI.p, nI.p, nI.p, nI.p, nI.p, O0.Z0, s0.E, nI.p, U0.m, int, int, int):void");
    }

    public final Z0 c(C4889m mVar, int i10) {
        if (C4895p.J()) {
            C4895p.S(-471651810, i10, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.colors (TextFieldDefaults.kt:921)");
        }
        Z0 g10 = g(X.f10101a.a(mVar, 6), mVar, (i10 << 3) & 112);
        if (C4895p.J()) {
            C4895p.R();
        }
        return g10;
    }

    public final Z0 d(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, V v10, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46, long j47, long j48, long j49, long j50, long j51, C4889m mVar, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        long j52;
        long j53;
        C4889m mVar2 = mVar;
        int i17 = i15;
        int i18 = i16;
        long i19 = (i17 & 1) != 0 ? C5747v0.f27350b.i() : j10;
        long i20 = (i17 & 2) != 0 ? C5747v0.f27350b.i() : j11;
        long i21 = (i17 & 4) != 0 ? C5747v0.f27350b.i() : j12;
        long i22 = (i17 & 8) != 0 ? C5747v0.f27350b.i() : j13;
        long i23 = (i17 & 16) != 0 ? C5747v0.f27350b.i() : j14;
        long i24 = (i17 & 32) != 0 ? C5747v0.f27350b.i() : j15;
        long i25 = (i17 & 64) != 0 ? C5747v0.f27350b.i() : j16;
        long i26 = (i17 & 128) != 0 ? C5747v0.f27350b.i() : j17;
        long i27 = (i17 & 256) != 0 ? C5747v0.f27350b.i() : j18;
        long i28 = (i17 & 512) != 0 ? C5747v0.f27350b.i() : j19;
        V v11 = (i17 & 1024) != 0 ? null : v10;
        long i29 = (i17 & RecyclerView.n.FLAG_MOVED) != 0 ? C5747v0.f27350b.i() : j20;
        long i30 = (i17 & RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? C5747v0.f27350b.i() : j21;
        long i31 = (i17 & 8192) != 0 ? C5747v0.f27350b.i() : j22;
        long i32 = (i17 & 16384) != 0 ? C5747v0.f27350b.i() : j23;
        long i33 = (32768 & i17) != 0 ? C5747v0.f27350b.i() : j24;
        long i34 = (65536 & i17) != 0 ? C5747v0.f27350b.i() : j25;
        long i35 = (131072 & i17) != 0 ? C5747v0.f27350b.i() : j26;
        long i36 = (262144 & i17) != 0 ? C5747v0.f27350b.i() : j27;
        long i37 = (524288 & i17) != 0 ? C5747v0.f27350b.i() : j28;
        long i38 = (1048576 & i17) != 0 ? C5747v0.f27350b.i() : j29;
        long i39 = (2097152 & i17) != 0 ? C5747v0.f27350b.i() : j30;
        long i40 = (4194304 & i17) != 0 ? C5747v0.f27350b.i() : j31;
        long i41 = (8388608 & i17) != 0 ? C5747v0.f27350b.i() : j32;
        long i42 = (16777216 & i17) != 0 ? C5747v0.f27350b.i() : j33;
        long i43 = (33554432 & i17) != 0 ? C5747v0.f27350b.i() : j34;
        long i44 = (67108864 & i17) != 0 ? C5747v0.f27350b.i() : j35;
        long i45 = (134217728 & i17) != 0 ? C5747v0.f27350b.i() : j36;
        long i46 = (268435456 & i17) != 0 ? C5747v0.f27350b.i() : j37;
        long i47 = (536870912 & i17) != 0 ? C5747v0.f27350b.i() : j38;
        long i48 = (i17 & CatalogRepository.FETCH_FLAG_SDB) != 0 ? C5747v0.f27350b.i() : j39;
        long i49 = (i18 & 1) != 0 ? C5747v0.f27350b.i() : j40;
        long i50 = (i18 & 2) != 0 ? C5747v0.f27350b.i() : j41;
        long i51 = (i18 & 4) != 0 ? C5747v0.f27350b.i() : j42;
        long i52 = (i18 & 8) != 0 ? C5747v0.f27350b.i() : j43;
        long i53 = (i18 & 16) != 0 ? C5747v0.f27350b.i() : j44;
        long i54 = (i18 & 32) != 0 ? C5747v0.f27350b.i() : j45;
        long i55 = (i18 & 64) != 0 ? C5747v0.f27350b.i() : j46;
        long i56 = (i18 & 128) != 0 ? C5747v0.f27350b.i() : j47;
        long i57 = (i18 & 256) != 0 ? C5747v0.f27350b.i() : j48;
        long i58 = (i18 & 512) != 0 ? C5747v0.f27350b.i() : j49;
        long i59 = (i18 & 1024) != 0 ? C5747v0.f27350b.i() : j50;
        long i60 = (i18 & RecyclerView.n.FLAG_MOVED) != 0 ? C5747v0.f27350b.i() : j51;
        if (C4895p.J()) {
            j52 = i60;
            j53 = i24;
            C4895p.S(1767617725, i10, i11, "androidx.compose.material3.OutlinedTextFieldDefaults.colors (TextFieldDefaults.kt:1023)");
        } else {
            j52 = i60;
            j53 = i24;
        }
        Z0 b10 = g(X.f10101a.a(mVar2, 6), mVar2, (i14 >> 6) & 112).b(i19, i20, i21, i22, i23, j53, i25, i26, i27, i28, v11, i29, i30, i31, i32, i33, i34, i35, i36, i37, i38, i39, i40, i41, i42, i43, i44, i45, i46, i47, i48, i49, i50, i51, i52, i53, i54, i55, i56, i57, i58, i59, j52);
        if (C4895p.J()) {
            C4895p.R();
        }
        return b10;
    }

    public final C5834E e(float f10, float f11, float f12, float f13) {
        return D.d(f10, f11, f12, f13);
    }

    public final Z0 g(C4753t tVar, C4889m mVar, int i10) {
        C4753t tVar2 = tVar;
        C4889m mVar2 = mVar;
        if (C4895p.J()) {
            C4895p.S(-292363577, i10, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.<get-defaultOutlinedTextFieldColors> (TextFieldDefaults.kt:1071)");
        }
        Z0 h10 = tVar.h();
        mVar2.W(1540400102);
        if (h10 == null) {
            q qVar = q.f13093a;
            long f10 = C4755u.f(tVar2, qVar.p());
            long f11 = C4755u.f(tVar2, qVar.v());
            long o10 = C5747v0.o(C4755u.f(tVar2, qVar.c()), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
            long f12 = C4755u.f(tVar2, qVar.j());
            C5747v0.a aVar = C5747v0.f27350b;
            Z0 z02 = r4;
            Z0 z03 = new Z0(f10, f11, o10, f12, aVar.h(), aVar.h(), aVar.h(), aVar.h(), C4755u.f(tVar2, qVar.a()), C4755u.f(tVar2, qVar.i()), (V) mVar2.Q(W.b()), C4755u.f(tVar2, qVar.s()), C4755u.f(tVar2, qVar.B()), C5747v0.o(C4755u.f(tVar2, qVar.f()), 0.12f, 0.0f, 0.0f, 0.0f, 14, (Object) null), C4755u.f(tVar2, qVar.m()), C4755u.f(tVar2, qVar.r()), C4755u.f(tVar2, qVar.A()), C5747v0.o(C4755u.f(tVar2, qVar.e()), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null), C4755u.f(tVar2, qVar.l()), C4755u.f(tVar2, qVar.u()), C4755u.f(tVar2, qVar.D()), C5747v0.o(C4755u.f(tVar2, qVar.h()), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null), C4755u.f(tVar2, qVar.o()), C4755u.f(tVar2, qVar.q()), C4755u.f(tVar2, qVar.z()), C5747v0.o(C4755u.f(tVar2, qVar.d()), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null), C4755u.f(tVar2, qVar.k()), C4755u.f(tVar2, qVar.w()), C4755u.f(tVar2, qVar.w()), C5747v0.o(C4755u.f(tVar2, qVar.c()), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null), C4755u.f(tVar2, qVar.w()), C4755u.f(tVar2, qVar.t()), C4755u.f(tVar2, qVar.C()), C5747v0.o(C4755u.f(tVar2, qVar.g()), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null), C4755u.f(tVar2, qVar.n()), C4755u.f(tVar2, qVar.x()), C4755u.f(tVar2, qVar.x()), C5747v0.o(C4755u.f(tVar2, qVar.x()), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null), C4755u.f(tVar2, qVar.x()), C4755u.f(tVar2, qVar.y()), C4755u.f(tVar2, qVar.y()), C5747v0.o(C4755u.f(tVar2, qVar.y()), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null), C4755u.f(tVar2, qVar.y()), (DefaultConstructorMarker) null);
            h10 = z02;
            tVar2.Y(h10);
        }
        mVar.P();
        if (C4895p.J()) {
            C4895p.R();
        }
        return h10;
    }

    public final float h() {
        return f11148e;
    }

    public final float i() {
        return f11145b;
    }

    public final float j() {
        return f11146c;
    }

    public final i1 k(C4889m mVar, int i10) {
        if (C4895p.J()) {
            C4895p.S(-1066756961, i10, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.<get-shape> (TextFieldDefaults.kt:729)");
        }
        i1 d10 = D0.d(q.f13093a.b(), mVar, 6);
        if (C4895p.J()) {
            C4895p.R();
        }
        return d10;
    }

    public final float l() {
        return f11147d;
    }
}
