package Sb;

import Nb.g;
import Qb.C9251i;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

class e {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, String> f63274a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final int f63275b;

    /* renamed from: c  reason: collision with root package name */
    private final int f63276c;

    public e(int i10, int i11) {
        this.f63275b = i10;
        this.f63276c = i11;
    }

    private String b(String str) {
        if (str != null) {
            return c(str, this.f63276c);
        }
        throw new IllegalArgumentException("Custom attribute key must not be null.");
    }

    public static String c(String str, int i10) {
        if (str == null) {
            return str;
        }
        String trim = str.trim();
        return trim.length() > i10 ? trim.substring(0, i10) : trim;
    }

    public synchronized Map<String, String> a() {
        return Collections.unmodifiableMap(new HashMap(this.f63274a));
    }

    public synchronized boolean d(String str, String str2) {
        String b10 = b(str);
        if (this.f63274a.size() >= this.f63275b) {
            if (!this.f63274a.containsKey(b10)) {
                g f10 = g.f();
                f10.k("Ignored entry \"" + str + "\" when adding custom keys. Maximum allowable: " + this.f63275b);
                return false;
            }
        }
        String c10 = c(str2, this.f63276c);
        if (C9251i.y(this.f63274a.get(b10), c10)) {
            return false;
        }
        Map<String, String> map = this.f63274a;
        if (str2 == null) {
            c10 = "";
        }
        map.put(b10, c10);
        return true;
    }

    public synchronized void e(Map<String, String> map) {
        try {
            int i10 = 0;
            for (Map.Entry next : map.entrySet()) {
                String b10 = b((String) next.getKey());
                if (this.f63274a.size() >= this.f63275b) {
                    if (!this.f63274a.containsKey(b10)) {
                        i10++;
                    }
                }
                String str = (String) next.getValue();
                this.f63274a.put(b10, str == null ? "" : c(str, this.f63276c));
            }
            if (i10 > 0) {
                g f10 = g.f();
                f10.k("Ignored " + i10 + " entries when adding custom keys. Maximum allowable: " + this.f63275b);
            }
        } finally {
            while (true) {
            }
        }
    }
}
