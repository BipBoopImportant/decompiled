package rf;

import Ae.e;
import Ae.j;
import HJ.C15854t;
import QJ.F0;
import QJ.N;
import QJ.Q;
import QJ.T;
import TJ.C16505B;
import TJ.C16519P;
import TJ.C16521S;
import TJ.C16534i;
import XH.C16796C;
import XH.C16807N;
import XH.y;
import YH.X;
import androidx.lifecycle.F;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import cD.C14031c;
import com.ingka.ikea.analytics.Interaction$Component;
import com.sugarcube.core.logger.DslKt;
import dI.C17160a;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import ip.C11410b;
import java.util.ArrayList;
import java.util.Iterator;
import kD.h;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lm.C11550a;
import lm.b;
import nI.p;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u00014B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ5\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001c0 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020'0&8\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001d\u0010/\u001a\b\u0012\u0004\u0012\u00020'0+8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b\u0017\u0010.R\u001f\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001000 8\u0006¢\u0006\f\n\u0004\b1\u0010\"\u001a\u0004\b2\u0010$¨\u00065"}, d2 = {"Lrf/b;", "Landroidx/lifecycle/f0;", "Llm/a;", "backInStockApi", "LAe/e;", "analytics", "LcD/c;", "profileRepository", "<init>", "(Llm/a;LAe/e;LcD/c;)V", "Llm/a$c;", "fulfilmentOption", "Llm/a$a;", "contactType", "", "itemNo", "itemType", "productTitle", "LXH/N;", "H", "(Llm/a$c;Llm/a$a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "G", "()V", "m", "Llm/a;", "n", "LAe/e;", "Lip/b;", "", "o", "Lip/b;", "_signupCompleted", "Landroidx/lifecycle/F;", "p", "Landroidx/lifecycle/F;", "F", "()Landroidx/lifecycle/F;", "signupCompleted", "LTJ/B;", "Lrf/b$a;", "q", "LTJ/B;", "_uiState", "LTJ/P;", "r", "LTJ/P;", "()LTJ/P;", "uiState", "LkD/h;", "s", "E", "profile", "a", "backinstock-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b extends f0 {
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final C11550a f76424m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final e f76425n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public final C11410b<Integer> f76426o;

    /* renamed from: p  reason: collision with root package name */
    private final F<Integer> f76427p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public final C16505B<a> f76428q;

    /* renamed from: r  reason: collision with root package name */
    private final C16519P<a> f76429r;

    /* renamed from: s  reason: collision with root package name */
    private final F<h> f76430s;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lrf/b$a;", "", "<init>", "()V", "b", "c", "a", "Lrf/b$a$a;", "Lrf/b$a$b;", "Lrf/b$a$c;", "backinstock-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class a {

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lrf/b$a$a;", "Lrf/b$a;", "<init>", "()V", "b", "a", "c", "Lrf/b$a$a$a;", "Lrf/b$a$a$b;", "Lrf/b$a$a$c;", "backinstock-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: rf.b$a$a  reason: collision with other inner class name */
        public static abstract class C1403a extends a {

            @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\t¨\u0006\u0017"}, d2 = {"Lrf/b$a$a$a;", "Lrf/b$a$a;", "Llm/b;", "backInStockException", "", "productTitle", "<init>", "(Llm/b;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Llm/b;", "()Llm/b;", "b", "Ljava/lang/String;", "backinstock-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: rf.b$a$a$a  reason: collision with other inner class name */
            public static final class C1404a extends C1403a {

                /* renamed from: a  reason: collision with root package name */
                private final lm.b f76431a;

                /* renamed from: b  reason: collision with root package name */
                private final String f76432b;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C1404a(lm.b bVar, String str) {
                    super((DefaultConstructorMarker) null);
                    C17542s.j(bVar, "backInStockException");
                    C17542s.j(str, "productTitle");
                    this.f76431a = bVar;
                    this.f76432b = str;
                }

                public final lm.b a() {
                    return this.f76431a;
                }

                public final String b() {
                    return this.f76432b;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C1404a)) {
                        return false;
                    }
                    C1404a aVar = (C1404a) obj;
                    return C17542s.e(this.f76431a, aVar.f76431a) && C17542s.e(this.f76432b, aVar.f76432b);
                }

                public int hashCode() {
                    return (this.f76431a.hashCode() * 31) + this.f76432b.hashCode();
                }

                public String toString() {
                    lm.b bVar = this.f76431a;
                    String str = this.f76432b;
                    return "BackInStockError(backInStockException=" + bVar + ", productTitle=" + str + ")";
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lrf/b$a$a$b;", "Lrf/b$a$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "backinstock-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: rf.b$a$a$b  reason: collision with other inner class name */
            public static final class C1405b extends C1403a {

                /* renamed from: a  reason: collision with root package name */
                public static final C1405b f76433a = new C1405b();

                private C1405b() {
                    super((DefaultConstructorMarker) null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof C1405b);
                }

                public int hashCode() {
                    return -1827344647;
                }

                public String toString() {
                    return "GenericError";
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lrf/b$a$a$c;", "Lrf/b$a$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "backinstock-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: rf.b$a$a$c */
            public static final class c extends C1403a {

                /* renamed from: a  reason: collision with root package name */
                public static final c f76434a = new c();

                private c() {
                    super((DefaultConstructorMarker) null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof c);
                }

                public int hashCode() {
                    return -433345577;
                }

                public String toString() {
                    return "InvalidContactError";
                }
            }

            public /* synthetic */ C1403a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C1403a() {
                super((DefaultConstructorMarker) null);
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lrf/b$a$b;", "Lrf/b$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "backinstock-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: rf.b$a$b  reason: collision with other inner class name */
        public static final class C1406b extends a {

            /* renamed from: a  reason: collision with root package name */
            public static final C1406b f76435a = new C1406b();

            private C1406b() {
                super((DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C1406b);
            }

            public int hashCode() {
                return -845390270;
            }

            public String toString() {
                return "Initial";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lrf/b$a$c;", "Lrf/b$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "backinstock-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class c extends a {

            /* renamed from: a  reason: collision with root package name */
            public static final c f76436a = new c();

            private c() {
                super((DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return 1837885498;
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

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"rf/b$b", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: rf.b$b  reason: collision with other inner class name */
    public static final class C1407b extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f76437a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f76438b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1407b(N.a aVar, b bVar, String str) {
            super(aVar);
            this.f76437a = bVar;
            this.f76438b = str;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            b bVar = this.f76437a;
            qv.e eVar = qv.e.DEBUG;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar2 : arrayList) {
                if (str == null) {
                    String a10 = C11818a.a("Unable to signup for notification", th2);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = bVar.getClass().getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar2.a(eVar, str4, false, th2, str3);
                str = str3;
                str2 = str4;
            }
            this.f76437a.f76428q.setValue(th2 instanceof b.a ? a.C1403a.c.f76434a : th2 instanceof lm.b ? new a.C1403a.C1404a((lm.b) th2, this.f76438b) : a.C1403a.C1405b.f76433a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.backinstocknotifications.viewmodels.BackInStockNotificationsViewModel$signupForNotification$2", f = "BackInStockNotificationsViewModel.kt", l = {84}, m = "invokeSuspend")
    static final class c extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f76439c;

        /* renamed from: d  reason: collision with root package name */
        Object f76440d;

        /* renamed from: e  reason: collision with root package name */
        Object f76441e;

        /* renamed from: f  reason: collision with root package name */
        Object f76442f;

        /* renamed from: g  reason: collision with root package name */
        Object f76443g;

        /* renamed from: h  reason: collision with root package name */
        Object f76444h;

        /* renamed from: i  reason: collision with root package name */
        Object f76445i;

        /* renamed from: j  reason: collision with root package name */
        Object f76446j;

        /* renamed from: k  reason: collision with root package name */
        int f76447k;

        /* renamed from: l  reason: collision with root package name */
        int f76448l;

        /* renamed from: m  reason: collision with root package name */
        int f76449m;

        /* renamed from: n  reason: collision with root package name */
        int f76450n;

        /* renamed from: o  reason: collision with root package name */
        int f76451o;

        /* renamed from: p  reason: collision with root package name */
        int f76452p;

        /* renamed from: q  reason: collision with root package name */
        private /* synthetic */ Object f76453q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ b f76454r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ C11550a.C2253a f76455s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ C11550a.c f76456t;

        /* renamed from: u  reason: collision with root package name */
        final /* synthetic */ String f76457u;

        /* renamed from: v  reason: collision with root package name */
        final /* synthetic */ String f76458v;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b bVar, C11550a.C2253a aVar, C11550a.c cVar, String str, String str2, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f76454r = bVar;
            this.f76455s = aVar;
            this.f76456t = cVar;
            this.f76457u = str;
            this.f76458v = str2;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            c cVar = new c(this.f76454r, this.f76455s, this.f76456t, this.f76457u, this.f76458v, eVar);
            cVar.f76453q = obj;
            return cVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            String str;
            String str2;
            String str3;
            String str4;
            Q q10;
            boolean z10;
            boolean z11;
            Object obj2;
            String str5;
            Object obj3;
            String str6;
            Object f10 = C17187b.f();
            int i10 = this.f76452p;
            String str7 = DslKt.INDICATOR_BACKGROUND;
            if (i10 == 0) {
                y.b(obj);
                Q q11 = (Q) this.f76453q;
                e.c.c(this.f76454r.f76425n, j.ACTION_TAP.b(), X.m(C16796C.a("component_value", com.ingka.ikea.backinstock.notification.repository.network.b.c(this.f76455s)), C16796C.a("fulfilment", com.ingka.ikea.backinstock.notification.repository.network.b.d(this.f76456t))), Interaction$Component.BACK_IN_STOCK_NOTIFY_ME_CONFIRMATION, (e.b) null, 8, (Object) null);
                qv.e eVar = qv.e.DEBUG;
                ArrayList arrayList = new ArrayList();
                for (Object next : d.f102012a.a()) {
                    if (((C11819b) next).b(eVar, false)) {
                        arrayList.add(next);
                    }
                }
                Iterator it = arrayList.iterator();
                Object obj4 = arrayList;
                String str8 = null;
                String str9 = null;
                while (true) {
                    if (!it.hasNext()) {
                        str3 = str7;
                        obj3 = obj4;
                        break;
                    }
                    obj4 = it.next();
                    C11819b bVar = (C11819b) obj4;
                    if (str8 == null) {
                        String a10 = C11818a.a("Signup for notification", (Throwable) null);
                        if (a10 == null) {
                            str3 = str7;
                            obj3 = obj4;
                            break;
                        }
                        str8 = C11820c.a(a10);
                    }
                    if (str9 == null) {
                        String name = q11.getClass().getName();
                        C17542s.g(name);
                        str6 = str7;
                        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o12.length() != 0) {
                            name = C15854t.P0(o12, "Kt");
                        }
                        str9 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str6) + DslKt.INDICATOR_SEPARATOR + name;
                    } else {
                        str6 = str7;
                    }
                    bVar.a(eVar, str9, false, (Throwable) null, str8);
                    str7 = str6;
                }
                this.f76454r.f76428q.setValue(a.c.f76436a);
                C11550a k10 = this.f76454r.f76424m;
                C11550a.c cVar = this.f76456t;
                C11550a.C2253a aVar = this.f76455s;
                str2 = DslKt.INDICATOR_MAIN;
                String str10 = this.f76457u;
                str = DslKt.INDICATOR_SEPARATOR;
                String str11 = this.f76458v;
                this.f76453q = q11;
                this.f76439c = q11;
                this.f76440d = q11;
                this.f76441e = eVar;
                this.f76442f = str8;
                this.f76443g = str9;
                this.f76444h = arrayList;
                this.f76445i = it;
                this.f76446j = obj3;
                this.f76447k = 0;
                this.f76448l = 0;
                this.f76449m = 0;
                this.f76450n = 0;
                this.f76451o = 0;
                this.f76452p = 1;
                q10 = q11;
                str4 = null;
                String str12 = str10;
                z10 = false;
                String str13 = str11;
                z11 = true;
                obj2 = k10.f(cVar, aVar, str12, str13, this);
                if (obj2 == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                Iterator it2 = (Iterator) this.f76445i;
                Iterable iterable = (Iterable) this.f76444h;
                String str14 = (String) this.f76443g;
                String str15 = (String) this.f76442f;
                qv.e eVar2 = (qv.e) this.f76441e;
                Q q12 = (Q) this.f76440d;
                Q q13 = (Q) this.f76439c;
                y.b(obj);
                q10 = (Q) this.f76453q;
                str = DslKt.INDICATOR_SEPARATOR;
                str3 = str7;
                str2 = DslKt.INDICATOR_MAIN;
                str4 = null;
                obj2 = obj;
                z10 = false;
                z11 = true;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int intValue = ((Number) obj2).intValue();
            qv.e eVar3 = qv.e.DEBUG;
            ArrayList<C11819b> arrayList2 = new ArrayList<>();
            for (Object next2 : d.f102012a.a()) {
                if (((C11819b) next2).b(eVar3, z10)) {
                    arrayList2.add(next2);
                }
            }
            String str16 = str4;
            String str17 = str16;
            for (C11819b bVar2 : arrayList2) {
                if (str16 == null) {
                    String a11 = C11818a.a("Signup for notification successful", (Throwable) null);
                    if (a11 == null) {
                        break;
                    }
                    str16 = C11820c.a(a11);
                }
                if (str17 == null) {
                    String name2 = q10.getClass().getName();
                    C17542s.g(name2);
                    String o13 = C15854t.o1(C15854t.s1(name2, '$', str4, 2, str4), '.', str4, 2, str4);
                    if (o13.length() != 0) {
                        name2 = C15854t.P0(o13, "Kt");
                    }
                    String str18 = C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, z11) ? str2 : str3;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str18);
                    str5 = str;
                    sb2.append(str5);
                    sb2.append(name2);
                    str17 = sb2.toString();
                } else {
                    str5 = str;
                }
                bVar2.a(eVar3, str17, false, (Throwable) null, str16);
                str = str5;
            }
            this.f76454r.f76426o.d(kotlin.coroutines.jvm.internal.b.e(intValue));
            this.f76454r.f76428q.setValue(a.C1406b.f76435a);
            return C16807N.f139792a;
        }
    }

    public b(C11550a aVar, e eVar, C14031c cVar) {
        C17542s.j(aVar, "backInStockApi");
        C17542s.j(eVar, "analytics");
        C17542s.j(cVar, "profileRepository");
        this.f76424m = aVar;
        this.f76425n = eVar;
        C11410b<Integer> bVar = new C11410b<>();
        this.f76426o = bVar;
        this.f76427p = bVar;
        C16505B<a> a10 = C16521S.a(a.C1406b.f76435a);
        this.f76428q = a10;
        this.f76429r = C16534i.c(a10);
        this.f76430s = cVar.getProfile();
        C14031c.a.b(cVar, false, new C10217a(), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final C16807N i(kD.l lVar) {
        C17542s.j(lVar, "it");
        return C16807N.f139792a;
    }

    public final F<h> E() {
        return this.f76430s;
    }

    public final F<Integer> F() {
        return this.f76427p;
    }

    public final void G() {
        this.f76428q.setValue(a.C1406b.f76435a);
    }

    public final void H(C11550a.c cVar, C11550a.C2253a aVar, String str, String str2, String str3) {
        C17542s.j(cVar, "fulfilmentOption");
        C17542s.j(aVar, "contactType");
        C17542s.j(str, "itemNo");
        C17542s.j(str2, "itemType");
        C17542s.j(str3, "productTitle");
        F0 unused = C16314k.d(g0.a(this), new C1407b(N.f137593c0, this, str3), (T) null, new c(this, aVar, cVar, str, str2, (C17164e<? super c>) null), 2, (Object) null);
    }

    public final C16519P<a> m() {
        return this.f76429r;
    }
}
