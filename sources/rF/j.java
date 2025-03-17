package RF;

import OE.n;
import android.content.res.Resources;
import fI.C17221b;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0002\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0014B!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001b¨\u0006\u001c"}, d2 = {"LRF/j;", "", "", "key", "", "index", "labelResId", "<init>", "(Ljava/lang/String;ILjava/lang/String;II)V", "Landroid/content/res/Resources;", "resources", "m", "(Landroid/content/res/Resources;)Ljava/lang/String;", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "I", "b", "()I", "Companion", "a", "FRONT", "RIGHT", "BACK", "LEFT", "TOP", "DOLLHOUSE_1", "DOLLHOUSE_2", "shared_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum j {
    FRONT("front", 0, n.f113207G3),
    RIGHT("right", 1, n.f113219I3),
    BACK("back", 2, n.f113189D3),
    LEFT("left", 3, n.f113213H3),
    TOP("top_down", 4, n.f113225J3),
    DOLLHOUSE_1("dollhouse_1", 5, n.f113195E3),
    DOLLHOUSE_2("dollhouse_2", 6, n.f113201F3);
    
    public static final a Companion = null;
    private final int index;
    private final String key;
    private final int labelResId;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LRF/j$a;", "", "<init>", "()V", "", "index", "LRF/j;", "a", "(I)LRF/j;", "shared_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final j a(int i10) {
            if (i10 < 0 || i10 >= j.values().length) {
                throw new IndexOutOfBoundsException("Invalid viewport index: " + i10);
            }
            for (j jVar : j.values()) {
                if (jVar.b() == i10) {
                    return jVar;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }

        private a() {
        }
    }

    static {
        j[] a10;
        $ENTRIES = C17221b.a(a10);
        Companion = new a((DefaultConstructorMarker) null);
    }

    private j(String str, int i10, int i11) {
        this.key = str;
        this.index = i10;
        this.labelResId = i11;
    }

    public final int b() {
        return this.index;
    }

    public final String j() {
        return this.key;
    }

    public final String m(Resources resources) {
        C17542s.j(resources, "resources");
        String string = resources.getString(this.labelResId);
        C17542s.i(string, "getString(...)");
        return string;
    }
}
