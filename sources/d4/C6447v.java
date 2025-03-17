package D4;

import com.oppwa.mobile.connect.checkout.uicomponent.UiComponentContainer;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0006\t\nB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\u0001\u0003\u000b\f\r¨\u0006\u000e"}, d2 = {"LD4/v;", "", "", "endOfPaginationReached", "<init>", "(Z)V", "a", "Z", "()Z", "b", "c", "LD4/v$a;", "LD4/v$b;", "LD4/v$c;", "paging-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: D4.v  reason: case insensitive filesystem */
public abstract class C6447v {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f34454a;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LD4/v$a;", "LD4/v;", "", "error", "<init>", "(Ljava/lang/Throwable;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "b", "Ljava/lang/Throwable;", "getError", "()Ljava/lang/Throwable;", "paging-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: D4.v$a */
    public static final class a extends C6447v {

        /* renamed from: b  reason: collision with root package name */
        private final Throwable f34455b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Throwable th2) {
            super(false, (DefaultConstructorMarker) null);
            C17542s.j(th2, UiComponentContainer.RESULT_ERROR);
            this.f34455b = th2;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                return a() == aVar.a() && C17542s.e(this.f34455b, aVar.f34455b);
            }
        }

        public int hashCode() {
            return Boolean.hashCode(a()) + this.f34455b.hashCode();
        }

        public String toString() {
            return "Error(endOfPaginationReached=" + a() + ", error=" + this.f34455b + ')';
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LD4/v$b;", "LD4/v;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "paging-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: D4.v$b */
    public static final class b extends C6447v {

        /* renamed from: b  reason: collision with root package name */
        public static final b f34456b = new b();

        private b() {
            super(false, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return (obj instanceof b) && a() == ((b) obj).a();
        }

        public int hashCode() {
            return Boolean.hashCode(a());
        }

        public String toString() {
            return "Loading(endOfPaginationReached=" + a() + ')';
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00102\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"LD4/v$c;", "LD4/v;", "", "endOfPaginationReached", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "b", "a", "paging-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: D4.v$c */
    public static final class c extends C6447v {

        /* renamed from: b  reason: collision with root package name */
        public static final a f34457b = new a((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public static final c f34458c = new c(true);
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public static final c f34459d = new c(false);

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0000X\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"LD4/v$c$a;", "", "<init>", "()V", "LD4/v$c;", "Complete", "LD4/v$c;", "a", "()LD4/v$c;", "Incomplete", "b", "paging-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: D4.v$c$a */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final c a() {
                return c.f34458c;
            }

            public final c b() {
                return c.f34459d;
            }

            private a() {
            }
        }

        public c(boolean z10) {
            super(z10, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return (obj instanceof c) && a() == ((c) obj).a();
        }

        public int hashCode() {
            return Boolean.hashCode(a());
        }

        public String toString() {
            return "NotLoading(endOfPaginationReached=" + a() + ')';
        }
    }

    public /* synthetic */ C6447v(boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10);
    }

    public final boolean a() {
        return this.f34454a;
    }

    private C6447v(boolean z10) {
        this.f34454a = z10;
    }
}
