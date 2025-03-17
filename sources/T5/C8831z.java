package t5;

import android.net.NetworkRequest;
import androidx.work.C7055y;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u000fB\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00138G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lt5/z;", "", "wrapped", "<init>", "(Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Object;", "getWrapped", "()Ljava/lang/Object;", "Landroid/net/NetworkRequest;", "b", "()Landroid/net/NetworkRequest;", "networkRequest", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: t5.z  reason: case insensitive filesystem */
public final class C8831z {

    /* renamed from: b  reason: collision with root package name */
    public static final a f56628b = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final String f56629c;

    /* renamed from: a  reason: collision with root package name */
    private final Object f56630a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lt5/z$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: t5.z$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a() {
            return C8831z.f56629c;
        }

        private a() {
        }
    }

    static {
        String i10 = C7055y.i("NetworkRequestCompat");
        C17542s.i(i10, "tagWithPrefix(\"NetworkRequestCompat\")");
        f56629c = i10;
    }

    public C8831z() {
        this((Object) null, 1, (DefaultConstructorMarker) null);
    }

    public final NetworkRequest b() {
        return (NetworkRequest) this.f56630a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8831z) && C17542s.e(this.f56630a, ((C8831z) obj).f56630a);
    }

    public int hashCode() {
        Object obj = this.f56630a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        return "NetworkRequestCompat(wrapped=" + this.f56630a + ')';
    }

    public C8831z(Object obj) {
        this.f56630a = obj;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8831z(Object obj, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : obj);
    }
}
