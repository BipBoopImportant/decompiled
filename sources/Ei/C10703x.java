package Ei;

import D4.C6429c;
import D4.M;
import HJ.C15854t;
import Hx.d;
import IC.C13023e;
import IC.C13026h;
import KJ.C15985a;
import QJ.F0;
import QJ.N;
import QJ.Q;
import QJ.T;
import TJ.C16505B;
import TJ.C16519P;
import TJ.C16521S;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import XH.y;
import YH.C16877v;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import bI.C17035a;
import com.sugarcube.core.logger.DslKt;
import dI.C17160a;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import nI.p;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;
import qx.C14956a;
import tf.C10253a;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001'B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u0013\u0010!R\u0018\u0010&\u001a\u00020\r*\u00020#8BX\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006("}, d2 = {"LEi/x;", "Landroidx/lifecycle/f0;", "LGx/a;", "purchaseHistoryRepository", "Ltf/a;", "killSwitchRepository", "LIl/a;", "appConfigApi", "<init>", "(LGx/a;Ltf/a;LIl/a;)V", "LXH/N;", "F", "()V", "", "date", "LIC/e;", "D", "(Ljava/lang/String;)LIC/e;", "G", "m", "LGx/a;", "n", "Ltf/a;", "o", "LIl/a;", "LTJ/B;", "LEi/x$a;", "p", "LTJ/B;", "_uiState", "LTJ/P;", "q", "LTJ/P;", "()LTJ/P;", "uiState", "", "E", "(D)Ljava/lang/String;", "withCurrency", "a", "purchasehistory-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Ei.x  reason: case insensitive filesystem */
public final class C10703x extends f0 {
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final Gx.a f80641m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final C10253a f80642n;

    /* renamed from: o  reason: collision with root package name */
    private final Il.a f80643o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public final C16505B<a> f80644p;

    /* renamed from: q  reason: collision with root package name */
    private final C16519P<a> f80645q;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"LEi/x$a;", "", "<init>", "()V", "c", "a", "b", "LEi/x$a$a;", "LEi/x$a$b;", "LEi/x$a$c;", "purchasehistory-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ei.x$a */
    public static abstract class a {

        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R#\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0014\u0010\u0019¨\u0006\u001a"}, d2 = {"LEi/x$a$a;", "LEi/x$a;", "", "isLookupEnabled", "LTJ/g;", "LD4/M;", "LEi/w;", "purchasesPagingData", "<init>", "(ZLTJ/g;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "b", "()Z", "LTJ/g;", "()LTJ/g;", "purchasehistory-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ei.x$a$a  reason: collision with other inner class name */
        public static final class C1536a extends a {

            /* renamed from: a  reason: collision with root package name */
            private final boolean f80646a;

            /* renamed from: b  reason: collision with root package name */
            private final C16532g<M<C10702w>> f80647b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C1536a(boolean z10, C16532g<M<C10702w>> gVar) {
                super((DefaultConstructorMarker) null);
                C17542s.j(gVar, "purchasesPagingData");
                this.f80646a = z10;
                this.f80647b = gVar;
            }

            public final C16532g<M<C10702w>> a() {
                return this.f80647b;
            }

            public final boolean b() {
                return this.f80646a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1536a)) {
                    return false;
                }
                C1536a aVar = (C1536a) obj;
                return this.f80646a == aVar.f80646a && C17542s.e(this.f80647b, aVar.f80647b);
            }

            public int hashCode() {
                return (Boolean.hashCode(this.f80646a) * 31) + this.f80647b.hashCode();
            }

            public String toString() {
                boolean z10 = this.f80646a;
                C16532g<M<C10702w>> gVar = this.f80647b;
                return "Content(isLookupEnabled=" + z10 + ", purchasesPagingData=" + gVar + ")";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LEi/x$a$b;", "LEi/x$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "purchasehistory-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ei.x$a$b */
        public static final class b extends a {

            /* renamed from: a  reason: collision with root package name */
            public static final b f80648a = new b();

            private b() {
                super((DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return -1873763682;
            }

            public String toString() {
                return "Error";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LEi/x$a$c;", "LEi/x$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "purchasehistory-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ei.x$a$c */
        public static final class c extends a {

            /* renamed from: a  reason: collision with root package name */
            public static final c f80649a = new c();

            private c() {
                super((DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return 720036946;
            }

            public String toString() {
                return "Loading";
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ei/x$b", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ei.x$b */
    public static final class b extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C10703x f80650a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(N.a aVar, C10703x xVar) {
            super(aVar);
            this.f80650a = xVar;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            e eVar = e.WARN;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar : arrayList) {
                if (str == null) {
                    String a10 = C11818a.a((String) null, th2);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + "Unable to fetch purchases";
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, th2, str3);
                str = str3;
                str2 = str4;
            }
            this.f80650a.f80644p.setValue(a.b.f80648a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.purchasehistory.impl.presentation.viewmodels.PurchaseHistoryViewModel$loadData$2", f = "PurchaseHistoryViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: Ei.x$c */
    static final class c extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f80651c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C10703x f80652d;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LHx/d;", "entry", "LEi/w;", "<anonymous>", "(LHx/d;)LEi/w;"}, k = 3, mv = {2, 1, 0})
        @f(c = "com.ingka.ikea.app.purchasehistory.impl.presentation.viewmodels.PurchaseHistoryViewModel$loadData$2$1$1", f = "PurchaseHistoryViewModel.kt", l = {}, m = "invokeSuspend")
        /* renamed from: Ei.x$c$a */
        static final class a extends l implements p<Hx.d, C17164e<? super C10702w>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f80653c;

            /* renamed from: d  reason: collision with root package name */
            /* synthetic */ Object f80654d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ C10703x f80655e;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Ei.x$c$a$a  reason: collision with other inner class name */
            static final class C1537a implements C17642l<d.a, Comparable<?>> {

                /* renamed from: a  reason: collision with root package name */
                public static final C1537a f80656a = new C1537a();

                C1537a() {
                }

                /* renamed from: a */
                public final Comparable<?> invoke(d.a aVar) {
                    C17542s.j(aVar, "it");
                    String b10 = aVar.b();
                    return Boolean.valueOf(b10 == null || b10.length() == 0);
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Ei.x$c$a$b */
            static final class b implements C17642l<d.a, Comparable<?>> {

                /* renamed from: a  reason: collision with root package name */
                public static final b f80657a = new b();

                b() {
                }

                /* renamed from: a */
                public final Comparable<?> invoke(d.a aVar) {
                    C17542s.j(aVar, "it");
                    Double a10 = aVar.a();
                    return Double.valueOf(a10 != null ? a10.doubleValue() * ((double) -1) : Double.MIN_VALUE);
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(C10703x xVar, C17164e<? super a> eVar) {
                super(2, eVar);
                this.f80655e = xVar;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                a aVar = new a(this.f80655e, eVar);
                aVar.f80654d = obj;
                return aVar;
            }

            /* renamed from: i */
            public final Object invoke(Hx.d dVar, C17164e<? super C10702w> eVar) {
                return ((a) create(dVar, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                C17187b.f();
                if (this.f80653c == 0) {
                    y.b(obj);
                    Hx.d dVar = (Hx.d) this.f80654d;
                    String c10 = dVar.c();
                    Hx.f g10 = dVar.g();
                    C13023e j10 = this.f80655e.D(dVar.b());
                    String k10 = this.f80655e.E(dVar.f());
                    boolean n10 = dVar.e().n();
                    C13023e a10 = C13026h.a(dVar.e().b());
                    String d10 = dVar.d();
                    Iterable<d.a> g12 = C16877v.g1(dVar.a(), C17035a.c(C1537a.f80656a, b.f80657a));
                    ArrayList arrayList = new ArrayList(C16877v.y(g12, 10));
                    for (d.a b10 : g12) {
                        arrayList.add(b10.b());
                    }
                    return new C10702w(c10, g10, j10, k10, n10, a10, d10, C15985a.h(arrayList));
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ei.x$c$b */
        public static final class b implements C16532g<M<C10702w>> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16532g f80658a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C10703x f80659b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Ei.x$c$b$a */
            public static final class a<T> implements C16533h {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ C16533h f80660a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ C10703x f80661b;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @f(c = "com.ingka.ikea.app.purchasehistory.impl.presentation.viewmodels.PurchaseHistoryViewModel$loadData$2$invokeSuspend$$inlined$map$1$2", f = "PurchaseHistoryViewModel.kt", l = {50}, m = "emit")
                /* renamed from: Ei.x$c$b$a$a  reason: collision with other inner class name */
                public static final class C1538a extends kotlin.coroutines.jvm.internal.d {

                    /* renamed from: c  reason: collision with root package name */
                    /* synthetic */ Object f80662c;

                    /* renamed from: d  reason: collision with root package name */
                    int f80663d;

                    /* renamed from: e  reason: collision with root package name */
                    final /* synthetic */ a f80664e;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    public C1538a(a aVar, C17164e eVar) {
                        super(eVar);
                        this.f80664e = aVar;
                    }

                    public final Object invokeSuspend(Object obj) {
                        this.f80662c = obj;
                        this.f80663d |= Integer.MIN_VALUE;
                        return this.f80664e.emit((Object) null, this);
                    }
                }

                public a(C16533h hVar, C10703x xVar) {
                    this.f80660a = hVar;
                    this.f80661b = xVar;
                }

                /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
                /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final java.lang.Object emit(java.lang.Object r7, dI.C17164e r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof Ei.C10703x.c.b.a.C1538a
                        if (r0 == 0) goto L_0x0013
                        r0 = r8
                        Ei.x$c$b$a$a r0 = (Ei.C10703x.c.b.a.C1538a) r0
                        int r1 = r0.f80663d
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L_0x0013
                        int r1 = r1 - r2
                        r0.f80663d = r1
                        goto L_0x0018
                    L_0x0013:
                        Ei.x$c$b$a$a r0 = new Ei.x$c$b$a$a
                        r0.<init>(r6, r8)
                    L_0x0018:
                        java.lang.Object r8 = r0.f80662c
                        java.lang.Object r1 = eI.C17187b.f()
                        int r2 = r0.f80663d
                        r3 = 1
                        if (r2 == 0) goto L_0x0031
                        if (r2 != r3) goto L_0x0029
                        XH.y.b(r8)
                        goto L_0x004d
                    L_0x0029:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L_0x0031:
                        XH.y.b(r8)
                        TJ.h r8 = r6.f80660a
                        D4.M r7 = (D4.M) r7
                        Ei.x$c$a r2 = new Ei.x$c$a
                        Ei.x r4 = r6.f80661b
                        r5 = 0
                        r2.<init>(r4, r5)
                        D4.M r7 = D4.O.a(r7, r2)
                        r0.f80663d = r3
                        java.lang.Object r7 = r8.emit(r7, r0)
                        if (r7 != r1) goto L_0x004d
                        return r1
                    L_0x004d:
                        XH.N r7 = XH.C16807N.f139792a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: Ei.C10703x.c.b.a.emit(java.lang.Object, dI.e):java.lang.Object");
                }
            }

            public b(C16532g gVar, C10703x xVar) {
                this.f80658a = gVar;
                this.f80659b = xVar;
            }

            public Object collect(C16533h hVar, C17164e eVar) {
                Object collect = this.f80658a.collect(new a(hVar, this.f80659b), eVar);
                return collect == C17187b.f() ? collect : C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C10703x xVar, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f80652d = xVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new c(this.f80652d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f80651c == 0) {
                y.b(obj);
                this.f80652d.f80644p.setValue(a.c.f80649a);
                this.f80652d.f80644p.setValue(new a.C1536a(this.f80652d.f80642n.u(), new b(C6429c.a(this.f80652d.f80641m.h(), g0.a(this.f80652d)), this.f80652d)));
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public C10703x(Gx.a aVar, C10253a aVar2, Il.a aVar3) {
        C17542s.j(aVar, "purchaseHistoryRepository");
        C17542s.j(aVar2, "killSwitchRepository");
        C17542s.j(aVar3, "appConfigApi");
        this.f80641m = aVar;
        this.f80642n = aVar2;
        this.f80643o = aVar3;
        C16505B<a> a10 = C16521S.a(a.c.f80649a);
        this.f80644p = a10;
        this.f80645q = C16534i.c(a10);
        F();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r1 = IC.C13026h.c(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final IC.C13023e D(java.lang.String r1) {
        /*
            r0 = this;
            if (r1 == 0) goto L_0x0008
            IC.e r1 = IC.C13026h.c(r1)
            if (r1 != 0) goto L_0x000e
        L_0x0008:
            int r1 = wi.C12272a.f105804c
            IC.e r1 = IC.C13026h.a(r1)
        L_0x000e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Ei.C10703x.D(java.lang.String):IC.e");
    }

    /* access modifiers changed from: private */
    public final String E(double d10) {
        return C14956a.f130484a.b(d10, this.f80643o.s());
    }

    private final void F() {
        F0 unused = C16314k.d(g0.a(this), new b(N.f137593c0, this), (T) null, new c(this, (C17164e<? super c>) null), 2, (Object) null);
    }

    public final void G() {
        this.f80641m.k();
    }

    public final C16519P<a> m() {
        return this.f80645q;
    }
}
