package a7;

import a7.l;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import r7.C8703e;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0002\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"La7/m;", "", "a", "c", "b", "La7/m$b;", "La7/m$c;", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface m {

    /* renamed from: a  reason: collision with root package name */
    public static final a f41532a = a.f41533a;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007*\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"La7/m$a;", "", "<init>", "()V", "", "", "La7/l;", "", "b", "(Ljava/util/Map;)Ljava/util/List;", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f41533a = new a();

        private a() {
        }

        /* access modifiers changed from: private */
        public final List<String> b(Map<String, ? extends l> map) {
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry next : map.entrySet()) {
                arrayList.add(((String) next.getKey()) + ':' + next.getValue());
            }
            return arrayList;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"La7/m$b;", "La7/m;", "b", "a", "c", "e", "d", "f", "La7/m$b$a;", "La7/m$b$b;", "La7/m$b$c;", "La7/m$b$d;", "La7/m$b$e;", "La7/m$b$f;", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface b extends m {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"La7/m$b$a;", "La7/m$b;", "Lr7/e$b;", "logListResult", "<init>", "(Lr7/e$b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lr7/e$b;", "getLogListResult", "()Lr7/e$b;", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a implements b {

            /* renamed from: b  reason: collision with root package name */
            private final C8703e.b f41534b;

            public a(C8703e.b bVar) {
                C17542s.j(bVar, "logListResult");
                this.f41534b = bVar;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && C17542s.e(this.f41534b, ((a) obj).f41534b);
            }

            public int hashCode() {
                return this.f41534b.hashCode();
            }

            public String toString() {
                return "Failure: Unable to load log servers with " + this.f41534b;
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"La7/m$b$b;", "La7/m$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: a7.m$b$b  reason: collision with other inner class name */
        public static final class C0732b implements b {

            /* renamed from: b  reason: collision with root package name */
            public static final C0732b f41535b = new C0732b();

            private C0732b() {
            }

            public String toString() {
                return "Failure: No certificates";
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"La7/m$b$c;", "La7/m$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class c implements b {

            /* renamed from: b  reason: collision with root package name */
            public static final c f41536b = new c();

            private c() {
            }

            public String toString() {
                return "Failure: This certificate does not have any Signed Certificate Timestamps in it.";
            }
        }

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B#\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\r¨\u0006\u001a"}, d2 = {"La7/m$b$d;", "La7/m$b;", "", "", "La7/l;", "scts", "", "minSctCount", "<init>", "(Ljava/util/Map;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/util/Map;", "getScts", "()Ljava/util/Map;", "c", "I", "getMinSctCount", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class d implements b {

            /* renamed from: b  reason: collision with root package name */
            private final Map<String, l> f41537b;

            /* renamed from: c  reason: collision with root package name */
            private final int f41538c;

            public d(Map<String, ? extends l> map, int i10) {
                C17542s.j(map, "scts");
                this.f41537b = map;
                this.f41538c = i10;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return C17542s.e(this.f41537b, dVar.f41537b) && this.f41538c == dVar.f41538c;
            }

            public int hashCode() {
                return (this.f41537b.hashCode() * 31) + Integer.hashCode(this.f41538c);
            }

            public String toString() {
                ArrayList arrayList = new ArrayList();
                for (Object next : this.f41537b.values()) {
                    if (next instanceof l.a) {
                        arrayList.add(next);
                    }
                }
                HashSet hashSet = new HashSet();
                ArrayList arrayList2 = new ArrayList();
                for (Object next2 : arrayList) {
                    if (hashSet.add(((l.a) next2).a())) {
                        arrayList2.add(next2);
                    }
                }
                int size = arrayList2.size();
                return "Failure: Too few distinct operators, required " + this.f41538c + ", found " + size + " in " + m.f41532a.b(this.f41537b);
            }
        }

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B#\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\r¨\u0006\u001a"}, d2 = {"La7/m$b$e;", "La7/m$b;", "", "", "La7/l;", "scts", "", "minSctCount", "<init>", "(Ljava/util/Map;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/util/Map;", "getScts", "()Ljava/util/Map;", "c", "I", "getMinSctCount", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class e implements b {

            /* renamed from: b  reason: collision with root package name */
            private final Map<String, l> f41539b;

            /* renamed from: c  reason: collision with root package name */
            private final int f41540c;

            public e(Map<String, ? extends l> map, int i10) {
                C17542s.j(map, "scts");
                this.f41539b = map;
                this.f41540c = i10;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                return C17542s.e(this.f41539b, eVar.f41539b) && this.f41540c == eVar.f41540c;
            }

            public int hashCode() {
                return (this.f41539b.hashCode() * 31) + Integer.hashCode(this.f41540c);
            }

            public String toString() {
                Map<String, l> map = this.f41539b;
                int i10 = 0;
                if (!map.isEmpty()) {
                    for (Map.Entry<String, l> value : map.entrySet()) {
                        if (value.getValue() instanceof l.a) {
                            i10++;
                        }
                    }
                }
                return "Failure: Too few trusted SCTs, required " + this.f41540c + ", found " + i10 + " in " + m.f41532a.b(this.f41539b);
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"La7/m$b$f;", "La7/m$b;", "Ljava/io/IOException;", "ioException", "<init>", "(Ljava/io/IOException;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/io/IOException;", "getIoException", "()Ljava/io/IOException;", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class f implements b {

            /* renamed from: b  reason: collision with root package name */
            private final IOException f41541b;

            public f(IOException iOException) {
                C17542s.j(iOException, "ioException");
                this.f41541b = iOException;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && C17542s.e(this.f41541b, ((f) obj).f41541b);
            }

            public int hashCode() {
                return this.f41541b.hashCode();
            }

            public String toString() {
                return "Failure: IOException " + this.f41541b;
            }
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"La7/m$c;", "La7/m;", "d", "a", "e", "c", "b", "La7/m$c$a;", "La7/m$c$b;", "La7/m$c$c;", "La7/m$c$d;", "La7/m$c$e;", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface c extends m {

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, d2 = {"La7/m$c$a;", "La7/m$c;", "", "host", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "getHost", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a implements c {

            /* renamed from: b  reason: collision with root package name */
            private final String f41542b;

            public a(String str) {
                C17542s.j(str, "host");
                this.f41542b = str;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && C17542s.e(this.f41542b, ((a) obj).f41542b);
            }

            public int hashCode() {
                return this.f41542b.hashCode();
            }

            public String toString() {
                return "Success: SCT not enabled for " + this.f41542b;
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"La7/m$c$b;", "La7/m$c;", "Lr7/e$a;", "logListResult", "<init>", "(Lr7/e$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lr7/e$a;", "getLogListResult", "()Lr7/e$a;", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class b implements c {

            /* renamed from: b  reason: collision with root package name */
            private final C8703e.a f41543b;

            public b(C8703e.a aVar) {
                C17542s.j(aVar, "logListResult");
                this.f41543b = aVar;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && C17542s.e(this.f41543b, ((b) obj).f41543b);
            }

            public int hashCode() {
                return this.f41543b.hashCode();
            }

            public String toString() {
                return "Success: SCT checks disabled as stale log list";
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, d2 = {"La7/m$c$c;", "La7/m$c;", "", "host", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "getHost", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: a7.m$c$c  reason: collision with other inner class name */
        public static final class C0733c implements c {

            /* renamed from: b  reason: collision with root package name */
            private final String f41544b;

            public C0733c(String str) {
                C17542s.j(str, "host");
                this.f41544b = str;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0733c) && C17542s.e(this.f41544b, ((C0733c) obj).f41544b);
            }

            public int hashCode() {
                return this.f41544b.hashCode();
            }

            public String toString() {
                return "Success: SCT not enabled for insecure connection to " + this.f41544b;
            }
        }

        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0002\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"La7/m$c$d;", "La7/m$c;", "originalVerificationResult", "Lr7/e;", "originalLogListResult", "<init>", "(La7/m$c;Lr7/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "La7/m$c;", "getOriginalVerificationResult", "()La7/m$c;", "c", "Lr7/e;", "getOriginalLogListResult", "()Lr7/e;", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class d implements c {

            /* renamed from: b  reason: collision with root package name */
            private final c f41545b;

            /* renamed from: c  reason: collision with root package name */
            private final C8703e f41546c;

            public d(c cVar, C8703e eVar) {
                C17542s.j(cVar, "originalVerificationResult");
                C17542s.j(eVar, "originalLogListResult");
                this.f41545b = cVar;
                this.f41546c = eVar;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return C17542s.e(this.f41545b, dVar.f41545b) && C17542s.e(this.f41546c, dVar.f41546c);
            }

            public int hashCode() {
                return (this.f41545b.hashCode() * 31) + this.f41546c.hashCode();
            }

            public String toString() {
                return "StaleNetwork(originalVerificationResult=" + this.f41545b + ", originalLogListResult=" + this.f41546c + ')';
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"La7/m$c$e;", "La7/m$c;", "", "", "La7/l;", "scts", "<init>", "(Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/util/Map;", "getScts", "()Ljava/util/Map;", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class e implements c {

            /* renamed from: b  reason: collision with root package name */
            private final Map<String, l> f41547b;

            public e(Map<String, ? extends l> map) {
                C17542s.j(map, "scts");
                this.f41547b = map;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && C17542s.e(this.f41547b, ((e) obj).f41547b);
            }

            public int hashCode() {
                return this.f41547b.hashCode();
            }

            public String toString() {
                return "Success: SCT trusted logs " + m.f41532a.b(this.f41547b);
            }
        }
    }
}
