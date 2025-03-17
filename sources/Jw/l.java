package jw;

import Ae.e;
import HJ.C15854t;
import QJ.F0;
import QJ.Q;
import QJ.T;
import TJ.C16505B;
import TJ.C16521S;
import TJ.C16532g;
import TJ.C16534i;
import XH.C16796C;
import XH.C16807N;
import XH.t;
import XH.y;
import YH.C16877v;
import YH.X;
import android.annotation.SuppressLint;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import com.ingka.ikea.analytics.Interaction$Component;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jw.a;
import jw.b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kw.h;
import kw.j;
import kw.n;
import nI.C17642l;
import nI.p;
import nI.q;
import nI.r;
import qe.C10188a;
import qe.C10189b;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import x4.C8948l;
import x4.C8951o;
import x4.v;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 V2\u00020\u0001:\u0002WXBW\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010!\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001eH\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0017H\u0000¢\u0006\u0004\b#\u0010\u0019J\u000f\u0010$\u001a\u00020\u0017H\u0000¢\u0006\u0004\b$\u0010\u0019J\u001d\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'2\u0006\u0010&\u001a\u00020%H\u0000¢\u0006\u0004\b)\u0010*J\u0017\u0010-\u001a\u00020\u00172\u0006\u0010,\u001a\u00020+H\u0000¢\u0006\u0004\b-\u0010.J+\u00103\u001a\u00020\u00172\u0006\u00100\u001a\u00020/2\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001701H\u0000¢\u0006\u0004\b3\u00104R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00020\u001a0C8\u0002X\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u001a\u0010H\u001a\b\u0012\u0004\u0012\u00020\u001a0C8\u0002X\u0004¢\u0006\u0006\n\u0004\bG\u0010ER&\u0010K\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001e0I0C8\u0002X\u0004¢\u0006\u0006\n\u0004\bJ\u0010ER\u001c\u0010O\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010L0'8\u0002X\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u001a\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u001a0C8\u0002X\u0004¢\u0006\u0006\n\u0004\bP\u0010ER\"\u0010U\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010L0'8\u0000X\u0004¢\u0006\f\n\u0004\bR\u0010N\u001a\u0004\bS\u0010T¨\u0006Y"}, d2 = {"Ljw/l;", "Landroidx/lifecycle/f0;", "LAe/e;", "analytics", "Lkw/b;", "getCommercialMessageForBannerUseCase", "Lkw/h;", "getGlobalWhatsNewMessagesUseCase", "Lkw/f;", "getContextualWhatsNewLinksUseCase", "Lkw/j;", "reportCommercialMessageDisplayed", "Lqe/a;", "alertMessageIntegration", "Lkw/l;", "updateMessageCenterDisplayCountUseCase", "", "Lnw/a;", "commercialMessageFilters", "Lkw/n;", "whatsNewMessagesForInboxUseCase", "<init>", "(LAe/e;Lkw/b;Lkw/h;Lkw/f;Lkw/j;Lqe/a;Lkw/l;Ljava/util/Set;Lkw/n;)V", "LXH/N;", "H", "()V", "", "expand", "I", "(Z)V", "", "value", "type", "O", "(Ljava/lang/String;Ljava/lang/String;)V", "F", "G", "Lx4/o;", "navController", "LTJ/g;", "Ljw/b;", "J", "(Lx4/o;)LTJ/g;", "Ljw/a;", "action", "M", "(Ljw/a;)V", "Lx4/v;", "destination", "Lkotlin/Function1;", "openWhatsNew", "N", "(Lx4/v;LnI/l;)V", "m", "LAe/e;", "n", "Lkw/b;", "o", "Lkw/h;", "p", "Lkw/f;", "q", "Lkw/j;", "r", "Ljava/util/Set;", "s", "Lkw/n;", "LTJ/B;", "t", "LTJ/B;", "commercialMessageDismissed", "u", "commercialMessageExpanded", "", "v", "commercialMessageIdSelectedForRoute", "Ljw/l$b;", "w", "LTJ/g;", "messageFlow", "x", "hasSeenMessage", "y", "K", "()LTJ/g;", "messageState", "z", "b", "a", "messaging-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l extends f0 {

    /* renamed from: A  reason: collision with root package name */
    public static final int f24915A = 8;
    /* access modifiers changed from: private */

    /* renamed from: B  reason: collision with root package name */
    public static final C17642l<cw.b, Boolean> f24916B = new j();

    /* renamed from: z  reason: collision with root package name */
    public static final a f24917z = new a((DefaultConstructorMarker) null);

    /* renamed from: m  reason: collision with root package name */
    private final Ae.e f24918m;

    /* renamed from: n  reason: collision with root package name */
    private final kw.b f24919n;

    /* renamed from: o  reason: collision with root package name */
    private final h f24920o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public final kw.f f24921p;

    /* renamed from: q  reason: collision with root package name */
    private final j f24922q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public final Set<nw.a> f24923r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public final n f24924s;

    /* renamed from: t  reason: collision with root package name */
    private final C16505B<Boolean> f24925t;

    /* renamed from: u  reason: collision with root package name */
    private final C16505B<Boolean> f24926u;
    /* access modifiers changed from: private */

    /* renamed from: v  reason: collision with root package name */
    public final C16505B<Map<String, String>> f24927v = C16521S.a(X.j());
    /* access modifiers changed from: private */

    /* renamed from: w  reason: collision with root package name */
    public final C16532g<b> f24928w;

    /* renamed from: x  reason: collision with root package name */
    private final C16505B<Boolean> f24929x;

    /* renamed from: y  reason: collision with root package name */
    private final C16532g<b> f24930y;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n0\t2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0001¢\u0006\u0004\b\r\u0010\u000eR,\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u0012\u0004\b\u0013\u0010\u0003\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Ljw/l$a;", "", "<init>", "()V", "Lx4/o;", "navController", "", "Lnw/a;", "commercialMessageFilters", "LTJ/g;", "Lkotlin/Function1;", "Lcw/b;", "", "a", "(Lx4/o;Ljava/util/Set;)LTJ/g;", "noMessageFilter", "LnI/l;", "b", "()LnI/l;", "getNoMessageFilter$annotations", "messaging-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Lx4/l;", "backStack", "Lkotlin/Function1;", "Lcw/b;", "", "<anonymous>", "(Ljava/util/List;)LnI/l;"}, k = 3, mv = {2, 1, 0})
        @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.messaging.impl.MessageViewModel$Companion$createCommercialMessageFilterFlow$1", f = "MessageViewModel.kt", l = {}, m = "invokeSuspend")
        /* renamed from: jw.l$a$a  reason: collision with other inner class name */
        static final class C0398a extends kotlin.coroutines.jvm.internal.l implements p<List<? extends C8948l>, C17164e<? super C17642l<? super cw.b, ? extends Boolean>>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f24931c;

            /* renamed from: d  reason: collision with root package name */
            /* synthetic */ Object f24932d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ Set<nw.a> f24933e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0398a(Set<? extends nw.a> set, C17164e<? super C0398a> eVar) {
                super(2, eVar);
                this.f24933e = set;
            }

            /* access modifiers changed from: private */
            public static final boolean k(nw.a aVar, cw.b bVar) {
                return aVar.b().contains(bVar.j());
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                C0398a aVar = new C0398a(this.f24933e, eVar);
                aVar.f24932d = obj;
                return aVar;
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: nw.a} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: nw.a} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: nw.a} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: nw.a} */
            /* JADX WARNING: Code restructure failed: missing block: B:4:0x0017, code lost:
                r5 = r5.e();
             */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                /*
                    r4 = this;
                    eI.C17187b.f()
                    int r0 = r4.f24931c
                    if (r0 != 0) goto L_0x0054
                    XH.y.b(r5)
                    java.lang.Object r5 = r4.f24932d
                    java.util.List r5 = (java.util.List) r5
                    java.lang.Object r5 = YH.C16877v.K0(r5)
                    x4.l r5 = (x4.C8948l) r5
                    r0 = 0
                    if (r5 == 0) goto L_0x0022
                    x4.v r5 = r5.e()
                    if (r5 == 0) goto L_0x0022
                    java.lang.String r5 = r5.C()
                    goto L_0x0023
                L_0x0022:
                    r5 = r0
                L_0x0023:
                    java.util.Set<nw.a> r1 = r4.f24933e
                    java.lang.Iterable r1 = (java.lang.Iterable) r1
                    java.util.Iterator r1 = r1.iterator()
                L_0x002b:
                    boolean r2 = r1.hasNext()
                    if (r2 == 0) goto L_0x0043
                    java.lang.Object r2 = r1.next()
                    r3 = r2
                    nw.a r3 = (nw.a) r3
                    java.lang.String r3 = r3.a()
                    boolean r3 = kotlin.jvm.internal.C17542s.e(r3, r5)
                    if (r3 == 0) goto L_0x002b
                    r0 = r2
                L_0x0043:
                    nw.a r0 = (nw.a) r0
                    if (r0 == 0) goto L_0x004d
                    jw.k r5 = new jw.k
                    r5.<init>(r0)
                    goto L_0x0053
                L_0x004d:
                    jw.l$a r5 = jw.l.f24917z
                    nI.l r5 = r5.b()
                L_0x0053:
                    return r5
                L_0x0054:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r0)
                    throw r5
                */
                throw new UnsupportedOperationException("Method not decompiled: jw.l.a.C0398a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            /* renamed from: j */
            public final Object invoke(List<C8948l> list, C17164e<? super C17642l<? super cw.b, Boolean>> eVar) {
                return ((C0398a) create(list, eVar)).invokeSuspend(C16807N.f139792a);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @SuppressLint({"RestrictedApi"})
        public final C16532g<C17642l<cw.b, Boolean>> a(C8951o oVar, Set<? extends nw.a> set) {
            C17542s.j(oVar, "navController");
            C17542s.j(set, "commercialMessageFilters");
            return C16534i.N(oVar.G(), new C0398a(set, (C17164e<? super C0398a>) null));
        }

        public final C17642l<cw.b, Boolean> b() {
            return l.f24916B;
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Ljw/l$b;", "", "<init>", "()V", "c", "b", "a", "Ljw/l$b$a;", "Ljw/l$b$b;", "Ljw/l$b$c;", "messaging-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class b {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ljw/l$b$a;", "Ljw/l$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "messaging-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final a f24934a = new a();

            private a() {
                super((DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return 1423844245;
            }

            public String toString() {
                return "AlertMessage";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ljw/l$b$b;", "Ljw/l$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "messaging-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: jw.l$b$b  reason: collision with other inner class name */
        public static final class C0399b extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final C0399b f24935a = new C0399b();

            private C0399b() {
                super((DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0399b);
            }

            public int hashCode() {
                return -1598664770;
            }

            public String toString() {
                return "GlobalWhatsNew";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ljw/l$b$c;", "Ljw/l$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "messaging-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class c extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final c f24936a = new c();

            private c() {
                super((DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return -936521417;
            }

            public String toString() {
                return "NoMessages";
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcw/b;", "message", "", "dismiss", "expand", "Ljw/b;", "<anonymous>", "(Lcw/b;ZZ)Ljw/b;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.messaging.impl.MessageViewModel$getCommercialMessageForDestinationFlow$1", f = "MessageViewModel.kt", l = {}, m = "invokeSuspend")
    static final class c extends kotlin.coroutines.jvm.internal.l implements r<cw.b, Boolean, Boolean, C17164e<? super b>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f24937c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f24938d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ boolean f24939e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ boolean f24940f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C8951o f24941g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ l f24942h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C8951o oVar, l lVar, C17164e<? super c> eVar) {
            super(4, eVar);
            this.f24941g = oVar;
            this.f24942h = lVar;
        }

        public final Object i(cw.b bVar, boolean z10, boolean z11, C17164e<? super b> eVar) {
            c cVar = new c(this.f24941g, this.f24942h, eVar);
            cVar.f24938d = bVar;
            cVar.f24939e = z10;
            cVar.f24940f = z11;
            return cVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object value;
            C17187b.f();
            if (this.f24937c == 0) {
                y.b(obj);
                cw.b bVar = (cw.b) this.f24938d;
                boolean z10 = this.f24939e;
                boolean z11 = this.f24940f;
                if (bVar == null) {
                    return b.C0397b.f24882a;
                }
                if (z10) {
                    return b.C0397b.f24882a;
                }
                b.a a10 = m.a(bVar, z11);
                C8951o oVar = this.f24941g;
                l lVar = this.f24942h;
                v J10 = oVar.J();
                Object obj2 = null;
                String C10 = J10 != null ? J10.C() : null;
                Map map = (Map) lVar.f24927v.getValue();
                if (C10 != null) {
                    Iterator it = lVar.f24923r.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (C17542s.e(((nw.a) next).a(), C10)) {
                            obj2 = next;
                            break;
                        }
                    }
                    if (obj2 != null && !map.containsKey(C10)) {
                        Map z12 = X.z(map);
                        z12.put(C10, bVar.f());
                        C16505B j10 = lVar.f24927v;
                        do {
                            value = j10.getValue();
                            Map map2 = (Map) value;
                        } while (!j10.e(value, z12));
                    }
                }
                return a10;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4) {
            return i((cw.b) obj, ((Boolean) obj2).booleanValue(), ((Boolean) obj3).booleanValue(), (C17164e) obj4);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Function1;", "Lcw/b;", "", "filter", "", "messages", "<anonymous>", "(LnI/l;Ljava/util/List;)Lcw/b;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.messaging.impl.MessageViewModel$getCommercialMessageForDestinationFlow$filteredMessage$1", f = "MessageViewModel.kt", l = {}, m = "invokeSuspend")
    static final class d extends kotlin.coroutines.jvm.internal.l implements q<C17642l<? super cw.b, ? extends Boolean>, List<? extends cw.b>, C17164e<? super cw.b>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f24943c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f24944d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f24945e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ l f24946f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C8951o f24947g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(l lVar, C8951o oVar, C17164e<? super d> eVar) {
            super(3, eVar);
            this.f24946f = lVar;
            this.f24947g = oVar;
        }

        /* renamed from: i */
        public final Object invoke(C17642l<? super cw.b, Boolean> lVar, List<cw.b> list, C17164e<? super cw.b> eVar) {
            d dVar = new d(this.f24946f, this.f24947g, eVar);
            dVar.f24944d = lVar;
            dVar.f24945e = list;
            return dVar.invokeSuspend(C16807N.f139792a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: cw.b} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: cw.b} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: cw.b} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: cw.b} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                eI.C17187b.f()
                int r0 = r5.f24943c
                if (r0 != 0) goto L_0x0085
                XH.y.b(r6)
                java.lang.Object r6 = r5.f24944d
                nI.l r6 = (nI.C17642l) r6
                java.lang.Object r0 = r5.f24945e
                java.util.List r0 = (java.util.List) r0
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                java.util.Iterator r0 = r0.iterator()
            L_0x001d:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L_0x0037
                java.lang.Object r2 = r0.next()
                java.lang.Object r3 = r6.invoke(r2)
                java.lang.Boolean r3 = (java.lang.Boolean) r3
                boolean r3 = r3.booleanValue()
                if (r3 == 0) goto L_0x001d
                r1.add(r2)
                goto L_0x001d
            L_0x0037:
                jw.l r6 = r5.f24946f
                x4.o r0 = r5.f24947g
                TJ.B r6 = r6.f24927v
                java.lang.Object r6 = r6.getValue()
                java.util.Map r6 = (java.util.Map) r6
                x4.v r0 = r0.J()
                r2 = 0
                if (r0 == 0) goto L_0x0051
                java.lang.String r0 = r0.C()
                goto L_0x0052
            L_0x0051:
                r0 = r2
            L_0x0052:
                java.lang.Object r6 = r6.get(r0)
                java.lang.String r6 = (java.lang.String) r6
                if (r6 == 0) goto L_0x007b
                java.util.Iterator r0 = r1.iterator()
            L_0x005e:
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L_0x0076
                java.lang.Object r3 = r0.next()
                r4 = r3
                cw.b r4 = (cw.b) r4
                java.lang.String r4 = r4.f()
                boolean r4 = kotlin.jvm.internal.C17542s.e(r4, r6)
                if (r4 == 0) goto L_0x005e
                r2 = r3
            L_0x0076:
                cw.b r2 = (cw.b) r2
                if (r2 == 0) goto L_0x007b
                goto L_0x0084
            L_0x007b:
                rI.c$a r6 = rI.C17853c.f146670a
                java.lang.Object r6 = YH.C16877v.Y0(r1, r6)
                r2 = r6
                cw.b r2 = (cw.b) r2
            L_0x0084:
                return r2
            L_0x0085:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: jw.l.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lqe/b;", "alertState", "", "Lcw/f;", "globalWhatsNewMessages", "Ljw/l$b;", "<anonymous>", "(Lqe/b;Ljava/util/List;)Ljw/l$b;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.messaging.impl.MessageViewModel$messageFlow$1", f = "MessageViewModel.kt", l = {85}, m = "invokeSuspend")
    static final class e extends kotlin.coroutines.jvm.internal.l implements q<C10189b, List<? extends cw.f>, C17164e<? super b>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f24948c;

        /* renamed from: d  reason: collision with root package name */
        Object f24949d;

        /* renamed from: e  reason: collision with root package name */
        Object f24950e;

        /* renamed from: f  reason: collision with root package name */
        Object f24951f;

        /* renamed from: g  reason: collision with root package name */
        Object f24952g;

        /* renamed from: h  reason: collision with root package name */
        Object f24953h;

        /* renamed from: i  reason: collision with root package name */
        Object f24954i;

        /* renamed from: j  reason: collision with root package name */
        Object f24955j;

        /* renamed from: k  reason: collision with root package name */
        int f24956k;

        /* renamed from: l  reason: collision with root package name */
        int f24957l;

        /* renamed from: m  reason: collision with root package name */
        int f24958m;

        /* renamed from: n  reason: collision with root package name */
        int f24959n;

        /* renamed from: o  reason: collision with root package name */
        int f24960o;

        /* renamed from: p  reason: collision with root package name */
        int f24961p;

        /* renamed from: q  reason: collision with root package name */
        /* synthetic */ Object f24962q;

        /* renamed from: r  reason: collision with root package name */
        /* synthetic */ Object f24963r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ l f24964s;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(l lVar, C17164e<? super e> eVar) {
            super(3, eVar);
            this.f24964s = lVar;
        }

        /* renamed from: i */
        public final Object invoke(C10189b bVar, List<cw.f> list, C17164e<? super b> eVar) {
            e eVar2 = new e(this.f24964s, eVar);
            eVar2.f24962q = bVar;
            eVar2.f24963r = list;
            return eVar2.invokeSuspend(C16807N.f139792a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v8, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v9, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v0, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v10, resolved type: qv.b} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v12, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v22, resolved type: java.util.ArrayList} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:53:0x01ab  */
        /* JADX WARNING: Removed duplicated region for block: B:59:0x01c9  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r27) {
            /*
                r26 = this;
                r0 = r26
                java.lang.Object r1 = eI.C17187b.f()
                int r2 = r0.f24961p
                java.lang.String r3 = "|"
                java.lang.String r4 = "b"
                java.lang.String r5 = "m"
                java.lang.String r6 = "main"
                java.lang.String r7 = "Kt"
                r11 = 1
                r12 = 0
                if (r2 == 0) goto L_0x004d
                if (r2 != r11) goto L_0x0045
                java.lang.Object r1 = r0.f24954i
                java.util.Iterator r1 = (java.util.Iterator) r1
                java.lang.Object r1 = r0.f24953h
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.lang.Object r1 = r0.f24952g
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r0.f24951f
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r0.f24950e
                qv.e r1 = (qv.e) r1
                java.lang.Object r1 = r0.f24949d
                jw.l r1 = (jw.l) r1
                java.lang.Object r1 = r0.f24948c
                qe.b r1 = (qe.C10189b) r1
                java.lang.Object r1 = r0.f24963r
                java.util.List r1 = (java.util.List) r1
                java.lang.Object r2 = r0.f24962q
                qe.b r2 = (qe.C10189b) r2
                XH.y.b(r27)
                r23 = r4
                r24 = r5
                goto L_0x0185
            L_0x0045:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x004d:
                XH.y.b(r27)
                java.lang.Object r2 = r0.f24962q
                qe.b r2 = (qe.C10189b) r2
                java.lang.Object r14 = r0.f24963r
                java.util.List r14 = (java.util.List) r14
                jw.l r15 = r0.f24964s
                qv.e r11 = qv.e.DEBUG
                qv.d r16 = qv.d.f102012a
                java.util.List r16 = r16.a()
                java.lang.Iterable r16 = (java.lang.Iterable) r16
                java.util.ArrayList r8 = new java.util.ArrayList
                r8.<init>()
                java.util.Iterator r16 = r16.iterator()
            L_0x006d:
                boolean r17 = r16.hasNext()
                if (r17 == 0) goto L_0x0084
                java.lang.Object r9 = r16.next()
                r10 = r9
                qv.b r10 = (qv.C11819b) r10
                boolean r10 = r10.b(r11, r12)
                if (r10 == 0) goto L_0x006d
                r8.add(r9)
                goto L_0x006d
            L_0x0084:
                java.util.Iterator r9 = r8.iterator()
                r16 = r8
                r10 = 0
                r12 = 0
            L_0x008c:
                boolean r17 = r9.hasNext()
                if (r17 == 0) goto L_0x0132
                java.lang.Object r22 = r9.next()
                r16 = r22
                qv.b r16 = (qv.C11819b) r16
                if (r10 != 0) goto L_0x00c3
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                r23 = r4
                java.lang.String r4 = "MessageState alert state: "
                r13.append(r4)
                r13.append(r2)
                java.lang.String r4 = r13.toString()
                r13 = 0
                java.lang.String r4 = qv.C11818a.a(r4, r13)
                if (r4 != 0) goto L_0x00be
                r25 = r1
                r24 = r5
                r1 = r22
                goto L_0x013a
            L_0x00be:
                java.lang.String r10 = qv.C11820c.a(r4)
                goto L_0x00c5
            L_0x00c3:
                r23 = r4
            L_0x00c5:
                if (r12 != 0) goto L_0x0116
                java.lang.Class r4 = r15.getClass()
                java.lang.String r4 = r4.getName()
                kotlin.jvm.internal.C17542s.g(r4)
                r25 = r1
                r24 = r5
                r5 = 0
                r12 = 36
                r13 = 2
                java.lang.String r1 = HJ.C15854t.s1(r4, r12, r5, r13, r5)
                r12 = 46
                java.lang.String r1 = HJ.C15854t.o1(r1, r12, r5, r13, r5)
                int r5 = r1.length()
                if (r5 != 0) goto L_0x00eb
                goto L_0x00ef
            L_0x00eb:
                java.lang.String r4 = HJ.C15854t.P0(r1, r7)
            L_0x00ef:
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                java.lang.String r1 = r1.getName()
                r5 = 1
                boolean r1 = HJ.C15854t.b0(r1, r6, r5)
                if (r1 == 0) goto L_0x0101
                r1 = r24
                goto L_0x0103
            L_0x0101:
                r1 = r23
            L_0x0103:
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                r5.append(r1)
                r5.append(r3)
                r5.append(r4)
                java.lang.String r12 = r5.toString()
                goto L_0x011a
            L_0x0116:
                r25 = r1
                r24 = r5
            L_0x011a:
                r19 = 0
                r17 = r11
                r18 = r12
                r1 = 0
                r20 = r1
                r21 = r10
                r16.a(r17, r18, r19, r20, r21)
                r16 = r22
                r4 = r23
                r5 = r24
                r1 = r25
                goto L_0x008c
            L_0x0132:
                r25 = r1
                r23 = r4
                r24 = r5
                r1 = r16
            L_0x013a:
                boolean r4 = r2 instanceof qe.C10189b.a
                if (r4 == 0) goto L_0x0141
                jw.l$b$a r5 = jw.l.b.a.f24934a
                goto L_0x0190
            L_0x0141:
                qe.b$b r4 = qe.C10189b.C1398b.f76049a
                boolean r4 = kotlin.jvm.internal.C17542s.e(r2, r4)
                if (r4 == 0) goto L_0x014b
                r5 = 0
                goto L_0x0190
            L_0x014b:
                qe.b$c r4 = qe.C10189b.c.f76050a
                boolean r4 = kotlin.jvm.internal.C17542s.e(r2, r4)
                if (r4 == 0) goto L_0x0256
                jw.l r4 = r0.f24964s
                kw.n r4 = r4.f24924s
                r0.f24962q = r2
                r0.f24963r = r14
                r0.f24948c = r2
                r0.f24949d = r15
                r0.f24950e = r11
                r0.f24951f = r10
                r0.f24952g = r12
                r0.f24953h = r8
                r0.f24954i = r9
                r0.f24955j = r1
                r1 = 0
                r0.f24956k = r1
                r0.f24957l = r1
                r0.f24958m = r1
                r0.f24959n = r1
                r0.f24960o = r1
                r1 = 1
                r0.f24961p = r1
                java.lang.Object r1 = r4.a(r0)
                r2 = r25
                if (r1 != r2) goto L_0x0184
                return r2
            L_0x0184:
                r1 = r14
            L_0x0185:
                boolean r1 = r1.isEmpty()
                if (r1 == 0) goto L_0x018e
                jw.l$b$c r5 = jw.l.b.c.f24936a
                goto L_0x0190
            L_0x018e:
                jw.l$b$b r5 = jw.l.b.C0399b.f24935a
            L_0x0190:
                jw.l r1 = r0.f24964s
                qv.e r2 = qv.e.DEBUG
                qv.d r4 = qv.d.f102012a
                java.util.List r4 = r4.a()
                java.lang.Iterable r4 = (java.lang.Iterable) r4
                java.util.ArrayList r8 = new java.util.ArrayList
                r8.<init>()
                java.util.Iterator r4 = r4.iterator()
            L_0x01a5:
                boolean r9 = r4.hasNext()
                if (r9 == 0) goto L_0x01bd
                java.lang.Object r9 = r4.next()
                r10 = r9
                qv.b r10 = (qv.C11819b) r10
                r11 = 0
                boolean r10 = r10.b(r2, r11)
                if (r10 == 0) goto L_0x01a5
                r8.add(r9)
                goto L_0x01a5
            L_0x01bd:
                java.util.Iterator r4 = r8.iterator()
                r8 = 0
                r9 = 0
            L_0x01c3:
                boolean r10 = r4.hasNext()
                if (r10 == 0) goto L_0x0255
                java.lang.Object r10 = r4.next()
                qv.b r10 = (qv.C11819b) r10
                r12 = 0
                if (r8 != 0) goto L_0x01ef
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r11 = "MessageState on start: "
                r8.append(r11)
                r8.append(r5)
                java.lang.String r8 = r8.toString()
                java.lang.String r8 = qv.C11818a.a(r8, r12)
                if (r8 != 0) goto L_0x01eb
                goto L_0x0255
            L_0x01eb:
                java.lang.String r8 = qv.C11820c.a(r8)
            L_0x01ef:
                r14 = r8
                if (r9 != 0) goto L_0x023f
                java.lang.Class r8 = r1.getClass()
                java.lang.String r8 = r8.getName()
                kotlin.jvm.internal.C17542s.g(r8)
                r11 = 0
                r13 = 2
                r15 = 36
                java.lang.String r9 = HJ.C15854t.s1(r8, r15, r11, r13, r11)
                r15 = 46
                java.lang.String r9 = HJ.C15854t.o1(r9, r15, r11, r13, r11)
                int r16 = r9.length()
                if (r16 != 0) goto L_0x0212
                goto L_0x0216
            L_0x0212:
                java.lang.String r8 = HJ.C15854t.P0(r9, r7)
            L_0x0216:
                java.lang.Thread r9 = java.lang.Thread.currentThread()
                java.lang.String r9 = r9.getName()
                r15 = 1
                boolean r9 = HJ.C15854t.b0(r9, r6, r15)
                if (r9 == 0) goto L_0x0228
                r9 = r24
                goto L_0x022a
            L_0x0228:
                r9 = r23
            L_0x022a:
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                r11.append(r9)
                r11.append(r3)
                r11.append(r8)
                java.lang.String r8 = r11.toString()
                r16 = r8
                goto L_0x0243
            L_0x023f:
                r13 = 2
                r15 = 1
                r16 = r9
            L_0x0243:
                r11 = 0
                r8 = r10
                r9 = r2
                r10 = r16
                r17 = 0
                r18 = r13
                r13 = r14
                r8.a(r9, r10, r11, r12, r13)
                r8 = r14
                r9 = r16
                goto L_0x01c3
            L_0x0255:
                return r5
            L_0x0256:
                XH.t r1 = new XH.t
                r1.<init>()
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: jw.l.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljw/l$b;", "message", "", "hasSeen", "<anonymous>", "(Ljw/l$b;Z)Ljw/l$b;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.messaging.impl.MessageViewModel$messageState$1", f = "MessageViewModel.kt", l = {}, m = "invokeSuspend")
    static final class f extends kotlin.coroutines.jvm.internal.l implements q<b, Boolean, C17164e<? super b>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f24965c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f24966d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ boolean f24967e;

        f(C17164e<? super f> eVar) {
            super(3, eVar);
        }

        public final Object i(b bVar, boolean z10, C17164e<? super b> eVar) {
            f fVar = new f(eVar);
            fVar.f24966d = bVar;
            fVar.f24967e = z10;
            return fVar.invokeSuspend(C16807N.f139792a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return i((b) obj, ((Boolean) obj2).booleanValue(), (C17164e) obj3);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f24965c == 0) {
                y.b(obj);
                return this.f24967e ? b.c.f24936a : (b) this.f24966d;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.messaging.impl.MessageViewModel$onDestinationChanged$2", f = "MessageViewModel.kt", l = {226, 231}, m = "invokeSuspend")
    static final class g extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f24968c;

        /* renamed from: d  reason: collision with root package name */
        int f24969d;

        /* renamed from: e  reason: collision with root package name */
        private /* synthetic */ Object f24970e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ l f24971f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ v f24972g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C17642l<String, C16807N> f24973h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(l lVar, v vVar, C17642l<? super String, C16807N> lVar2, C17164e<? super g> eVar) {
            super(2, eVar);
            this.f24971f = lVar;
            this.f24972g = vVar;
            this.f24973h = lVar2;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            g gVar = new g(this.f24971f, this.f24972g, this.f24973h, eVar);
            gVar.f24970e = obj;
            return gVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((g) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:46:0x011f  */
        /* JADX WARNING: Removed duplicated region for block: B:72:0x01c5  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r26) {
            /*
                r25 = this;
                r0 = r25
                java.lang.Object r1 = eI.C17187b.f()
                int r2 = r0.f24969d
                java.lang.String r3 = "|"
                java.lang.String r4 = "b"
                java.lang.String r5 = "m"
                java.lang.String r6 = "main"
                java.lang.String r7 = "Kt"
                r9 = 36
                r10 = 0
                r11 = 1
                r12 = 2
                r13 = 0
                if (r2 == 0) goto L_0x003b
                if (r2 == r11) goto L_0x0031
                if (r2 != r12) goto L_0x0029
                java.lang.Object r1 = r0.f24970e
                QJ.Q r1 = (QJ.Q) r1
                XH.y.b(r26)
                r8 = r26
                goto L_0x0117
            L_0x0029:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x0031:
                java.lang.Object r2 = r0.f24970e
                QJ.Q r2 = (QJ.Q) r2
                XH.y.b(r26)
                r14 = r26
                goto L_0x0053
            L_0x003b:
                XH.y.b(r26)
                java.lang.Object r2 = r0.f24970e
                QJ.Q r2 = (QJ.Q) r2
                jw.l r14 = r0.f24971f
                TJ.g r14 = r14.f24928w
                r0.f24970e = r2
                r0.f24969d = r11
                java.lang.Object r14 = TJ.C16534i.B(r14, r0)
                if (r14 != r1) goto L_0x0053
                return r1
            L_0x0053:
                boolean r14 = r14 instanceof jw.l.b.a
                if (r14 == 0) goto L_0x00ff
                qv.e r1 = qv.e.DEBUG
                qv.d r14 = qv.d.f102012a
                java.util.List r14 = r14.a()
                java.lang.Iterable r14 = (java.lang.Iterable) r14
                java.util.ArrayList r15 = new java.util.ArrayList
                r15.<init>()
                java.util.Iterator r14 = r14.iterator()
            L_0x006a:
                boolean r16 = r14.hasNext()
                if (r16 == 0) goto L_0x0082
                java.lang.Object r11 = r14.next()
                r8 = r11
                qv.b r8 = (qv.C11819b) r8
                boolean r8 = r8.b(r1, r10)
                if (r8 == 0) goto L_0x0080
                r15.add(r11)
            L_0x0080:
                r11 = 1
                goto L_0x006a
            L_0x0082:
                java.util.Iterator r8 = r15.iterator()
                r10 = r13
                r11 = r10
            L_0x0088:
                boolean r14 = r8.hasNext()
                if (r14 == 0) goto L_0x00fc
                java.lang.Object r14 = r8.next()
                r15 = r14
                qv.b r15 = (qv.C11819b) r15
                r14 = 0
                if (r10 != 0) goto L_0x00a5
                java.lang.String r10 = "Alert message is present, no need to check for WhatsNew messages"
                java.lang.String r10 = qv.C11818a.a(r10, r14)
                if (r10 != 0) goto L_0x00a1
                goto L_0x00fc
            L_0x00a1:
                java.lang.String r10 = qv.C11820c.a(r10)
            L_0x00a5:
                if (r11 != 0) goto L_0x00eb
                java.lang.Class r11 = r2.getClass()
                java.lang.String r11 = r11.getName()
                kotlin.jvm.internal.C17542s.g(r11)
                java.lang.String r14 = HJ.C15854t.s1(r11, r9, r13, r12, r13)
                r9 = 46
                java.lang.String r14 = HJ.C15854t.o1(r14, r9, r13, r12, r13)
                int r9 = r14.length()
                if (r9 != 0) goto L_0x00c3
                goto L_0x00c7
            L_0x00c3:
                java.lang.String r11 = HJ.C15854t.P0(r14, r7)
            L_0x00c7:
                java.lang.Thread r9 = java.lang.Thread.currentThread()
                java.lang.String r9 = r9.getName()
                r14 = 1
                boolean r9 = HJ.C15854t.b0(r9, r6, r14)
                if (r9 == 0) goto L_0x00d8
                r9 = r5
                goto L_0x00d9
            L_0x00d8:
                r9 = r4
            L_0x00d9:
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                r14.<init>()
                r14.append(r9)
                r14.append(r3)
                r14.append(r11)
                java.lang.String r11 = r14.toString()
            L_0x00eb:
                r18 = 0
                r16 = r1
                r17 = r11
                r9 = 0
                r19 = r9
                r20 = r10
                r15.a(r16, r17, r18, r19, r20)
                r9 = 36
                goto L_0x0088
            L_0x00fc:
                XH.N r1 = XH.C16807N.f139792a
                return r1
            L_0x00ff:
                jw.l r8 = r0.f24971f
                kw.f r8 = r8.f24921p
                TJ.g r8 = r8.invoke()
                r0.f24970e = r2
                r0.f24968c = r14
                r0.f24969d = r12
                java.lang.Object r8 = TJ.C16534i.B(r8, r0)
                if (r8 != r1) goto L_0x0116
                return r1
            L_0x0116:
                r1 = r2
            L_0x0117:
                java.util.List r8 = (java.util.List) r8
                boolean r2 = r8.isEmpty()
                if (r2 == 0) goto L_0x01c5
                qv.e r2 = qv.e.DEBUG
                qv.d r8 = qv.d.f102012a
                java.util.List r8 = r8.a()
                java.lang.Iterable r8 = (java.lang.Iterable) r8
                java.util.ArrayList r9 = new java.util.ArrayList
                r9.<init>()
                java.util.Iterator r8 = r8.iterator()
            L_0x0132:
                boolean r11 = r8.hasNext()
                if (r11 == 0) goto L_0x0149
                java.lang.Object r11 = r8.next()
                r14 = r11
                qv.b r14 = (qv.C11819b) r14
                boolean r14 = r14.b(r2, r10)
                if (r14 == 0) goto L_0x0132
                r9.add(r11)
                goto L_0x0132
            L_0x0149:
                java.util.Iterator r8 = r9.iterator()
                r9 = r13
                r10 = r9
            L_0x014f:
                boolean r11 = r8.hasNext()
                if (r11 == 0) goto L_0x01c2
                java.lang.Object r11 = r8.next()
                r14 = r11
                qv.b r14 = (qv.C11819b) r14
                r11 = 0
                if (r9 != 0) goto L_0x016c
                java.lang.String r9 = "No WhatsNew messages to show"
                java.lang.String r9 = qv.C11818a.a(r9, r11)
                if (r9 != 0) goto L_0x0168
                goto L_0x01c2
            L_0x0168:
                java.lang.String r9 = qv.C11820c.a(r9)
            L_0x016c:
                if (r10 != 0) goto L_0x01b4
                java.lang.Class r10 = r1.getClass()
                java.lang.String r10 = r10.getName()
                kotlin.jvm.internal.C17542s.g(r10)
                r15 = 36
                java.lang.String r11 = HJ.C15854t.s1(r10, r15, r13, r12, r13)
                r15 = 46
                java.lang.String r11 = HJ.C15854t.o1(r11, r15, r13, r12, r13)
                int r15 = r11.length()
                if (r15 != 0) goto L_0x018c
                goto L_0x0190
            L_0x018c:
                java.lang.String r10 = HJ.C15854t.P0(r11, r7)
            L_0x0190:
                java.lang.Thread r11 = java.lang.Thread.currentThread()
                java.lang.String r11 = r11.getName()
                r15 = 1
                boolean r11 = HJ.C15854t.b0(r11, r6, r15)
                if (r11 == 0) goto L_0x01a1
                r11 = r5
                goto L_0x01a2
            L_0x01a1:
                r11 = r4
            L_0x01a2:
                java.lang.StringBuilder r15 = new java.lang.StringBuilder
                r15.<init>()
                r15.append(r11)
                r15.append(r3)
                r15.append(r10)
                java.lang.String r10 = r15.toString()
            L_0x01b4:
                r17 = 0
                r15 = r2
                r16 = r10
                r11 = 0
                r18 = r11
                r19 = r9
                r14.a(r15, r16, r17, r18, r19)
                goto L_0x014f
            L_0x01c2:
                XH.N r1 = XH.C16807N.f139792a
                return r1
            L_0x01c5:
                java.lang.Iterable r8 = (java.lang.Iterable) r8
                x4.v r2 = r0.f24972g
                nI.l<java.lang.String, XH.N> r9 = r0.f24973h
                java.util.Iterator r8 = r8.iterator()
            L_0x01cf:
                boolean r11 = r8.hasNext()
                if (r11 == 0) goto L_0x02e0
                java.lang.Object r11 = r8.next()
                kw.a r11 = (kw.a) r11
                android.net.Uri r14 = r11.b()
                boolean r14 = r2.D(r14)
                if (r14 == 0) goto L_0x02ce
                qv.e r14 = qv.e.DEBUG
                qv.d r15 = qv.d.f102012a
                java.util.List r15 = r15.a()
                java.lang.Iterable r15 = (java.lang.Iterable) r15
                java.util.ArrayList r12 = new java.util.ArrayList
                r12.<init>()
                java.util.Iterator r15 = r15.iterator()
            L_0x01f8:
                boolean r16 = r15.hasNext()
                if (r16 == 0) goto L_0x0212
                java.lang.Object r13 = r15.next()
                r0 = r13
                qv.b r0 = (qv.C11819b) r0
                boolean r0 = r0.b(r14, r10)
                if (r0 == 0) goto L_0x020e
                r12.add(r13)
            L_0x020e:
                r0 = r25
                r13 = 0
                goto L_0x01f8
            L_0x0212:
                java.util.Iterator r0 = r12.iterator()
                r12 = 0
                r13 = 0
            L_0x0218:
                boolean r15 = r0.hasNext()
                if (r15 == 0) goto L_0x0244
                java.lang.Object r15 = r0.next()
                qv.b r15 = (qv.C11819b) r15
                if (r12 != 0) goto L_0x0252
                java.lang.String r12 = r11.a()
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                r23 = r0
                java.lang.String r0 = "Destination has Contextual appLink: "
                r10.append(r0)
                r10.append(r12)
                java.lang.String r0 = r10.toString()
                r10 = 0
                java.lang.String r0 = qv.C11818a.a(r0, r10)
                if (r0 != 0) goto L_0x024d
            L_0x0244:
                r21 = r1
                r22 = r2
                r0 = 2
                r10 = 46
                goto L_0x02c6
            L_0x024d:
                java.lang.String r12 = qv.C11820c.a(r0)
                goto L_0x0254
            L_0x0252:
                r23 = r0
            L_0x0254:
                if (r13 != 0) goto L_0x02a8
                java.lang.Class r0 = r1.getClass()
                java.lang.String r0 = r0.getName()
                kotlin.jvm.internal.C17542s.g(r0)
                r21 = r1
                r22 = r2
                r1 = 0
                r10 = 36
                r13 = 2
                java.lang.String r2 = HJ.C15854t.s1(r0, r10, r1, r13, r1)
                r10 = 46
                java.lang.String r2 = HJ.C15854t.o1(r2, r10, r1, r13, r1)
                int r16 = r2.length()
                if (r16 != 0) goto L_0x027a
                goto L_0x027e
            L_0x027a:
                java.lang.String r0 = HJ.C15854t.P0(r2, r7)
            L_0x027e:
                java.lang.Thread r2 = java.lang.Thread.currentThread()
                java.lang.String r2 = r2.getName()
                r1 = 1
                boolean r2 = HJ.C15854t.b0(r2, r6, r1)
                if (r2 == 0) goto L_0x028f
                r2 = r5
                goto L_0x0290
            L_0x028f:
                r2 = r4
            L_0x0290:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r2)
                r1.append(r3)
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                r24 = r13
                r13 = r0
                r0 = r24
                goto L_0x02af
            L_0x02a8:
                r21 = r1
                r22 = r2
                r0 = 2
                r10 = 46
            L_0x02af:
                r18 = 0
                r16 = r14
                r17 = r13
                r1 = 0
                r19 = r1
                r20 = r12
                r15.a(r16, r17, r18, r19, r20)
                r1 = r21
                r2 = r22
                r0 = r23
                r10 = 0
                goto L_0x0218
            L_0x02c6:
                java.lang.String r1 = r11.a()
                r9.invoke(r1)
                goto L_0x02d5
            L_0x02ce:
                r21 = r1
                r22 = r2
                r0 = r12
                r10 = 46
            L_0x02d5:
                r12 = r0
                r1 = r21
                r2 = r22
                r10 = 0
                r13 = 0
                r0 = r25
                goto L_0x01cf
            L_0x02e0:
                XH.N r0 = XH.C16807N.f139792a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: jw.l.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public l(Ae.e eVar, kw.b bVar, h hVar, kw.f fVar, j jVar, C10188a aVar, kw.l lVar, Set<nw.a> set, n nVar) {
        C17542s.j(eVar, "analytics");
        C17542s.j(bVar, "getCommercialMessageForBannerUseCase");
        C17542s.j(hVar, "getGlobalWhatsNewMessagesUseCase");
        C17542s.j(fVar, "getContextualWhatsNewLinksUseCase");
        C17542s.j(jVar, "reportCommercialMessageDisplayed");
        C17542s.j(aVar, "alertMessageIntegration");
        C17542s.j(lVar, "updateMessageCenterDisplayCountUseCase");
        C17542s.j(set, "commercialMessageFilters");
        C17542s.j(nVar, "whatsNewMessagesForInboxUseCase");
        this.f24918m = eVar;
        this.f24919n = bVar;
        this.f24920o = hVar;
        this.f24921p = fVar;
        this.f24922q = jVar;
        this.f24923r = set;
        this.f24924s = nVar;
        lVar.a(C16877v.q(cw.e.COMMERCIAL, cw.e.WHATS_NEW));
        Boolean bool = Boolean.FALSE;
        this.f24925t = C16521S.a(bool);
        this.f24926u = C16521S.a(bool);
        C16532g<b> n10 = C16534i.n(aVar.a(), hVar.invoke(), new e(this, (C17164e<? super e>) null));
        this.f24928w = n10;
        C16505B<Boolean> a10 = C16521S.a(bool);
        this.f24929x = a10;
        this.f24930y = C16534i.n(n10, a10, new f((C17164e<? super f>) null));
    }

    private final void H() {
        Boolean value;
        C16505B<Boolean> b10 = this.f24925t;
        do {
            value = b10.getValue();
            value.booleanValue();
        } while (!b10.e(value, Boolean.TRUE));
    }

    private final void I(boolean z10) {
        Boolean value;
        C16505B<Boolean> b10 = this.f24926u;
        do {
            value = b10.getValue();
            value.booleanValue();
        } while (!b10.e(value, Boolean.valueOf(z10)));
    }

    /* access modifiers changed from: private */
    public static final boolean L(cw.b bVar) {
        C17542s.j(bVar, "message");
        return false;
    }

    private final void O(String str, String str2) {
        e.c.b(this.f24918m, Interaction$Component.COMMERCIAL_MESSAGE_BANNER, (String) null, X.m(C16796C.a("component_value", str), C16796C.a("type", str2)), (e.b) null, 10, (Object) null);
    }

    public final void F() {
        Boolean value;
        C16505B<Boolean> b10 = this.f24929x;
        do {
            value = b10.getValue();
            value.booleanValue();
        } while (!b10.e(value, Boolean.TRUE));
    }

    public final void G() {
        Boolean value;
        C16505B<Boolean> b10 = this.f24929x;
        do {
            value = b10.getValue();
            value.booleanValue();
        } while (!b10.e(value, Boolean.TRUE));
    }

    public final C16532g<b> J(C8951o oVar) {
        C17542s.j(oVar, "navController");
        return C16534i.m(C16534i.n(f24917z.a(oVar, this.f24923r), this.f24919n.invoke(), new d(this, oVar, (C17164e<? super d>) null)), this.f24925t, this.f24926u, new c(oVar, this, (C17164e<? super c>) null));
    }

    public final C16532g<b> K() {
        return this.f24930y;
    }

    public final void M(a aVar) {
        String str;
        C17542s.j(aVar, "action");
        if (aVar instanceof a.C0396a) {
            O("dismiss", ((a.C0396a) aVar).a());
            H();
        } else if (aVar instanceof a.b) {
            a.b bVar = (a.b) aVar;
            if (bVar.a()) {
                this.f24922q.a(bVar.b());
                str = "expanded";
            } else {
                str = "collapsed";
            }
            this.f24918m.o(X.m(C16796C.a("component_value", str), C16796C.a("type", bVar.c())), Interaction$Component.COMMERCIAL_MESSAGE_BANNER);
        } else if (aVar instanceof a.c) {
            O("discover_more", ((a.c) aVar).b());
        } else if (C17542s.e(aVar, a.d.f24874a)) {
            I(!this.f24926u.getValue().booleanValue());
        } else {
            throw new t();
        }
    }

    public final void N(v vVar, C17642l<? super String, C16807N> lVar) {
        v vVar2 = vVar;
        C17642l<? super String, C16807N> lVar2 = lVar;
        C17542s.j(vVar2, "destination");
        C17542s.j(lVar2, "openWhatsNew");
        qv.e eVar = qv.e.DEBUG;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        String str = null;
        String str2 = null;
        for (C11819b bVar : arrayList) {
            if (str == null) {
                String a10 = C11818a.a("Check for destinations for WhatsNew message: " + vVar2, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = l.class.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str4 = str2;
            bVar.a(eVar, str4, false, (Throwable) null, str3);
            str = str3;
            str2 = str4;
        }
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new g(this, vVar2, lVar2, (C17164e<? super g>) null), 3, (Object) null);
    }
}
