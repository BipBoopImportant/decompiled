package PA;

import fI.C17221b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import x4.C8951o;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \u000b2\u00020\u0001:\u0002\f\u000bJ'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"LPA/a;", "", "Lx4/o;", "navController", "", "shoppableImageId", "LPA/a$b;", "type", "LXH/N;", "j", "(Lx4/o;Ljava/lang/String;LPA/a$b;)V", "a", "b", "shoppableimage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: PA.a  reason: case insensitive filesystem */
public interface C13331a {

    /* renamed from: a  reason: collision with root package name */
    public static final C2796a f113810a = C2796a.f113811a;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LPA/a$a;", "", "<init>", "()V", "", "value", "LPA/a$b;", "a", "(Ljava/lang/String;)LPA/a$b;", "shoppableimage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: PA.a$a  reason: collision with other inner class name */
    public static final class C2796a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ C2796a f113811a = new C2796a();

        private C2796a() {
        }

        public final b a(String str) {
            C17542s.j(str, "value");
            b bVar = b.SHOPPABLE;
            if (!C17542s.e(str, bVar.b())) {
                bVar = b.VUGC;
                if (!C17542s.e(str, bVar.b())) {
                    bVar = b.INSPIRATION;
                    if (!C17542s.e(str, bVar.b())) {
                        throw new IllegalArgumentException("Unknown value: " + str);
                    }
                }
            }
            return bVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"LPA/a$b;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "SHOPPABLE", "VUGC", "INSPIRATION", "shoppableimage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: PA.a$b */
    public enum b {
        SHOPPABLE("shoppable"),
        VUGC("vugc"),
        INSPIRATION("inspiration");
        
        private final String value;

        static {
            b[] a10;
            $ENTRIES = C17221b.a(a10);
        }

        private b(String str) {
            this.value = str;
        }

        public final String b() {
            return this.value;
        }
    }

    void j(C8951o oVar, String str, b bVar);
}
