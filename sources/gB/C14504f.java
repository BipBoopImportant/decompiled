package gB;

import fI.C17220a;
import fI.C17221b;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\tj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"LgB/f;", "", "", "key", "analyticsKey", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "m", "()Ljava/lang/String;", "b", "Companion", "a", "COMPACT_CARD", "DEFAULT_CARD", "shoppinglist-datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: gB.f  reason: case insensitive filesystem */
public enum C14504f {
    COMPACT_CARD("COMPACT_SIZE", "compact"),
    DEFAULT_CARD("DEFAULT_SIZE", "default");
    
    public static final a Companion = null;
    private final String analyticsKey;
    private final String key;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LgB/f$a;", "", "<init>", "()V", "", "index", "LgB/f;", "a", "(I)LgB/f;", "", "key", "b", "(Ljava/lang/String;)LgB/f;", "shoppinglist-datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: gB.f$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C14504f a(int i10) {
            return C14504f.j().get(i10);
        }

        public final C14504f b(String str) {
            T t10;
            Iterator<T> it = C14504f.j().iterator();
            while (true) {
                if (!it.hasNext()) {
                    t10 = null;
                    break;
                }
                t10 = it.next();
                if (C17542s.e(((C14504f) t10).m(), str)) {
                    break;
                }
            }
            C14504f fVar = (C14504f) t10;
            return fVar == null ? C14504f.DEFAULT_CARD : fVar;
        }

        private a() {
        }
    }

    static {
        C14504f[] a10;
        $ENTRIES = C17221b.a(a10);
        Companion = new a((DefaultConstructorMarker) null);
    }

    private C14504f(String str, String str2) {
        this.key = str;
        this.analyticsKey = str2;
    }

    public static C17220a<C14504f> j() {
        return $ENTRIES;
    }

    public final String b() {
        return this.analyticsKey;
    }

    public final String m() {
        return this.key;
    }
}
