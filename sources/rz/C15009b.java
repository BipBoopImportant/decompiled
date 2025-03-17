package rz;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0011\r\tB%\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010\u0001\u0003\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lrz/b;", "", "", "httpCode", "", "errorType", "message", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "a", "I", "getHttpCode", "()I", "b", "Ljava/lang/String;", "getErrorType", "()Ljava/lang/String;", "c", "getMessage", "Lrz/b$a;", "Lrz/b$b;", "Lrz/b$c;", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: rz.b  reason: case insensitive filesystem */
public abstract class C15009b extends Throwable {

    /* renamed from: a  reason: collision with root package name */
    private final int f130804a;

    /* renamed from: b  reason: collision with root package name */
    private final String f130805b;

    /* renamed from: c  reason: collision with root package name */
    private final String f130806c;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0013B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u0014"}, d2 = {"Lrz/b$a;", "Lrz/b;", "", "httpCode", "", "errorType", "message", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "d", "I", "getHttpCode", "()I", "e", "Ljava/lang/String;", "getErrorType", "()Ljava/lang/String;", "f", "getMessage", "a", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: rz.b$a */
    public static class a extends C15009b {

        /* renamed from: d  reason: collision with root package name */
        private final int f130807d;

        /* renamed from: e  reason: collision with root package name */
        private final String f130808e;

        /* renamed from: f  reason: collision with root package name */
        private final String f130809f;

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\n¨\u0006\u001a"}, d2 = {"Lrz/b$a$a;", "Lrz/b$a;", "", "httpCode", "", "errorType", "message", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "g", "I", "getHttpCode", "h", "Ljava/lang/String;", "getErrorType", "i", "getMessage", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: rz.b$a$a  reason: collision with other inner class name */
        public static final class C3237a extends a {

            /* renamed from: g  reason: collision with root package name */
            private final int f130810g;

            /* renamed from: h  reason: collision with root package name */
            private final String f130811h;

            /* renamed from: i  reason: collision with root package name */
            private final String f130812i;

            public C3237a(int i10, String str, String str2) {
                super(i10, str, str2);
                this.f130810g = i10;
                this.f130811h = str;
                this.f130812i = str2;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3237a)) {
                    return false;
                }
                C3237a aVar = (C3237a) obj;
                return this.f130810g == aVar.f130810g && C17542s.e(this.f130811h, aVar.f130811h) && C17542s.e(this.f130812i, aVar.f130812i);
            }

            public String getMessage() {
                return this.f130812i;
            }

            public int hashCode() {
                int hashCode = Integer.hashCode(this.f130810g) * 31;
                String str = this.f130811h;
                int i10 = 0;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.f130812i;
                if (str2 != null) {
                    i10 = str2.hashCode();
                }
                return hashCode2 + i10;
            }

            public String toString() {
                int i10 = this.f130810g;
                String str = this.f130811h;
                String str2 = this.f130812i;
                return "ItemNotFound(httpCode=" + i10 + ", errorType=" + str + ", message=" + str2 + ")";
            }
        }

        public a(int i10, String str, String str2) {
            super(i10, str, str2, (DefaultConstructorMarker) null);
            this.f130807d = i10;
            this.f130808e = str;
            this.f130809f = str2;
        }

        public String getMessage() {
            return this.f130809f;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0013B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u0014"}, d2 = {"Lrz/b$c;", "Lrz/b;", "", "httpCode", "", "errorType", "message", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "d", "I", "getHttpCode", "()I", "e", "Ljava/lang/String;", "getErrorType", "()Ljava/lang/String;", "f", "getMessage", "a", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: rz.b$c */
    public static class c extends C15009b {

        /* renamed from: d  reason: collision with root package name */
        private final int f130816d;

        /* renamed from: e  reason: collision with root package name */
        private final String f130817e;

        /* renamed from: f  reason: collision with root package name */
        private final String f130818f;

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\n¨\u0006\u001a"}, d2 = {"Lrz/b$c$a;", "Lrz/b$a;", "", "httpCode", "", "errorType", "message", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "g", "I", "getHttpCode", "h", "Ljava/lang/String;", "getErrorType", "i", "getMessage", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: rz.b$c$a */
        public static final class a extends a {

            /* renamed from: g  reason: collision with root package name */
            private final int f130819g;

            /* renamed from: h  reason: collision with root package name */
            private final String f130820h;

            /* renamed from: i  reason: collision with root package name */
            private final String f130821i;

            public a(int i10, String str, String str2) {
                super(i10, str, str2);
                this.f130819g = i10;
                this.f130820h = str;
                this.f130821i = str2;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.f130819g == aVar.f130819g && C17542s.e(this.f130820h, aVar.f130820h) && C17542s.e(this.f130821i, aVar.f130821i);
            }

            public String getMessage() {
                return this.f130821i;
            }

            public int hashCode() {
                int hashCode = Integer.hashCode(this.f130819g) * 31;
                String str = this.f130820h;
                int i10 = 0;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.f130821i;
                if (str2 != null) {
                    i10 = str2.hashCode();
                }
                return hashCode2 + i10;
            }

            public String toString() {
                int i10 = this.f130819g;
                String str = this.f130820h;
                String str2 = this.f130821i;
                return "StoreClosed(httpCode=" + i10 + ", errorType=" + str + ", message=" + str2 + ")";
            }
        }

        public c(int i10, String str, String str2) {
            super(i10, str, str2, (DefaultConstructorMarker) null);
            this.f130816d = i10;
            this.f130817e = str;
            this.f130818f = str2;
        }

        public String getMessage() {
            return this.f130818f;
        }
    }

    public /* synthetic */ C15009b(int i10, String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, str, str2);
    }

    public String getMessage() {
        return this.f130806c;
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\n¨\u0006\u001a"}, d2 = {"Lrz/b$b;", "Lrz/b;", "", "httpCode", "", "errorType", "message", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "I", "getHttpCode", "e", "Ljava/lang/String;", "getErrorType", "f", "getMessage", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: rz.b$b  reason: collision with other inner class name */
    public static final class C3238b extends C15009b {

        /* renamed from: d  reason: collision with root package name */
        private final int f130813d;

        /* renamed from: e  reason: collision with root package name */
        private final String f130814e;

        /* renamed from: f  reason: collision with root package name */
        private final String f130815f;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C3238b(int i10, String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? Integer.MAX_VALUE : i10, (i11 & 2) != 0 ? C15010c.GENERIC_ERROR.j() : str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C3238b)) {
                return false;
            }
            C3238b bVar = (C3238b) obj;
            return this.f130813d == bVar.f130813d && C17542s.e(this.f130814e, bVar.f130814e) && C17542s.e(this.f130815f, bVar.f130815f);
        }

        public String getMessage() {
            return this.f130815f;
        }

        public int hashCode() {
            int hashCode = Integer.hashCode(this.f130813d) * 31;
            String str = this.f130814e;
            int i10 = 0;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f130815f;
            if (str2 != null) {
                i10 = str2.hashCode();
            }
            return hashCode2 + i10;
        }

        public String toString() {
            int i10 = this.f130813d;
            String str = this.f130814e;
            String str2 = this.f130815f;
            return "GenericError(httpCode=" + i10 + ", errorType=" + str + ", message=" + str2 + ")";
        }

        public C3238b(int i10, String str, String str2) {
            super(i10, str, str2, (DefaultConstructorMarker) null);
            this.f130813d = i10;
            this.f130814e = str;
            this.f130815f = str2;
        }
    }

    private C15009b(int i10, String str, String str2) {
        this.f130804a = i10;
        this.f130805b = str;
        this.f130806c = str2;
    }
}
