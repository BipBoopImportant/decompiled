package B0;

import E1.H;
import E1.a0;
import H0.J;
import H0.M;
import N1.A;
import N1.C4669d;
import N1.P;
import N1.Y;
import S1.C4820m;
import U0.C4889m;
import U0.C4899r0;
import U0.M0;
import XH.C16807N;
import XH.v;
import androidx.compose.foundation.text.modifiers.SelectableTextAnnotatedStringElement;
import androidx.compose.foundation.text.modifiers.TextAnnotatedStringElement;
import androidx.compose.foundation.text.modifiers.b;
import androidx.compose.ui.d;
import c2.C5267b;
import f1.C5309k;
import f1.C5310l;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import o1.C5669i;
import p1.C5753y0;

@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001az\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0001\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00152\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00170\u00162\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a%\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001e0\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001f\u0010 \u001aG\u0010)\u001a\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020'\u0012\f\u0012\n\u0012\u0004\u0012\u00020(\u0018\u00010$0&\u0018\u00010!2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\f0$H\u0002¢\u0006\u0004\b)\u0010*\u001aÂ\u0001\u00106\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020+2\u0014\u0010/\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0-\u0018\u00010!2\u001c\u00101\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u0001000!\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\b\u00103\u001a\u0004\u0018\u0001022\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0014\u00105\u001a\u0010\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b6\u00107\u001a°\u0001\u00109\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00152\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\u0006\u00108\u001a\u00020\f2\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020+2\b\u00103\u001a\u0004\u0018\u0001022\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0014\u00105\u001a\u0010\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006H\u0003ø\u0001\u0000¢\u0006\u0004\b9\u0010:\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006<²\u0006\u000e\u0010;\u001a\u00020\u00158\n@\nX\u0002"}, d2 = {"", "text", "Landroidx/compose/ui/d;", "modifier", "LN1/Y;", "style", "Lkotlin/Function1;", "LN1/P;", "LXH/N;", "onTextLayout", "LY1/t;", "overflow", "", "softWrap", "", "maxLines", "minLines", "Lp1/y0;", "color", "b", "(Ljava/lang/String;Landroidx/compose/ui/d;LN1/Y;LnI/l;IZIILp1/y0;LU0/m;II)V", "LN1/d;", "", "LB0/q;", "inlineContent", "a", "(LN1/d;Landroidx/compose/ui/d;LN1/Y;LnI/l;IZIILjava/util/Map;Lp1/y0;LU0/m;II)V", "LH0/J;", "selectionRegistrar", "Lf1/k;", "", "j", "(LH0/J;)Lf1/k;", "", "LE1/H;", "measurables", "Lkotlin/Function0;", "shouldMeasureLinks", "LXH/v;", "LE1/a0;", "Lc2/n;", "i", "(Ljava/util/List;LnI/a;)Ljava/util/List;", "LS1/m$b;", "fontFamilyResolver", "LN1/d$c;", "LN1/A;", "placeholders", "Lo1/i;", "onPlaceholderLayout", "LG0/g;", "selectionController", "Landroidx/compose/foundation/text/modifiers/b$a;", "onShowTranslation", "k", "(Landroidx/compose/ui/d;LN1/d;LN1/Y;LnI/l;IZIILS1/m$b;Ljava/util/List;LnI/l;LG0/g;Lp1/y0;LnI/l;)Landroidx/compose/ui/d;", "hasInlineContent", "e", "(Landroidx/compose/ui/d;LN1/d;LnI/l;ZLjava/util/Map;LN1/Y;IZIILS1/m$b;LG0/g;Lp1/y0;LnI/l;LU0/m;III)V", "displayedText", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: B0.d  reason: case insensitive filesystem */
public final class C4360d {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: B0.d$a */
    static final class a extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f4772c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ d f4773d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Y f4774e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C17642l<P, C16807N> f4775f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f4776g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ boolean f4777h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ int f4778i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ int f4779j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ C5753y0 f4780k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ int f4781l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ int f4782m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(String str, d dVar, Y y10, C17642l<? super P, C16807N> lVar, int i10, boolean z10, int i11, int i12, C5753y0 y0Var, int i13, int i14) {
            super(2);
            this.f4772c = str;
            this.f4773d = dVar;
            this.f4774e = y10;
            this.f4775f = lVar;
            this.f4776g = i10;
            this.f4777h = z10;
            this.f4778i = i11;
            this.f4779j = i12;
            this.f4780k = y0Var;
            this.f4781l = i13;
            this.f4782m = i14;
        }

        public final void a(C4889m mVar, int i10) {
            C4360d.b(this.f4772c, this.f4773d, this.f4774e, this.f4775f, this.f4776g, this.f4777h, this.f4778i, this.f4779j, this.f4780k, mVar, M0.a(this.f4781l | 1), this.f4782m);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/foundation/text/modifiers/b$a;", "substitutionValue", "LXH/N;", "a", "(Landroidx/compose/foundation/text/modifiers/b$a;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: B0.d$b */
    static final class b extends C17544u implements C17642l<b.a, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C4899r0<C4669d> f4783c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C4899r0<C4669d> r0Var) {
            super(1);
            this.f4783c = r0Var;
        }

        public final void a(b.a aVar) {
            C4360d.d(this.f4783c, aVar.d() ? aVar.c() : aVar.b());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((b.a) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: B0.d$c */
    static final class c extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C4669d f4784c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ d f4785d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Y f4786e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C17642l<P, C16807N> f4787f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f4788g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ boolean f4789h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ int f4790i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ int f4791j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ Map<String, C4373q> f4792k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ C5753y0 f4793l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ int f4794m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ int f4795n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C4669d dVar, d dVar2, Y y10, C17642l<? super P, C16807N> lVar, int i10, boolean z10, int i11, int i12, Map<String, C4373q> map, C5753y0 y0Var, int i13, int i14) {
            super(2);
            this.f4784c = dVar;
            this.f4785d = dVar2;
            this.f4786e = y10;
            this.f4787f = lVar;
            this.f4788g = i10;
            this.f4789h = z10;
            this.f4790i = i11;
            this.f4791j = i12;
            this.f4792k = map;
            this.f4793l = y0Var;
            this.f4794m = i13;
            this.f4795n = i14;
        }

        public final void a(C4889m mVar, int i10) {
            C4360d.a(this.f4784c, this.f4785d, this.f4786e, this.f4787f, this.f4788g, this.f4789h, this.f4790i, this.f4791j, this.f4792k, this.f4793l, mVar, M0.a(this.f4794m | 1), this.f4795n);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Long;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: B0.d$d  reason: collision with other inner class name */
    static final class C0023d extends C17544u implements C17631a<Long> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ J f4796c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0023d(J j10) {
            super(0);
            this.f4796c = j10;
        }

        /* renamed from: b */
        public final Long invoke() {
            return Long.valueOf(this.f4796c.a());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Long;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: B0.d$e */
    static final class e extends C17544u implements C17631a<Long> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ J f4797c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(J j10) {
            super(0);
            this.f4797c = j10;
        }

        /* renamed from: b */
        public final Long invoke() {
            return Long.valueOf(this.f4797c.a());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LN1/P;", "it", "LXH/N;", "a", "(LN1/P;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: B0.d$f */
    static final class f extends C17544u implements C17642l<P, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ g0 f4798c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17642l<P, C16807N> f4799d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(g0 g0Var, C17642l<? super P, C16807N> lVar) {
            super(1);
            this.f4798c = g0Var;
            this.f4799d = lVar;
        }

        public final void a(P p10) {
            g0 g0Var = this.f4798c;
            if (g0Var != null) {
                g0Var.r(p10);
            }
            C17642l<P, C16807N> lVar = this.f4799d;
            if (lVar != null) {
                lVar.invoke(p10);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((P) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: B0.d$g */
    static final class g extends C17544u implements C17631a<Boolean> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ g0 f4800c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(g0 g0Var) {
            super(0);
            this.f4800c = g0Var;
        }

        public final Boolean invoke() {
            g0 g0Var = this.f4800c;
            return Boolean.valueOf(g0Var != null ? g0Var.l().invoke().booleanValue() : false);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: B0.d$h */
    static final class h extends C17544u implements C17631a<Boolean> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ g0 f4801c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(g0 g0Var) {
            super(0);
            this.f4801c = g0Var;
        }

        public final Boolean invoke() {
            g0 g0Var = this.f4801c;
            return Boolean.valueOf(g0Var != null ? g0Var.l().invoke().booleanValue() : false);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Lo1/i;", "b", "()Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: B0.d$i */
    static final class i extends C17544u implements C17631a<List<? extends C5669i>> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C4899r0<List<C5669i>> f4802c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(C4899r0<List<C5669i>> r0Var) {
            super(0);
            this.f4802c = r0Var;
        }

        /* renamed from: b */
        public final List<C5669i> invoke() {
            C4899r0<List<C5669i>> r0Var = this.f4802c;
            if (r0Var != null) {
                return r0Var.getValue();
            }
            return null;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: B0.d$j */
    static final class j extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ d f4803c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C4669d f4804d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17642l<P, C16807N> f4805e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f4806f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ Map<String, C4373q> f4807g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Y f4808h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ int f4809i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ boolean f4810j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ int f4811k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ int f4812l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ C4820m.b f4813m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ G0.g f4814n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ C5753y0 f4815o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ C17642l<b.a, C16807N> f4816p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ int f4817q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ int f4818r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ int f4819s;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(d dVar, C4669d dVar2, C17642l<? super P, C16807N> lVar, boolean z10, Map<String, C4373q> map, Y y10, int i10, boolean z11, int i11, int i12, C4820m.b bVar, G0.g gVar, C5753y0 y0Var, C17642l<? super b.a, C16807N> lVar2, int i13, int i14, int i15) {
            super(2);
            this.f4803c = dVar;
            this.f4804d = dVar2;
            this.f4805e = lVar;
            this.f4806f = z10;
            this.f4807g = map;
            this.f4808h = y10;
            this.f4809i = i10;
            this.f4810j = z11;
            this.f4811k = i11;
            this.f4812l = i12;
            this.f4813m = bVar;
            this.f4814n = gVar;
            this.f4815o = y0Var;
            this.f4816p = lVar2;
            this.f4817q = i13;
            this.f4818r = i14;
            this.f4819s = i15;
        }

        public final void a(C4889m mVar, int i10) {
            C4889m mVar2 = mVar;
            d dVar = this.f4803c;
            d dVar2 = dVar;
            C4360d.e(dVar2, this.f4804d, this.f4805e, this.f4806f, this.f4807g, this.f4808h, this.f4809i, this.f4810j, this.f4811k, this.f4812l, this.f4813m, this.f4814n, this.f4815o, this.f4816p, mVar2, M0.a(this.f4817q | 1), M0.a(this.f4818r), this.f4819s);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lo1/i;", "it", "LXH/N;", "a", "(Ljava/util/List;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: B0.d$k */
    static final class k extends C17544u implements C17642l<List<? extends C5669i>, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C4899r0<List<C5669i>> f4820c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(C4899r0<List<C5669i>> r0Var) {
            super(1);
            this.f4820c = r0Var;
        }

        public final void a(List<C5669i> list) {
            C4899r0<List<C5669i>> r0Var = this.f4820c;
            if (r0Var != null) {
                r0Var.setValue(list);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((List) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LN1/d;", "b", "()LN1/d;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: B0.d$l */
    static final class l extends C17544u implements C17631a<C4669d> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ g0 f4821c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C4669d f4822d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(g0 g0Var, C4669d dVar) {
            super(0);
            this.f4821c = g0Var;
            this.f4822d = dVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
            r0 = r0.i();
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final N1.C4669d invoke() {
            /*
                r1 = this;
                B0.g0 r0 = r1.f4821c
                if (r0 == 0) goto L_0x000a
                N1.d r0 = r0.i()
                if (r0 != 0) goto L_0x000c
            L_0x000a:
                N1.d r0 = r1.f4822d
            L_0x000c:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: B0.C4360d.l.invoke():N1.d");
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LN1/d;", "b", "()LN1/d;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: B0.d$m */
    static final class m extends C17544u implements C17631a<C4669d> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C4669d f4823c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(C4669d dVar) {
            super(0);
            this.f4823c = dVar;
        }

        /* renamed from: b */
        public final C4669d invoke() {
            return this.f4823c;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lf1/m;", "", "it", "a", "(Lf1/m;J)Ljava/lang/Long;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: B0.d$n */
    static final class n extends C17544u implements p<f1.m, Long, Long> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ J f4824c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(J j10) {
            super(2);
            this.f4824c = j10;
        }

        public final Long a(f1.m mVar, long j10) {
            if (M.b(this.f4824c, j10)) {
                return Long.valueOf(j10);
            }
            return null;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((f1.m) obj, ((Number) obj2).longValue());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "a", "(J)Ljava/lang/Long;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: B0.d$o */
    static final class o extends C17544u implements C17642l<Long, Long> {

        /* renamed from: c  reason: collision with root package name */
        public static final o f4825c = new o();

        o() {
            super(1);
        }

        public final Long a(long j10) {
            return Long.valueOf(j10);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).longValue());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v0, resolved type: nI.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v11, resolved type: G0.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r43v3, resolved type: androidx.compose.ui.d$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v19, resolved type: G0.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r53v3, resolved type: G0.g} */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0232, code lost:
        if (r9 == U0.C4889m.f14007a.a()) goto L_0x0234;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x040b  */
    /* JADX WARNING: Removed duplicated region for block: B:194:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0116  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(N1.C4669d r52, androidx.compose.ui.d r53, N1.Y r54, nI.C17642l<? super N1.P, XH.C16807N> r55, int r56, boolean r57, int r58, int r59, java.util.Map<java.lang.String, B0.C4373q> r60, p1.C5753y0 r61, U0.C4889m r62, int r63, int r64) {
        /*
            r14 = r52
            r15 = r63
            r13 = r64
            r0 = -1064305212(0xffffffffc08ffdc4, float:-4.4997272)
            r1 = r62
            U0.m r12 = r1.k(r0)
            r1 = r13 & 1
            if (r1 == 0) goto L_0x0016
            r1 = r15 | 6
            goto L_0x0026
        L_0x0016:
            r1 = r15 & 6
            if (r1 != 0) goto L_0x0025
            boolean r1 = r12.V(r14)
            if (r1 == 0) goto L_0x0022
            r1 = 4
            goto L_0x0023
        L_0x0022:
            r1 = 2
        L_0x0023:
            r1 = r1 | r15
            goto L_0x0026
        L_0x0025:
            r1 = r15
        L_0x0026:
            r4 = r13 & 2
            if (r4 == 0) goto L_0x002f
            r1 = r1 | 48
        L_0x002c:
            r5 = r53
            goto L_0x0041
        L_0x002f:
            r5 = r15 & 48
            if (r5 != 0) goto L_0x002c
            r5 = r53
            boolean r6 = r12.V(r5)
            if (r6 == 0) goto L_0x003e
            r6 = 32
            goto L_0x0040
        L_0x003e:
            r6 = 16
        L_0x0040:
            r1 = r1 | r6
        L_0x0041:
            r6 = r13 & 4
            if (r6 == 0) goto L_0x004a
            r1 = r1 | 384(0x180, float:5.38E-43)
        L_0x0047:
            r7 = r54
            goto L_0x005c
        L_0x004a:
            r7 = r15 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x0047
            r7 = r54
            boolean r8 = r12.V(r7)
            if (r8 == 0) goto L_0x0059
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x005b
        L_0x0059:
            r8 = 128(0x80, float:1.794E-43)
        L_0x005b:
            r1 = r1 | r8
        L_0x005c:
            r8 = r13 & 8
            if (r8 == 0) goto L_0x0065
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L_0x0062:
            r9 = r55
            goto L_0x0077
        L_0x0065:
            r9 = r15 & 3072(0xc00, float:4.305E-42)
            if (r9 != 0) goto L_0x0062
            r9 = r55
            boolean r10 = r12.F(r9)
            if (r10 == 0) goto L_0x0074
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x0076
        L_0x0074:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x0076:
            r1 = r1 | r10
        L_0x0077:
            r10 = r13 & 16
            if (r10 == 0) goto L_0x0080
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
        L_0x007d:
            r11 = r56
            goto L_0x0093
        L_0x0080:
            r11 = r15 & 24576(0x6000, float:3.4438E-41)
            if (r11 != 0) goto L_0x007d
            r11 = r56
            boolean r16 = r12.d(r11)
            if (r16 == 0) goto L_0x008f
            r16 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0091
        L_0x008f:
            r16 = 8192(0x2000, float:1.14794E-41)
        L_0x0091:
            r1 = r1 | r16
        L_0x0093:
            r16 = r13 & 32
            r17 = 196608(0x30000, float:2.75506E-40)
            if (r16 == 0) goto L_0x009e
            r1 = r1 | r17
            r2 = r57
            goto L_0x00b1
        L_0x009e:
            r17 = r15 & r17
            r2 = r57
            if (r17 != 0) goto L_0x00b1
            boolean r17 = r12.b(r2)
            if (r17 == 0) goto L_0x00ad
            r17 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00af
        L_0x00ad:
            r17 = 65536(0x10000, float:9.18355E-41)
        L_0x00af:
            r1 = r1 | r17
        L_0x00b1:
            r17 = r13 & 64
            r18 = 1572864(0x180000, float:2.204052E-39)
            if (r17 == 0) goto L_0x00bc
            r1 = r1 | r18
            r3 = r58
            goto L_0x00cf
        L_0x00bc:
            r18 = r15 & r18
            r3 = r58
            if (r18 != 0) goto L_0x00cf
            boolean r19 = r12.d(r3)
            if (r19 == 0) goto L_0x00cb
            r19 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00cd
        L_0x00cb:
            r19 = 524288(0x80000, float:7.34684E-40)
        L_0x00cd:
            r1 = r1 | r19
        L_0x00cf:
            r0 = r13 & 128(0x80, float:1.794E-43)
            r20 = 12582912(0xc00000, float:1.7632415E-38)
            if (r0 == 0) goto L_0x00da
            r1 = r1 | r20
            r2 = r59
            goto L_0x00ed
        L_0x00da:
            r20 = r15 & r20
            r2 = r59
            if (r20 != 0) goto L_0x00ed
            boolean r20 = r12.d(r2)
            if (r20 == 0) goto L_0x00e9
            r20 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00eb
        L_0x00e9:
            r20 = 4194304(0x400000, float:5.877472E-39)
        L_0x00eb:
            r1 = r1 | r20
        L_0x00ed:
            r2 = r13 & 256(0x100, float:3.59E-43)
            r20 = 100663296(0x6000000, float:2.4074124E-35)
            if (r2 == 0) goto L_0x00f8
            r1 = r1 | r20
            r3 = r60
            goto L_0x010b
        L_0x00f8:
            r20 = r15 & r20
            r3 = r60
            if (r20 != 0) goto L_0x010b
            boolean r20 = r12.F(r3)
            if (r20 == 0) goto L_0x0107
            r20 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0109
        L_0x0107:
            r20 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0109:
            r1 = r1 | r20
        L_0x010b:
            r3 = r13 & 512(0x200, float:7.175E-43)
            r20 = 805306368(0x30000000, float:4.656613E-10)
            if (r3 == 0) goto L_0x0116
            r1 = r1 | r20
            r5 = r61
            goto L_0x0129
        L_0x0116:
            r20 = r15 & r20
            r5 = r61
            if (r20 != 0) goto L_0x0129
            boolean r20 = r12.F(r5)
            if (r20 == 0) goto L_0x0125
            r20 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0127
        L_0x0125:
            r20 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0127:
            r1 = r1 | r20
        L_0x0129:
            r20 = 306783379(0x12492493, float:6.34695E-28)
            r5 = r1 & r20
            r7 = 306783378(0x12492492, float:6.3469493E-28)
            if (r5 != r7) goto L_0x0150
            boolean r5 = r12.l()
            if (r5 != 0) goto L_0x013a
            goto L_0x0150
        L_0x013a:
            r12.L()
            r43 = r53
            r3 = r54
            r6 = r57
            r7 = r58
            r8 = r59
            r10 = r61
            r4 = r9
            r5 = r11
            r2 = r12
            r9 = r60
            goto L_0x0405
        L_0x0150:
            if (r4 == 0) goto L_0x0157
            androidx.compose.ui.d$a r4 = androidx.compose.ui.d.f18749a
            r43 = r4
            goto L_0x0159
        L_0x0157:
            r43 = r53
        L_0x0159:
            if (r6 == 0) goto L_0x0164
            N1.Y$a r4 = N1.Y.f9422d
            N1.Y r4 = r4.a()
            r44 = r4
            goto L_0x0166
        L_0x0164:
            r44 = r54
        L_0x0166:
            r4 = 0
            if (r8 == 0) goto L_0x016c
            r45 = r4
            goto L_0x016e
        L_0x016c:
            r45 = r9
        L_0x016e:
            if (r10 == 0) goto L_0x0179
            Y1.t$a r5 = Y1.t.f14827a
            int r5 = r5.a()
            r46 = r5
            goto L_0x017b
        L_0x0179:
            r46 = r11
        L_0x017b:
            r5 = 1
            if (r16 == 0) goto L_0x0181
            r47 = r5
            goto L_0x0183
        L_0x0181:
            r47 = r57
        L_0x0183:
            if (r17 == 0) goto L_0x018a
            r6 = 2147483647(0x7fffffff, float:NaN)
            r11 = r6
            goto L_0x018c
        L_0x018a:
            r11 = r58
        L_0x018c:
            if (r0 == 0) goto L_0x0190
            r10 = r5
            goto L_0x0192
        L_0x0190:
            r10 = r59
        L_0x0192:
            if (r2 == 0) goto L_0x019b
            java.util.Map r0 = YH.X.j()
            r48 = r0
            goto L_0x019d
        L_0x019b:
            r48 = r60
        L_0x019d:
            if (r3 == 0) goto L_0x01a2
            r49 = r4
            goto L_0x01a4
        L_0x01a2:
            r49 = r61
        L_0x01a4:
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x01b3
            r0 = -1
            java.lang.String r2 = "androidx.compose.foundation.text.BasicText (BasicText.kt:191)"
            r3 = -1064305212(0xffffffffc08ffdc4, float:-4.4997272)
            U0.C4895p.S(r3, r1, r0, r2)
        L_0x01b3:
            B0.C4371o.b(r10, r11)
            U0.I0 r0 = H0.M.a()
            java.lang.Object r0 = r12.Q(r0)
            H0.J r0 = (H0.J) r0
            if (r0 == 0) goto L_0x0258
            r2 = -1584983428(0xffffffffa187127c, float:-9.152849E-19)
            r12.W(r2)
            U0.I0 r2 = H0.W.b()
            java.lang.Object r2 = r12.Q(r2)
            H0.V r2 = (H0.V) r2
            long r2 = r2.a()
            java.lang.Object[] r6 = new java.lang.Object[]{r0}
            f1.k r7 = j(r0)
            boolean r8 = r12.F(r0)
            java.lang.Object r9 = r12.D()
            if (r8 != 0) goto L_0x01f0
            U0.m$a r8 = U0.C4889m.f14007a
            java.lang.Object r8 = r8.a()
            if (r9 != r8) goto L_0x01f8
        L_0x01f0:
            B0.d$e r9 = new B0.d$e
            r9.<init>(r0)
            r12.u(r9)
        L_0x01f8:
            r8 = r9
            nI.a r8 = (nI.C17631a) r8
            r9 = 0
            r16 = 4
            r17 = 0
            r53 = r6
            r54 = r7
            r55 = r17
            r56 = r8
            r57 = r12
            r58 = r9
            r59 = r16
            java.lang.Object r6 = f1.C5301c.e(r53, r54, r55, r56, r57, r58, r59)
            java.lang.Number r6 = (java.lang.Number) r6
            long r6 = r6.longValue()
            boolean r8 = r12.e(r6)
            boolean r9 = r12.V(r0)
            r8 = r8 | r9
            boolean r9 = r12.e(r2)
            r8 = r8 | r9
            java.lang.Object r9 = r12.D()
            if (r8 != 0) goto L_0x0234
            U0.m$a r8 = U0.C4889m.f14007a
            java.lang.Object r8 = r8.a()
            if (r9 != r8) goto L_0x0250
        L_0x0234:
            G0.g r9 = new G0.g
            r8 = 8
            r16 = 0
            r17 = 0
            r53 = r9
            r54 = r6
            r56 = r0
            r57 = r2
            r59 = r17
            r60 = r8
            r61 = r16
            r53.<init>(r54, r56, r57, r59, r60, r61)
            r12.u(r9)
        L_0x0250:
            G0.g r9 = (G0.g) r9
            r12.P()
            r50 = r9
            goto L_0x0263
        L_0x0258:
            r0 = -1584467526(0xffffffffa18ef1ba, float:-9.686279E-19)
            r12.W(r0)
            r12.P()
            r50 = r4
        L_0x0263:
            boolean r19 = B0.C4358b.b(r52)
            boolean r0 = G0.j.a(r52)
            r9 = 0
            if (r19 != 0) goto L_0x034b
            if (r0 != 0) goto L_0x034b
            r0 = -1584294453(0xffffffffa19195cb, float:-9.865232E-19)
            r12.W(r0)
            r41 = 131071(0x1ffff, float:1.8367E-40)
            r42 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r38 = 0
            r40 = 0
            r20 = r43
            androidx.compose.ui.d r0 = androidx.compose.ui.graphics.b.c(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r33, r34, r35, r36, r38, r40, r41, r42)
            U0.I0 r1 = androidx.compose.ui.platform.C5100f0.g()
            java.lang.Object r1 = r12.Q(r1)
            r8 = r1
            S1.m$b r8 = (S1.C4820m.b) r8
            r16 = 0
            r17 = 0
            r18 = 0
            r1 = r52
            r2 = r44
            r3 = r45
            r4 = r46
            r5 = r47
            r6 = r11
            r7 = r10
            r9 = r18
            r34 = r10
            r10 = r16
            r35 = r11
            r11 = r50
            r51 = r12
            r12 = r49
            r13 = r17
            androidx.compose.ui.d r0 = k(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            B0.l r1 = B0.C4368l.f5101a
            r2 = r51
            r3 = 0
            int r3 = U0.C4883j.a(r2, r3)
            androidx.compose.ui.d r0 = androidx.compose.ui.c.e(r2, r0)
            U0.y r4 = r2.s()
            G1.g$a r5 = G1.C4504g.f6515W
            nI.a r6 = r5.a()
            U0.f r7 = r2.m()
            if (r7 != 0) goto L_0x02f4
            U0.C4883j.c()
        L_0x02f4:
            r2.I()
            boolean r7 = r2.i()
            if (r7 == 0) goto L_0x0301
            r2.p(r6)
            goto L_0x0304
        L_0x0301:
            r2.t()
        L_0x0304:
            U0.m r6 = U0.F1.a(r2)
            nI.p r7 = r5.c()
            U0.F1.c(r6, r1, r7)
            nI.p r1 = r5.e()
            U0.F1.c(r6, r4, r1)
            nI.p r1 = r5.d()
            U0.F1.c(r6, r0, r1)
            nI.p r0 = r5.b()
            boolean r1 = r6.i()
            if (r1 != 0) goto L_0x0335
            java.lang.Object r1 = r6.D()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            boolean r1 = kotlin.jvm.internal.C17542s.e(r1, r4)
            if (r1 != 0) goto L_0x0343
        L_0x0335:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            r6.u(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            r6.w(r1, r0)
        L_0x0343:
            r2.x()
            r2.P()
            goto L_0x03ec
        L_0x034b:
            r3 = r9
            r34 = r10
            r35 = r11
            r2 = r12
            r0 = -1583391888(0xffffffffa19f5b70, float:-1.0798462E-18)
            r2.W(r0)
            r0 = r1 & 14
            r6 = 4
            if (r0 != r6) goto L_0x035d
            goto L_0x035e
        L_0x035d:
            r5 = r3
        L_0x035e:
            java.lang.Object r0 = r2.D()
            if (r5 != 0) goto L_0x036c
            U0.m$a r3 = U0.C4889m.f14007a
            java.lang.Object r3 = r3.a()
            if (r0 != r3) goto L_0x0374
        L_0x036c:
            r0 = 2
            U0.r0 r0 = U0.u1.e(r14, r4, r0, r4)
            r2.u(r0)
        L_0x0374:
            U0.r0 r0 = (U0.C4899r0) r0
            N1.d r17 = c(r0)
            U0.I0 r3 = androidx.compose.ui.platform.C5100f0.g()
            java.lang.Object r3 = r2.Q(r3)
            r26 = r3
            S1.m$b r26 = (S1.C4820m.b) r26
            boolean r3 = r2.V(r0)
            java.lang.Object r4 = r2.D()
            if (r3 != 0) goto L_0x0398
            U0.m$a r3 = U0.C4889m.f14007a
            java.lang.Object r3 = r3.a()
            if (r4 != r3) goto L_0x03a0
        L_0x0398:
            B0.d$b r4 = new B0.d$b
            r4.<init>(r0)
            r2.u(r4)
        L_0x03a0:
            r29 = r4
            nI.l r29 = (nI.C17642l) r29
            int r0 = r1 >> 3
            r0 = r0 & 910(0x38e, float:1.275E-42)
            int r3 = r1 >> 12
            r4 = 57344(0xe000, float:8.0356E-41)
            r3 = r3 & r4
            r0 = r0 | r3
            int r3 = r1 << 9
            r4 = 458752(0x70000, float:6.42848E-40)
            r3 = r3 & r4
            r0 = r0 | r3
            int r3 = r1 << 6
            r4 = 3670016(0x380000, float:5.142788E-39)
            r4 = r4 & r3
            r0 = r0 | r4
            r4 = 29360128(0x1c00000, float:7.052966E-38)
            r4 = r4 & r3
            r0 = r0 | r4
            r4 = 234881024(0xe000000, float:1.5777218E-30)
            r4 = r4 & r3
            r0 = r0 | r4
            r4 = 1879048192(0x70000000, float:1.58456325E29)
            r3 = r3 & r4
            r31 = r0 | r3
            int r0 = r1 >> 21
            r0 = r0 & 896(0x380, float:1.256E-42)
            r32 = r0
            r33 = 0
            r16 = r43
            r18 = r45
            r20 = r48
            r21 = r44
            r22 = r46
            r23 = r47
            r24 = r35
            r25 = r34
            r27 = r50
            r28 = r49
            r30 = r2
            e(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            r2.P()
        L_0x03ec:
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x03f5
            U0.C4895p.R()
        L_0x03f5:
            r8 = r34
            r7 = r35
            r3 = r44
            r4 = r45
            r5 = r46
            r6 = r47
            r9 = r48
            r10 = r49
        L_0x0405:
            U0.Y0 r13 = r2.n()
            if (r13 == 0) goto L_0x041d
            B0.d$c r12 = new B0.d$c
            r0 = r12
            r1 = r52
            r2 = r43
            r11 = r63
            r14 = r12
            r12 = r64
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r13.a(r14)
        L_0x041d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: B0.C4360d.a(N1.d, androidx.compose.ui.d, N1.Y, nI.l, int, boolean, int, int, java.util.Map, p1.y0, U0.m, int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:138:0x01f9, code lost:
        if (r6 == U0.C4889m.f14007a.a()) goto L_0x01fb;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x037e  */
    /* JADX WARNING: Removed duplicated region for block: B:167:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x00fa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(java.lang.String r42, androidx.compose.ui.d r43, N1.Y r44, nI.C17642l<? super N1.P, XH.C16807N> r45, int r46, boolean r47, int r48, int r49, p1.C5753y0 r50, U0.C4889m r51, int r52, int r53) {
        /*
            r10 = r52
            r11 = r53
            r0 = -1186827822(0xffffffffb94271d2, float:-1.8543683E-4)
            r1 = r51
            U0.m r1 = r1.k(r0)
            r2 = r11 & 1
            if (r2 == 0) goto L_0x0017
            r2 = r10 | 6
            r3 = r2
            r2 = r42
            goto L_0x002b
        L_0x0017:
            r2 = r10 & 6
            if (r2 != 0) goto L_0x0028
            r2 = r42
            boolean r3 = r1.V(r2)
            if (r3 == 0) goto L_0x0025
            r3 = 4
            goto L_0x0026
        L_0x0025:
            r3 = 2
        L_0x0026:
            r3 = r3 | r10
            goto L_0x002b
        L_0x0028:
            r2 = r42
            r3 = r10
        L_0x002b:
            r4 = r11 & 2
            if (r4 == 0) goto L_0x0034
            r3 = r3 | 48
        L_0x0031:
            r5 = r43
            goto L_0x0046
        L_0x0034:
            r5 = r10 & 48
            if (r5 != 0) goto L_0x0031
            r5 = r43
            boolean r6 = r1.V(r5)
            if (r6 == 0) goto L_0x0043
            r6 = 32
            goto L_0x0045
        L_0x0043:
            r6 = 16
        L_0x0045:
            r3 = r3 | r6
        L_0x0046:
            r6 = r11 & 4
            if (r6 == 0) goto L_0x004f
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x004c:
            r7 = r44
            goto L_0x0061
        L_0x004f:
            r7 = r10 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x004c
            r7 = r44
            boolean r8 = r1.V(r7)
            if (r8 == 0) goto L_0x005e
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0060
        L_0x005e:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0060:
            r3 = r3 | r8
        L_0x0061:
            r8 = r11 & 8
            if (r8 == 0) goto L_0x006a
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x0067:
            r9 = r45
            goto L_0x007c
        L_0x006a:
            r9 = r10 & 3072(0xc00, float:4.305E-42)
            if (r9 != 0) goto L_0x0067
            r9 = r45
            boolean r12 = r1.F(r9)
            if (r12 == 0) goto L_0x0079
            r12 = 2048(0x800, float:2.87E-42)
            goto L_0x007b
        L_0x0079:
            r12 = 1024(0x400, float:1.435E-42)
        L_0x007b:
            r3 = r3 | r12
        L_0x007c:
            r12 = r11 & 16
            if (r12 == 0) goto L_0x0085
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
        L_0x0082:
            r13 = r46
            goto L_0x0097
        L_0x0085:
            r13 = r10 & 24576(0x6000, float:3.4438E-41)
            if (r13 != 0) goto L_0x0082
            r13 = r46
            boolean r14 = r1.d(r13)
            if (r14 == 0) goto L_0x0094
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0096
        L_0x0094:
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x0096:
            r3 = r3 | r14
        L_0x0097:
            r14 = r11 & 32
            r15 = 196608(0x30000, float:2.75506E-40)
            if (r14 == 0) goto L_0x00a1
            r3 = r3 | r15
        L_0x009e:
            r15 = r47
            goto L_0x00b3
        L_0x00a1:
            r15 = r15 & r10
            if (r15 != 0) goto L_0x009e
            r15 = r47
            boolean r16 = r1.b(r15)
            if (r16 == 0) goto L_0x00af
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b1
        L_0x00af:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00b1:
            r3 = r3 | r16
        L_0x00b3:
            r16 = r11 & 64
            r17 = 1572864(0x180000, float:2.204052E-39)
            if (r16 == 0) goto L_0x00be
            r3 = r3 | r17
            r0 = r48
            goto L_0x00d1
        L_0x00be:
            r17 = r10 & r17
            r0 = r48
            if (r17 != 0) goto L_0x00d1
            boolean r18 = r1.d(r0)
            if (r18 == 0) goto L_0x00cd
            r18 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00cf
        L_0x00cd:
            r18 = 524288(0x80000, float:7.34684E-40)
        L_0x00cf:
            r3 = r3 | r18
        L_0x00d1:
            r0 = r11 & 128(0x80, float:1.794E-43)
            r18 = 12582912(0xc00000, float:1.7632415E-38)
            if (r0 == 0) goto L_0x00dc
            r3 = r3 | r18
            r2 = r49
            goto L_0x00ef
        L_0x00dc:
            r18 = r10 & r18
            r2 = r49
            if (r18 != 0) goto L_0x00ef
            boolean r18 = r1.d(r2)
            if (r18 == 0) goto L_0x00eb
            r18 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00ed
        L_0x00eb:
            r18 = 4194304(0x400000, float:5.877472E-39)
        L_0x00ed:
            r3 = r3 | r18
        L_0x00ef:
            r2 = r11 & 256(0x100, float:3.59E-43)
            r18 = 100663296(0x6000000, float:2.4074124E-35)
            if (r2 == 0) goto L_0x00fa
            r3 = r3 | r18
            r5 = r50
            goto L_0x010d
        L_0x00fa:
            r18 = r10 & r18
            r5 = r50
            if (r18 != 0) goto L_0x010d
            boolean r18 = r1.F(r5)
            if (r18 == 0) goto L_0x0109
            r18 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x010b
        L_0x0109:
            r18 = 33554432(0x2000000, float:9.403955E-38)
        L_0x010b:
            r3 = r3 | r18
        L_0x010d:
            r18 = 38347923(0x2492493, float:1.4777644E-37)
            r5 = r3 & r18
            r7 = 38347922(0x2492492, float:1.4777643E-37)
            if (r5 != r7) goto L_0x0130
            boolean r5 = r1.l()
            if (r5 != 0) goto L_0x011e
            goto L_0x0130
        L_0x011e:
            r1.L()
            r2 = r43
            r3 = r44
            r7 = r48
            r8 = r49
            r4 = r9
            r5 = r13
            r6 = r15
            r9 = r50
            goto L_0x0378
        L_0x0130:
            if (r4 == 0) goto L_0x0135
            androidx.compose.ui.d$a r4 = androidx.compose.ui.d.f18749a
            goto L_0x0137
        L_0x0135:
            r4 = r43
        L_0x0137:
            if (r6 == 0) goto L_0x0140
            N1.Y$a r5 = N1.Y.f9422d
            N1.Y r5 = r5.a()
            goto L_0x0142
        L_0x0140:
            r5 = r44
        L_0x0142:
            r6 = 0
            if (r8 == 0) goto L_0x0146
            r9 = r6
        L_0x0146:
            if (r12 == 0) goto L_0x014f
            Y1.t$a r7 = Y1.t.f14827a
            int r7 = r7.a()
            goto L_0x0150
        L_0x014f:
            r7 = r13
        L_0x0150:
            r8 = 1
            if (r14 == 0) goto L_0x0156
            r41 = r8
            goto L_0x0158
        L_0x0156:
            r41 = r15
        L_0x0158:
            if (r16 == 0) goto L_0x015f
            r12 = 2147483647(0x7fffffff, float:NaN)
            r15 = r12
            goto L_0x0161
        L_0x015f:
            r15 = r48
        L_0x0161:
            if (r0 == 0) goto L_0x0164
            goto L_0x0166
        L_0x0164:
            r8 = r49
        L_0x0166:
            if (r2 == 0) goto L_0x016a
            r0 = r6
            goto L_0x016c
        L_0x016a:
            r0 = r50
        L_0x016c:
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x017b
            r2 = -1
            java.lang.String r12 = "androidx.compose.foundation.text.BasicText (BasicText.kt:96)"
            r13 = -1186827822(0xffffffffb94271d2, float:-1.8543683E-4)
            U0.C4895p.S(r13, r3, r2, r12)
        L_0x017b:
            B0.C4371o.b(r8, r15)
            U0.I0 r2 = H0.M.a()
            java.lang.Object r2 = r1.Q(r2)
            H0.J r2 = (H0.J) r2
            if (r2 == 0) goto L_0x021c
            r3 = -1589202404(0xffffffffa146b21c, float:-6.7320735E-19)
            r1.W(r3)
            U0.I0 r3 = H0.W.b()
            java.lang.Object r3 = r1.Q(r3)
            H0.V r3 = (H0.V) r3
            long r12 = r3.a()
            java.lang.Object[] r3 = new java.lang.Object[]{r2}
            f1.k r6 = j(r2)
            boolean r14 = r1.F(r2)
            java.lang.Object r10 = r1.D()
            if (r14 != 0) goto L_0x01b8
            U0.m$a r14 = U0.C4889m.f14007a
            java.lang.Object r14 = r14.a()
            if (r10 != r14) goto L_0x01c0
        L_0x01b8:
            B0.d$d r10 = new B0.d$d
            r10.<init>(r2)
            r1.u(r10)
        L_0x01c0:
            nI.a r10 = (nI.C17631a) r10
            r14 = 0
            r16 = 4
            r17 = 0
            r43 = r3
            r44 = r6
            r45 = r17
            r46 = r10
            r47 = r1
            r48 = r14
            r49 = r16
            java.lang.Object r3 = f1.C5301c.e(r43, r44, r45, r46, r47, r48, r49)
            java.lang.Number r3 = (java.lang.Number) r3
            long r10 = r3.longValue()
            boolean r3 = r1.e(r10)
            boolean r6 = r1.V(r2)
            r3 = r3 | r6
            boolean r6 = r1.e(r12)
            r3 = r3 | r6
            java.lang.Object r6 = r1.D()
            if (r3 != 0) goto L_0x01fb
            U0.m$a r3 = U0.C4889m.f14007a
            java.lang.Object r3 = r3.a()
            if (r6 != r3) goto L_0x0216
        L_0x01fb:
            G0.g r6 = new G0.g
            r3 = 8
            r14 = 0
            r16 = 0
            r43 = r6
            r44 = r10
            r46 = r2
            r47 = r12
            r49 = r16
            r50 = r3
            r51 = r14
            r43.<init>(r44, r46, r47, r49, r50, r51)
            r1.u(r6)
        L_0x0216:
            G0.g r6 = (G0.g) r6
            r1.P()
            goto L_0x0225
        L_0x021c:
            r2 = -1588686502(0xffffffffa14e915a, float:-6.9987886E-19)
            r1.W(r2)
            r1.P()
        L_0x0225:
            if (r6 != 0) goto L_0x0229
            if (r9 == 0) goto L_0x022b
        L_0x0229:
            r10 = r15
            goto L_0x0288
        L_0x022b:
            r2 = -1587866335(0xffffffffa15b1521, float:-7.422805E-19)
            r1.W(r2)
            r39 = 131071(0x1ffff, float:1.8367E-40)
            r40 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r36 = 0
            r38 = 0
            r18 = r4
            androidx.compose.ui.d r2 = androidx.compose.ui.graphics.b.c(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r31, r32, r33, r34, r36, r38, r39, r40)
            androidx.compose.foundation.text.modifiers.TextStringSimpleElement r3 = new androidx.compose.foundation.text.modifiers.TextStringSimpleElement
            U0.I0 r6 = androidx.compose.ui.platform.C5100f0.g()
            java.lang.Object r6 = r1.Q(r6)
            S1.m$b r6 = (S1.C4820m.b) r6
            r21 = 0
            r12 = r3
            r13 = r42
            r14 = r5
            r10 = r15
            r15 = r6
            r16 = r7
            r17 = r41
            r18 = r10
            r19 = r8
            r20 = r0
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21)
            androidx.compose.ui.d r2 = r2.s(r3)
            r1.P()
            goto L_0x02f7
        L_0x0288:
            r2 = -1588564052(0xffffffffa1506fac, float:-7.062094E-19)
            r1.W(r2)
            r39 = 131071(0x1ffff, float:1.8367E-40)
            r40 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r36 = 0
            r38 = 0
            r18 = r4
            androidx.compose.ui.d r18 = androidx.compose.ui.graphics.b.c(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r31, r32, r33, r34, r36, r38, r39, r40)
            N1.d r19 = new N1.d
            r2 = 6
            r3 = 0
            r11 = 0
            r12 = 0
            r43 = r19
            r44 = r42
            r45 = r11
            r46 = r12
            r47 = r2
            r48 = r3
            r43.<init>(r44, r45, r46, r47, r48)
            U0.I0 r2 = androidx.compose.ui.platform.C5100f0.g()
            java.lang.Object r2 = r1.Q(r2)
            r26 = r2
            S1.m$b r26 = (S1.C4820m.b) r26
            r28 = 0
            r27 = 0
            r20 = r5
            r21 = r9
            r22 = r7
            r23 = r41
            r24 = r10
            r25 = r8
            r29 = r6
            r30 = r0
            androidx.compose.ui.d r2 = k(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r1.P()
        L_0x02f7:
            B0.l r3 = B0.C4368l.f5101a
            r6 = 0
            int r6 = U0.C4883j.a(r1, r6)
            androidx.compose.ui.d r2 = androidx.compose.ui.c.e(r1, r2)
            U0.y r11 = r1.s()
            G1.g$a r12 = G1.C4504g.f6515W
            nI.a r13 = r12.a()
            U0.f r14 = r1.m()
            if (r14 != 0) goto L_0x0315
            U0.C4883j.c()
        L_0x0315:
            r1.I()
            boolean r14 = r1.i()
            if (r14 == 0) goto L_0x0322
            r1.p(r13)
            goto L_0x0325
        L_0x0322:
            r1.t()
        L_0x0325:
            U0.m r13 = U0.F1.a(r1)
            nI.p r14 = r12.c()
            U0.F1.c(r13, r3, r14)
            nI.p r3 = r12.e()
            U0.F1.c(r13, r11, r3)
            nI.p r3 = r12.d()
            U0.F1.c(r13, r2, r3)
            nI.p r2 = r12.b()
            boolean r3 = r13.i()
            if (r3 != 0) goto L_0x0356
            java.lang.Object r3 = r13.D()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r6)
            boolean r3 = kotlin.jvm.internal.C17542s.e(r3, r11)
            if (r3 != 0) goto L_0x0364
        L_0x0356:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)
            r13.u(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)
            r13.w(r3, r2)
        L_0x0364:
            r1.x()
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x0370
            U0.C4895p.R()
        L_0x0370:
            r2 = r4
            r3 = r5
            r5 = r7
            r4 = r9
            r7 = r10
            r6 = r41
            r9 = r0
        L_0x0378:
            U0.Y0 r12 = r1.n()
            if (r12 == 0) goto L_0x038d
            B0.d$a r13 = new B0.d$a
            r0 = r13
            r1 = r42
            r10 = r52
            r11 = r53
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.a(r13)
        L_0x038d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: B0.C4360d.b(java.lang.String, androidx.compose.ui.d, N1.Y, nI.l, int, boolean, int, int, p1.y0, U0.m, int, int):void");
    }

    private static final C4669d c(C4899r0<C4669d> r0Var) {
        return r0Var.getValue();
    }

    /* access modifiers changed from: private */
    public static final void d(C4899r0<C4669d> r0Var, C4669d dVar) {
        r0Var.setValue(dVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v1, resolved type: nI.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v39, resolved type: U0.r0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r60v1, resolved type: U0.r0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v41, resolved type: U0.r0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v43, resolved type: U0.r0} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x01a3  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x01a8  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x01d2  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x01d9  */
    /* JADX WARNING: Removed duplicated region for block: B:273:0x04af  */
    /* JADX WARNING: Removed duplicated region for block: B:275:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0122  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void e(androidx.compose.ui.d r46, N1.C4669d r47, nI.C17642l<? super N1.P, XH.C16807N> r48, boolean r49, java.util.Map<java.lang.String, B0.C4373q> r50, N1.Y r51, int r52, boolean r53, int r54, int r55, S1.C4820m.b r56, G0.g r57, p1.C5753y0 r58, nI.C17642l<? super androidx.compose.foundation.text.modifiers.b.a, XH.C16807N> r59, U0.C4889m r60, int r61, int r62, int r63) {
        /*
            r2 = r47
            r3 = r48
            r4 = r49
            r15 = r61
            r14 = r62
            r13 = r63
            r8 = 256(0x100, float:3.59E-43)
            r9 = 128(0x80, float:1.794E-43)
            r10 = 32
            r11 = 16
            r12 = 645129368(0x2673e498, float:8.4617363E-16)
            r5 = r60
            U0.m r5 = r5.k(r12)
            r17 = 1
            r18 = r13 & 1
            r19 = 4
            r12 = 2
            if (r18 == 0) goto L_0x002d
            r18 = r15 | 6
            r6 = r46
            r21 = r18
            goto L_0x0043
        L_0x002d:
            r18 = r15 & 6
            r6 = r46
            if (r18 != 0) goto L_0x0041
            boolean r21 = r5.V(r6)
            if (r21 == 0) goto L_0x003c
            r21 = r19
            goto L_0x003e
        L_0x003c:
            r21 = r12
        L_0x003e:
            r21 = r15 | r21
            goto L_0x0043
        L_0x0041:
            r21 = r15
        L_0x0043:
            r22 = r13 & 2
            if (r22 == 0) goto L_0x004c
            r21 = r21 | 48
        L_0x0049:
            r12 = r21
            goto L_0x005e
        L_0x004c:
            r22 = r15 & 48
            if (r22 != 0) goto L_0x0049
            boolean r22 = r5.V(r2)
            if (r22 == 0) goto L_0x0059
            r22 = r10
            goto L_0x005b
        L_0x0059:
            r22 = r11
        L_0x005b:
            r21 = r21 | r22
            goto L_0x0049
        L_0x005e:
            r21 = r13 & 4
            if (r21 == 0) goto L_0x0065
            r12 = r12 | 384(0x180, float:5.38E-43)
            goto L_0x0073
        L_0x0065:
            r7 = r15 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x0073
            boolean r7 = r5.F(r3)
            if (r7 == 0) goto L_0x0071
            r7 = r8
            goto L_0x0072
        L_0x0071:
            r7 = r9
        L_0x0072:
            r12 = r12 | r7
        L_0x0073:
            r7 = r13 & 8
            if (r7 == 0) goto L_0x007a
            r12 = r12 | 3072(0xc00, float:4.305E-42)
            goto L_0x008a
        L_0x007a:
            r7 = r15 & 3072(0xc00, float:4.305E-42)
            if (r7 != 0) goto L_0x008a
            boolean r7 = r5.b(r4)
            if (r7 == 0) goto L_0x0087
            r7 = 2048(0x800, float:2.87E-42)
            goto L_0x0089
        L_0x0087:
            r7 = 1024(0x400, float:1.435E-42)
        L_0x0089:
            r12 = r12 | r7
        L_0x008a:
            r7 = r13 & 16
            if (r7 == 0) goto L_0x0093
            r12 = r12 | 24576(0x6000, float:3.4438E-41)
        L_0x0090:
            r11 = r50
            goto L_0x00a6
        L_0x0093:
            r11 = r15 & 24576(0x6000, float:3.4438E-41)
            if (r11 != 0) goto L_0x0090
            r11 = r50
            boolean r23 = r5.F(r11)
            if (r23 == 0) goto L_0x00a2
            r23 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a4
        L_0x00a2:
            r23 = 8192(0x2000, float:1.14794E-41)
        L_0x00a4:
            r12 = r12 | r23
        L_0x00a6:
            r23 = r13 & 32
            r24 = 196608(0x30000, float:2.75506E-40)
            if (r23 == 0) goto L_0x00b1
            r12 = r12 | r24
            r10 = r51
            goto L_0x00c4
        L_0x00b1:
            r23 = r15 & r24
            r10 = r51
            if (r23 != 0) goto L_0x00c4
            boolean r24 = r5.V(r10)
            if (r24 == 0) goto L_0x00c0
            r24 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c2
        L_0x00c0:
            r24 = 65536(0x10000, float:9.18355E-41)
        L_0x00c2:
            r12 = r12 | r24
        L_0x00c4:
            r24 = r13 & 64
            r25 = 1572864(0x180000, float:2.204052E-39)
            if (r24 == 0) goto L_0x00cf
            r12 = r12 | r25
            r0 = r52
            goto L_0x00e2
        L_0x00cf:
            r24 = r15 & r25
            r0 = r52
            if (r24 != 0) goto L_0x00e2
            boolean r25 = r5.d(r0)
            if (r25 == 0) goto L_0x00de
            r25 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e0
        L_0x00de:
            r25 = 524288(0x80000, float:7.34684E-40)
        L_0x00e0:
            r12 = r12 | r25
        L_0x00e2:
            r1 = r13 & 128(0x80, float:1.794E-43)
            r26 = 12582912(0xc00000, float:1.7632415E-38)
            if (r1 == 0) goto L_0x00ed
            r12 = r12 | r26
        L_0x00ea:
            r1 = r53
            goto L_0x0100
        L_0x00ed:
            r1 = r15 & r26
            if (r1 != 0) goto L_0x00ea
            r1 = r53
            boolean r26 = r5.b(r1)
            if (r26 == 0) goto L_0x00fc
            r26 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00fe
        L_0x00fc:
            r26 = 4194304(0x400000, float:5.877472E-39)
        L_0x00fe:
            r12 = r12 | r26
        L_0x0100:
            r9 = r13 & 256(0x100, float:3.59E-43)
            if (r9 == 0) goto L_0x010a
            r9 = 100663296(0x6000000, float:2.4074124E-35)
            r12 = r12 | r9
        L_0x0107:
            r9 = r54
            goto L_0x011e
        L_0x010a:
            r9 = 100663296(0x6000000, float:2.4074124E-35)
            r9 = r9 & r15
            if (r9 != 0) goto L_0x0107
            r9 = r54
            boolean r25 = r5.d(r9)
            if (r25 == 0) goto L_0x011a
            r25 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x011c
        L_0x011a:
            r25 = 33554432(0x2000000, float:9.403955E-38)
        L_0x011c:
            r12 = r12 | r25
        L_0x011e:
            r8 = r13 & 512(0x200, float:7.175E-43)
            if (r8 == 0) goto L_0x012a
            r8 = 805306368(0x30000000, float:4.656613E-10)
            r12 = r12 | r8
        L_0x0125:
            r8 = r55
        L_0x0127:
            r0 = 1024(0x400, float:1.435E-42)
            goto L_0x013f
        L_0x012a:
            r8 = 805306368(0x30000000, float:4.656613E-10)
            r8 = r8 & r15
            if (r8 != 0) goto L_0x0125
            r8 = r55
            boolean r24 = r5.d(r8)
            if (r24 == 0) goto L_0x013a
            r24 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x013c
        L_0x013a:
            r24 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x013c:
            r12 = r12 | r24
            goto L_0x0127
        L_0x013f:
            r1 = r13 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x014a
            r1 = r14 | 6
            r19 = r1
        L_0x0147:
            r0 = 2048(0x800, float:2.87E-42)
            goto L_0x0161
        L_0x014a:
            r1 = r14 & 6
            if (r1 != 0) goto L_0x015c
            r1 = r56
            boolean r21 = r5.F(r1)
            if (r21 == 0) goto L_0x0157
            goto L_0x0159
        L_0x0157:
            r19 = 2
        L_0x0159:
            r19 = r14 | r19
            goto L_0x0147
        L_0x015c:
            r1 = r56
            r19 = r14
            goto L_0x0147
        L_0x0161:
            r1 = r13 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x016c
            r19 = r19 | 48
        L_0x0167:
            r1 = r57
        L_0x0169:
            r0 = r19
            goto L_0x0180
        L_0x016c:
            r1 = r14 & 48
            if (r1 != 0) goto L_0x0167
            r1 = r57
            boolean r18 = r5.F(r1)
            if (r18 == 0) goto L_0x017b
            r22 = 32
            goto L_0x017d
        L_0x017b:
            r22 = 16
        L_0x017d:
            r19 = r19 | r22
            goto L_0x0169
        L_0x0180:
            r1 = r13 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x0189
            r0 = r0 | 384(0x180, float:5.38E-43)
        L_0x0186:
            r1 = 8192(0x2000, float:1.14794E-41)
            goto L_0x01a0
        L_0x0189:
            r1 = r14 & 384(0x180, float:5.38E-43)
            if (r1 != 0) goto L_0x019d
            r1 = r58
            boolean r19 = r5.F(r1)
            if (r19 == 0) goto L_0x0198
            r26 = 256(0x100, float:3.59E-43)
            goto L_0x019a
        L_0x0198:
            r26 = 128(0x80, float:1.794E-43)
        L_0x019a:
            r0 = r0 | r26
            goto L_0x0186
        L_0x019d:
            r1 = r58
            goto L_0x0186
        L_0x01a0:
            r1 = r1 & r13
            if (r1 == 0) goto L_0x01a8
            r0 = r0 | 3072(0xc00, float:4.305E-42)
        L_0x01a5:
            r1 = r59
            goto L_0x01bb
        L_0x01a8:
            r1 = r14 & 3072(0xc00, float:4.305E-42)
            if (r1 != 0) goto L_0x01a5
            r1 = r59
            boolean r16 = r5.F(r1)
            if (r16 == 0) goto L_0x01b7
            r18 = 2048(0x800, float:2.87E-42)
            goto L_0x01b9
        L_0x01b7:
            r18 = 1024(0x400, float:1.435E-42)
        L_0x01b9:
            r0 = r0 | r18
        L_0x01bb:
            r16 = 306783379(0x12492493, float:6.34695E-28)
            r1 = r12 & r16
            r6 = 306783378(0x12492492, float:6.3469493E-28)
            if (r1 != r6) goto L_0x01d9
            r1 = r0 & 1171(0x493, float:1.641E-42)
            r6 = 1170(0x492, float:1.64E-42)
            if (r1 != r6) goto L_0x01d9
            boolean r1 = r5.l()
            if (r1 != 0) goto L_0x01d2
            goto L_0x01d9
        L_0x01d2:
            r5.L()
            r20 = r11
            goto L_0x04a9
        L_0x01d9:
            if (r7 == 0) goto L_0x01e0
            java.util.Map r1 = YH.X.j()
            goto L_0x01e1
        L_0x01e0:
            r1 = r11
        L_0x01e1:
            boolean r6 = U0.C4895p.J()
            if (r6 == 0) goto L_0x01ef
            java.lang.String r6 = "androidx.compose.foundation.text.LayoutWithLinksAndInlineContent (BasicText.kt:536)"
            r7 = 645129368(0x2673e498, float:8.4617363E-16)
            U0.C4895p.S(r7, r12, r0, r6)
        L_0x01ef:
            boolean r0 = G0.j.a(r47)
            r7 = 0
            if (r0 == 0) goto L_0x0222
            r0 = -619323167(0xffffffffdb15e0e1, float:-4.2187029E16)
            r5.W(r0)
            r0 = r12 & 112(0x70, float:1.57E-43)
            r11 = 32
            if (r0 != r11) goto L_0x0205
            r0 = r17
            goto L_0x0206
        L_0x0205:
            r0 = 0
        L_0x0206:
            java.lang.Object r11 = r5.D()
            if (r0 != 0) goto L_0x0214
            U0.m$a r0 = U0.C4889m.f14007a
            java.lang.Object r0 = r0.a()
            if (r11 != r0) goto L_0x021c
        L_0x0214:
            B0.g0 r11 = new B0.g0
            r11.<init>(r2)
            r5.u(r11)
        L_0x021c:
            B0.g0 r11 = (B0.g0) r11
            r5.P()
            goto L_0x022c
        L_0x0222:
            r0 = -619265198(0xffffffffdb16c352, float:-4.2436003E16)
            r5.W(r0)
            r5.P()
            r11 = r7
        L_0x022c:
            boolean r0 = G0.j.a(r47)
            if (r0 == 0) goto L_0x0263
            r0 = -619074547(0xffffffffdb19ac0d, float:-4.3254843E16)
            r5.W(r0)
            r0 = r12 & 112(0x70, float:1.57E-43)
            r6 = 32
            if (r0 != r6) goto L_0x0241
            r0 = r17
            goto L_0x0242
        L_0x0241:
            r0 = 0
        L_0x0242:
            boolean r6 = r5.V(r11)
            r0 = r0 | r6
            java.lang.Object r6 = r5.D()
            if (r0 != 0) goto L_0x0255
            U0.m$a r0 = U0.C4889m.f14007a
            java.lang.Object r0 = r0.a()
            if (r6 != r0) goto L_0x025d
        L_0x0255:
            B0.d$l r6 = new B0.d$l
            r6.<init>(r11, r2)
            r5.u(r6)
        L_0x025d:
            nI.a r6 = (nI.C17631a) r6
            r5.P()
            goto L_0x028e
        L_0x0263:
            r0 = -618966357(0xffffffffdb1b52ab, float:-4.3719516E16)
            r5.W(r0)
            r0 = r12 & 112(0x70, float:1.57E-43)
            r6 = 32
            if (r0 != r6) goto L_0x0272
            r0 = r17
            goto L_0x0273
        L_0x0272:
            r0 = 0
        L_0x0273:
            java.lang.Object r6 = r5.D()
            if (r0 != 0) goto L_0x0281
            U0.m$a r0 = U0.C4889m.f14007a
            java.lang.Object r0 = r0.a()
            if (r6 != r0) goto L_0x0289
        L_0x0281:
            B0.d$m r6 = new B0.d$m
            r6.<init>(r2)
            r5.u(r6)
        L_0x0289:
            nI.a r6 = (nI.C17631a) r6
            r5.P()
        L_0x028e:
            if (r4 == 0) goto L_0x0295
            XH.v r0 = B0.C4358b.c(r2, r1)
            goto L_0x029a
        L_0x0295:
            XH.v r0 = new XH.v
            r0.<init>(r7, r7)
        L_0x029a:
            java.lang.Object r16 = r0.a()
            java.util.List r16 = (java.util.List) r16
            java.lang.Object r0 = r0.b()
            java.util.List r0 = (java.util.List) r0
            if (r4 == 0) goto L_0x02d1
            r7 = -618671702(0xffffffffdb1fd1aa, float:-4.4985049E16)
            r5.W(r7)
            java.lang.Object r7 = r5.D()
            U0.m$a r19 = U0.C4889m.f14007a
            r20 = r1
            java.lang.Object r1 = r19.a()
            if (r7 != r1) goto L_0x02c6
            r1 = 2
            r7 = 0
            U0.r0 r1 = U0.u1.e(r7, r7, r1, r7)
            r5.u(r1)
            goto L_0x02cb
        L_0x02c6:
            r60 = r7
            r7 = 0
            r1 = r60
        L_0x02cb:
            U0.r0 r1 = (U0.C4899r0) r1
            r5.P()
            goto L_0x02dd
        L_0x02d1:
            r20 = r1
            r1 = -618591630(0xffffffffdb210a72, float:-4.5328956E16)
            r5.W(r1)
            r5.P()
            r1 = r7
        L_0x02dd:
            if (r4 == 0) goto L_0x0306
            r7 = -618506565(0xffffffffdb2256bb, float:-4.5694307E16)
            r5.W(r7)
            boolean r7 = r5.V(r1)
            java.lang.Object r8 = r5.D()
            if (r7 != 0) goto L_0x02f7
            U0.m$a r7 = U0.C4889m.f14007a
            java.lang.Object r7 = r7.a()
            if (r8 != r7) goto L_0x02ff
        L_0x02f7:
            B0.d$k r8 = new B0.d$k
            r8.<init>(r1)
            r5.u(r8)
        L_0x02ff:
            nI.l r8 = (nI.C17642l) r8
            r5.P()
            r7 = r8
            goto L_0x030f
        L_0x0306:
            r8 = -618442830(0xffffffffdb234fb2, float:-4.5968047E16)
            r5.W(r8)
            r5.P()
        L_0x030f:
            r42 = 131071(0x1ffff, float:1.8367E-40)
            r43 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r39 = 0
            r41 = 0
            r21 = r46
            androidx.compose.ui.d r24 = androidx.compose.ui.graphics.b.c(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r34, r35, r36, r37, r39, r41, r42, r43)
            java.lang.Object r6 = r6.invoke()
            r25 = r6
            N1.d r25 = (N1.C4669d) r25
            boolean r6 = r5.F(r11)
            r8 = r12 & 896(0x380, float:1.256E-42)
            r9 = 256(0x100, float:3.59E-43)
            if (r8 != r9) goto L_0x034f
            goto L_0x0351
        L_0x034f:
            r17 = 0
        L_0x0351:
            r6 = r6 | r17
            java.lang.Object r8 = r5.D()
            if (r6 != 0) goto L_0x0361
            U0.m$a r6 = U0.C4889m.f14007a
            java.lang.Object r6 = r6.a()
            if (r8 != r6) goto L_0x0369
        L_0x0361:
            B0.d$f r8 = new B0.d$f
            r8.<init>(r11, r3)
            r5.u(r8)
        L_0x0369:
            r27 = r8
            nI.l r27 = (nI.C17642l) r27
            r26 = r51
            r28 = r52
            r29 = r53
            r30 = r54
            r31 = r55
            r32 = r56
            r33 = r16
            r34 = r7
            r35 = r57
            r36 = r58
            r37 = r59
            androidx.compose.ui.d r6 = k(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            if (r4 != 0) goto L_0x03b5
            r1 = -617362851(0xffffffffdb33ca5d, float:-5.0606522E16)
            r5.W(r1)
            boolean r1 = r5.F(r11)
            java.lang.Object r7 = r5.D()
            if (r1 != 0) goto L_0x03a1
            U0.m$a r1 = U0.C4889m.f14007a
            java.lang.Object r1 = r1.a()
            if (r7 != r1) goto L_0x03a9
        L_0x03a1:
            B0.d$g r7 = new B0.d$g
            r7.<init>(r11)
            r5.u(r7)
        L_0x03a9:
            nI.a r7 = (nI.C17631a) r7
            B0.D r1 = new B0.D
            r1.<init>(r7)
            r5.P()
        L_0x03b3:
            r7 = 0
            goto L_0x03fc
        L_0x03b5:
            r7 = -617202116(0xffffffffdb363e3c, float:-5.1296873E16)
            r5.W(r7)
            boolean r7 = r5.F(r11)
            java.lang.Object r8 = r5.D()
            if (r7 != 0) goto L_0x03cd
            U0.m$a r7 = U0.C4889m.f14007a
            java.lang.Object r7 = r7.a()
            if (r8 != r7) goto L_0x03d5
        L_0x03cd:
            B0.d$h r8 = new B0.d$h
            r8.<init>(r11)
            r5.u(r8)
        L_0x03d5:
            nI.a r8 = (nI.C17631a) r8
            boolean r7 = r5.V(r1)
            java.lang.Object r9 = r5.D()
            if (r7 != 0) goto L_0x03e9
            U0.m$a r7 = U0.C4889m.f14007a
            java.lang.Object r7 = r7.a()
            if (r9 != r7) goto L_0x03f1
        L_0x03e9:
            B0.d$i r9 = new B0.d$i
            r9.<init>(r1)
            r5.u(r9)
        L_0x03f1:
            nI.a r9 = (nI.C17631a) r9
            B0.i0 r1 = new B0.i0
            r1.<init>(r8, r9)
            r5.P()
            goto L_0x03b3
        L_0x03fc:
            int r8 = U0.C4883j.a(r5, r7)
            U0.y r7 = r5.s()
            androidx.compose.ui.d r6 = androidx.compose.ui.c.e(r5, r6)
            G1.g$a r9 = G1.C4504g.f6515W
            nI.a r3 = r9.a()
            U0.f r16 = r5.m()
            if (r16 != 0) goto L_0x0417
            U0.C4883j.c()
        L_0x0417:
            r5.I()
            boolean r16 = r5.i()
            if (r16 == 0) goto L_0x0424
            r5.p(r3)
            goto L_0x0427
        L_0x0424:
            r5.t()
        L_0x0427:
            U0.m r3 = U0.F1.a(r5)
            nI.p r4 = r9.c()
            U0.F1.c(r3, r1, r4)
            nI.p r1 = r9.e()
            U0.F1.c(r3, r7, r1)
            nI.p r1 = r9.b()
            boolean r4 = r3.i()
            if (r4 != 0) goto L_0x0451
            java.lang.Object r4 = r3.D()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
            boolean r4 = kotlin.jvm.internal.C17542s.e(r4, r7)
            if (r4 != 0) goto L_0x045f
        L_0x0451:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)
            r3.u(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)
            r3.w(r4, r1)
        L_0x045f:
            nI.p r1 = r9.d()
            U0.F1.c(r3, r6, r1)
            if (r11 != 0) goto L_0x0472
            r1 = -515480539(0xffffffffe1466425, float:-2.2872947E20)
            r5.W(r1)
            r5.P()
            goto L_0x0481
        L_0x0472:
            r1 = 537560924(0x200a875c, float:1.1733841E-19)
            r5.W(r1)
            r1 = 0
            r11.b(r5, r1)
            r5.P()
            XH.N r1 = XH.C16807N.f139792a
        L_0x0481:
            if (r0 != 0) goto L_0x048d
            r0 = -515428893(0xffffffffe1472de3, float:-2.2963803E20)
            r5.W(r0)
        L_0x0489:
            r5.P()
            goto L_0x049d
        L_0x048d:
            r1 = -515428892(0xffffffffe1472de4, float:-2.2963805E20)
            r5.W(r1)
            int r1 = r12 >> 3
            r1 = r1 & 14
            B0.C4358b.a(r2, r0, r5, r1)
            XH.N r0 = XH.C16807N.f139792a
            goto L_0x0489
        L_0x049d:
            r5.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x04a9
            U0.C4895p.R()
        L_0x04a9:
            U0.Y0 r12 = r5.n()
            if (r12 == 0) goto L_0x04e2
            B0.d$j r11 = new B0.d$j
            r0 = r11
            r1 = r46
            r2 = r47
            r3 = r48
            r4 = r49
            r5 = r20
            r6 = r51
            r7 = r52
            r8 = r53
            r9 = r54
            r10 = r55
            r44 = r11
            r11 = r56
            r45 = r12
            r12 = r57
            r13 = r58
            r14 = r59
            r15 = r61
            r16 = r62
            r17 = r63
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r1 = r44
            r0 = r45
            r0.a(r1)
        L_0x04e2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: B0.C4360d.e(androidx.compose.ui.d, N1.d, nI.l, boolean, java.util.Map, N1.Y, int, boolean, int, int, S1.m$b, G0.g, p1.y0, nI.l, U0.m, int, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final List<v<a0, C17631a<c2.n>>> i(List<? extends H> list, C17631a<Boolean> aVar) {
        if (!aVar.invoke().booleanValue()) {
            return null;
        }
        l0 l0Var = new l0();
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            H h10 = (H) list.get(i10);
            Object h11 = h10.h();
            C17542s.h(h11, "null cannot be cast to non-null type androidx.compose.foundation.text.TextRangeLayoutModifier");
            k0 a10 = ((m0) h11).a().a(l0Var);
            arrayList.add(new v(h10.i0(C5267b.f23024b.b(a10.c(), a10.c(), a10.a(), a10.a())), a10.b()));
        }
        return arrayList;
    }

    private static final C5309k<Long, Long> j(J j10) {
        return C5310l.a(new n(j10), o.f4825c);
    }

    private static final d k(d dVar, C4669d dVar2, Y y10, C17642l<? super P, C16807N> lVar, int i10, boolean z10, int i11, int i12, C4820m.b bVar, List<C4669d.c<A>> list, C17642l<? super List<C5669i>, C16807N> lVar2, G0.g gVar, C5753y0 y0Var, C17642l<? super b.a, C16807N> lVar3) {
        d dVar3 = dVar;
        if (gVar == null) {
            TextAnnotatedStringElement textAnnotatedStringElement = r1;
            TextAnnotatedStringElement textAnnotatedStringElement2 = new TextAnnotatedStringElement(dVar2, y10, bVar, lVar, i10, z10, i11, i12, list, lVar2, (G0.g) null, y0Var, lVar3, (DefaultConstructorMarker) null);
            return dVar3.s(d.f18749a).s(textAnnotatedStringElement);
        }
        return dVar3.s(gVar.c()).s(new SelectableTextAnnotatedStringElement(dVar2, y10, bVar, lVar, i10, z10, i11, i12, list, lVar2, gVar, y0Var, (DefaultConstructorMarker) null));
    }
}
