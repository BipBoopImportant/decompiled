package VI;

import YH.C16877v;
import java.util.List;
import kotlin.jvm.internal.C17542s;

/* renamed from: VI.D  reason: case insensitive filesystem */
public interface C16662D {

    /* renamed from: VI.D$a */
    public static final class a implements C16662D {

        /* renamed from: a  reason: collision with root package name */
        public static final a f139316a = new a();

        private a() {
        }

        public List<String> a(String str) {
            C17542s.j(str, "packageFqName");
            return C16877v.n();
        }
    }

    List<String> a(String str);
}
