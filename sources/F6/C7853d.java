package f6;

import T5.n;
import android.content.Context;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import r6.C8695c;
import r6.C8696d;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\bf\u0018\u00002\u00020\u0001:\u0003\u0005\r\u0011J\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦\u0002¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H¦\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH&¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\f\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0013À\u0006\u0001"}, d2 = {"Lf6/d;", "", "Lf6/d$b;", "key", "Lf6/d$c;", "b", "(Lf6/d$b;)Lf6/d$c;", "value", "LXH/N;", "d", "(Lf6/d$b;Lf6/d$c;)V", "", "size", "c", "(J)V", "clear", "()V", "a", "()J", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: f6.d  reason: case insensitive filesystem */
public interface C7853d {

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\u00002\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR\u001e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00138\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0014¨\u0006\u0017"}, d2 = {"Lf6/d$a;", "", "<init>", "()V", "Landroid/content/Context;", "Lcoil3/PlatformContext;", "context", "", "percent", "c", "(Landroid/content/Context;D)Lf6/d$a;", "Lf6/d;", "b", "()Lf6/d;", "Lkotlin/Function0;", "", "a", "LnI/a;", "maxSizeBytesFactory", "", "Z", "strongReferencesEnabled", "weakReferencesEnabled", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: f6.d$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private C17631a<Long> f51176a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f51177b = true;

        /* renamed from: c  reason: collision with root package name */
        private boolean f51178c = true;

        public static /* synthetic */ a d(a aVar, Context context, double d10, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                d10 = C8696d.a(context);
            }
            return aVar.c(context, d10);
        }

        /* access modifiers changed from: private */
        public static final long e(double d10, Context context) {
            return (long) (d10 * ((double) C8696d.g(context)));
        }

        public final C7853d b() {
            i iVar;
            j hVar = this.f51178c ? new C7857h() : new C7851b();
            if (this.f51177b) {
                C17631a<Long> aVar = this.f51176a;
                if (aVar != null) {
                    long longValue = aVar.invoke().longValue();
                    iVar = longValue > 0 ? new C7856g(longValue, hVar) : new C7850a(hVar);
                } else {
                    throw new IllegalStateException("maxSizeBytesFactory == null");
                }
            } else {
                iVar = new C7850a(hVar);
            }
            return new C7855f(iVar, hVar);
        }

        public final a c(Context context, double d10) {
            if (0.0d > d10 || d10 > 1.0d) {
                throw new IllegalArgumentException("percent must be in the range [0.0, 1.0].");
            }
            this.f51176a = new C7852c(d10, context);
            return this;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0010R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0011\u0010\u0016¨\u0006\u0017"}, d2 = {"Lf6/d$b;", "", "", "key", "", "extras", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getKey", "b", "Ljava/util/Map;", "()Ljava/util/Map;", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: f6.d$b */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final String f51179a;

        /* renamed from: b  reason: collision with root package name */
        private final Map<String, String> f51180b;

        public b(String str, Map<String, String> map) {
            this.f51179a = str;
            this.f51180b = C8695c.d(map);
        }

        public final Map<String, String> a() {
            return this.f51180b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C17542s.e(this.f51179a, bVar.f51179a) && C17542s.e(this.f51180b, bVar.f51180b);
            }
        }

        public int hashCode() {
            return (this.f51179a.hashCode() * 31) + this.f51180b.hashCode();
        }

        public String toString() {
            return "Key(key=" + this.f51179a + ", extras=" + this.f51180b + ')';
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Lf6/d$c;", "", "LT5/n;", "image", "", "", "extras", "<init>", "(LT5/n;Ljava/util/Map;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "LT5/n;", "b", "()LT5/n;", "Ljava/util/Map;", "()Ljava/util/Map;", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: f6.d$c */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        private final n f51181a;

        /* renamed from: b  reason: collision with root package name */
        private final Map<String, Object> f51182b;

        public c(n nVar, Map<String, ? extends Object> map) {
            this.f51181a = nVar;
            this.f51182b = C8695c.d(map);
        }

        public final Map<String, Object> a() {
            return this.f51182b;
        }

        public final n b() {
            return this.f51181a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C17542s.e(this.f51181a, cVar.f51181a) && C17542s.e(this.f51182b, cVar.f51182b);
            }
        }

        public int hashCode() {
            return (this.f51181a.hashCode() * 31) + this.f51182b.hashCode();
        }

        public String toString() {
            return "Value(image=" + this.f51181a + ", extras=" + this.f51182b + ')';
        }
    }

    long a();

    c b(b bVar);

    void c(long j10);

    void clear();

    void d(b bVar, c cVar);
}
