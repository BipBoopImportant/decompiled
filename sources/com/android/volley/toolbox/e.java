package com.android.volley.toolbox;

import com.android.volley.b;
import com.android.volley.g;
import com.android.volley.k;
import com.android.volley.v;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.TreeSet;

public class e {
    static List<g> a(List<g> list, b.a aVar) {
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        if (!list.isEmpty()) {
            for (g a10 : list) {
                treeSet.add(a10.a());
            }
        }
        ArrayList arrayList = new ArrayList(list);
        List<g> list2 = aVar.f46198h;
        if (list2 != null) {
            if (!list2.isEmpty()) {
                for (g next : aVar.f46198h) {
                    if (!treeSet.contains(next.a())) {
                        arrayList.add(next);
                    }
                }
            }
        } else if (!aVar.f46197g.isEmpty()) {
            for (Map.Entry next2 : aVar.f46197g.entrySet()) {
                if (!treeSet.contains(next2.getKey())) {
                    arrayList.add(new g((String) next2.getKey(), (String) next2.getValue()));
                }
            }
        }
        return arrayList;
    }

    static String b(long j10) {
        return d("EEE, dd MMM yyyy HH:mm:ss 'GMT'").format(new Date(j10));
    }

    static Map<String, String> c(b.a aVar) {
        if (aVar == null) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap();
        String str = aVar.f46192b;
        if (str != null) {
            hashMap.put("If-None-Match", str);
        }
        long j10 = aVar.f46194d;
        if (j10 > 0) {
            hashMap.put("If-Modified-Since", b(j10));
        }
        return hashMap;
    }

    private static SimpleDateFormat d(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }

    public static b.a e(k kVar) {
        long j10;
        long j11;
        boolean z10;
        long j12;
        long j13;
        k kVar2 = kVar;
        long currentTimeMillis = System.currentTimeMillis();
        Map<String, String> map = kVar2.f46227c;
        if (map == null) {
            return null;
        }
        String str = map.get("Date");
        long g10 = str != null ? g(str) : 0;
        String str2 = map.get("Cache-Control");
        int i10 = 0;
        if (str2 != null) {
            String[] split = str2.split(",", 0);
            z10 = false;
            j11 = 0;
            j10 = 0;
            while (i10 < split.length) {
                String trim = split[i10].trim();
                if (trim.equals("no-cache") || trim.equals("no-store")) {
                    return null;
                }
                if (trim.startsWith("max-age=")) {
                    try {
                        j11 = Long.parseLong(trim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (trim.startsWith("stale-while-revalidate=")) {
                    j10 = Long.parseLong(trim.substring(23));
                } else if (trim.equals("must-revalidate") || trim.equals("proxy-revalidate")) {
                    z10 = true;
                }
                i10++;
            }
            i10 = 1;
        } else {
            z10 = false;
            j11 = 0;
            j10 = 0;
        }
        String str3 = map.get("Expires");
        long g11 = str3 != null ? g(str3) : 0;
        String str4 = map.get("Last-Modified");
        long g12 = str4 != null ? g(str4) : 0;
        String str5 = map.get("ETag");
        if (i10 != 0) {
            j13 = currentTimeMillis + (j11 * 1000);
            j12 = z10 ? j13 : (j10 * 1000) + j13;
        } else {
            j12 = 0;
            if (g10 <= 0 || g11 < g10) {
                j13 = 0;
            } else {
                j13 = currentTimeMillis + (g11 - g10);
                j12 = j13;
            }
        }
        b.a aVar = new b.a();
        aVar.f46191a = kVar2.f46226b;
        aVar.f46192b = str5;
        aVar.f46196f = j13;
        aVar.f46195e = j12;
        aVar.f46193c = g10;
        aVar.f46194d = g12;
        aVar.f46197g = map;
        aVar.f46198h = kVar2.f46228d;
        return aVar;
    }

    public static String f(Map<String, String> map, String str) {
        String str2;
        if (!(map == null || (str2 = map.get("Content-Type")) == null)) {
            String[] split = str2.split(";", 0);
            for (int i10 = 1; i10 < split.length; i10++) {
                String[] split2 = split[i10].trim().split("=", 0);
                if (split2.length == 2 && split2[0].equals("charset")) {
                    return split2[1];
                }
            }
        }
        return str;
    }

    public static long g(String str) {
        try {
            return d("EEE, dd MMM yyyy HH:mm:ss zzz").parse(str).getTime();
        } catch (ParseException e10) {
            if ("0".equals(str) || "-1".equals(str)) {
                v.e("Unable to parse dateStr: %s, falling back to 0", str);
                return 0;
            }
            v.d(e10, "Unable to parse dateStr: %s, falling back to 0", str);
            return 0;
        }
    }

    static List<g> h(Map<String, String> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry next : map.entrySet()) {
            arrayList.add(new g((String) next.getKey(), (String) next.getValue()));
        }
        return arrayList;
    }

    static Map<String, String> i(List<g> list) {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (g next : list) {
            treeMap.put(next.a(), next.b());
        }
        return treeMap;
    }
}
