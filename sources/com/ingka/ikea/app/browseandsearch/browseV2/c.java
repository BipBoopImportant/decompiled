package com.ingka.ikea.app.browseandsearch.browseV2;

import HJ.C15854t;
import KJ.C15987c;
import Op.c1;
import QJ.F0;
import QJ.N;
import QJ.Q;
import QJ.T;
import Qr.b;
import TJ.C16505B;
import TJ.C16515L;
import TJ.C16519P;
import TJ.C16521S;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import UJ.C16619l;
import XH.C16807N;
import XH.t;
import XH.y;
import YH.C16877v;
import aA.C13909a;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import com.ingka.ikea.app.browseandsearch.browseV2.a;
import com.ingka.ikea.app.browseandsearch.browseV2.b;
import com.ingka.ikea.app.browseandsearch.browseV2.e;
import com.ingka.ikea.app.browseandsearch.browseV2.f;
import com.sugarcube.core.logger.DslKt;
import dI.C17160a;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import hn.C11370a;
import hn.C11372c;
import hn.C11373d;
import is.C11414a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import nI.p;
import nI.q;
import nn.C11661g;
import qe.C10188a;
import qe.C10189b;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import tf.C10253a;
import xf.C10390a;
import yf.g;
import yf.h;
import yf.s;

@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002Bi\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u001dH\u0002¢\u0006\u0004\b \u0010\u001fJ\u0017\u0010#\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0004¢\u0006\u0006\n\u0004\b1\u00102R \u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020504038\u0002X\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u001c\u0010;\u001a\n\u0012\u0006\u0012\u0004\u0018\u000109038\u0002X\u0004¢\u0006\u0006\n\u0004\b:\u00107R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020<038\u0002X\u0004¢\u0006\u0006\n\u0004\b=\u00107R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020?038\u0002X\u0004¢\u0006\u0006\n\u0004\b@\u00107R&\u0010D\u001a\b\u0012\u0004\u0012\u00020B038\u0006X\u0004¢\u0006\u0012\n\u0004\bC\u00107\u0012\u0004\bF\u0010\u001f\u001a\u0004\bD\u0010ER\u0016\u0010I\u001a\u00020B8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u001c\u0010L\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010J038\u0002X\u0004¢\u0006\u0006\n\u0004\bK\u00107R\"\u0010Q\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010J0M8\u0016X\u0004¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bG\u0010PR \u0010U\u001a\b\u0012\u0004\u0012\u00020R0M8\u0016X\u0004¢\u0006\f\n\u0004\bS\u0010O\u001a\u0004\bT\u0010P¨\u0006V"}, d2 = {"Lcom/ingka/ikea/app/browseandsearch/browseV2/c;", "Landroidx/lifecycle/f0;", "Lyf/h;", "Lhn/a;", "browseContentInteractor", "Lhn/d;", "recommendedContentUseCase", "LAf/a;", "browseV2UiMapper", "Lhn/c;", "browseSettingsRepository", "LMg/b;", "localHistoryRepository", "Lxf/a;", "browseAnalytics", "Lqe/a;", "alertMessageIntegration", "Lis/a;", "inboxIntegration", "LaA/a;", "sessionManager", "Ltf/a;", "killSwitch", "LQr/b;", "getKreativEntryPointModelUseCase", "LNd/c;", "abTesting", "<init>", "(Lhn/a;Lhn/d;LAf/a;Lhn/c;LMg/b;Lxf/a;Lqe/a;Lis/a;LaA/a;Ltf/a;LQr/b;LNd/c;)V", "LXH/N;", "G", "()V", "F", "Lcom/ingka/ikea/app/browseandsearch/browseV2/a;", "action", "H", "(Lcom/ingka/ikea/app/browseandsearch/browseV2/a;)V", "m", "Lhn/a;", "n", "Lhn/d;", "o", "LAf/a;", "p", "Lhn/c;", "q", "LMg/b;", "r", "Lxf/a;", "s", "LNd/c;", "LTJ/B;", "", "", "t", "LTJ/B;", "itemNosAddingToCart", "Lyf/s;", "u", "recommendations", "Lyf/g;", "v", "selectedTab", "", "w", "categoriesPerRow", "", "x", "isCategoriesExpanded", "()LTJ/B;", "isCategoriesExpanded$annotations", "y", "Z", "isLoading", "Lcom/ingka/ikea/app/browseandsearch/browseV2/f;", "z", "_uiEvent", "LTJ/P;", "A", "LTJ/P;", "()LTJ/P;", "uiEvent", "Lcom/ingka/ikea/app/browseandsearch/browseV2/b;", "B", "getState", "state", "browse-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c extends f0 implements h {

    /* renamed from: A  reason: collision with root package name */
    private final C16519P<f> f70307A;

    /* renamed from: B  reason: collision with root package name */
    private final C16519P<b> f70308B;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final C11370a f70309m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final C11373d f70310n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public final Af.a f70311o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public final C11372c f70312p;

    /* renamed from: q  reason: collision with root package name */
    private final Mg.b f70313q;

    /* renamed from: r  reason: collision with root package name */
    private final C10390a f70314r;

    /* renamed from: s  reason: collision with root package name */
    private final Nd.c f70315s;

    /* renamed from: t  reason: collision with root package name */
    private final C16505B<List<String>> f70316t;
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public final C16505B<s> f70317u;

    /* renamed from: v  reason: collision with root package name */
    private final C16505B<g> f70318v;

    /* renamed from: w  reason: collision with root package name */
    private final C16505B<Integer> f70319w;

    /* renamed from: x  reason: collision with root package name */
    private final C16505B<Boolean> f70320x;
    /* access modifiers changed from: private */

    /* renamed from: y  reason: collision with root package name */
    public boolean f70321y = true;

    /* renamed from: z  reason: collision with root package name */
    private final C16505B<f> f70322z;

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/ingka/ikea/app/browseandsearch/browseV2/c$a", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f70323a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(N.a aVar, c cVar) {
            super(aVar);
            this.f70323a = cVar;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            c cVar = this.f70323a;
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
                    String a10 = C11818a.a("Load recommendation carousel failed " + th2, (Throwable) null);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = cVar.getClass().getName();
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
            this.f70323a.f70317u.setValue(new s(false, (C11661g) null));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.browseandsearch.browseV2.BrowseViewModelV2Impl$loadRecommendationCarousel$2", f = "BrowseViewModelV2.kt", l = {148, 154}, m = "invokeSuspend")
    static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        boolean f70324c;

        /* renamed from: d  reason: collision with root package name */
        int f70325d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ c f70326e;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f70327a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @f(c = "com.ingka.ikea.app.browseandsearch.browseV2.BrowseViewModelV2Impl$loadRecommendationCarousel$2$1", f = "BrowseViewModelV2.kt", l = {155}, m = "emit")
            /* renamed from: com.ingka.ikea.app.browseandsearch.browseV2.c$b$a$a  reason: collision with other inner class name */
            static final class C1214a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                Object f70328c;

                /* renamed from: d  reason: collision with root package name */
                Object f70329d;

                /* renamed from: e  reason: collision with root package name */
                Object f70330e;

                /* renamed from: f  reason: collision with root package name */
                /* synthetic */ Object f70331f;

                /* renamed from: g  reason: collision with root package name */
                final /* synthetic */ a<T> f70332g;

                /* renamed from: h  reason: collision with root package name */
                int f70333h;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C1214a(a<? super T> aVar, C17164e<? super C1214a> eVar) {
                    super(eVar);
                    this.f70332g = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f70331f = obj;
                    this.f70333h |= Integer.MIN_VALUE;
                    return this.f70332g.emit((C11661g) null, this);
                }
            }

            a(c cVar) {
                this.f70327a = cVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x003e  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
            /* renamed from: c */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(nn.C11661g r7, dI.C17164e<? super XH.C16807N> r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof com.ingka.ikea.app.browseandsearch.browseV2.c.b.a.C1214a
                    if (r0 == 0) goto L_0x0013
                    r0 = r8
                    com.ingka.ikea.app.browseandsearch.browseV2.c$b$a$a r0 = (com.ingka.ikea.app.browseandsearch.browseV2.c.b.a.C1214a) r0
                    int r1 = r0.f70333h
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f70333h = r1
                    goto L_0x0018
                L_0x0013:
                    com.ingka.ikea.app.browseandsearch.browseV2.c$b$a$a r0 = new com.ingka.ikea.app.browseandsearch.browseV2.c$b$a$a
                    r0.<init>(r6, r8)
                L_0x0018:
                    java.lang.Object r1 = r0.f70331f
                    java.lang.Object r2 = eI.C17187b.f()
                    int r3 = r0.f70333h
                    r4 = 0
                    r5 = 1
                    if (r3 == 0) goto L_0x003e
                    if (r3 != r5) goto L_0x0036
                    java.lang.Object r7 = r0.f70330e
                    dI.e r7 = (dI.C17164e) r7
                    java.lang.Object r7 = r0.f70329d
                    nn.g r7 = (nn.C11661g) r7
                    java.lang.Object r8 = r0.f70328c
                    com.ingka.ikea.app.browseandsearch.browseV2.c$b$a r8 = (com.ingka.ikea.app.browseandsearch.browseV2.c.b.a) r8
                    XH.y.b(r1)
                    goto L_0x005c
                L_0x0036:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L_0x003e:
                    XH.y.b(r1)
                    com.ingka.ikea.app.browseandsearch.browseV2.c r1 = r6.f70327a
                    hn.c r1 = r1.f70312p
                    if (r7 == 0) goto L_0x004b
                    r3 = r5
                    goto L_0x004c
                L_0x004b:
                    r3 = r4
                L_0x004c:
                    r0.f70328c = r6
                    r0.f70329d = r7
                    r0.f70330e = r8
                    r0.f70333h = r5
                    java.lang.Object r8 = r1.d(r3, r0)
                    if (r8 != r2) goto L_0x005b
                    return r2
                L_0x005b:
                    r8 = r6
                L_0x005c:
                    com.ingka.ikea.app.browseandsearch.browseV2.c r8 = r8.f70327a
                    TJ.B r8 = r8.f70317u
                    yf.s r0 = new yf.s
                    r0.<init>(r4, r7)
                    r8.setValue(r0)
                    XH.N r7 = XH.C16807N.f139792a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.browseandsearch.browseV2.c.b.a.emit(nn.g, dI.e):java.lang.Object");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(c cVar, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f70326e = cVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f70326e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f70325d;
            if (i10 == 0) {
                y.b(obj);
                C11372c i11 = this.f70326e.f70312p;
                this.f70325d = 1;
                obj = i11.c(this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else if (i10 == 2) {
                y.b(obj);
                return C16807N.f139792a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean booleanValue = ((Boolean) obj).booleanValue();
            this.f70326e.f70317u.setValue(new s(booleanValue, (C11661g) null));
            C16532g<C11661g> a10 = this.f70326e.f70310n.a();
            a aVar = new a(this.f70326e);
            this.f70324c = booleanValue;
            this.f70325d = 2;
            if (a10.collect(aVar, this) == f10) {
                return f10;
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.browseandsearch.browseV2.BrowseViewModelV2Impl$onAction$1", f = "BrowseViewModelV2.kt", l = {176}, m = "invokeSuspend")
    /* renamed from: com.ingka.ikea.app.browseandsearch.browseV2.c$c  reason: collision with other inner class name */
    static final class C1215c extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f70334c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ c f70335d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1215c(c cVar, C17164e<? super C1215c> eVar) {
            super(2, eVar);
            this.f70335d = cVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new C1215c(this.f70335d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((C1215c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f70334c;
            if (i10 == 0) {
                y.b(obj);
                C11370a h10 = this.f70335d.f70309m;
                this.f70334c = 1;
                if (h10.b(this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.browseandsearch.browseV2.BrowseViewModelV2Impl$onAction$2", f = "BrowseViewModelV2.kt", l = {259}, m = "invokeSuspend")
    static final class d extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f70336c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ c f70337d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(c cVar, C17164e<? super d> eVar) {
            super(2, eVar);
            this.f70337d = cVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new d(this.f70337d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((d) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f70336c;
            if (i10 == 0) {
                y.b(obj);
                C11370a h10 = this.f70337d.f70309m;
                this.f70336c = 1;
                if (h10.b(this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class e implements C16532g<b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g[] f70338a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f70339b;

        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\u0010\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u0002\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "R", "", "b", "()[Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
        static final class a extends C17544u implements C17631a<Object[]> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C16532g[] f70340c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(C16532g[] gVarArr) {
                super(0);
                this.f70340c = gVarArr;
            }

            /* renamed from: b */
            public final Object[] invoke() {
                return new Object[this.f70340c.length];
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"T", "R", "LTJ/h;", "", "it", "LXH/N;", "<anonymous>", "(LTJ/h;Lkotlin/Array;)V"}, k = 3, mv = {2, 1, 0})
        @f(c = "com.ingka.ikea.app.browseandsearch.browseV2.BrowseViewModelV2Impl$special$$inlined$combine$1$3", f = "BrowseViewModelV2.kt", l = {349, 238}, m = "invokeSuspend")
        public static final class b extends l implements q<C16533h<? super b>, Object[], C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f70341c;

            /* renamed from: d  reason: collision with root package name */
            private /* synthetic */ Object f70342d;

            /* renamed from: e  reason: collision with root package name */
            /* synthetic */ Object f70343e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ c f70344f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(C17164e eVar, c cVar) {
                super(3, eVar);
                this.f70344f = cVar;
            }

            /* renamed from: i */
            public final Object invoke(C16533h<? super b> hVar, Object[] objArr, C17164e<? super C16807N> eVar) {
                b bVar = new b(eVar, this.f70344f);
                bVar.f70342d = hVar;
                bVar.f70343e = objArr;
                return bVar.invokeSuspend(C16807N.f139792a);
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: TJ.h} */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object invokeSuspend(java.lang.Object r21) {
                /*
                    r20 = this;
                    r15 = r20
                    java.lang.Object r14 = eI.C17187b.f()
                    int r0 = r15.f70341c
                    r13 = 2
                    r1 = 1
                    if (r0 == 0) goto L_0x002b
                    if (r0 == r1) goto L_0x001e
                    if (r0 != r13) goto L_0x0016
                    XH.y.b(r21)
                    r3 = r15
                    goto L_0x00cb
                L_0x0016:
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                    r0.<init>(r1)
                    throw r0
                L_0x001e:
                    java.lang.Object r0 = r15.f70342d
                    TJ.h r0 = (TJ.C16533h) r0
                    XH.y.b(r21)
                    r1 = r0
                    r15 = r14
                    r0 = r21
                    goto L_0x00bb
                L_0x002b:
                    XH.y.b(r21)
                    java.lang.Object r0 = r15.f70342d
                    r12 = r0
                    TJ.h r12 = (TJ.C16533h) r12
                    java.lang.Object r0 = r15.f70343e
                    java.lang.Object[] r0 = (java.lang.Object[]) r0
                    r2 = 0
                    r3 = r0[r2]
                    r4 = r0[r1]
                    r5 = r0[r13]
                    r6 = 3
                    r6 = r0[r6]
                    r7 = 4
                    r7 = r0[r7]
                    r8 = 5
                    r8 = r0[r8]
                    r9 = 6
                    r9 = r0[r9]
                    r10 = 7
                    r10 = r0[r10]
                    r11 = 8
                    r11 = r0[r11]
                    r16 = 9
                    r16 = r0[r16]
                    r17 = 10
                    r17 = r0[r17]
                    r18 = 11
                    r0 = r0[r18]
                    java.lang.Number r0 = (java.lang.Number) r0
                    int r18 = r0.intValue()
                    java.lang.Boolean r17 = (java.lang.Boolean) r17
                    boolean r17 = r17.booleanValue()
                    yf.g r16 = (yf.g) r16
                    java.lang.Boolean r11 = (java.lang.Boolean) r11
                    boolean r11 = r11.booleanValue()
                    Qr.b$c r10 = (Qr.b.c) r10
                    java.lang.Boolean r9 = (java.lang.Boolean) r9
                    boolean r9 = r9.booleanValue()
                    java.util.List r8 = (java.util.List) r8
                    yf.s r7 = (yf.s) r7
                    nn.c r6 = (nn.C11657c) r6
                    java.util.List r5 = (java.util.List) r5
                    Es.a r4 = (Es.a) r4
                    qe.b r3 = (qe.C10189b) r3
                    if (r6 == 0) goto L_0x008c
                    com.ingka.ikea.app.browseandsearch.browseV2.c r0 = r15.f70344f
                    r0.f70321y = r2
                L_0x008c:
                    com.ingka.ikea.app.browseandsearch.browseV2.c r0 = r15.f70344f
                    Af.a r0 = r0.f70311o
                    com.ingka.ikea.app.browseandsearch.browseV2.c r2 = r15.f70344f
                    boolean r19 = r2.f70321y
                    r15.f70342d = r12
                    r15.f70341c = r1
                    r1 = r3
                    r2 = r4
                    r3 = r5
                    r4 = r10
                    r5 = r6
                    r6 = r7
                    r7 = r8
                    r8 = r9
                    r9 = r11
                    r10 = r16
                    r11 = r17
                    r16 = r12
                    r12 = r19
                    r13 = r18
                    r15 = r14
                    r14 = r20
                    java.lang.Object r0 = r0.b(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
                    if (r0 != r15) goto L_0x00b9
                    return r15
                L_0x00b9:
                    r1 = r16
                L_0x00bb:
                    r2 = 0
                    r3 = r20
                    r4 = r15
                    r3.f70342d = r2
                    r2 = 2
                    r3.f70341c = r2
                    java.lang.Object r0 = r1.emit(r0, r3)
                    if (r0 != r4) goto L_0x00cb
                    return r4
                L_0x00cb:
                    XH.N r0 = XH.C16807N.f139792a
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.browseandsearch.browseV2.c.e.b.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public e(C16532g[] gVarArr, c cVar) {
            this.f70338a = gVarArr;
            this.f70339b = cVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            C16532g[] gVarArr = this.f70338a;
            Object a10 = C16619l.a(hVar, gVarArr, new a(gVarArr), new b((C17164e) null, this.f70339b), eVar);
            return a10 == C17187b.f() ? a10 : C16807N.f139792a;
        }
    }

    public c(C11370a aVar, C11373d dVar, Af.a aVar2, C11372c cVar, Mg.b bVar, C10390a aVar3, C10188a aVar4, C11414a aVar5, C13909a aVar6, C10253a aVar7, Qr.b bVar2, Nd.c cVar2) {
        C11370a aVar8 = aVar;
        C11373d dVar2 = dVar;
        Af.a aVar9 = aVar2;
        C11372c cVar3 = cVar;
        Mg.b bVar3 = bVar;
        C10390a aVar10 = aVar3;
        Nd.c cVar4 = cVar2;
        C17542s.j(aVar8, "browseContentInteractor");
        C17542s.j(dVar2, "recommendedContentUseCase");
        C17542s.j(aVar9, "browseV2UiMapper");
        C17542s.j(cVar3, "browseSettingsRepository");
        C17542s.j(bVar3, "localHistoryRepository");
        C17542s.j(aVar10, "browseAnalytics");
        C17542s.j(aVar4, "alertMessageIntegration");
        C17542s.j(aVar5, "inboxIntegration");
        C17542s.j(aVar6, "sessionManager");
        C17542s.j(aVar7, "killSwitch");
        C17542s.j(bVar2, "getKreativEntryPointModelUseCase");
        C17542s.j(cVar4, "abTesting");
        this.f70309m = aVar8;
        this.f70310n = dVar2;
        this.f70311o = aVar9;
        this.f70312p = cVar3;
        this.f70313q = bVar3;
        this.f70314r = aVar10;
        this.f70315s = cVar4;
        C16505B<List<String>> a10 = C16521S.a(C16877v.n());
        this.f70316t = a10;
        C16505B<s> a11 = C16521S.a(null);
        this.f70317u = a11;
        C16505B<g> a12 = C16521S.a(g.CATEGORIES);
        this.f70318v = a12;
        C16505B<Integer> a13 = C16521S.a(2);
        this.f70319w = a13;
        C16505B<Boolean> a14 = C16521S.a(Boolean.FALSE);
        this.f70320x = a14;
        C16505B<f> a15 = C16521S.a(null);
        this.f70322z = a15;
        this.f70307A = a15;
        e eVar = new e(new C16532g[]{aVar4.a(), aVar5.getState(), bVar.b(), aVar.a(), a11, a10, aVar6.n(), bVar2.a(), aVar7.x(), a12, a14, a13}, this);
        Q a16 = g0.a(this);
        C16515L a17 = ip.f.a();
        b bVar4 = r4;
        b bVar5 = new b(true, aVar7.c(), false, (C10189b) null, (Es.a) null, (C15987c) null, (b.a) null, (b.c) null, (b.d) null, false, (String) null, false, (b.c) null, 8188, (DefaultConstructorMarker) null);
        this.f70308B = C16534i.c0(eVar, a16, a17, bVar4);
        G();
        F();
    }

    private final void F() {
        this.f70315s.c(Nd.f.f62010a, true);
    }

    private final void G() {
        F0 unused = C16314k.d(g0.a(this), new a(N.f137593c0, this), (T) null, new b(this, (C17164e<? super b>) null), 2, (Object) null);
    }

    /* renamed from: H */
    public void b(a aVar) {
        C17542s.j(aVar, "action");
        if (aVar instanceof a.i) {
            this.f70322z.setValue(f.a.f70372a);
        } else if (aVar instanceof a.g) {
            F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new C1215c(this, (C17164e<? super C1215c>) null), 3, (Object) null);
            G();
        } else if (aVar instanceof a.f) {
            a.f fVar = (a.f) aVar;
            c1 a10 = fVar.a();
            if (a10 instanceof c1.a) {
                return;
            }
            if (a10 instanceof c1.e) {
                this.f70314r.h(((c1.e) fVar.a()).a(), fVar.b());
            } else if (a10 instanceof c1.b) {
                this.f70314r.e();
            }
        } else if (aVar instanceof a.h) {
            a.h hVar = (a.h) aVar;
            e a11 = hVar.a();
            if (a11 instanceof e.c) {
                this.f70314r.a(((e.c) hVar.a()).a(), ((e.c) hVar.a()).d().j());
            } else if (a11 instanceof e.k) {
                this.f70314r.g(((e.k) hVar.a()).a());
            } else if (a11 instanceof e.g) {
                this.f70314r.j(((e.g) hVar.a()).a());
            } else if (a11 instanceof e.o) {
                this.f70314r.i();
            } else if (a11 instanceof e.i) {
                this.f70314r.d();
            } else if (a11 instanceof e.j) {
                this.f70314r.c(((e.j) hVar.a()).c(), ((e.j) hVar.a()).b(), ((e.j) hVar.a()).a());
            }
        } else if (aVar instanceof a.c) {
            a.c cVar = (a.c) aVar;
            this.f70318v.setValue(cVar.a());
            this.f70314r.b(cVar.a().m());
        } else if (aVar instanceof a.d) {
            this.f70320x.setValue(Boolean.TRUE);
            this.f70314r.f(this.f70318v.getValue().m());
        } else if (aVar instanceof a.C1211a) {
            this.f70313q.c();
        } else if (aVar instanceof a.e) {
            F0 unused2 = C16314k.d(g0.a(this), (C17168i) null, (T) null, new d(this, (C17164e<? super d>) null), 3, (Object) null);
        } else if (aVar instanceof a.b) {
            this.f70319w.setValue(Integer.valueOf(((a.b) aVar).a()));
        } else {
            throw new t();
        }
    }

    public C16519P<b> getState() {
        return this.f70308B;
    }

    public C16519P<f> y() {
        return this.f70307A;
    }
}
