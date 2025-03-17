package Nh;

import Jh.a;
import Jh.c;
import YH.C16877v;
import com.google.android.libraries.places.api.model.PlaceTypes;
import dl.r;
import hl.C11367a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LNh/a;", "", "pointofinterest_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface a {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Nh.a$a  reason: collision with other inner class name */
    public static final class C1048a {
        public static void a(a aVar, List<Object> list, a.C1016a aVar2, a.b bVar) {
            C17542s.j(list, "$receiver");
            C17542s.j(aVar2, "directions");
            if (bVar != null) {
                list.add(bVar);
            }
            list.add(aVar2);
        }

        public static boolean b(a aVar, List<Object> list, String str, String str2) {
            C17542s.j(list, "$receiver");
            String str3 = str;
            C17542s.j(str3, "name");
            C17542s.j(str2, PlaceTypes.ADDRESS);
            r.d dVar = new r.d(str3, "poi_header_name", (Integer) null, (Integer) null, r.c.H2, 0, (Integer) null, (Integer) null, (Integer) null, 8, (Integer) null, 1388, (DefaultConstructorMarker) null);
            r.d dVar2 = r2;
            r.d dVar3 = new r.d(str2, "poi_header_address", (Integer) null, (Integer) null, r.c.BodyMedium, 0, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 1900, (DefaultConstructorMarker) null);
            return list.addAll(C16877v.q(dVar, dVar2));
        }

        public static boolean c(a aVar, List<Object> list, String str, C11367a aVar2, C11367a aVar3) {
            C17542s.j(list, "$receiver");
            C17542s.j(str, "id");
            C17542s.j(aVar2, "label");
            C17542s.j(aVar3, "value");
            return list.add(new c(str, aVar2, aVar3));
        }

        public static boolean d(a aVar, List<Object> list, String str, int i10) {
            List<Object> list2 = list;
            C17542s.j(list2, "$receiver");
            String str2 = str;
            C17542s.j(str2, "id");
            return list2.add(new r.a(i10, str2, (Integer) null, (Integer) null, r.c.H6, 0, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2028, (DefaultConstructorMarker) null));
        }
    }
}
