package yu;

import HJ.C15854t;
import XH.t;
import com.sugarcube.core.logger.DslKt;
import fI.C17220a;
import fI.C17221b;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001:\u0001\bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lyu/a;", "", "Lyu/a$a;", "status", "<init>", "(Lyu/a$a;)V", "", "isAppInDebug", "a", "(Z)Z", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lyu/a$a;", "getStatus", "()Lyu/a$a;", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: yu.a  reason: case insensitive filesystem */
public final class C12516a {

    /* renamed from: a  reason: collision with root package name */
    private final C2556a f107346a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0013\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lyu/a$a;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "Companion", "a", "UNKNOWN", "TEST", "LIVE", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yu.a$a  reason: collision with other inner class name */
    public enum C2556a {
        UNKNOWN((String) null),
        TEST("Test"),
        LIVE("Live");
        
        public static final C2557a Companion = null;
        private final String value;

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lyu/a$a$a;", "", "<init>", "()V", "", "value", "Lyu/a$a;", "a", "(Ljava/lang/String;)Lyu/a$a;", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: yu.a$a$a  reason: collision with other inner class name */
        public static final class C2557a {
            public /* synthetic */ C2557a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C2556a a(String str) {
                T t10;
                Iterator<T> it = C2556a.b().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t10 = null;
                        break;
                    }
                    t10 = it.next();
                    if (C17542s.e(((C2556a) t10).j(), str)) {
                        break;
                    }
                }
                C2556a aVar = (C2556a) t10;
                return aVar == null ? C2556a.UNKNOWN : aVar;
            }

            private C2557a() {
            }
        }

        static {
            C2556a[] a10;
            $ENTRIES = C17221b.a(a10);
            Companion = new C2557a((DefaultConstructorMarker) null);
        }

        private C2556a(String str) {
            this.value = str;
        }

        public static C17220a<C2556a> b() {
            return $ENTRIES;
        }

        public final String j() {
            return this.value;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yu.a$b */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f107347a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                yu.a$a[] r0 = yu.C12516a.C2556a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                yu.a$a r1 = yu.C12516a.C2556a.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                yu.a$a r1 = yu.C12516a.C2556a.TEST     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                yu.a$a r1 = yu.C12516a.C2556a.LIVE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f107347a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: yu.C12516a.b.<clinit>():void");
        }
    }

    public C12516a(C2556a aVar) {
        C17542s.j(aVar, "status");
        this.f107346a = aVar;
    }

    public final boolean a(boolean z10) {
        int i10 = b.f107347a[this.f107346a.ordinal()];
        if (i10 == 1) {
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
                    String a10 = C11818a.a("StoreWayfindingDetails has unknown status", (Throwable) null);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = C12516a.class.getName();
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
            return false;
        } else if (i10 == 2) {
            return z10;
        } else {
            if (i10 == 3) {
                return true;
            }
            throw new t();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C12516a) && this.f107346a == ((C12516a) obj).f107346a;
    }

    public int hashCode() {
        return this.f107346a.hashCode();
    }

    public String toString() {
        C2556a aVar = this.f107346a;
        return "StoreWayfindingDetails(status=" + aVar + ")";
    }
}
