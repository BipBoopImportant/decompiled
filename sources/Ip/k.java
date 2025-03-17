package ip;

import fI.C17221b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\b&\u0018\u0000 \u0017*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003:\u0006\u000e\u0018\u0016\u0010\f\u0017B5\b\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00018\u0000\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0006\u001a\u0004\u0018\u00018\u00008\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\f\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\t\u001a\u0004\u0018\u00018\u00018\u0016X\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0019"}, d2 = {"Lip/k;", "T", "F", "", "Lip/k$e;", "status", "data", "", "errorMessage", "errorData", "<init>", "(Lip/k$e;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V", "a", "Lip/k$e;", "c", "()Lip/k$e;", "b", "Ljava/lang/Object;", "()Ljava/lang/Object;", "Ljava/lang/String;", "getErrorMessage", "()Ljava/lang/String;", "d", "e", "f", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class k<T, F> {

    /* renamed from: e  reason: collision with root package name */
    public static final a f98528e = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final e f98529a;

    /* renamed from: b  reason: collision with root package name */
    private final T f98530b;

    /* renamed from: c  reason: collision with root package name */
    private final String f98531c;

    /* renamed from: d  reason: collision with root package name */
    private final F f98532d;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0007\"\u0004\b\u0002\u0010\u0004\"\u0004\b\u0003\u0010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00018\u0002¢\u0006\u0004\b\b\u0010\tJ-\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0007\"\u0004\b\u0002\u0010\u0004\"\u0004\b\u0003\u0010\u00052\u0006\u0010\n\u001a\u00028\u0002¢\u0006\u0004\b\u000b\u0010\tJI\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0007\"\u0004\b\u0002\u0010\u0004\"\u0004\b\u0003\u0010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00018\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00018\u0002¢\u0006\u0004\b\u000f\u0010\u0010JI\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0007\"\u0004\b\u0002\u0010\u0004\"\u0004\b\u0003\u0010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00018\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00018\u0002¢\u0006\u0004\b\u0011\u0010\u0010¨\u0006\u0012"}, d2 = {"Lip/k$a;", "", "<init>", "()V", "T", "F", "partialData", "Lip/k;", "c", "(Ljava/lang/Object;)Lip/k;", "data", "g", "", "errorMessage", "errorData", "e", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)Lip/k;", "a", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ k b(a aVar, String str, Object obj, Object obj2, int i10, Object obj3) {
            if ((i10 & 1) != 0) {
                str = null;
            }
            if ((i10 & 2) != 0) {
                obj = null;
            }
            if ((i10 & 4) != 0) {
                obj2 = null;
            }
            return aVar.a(str, obj, obj2);
        }

        public static /* synthetic */ k d(a aVar, Object obj, int i10, Object obj2) {
            if ((i10 & 1) != 0) {
                obj = null;
            }
            return aVar.c(obj);
        }

        public static /* synthetic */ k f(a aVar, String str, Object obj, Object obj2, int i10, Object obj3) {
            if ((i10 & 1) != 0) {
                str = null;
            }
            if ((i10 & 2) != 0) {
                obj = null;
            }
            if ((i10 & 4) != 0) {
                obj2 = null;
            }
            return aVar.e(str, obj, obj2);
        }

        public final <T, F> k<T, F> a(String str, F f10, T t10) {
            return new b(str, f10, t10);
        }

        public final <T, F> k<T, F> c(T t10) {
            return new c(t10);
        }

        public final <T, F> k<T, F> e(String str, F f10, T t10) {
            return new d(str, f10, t10);
        }

        public final <T, F> k<T, F> g(T t10) {
            return new f(t10);
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0003B+\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00018\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00018\u0002¢\u0006\u0004\b\b\u0010\tJ@\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00018\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00018\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00018\u00038\u0016X\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00018\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001c¨\u0006\u001f"}, d2 = {"Lip/k$b;", "T", "F", "Lip/k;", "", "errorMessage", "errorData", "partialData", "<init>", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V", "d", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)Lip/k$b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "f", "Ljava/lang/String;", "getErrorMessage", "g", "Ljava/lang/Object;", "b", "()Ljava/lang/Object;", "h", "getPartialData", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b<T, F> extends k<T, F> {

        /* renamed from: f  reason: collision with root package name */
        private final String f98533f;

        /* renamed from: g  reason: collision with root package name */
        private final F f98534g;

        /* renamed from: h  reason: collision with root package name */
        private final T f98535h;

        public b() {
            this((String) null, (Object) null, (Object) null, 7, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ b e(b bVar, String str, F f10, T t10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = bVar.f98533f;
            }
            if ((i10 & 2) != 0) {
                f10 = bVar.f98534g;
            }
            if ((i10 & 4) != 0) {
                t10 = bVar.f98535h;
            }
            return bVar.d(str, f10, t10);
        }

        public F b() {
            return this.f98534g;
        }

        public final b<T, F> d(String str, F f10, T t10) {
            return new b<>(str, f10, t10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return C17542s.e(this.f98533f, bVar.f98533f) && C17542s.e(this.f98534g, bVar.f98534g) && C17542s.e(this.f98535h, bVar.f98535h);
        }

        public int hashCode() {
            String str = this.f98533f;
            int i10 = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            F f10 = this.f98534g;
            int hashCode2 = (hashCode + (f10 == null ? 0 : f10.hashCode())) * 31;
            T t10 = this.f98535h;
            if (t10 != null) {
                i10 = t10.hashCode();
            }
            return hashCode2 + i10;
        }

        public String toString() {
            String str = this.f98533f;
            F f10 = this.f98534g;
            T t10 = this.f98535h;
            return "Error(errorMessage=" + str + ", errorData=" + f10 + ", partialData=" + t10 + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ b(String str, Object obj, Object obj2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : obj, (i10 & 4) != 0 ? null : obj2);
        }

        public b(String str, F f10, T t10) {
            super(e.ERROR, t10, str, f10);
            this.f98533f = str;
            this.f98534g = f10;
            this.f98535h = t10;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0003B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00018\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0004\u001a\u0004\u0018\u00018\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lip/k$c;", "T", "F", "Lip/k;", "value", "<init>", "(Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "f", "Ljava/lang/Object;", "getValue", "()Ljava/lang/Object;", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c<T, F> extends k<T, F> {

        /* renamed from: f  reason: collision with root package name */
        private final T f98536f;

        public c(T t10) {
            super(e.LOADING, t10, (String) null, (Object) null, 12, (DefaultConstructorMarker) null);
            this.f98536f = t10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && C17542s.e(this.f98536f, ((c) obj).f98536f);
        }

        public int hashCode() {
            T t10 = this.f98536f;
            if (t10 == null) {
                return 0;
            }
            return t10.hashCode();
        }

        public String toString() {
            T t10 = this.f98536f;
            return "Loading(value=" + t10 + ")";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0003B+\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00018\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00018\u0002¢\u0006\u0004\b\b\u0010\tJ@\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00018\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00018\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00018\u00038\u0016X\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00018\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001c¨\u0006\u001f"}, d2 = {"Lip/k$d;", "T", "F", "Lip/k;", "", "errorMessage", "errorData", "partialData", "<init>", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V", "d", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)Lip/k$d;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "f", "Ljava/lang/String;", "getErrorMessage", "g", "Ljava/lang/Object;", "b", "()Ljava/lang/Object;", "h", "getPartialData", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d<T, F> extends k<T, F> {

        /* renamed from: f  reason: collision with root package name */
        private final String f98537f;

        /* renamed from: g  reason: collision with root package name */
        private final F f98538g;

        /* renamed from: h  reason: collision with root package name */
        private final T f98539h;

        public d() {
            this((String) null, (Object) null, (Object) null, 7, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ d e(d dVar, String str, F f10, T t10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = dVar.f98537f;
            }
            if ((i10 & 2) != 0) {
                f10 = dVar.f98538g;
            }
            if ((i10 & 4) != 0) {
                t10 = dVar.f98539h;
            }
            return dVar.d(str, f10, t10);
        }

        public F b() {
            return this.f98538g;
        }

        public final d<T, F> d(String str, F f10, T t10) {
            return new d<>(str, f10, t10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return C17542s.e(this.f98537f, dVar.f98537f) && C17542s.e(this.f98538g, dVar.f98538g) && C17542s.e(this.f98539h, dVar.f98539h);
        }

        public int hashCode() {
            String str = this.f98537f;
            int i10 = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            F f10 = this.f98538g;
            int hashCode2 = (hashCode + (f10 == null ? 0 : f10.hashCode())) * 31;
            T t10 = this.f98539h;
            if (t10 != null) {
                i10 = t10.hashCode();
            }
            return hashCode2 + i10;
        }

        public String toString() {
            String str = this.f98537f;
            F f10 = this.f98538g;
            T t10 = this.f98539h;
            return "NoNetworkError(errorMessage=" + str + ", errorData=" + f10 + ", partialData=" + t10 + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ d(String str, Object obj, Object obj2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : obj, (i10 & 4) != 0 ? null : obj2);
        }

        public d(String str, F f10, T t10) {
            super(e.NO_NETWORK, t10, str, f10);
            this.f98537f = str;
            this.f98538g = f10;
            this.f98539h = t10;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lip/k$e;", "", "<init>", "(Ljava/lang/String;I)V", "LOADING", "SUCCESS", "NO_NETWORK", "ERROR", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum e {
        LOADING,
        SUCCESS,
        NO_NETWORK,
        ERROR;

        static {
            e[] a10;
            $ENTRIES = C17221b.a(a10);
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00028\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\u00028\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lip/k$f;", "T", "F", "Lip/k;", "value", "<init>", "(Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "f", "Ljava/lang/Object;", "d", "()Ljava/lang/Object;", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class f<T, F> extends k<T, F> {

        /* renamed from: f  reason: collision with root package name */
        private final T f98540f;

        public f(T t10) {
            super(e.SUCCESS, t10, (String) null, (Object) null, 12, (DefaultConstructorMarker) null);
            this.f98540f = t10;
        }

        public final T d() {
            return this.f98540f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && C17542s.e(this.f98540f, ((f) obj).f98540f);
        }

        public int hashCode() {
            T t10 = this.f98540f;
            if (t10 == null) {
                return 0;
            }
            return t10.hashCode();
        }

        public String toString() {
            T t10 = this.f98540f;
            return "Success(value=" + t10 + ")";
        }
    }

    protected k(e eVar, T t10, String str, F f10) {
        C17542s.j(eVar, "status");
        this.f98529a = eVar;
        this.f98530b = t10;
        this.f98531c = str;
        this.f98532d = f10;
    }

    public final T a() {
        return this.f98530b;
    }

    public F b() {
        return this.f98532d;
    }

    public final e c() {
        return this.f98529a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(e eVar, Object obj, String str, Object obj2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(eVar, (i10 & 2) != 0 ? null : obj, (i10 & 4) != 0 ? null : str, (i10 & 8) != 0 ? null : obj2);
    }
}
