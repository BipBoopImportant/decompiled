package TD;

import HJ.C15854t;
import IC.C13019a;
import IC.C13022d;
import QJ.C16297b0;
import QJ.F0;
import QJ.Q;
import QJ.T;
import RD.C13518a;
import Rz.a;
import TJ.C16505B;
import TJ.C16519P;
import TJ.C16521S;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import XH.t;
import XH.x;
import XH.y;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.ArrayList;
import kD.o;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lD.C14763e;
import nI.p;
import nI.q;
import nI.r;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u0000 &2\u00020\u0001:\u0004'()*B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f*\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0012R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006+"}, d2 = {"LTD/a;", "Landroidx/lifecycle/f0;", "LlD/e;", "getUserInfoUseCase", "LRz/a;", "randomPromoImageUseCase", "Lam/h;", "timeProvider", "LRD/a;", "promoAnalytics", "<init>", "(LlD/e;LRz/a;Lam/h;LRD/a;)V", "LTJ/g;", "LTD/a$c;", "j", "(LRz/a;)LTJ/g;", "LXH/N;", "D", "()V", "C", "m", "LRD/a;", "LTJ/B;", "LTD/a$b;", "n", "LTJ/B;", "dismissedFlow", "", "o", "LTJ/g;", "autoDismissTimerFlow", "LTJ/P;", "LTD/a$d;", "p", "LTJ/P;", "getState", "()LTJ/P;", "state", "q", "d", "c", "b", "a", "welcome-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: TD.a  reason: case insensitive filesystem */
public final class C13682a extends f0 {

    /* renamed from: q  reason: collision with root package name */
    public static final C2861a f116711q = new C2861a((DefaultConstructorMarker) null);

    /* renamed from: r  reason: collision with root package name */
    public static final int f116712r = 8;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final C13518a f116713m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final C16505B<b> f116714n;

    /* renamed from: o  reason: collision with root package name */
    private final C16532g<Boolean> f116715o;

    /* renamed from: p  reason: collision with root package name */
    private final C16519P<d> f116716p;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"LTD/a$a;", "", "<init>", "()V", "", "REQUEST_TIMEOUT", "J", "AUTO_DISMISS_DELAY", "welcome-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: TD.a$a  reason: collision with other inner class name */
    public static final class C2861a {
        public /* synthetic */ C2861a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C2861a() {
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LTD/a$b;", "", "a", "b", "c", "LTD/a$b$a;", "LTD/a$b$b;", "LTD/a$b$c;", "welcome-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: TD.a$b */
    public interface b {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LTD/a$b$a;", "LTD/a$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "welcome-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: TD.a$b$a  reason: collision with other inner class name */
        public static final class C2862a implements b {

            /* renamed from: a  reason: collision with root package name */
            public static final C2862a f116717a = new C2862a();

            private C2862a() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C2862a);
            }

            public int hashCode() {
                return -229328256;
            }

            public String toString() {
                return "Idle";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LTD/a$b$b;", "LTD/a$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "welcome-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: TD.a$b$b  reason: collision with other inner class name */
        public static final class C2863b implements b {

            /* renamed from: a  reason: collision with root package name */
            public static final C2863b f116718a = new C2863b();

            private C2863b() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C2863b);
            }

            public int hashCode() {
                return 1491067417;
            }

            public String toString() {
                return "Timer";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LTD/a$b$c;", "LTD/a$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "welcome-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: TD.a$b$c */
        public static final class c implements b {

            /* renamed from: a  reason: collision with root package name */
            public static final c f116719a = new c();

            private c() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return -228956553;
            }

            public String toString() {
                return "User";
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LTD/a$c;", "", "a", "c", "b", "LTD/a$c$a;", "LTD/a$c$b;", "LTD/a$c$c;", "welcome-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: TD.a$c */
    public interface c {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LTD/a$c$a;", "LTD/a$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "welcome-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: TD.a$c$a  reason: collision with other inner class name */
        public static final class C2864a implements c {

            /* renamed from: a  reason: collision with root package name */
            public static final C2864a f116720a = new C2864a();

            private C2864a() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C2864a);
            }

            public int hashCode() {
                return 1767318242;
            }

            public String toString() {
                return "Loading";
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"LTD/a$c$b;", "LTD/a$c;", "", "url", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "welcome-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: TD.a$c$b */
        public static final class b implements c {

            /* renamed from: a  reason: collision with root package name */
            private final String f116721a;

            public b(String str) {
                C17542s.j(str, "url");
                this.f116721a = str;
            }

            public final String a() {
                return this.f116721a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && C17542s.e(this.f116721a, ((b) obj).f116721a);
            }

            public int hashCode() {
                return this.f116721a.hashCode();
            }

            public String toString() {
                String str = this.f116721a;
                return "Success(url=" + str + ")";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LTD/a$c$c;", "LTD/a$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "welcome-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: TD.a$c$c  reason: collision with other inner class name */
        public static final class C2865c implements c {

            /* renamed from: a  reason: collision with root package name */
            public static final C2865c f116722a = new C2865c();

            private C2865c() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C2865c);
            }

            public int hashCode() {
                return 1495160879;
            }

            public String toString() {
                return "UseFallback";
            }
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0011\b\b\u0018\u00002\u00020\u0001B1\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e¨\u0006\u001f"}, d2 = {"LTD/a$d;", "", "", "name", "LIC/a;", "greeting", "LTD/a$c;", "promo", "", "isDismissed", "<init>", "(Ljava/lang/String;LIC/a;LTD/a$c;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "LIC/a;", "()LIC/a;", "c", "LTD/a$c;", "()LTD/a$c;", "d", "Z", "()Z", "welcome-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: TD.a$d */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        private final String f116723a;

        /* renamed from: b  reason: collision with root package name */
        private final C13019a f116724b;

        /* renamed from: c  reason: collision with root package name */
        private final c f116725c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f116726d;

        public d() {
            this((String) null, (C13019a) null, (c) null, false, 15, (DefaultConstructorMarker) null);
        }

        public final C13019a a() {
            return this.f116724b;
        }

        public final String b() {
            return this.f116723a;
        }

        public final c c() {
            return this.f116725c;
        }

        public final boolean d() {
            return this.f116726d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return C17542s.e(this.f116723a, dVar.f116723a) && this.f116724b == dVar.f116724b && C17542s.e(this.f116725c, dVar.f116725c) && this.f116726d == dVar.f116726d;
        }

        public int hashCode() {
            String str = this.f116723a;
            return ((((((str == null ? 0 : str.hashCode()) * 31) + this.f116724b.hashCode()) * 31) + this.f116725c.hashCode()) * 31) + Boolean.hashCode(this.f116726d);
        }

        public String toString() {
            String str = this.f116723a;
            C13019a aVar = this.f116724b;
            c cVar = this.f116725c;
            boolean z10 = this.f116726d;
            return "State(name=" + str + ", greeting=" + aVar + ", promo=" + cVar + ", isDismissed=" + z10 + ")";
        }

        public d(String str, C13019a aVar, c cVar, boolean z10) {
            C17542s.j(aVar, "greeting");
            C17542s.j(cVar, "promo");
            this.f116723a = str;
            this.f116724b = aVar;
            this.f116725c = cVar;
            this.f116726d = z10;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ d(String str, C13019a aVar, c cVar, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? C13019a.NotAvailable : aVar, (i10 & 4) != 0 ? c.C2864a.f116720a : cVar, (i10 & 8) != 0 ? false : z10);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LTJ/h;", "LTD/a$c;", "LXH/N;", "<anonymous>", "(LTJ/h;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.welcome.impl.presentation.promo.PromoViewModel$asFlow$1", f = "PromoViewModel.kt", l = {80, 81, 96}, m = "invokeSuspend")
    /* renamed from: TD.a$e */
    static final class e extends l implements p<C16533h<? super c>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f116727c;

        /* renamed from: d  reason: collision with root package name */
        Object f116728d;

        /* renamed from: e  reason: collision with root package name */
        int f116729e;

        /* renamed from: f  reason: collision with root package name */
        private /* synthetic */ Object f116730f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C13682a f116731g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ a f116732h;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LTD/a$c;", "<anonymous>", "(LQJ/Q;)LTD/a$c;"}, k = 3, mv = {2, 1, 0})
        @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.welcome.impl.presentation.promo.PromoViewModel$asFlow$1$result$1", f = "PromoViewModel.kt", l = {82}, m = "invokeSuspend")
        /* renamed from: TD.a$e$a  reason: collision with other inner class name */
        static final class C2866a extends l implements p<Q, C17164e<? super c>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f116733c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ a f116734d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2866a(a aVar, C17164e<? super C2866a> eVar) {
                super(2, eVar);
                this.f116734d = aVar;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new C2866a(this.f116734d, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super c> eVar) {
                return ((C2866a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object obj2;
                Object f10 = C17187b.f();
                int i10 = this.f116733c;
                if (i10 == 0) {
                    y.b(obj);
                    a aVar = this.f116734d;
                    this.f116733c = 1;
                    obj2 = aVar.m17invokeIoAF18A(this);
                    if (obj2 == f10) {
                        return f10;
                    }
                } else if (i10 == 1) {
                    y.b(obj);
                    obj2 = ((x) obj).j();
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return x.e(obj2) == null ? new c.b(((Qz.b) obj2).b()) : c.C2865c.f116722a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(C13682a aVar, a aVar2, C17164e<? super e> eVar) {
            super(2, eVar);
            this.f116731g = aVar;
            this.f116732h = aVar2;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            e eVar2 = new e(this.f116731g, this.f116732h, eVar);
            eVar2.f116730f = obj;
            return eVar2;
        }

        public final Object invoke(C16533h<? super c> hVar, C17164e<? super C16807N> eVar) {
            return ((e) create(hVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x006e  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0087  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x008a  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x0099 A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r6.f116729e
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L_0x003a
                if (r1 == r4) goto L_0x0032
                if (r1 == r3) goto L_0x002a
                if (r1 != r2) goto L_0x0022
                java.lang.Object r0 = r6.f116728d
                TD.a$c r0 = (TD.C13682a.c) r0
                java.lang.Object r0 = r6.f116727c
                TD.a$c r0 = (TD.C13682a.c) r0
                java.lang.Object r0 = r6.f116730f
                TJ.h r0 = (TJ.C16533h) r0
                XH.y.b(r7)
                goto L_0x009a
            L_0x0022:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L_0x002a:
                java.lang.Object r1 = r6.f116730f
                TJ.h r1 = (TJ.C16533h) r1
                XH.y.b(r7)
                goto L_0x0064
            L_0x0032:
                java.lang.Object r1 = r6.f116730f
                TJ.h r1 = (TJ.C16533h) r1
                XH.y.b(r7)
                goto L_0x004f
            L_0x003a:
                XH.y.b(r7)
                java.lang.Object r7 = r6.f116730f
                TJ.h r7 = (TJ.C16533h) r7
                TD.a$c$a r1 = TD.C13682a.c.C2864a.f116720a
                r6.f116730f = r7
                r6.f116729e = r4
                java.lang.Object r1 = r7.emit(r1, r6)
                if (r1 != r0) goto L_0x004e
                return r0
            L_0x004e:
                r1 = r7
            L_0x004f:
                TD.a$e$a r7 = new TD.a$e$a
                Rz.a r4 = r6.f116732h
                r5 = 0
                r7.<init>(r4, r5)
                r6.f116730f = r1
                r6.f116729e = r3
                r3 = 3000(0xbb8, double:1.482E-320)
                java.lang.Object r7 = QJ.m1.e(r3, r7, r6)
                if (r7 != r0) goto L_0x0064
                return r0
            L_0x0064:
                TD.a$c r7 = (TD.C13682a.c) r7
                TD.a$c$a r3 = TD.C13682a.c.C2864a.f116720a
                boolean r3 = kotlin.jvm.internal.C17542s.e(r7, r3)
                if (r3 != 0) goto L_0x0085
                boolean r3 = r7 instanceof TD.C13682a.c.b
                if (r3 == 0) goto L_0x007c
                TD.a r3 = r6.f116731g
                RD.a r3 = r3.f116713m
                r3.c()
                goto L_0x0085
            L_0x007c:
                TD.a r3 = r6.f116731g
                RD.a r3 = r3.f116713m
                r3.a()
            L_0x0085:
                if (r7 != 0) goto L_0x008a
                TD.a$c$c r3 = TD.C13682a.c.C2865c.f116722a
                goto L_0x008b
            L_0x008a:
                r3 = r7
            L_0x008b:
                r6.f116730f = r1
                r6.f116727c = r7
                r6.f116728d = r7
                r6.f116729e = r2
                java.lang.Object r7 = r1.emit(r3, r6)
                if (r7 != r0) goto L_0x009a
                return r0
            L_0x009a:
                XH.N r7 = XH.C16807N.f139792a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: TD.C13682a.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LTJ/h;", "", "LXH/N;", "<anonymous>", "(LTJ/h;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.welcome.impl.presentation.promo.PromoViewModel$autoDismissTimerFlow$1$1", f = "PromoViewModel.kt", l = {45, 47, 49, 54}, m = "invokeSuspend")
    /* renamed from: TD.a$f */
    static final class f extends l implements p<C16533h<? super Boolean>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f116735c;

        /* renamed from: d  reason: collision with root package name */
        int f116736d;

        /* renamed from: e  reason: collision with root package name */
        private /* synthetic */ Object f116737e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ b f116738f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C13682a f116739g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(b bVar, C13682a aVar, C17164e<? super f> eVar) {
            super(2, eVar);
            this.f116738f = bVar;
            this.f116739g = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            f fVar = new f(this.f116738f, this.f116739g, eVar);
            fVar.f116737e = obj;
            return fVar;
        }

        public final Object invoke(C16533h<? super Boolean> hVar, C17164e<? super C16807N> eVar) {
            return ((f) create(hVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C16533h hVar;
            b bVar;
            Object f10 = C17187b.f();
            int i10 = this.f116736d;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        bVar = (b) this.f116735c;
                        hVar = (C16533h) this.f116737e;
                        y.b(obj);
                    } else if (!(i10 == 3 || i10 == 4)) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                b bVar2 = (b) this.f116735c;
                C16533h hVar2 = (C16533h) this.f116737e;
                y.b(obj);
                return C16807N.f139792a;
            }
            y.b(obj);
            C16533h hVar3 = (C16533h) this.f116737e;
            bVar = this.f116738f;
            if (C17542s.e(bVar, b.C2862a.f116717a)) {
                Boolean a10 = kotlin.coroutines.jvm.internal.b.a(false);
                this.f116737e = hVar3;
                this.f116735c = bVar;
                this.f116736d = 1;
                if (hVar3.emit(a10, this) == f10) {
                    return f10;
                }
            } else if (C17542s.e(bVar, b.C2863b.f116718a)) {
                this.f116737e = hVar3;
                this.f116735c = bVar;
                this.f116736d = 2;
                if (C16297b0.b(1500, this) == f10) {
                    return f10;
                }
                hVar = hVar3;
            } else if (C17542s.e(bVar, b.c.f116719a)) {
                this.f116739g.f116713m.b();
                Boolean a11 = kotlin.coroutines.jvm.internal.b.a(true);
                this.f116737e = hVar3;
                this.f116735c = bVar;
                this.f116736d = 4;
                if (hVar3.emit(a11, this) == f10) {
                    return f10;
                }
            } else {
                throw new t();
            }
            return C16807N.f139792a;
            this.f116739g.f116713m.d();
            Boolean a12 = kotlin.coroutines.jvm.internal.b.a(true);
            this.f116737e = hVar;
            this.f116735c = bVar;
            this.f116736d = 3;
            if (hVar.emit(a12, this) == f10) {
                return f10;
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.welcome.impl.presentation.promo.PromoViewModel$onImageLoaded$1", f = "PromoViewModel.kt", l = {107}, m = "invokeSuspend")
    /* renamed from: TD.a$g */
    static final class g extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f116740c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C13682a f116741d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(C13682a aVar, C17164e<? super g> eVar) {
            super(2, eVar);
            this.f116741d = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new g(this.f116741d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((g) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f116740c;
            if (i10 == 0) {
                y.b(obj);
                C16505B h10 = this.f116741d.f116714n;
                b.C2863b bVar = b.C2863b.f116718a;
                this.f116740c = 1;
                if (h10.emit(bVar, this) == f10) {
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
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.welcome.impl.presentation.promo.PromoViewModel$onUserDismissed$1", f = "PromoViewModel.kt", l = {101}, m = "invokeSuspend")
    /* renamed from: TD.a$h */
    static final class h extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f116742c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C13682a f116743d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(C13682a aVar, C17164e<? super h> eVar) {
            super(2, eVar);
            this.f116743d = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new h(this.f116743d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((h) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f116742c;
            if (i10 == 0) {
                y.b(obj);
                C16505B h10 = this.f116743d.f116714n;
                b.c cVar = b.c.f116719a;
                this.f116742c = 1;
                if (h10.emit(cVar, this) == f10) {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "LTJ/h;", "it", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.welcome.impl.presentation.promo.PromoViewModel$special$$inlined$flatMapLatest$1", f = "PromoViewModel.kt", l = {189}, m = "invokeSuspend")
    /* renamed from: TD.a$i */
    public static final class i extends l implements q<C16533h<? super Boolean>, b, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f116744c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f116745d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f116746e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C13682a f116747f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i(C17164e eVar, C13682a aVar) {
            super(3, eVar);
            this.f116747f = aVar;
        }

        /* renamed from: i */
        public final Object invoke(C16533h<? super Boolean> hVar, b bVar, C17164e<? super C16807N> eVar) {
            i iVar = new i(eVar, this.f116747f);
            iVar.f116745d = hVar;
            iVar.f116746e = bVar;
            return iVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f116744c;
            if (i10 == 0) {
                y.b(obj);
                C16532g H10 = C16534i.H(new f((b) this.f116746e, this.f116747f, (C17164e<? super f>) null));
                this.f116744c = 1;
                if (C16534i.x((C16533h) this.f116745d, H10, this) == f10) {
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

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"LkD/o;", "userInfo", "LTD/a$c;", "promoResult", "", "isDismissed", "LTD/a$d;", "<anonymous>", "(LkD/o;LTD/a$c;Z)LTD/a$d;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.welcome.impl.presentation.promo.PromoViewModel$state$1", f = "PromoViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: TD.a$j */
    static final class j extends l implements r<o, c, Boolean, C17164e<? super d>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f116748c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f116749d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f116750e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ boolean f116751f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ am.h f116752g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(am.h hVar, C17164e<? super j> eVar) {
            super(4, eVar);
            this.f116752g = hVar;
        }

        public final Object i(o oVar, c cVar, boolean z10, C17164e<? super d> eVar) {
            j jVar = new j(this.f116752g, eVar);
            jVar.f116749d = oVar;
            jVar.f116750e = cVar;
            jVar.f116751f = z10;
            return jVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f116748c == 0) {
                y.b(obj);
                c cVar = (c) this.f116750e;
                boolean z10 = this.f116751f;
                kD.h b10 = ((o) this.f116749d).b();
                return new d(b10 != null ? b10.d() : null, C13022d.f110926a.a(this.f116752g.a().getHour()), cVar, z10);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4) {
            return i((o) obj, (c) obj2, ((Boolean) obj3).booleanValue(), (C17164e) obj4);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LTD/a$d;", "it", "LXH/N;", "<anonymous>", "(LTD/a$d;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.welcome.impl.presentation.promo.PromoViewModel$state$2", f = "PromoViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: TD.a$k */
    static final class k extends l implements p<d, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f116753c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f116754d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C13682a f116755e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(C13682a aVar, C17164e<? super k> eVar) {
            super(2, eVar);
            this.f116755e = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            k kVar = new k(this.f116755e, eVar);
            kVar.f116754d = obj;
            return kVar;
        }

        /* renamed from: i */
        public final Object invoke(d dVar, C17164e<? super C16807N> eVar) {
            return ((k) create(dVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f116753c == 0) {
                y.b(obj);
                d dVar = (d) this.f116754d;
                C13682a aVar = this.f116755e;
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
                        String a10 = C11818a.a("PromoViewModel: emitting state: " + dVar, (Throwable) null);
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
                    bVar.a(eVar, str4, false, (Throwable) null, str3);
                    str = str3;
                    str2 = str4;
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public C13682a(C14763e eVar, a aVar, am.h hVar, C13518a aVar2) {
        C17542s.j(eVar, "getUserInfoUseCase");
        C17542s.j(aVar, "randomPromoImageUseCase");
        C17542s.j(hVar, "timeProvider");
        C17542s.j(aVar2, "promoAnalytics");
        this.f116713m = aVar2;
        C16505B<b> a10 = C16521S.a(b.C2862a.f116717a);
        this.f116714n = a10;
        C16532g<Boolean> g02 = C16534i.g0(a10, new i((C17164e) null, this));
        this.f116715o = g02;
        this.f116716p = C16534i.c0(C16534i.R(C16534i.m(eVar.invoke(), j(aVar), g02, new j(hVar, (C17164e<? super j>) null)), new k(this, (C17164e<? super k>) null)), g0.a(this), ip.f.a(), new d((String) null, (C13019a) null, (c) null, false, 15, (DefaultConstructorMarker) null));
    }

    private final C16532g<c> j(a aVar) {
        return C16534i.H(new e(this, aVar, (C17164e<? super e>) null));
    }

    public final void C() {
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new g(this, (C17164e<? super g>) null), 3, (Object) null);
    }

    public final void D() {
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new h(this, (C17164e<? super h>) null), 3, (Object) null);
    }

    public final C16519P<d> getState() {
        return this.f116716p;
    }
}
