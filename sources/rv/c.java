package Rv;

import Op.c1;
import Vv.u;
import com.adjust.sdk.Constants;
import fI.C17221b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"LRv/c;", "", "d", "b", "e", "f", "g", "h", "c", "i", "a", "LRv/c$a;", "LRv/c$b;", "LRv/c$c;", "LRv/c$d;", "LRv/c$e;", "LRv/c$f;", "LRv/c$g;", "LRv/c$h;", "LRv/c$i;", "membership-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface c {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"LRv/c$a;", "LRv/c;", "d", "a", "b", "c", "f", "e", "g", "LRv/c$a$a;", "LRv/c$a$b;", "LRv/c$a$c;", "LRv/c$a$d;", "LRv/c$a$e;", "LRv/c$a$f;", "LRv/c$a$g;", "membership-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface a extends c {

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0014\u0010\b¨\u0006\u0015"}, d2 = {"LRv/c$a$a;", "LRv/c$a;", "", "id", "applink", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "membership-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Rv.c$a$a  reason: collision with other inner class name */
        public static final class C0640a implements a {

            /* renamed from: a  reason: collision with root package name */
            private final String f39760a;

            /* renamed from: b  reason: collision with root package name */
            private final String f39761b;

            public C0640a(String str, String str2) {
                C17542s.j(str, "id");
                C17542s.j(str2, "applink");
                this.f39760a = str;
                this.f39761b = str2;
            }

            public final String b() {
                return this.f39761b;
            }

            public final String c() {
                return this.f39760a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0640a)) {
                    return false;
                }
                C0640a aVar = (C0640a) obj;
                return C17542s.e(this.f39760a, aVar.f39760a) && C17542s.e(this.f39761b, aVar.f39761b);
            }

            public int hashCode() {
                return (this.f39760a.hashCode() * 31) + this.f39761b.hashCode();
            }

            public String toString() {
                String str = this.f39760a;
                String str2 = this.f39761b;
                return "Benefit(id=" + str + ", applink=" + str2 + ")";
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LRv/c$a$b;", "LRv/c$a;", "b", "a", "LRv/c$a$b$a;", "LRv/c$a$b$b;", "membership-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public interface b extends a {

            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LRv/c$a$b$a;", "LRv/c$a$b;", "LIq/f;", "action", "<init>", "(LIq/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LIq/f;", "b", "()LIq/f;", "membership-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Rv.c$a$b$a  reason: collision with other inner class name */
            public static final class C0641a implements b {

                /* renamed from: a  reason: collision with root package name */
                private final Iq.f f39762a;

                public C0641a(Iq.f fVar) {
                    C17542s.j(fVar, "action");
                    this.f39762a = fVar;
                }

                public final Iq.f b() {
                    return this.f39762a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C0641a) && C17542s.e(this.f39762a, ((C0641a) obj).f39762a);
                }

                public int hashCode() {
                    return this.f39762a.hashCode();
                }

                public String toString() {
                    Iq.f fVar = this.f39762a;
                    return "CarouselAction(action=" + fVar + ")";
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LRv/c$a$b$b;", "LRv/c$a$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "membership-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Rv.c$a$b$b  reason: collision with other inner class name */
            public static final class C0642b implements b {

                /* renamed from: a  reason: collision with root package name */
                public static final C0642b f39763a = new C0642b();

                private C0642b() {
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof C0642b);
                }

                public int hashCode() {
                    return 173836303;
                }

                public String toString() {
                    return "Hub";
                }
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0003R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0001\u0001\u0006¨\u0006\u0007"}, d2 = {"LRv/c$a$c;", "LRv/c$a;", "", "a", "()Ljava/lang/String;", "deeplink", "LRv/c$a$c$a;", "membership-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Rv.c$a$c  reason: collision with other inner class name */
        public interface C0643c extends a {

            @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LRv/c$a$c$a;", "LRv/c$a$c;", "c", "d", "a", "b", "LRv/c$a$c$a$a;", "LRv/c$a$c$a$b;", "LRv/c$a$c$a$c;", "LRv/c$a$c$a$d;", "membership-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Rv.c$a$c$a  reason: collision with other inner class name */
            public interface C0644a extends C0643c {

                @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"LRv/c$a$c$a$a;", "LRv/c$a$c$a;", "", "deeplink", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "membership-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
                /* renamed from: Rv.c$a$c$a$a  reason: collision with other inner class name */
                public static final class C0645a implements C0644a {

                    /* renamed from: a  reason: collision with root package name */
                    private final String f39764a;

                    public C0645a(String str) {
                        C17542s.j(str, Constants.DEEPLINK);
                        this.f39764a = str;
                    }

                    public String a() {
                        return this.f39764a;
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof C0645a) && C17542s.e(this.f39764a, ((C0645a) obj).f39764a);
                    }

                    public int hashCode() {
                        return this.f39764a.hashCode();
                    }

                    public String toString() {
                        String str = this.f39764a;
                        return "LatestSpace(deeplink=" + str + ")";
                    }
                }

                @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"LRv/c$a$c$a$b;", "LRv/c$a$c$a;", "", "deeplink", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "membership-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
                /* renamed from: Rv.c$a$c$a$b */
                public static final class b implements C0644a {

                    /* renamed from: a  reason: collision with root package name */
                    private final String f39765a;

                    public b(String str) {
                        C17542s.j(str, Constants.DEEPLINK);
                        this.f39765a = str;
                    }

                    public String a() {
                        return this.f39765a;
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof b) && C17542s.e(this.f39765a, ((b) obj).f39765a);
                    }

                    public int hashCode() {
                        return this.f39765a.hashCode();
                    }

                    public String toString() {
                        String str = this.f39765a;
                        return "SavedRooms(deeplink=" + str + ")";
                    }
                }

                @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"LRv/c$a$c$a$c;", "LRv/c$a$c$a;", "", "deeplink", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "membership-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
                /* renamed from: Rv.c$a$c$a$c  reason: collision with other inner class name */
                public static final class C0646c implements C0644a {

                    /* renamed from: a  reason: collision with root package name */
                    private final String f39766a;

                    public C0646c(String str) {
                        C17542s.j(str, Constants.DEEPLINK);
                        this.f39766a = str;
                    }

                    public String a() {
                        return this.f39766a;
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof C0646c) && C17542s.e(this.f39766a, ((C0646c) obj).f39766a);
                    }

                    public int hashCode() {
                        return this.f39766a.hashCode();
                    }

                    public String toString() {
                        String str = this.f39766a;
                        return "StartScan(deeplink=" + str + ")";
                    }
                }

                @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"LRv/c$a$c$a$d;", "LRv/c$a$c$a;", "", "deeplink", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "membership-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
                /* renamed from: Rv.c$a$c$a$d */
                public static final class d implements C0644a {

                    /* renamed from: a  reason: collision with root package name */
                    private final String f39767a;

                    public d(String str) {
                        C17542s.j(str, Constants.DEEPLINK);
                        this.f39767a = str;
                    }

                    public String a() {
                        return this.f39767a;
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof d) && C17542s.e(this.f39767a, ((d) obj).f39767a);
                    }

                    public int hashCode() {
                        return this.f39767a.hashCode();
                    }

                    public String toString() {
                        String str = this.f39767a;
                        return "TryShowroom(deeplink=" + str + ")";
                    }
                }
            }

            String a();
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0014\u0010\b¨\u0006\u0015"}, d2 = {"LRv/c$a$d;", "LRv/c$a;", "", "orderNumber", "liteId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "membership-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class d implements a {

            /* renamed from: a  reason: collision with root package name */
            private final String f39768a;

            /* renamed from: b  reason: collision with root package name */
            private final String f39769b;

            public d(String str, String str2) {
                C17542s.j(str, "orderNumber");
                C17542s.j(str2, "liteId");
                this.f39768a = str;
                this.f39769b = str2;
            }

            public final String b() {
                return this.f39769b;
            }

            public final String c() {
                return this.f39768a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return C17542s.e(this.f39768a, dVar.f39768a) && C17542s.e(this.f39769b, dVar.f39769b);
            }

            public int hashCode() {
                return (this.f39768a.hashCode() * 31) + this.f39769b.hashCode();
            }

            public String toString() {
                String str = this.f39768a;
                String str2 = this.f39769b;
                return "OpenAppointment(orderNumber=" + str + ", liteId=" + str2 + ")";
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LRv/c$a$e;", "LRv/c$a;", "a", "b", "LRv/c$a$e$a;", "LRv/c$a$e$b;", "membership-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public interface e extends a {

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LRv/c$a$e$a;", "LRv/c$a$e;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "membership-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Rv.c$a$e$a  reason: collision with other inner class name */
            public static final class C0647a implements e {

                /* renamed from: a  reason: collision with root package name */
                public static final C0647a f39770a = new C0647a();

                private C0647a() {
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof C0647a);
                }

                public int hashCode() {
                    return 1625946807;
                }

                public String toString() {
                    return "OpenHistory";
                }
            }

            @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"LRv/c$a$e$b;", "LRv/c$a$e;", "", "id", "LHx/f;", "type", "<init>", "(Ljava/lang/String;LHx/f;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "LHx/f;", "c", "()LHx/f;", "membership-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class b implements e {

                /* renamed from: a  reason: collision with root package name */
                private final String f39771a;

                /* renamed from: b  reason: collision with root package name */
                private final Hx.f f39772b;

                public b(String str, Hx.f fVar) {
                    C17542s.j(str, "id");
                    C17542s.j(fVar, "type");
                    this.f39771a = str;
                    this.f39772b = fVar;
                }

                public final String b() {
                    return this.f39771a;
                }

                public final Hx.f c() {
                    return this.f39772b;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof b)) {
                        return false;
                    }
                    b bVar = (b) obj;
                    return C17542s.e(this.f39771a, bVar.f39771a) && this.f39772b == bVar.f39772b;
                }

                public int hashCode() {
                    return (this.f39771a.hashCode() * 31) + this.f39772b.hashCode();
                }

                public String toString() {
                    String str = this.f39771a;
                    Hx.f fVar = this.f39772b;
                    return "OpenPurchase(id=" + str + ", type=" + fVar + ")";
                }
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRv/c$a$f;", "LRv/c$a;", "membership-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public interface f extends a {
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u001e\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001f¨\u0006 "}, d2 = {"LRv/c$a$g;", "LRv/c$a;", "", "<init>", "(Ljava/lang/String;I)V", "About", "Addresses", "BookAppointment", "ChangePassword", "CommunicationPreferences", "CustomerSupport", "DataPreferences", "DeleteAccount", "DelightContent", "FamilyCardToolbar", "GiftCard", "HomeProjects", "Inbox", "Kreativ", "Language", "Login", "Logout", "MemberDiscounts", "PolicesAndToC", "PreferredStoreLocal", "PreferredStoreProfile", "ProfileDetails", "Signup", "TakeATour", "Theme", "Upgrade", "Wallet", "membership-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public enum g implements a {
            About,
            Addresses,
            BookAppointment,
            ChangePassword,
            CommunicationPreferences,
            CustomerSupport,
            DataPreferences,
            DeleteAccount,
            DelightContent,
            FamilyCardToolbar,
            GiftCard,
            HomeProjects,
            Inbox,
            Kreativ,
            Language,
            Login,
            Logout,
            MemberDiscounts,
            PolicesAndToC,
            PreferredStoreLocal,
            PreferredStoreProfile,
            ProfileDetails,
            Signup,
            TakeATour,
            Theme,
            Upgrade,
            Wallet;

            static {
                g[] b10;
                $ENTRIES = C17221b.a(b10);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"LRv/c$b;", "LRv/c;", "", "<init>", "(Ljava/lang/String;I)V", "Confirmed", "Cancelled", "membership-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum b implements c {
        Confirmed,
        Cancelled;

        static {
            b[] b10;
            $ENTRIES = C17221b.a(b10);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LRv/c$c;", "LRv/c;", "", "", "itemNos", "<init>", "(Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "membership-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Rv.c$c  reason: collision with other inner class name */
    public static final class C0648c implements c {

        /* renamed from: a  reason: collision with root package name */
        private final List<String> f39773a;

        public C0648c(List<String> list) {
            C17542s.j(list, "itemNos");
            this.f39773a = list;
        }

        public final List<String> b() {
            return this.f39773a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0648c) && C17542s.e(this.f39773a, ((C0648c) obj).f39773a);
        }

        public int hashCode() {
            return this.f39773a.hashCode();
        }

        public String toString() {
            List<String> list = this.f39773a;
            return "MembershipDiscountsImpressionEvent(itemNos=" + list + ")";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LRv/c$d;", "LRv/c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "membership-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d implements c {

        /* renamed from: a  reason: collision with root package name */
        public static final d f39774a = new d();

        private d() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public int hashCode() {
            return -906449274;
        }

        public String toString() {
            return "MessageDismissed";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LRv/c$e;", "LRv/c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "membership-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class e implements c {

        /* renamed from: a  reason: collision with root package name */
        public static final e f39775a = new e();

        private e() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public int hashCode() {
            return -130937357;
        }

        public String toString() {
            return "NavigationCompleted";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LRv/c$f;", "LRv/c;", "LVv/u;", "result", "<init>", "(LVv/u;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LVv/u;", "b", "()LVv/u;", "membership-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class f implements c {

        /* renamed from: a  reason: collision with root package name */
        private final u f39776a;

        public f(u uVar) {
            C17542s.j(uVar, "result");
            this.f39776a = uVar;
        }

        public final u b() {
            return this.f39776a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && C17542s.e(this.f39776a, ((f) obj).f39776a);
        }

        public int hashCode() {
            return this.f39776a.hashCode();
        }

        public String toString() {
            u uVar = this.f39776a;
            return "NavigationResult(result=" + uVar + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LRv/c$g;", "LRv/c;", "LOp/c1;", "productEvent", "<init>", "(LOp/c1;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LOp/c1;", "b", "()LOp/c1;", "membership-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class g implements c {

        /* renamed from: a  reason: collision with root package name */
        private final c1 f39777a;

        public g(c1 c1Var) {
            C17542s.j(c1Var, "productEvent");
            this.f39777a = c1Var;
        }

        public final c1 b() {
            return this.f39777a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && C17542s.e(this.f39777a, ((g) obj).f39777a);
        }

        public int hashCode() {
            return this.f39777a.hashCode();
        }

        public String toString() {
            c1 c1Var = this.f39777a;
            return "ProductEvent(productEvent=" + c1Var + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LRv/c$h;", "LRv/c;", "Lzv/d;", "name", "<init>", "(Lzv/d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lzv/d;", "b", "()Lzv/d;", "membership-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class h implements c {

        /* renamed from: a  reason: collision with root package name */
        private final zv.d f39778a;

        public h(zv.d dVar) {
            C17542s.j(dVar, "name");
            this.f39778a = dVar;
        }

        public final zv.d b() {
            return this.f39778a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && this.f39778a == ((h) obj).f39778a;
        }

        public int hashCode() {
            return this.f39778a.hashCode();
        }

        public String toString() {
            zv.d dVar = this.f39778a;
            return "ScreenViewed(name=" + dVar + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LRv/c$i;", "LRv/c;", "LRv/l;", "tab", "<init>", "(LRv/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LRv/l;", "b", "()LRv/l;", "membership-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class i implements c {

        /* renamed from: a  reason: collision with root package name */
        private final l f39779a;

        public i(l lVar) {
            C17542s.j(lVar, "tab");
            this.f39779a = lVar;
        }

        public final l b() {
            return this.f39779a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && this.f39779a == ((i) obj).f39779a;
        }

        public int hashCode() {
            return this.f39779a.hashCode();
        }

        public String toString() {
            l lVar = this.f39779a;
            return "TabSelected(tab=" + lVar + ")";
        }
    }
}
