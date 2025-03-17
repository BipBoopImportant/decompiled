package t7;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: t7.d  reason: case insensitive filesystem */
class C8839d {

    /* renamed from: a  reason: collision with root package name */
    private String f56659a;

    C8839d(Map<String, Object> map) {
        e((List) map.get("rules"));
    }

    private String a(Map<String, Object> map) {
        ArrayList arrayList = new ArrayList();
        for (Map map2 : (List) map.get("items")) {
            arrayList.add((String) map2.get("message"));
        }
        String join = TextUtils.join(", ", arrayList);
        String str = (String) map.get("message");
        if (map.containsKey("format")) {
            List list = (List) map.get("format");
            str = String.format(str, new Object[]{Integer.valueOf(((Double) list.get(0)).intValue()), Integer.valueOf(((Double) list.get(1)).intValue())});
        }
        return String.format("%s %s", new Object[]{str, join});
    }

    private String b(Map<String, Object> map) {
        List list = (List) map.get("format");
        return String.format((String) map.get("message"), new Object[]{Integer.valueOf(((Double) list.get(0)).intValue()), list.get(1)});
    }

    private String c(Map<String, Object> map) {
        return String.format((String) map.get("message"), new Object[]{Integer.valueOf(((Double) ((List) map.get("format")).get(0)).intValue())});
    }

    private void e(List<Map<String, Object>> list) {
        ArrayList arrayList = new ArrayList();
        for (Map next : list) {
            if (!((Boolean) next.get("verified")).booleanValue()) {
                String str = (String) next.get("code");
                str.hashCode();
                char c10 = 65535;
                switch (str.hashCode()) {
                    case -2022676432:
                        if (str.equals("lengthAtLeast")) {
                            c10 = 0;
                            break;
                        }
                        break;
                    case -588526889:
                        if (str.equals("containsAtLeast")) {
                            c10 = 1;
                            break;
                        }
                        break;
                    case 914712481:
                        if (str.equals("shouldContain")) {
                            c10 = 2;
                            break;
                        }
                        break;
                    case 1196895272:
                        if (str.equals("identicalChars")) {
                            c10 = 3;
                            break;
                        }
                        break;
                }
                switch (c10) {
                    case 0:
                        arrayList.add(c(next));
                        break;
                    case 1:
                    case 2:
                        arrayList.add(a(next));
                        break;
                    case 3:
                        arrayList.add(b(next));
                        break;
                }
            }
        }
        this.f56659a = TextUtils.join("; ", arrayList);
    }

    public String d() {
        return this.f56659a;
    }
}
