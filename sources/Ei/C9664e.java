package ei;

import Ae.e;
import Ae.j;
import Lg.c;
import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.ingka.ikea.analytics.Interaction$Component;
import gi.C9749d;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lm.C11550a;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\f\u0013B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lei/e;", "LLg/a;", "Lgi/d;", "Lei/e$a;", "actions", "LAe/e;", "analytics", "<init>", "(Lei/e$a;LAe/e;)V", "", "item", "", "a", "(Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "container", "LLg/c;", "d", "(Landroid/view/ViewGroup;)LLg/c;", "b", "Lei/e$a;", "e", "()Lei/e$a;", "c", "LAe/e;", "f", "()LAe/e;", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ei.e  reason: case insensitive filesystem */
public final class C9664e extends Lg.a<C9749d> {

    /* renamed from: b  reason: collision with root package name */
    private final a f72838b;

    /* renamed from: c  reason: collision with root package name */
    private final e f72839c;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0006R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR,\u0010\u0013\u001a\u001a\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0006¨\u0006\u0016"}, d2 = {"Lei/e$a;", "", "Lkotlin/Function1;", "Lcom/ingka/ikea/analytics/Interaction$Component;", "LXH/N;", "c", "()LnI/l;", "openStorePicker", "", "a", "openStoreDetails", "Lkotlin/Function0;", "b", "()LnI/a;", "openPostalCodePicker", "Lkotlin/Function3;", "Llm/a$c;", "e", "()LnI/q;", "openBackInStockNotifications", "d", "openInStoreNavigation", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ei.e$a */
    public interface a {
        C17642l<String, C16807N> a();

        C17631a<C16807N> b();

        C17642l<Interaction$Component, C16807N> c();

        C17642l<String, C16807N> d();

        q<C11550a.c, String, String, C16807N> e();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lei/e$b;", "LLg/c;", "Lgi/d;", "Landroidx/compose/ui/platform/ComposeView;", "composeView", "<init>", "(Lei/e;Landroidx/compose/ui/platform/ComposeView;)V", "viewModel", "LXH/N;", "l", "(Lgi/d;)V", "h", "Landroidx/compose/ui/platform/ComposeView;", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ei.e$b */
    public final class b extends c<C9749d> {

        /* renamed from: h  reason: collision with root package name */
        private final ComposeView f72840h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ C9664e f72841i;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: ei.e$b$a */
        static final class a implements p<C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C9749d f72842a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C9664e f72843b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: ei.e$b$a$a  reason: collision with other inner class name */
            static final class C1260a implements p<C4889m, Integer, C16807N> {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ C9749d f72844a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ C9664e f72845b;

                C1260a(C9749d dVar, C9664e eVar) {
                    this.f72844a = dVar;
                    this.f72845b = eVar;
                }

                /* access modifiers changed from: private */
                public static final C16807N c(C9664e eVar, C9749d dVar) {
                    e.c.c(eVar.f(), j.ACTION_TAP.b(), (Map) null, dVar.b(), (e.b) null, 10, (Object) null);
                    return C16807N.f139792a;
                }

                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: nI.a} */
                /* JADX WARNING: Multi-variable type inference failed */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void b(U0.C4889m r10, int r11) {
                    /*
                        r9 = this;
                        r0 = r11 & 3
                        r1 = 2
                        if (r0 != r1) goto L_0x0011
                        boolean r0 = r10.l()
                        if (r0 != 0) goto L_0x000c
                        goto L_0x0011
                    L_0x000c:
                        r10.L()
                        goto L_0x0097
                    L_0x0011:
                        boolean r0 = U0.C4895p.J()
                        if (r0 == 0) goto L_0x0020
                        r0 = -1
                        java.lang.String r1 = "com.ingka.ikea.app.productinformationpage.v2.delegates.AvailabilityDelegate.ViewHolder.bind.<anonymous>.<anonymous>.<anonymous> (AvailabilityDelegate.kt:60)"
                        r2 = -1423285615(0xffffffffab2a6291, float:-6.053292E-13)
                        U0.C4895p.S(r2, r11, r0, r1)
                    L_0x0020:
                        gi.d r11 = r9.f72844a
                        di.i r1 = r11.k()
                        gi.d r11 = r9.f72844a
                        ei.e r0 = r9.f72845b
                        ei.e$a r0 = r0.e()
                        r2 = 0
                        nI.p r11 = ei.C9669j.d(r11, r0, r10, r2)
                        gi.d r0 = r9.f72844a
                        ei.e r3 = r9.f72845b
                        ei.e$a r3 = r3.e()
                        nI.a r3 = ei.C9669j.e(r0, r3, r10, r2)
                        androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
                        gi.d r2 = r9.f72844a
                        java.lang.String r2 = r2.i()
                        androidx.compose.ui.d r5 = androidx.compose.ui.platform.C5116k1.a(r0, r2)
                        gi.d r0 = r9.f72844a
                        U0.A1 r0 = r0.c()
                        r2 = 2029555728(0x78f89010, float:4.033161E34)
                        r10.W(r2)
                        ei.e r2 = r9.f72845b
                        boolean r2 = r10.F(r2)
                        gi.d r4 = r9.f72844a
                        boolean r4 = r10.V(r4)
                        r2 = r2 | r4
                        ei.e r4 = r9.f72845b
                        gi.d r6 = r9.f72844a
                        java.lang.Object r7 = r10.D()
                        if (r2 != 0) goto L_0x0076
                        U0.m$a r2 = U0.C4889m.f14007a
                        java.lang.Object r2 = r2.a()
                        if (r7 != r2) goto L_0x007e
                    L_0x0076:
                        ei.f r7 = new ei.f
                        r7.<init>(r4, r6)
                        r10.u(r7)
                    L_0x007e:
                        r4 = r7
                        nI.a r4 = (nI.C17631a) r4
                        r10.P()
                        int r2 = IC.C13023e.f110931a
                        int r7 = r2 << 3
                        r8 = 0
                        r2 = r11
                        r6 = r10
                        di.h.c(r0, r1, r2, r3, r4, r5, r6, r7, r8)
                        boolean r10 = U0.C4895p.J()
                        if (r10 == 0) goto L_0x0097
                        U0.C4895p.R()
                    L_0x0097:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: ei.C9664e.b.a.C1260a.b(U0.m, int):void");
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    b((C4889m) obj, ((Number) obj2).intValue());
                    return C16807N.f139792a;
                }
            }

            a(C9749d dVar, C9664e eVar) {
                this.f72842a = dVar;
                this.f72843b = eVar;
            }

            public final void a(C4889m mVar, int i10) {
                if ((i10 & 3) != 2 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(-799962453, i10, -1, "com.ingka.ikea.app.productinformationpage.v2.delegates.AvailabilityDelegate.ViewHolder.bind.<anonymous>.<anonymous> (AvailabilityDelegate.kt:59)");
                    }
                    TC.e.e(false, c1.c.e(-1423285615, true, new C1260a(this.f72842a, this.f72843b), mVar, 54), mVar, 48, 1);
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
        public b(C9664e eVar, ComposeView composeView) {
            super((View) composeView, false, 2, (DefaultConstructorMarker) null);
            C17542s.j(composeView, "composeView");
            this.f72841i = eVar;
            this.f72840h = composeView;
        }

        /* renamed from: l */
        public void c(C9749d dVar) {
            C17542s.j(dVar, "viewModel");
            super.c(dVar);
            this.f72840h.setContent(c1.c.c(-799962453, true, new a(dVar, this.f72841i)));
        }
    }

    public C9664e(a aVar, e eVar) {
        C17542s.j(aVar, "actions");
        C17542s.j(eVar, "analytics");
        this.f72838b = aVar;
        this.f72839c = eVar;
    }

    public boolean a(Object obj) {
        C17542s.j(obj, "item");
        return obj instanceof C9749d;
    }

    public c<C9749d> d(ViewGroup viewGroup) {
        C17542s.j(viewGroup, "container");
        Context context = viewGroup.getContext();
        C17542s.i(context, "getContext(...)");
        return new b(this, new ComposeView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null));
    }

    public final a e() {
        return this.f72838b;
    }

    public final e f() {
        return this.f72839c;
    }
}
