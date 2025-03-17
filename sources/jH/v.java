package JH;

import XH.C16807N;
import YH.C16877v;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.p;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\tH&¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\r\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00060\f0\tH&¢\u0006\u0004\b\r\u0010\u000bJ/\u0010\u0011\u001a\u00020\u000f2\u001e\u0010\u0010\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0015¨\u0006\u0018"}, d2 = {"LJH/v;", "", "", "name", "get", "(Ljava/lang/String;)Ljava/lang/String;", "", "c", "(Ljava/lang/String;)Ljava/util/List;", "", "names", "()Ljava/util/Set;", "", "a", "Lkotlin/Function2;", "LXH/N;", "body", "d", "(LnI/p;)V", "", "isEmpty", "()Z", "b", "caseInsensitiveName", "ktor-utils"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface v {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public static void a(v vVar, p<? super String, ? super List<String>, C16807N> pVar) {
            C17542s.j(pVar, "body");
            for (Map.Entry entry : vVar.a()) {
                pVar.invoke((String) entry.getKey(), (List) entry.getValue());
            }
        }

        public static String b(v vVar, String str) {
            C17542s.j(str, "name");
            List<String> c10 = vVar.c(str);
            if (c10 != null) {
                return (String) C16877v.y0(c10);
            }
            return null;
        }
    }

    Set<Map.Entry<String, List<String>>> a();

    boolean b();

    List<String> c(String str);

    void d(p<? super String, ? super List<String>, C16807N> pVar);

    String get(String str);

    boolean isEmpty();

    Set<String> names();
}
