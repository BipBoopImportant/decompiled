package com.ingka.ikea.browseandsearch.plp.impl.composables.webview;

import QJ.Q;
import QJ.S;
import U0.C4899r0;
import U0.o1;
import XH.C16807N;
import XH.y;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import n0.C5589L;
import n0.C5591N;
import nI.C17642l;
import nI.p;
import p0.C5678A;
import p0.C5681D;
import p0.v;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J<\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\"\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\bH@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R$\u0010\u001d\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR#\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010)\u001a\u00020'8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010(R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020+0*8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010,R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020+0*8\u0002X\u0004¢\u0006\u0006\n\u0004\b.\u0010,R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020+0*8\u0002X\u0004¢\u0006\u0006\n\u0004\b0\u0010,R\u0014\u00103\u001a\u00020+8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u00102¨\u00064"}, d2 = {"Lcom/ingka/ikea/browseandsearch/plp/impl/composables/webview/e;", "Lp0/D;", "Lp0/v;", "orientation", "<init>", "(Lp0/v;)V", "Ln0/L;", "scrollPriority", "Lkotlin/Function2;", "Lp0/A;", "LdI/e;", "LXH/N;", "", "block", "f", "(Ln0/L;LnI/p;LdI/e;)Ljava/lang/Object;", "", "delta", "e", "(F)F", "a", "Lp0/v;", "Lcom/ingka/ikea/browseandsearch/plp/impl/composables/webview/ScrollableWebView;", "b", "Lcom/ingka/ikea/browseandsearch/plp/impl/composables/webview/ScrollableWebView;", "getWebView", "()Lcom/ingka/ikea/browseandsearch/plp/impl/composables/webview/ScrollableWebView;", "o", "(Lcom/ingka/ikea/browseandsearch/plp/impl/composables/webview/ScrollableWebView;)V", "webView", "Lkotlin/Function1;", "c", "LnI/l;", "m", "()LnI/l;", "onDelta", "d", "Lp0/A;", "scrollScope", "Ln0/N;", "Ln0/N;", "scrollMutex", "LU0/r0;", "", "LU0/r0;", "isScrollingState", "g", "isLastScrollForwardState", "h", "isLastScrollBackwardState", "()Z", "isScrollInProgress", "plp-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class e implements C5681D {

    /* renamed from: a  reason: collision with root package name */
    private final v f93457a;

    /* renamed from: b  reason: collision with root package name */
    private ScrollableWebView f93458b;

    /* renamed from: c  reason: collision with root package name */
    private final C17642l<Float, Float> f93459c = new d(this);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final C5678A f93460d = new b(this);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final C5591N f93461e = new C5591N();
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final C4899r0<Boolean> f93462f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final C4899r0<Boolean> f93463g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final C4899r0<Boolean> f93464h;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.browseandsearch.plp.impl.composables.webview.WebViewScrollableState$scroll$2", f = "ScrollableWebView.kt", l = {137}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f93465c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ e f93466d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C5589L f93467e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ p<C5678A, C17164e<? super C16807N>, Object> f93468f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lp0/A;", "LXH/N;", "<anonymous>", "(Lp0/A;)V"}, k = 3, mv = {2, 1, 0})
        @f(c = "com.ingka.ikea.browseandsearch.plp.impl.composables.webview.WebViewScrollableState$scroll$2$1", f = "ScrollableWebView.kt", l = {140}, m = "invokeSuspend")
        /* renamed from: com.ingka.ikea.browseandsearch.plp.impl.composables.webview.e$a$a  reason: collision with other inner class name */
        static final class C2081a extends l implements p<C5678A, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f93469c;

            /* renamed from: d  reason: collision with root package name */
            private /* synthetic */ Object f93470d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ e f93471e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ p<C5678A, C17164e<? super C16807N>, Object> f93472f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2081a(e eVar, p<? super C5678A, ? super C17164e<? super C16807N>, ? extends Object> pVar, C17164e<? super C2081a> eVar2) {
                super(2, eVar2);
                this.f93471e = eVar;
                this.f93472f = pVar;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                C2081a aVar = new C2081a(this.f93471e, this.f93472f, eVar);
                aVar.f93470d = obj;
                return aVar;
            }

            /* renamed from: i */
            public final Object invoke(C5678A a10, C17164e<? super C16807N> eVar) {
                return ((C2081a) create(a10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f93469c;
                if (i10 == 0) {
                    y.b(obj);
                    C5678A a10 = (C5678A) this.f93470d;
                    this.f93471e.f93462f.setValue(kotlin.coroutines.jvm.internal.b.a(true));
                    p<C5678A, C17164e<? super C16807N>, Object> pVar = this.f93472f;
                    this.f93470d = a10;
                    this.f93469c = 1;
                    if (pVar.invoke(a10, this) == f10) {
                        return f10;
                    }
                } else if (i10 == 1) {
                    C5678A a11 = (C5678A) this.f93470d;
                    try {
                        y.b(obj);
                    } catch (Throwable th2) {
                        this.f93471e.f93462f.setValue(kotlin.coroutines.jvm.internal.b.a(false));
                        throw th2;
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                this.f93471e.f93462f.setValue(kotlin.coroutines.jvm.internal.b.a(false));
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(e eVar, C5589L l10, p<? super C5678A, ? super C17164e<? super C16807N>, ? extends Object> pVar, C17164e<? super a> eVar2) {
            super(2, eVar2);
            this.f93466d = eVar;
            this.f93467e = l10;
            this.f93468f = pVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f93466d, this.f93467e, this.f93468f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f93465c;
            if (i10 == 0) {
                y.b(obj);
                C5591N h10 = this.f93466d.f93461e;
                C5678A i11 = this.f93466d.f93460d;
                C5589L l10 = this.f93467e;
                C2081a aVar = new C2081a(this.f93466d, this.f93468f, (C17164e<? super C2081a>) null);
                this.f93465c = 1;
                if (h10.f(i11, l10, aVar, this) == f10) {
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

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/ingka/ikea/browseandsearch/plp/impl/composables/webview/e$b", "Lp0/A;", "", "pixels", "a", "(F)F", "plp-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements C5678A {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f93473a;

        b(e eVar) {
            this.f93473a = eVar;
        }

        public float a(float f10) {
            if (Float.isNaN(f10)) {
                return 0.0f;
            }
            float floatValue = this.f93473a.m().invoke(Float.valueOf(f10)).floatValue();
            boolean z10 = false;
            this.f93473a.f93463g.setValue(Boolean.valueOf(floatValue > 0.0f));
            C4899r0 j10 = this.f93473a.f93464h;
            if (floatValue < 0.0f) {
                z10 = true;
            }
            j10.setValue(Boolean.valueOf(z10));
            return floatValue;
        }
    }

    public e(v vVar) {
        C17542s.j(vVar, "orientation");
        this.f93457a = vVar;
        Boolean bool = Boolean.FALSE;
        this.f93462f = u1.e(bool, (o1) null, 2, (Object) null);
        this.f93463g = u1.e(bool, (o1) null, 2, (Object) null);
        this.f93464h = u1.e(bool, (o1) null, 2, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final float n(e eVar, float f10) {
        ScrollableWebView scrollableWebView = eVar.f93458b;
        if (scrollableWebView == null) {
            return 0.0f;
        }
        if (eVar.f93457a == v.Vertical) {
            int contentHeight = scrollableWebView.getContentHeight() - scrollableWebView.getHeight();
            if (((float) scrollableWebView.getScrollY()) + f10 < 0.0f) {
                f10 = Math.max(-((float) scrollableWebView.getScrollY()), f10);
            } else if (((float) scrollableWebView.getScrollY()) + f10 > ((float) contentHeight)) {
                f10 = Math.max(0.0f, (float) (contentHeight - scrollableWebView.getScrollY()));
            }
            scrollableWebView.scrollBy(0, (int) f10);
        } else {
            int a10 = scrollableWebView.a() - scrollableWebView.getWidth();
            if (((float) scrollableWebView.getScrollX()) + f10 < 0.0f) {
                f10 = Math.max(-((float) scrollableWebView.getScrollX()), f10);
            } else if (((float) scrollableWebView.getScrollX()) + f10 > ((float) a10)) {
                f10 = Math.max(0.0f, (float) (a10 - scrollableWebView.getScrollX()));
            }
            scrollableWebView.scrollBy((int) f10, 0);
        }
        return f10;
    }

    public boolean b() {
        return this.f93462f.getValue().booleanValue();
    }

    public float e(float f10) {
        return this.f93459c.invoke(Float.valueOf(f10)).floatValue();
    }

    public Object f(C5589L l10, p<? super C5678A, ? super C17164e<? super C16807N>, ? extends Object> pVar, C17164e<? super C16807N> eVar) {
        Object f10 = S.f(new a(this, l10, pVar, (C17164e<? super a>) null), eVar);
        return f10 == C17187b.f() ? f10 : C16807N.f139792a;
    }

    public final C17642l<Float, Float> m() {
        return this.f93459c;
    }

    public final void o(ScrollableWebView scrollableWebView) {
        this.f93458b = scrollableWebView;
    }
}
