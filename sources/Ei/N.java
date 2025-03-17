package ei;

import KJ.C15987c;
import TC.e;
import U0.C4889m;
import U0.C4895p;
import U0.C4910x;
import U0.J0;
import XH.C16807N;
import YH.C16877v;
import ZC.C13892o;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.ingka.ikea.core.model.Media;
import gi.C9756k;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import nI.p;
import x3.r;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0013\u0017\fB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lei/N;", "LLg/a;", "Lgi/k;", "Lei/N$b;", "onProductImageAction", "Lx3/r;", "simpleCache", "<init>", "(Lei/N$b;Lx3/r;)V", "", "item", "", "a", "(Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "container", "LLg/c;", "d", "(Landroid/view/ViewGroup;)LLg/c;", "b", "Lei/N$b;", "f", "()Lei/N$b;", "c", "Lx3/r;", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class N extends Lg.a<C9756k> {

    /* renamed from: d  reason: collision with root package name */
    public static final a f72769d = new a((DefaultConstructorMarker) null);

    /* renamed from: e  reason: collision with root package name */
    public static final int f72770e = 8;

    /* renamed from: b  reason: collision with root package name */
    private final b f72771b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final r f72772c;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lei/N$a;", "", "<init>", "()V", "", "PAYLOAD_INDEX_IGNORE", "I", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001R6\u0010\n\u001a$\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lei/N$b;", "", "Lkotlin/Function2;", "Ljava/util/ArrayList;", "Lcom/ingka/ikea/core/model/Media;", "Lkotlin/collections/ArrayList;", "", "LXH/N;", "a", "()LnI/p;", "onItemClicked", "Lkotlin/Function1;", "b", "()LnI/l;", "onScrollToIndex", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface b {
        p<ArrayList<Media>, Integer, C16807N> a();

        C17642l<Integer, C16807N> b();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lei/N$c;", "LLg/c;", "Lgi/k;", "Landroidx/compose/ui/platform/ComposeView;", "composeView", "<init>", "(Lei/N;Landroidx/compose/ui/platform/ComposeView;)V", "viewModel", "LXH/N;", "l", "(Lgi/k;)V", "h", "Landroidx/compose/ui/platform/ComposeView;", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class c extends Lg.c<C9756k> {

        /* renamed from: h  reason: collision with root package name */
        private final ComposeView f72773h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ N f72774i;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements p<C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ N f72775a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C9756k f72776b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: ei.N$c$a$a  reason: collision with other inner class name */
            static final class C1253a implements p<C4889m, Integer, C16807N> {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ C9756k f72777a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ N f72778b;

                C1253a(C9756k kVar, N n10) {
                    this.f72777a = kVar;
                    this.f72778b = n10;
                }

                /* access modifiers changed from: private */
                public static final C16807N e(N n10, int i10) {
                    n10.f().b().invoke(Integer.valueOf(i10));
                    return C16807N.f139792a;
                }

                /* access modifiers changed from: private */
                public static final C16807N f(N n10, C9756k kVar, int i10) {
                    p<ArrayList<Media>, Integer, C16807N> a10 = n10.f().a();
                    C15987c<Th.c> h10 = kVar.h();
                    ArrayList arrayList = new ArrayList(C16877v.y(h10, 10));
                    for (Th.c a11 : h10) {
                        arrayList.add(a11.a());
                    }
                    a10.invoke(C16877v.o1(arrayList, new ArrayList()), Integer.valueOf(i10));
                    return C16807N.f139792a;
                }

                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: nI.l} */
                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: nI.l} */
                /* JADX WARNING: Multi-variable type inference failed */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void c(U0.C4889m r7, int r8) {
                    /*
                        r6 = this;
                        r0 = r8 & 3
                        r1 = 2
                        if (r0 != r1) goto L_0x0011
                        boolean r0 = r7.l()
                        if (r0 != 0) goto L_0x000c
                        goto L_0x0011
                    L_0x000c:
                        r7.L()
                        goto L_0x0097
                    L_0x0011:
                        boolean r0 = U0.C4895p.J()
                        if (r0 == 0) goto L_0x0020
                        r0 = -1
                        java.lang.String r1 = "com.ingka.ikea.app.productinformationpage.v2.delegates.ProductImagesDelegateV2.ViewHolder.bind.<anonymous>.<anonymous>.<anonymous> (ProductImagesDelegateV2.kt:83)"
                        r2 = 1638138291(0x61a401b3, float:3.7817356E20)
                        U0.C4895p.S(r2, r8, r0, r1)
                    L_0x0020:
                        gi.k r8 = r6.f72777a
                        KJ.c r0 = r8.h()
                        gi.k r8 = r6.f72777a
                        int r1 = r8.g()
                        r8 = -2013888005(0xffffffff87f681fb, float:-3.7090362E-34)
                        r7.W(r8)
                        ei.N r8 = r6.f72778b
                        boolean r8 = r7.F(r8)
                        ei.N r2 = r6.f72778b
                        java.lang.Object r3 = r7.D()
                        if (r8 != 0) goto L_0x0048
                        U0.m$a r8 = U0.C4889m.f14007a
                        java.lang.Object r8 = r8.a()
                        if (r3 != r8) goto L_0x0050
                    L_0x0048:
                        ei.O r3 = new ei.O
                        r3.<init>(r2)
                        r7.u(r3)
                    L_0x0050:
                        r2 = r3
                        nI.l r2 = (nI.C17642l) r2
                        r7.P()
                        r8 = -2013882757(0xffffffff87f6967b, float:-3.710241E-34)
                        r7.W(r8)
                        ei.N r8 = r6.f72778b
                        boolean r8 = r7.F(r8)
                        gi.k r3 = r6.f72777a
                        boolean r3 = r7.F(r3)
                        r8 = r8 | r3
                        ei.N r3 = r6.f72778b
                        gi.k r4 = r6.f72777a
                        java.lang.Object r5 = r7.D()
                        if (r8 != 0) goto L_0x007b
                        U0.m$a r8 = U0.C4889m.f14007a
                        java.lang.Object r8 = r8.a()
                        if (r5 != r8) goto L_0x0083
                    L_0x007b:
                        ei.P r5 = new ei.P
                        r5.<init>(r3, r4)
                        r7.u(r5)
                    L_0x0083:
                        r3 = r5
                        nI.l r3 = (nI.C17642l) r3
                        r7.P()
                        r5 = 0
                        r4 = r7
                        ei.V.i(r0, r1, r2, r3, r4, r5)
                        boolean r7 = U0.C4895p.J()
                        if (r7 == 0) goto L_0x0097
                        U0.C4895p.R()
                    L_0x0097:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: ei.N.c.a.C1253a.c(U0.m, int):void");
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    c((C4889m) obj, ((Number) obj2).intValue());
                    return C16807N.f139792a;
                }
            }

            a(N n10, C9756k kVar) {
                this.f72775a = n10;
                this.f72776b = kVar;
            }

            public final void a(C4889m mVar, int i10) {
                if ((i10 & 3) != 2 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(-705671565, i10, -1, "com.ingka.ikea.app.productinformationpage.v2.delegates.ProductImagesDelegateV2.ViewHolder.bind.<anonymous>.<anonymous> (ProductImagesDelegateV2.kt:82)");
                    }
                    C4910x.a(C13892o.H().d(this.f72775a.f72772c), c1.c.e(1638138291, true, new C1253a(this.f72776b, this.f72775a), mVar, 54), mVar, J0.f13770i | 48);
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
        public c(N n10, ComposeView composeView) {
            super((View) composeView, false, 2, (DefaultConstructorMarker) null);
            C17542s.j(composeView, "composeView");
            this.f72774i = n10;
            this.f72773h = composeView;
        }

        /* renamed from: l */
        public void c(C9756k kVar) {
            C17542s.j(kVar, "viewModel");
            super.c(kVar);
            e.l(this.f72773h, false, c1.c.c(-705671565, true, new a(this.f72774i, kVar)), 1, (Object) null);
        }
    }

    public N(b bVar, r rVar) {
        C17542s.j(bVar, "onProductImageAction");
        C17542s.j(rVar, "simpleCache");
        this.f72771b = bVar;
        this.f72772c = rVar;
    }

    public boolean a(Object obj) {
        C17542s.j(obj, "item");
        return obj instanceof C9756k;
    }

    public Lg.c<C9756k> d(ViewGroup viewGroup) {
        C17542s.j(viewGroup, "container");
        Context context = viewGroup.getContext();
        C17542s.i(context, "getContext(...)");
        return new c(this, new ComposeView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null));
    }

    public final b f() {
        return this.f72771b;
    }
}
