package VD;

import HJ.C15854t;
import QJ.F0;
import QJ.Q;
import QJ.T;
import TJ.C16505B;
import TJ.C16519P;
import TJ.C16521S;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import XH.x;
import XH.y;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kD.h;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lD.C14762d;
import nI.p;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001:\u0002\u0017\u0018B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"LVD/d;", "Landroidx/lifecycle/f0;", "LlD/d;", "getProfileUseCase", "<init>", "(LlD/d;)V", "LXH/N;", "C", "()V", "m", "LlD/d;", "LTJ/B;", "LVD/d$a;", "n", "LTJ/B;", "internalState", "LTJ/P;", "LVD/d$b;", "o", "LTJ/P;", "getState", "()LTJ/P;", "state", "b", "a", "welcome-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d extends f0 {
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final C14762d f117400m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final C16505B<a> f117401n;

    /* renamed from: o  reason: collision with root package name */
    private final C16519P<b> f117402o;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001:\u0001\bB\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, d2 = {"LVD/d$a;", "", "LVD/d$a$a;", "status", "LkD/h;", "profile", "<init>", "(LVD/d$a$a;LkD/h;)V", "a", "(LVD/d$a$a;LkD/h;)LVD/d$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "LVD/d$a$a;", "c", "()LVD/d$a$a;", "b", "LkD/h;", "()LkD/h;", "welcome-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final C2895a f117403a;

        /* renamed from: b  reason: collision with root package name */
        private final h f117404b;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LVD/d$a$a;", "", "b", "a", "LVD/d$a$a$a;", "LVD/d$a$a$b;", "welcome-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: VD.d$a$a  reason: collision with other inner class name */
        public interface C2895a {

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LVD/d$a$a$a;", "LVD/d$a$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "welcome-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: VD.d$a$a$a  reason: collision with other inner class name */
            public static final class C2896a implements C2895a {

                /* renamed from: a  reason: collision with root package name */
                public static final C2896a f117405a = new C2896a();

                private C2896a() {
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof C2896a);
                }

                public int hashCode() {
                    return -1454141765;
                }

                public String toString() {
                    return "Loading";
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LVD/d$a$a$b;", "LVD/d$a$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "welcome-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: VD.d$a$a$b */
            public static final class b implements C2895a {

                /* renamed from: a  reason: collision with root package name */
                public static final b f117406a = new b();

                private b() {
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof b);
                }

                public int hashCode() {
                    return 637005186;
                }

                public String toString() {
                    return "Success";
                }
            }
        }

        public a() {
            this((C2895a) null, (h) null, 3, (DefaultConstructorMarker) null);
        }

        public final a a(C2895a aVar, h hVar) {
            C17542s.j(aVar, "status");
            return new a(aVar, hVar);
        }

        public final h b() {
            return this.f117404b;
        }

        public final C2895a c() {
            return this.f117403a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f117403a, aVar.f117403a) && C17542s.e(this.f117404b, aVar.f117404b);
        }

        public int hashCode() {
            int hashCode = this.f117403a.hashCode() * 31;
            h hVar = this.f117404b;
            return hashCode + (hVar == null ? 0 : hVar.hashCode());
        }

        public String toString() {
            C2895a aVar = this.f117403a;
            h hVar = this.f117404b;
            return "InternalState(status=" + aVar + ", profile=" + hVar + ")";
        }

        public a(C2895a aVar, h hVar) {
            C17542s.j(aVar, "status");
            this.f117403a = aVar;
            this.f117404b = hVar;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ a(C2895a aVar, h hVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? C2895a.C2896a.f117405a : aVar, (i10 & 2) != 0 ? null : hVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LVD/d$b;", "", "a", "b", "c", "LVD/d$b$a;", "LVD/d$b$b;", "LVD/d$b$c;", "welcome-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface b {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LVD/d$b$a;", "LVD/d$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "welcome-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a implements b {

            /* renamed from: a  reason: collision with root package name */
            public static final a f117407a = new a();

            private a() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return 1305578686;
            }

            public String toString() {
                return "Loading";
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"LVD/d$b$b;", "LVD/d$b;", "", "name", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "welcome-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: VD.d$b$b  reason: collision with other inner class name */
        public static final class C2897b implements b {

            /* renamed from: a  reason: collision with root package name */
            private final String f117408a;

            public C2897b(String str) {
                C17542s.j(str, "name");
                this.f117408a = str;
            }

            public final String a() {
                return this.f117408a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2897b) && C17542s.e(this.f117408a, ((C2897b) obj).f117408a);
            }

            public int hashCode() {
                return this.f117408a.hashCode();
            }

            public String toString() {
                String str = this.f117408a;
                return "NamedUser(name=" + str + ")";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LVD/d$b$c;", "LVD/d$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "welcome-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class c implements b {

            /* renamed from: a  reason: collision with root package name */
            public static final c f117409a = new c();

            private c() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return 410213037;
            }

            public String toString() {
                return "UnnamedUser";
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.welcome.impl.presentation.welcome.WelcomeViewModel$getUserProfile$1", f = "WelcomeViewModel.kt", l = {55}, m = "invokeSuspend")
    static final class c extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f117410c;

        /* renamed from: d  reason: collision with root package name */
        Object f117411d;

        /* renamed from: e  reason: collision with root package name */
        Object f117412e;

        /* renamed from: f  reason: collision with root package name */
        int f117413f;

        /* renamed from: g  reason: collision with root package name */
        int f117414g;

        /* renamed from: h  reason: collision with root package name */
        int f117415h;

        /* renamed from: i  reason: collision with root package name */
        private /* synthetic */ Object f117416i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ d f117417j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(d dVar, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f117417j = dVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            c cVar = new c(this.f117417j, eVar);
            cVar.f117416i = obj;
            return cVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Object value;
            Object f10 = C17187b.f();
            int i10 = this.f117415h;
            h hVar = null;
            if (i10 == 0) {
                y.b(obj);
                Q q10 = (Q) this.f117416i;
                d dVar = this.f117417j;
                x.a aVar = x.f139812b;
                C14762d h10 = dVar.f117400m;
                this.f117416i = q10;
                this.f117410c = q10;
                this.f117411d = dVar;
                this.f117412e = q10;
                this.f117413f = 0;
                this.f117414g = 0;
                this.f117415h = 1;
                obj = C14762d.a.a(h10, false, this, 1, (Object) null);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                Q q11 = (Q) this.f117412e;
                d dVar2 = (d) this.f117411d;
                Q q12 = (Q) this.f117410c;
                Q q13 = (Q) this.f117416i;
                try {
                    y.b(obj);
                } catch (CancellationException e10) {
                    throw e10;
                } catch (Throwable th2) {
                    x.a aVar2 = x.f139812b;
                    obj2 = x.b(y.a(th2));
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj2 = x.b((h) obj);
            if (!x.g(obj2)) {
                hVar = obj2;
            }
            h hVar2 = hVar;
            C16505B i11 = this.f117417j.f117401n;
            do {
                value = i11.getValue();
            } while (!i11.e(value, ((a) value).a(a.C2895a.b.f117406a, hVar2)));
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: VD.d$d  reason: collision with other inner class name */
    public static final class C2898d implements C16532g<b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f117418a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: VD.d$d$a */
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f117419a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @f(c = "com.ingka.ikea.welcome.impl.presentation.welcome.WelcomeViewModel$special$$inlined$map$1$2", f = "WelcomeViewModel.kt", l = {50}, m = "emit")
            /* renamed from: VD.d$d$a$a  reason: collision with other inner class name */
            public static final class C2899a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f117420c;

                /* renamed from: d  reason: collision with root package name */
                int f117421d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f117422e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2899a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f117422e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f117420c = obj;
                    this.f117421d |= Integer.MIN_VALUE;
                    return this.f117422e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f117419a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r6, dI.C17164e r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof VD.d.C2898d.a.C2899a
                    if (r0 == 0) goto L_0x0013
                    r0 = r7
                    VD.d$d$a$a r0 = (VD.d.C2898d.a.C2899a) r0
                    int r1 = r0.f117421d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f117421d = r1
                    goto L_0x0018
                L_0x0013:
                    VD.d$d$a$a r0 = new VD.d$d$a$a
                    r0.<init>(r5, r7)
                L_0x0018:
                    java.lang.Object r7 = r0.f117420c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f117421d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r7)
                    goto L_0x0077
                L_0x0029:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L_0x0031:
                    XH.y.b(r7)
                    TJ.h r7 = r5.f117419a
                    VD.d$a r6 = (VD.d.a) r6
                    VD.d$a$a r2 = r6.c()
                    VD.d$a$a$a r4 = VD.d.a.C2895a.C2896a.f117405a
                    boolean r4 = kotlin.jvm.internal.C17542s.e(r2, r4)
                    if (r4 == 0) goto L_0x0047
                    VD.d$b$a r6 = VD.d.b.a.f117407a
                    goto L_0x006e
                L_0x0047:
                    VD.d$a$a$b r4 = VD.d.a.C2895a.b.f117406a
                    boolean r2 = kotlin.jvm.internal.C17542s.e(r2, r4)
                    if (r2 == 0) goto L_0x007a
                    kD.h r2 = r6.b()
                    if (r2 == 0) goto L_0x005a
                    java.lang.String r2 = r2.d()
                    goto L_0x005b
                L_0x005a:
                    r2 = 0
                L_0x005b:
                    if (r2 == 0) goto L_0x006c
                    VD.d$b$b r2 = new VD.d$b$b
                    kD.h r6 = r6.b()
                    java.lang.String r6 = r6.d()
                    r2.<init>(r6)
                    r6 = r2
                    goto L_0x006e
                L_0x006c:
                    VD.d$b$c r6 = VD.d.b.c.f117409a
                L_0x006e:
                    r0.f117421d = r3
                    java.lang.Object r6 = r7.emit(r6, r0)
                    if (r6 != r1) goto L_0x0077
                    return r1
                L_0x0077:
                    XH.N r6 = XH.C16807N.f139792a
                    return r6
                L_0x007a:
                    XH.t r6 = new XH.t
                    r6.<init>()
                    throw r6
                */
                throw new UnsupportedOperationException("Method not decompiled: VD.d.C2898d.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public C2898d(C16532g gVar) {
            this.f117418a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f117418a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LVD/d$b;", "it", "LXH/N;", "<anonymous>", "(LVD/d$b;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.welcome.impl.presentation.welcome.WelcomeViewModel$state$2", f = "WelcomeViewModel.kt", l = {}, m = "invokeSuspend")
    static final class e extends l implements p<b, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f117423c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f117424d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ d f117425e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(d dVar, C17164e<? super e> eVar) {
            super(2, eVar);
            this.f117425e = dVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            e eVar2 = new e(this.f117425e, eVar);
            eVar2.f117424d = obj;
            return eVar2;
        }

        /* renamed from: i */
        public final Object invoke(b bVar, C17164e<? super C16807N> eVar) {
            return ((e) create(bVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f117423c == 0) {
                y.b(obj);
                b bVar = (b) this.f117424d;
                d dVar = this.f117425e;
                qv.e eVar = qv.e.DEBUG;
                ArrayList<C11819b> arrayList = new ArrayList<>();
                for (Object next : qv.d.f102012a.a()) {
                    if (((C11819b) next).b(eVar, false)) {
                        arrayList.add(next);
                    }
                }
                String str = null;
                String str2 = null;
                for (C11819b bVar2 : arrayList) {
                    if (str == null) {
                        String a10 = C11818a.a("OnboardingWelcomeViewModel: emitting state: " + bVar, (Throwable) null);
                        if (a10 == null) {
                            break;
                        }
                        str = C11820c.a(a10);
                    }
                    String str3 = str;
                    if (str2 == null) {
                        String name = dVar.getClass().getName();
                        C17542s.g(name);
                        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o12.length() != 0) {
                            name = C15854t.P0(o12, "Kt");
                        }
                        str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                    }
                    String str4 = str2;
                    bVar2.a(eVar, str4, false, (Throwable) null, str3);
                    str = str3;
                    str2 = str4;
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public d(C14762d dVar) {
        C17542s.j(dVar, "getProfileUseCase");
        this.f117400m = dVar;
        C16505B<a> a10 = C16521S.a(new a((a.C2895a) null, (h) null, 3, (DefaultConstructorMarker) null));
        this.f117401n = a10;
        this.f117402o = C16534i.c0(C16534i.R(new C2898d(a10), new e(this, (C17164e<? super e>) null)), g0.a(this), ip.f.a(), b.a.f117407a);
        C();
    }

    private final void C() {
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new c(this, (C17164e<? super c>) null), 3, (Object) null);
    }

    public final C16519P<b> getState() {
        return this.f117402o;
    }
}
