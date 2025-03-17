package f5;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u000b\u0003\u0007R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0001"}, d2 = {"Lf5/c;", "Lf5/a;", "", "b", "()Z", "isSeparating", "Lf5/c$a;", "c", "()Lf5/c$a;", "occlusionType", "Lf5/c$b;", "a", "()Lf5/c$b;", "orientation", "Lf5/c$c;", "getState", "()Lf5/c$c;", "state", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: f5.c  reason: case insensitive filesystem */
public interface C7847c extends C7845a {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 \n2\u00020\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lf5/c$a;", "", "", "description", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: f5.c$a */
    public static final class a {

        /* renamed from: b  reason: collision with root package name */
        public static final C0839a f51113b = new C0839a((DefaultConstructorMarker) null);

        /* renamed from: c  reason: collision with root package name */
        public static final a f51114c = new a("NONE");

        /* renamed from: d  reason: collision with root package name */
        public static final a f51115d = new a("FULL");

        /* renamed from: a  reason: collision with root package name */
        private final String f51116a;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lf5/c$a$a;", "", "<init>", "()V", "Lf5/c$a;", "FULL", "Lf5/c$a;", "NONE", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: f5.c$a$a  reason: collision with other inner class name */
        public static final class C0839a {
            public /* synthetic */ C0839a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C0839a() {
            }
        }

        private a(String str) {
            this.f51116a = str;
        }

        public String toString() {
            return this.f51116a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 \n2\u00020\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lf5/c$b;", "", "", "description", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: f5.c$b */
    public static final class b {

        /* renamed from: b  reason: collision with root package name */
        public static final a f51117b = new a((DefaultConstructorMarker) null);

        /* renamed from: c  reason: collision with root package name */
        public static final b f51118c = new b("VERTICAL");

        /* renamed from: d  reason: collision with root package name */
        public static final b f51119d = new b("HORIZONTAL");

        /* renamed from: a  reason: collision with root package name */
        private final String f51120a;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lf5/c$b$a;", "", "<init>", "()V", "Lf5/c$b;", "HORIZONTAL", "Lf5/c$b;", "VERTICAL", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: f5.c$b$a */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        private b(String str) {
            this.f51120a = str;
        }

        public String toString() {
            return this.f51120a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 \n2\u00020\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lf5/c$c;", "", "", "description", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: f5.c$c  reason: collision with other inner class name */
    public static final class C0840c {

        /* renamed from: b  reason: collision with root package name */
        public static final a f51121b = new a((DefaultConstructorMarker) null);

        /* renamed from: c  reason: collision with root package name */
        public static final C0840c f51122c = new C0840c("FLAT");

        /* renamed from: d  reason: collision with root package name */
        public static final C0840c f51123d = new C0840c("HALF_OPENED");

        /* renamed from: a  reason: collision with root package name */
        private final String f51124a;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lf5/c$c$a;", "", "<init>", "()V", "Lf5/c$c;", "FLAT", "Lf5/c$c;", "HALF_OPENED", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: f5.c$c$a */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        private C0840c(String str) {
            this.f51124a = str;
        }

        public String toString() {
            return this.f51124a;
        }
    }

    b a();

    boolean b();

    a c();

    C0840c getState();
}
