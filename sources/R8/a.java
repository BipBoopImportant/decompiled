package R8;

import HJ.C15838d;
import HJ.C15846l;
import HJ.C15854t;
import YH.X;
import com.google.ar.core.ImageMetadata;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0007\u001a9\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a/\u0010\t\u001a\u0004\u0018\u00010\b*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u00002\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n\u001a\u0011\u0010\u000b\u001a\u00020\b*\u00020\b¢\u0006\u0004\b\u000b\u0010\f\u001a\u0013\u0010\r\u001a\u00020\u0001*\u00020\u0001H\u0000¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"", "", "", "standardHeadersMap", "c", "(Ljava/util/Map;[Ljava/lang/String;)Ljava/util/Map;", "", "validCustomHeaders", "", "b", "(Ljava/util/Map;Ljava/util/List;)[B", "d", "([B)[B", "a", "(Ljava/lang/String;)Ljava/lang/String;", "error-analysis_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class a {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LHJ/l;", "it", "", "a", "(LHJ/l;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: R8.a$a  reason: collision with other inner class name */
    public static final class C0638a extends C17544u implements C17642l<C15846l, CharSequence> {

        /* renamed from: c  reason: collision with root package name */
        public static final C0638a f39735c = new C0638a();

        public C0638a() {
            super(1);
        }

        /* renamed from: a */
        public final CharSequence invoke(C15846l lVar) {
            C17542s.j(lVar, "it");
            return "CS_ANONYMIZED_EMAIL";
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "header", "", "a", "(Ljava/lang/String;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    public static final class b extends C17544u implements C17642l<String, Boolean> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String[] f39736c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(String[] strArr) {
            super(1);
            this.f39736c = strArr;
        }

        /* renamed from: a */
        public final Boolean invoke(String str) {
            C17542s.j(str, "header");
            String[] strArr = this.f39736c;
            int length = strArr.length;
            boolean z10 = false;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                } else if (C15854t.H(strArr[i10], str, true)) {
                    z10 = true;
                    break;
                } else {
                    i10++;
                }
            }
            return Boolean.valueOf(z10);
        }
    }

    public static final String a(String str) {
        C17542s.j(str, "<this>");
        I8.a aVar = I8.a.f37083a;
        return aVar.b().b(str) ? aVar.a().k(str, C0638a.f39735c) : str;
    }

    public static final byte[] b(Map<String, String> map, List<String> list) {
        C17542s.j(map, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry next : map.entrySet()) {
            if (list != null && !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (C15854t.H((String) it.next(), (String) next.getKey(), true)) {
                            linkedHashMap.put(next.getKey(), next.getValue());
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
        }
        if (linkedHashMap.isEmpty()) {
            return null;
        }
        String jSONObject = new JSONObject(linkedHashMap).toString();
        C17542s.i(jSONObject, "JSONObject(headerFiltered).toString()");
        byte[] bytes = jSONObject.getBytes(C15838d.f135279b);
        C17542s.i(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    public static final Map<String, String> c(Map<String, String> map, String[] strArr) {
        C17542s.j(map, "<this>");
        C17542s.j(strArr, "standardHeadersMap");
        b bVar = new b(strArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry next : map.entrySet()) {
            if (((Boolean) bVar.invoke(next.getKey())).booleanValue()) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        Map<String, String> x10 = X.x(linkedHashMap);
        if (x10.isEmpty()) {
            return null;
        }
        return x10;
    }

    public static final byte[] d(byte[] bArr) {
        C17542s.j(bArr, "<this>");
        int length = bArr.length;
        int i10 = ImageMetadata.SHADING_MODE;
        if (length < 1048576) {
            i10 = bArr.length;
        }
        byte[] copyOf = Arrays.copyOf(bArr, i10);
        C17542s.i(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }
}
