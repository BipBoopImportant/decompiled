package Qk;

import HJ.C15854t;
import QJ.F0;
import QJ.N;
import QJ.Q;
import QJ.T;
import Qk.f;
import TJ.C16505B;
import TJ.C16521S;
import TJ.C16532g;
import TJ.C16534i;
import XH.C16807N;
import XH.x;
import XH.y;
import android.net.Uri;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import com.sugarcube.core.logger.DslKt;
import dI.C17160a;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import eq.C11257a;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import nI.p;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import uq.C12078d;
import uq.g;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B?\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H@¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0013H@¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H@¢\u0006\u0004\b\u0019\u0010\u0015J\u0018\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H@¢\u0006\u0004\b\u001a\u0010\u0015J\u001e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00110\u001b2\u0006\u0010\u0012\u001a\u00020\u0011H@¢\u0006\u0004\b\u001c\u0010\u0015J5\u0010#\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u00132\u001c\u0010\"\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f\u0012\u0006\u0012\u0004\u0018\u00010!0\u001eH\u0002¢\u0006\u0004\b#\u0010$J\u0015\u0010%\u001a\u00020 2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020\u0013038\u0002X\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u001d\u0010<\u001a\b\u0012\u0004\u0012\u00020\u0013078\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;¨\u0006="}, d2 = {"LQk/a;", "Landroidx/lifecycle/f0;", "LPk/c;", "requireFTEUseCase", "", "LZl/a;", "appLinkMappers", "Leq/b;", "resolveDynamicLinkUseCase", "LSk/c;", "isKillSwitchValidUseCase", "LTl/c;", "resolveLinkItUseCase", "Luq/d;", "episodAnalytics", "<init>", "(LPk/c;Ljava/util/Set;Leq/b;LSk/c;LTl/c;Luq/d;)V", "Landroid/net/Uri;", "uri", "LQk/f;", "K", "(Landroid/net/Uri;LdI/e;)Ljava/lang/Object;", "fallbackState", "O", "(Landroid/net/Uri;LQk/f;LdI/e;)Ljava/lang/Object;", "N", "M", "LXH/x;", "L", "fallback", "Lkotlin/Function1;", "LdI/e;", "LXH/N;", "", "block", "J", "(LQk/f;LnI/l;)V", "I", "(Landroid/net/Uri;)V", "m", "LPk/c;", "n", "Ljava/util/Set;", "o", "Leq/b;", "p", "LSk/c;", "q", "LTl/c;", "r", "Luq/d;", "LTJ/B;", "s", "LTJ/B;", "_appLinkState", "LTJ/g;", "t", "LTJ/g;", "H", "()LTJ/g;", "appLinkState", "splash_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a extends f0 {
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final Pk.c f85887m;

    /* renamed from: n  reason: collision with root package name */
    private final Set<Zl.a> f85888n;

    /* renamed from: o  reason: collision with root package name */
    private final eq.b f85889o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public final Sk.c f85890p;

    /* renamed from: q  reason: collision with root package name */
    private final Tl.c f85891q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public final C12078d f85892r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public final C16505B<f> f85893s;

    /* renamed from: t  reason: collision with root package name */
    private final C16532g<f> f85894t;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LQk/f;", "it", "LXH/N;", "<anonymous>", "(LQk/f;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.splash.viewmodel.applink.AppLinkViewModel$appLinkState$1", f = "AppLinkViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: Qk.a$a  reason: collision with other inner class name */
    static final class C1757a extends l implements p<f, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f85895c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f85896d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ a f85897e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1757a(a aVar, C17164e<? super C1757a> eVar) {
            super(2, eVar);
            this.f85897e = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            C1757a aVar = new C1757a(this.f85897e, eVar);
            aVar.f85896d = obj;
            return aVar;
        }

        /* renamed from: i */
        public final Object invoke(f fVar, C17164e<? super C16807N> eVar) {
            return ((C1757a) create(fVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f85895c == 0) {
                y.b(obj);
                f fVar = (f) this.f85896d;
                a aVar = this.f85897e;
                qv.e eVar = qv.e.DEBUG;
                ArrayList<C11819b> arrayList = new ArrayList<>();
                for (Object next : qv.d.f102012a.a()) {
                    if (((C11819b) next).b(eVar, true)) {
                        arrayList.add(next);
                    }
                }
                String str = null;
                String str2 = null;
                for (C11819b bVar : arrayList) {
                    if (str == null) {
                        String a10 = C11818a.a("AppLinkViewModel emitting state: " + fVar, (Throwable) null);
                        if (a10 == null) {
                            break;
                        }
                        str = C11820c.a(a10);
                    }
                    String str3 = str;
                    if (str2 == null) {
                        String name = aVar.getClass().getName();
                        C17542s.g(name);
                        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o12.length() != 0) {
                            name = C15854t.P0(o12, "Kt");
                        }
                        str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                    }
                    String str4 = str2;
                    bVar.a(eVar, str4, true, (Throwable) null, str3);
                    str = str3;
                    str2 = str4;
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "<anonymous>", "()V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.splash.viewmodel.applink.AppLinkViewModel$handleUri$1", f = "AppLinkViewModel.kt", l = {56, 57}, m = "invokeSuspend")
    static final class b extends l implements C17642l<C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f85898c;

        /* renamed from: d  reason: collision with root package name */
        int f85899d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ a f85900e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Uri f85901f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar, Uri uri, C17164e<? super b> eVar) {
            super(1, eVar);
            this.f85900e = aVar;
            this.f85901f = uri;
        }

        public final C17164e<C16807N> create(C17164e<?> eVar) {
            return new b(this.f85900e, this.f85901f, eVar);
        }

        /* renamed from: i */
        public final Object invoke(C17164e<? super C16807N> eVar) {
            return ((b) create(eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            C16505B j10;
            Object value;
            String str;
            Object f10 = C17187b.f();
            int i10 = this.f85899d;
            if (i10 == 0) {
                y.b(obj);
                C12078d h10 = this.f85900e.f85892r;
                String uri = this.f85901f.toString();
                C17542s.i(uri, "toString(...)");
                h10.a(new g.c(uri));
                Sk.c k10 = this.f85900e.f85890p;
                this.f85898c = uri;
                this.f85899d = 1;
                obj = k10.a(this);
                if (obj == f10) {
                    return f10;
                }
                str = uri;
            } else if (i10 == 1) {
                str = (String) this.f85898c;
                y.b(obj);
            } else if (i10 == 2) {
                String str2 = (String) this.f85898c;
                y.b(obj);
                obj2 = (f) obj;
                j10 = this.f85900e.f85893s;
                do {
                    value = j10.getValue();
                    f fVar = (f) value;
                } while (!j10.e(value, obj2));
                return C16807N.f139792a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (((Boolean) obj).booleanValue()) {
                a aVar = this.f85900e;
                Uri uri2 = this.f85901f;
                this.f85898c = str;
                this.f85899d = 2;
                obj = aVar.K(uri2, this);
                if (obj == f10) {
                    return f10;
                }
                obj2 = (f) obj;
                j10 = this.f85900e.f85893s;
                do {
                    value = j10.getValue();
                    f fVar2 = (f) value;
                } while (!j10.e(value, obj2));
                return C16807N.f139792a;
            }
            obj2 = new f.a(this.f85901f);
            j10 = this.f85900e.f85893s;
            do {
                value = j10.getValue();
                f fVar22 = (f) value;
            } while (!j10.e(value, obj2));
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Qk/a$c", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f85902a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f f85903b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(N.a aVar, a aVar2, f fVar) {
            super(aVar);
            this.f85902a = aVar2;
            this.f85903b = fVar;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            Object value;
            a aVar = this.f85902a;
            qv.e eVar = qv.e.WARN;
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
                    String a10 = C11818a.a("Failed to resolve link - falling back to: " + this.f85903b, th2);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = aVar.getClass().getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, th2, str3);
                str = str3;
                str2 = str4;
            }
            C16505B j10 = this.f85902a.f85893s;
            do {
                value = j10.getValue();
                f fVar = (f) value;
            } while (!j10.e(value, this.f85903b));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.splash.viewmodel.applink.AppLinkViewModel$launch$2", f = "AppLinkViewModel.kt", l = {172}, m = "invokeSuspend")
    static final class d extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f85904c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17642l<C17164e<? super C16807N>, Object> f85905d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C17642l<? super C17164e<? super C16807N>, ? extends Object> lVar, C17164e<? super d> eVar) {
            super(2, eVar);
            this.f85905d = lVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new d(this.f85905d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((d) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f85904c;
            if (i10 == 0) {
                y.b(obj);
                C17642l<C17164e<? super C16807N>, Object> lVar = this.f85905d;
                this.f85904c = 1;
                if (lVar.invoke(this) == f10) {
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.splash.viewmodel.applink.AppLinkViewModel", f = "AppLinkViewModel.kt", l = {148}, m = "resolveDynamicLink-gIAlu-s")
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f85906c;

        /* renamed from: d  reason: collision with root package name */
        Object f85907d;

        /* renamed from: e  reason: collision with root package name */
        Object f85908e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f85909f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ a f85910g;

        /* renamed from: h  reason: collision with root package name */
        int f85911h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(a aVar, C17164e<? super e> eVar) {
            super(eVar);
            this.f85910g = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f85909f = obj;
            this.f85911h |= Integer.MIN_VALUE;
            Object D10 = this.f85910g.L((Uri) null, this);
            return D10 == C17187b.f() ? D10 : x.a(D10);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.splash.viewmodel.applink.AppLinkViewModel", f = "AppLinkViewModel.kt", l = {127, 130}, m = "resolveFirebaseDynamicLinkUri")
    static final class f extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f85912c;

        /* renamed from: d  reason: collision with root package name */
        Object f85913d;

        /* renamed from: e  reason: collision with root package name */
        Object f85914e;

        /* renamed from: f  reason: collision with root package name */
        Object f85915f;

        /* renamed from: g  reason: collision with root package name */
        Object f85916g;

        /* renamed from: h  reason: collision with root package name */
        int f85917h;

        /* renamed from: i  reason: collision with root package name */
        /* synthetic */ Object f85918i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ a f85919j;

        /* renamed from: k  reason: collision with root package name */
        int f85920k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(a aVar, C17164e<? super f> eVar) {
            super(eVar);
            this.f85919j = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f85918i = obj;
            this.f85920k |= Integer.MIN_VALUE;
            return this.f85919j.M((Uri) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.splash.viewmodel.applink.AppLinkViewModel", f = "AppLinkViewModel.kt", l = {109, 111}, m = "resolveLinkIt")
    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f85921c;

        /* renamed from: d  reason: collision with root package name */
        Object f85922d;

        /* renamed from: e  reason: collision with root package name */
        Object f85923e;

        /* renamed from: f  reason: collision with root package name */
        Object f85924f;

        /* renamed from: g  reason: collision with root package name */
        Object f85925g;

        /* renamed from: h  reason: collision with root package name */
        int f85926h;

        /* renamed from: i  reason: collision with root package name */
        /* synthetic */ Object f85927i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ a f85928j;

        /* renamed from: k  reason: collision with root package name */
        int f85929k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(a aVar, C17164e<? super g> eVar) {
            super(eVar);
            this.f85928j = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f85927i = obj;
            this.f85929k |= Integer.MIN_VALUE;
            return this.f85928j.N((Uri) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.splash.viewmodel.applink.AppLinkViewModel", f = "AppLinkViewModel.kt", l = {80}, m = "resolveWithMappers")
    static final class h extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f85930c;

        /* renamed from: d  reason: collision with root package name */
        Object f85931d;

        /* renamed from: e  reason: collision with root package name */
        Object f85932e;

        /* renamed from: f  reason: collision with root package name */
        Object f85933f;

        /* renamed from: g  reason: collision with root package name */
        Object f85934g;

        /* renamed from: h  reason: collision with root package name */
        Object f85935h;

        /* renamed from: i  reason: collision with root package name */
        Object f85936i;

        /* renamed from: j  reason: collision with root package name */
        int f85937j;

        /* renamed from: k  reason: collision with root package name */
        int f85938k;

        /* renamed from: l  reason: collision with root package name */
        /* synthetic */ Object f85939l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ a f85940m;

        /* renamed from: n  reason: collision with root package name */
        int f85941n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(a aVar, C17164e<? super h> eVar) {
            super(eVar);
            this.f85940m = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f85939l = obj;
            this.f85941n |= Integer.MIN_VALUE;
            return this.f85940m.O((Uri) null, (f) null, this);
        }
    }

    public a(Pk.c cVar, Set<Zl.a> set, eq.b bVar, Sk.c cVar2, Tl.c cVar3, C12078d dVar) {
        C17542s.j(cVar, "requireFTEUseCase");
        C17542s.j(set, "appLinkMappers");
        C17542s.j(bVar, "resolveDynamicLinkUseCase");
        C17542s.j(cVar2, "isKillSwitchValidUseCase");
        C17542s.j(cVar3, "resolveLinkItUseCase");
        C17542s.j(dVar, "episodAnalytics");
        this.f85887m = cVar;
        this.f85888n = set;
        this.f85889o = bVar;
        this.f85890p = cVar2;
        this.f85891q = cVar3;
        this.f85892r = dVar;
        C16505B<f> a10 = C16521S.a(f.e.f85951a);
        this.f85893s = a10;
        this.f85894t = C16534i.R(C16534i.c(a10), new C1757a(this, (C17164e<? super C1757a>) null));
    }

    private final void J(f fVar, C17642l<? super C17164e<? super C16807N>, ? extends Object> lVar) {
        F0 unused = C16314k.d(g0.a(this), new c(N.f137593c0, this, fVar), (T) null, new d(lVar, (C17164e<? super d>) null), 2, (Object) null);
    }

    /* access modifiers changed from: private */
    public final Object K(Uri uri, C17164e<? super f> eVar) {
        return C11257a.b(uri) ? M(uri, eVar) : Tl.a.a(uri) ? N(uri, eVar) : O(uri, new f.c(uri), eVar);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object L(android.net.Uri r6, dI.C17164e<? super XH.x<? extends android.net.Uri>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof Qk.a.e
            if (r0 == 0) goto L_0x0013
            r0 = r7
            Qk.a$e r0 = (Qk.a.e) r0
            int r1 = r0.f85911h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f85911h = r1
            goto L_0x0018
        L_0x0013:
            Qk.a$e r0 = new Qk.a$e
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r1 = r0.f85909f
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f85911h
            r4 = 1
            if (r3 == 0) goto L_0x003d
            if (r3 != r4) goto L_0x0035
            java.lang.Object r6 = r0.f85908e
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f85907d
            android.net.Uri r6 = (android.net.Uri) r6
            java.lang.Object r7 = r0.f85906c
            Qk.a r7 = (Qk.a) r7
            XH.y.b(r1)
            goto L_0x0051
        L_0x0035:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003d:
            XH.y.b(r1)
            eq.b r1 = r5.f85889o
            r0.f85906c = r5
            r0.f85907d = r6
            r0.f85908e = r7
            r0.f85911h = r4
            java.lang.Object r1 = r1.a(r6, r0)
            if (r1 != r2) goto L_0x0051
            return r2
        L_0x0051:
            eq.b$a r1 = (eq.b.a) r1
            boolean r7 = r1 instanceof eq.b.a.c
            if (r7 == 0) goto L_0x0078
            XH.x$a r7 = XH.x.f139812b
            Qk.g r7 = new Qk.g
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unsupported version for dynamicLink: "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r7.<init>(r6)
            java.lang.Object r6 = XH.y.a(r7)
            java.lang.Object r6 = XH.x.b(r6)
            goto L_0x00ad
        L_0x0078:
            boolean r7 = r1 instanceof eq.b.a.C2158a
            if (r7 == 0) goto L_0x0089
            XH.x$a r6 = XH.x.f139812b
            eq.b$a$a r1 = (eq.b.a.C2158a) r1
            android.net.Uri r6 = r1.a()
            java.lang.Object r6 = XH.x.b(r6)
            goto L_0x00ad
        L_0x0089:
            boolean r7 = r1 instanceof eq.b.a.C2159b
            if (r7 == 0) goto L_0x00ae
            XH.x$a r7 = XH.x.f139812b
            Qk.e r7 = new Qk.e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "No link found for dynamicLink: "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r7.<init>(r6)
            java.lang.Object r6 = XH.y.a(r7)
            java.lang.Object r6 = XH.x.b(r6)
        L_0x00ad:
            return r6
        L_0x00ae:
            XH.t r6 = new XH.t
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Qk.a.L(android.net.Uri, dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object M(android.net.Uri r19, dI.C17164e<? super Qk.f> r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            boolean r3 = r2 instanceof Qk.a.f
            if (r3 == 0) goto L_0x0019
            r3 = r2
            Qk.a$f r3 = (Qk.a.f) r3
            int r4 = r3.f85920k
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.f85920k = r4
            goto L_0x001e
        L_0x0019:
            Qk.a$f r3 = new Qk.a$f
            r3.<init>(r0, r2)
        L_0x001e:
            java.lang.Object r4 = r3.f85918i
            java.lang.Object r5 = eI.C17187b.f()
            int r6 = r3.f85920k
            r7 = 1
            r8 = 2
            if (r6 == 0) goto L_0x0065
            if (r6 == r7) goto L_0x004a
            if (r6 != r8) goto L_0x0042
            java.lang.Object r1 = r3.f85916g
            android.net.Uri r1 = (android.net.Uri) r1
            java.lang.Object r1 = r3.f85914e
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r1 = r3.f85913d
            android.net.Uri r1 = (android.net.Uri) r1
            java.lang.Object r1 = r3.f85912c
            Qk.a r1 = (Qk.a) r1
            XH.y.b(r4)
            goto L_0x00a0
        L_0x0042:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x004a:
            java.lang.Object r1 = r3.f85914e
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r2 = r3.f85913d
            android.net.Uri r2 = (android.net.Uri) r2
            java.lang.Object r6 = r3.f85912c
            Qk.a r6 = (Qk.a) r6
            XH.y.b(r4)
            XH.x r4 = (XH.x) r4
            java.lang.Object r4 = r4.j()
            r17 = r2
            r2 = r1
            r1 = r17
            goto L_0x0078
        L_0x0065:
            XH.y.b(r4)
            r3.f85912c = r0
            r3.f85913d = r1
            r3.f85914e = r2
            r3.f85920k = r7
            java.lang.Object r4 = r0.L(r1, r3)
            if (r4 != r5) goto L_0x0077
            return r5
        L_0x0077:
            r6 = r0
        L_0x0078:
            java.lang.Throwable r15 = XH.x.e(r4)
            r9 = 0
            if (r15 != 0) goto L_0x00a4
            r7 = r4
            android.net.Uri r7 = (android.net.Uri) r7
            android.net.Uri r10 = eq.C11257a.a(r7)
            Qk.f$c r11 = new Qk.f$c
            r11.<init>(r1)
            r3.f85912c = r6
            r3.f85913d = r1
            r3.f85914e = r2
            r3.f85915f = r4
            r3.f85916g = r7
            r3.f85917h = r9
            r3.f85920k = r8
            java.lang.Object r4 = r6.O(r10, r11, r3)
            if (r4 != r5) goto L_0x00a0
            return r5
        L_0x00a0:
            Qk.f r4 = (Qk.f) r4
            goto L_0x017d
        L_0x00a4:
            qv.e r2 = qv.e.WARN
            qv.d r3 = qv.d.f102012a
            java.util.List r3 = r3.a()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x00b7:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x00ce
            java.lang.Object r5 = r3.next()
            r10 = r5
            qv.b r10 = (qv.C11819b) r10
            boolean r10 = r10.b(r2, r9)
            if (r10 == 0) goto L_0x00b7
            r4.add(r5)
            goto L_0x00b7
        L_0x00ce:
            java.util.Iterator r3 = r4.iterator()
            r4 = 0
            r5 = r4
            r9 = r5
        L_0x00d5:
            boolean r10 = r3.hasNext()
            if (r10 == 0) goto L_0x0162
            java.lang.Object r10 = r3.next()
            qv.b r10 = (qv.C11819b) r10
            if (r5 != 0) goto L_0x0103
            java.lang.String r5 = r15.getMessage()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "Failed to resolve dynamic link - falling back to: "
            r11.append(r12)
            r11.append(r5)
            java.lang.String r5 = r11.toString()
            java.lang.String r5 = qv.C11818a.a(r5, r15)
            if (r5 != 0) goto L_0x00ff
            goto L_0x0162
        L_0x00ff:
            java.lang.String r5 = qv.C11820c.a(r5)
        L_0x0103:
            if (r9 != 0) goto L_0x0152
            java.lang.Class r9 = r6.getClass()
            java.lang.String r9 = r9.getName()
            kotlin.jvm.internal.C17542s.g(r9)
            r11 = 36
            java.lang.String r11 = HJ.C15854t.s1(r9, r11, r4, r8, r4)
            r12 = 46
            java.lang.String r11 = HJ.C15854t.o1(r11, r12, r4, r8, r4)
            int r12 = r11.length()
            if (r12 != 0) goto L_0x0123
            goto L_0x0129
        L_0x0123:
            java.lang.String r9 = "Kt"
            java.lang.String r9 = HJ.C15854t.P0(r11, r9)
        L_0x0129:
            java.lang.Thread r11 = java.lang.Thread.currentThread()
            java.lang.String r11 = r11.getName()
            java.lang.String r12 = "main"
            boolean r11 = HJ.C15854t.b0(r11, r12, r7)
            if (r11 == 0) goto L_0x013c
            java.lang.String r11 = "m"
            goto L_0x013e
        L_0x013c:
            java.lang.String r11 = "b"
        L_0x013e:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r11)
            java.lang.String r11 = "|"
            r12.append(r11)
            r12.append(r9)
            java.lang.String r9 = r12.toString()
        L_0x0152:
            r16 = r9
            r12 = 0
            r9 = r10
            r10 = r2
            r11 = r16
            r13 = r15
            r14 = r5
            r9.a(r10, r11, r12, r13, r14)
            r9 = r16
            goto L_0x00d5
        L_0x0162:
            boolean r2 = r15 instanceof Qk.e
            if (r2 == 0) goto L_0x016d
            Qk.f$f r2 = new Qk.f$f
            r2.<init>(r1)
        L_0x016b:
            r4 = r2
            goto L_0x017d
        L_0x016d:
            boolean r2 = r15 instanceof Qk.g
            if (r2 == 0) goto L_0x0177
            Qk.f$c r2 = new Qk.f$c
            r2.<init>(r1)
            goto L_0x016b
        L_0x0177:
            Qk.f$f r2 = new Qk.f$f
            r2.<init>(r1)
            goto L_0x016b
        L_0x017d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: Qk.a.M(android.net.Uri, dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object N(android.net.Uri r19, dI.C17164e<? super Qk.f> r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            boolean r3 = r2 instanceof Qk.a.g
            if (r3 == 0) goto L_0x0019
            r3 = r2
            Qk.a$g r3 = (Qk.a.g) r3
            int r4 = r3.f85929k
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.f85929k = r4
            goto L_0x001e
        L_0x0019:
            Qk.a$g r3 = new Qk.a$g
            r3.<init>(r0, r2)
        L_0x001e:
            java.lang.Object r4 = r3.f85927i
            java.lang.Object r5 = eI.C17187b.f()
            int r6 = r3.f85929k
            r7 = 2
            r8 = 1
            if (r6 == 0) goto L_0x0065
            if (r6 == r8) goto L_0x004a
            if (r6 != r7) goto L_0x0042
            java.lang.Object r1 = r3.f85925g
            Tl.b r1 = (Tl.b) r1
            java.lang.Object r1 = r3.f85923e
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r1 = r3.f85922d
            android.net.Uri r1 = (android.net.Uri) r1
            java.lang.Object r1 = r3.f85921c
            Qk.a r1 = (Qk.a) r1
            XH.y.b(r4)
            goto L_0x00a6
        L_0x0042:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x004a:
            java.lang.Object r1 = r3.f85923e
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r2 = r3.f85922d
            android.net.Uri r2 = (android.net.Uri) r2
            java.lang.Object r6 = r3.f85921c
            Qk.a r6 = (Qk.a) r6
            XH.y.b(r4)
            XH.x r4 = (XH.x) r4
            java.lang.Object r4 = r4.j()
            r17 = r2
            r2 = r1
            r1 = r17
            goto L_0x007a
        L_0x0065:
            XH.y.b(r4)
            Tl.c r4 = r0.f85891q
            r3.f85921c = r0
            r3.f85922d = r1
            r3.f85923e = r2
            r3.f85929k = r8
            java.lang.Object r4 = r4.a(r1, r3)
            if (r4 != r5) goto L_0x0079
            return r5
        L_0x0079:
            r6 = r0
        L_0x007a:
            java.lang.Throwable r15 = XH.x.e(r4)
            if (r15 != 0) goto L_0x00aa
            r8 = r4
            Tl.b r8 = (Tl.b) r8
            android.net.Uri r9 = r8.a()
            Qk.f$c r10 = new Qk.f$c
            android.net.Uri r11 = r8.b()
            r10.<init>(r11)
            r3.f85921c = r6
            r3.f85922d = r1
            r3.f85923e = r2
            r3.f85924f = r4
            r3.f85925g = r8
            r1 = 0
            r3.f85926h = r1
            r3.f85929k = r7
            java.lang.Object r4 = r6.O(r9, r10, r3)
            if (r4 != r5) goto L_0x00a6
            return r5
        L_0x00a6:
            Qk.f r4 = (Qk.f) r4
            goto L_0x015f
        L_0x00aa:
            qv.e r2 = qv.e.ERROR
            qv.d r3 = qv.d.f102012a
            java.util.List r3 = r3.a()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x00bd:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x00d4
            java.lang.Object r5 = r3.next()
            r9 = r5
            qv.b r9 = (qv.C11819b) r9
            boolean r9 = r9.b(r2, r8)
            if (r9 == 0) goto L_0x00bd
            r4.add(r5)
            goto L_0x00bd
        L_0x00d4:
            java.util.Iterator r3 = r4.iterator()
            r4 = 0
            r5 = r4
            r9 = r5
        L_0x00db:
            boolean r10 = r3.hasNext()
            if (r10 == 0) goto L_0x015a
            java.lang.Object r10 = r3.next()
            qv.b r10 = (qv.C11819b) r10
            if (r5 != 0) goto L_0x00fc
            java.lang.String r5 = r15.getMessage()
            if (r5 != 0) goto L_0x00f1
            java.lang.String r5 = "Failed to resolve LinkIt link"
        L_0x00f1:
            java.lang.String r5 = qv.C11818a.a(r5, r15)
            if (r5 != 0) goto L_0x00f8
            goto L_0x015a
        L_0x00f8:
            java.lang.String r5 = qv.C11820c.a(r5)
        L_0x00fc:
            if (r9 != 0) goto L_0x014b
            java.lang.Class r9 = r6.getClass()
            java.lang.String r9 = r9.getName()
            kotlin.jvm.internal.C17542s.g(r9)
            r11 = 36
            java.lang.String r11 = HJ.C15854t.s1(r9, r11, r4, r7, r4)
            r12 = 46
            java.lang.String r11 = HJ.C15854t.o1(r11, r12, r4, r7, r4)
            int r12 = r11.length()
            if (r12 != 0) goto L_0x011c
            goto L_0x0122
        L_0x011c:
            java.lang.String r9 = "Kt"
            java.lang.String r9 = HJ.C15854t.P0(r11, r9)
        L_0x0122:
            java.lang.Thread r11 = java.lang.Thread.currentThread()
            java.lang.String r11 = r11.getName()
            java.lang.String r12 = "main"
            boolean r11 = HJ.C15854t.b0(r11, r12, r8)
            if (r11 == 0) goto L_0x0135
            java.lang.String r11 = "m"
            goto L_0x0137
        L_0x0135:
            java.lang.String r11 = "b"
        L_0x0137:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r11)
            java.lang.String r11 = "|"
            r12.append(r11)
            r12.append(r9)
            java.lang.String r9 = r12.toString()
        L_0x014b:
            r16 = r9
            r12 = 1
            r9 = r10
            r10 = r2
            r11 = r16
            r13 = r15
            r14 = r5
            r9.a(r10, r11, r12, r13, r14)
            r9 = r16
            goto L_0x00db
        L_0x015a:
            Qk.f$f r4 = new Qk.f$f
            r4.<init>(r1)
        L_0x015f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: Qk.a.N(android.net.Uri, dI.e):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r28v0, types: [dI.e<? super Qk.f>] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x02b6, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005b, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005c, code lost:
        r2 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ea, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x014c, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x014d, code lost:
        r3 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01cb, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01cc, code lost:
        r3 = r25;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:10:0x0051, B:27:0x0098] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x01c0 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x005f A[ExcHandler: CancellationException (r0v31 'e' java.util.concurrent.CancellationException A[CUSTOM_DECLARE]), Splitter:B:10:0x0051] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d7 A[SYNTHETIC, Splitter:B:37:0x00d7] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00f9 A[Catch:{ CancellationException -> 0x005f, all -> 0x0151 }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01de  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01f6  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0033  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object O(android.net.Uri r26, Qk.f r27, dI.C17164e<? super Qk.f> r28) {
        /*
            r25 = this;
            r1 = r25
            r2 = r26
            r0 = r28
            boolean r3 = r0 instanceof Qk.a.h
            if (r3 == 0) goto L_0x0019
            r3 = r0
            Qk.a$h r3 = (Qk.a.h) r3
            int r4 = r3.f85941n
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.f85941n = r4
            goto L_0x001e
        L_0x0019:
            Qk.a$h r3 = new Qk.a$h
            r3.<init>(r1, r0)
        L_0x001e:
            java.lang.Object r4 = r3.f85939l
            java.lang.Object r5 = eI.C17187b.f()
            int r6 = r3.f85941n
            java.lang.String r7 = "|"
            java.lang.String r8 = "b"
            java.lang.String r9 = "m"
            java.lang.String r10 = "main"
            java.lang.String r11 = "Kt"
            r15 = 1
            if (r6 == 0) goto L_0x006a
            if (r6 != r15) goto L_0x0062
            java.lang.Object r0 = r3.f85936i
            Qk.a r0 = (Qk.a) r0
            java.lang.Object r2 = r3.f85935h
            Qk.a r2 = (Qk.a) r2
            java.lang.Object r2 = r3.f85934g
            Zl.a r2 = (Zl.a) r2
            java.lang.Object r5 = r3.f85933f
            dI.e r5 = (dI.C17164e) r5
            java.lang.Object r5 = r3.f85932e
            Qk.f r5 = (Qk.f) r5
            java.lang.Object r5 = r3.f85931d
            android.net.Uri r5 = (android.net.Uri) r5
            java.lang.Object r3 = r3.f85930c
            Qk.a r3 = (Qk.a) r3
            XH.y.b(r4)     // Catch:{ CancellationException -> 0x005f, all -> 0x005b }
            r24 = r4
            r4 = r2
            r2 = r5
            r5 = r24
            goto L_0x00bb
        L_0x005b:
            r0 = move-exception
            r2 = r5
            goto L_0x01ce
        L_0x005f:
            r0 = move-exception
            goto L_0x02b6
        L_0x0062:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x006a:
            XH.y.b(r4)
            java.util.Set<Zl.a> r4 = r1.f85888n
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L_0x0075:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x0089
            java.lang.Object r6 = r4.next()
            r12 = r6
            Zl.a r12 = (Zl.a) r12
            boolean r12 = r12.a(r2)
            if (r12 == 0) goto L_0x0075
            goto L_0x008a
        L_0x0089:
            r6 = 0
        L_0x008a:
            r4 = r6
            Zl.a r4 = (Zl.a) r4
            if (r4 != 0) goto L_0x0098
            java.lang.String r0 = "No mapper found - ignoring and propagating to fallback state"
            rw.g.d(r2, r0)
            r0 = r27
            goto L_0x02b5
        L_0x0098:
            XH.x$a r6 = XH.x.f139812b     // Catch:{ CancellationException -> 0x005f, all -> 0x01cb }
            r3.f85930c = r1     // Catch:{ CancellationException -> 0x005f, all -> 0x01cb }
            r3.f85931d = r2     // Catch:{ CancellationException -> 0x005f, all -> 0x01cb }
            r6 = r27
            r3.f85932e = r6     // Catch:{ CancellationException -> 0x005f, all -> 0x01cb }
            r3.f85933f = r0     // Catch:{ CancellationException -> 0x005f, all -> 0x01cb }
            r3.f85934g = r4     // Catch:{ CancellationException -> 0x005f, all -> 0x01cb }
            r3.f85935h = r1     // Catch:{ CancellationException -> 0x005f, all -> 0x01cb }
            r3.f85936i = r1     // Catch:{ CancellationException -> 0x005f, all -> 0x01cb }
            r0 = 0
            r3.f85937j = r0     // Catch:{ CancellationException -> 0x005f, all -> 0x01cb }
            r3.f85938k = r0     // Catch:{ CancellationException -> 0x005f, all -> 0x01cb }
            r3.f85941n = r15     // Catch:{ CancellationException -> 0x005f, all -> 0x01cb }
            java.lang.Object r0 = r4.b(r2, r3)     // Catch:{ CancellationException -> 0x005f, all -> 0x01cb }
            if (r0 != r5) goto L_0x00b8
            return r5
        L_0x00b8:
            r5 = r0
            r0 = r1
            r3 = r0
        L_0x00bb:
            r6 = r5
            android.net.Uri r6 = (android.net.Uri) r6     // Catch:{ CancellationException -> 0x005f, all -> 0x0151 }
            qv.e r12 = qv.e.DEBUG     // Catch:{ CancellationException -> 0x005f, all -> 0x0151 }
            qv.d r17 = qv.d.f102012a     // Catch:{ CancellationException -> 0x005f, all -> 0x0151 }
            java.util.List r17 = r17.a()     // Catch:{ CancellationException -> 0x005f, all -> 0x0151 }
            java.lang.Iterable r17 = (java.lang.Iterable) r17     // Catch:{ CancellationException -> 0x005f, all -> 0x0151 }
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ CancellationException -> 0x005f, all -> 0x0151 }
            r13.<init>()     // Catch:{ CancellationException -> 0x005f, all -> 0x0151 }
            java.util.Iterator r17 = r17.iterator()     // Catch:{ CancellationException -> 0x005f, all -> 0x0151 }
        L_0x00d1:
            boolean r18 = r17.hasNext()     // Catch:{ CancellationException -> 0x005f, all -> 0x0151 }
            if (r18 == 0) goto L_0x00ed
            java.lang.Object r14 = r17.next()     // Catch:{ CancellationException -> 0x005f, all -> 0x00ea }
            r1 = r14
            qv.b r1 = (qv.C11819b) r1     // Catch:{ CancellationException -> 0x005f, all -> 0x00ea }
            boolean r1 = r1.b(r12, r15)     // Catch:{ CancellationException -> 0x005f, all -> 0x00ea }
            if (r1 == 0) goto L_0x00e7
            r13.add(r14)     // Catch:{ CancellationException -> 0x005f, all -> 0x00ea }
        L_0x00e7:
            r1 = r25
            goto L_0x00d1
        L_0x00ea:
            r0 = move-exception
            goto L_0x01ce
        L_0x00ed:
            java.util.Iterator r1 = r13.iterator()     // Catch:{ CancellationException -> 0x005f, all -> 0x0151 }
            r13 = 0
            r14 = 0
        L_0x00f3:
            boolean r17 = r1.hasNext()     // Catch:{ CancellationException -> 0x005f, all -> 0x0151 }
            if (r17 == 0) goto L_0x01c0
            java.lang.Object r17 = r1.next()     // Catch:{ CancellationException -> 0x005f, all -> 0x0151 }
            qv.b r17 = (qv.C11819b) r17     // Catch:{ CancellationException -> 0x005f, all -> 0x0151 }
            if (r13 != 0) goto L_0x0156
            java.lang.Class r13 = r4.getClass()     // Catch:{ CancellationException -> 0x005f, all -> 0x0151 }
            java.lang.String r13 = r13.getSimpleName()     // Catch:{ CancellationException -> 0x005f, all -> 0x0151 }
            Pk.c r18 = r0.f85887m     // Catch:{ CancellationException -> 0x005f, all -> 0x0151 }
            boolean r15 = r18.invoke()     // Catch:{ CancellationException -> 0x005f, all -> 0x0151 }
            r27 = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ CancellationException -> 0x005f, all -> 0x0151 }
            r1.<init>()     // Catch:{ CancellationException -> 0x005f, all -> 0x0151 }
            r28 = r3
            java.lang.String r3 = "Applink "
            r1.append(r3)     // Catch:{ CancellationException -> 0x005f, all -> 0x014c }
            r1.append(r2)     // Catch:{ CancellationException -> 0x005f, all -> 0x014c }
            java.lang.String r3 = " mapped by "
            r1.append(r3)     // Catch:{ CancellationException -> 0x005f, all -> 0x014c }
            r1.append(r13)     // Catch:{ CancellationException -> 0x005f, all -> 0x014c }
            java.lang.String r3 = " to internal deeplink "
            r1.append(r3)     // Catch:{ CancellationException -> 0x005f, all -> 0x014c }
            r1.append(r6)     // Catch:{ CancellationException -> 0x005f, all -> 0x014c }
            java.lang.String r3 = ". FTE needed = "
            r1.append(r3)     // Catch:{ CancellationException -> 0x005f, all -> 0x014c }
            r1.append(r15)     // Catch:{ CancellationException -> 0x005f, all -> 0x014c }
            java.lang.String r1 = r1.toString()     // Catch:{ CancellationException -> 0x005f, all -> 0x014c }
            r3 = 0
            java.lang.String r1 = qv.C11818a.a(r1, r3)     // Catch:{ CancellationException -> 0x005f, all -> 0x014c }
            if (r1 != 0) goto L_0x0147
            goto L_0x01c2
        L_0x0147:
            java.lang.String r13 = qv.C11820c.a(r1)     // Catch:{ CancellationException -> 0x005f, all -> 0x014c }
            goto L_0x015a
        L_0x014c:
            r0 = move-exception
            r3 = r28
            goto L_0x01ce
        L_0x0151:
            r0 = move-exception
            r28 = r3
            goto L_0x01ce
        L_0x0156:
            r27 = r1
            r28 = r3
        L_0x015a:
            if (r14 != 0) goto L_0x01a7
            java.lang.Class r1 = r0.getClass()     // Catch:{ CancellationException -> 0x005f, all -> 0x014c }
            java.lang.String r1 = r1.getName()     // Catch:{ CancellationException -> 0x005f, all -> 0x014c }
            kotlin.jvm.internal.C17542s.g(r1)     // Catch:{ CancellationException -> 0x005f, all -> 0x014c }
            r23 = r0
            r3 = 36
            r14 = 2
            r15 = 0
            java.lang.String r0 = HJ.C15854t.s1(r1, r3, r15, r14, r15)     // Catch:{ CancellationException -> 0x005f, all -> 0x014c }
            r3 = 46
            java.lang.String r0 = HJ.C15854t.o1(r0, r3, r15, r14, r15)     // Catch:{ CancellationException -> 0x005f, all -> 0x014c }
            int r3 = r0.length()     // Catch:{ CancellationException -> 0x005f, all -> 0x014c }
            if (r3 != 0) goto L_0x017e
            goto L_0x0182
        L_0x017e:
            java.lang.String r1 = HJ.C15854t.P0(r0, r11)     // Catch:{ CancellationException -> 0x005f, all -> 0x014c }
        L_0x0182:
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ CancellationException -> 0x005f, all -> 0x014c }
            java.lang.String r0 = r0.getName()     // Catch:{ CancellationException -> 0x005f, all -> 0x014c }
            r3 = 1
            boolean r0 = HJ.C15854t.b0(r0, r10, r3)     // Catch:{ CancellationException -> 0x005f, all -> 0x014c }
            if (r0 == 0) goto L_0x0193
            r0 = r9
            goto L_0x0194
        L_0x0193:
            r0 = r8
        L_0x0194:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ CancellationException -> 0x005f, all -> 0x014c }
            r3.<init>()     // Catch:{ CancellationException -> 0x005f, all -> 0x014c }
            r3.append(r0)     // Catch:{ CancellationException -> 0x005f, all -> 0x014c }
            r3.append(r7)     // Catch:{ CancellationException -> 0x005f, all -> 0x014c }
            r3.append(r1)     // Catch:{ CancellationException -> 0x005f, all -> 0x014c }
            java.lang.String r14 = r3.toString()     // Catch:{ CancellationException -> 0x005f, all -> 0x014c }
            goto L_0x01a9
        L_0x01a7:
            r23 = r0
        L_0x01a9:
            r20 = 1
            r18 = r12
            r19 = r14
            r0 = 0
            r21 = r0
            r22 = r13
            r17.a(r18, r19, r20, r21, r22)     // Catch:{ CancellationException -> 0x005f, all -> 0x014c }
            r1 = r27
            r3 = r28
            r0 = r23
            r15 = 1
            goto L_0x00f3
        L_0x01c0:
            r28 = r3
        L_0x01c2:
            android.net.Uri r5 = (android.net.Uri) r5     // Catch:{ CancellationException -> 0x005f, all -> 0x014c }
            java.lang.Object r0 = XH.x.b(r5)     // Catch:{ CancellationException -> 0x005f, all -> 0x014c }
            r3 = r28
            goto L_0x01d8
        L_0x01cb:
            r0 = move-exception
            r3 = r25
        L_0x01ce:
            XH.x$a r1 = XH.x.f139812b
            java.lang.Object r0 = XH.y.a(r0)
            java.lang.Object r0 = XH.x.b(r0)
        L_0x01d8:
            java.lang.Throwable r1 = XH.x.e(r0)
            if (r1 != 0) goto L_0x01f6
            android.net.Uri r0 = (android.net.Uri) r0
            Pk.c r1 = r3.f85887m
            boolean r1 = r1.invoke()
            if (r1 == 0) goto L_0x01ee
            Qk.f$d r1 = new Qk.f$d
            r1.<init>(r2, r0)
            goto L_0x01f3
        L_0x01ee:
            Qk.f$b r1 = new Qk.f$b
            r1.<init>(r2, r0)
        L_0x01f3:
            r0 = r1
            goto L_0x02b5
        L_0x01f6:
            qv.e r0 = qv.e.WARN
            qv.d r4 = qv.d.f102012a
            java.util.List r4 = r4.a()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r4.iterator()
        L_0x0209:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x0221
            java.lang.Object r6 = r4.next()
            r12 = r6
            qv.b r12 = (qv.C11819b) r12
            r13 = 1
            boolean r12 = r12.b(r0, r13)
            if (r12 == 0) goto L_0x0209
            r5.add(r6)
            goto L_0x0209
        L_0x0221:
            java.util.Iterator r4 = r5.iterator()
            r5 = 0
            r15 = 0
        L_0x0227:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x02b0
            java.lang.Object r6 = r4.next()
            r17 = r6
            qv.b r17 = (qv.C11819b) r17
            if (r15 != 0) goto L_0x0254
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r12 = "Failed to map deeplink "
            r6.append(r12)
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            java.lang.String r6 = qv.C11818a.a(r6, r1)
            if (r6 != 0) goto L_0x024f
            goto L_0x02b0
        L_0x024f:
            java.lang.String r6 = qv.C11820c.a(r6)
            r15 = r6
        L_0x0254:
            if (r5 != 0) goto L_0x029f
            java.lang.Class r5 = r3.getClass()
            java.lang.String r5 = r5.getName()
            kotlin.jvm.internal.C17542s.g(r5)
            r6 = 36
            r12 = 2
            r13 = 0
            java.lang.String r14 = HJ.C15854t.s1(r5, r6, r13, r12, r13)
            r6 = 46
            java.lang.String r14 = HJ.C15854t.o1(r14, r6, r13, r12, r13)
            int r16 = r14.length()
            if (r16 != 0) goto L_0x0276
            goto L_0x027a
        L_0x0276:
            java.lang.String r5 = HJ.C15854t.P0(r14, r11)
        L_0x027a:
            java.lang.Thread r14 = java.lang.Thread.currentThread()
            java.lang.String r14 = r14.getName()
            r6 = 1
            boolean r14 = HJ.C15854t.b0(r14, r10, r6)
            if (r14 == 0) goto L_0x028b
            r14 = r9
            goto L_0x028c
        L_0x028b:
            r14 = r8
        L_0x028c:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r14)
            r6.append(r7)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            goto L_0x02a1
        L_0x029f:
            r12 = 2
            r13 = 0
        L_0x02a1:
            r20 = 1
            r18 = r0
            r19 = r5
            r21 = r1
            r22 = r15
            r17.a(r18, r19, r20, r21, r22)
            goto L_0x0227
        L_0x02b0:
            Qk.f$c r0 = new Qk.f$c
            r0.<init>(r2)
        L_0x02b5:
            return r0
        L_0x02b6:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Qk.a.O(android.net.Uri, Qk.f, dI.e):java.lang.Object");
    }

    public final C16532g<f> H() {
        return this.f85894t;
    }

    public final void I(Uri uri) {
        C17542s.j(uri, "uri");
        J(new f.c(uri), new b(this, uri, (C17164e<? super b>) null));
    }
}
