package r7;

import fK.q;
import j7.C8409c;
import java.time.Instant;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import r7.C8706h;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lr7/e;", "", "c", "a", "b", "Lr7/e$a;", "Lr7/e$b;", "Lr7/e$c;", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: r7.e  reason: case insensitive filesystem */
public interface C8703e {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lr7/e$a;", "Lr7/e;", "Ljava/time/Instant;", "timestamp", "networkResult", "<init>", "(Ljava/time/Instant;Lr7/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/time/Instant;", "getTimestamp", "()Ljava/time/Instant;", "b", "Lr7/e;", "getNetworkResult", "()Lr7/e;", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: r7.e$a */
    public static final class a implements C8703e {

        /* renamed from: a  reason: collision with root package name */
        private final Instant f55744a;

        /* renamed from: b  reason: collision with root package name */
        private final C8703e f55745b;

        public a(Instant instant, C8703e eVar) {
            C17542s.j(instant, "timestamp");
            C17542s.j(eVar, "networkResult");
            this.f55744a = instant;
            this.f55745b = eVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f55744a, aVar.f55744a) && C17542s.e(this.f55745b, aVar.f55745b);
        }

        public int hashCode() {
            return (this.f55744a.hashCode() * 31) + this.f55745b.hashCode();
        }

        public String toString() {
            return "DisableChecks(timestamp=" + this.f55744a + ", networkResult=" + this.f55745b + ')';
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lr7/e$b;", "Lr7/e;", "g", "f", "b", "d", "a", "e", "c", "Lr7/e$b$a;", "Lr7/e$b$b;", "Lr7/e$b$c;", "Lr7/e$b$d;", "Lr7/e$b$e;", "Lr7/e$b$f;", "Lr7/e$b$g;", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: r7.e$b */
    public interface b extends C8703e {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lr7/e$b$a;", "Lr7/e$b;", "LfK/q;", "exception", "<init>", "(LfK/q;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LfK/q;", "getException", "()LfK/q;", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: r7.e$b$a */
        public static final class a implements b {

            /* renamed from: a  reason: collision with root package name */
            private final q f55746a;

            public a(q qVar) {
                C17542s.j(qVar, "exception");
                this.f55746a = qVar;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && C17542s.e(this.f55746a, ((a) obj).f55746a);
            }

            public int hashCode() {
                return this.f55746a.hashCode();
            }

            public String toString() {
                return "log-list.json badly formatted with " + C8409c.a(this.f55746a);
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lr7/e$b$b;", "Lr7/e$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: r7.e$b$b  reason: collision with other inner class name */
        public static final class C0900b implements b {

            /* renamed from: a  reason: collision with root package name */
            public static final C0900b f55747a = new C0900b();

            private C0900b() {
            }

            public String toString() {
                return "log-list.json failed to load";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lr7/e$b$c;", "Lr7/e$b;", "Lr7/e;", "networkResult", "<init>", "(Lr7/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lr7/e;", "getNetworkResult", "()Lr7/e;", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: r7.e$b$c */
        public static final class c implements b {

            /* renamed from: a  reason: collision with root package name */
            private final C8703e f55748a;

            public c(C8703e eVar) {
                C17542s.j(eVar, "networkResult");
                this.f55748a = eVar;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && C17542s.e(this.f55748a, ((c) obj).f55748a);
            }

            public int hashCode() {
                return this.f55748a.hashCode();
            }

            public String toString() {
                return "log-list.json from server is older than 70 days old";
            }
        }

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lr7/e$b$d;", "Lr7/e$b;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "<init>", "(Ljava/lang/Exception;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Exception;", "getException", "()Ljava/lang/Exception;", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: r7.e$b$d */
        public static final class d implements b {

            /* renamed from: a  reason: collision with root package name */
            private final Exception f55749a;

            public d(Exception exc) {
                C17542s.j(exc, "exception");
                this.f55749a = exc;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && C17542s.e(this.f55749a, ((d) obj).f55749a);
            }

            public int hashCode() {
                return this.f55749a.hashCode();
            }

            public String toString() {
                return "log-list.zip failed to load with " + C8409c.a(this.f55749a);
            }
        }

        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\n¨\u0006\u001a"}, d2 = {"Lr7/e$b$e;", "Lr7/e$b;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "", "key", "<init>", "(Ljava/lang/Exception;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Exception;", "getException", "()Ljava/lang/Exception;", "b", "Ljava/lang/String;", "getKey", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: r7.e$b$e  reason: collision with other inner class name */
        public static final class C0901e implements b {

            /* renamed from: a  reason: collision with root package name */
            private final Exception f55750a;

            /* renamed from: b  reason: collision with root package name */
            private final String f55751b;

            public C0901e(Exception exc, String str) {
                C17542s.j(exc, "exception");
                C17542s.j(str, "key");
                this.f55750a = exc;
                this.f55751b = str;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0901e)) {
                    return false;
                }
                C0901e eVar = (C0901e) obj;
                return C17542s.e(this.f55750a, eVar.f55750a) && C17542s.e(this.f55751b, eVar.f55751b);
            }

            public int hashCode() {
                return (this.f55750a.hashCode() * 31) + this.f55751b.hashCode();
            }

            public String toString() {
                return "Public key for log server " + this.f55751b + " cannot be used with " + C8409c.a(this.f55750a);
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lr7/e$b$f;", "Lr7/e$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: r7.e$b$f */
        public static final class f implements b {

            /* renamed from: a  reason: collision with root package name */
            public static final f f55752a = new f();

            private f() {
            }

            public String toString() {
                return "log-list.json contains no log servers";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lr7/e$b$g;", "Lr7/e$b;", "Lr7/h$a;", "signatureResult", "<init>", "(Lr7/h$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lr7/h$a;", "getSignatureResult", "()Lr7/h$a;", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: r7.e$b$g */
        public static final class g implements b {

            /* renamed from: a  reason: collision with root package name */
            private final C8706h.a f55753a;

            public g(C8706h.a aVar) {
                C17542s.j(aVar, "signatureResult");
                this.f55753a = aVar;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof g) && C17542s.e(this.f55753a, ((g) obj).f55753a);
            }

            public int hashCode() {
                return this.f55753a.hashCode();
            }

            public String toString() {
                return "SignatureVerificationFailed(signatureResult=" + this.f55753a + ')';
            }
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u000b\u0003\bR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0001\u0003\f\r\u000e¨\u0006\u000f"}, d2 = {"Lr7/e$c;", "Lr7/e;", "Ljava/time/Instant;", "a", "()Ljava/time/Instant;", "timestamp", "", "Lr7/g;", "b", "()Ljava/util/List;", "servers", "c", "Lr7/e$c$a;", "Lr7/e$c$b;", "Lr7/e$c$c;", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: r7.e$c */
    public interface c extends C8703e {

        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lr7/e$c$a;", "Lr7/e$c;", "Ljava/time/Instant;", "timestamp", "", "Lr7/g;", "servers", "networkResult", "<init>", "(Ljava/time/Instant;Ljava/util/List;Lr7/e$c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/time/Instant;", "()Ljava/time/Instant;", "b", "Ljava/util/List;", "()Ljava/util/List;", "c", "Lr7/e$c;", "getNetworkResult", "()Lr7/e$c;", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: r7.e$c$a */
        public static final class a implements c {

            /* renamed from: a  reason: collision with root package name */
            private final Instant f55754a;

            /* renamed from: b  reason: collision with root package name */
            private final List<C8705g> f55755b;

            /* renamed from: c  reason: collision with root package name */
            private final c f55756c;

            public a(Instant instant, List<C8705g> list, c cVar) {
                C17542s.j(instant, "timestamp");
                C17542s.j(list, "servers");
                C17542s.j(cVar, "networkResult");
                this.f55754a = instant;
                this.f55755b = list;
                this.f55756c = cVar;
            }

            public Instant a() {
                return this.f55754a;
            }

            public List<C8705g> b() {
                return this.f55755b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return C17542s.e(this.f55754a, aVar.f55754a) && C17542s.e(this.f55755b, aVar.f55755b) && C17542s.e(this.f55756c, aVar.f55756c);
            }

            public int hashCode() {
                return (((this.f55754a.hashCode() * 31) + this.f55755b.hashCode()) * 31) + this.f55756c.hashCode();
            }

            public String toString() {
                return "StaleNetworkUsingCachedData(timestamp=" + this.f55754a + ", servers=" + this.f55755b + ", networkResult=" + this.f55756c + ')';
            }
        }

        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, d2 = {"Lr7/e$c$b;", "Lr7/e$c;", "Ljava/time/Instant;", "timestamp", "", "Lr7/g;", "servers", "<init>", "(Ljava/time/Instant;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/time/Instant;", "()Ljava/time/Instant;", "b", "Ljava/util/List;", "()Ljava/util/List;", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: r7.e$c$b */
        public static final class b implements c {

            /* renamed from: a  reason: collision with root package name */
            private final Instant f55757a;

            /* renamed from: b  reason: collision with root package name */
            private final List<C8705g> f55758b;

            public b(Instant instant, List<C8705g> list) {
                C17542s.j(instant, "timestamp");
                C17542s.j(list, "servers");
                this.f55757a = instant;
                this.f55758b = list;
            }

            public Instant a() {
                return this.f55757a;
            }

            public List<C8705g> b() {
                return this.f55758b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return C17542s.e(this.f55757a, bVar.f55757a) && C17542s.e(this.f55758b, bVar.f55758b);
            }

            public int hashCode() {
                return (this.f55757a.hashCode() * 31) + this.f55758b.hashCode();
            }

            public String toString() {
                return "StaleNetworkUsingNetworkData(timestamp=" + this.f55757a + ", servers=" + this.f55758b + ')';
            }
        }

        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, d2 = {"Lr7/e$c$c;", "Lr7/e$c;", "Ljava/time/Instant;", "timestamp", "", "Lr7/g;", "servers", "<init>", "(Ljava/time/Instant;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/time/Instant;", "()Ljava/time/Instant;", "b", "Ljava/util/List;", "()Ljava/util/List;", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: r7.e$c$c  reason: collision with other inner class name */
        public static final class C0902c implements c {

            /* renamed from: a  reason: collision with root package name */
            private final Instant f55759a;

            /* renamed from: b  reason: collision with root package name */
            private final List<C8705g> f55760b;

            public C0902c(Instant instant, List<C8705g> list) {
                C17542s.j(instant, "timestamp");
                C17542s.j(list, "servers");
                this.f55759a = instant;
                this.f55760b = list;
            }

            public Instant a() {
                return this.f55759a;
            }

            public List<C8705g> b() {
                return this.f55760b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0902c)) {
                    return false;
                }
                C0902c cVar = (C0902c) obj;
                return C17542s.e(this.f55759a, cVar.f55759a) && C17542s.e(this.f55760b, cVar.f55760b);
            }

            public int hashCode() {
                return (this.f55759a.hashCode() * 31) + this.f55760b.hashCode();
            }

            public String toString() {
                return "Success(timestamp=" + this.f55759a + ", servers=" + this.f55760b + ')';
            }
        }

        Instant a();

        List<C8705g> b();
    }
}
