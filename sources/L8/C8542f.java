package l8;

import D8.c;
import j8.i;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0006\u0018\u0000 \u00172\u00020\u0001:\u0002\u0007\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001d\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\u0012\n\u0004\b\t\u0010\r\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0007\u0010\u000eR\u001a\u0010\u0016\u001a\u00020\u00128\u0006X\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0018"}, d2 = {"Ll8/f;", "", "Ll8/f$b;", "builder", "<init>", "(Ll8/f$b;)V", "", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "id", "", "I", "()I", "getCurrency$annotations", "()V", "currency", "", "c", "F", "()F", "value", "d", "library_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: l8.f  reason: case insensitive filesystem */
public final class C8542f {

    /* renamed from: d  reason: collision with root package name */
    public static final a f54809d = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f54810a;

    /* renamed from: b  reason: collision with root package name */
    private final int f54811b;

    /* renamed from: c  reason: collision with root package name */
    private final float f54812c;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u00020\b2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Ll8/f$a;", "", "<init>", "()V", "", "value", "", "currency", "Ll8/f$b;", "a", "(FI)Ll8/f$b;", "", "b", "(FLjava/lang/String;)Ll8/f$b;", "library_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: l8.f$a */
    public static final class a {
        private a() {
        }

        public final b a(float f10, int i10) {
            return new b(f10, i10);
        }

        public final b b(float f10, String str) {
            C17542s.j(str, "currency");
            return new b(f10, str);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u0000 \u001b2\u00020\u0001:\u0001\u000eB\u001b\b\u0016\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u001b\b\u0016\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\tJ\u0015\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fR$\u0010\n\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Ll8/f$b;", "", "", "value", "", "currency", "<init>", "(FI)V", "", "(FLjava/lang/String;)V", "id", "e", "(Ljava/lang/String;)Ll8/f$b;", "Ll8/f;", "a", "()Ll8/f;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "b", "I", "()I", "setCurrency", "(I)V", "F", "d", "()F", "setValue", "(F)V", "library_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: l8.f$b */
    public static final class b {

        /* renamed from: d  reason: collision with root package name */
        public static final a f54813d = new a((DefaultConstructorMarker) null);

        /* renamed from: e  reason: collision with root package name */
        private static final c f54814e = new c("TransactionBuilder");

        /* renamed from: a  reason: collision with root package name */
        private String f54815a;

        /* renamed from: b  reason: collision with root package name */
        private int f54816b;

        /* renamed from: c  reason: collision with root package name */
        private float f54817c;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ll8/f$b$a;", "", "<init>", "()V", "LD8/c;", "logger", "LD8/c;", "library_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: l8.f$b$a */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public b(float f10, int i10) {
            this.f54817c = f10;
            int c10 = i.f54089a.c(i10);
            this.f54816b = c10;
            if (c10 == -1) {
                c cVar = f54814e;
                cVar.j("Invalid currency code: \"" + i10 + "\". Transaction currency is set to \"unknown(-1)\".");
            }
        }

        public final C8542f a() {
            return new C8542f(this, (DefaultConstructorMarker) null);
        }

        public final int b() {
            return this.f54816b;
        }

        public final String c() {
            return this.f54815a;
        }

        public final float d() {
            return this.f54817c;
        }

        public final b e(String str) {
            C17542s.j(str, "id");
            this.f54815a = str;
            return this;
        }

        public b(float f10, String str) {
            C17542s.j(str, "currency");
            this.f54817c = f10;
            i iVar = i.f54089a;
            String upperCase = str.toUpperCase(Locale.ROOT);
            C17542s.i(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            int d10 = iVar.d(upperCase);
            this.f54816b = d10;
            if (d10 == -1) {
                c cVar = f54814e;
                cVar.j("Invalid currency string: \"" + str + "\". Transaction currency is set to \"unknown(-1)\".");
            }
        }
    }

    private C8542f(b bVar) {
        this.f54810a = bVar.c();
        this.f54811b = bVar.b();
        this.f54812c = bVar.d();
    }

    public final int a() {
        return this.f54811b;
    }

    public final String b() {
        return this.f54810a;
    }

    public final float c() {
        return this.f54812c;
    }

    public /* synthetic */ C8542f(b bVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar);
    }
}
