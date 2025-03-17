package xL;

import java.util.ArrayList;
import java.util.List;

/* renamed from: xL.a  reason: case insensitive filesystem */
public class C18680a {

    /* renamed from: c  reason: collision with root package name */
    static final List<String> f152516c;

    /* renamed from: a  reason: collision with root package name */
    private String f152517a;

    /* renamed from: b  reason: collision with root package name */
    private String f152518b;

    static {
        ArrayList arrayList = new ArrayList();
        f152516c = arrayList;
        arrayList.add("https://www.mapbox.com/feedback/");
        arrayList.add("https://www.mapbox.com/map-feedback/");
        arrayList.add("https://apps.mapbox.com/feedback/");
    }

    C18680a(String str, String str2) {
        this.f152517a = str;
        this.f152518b = str2;
    }

    public String a() {
        return this.f152517a;
    }

    public String b() {
        return this.f152518b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C18680a aVar = (C18680a) obj;
        String str = this.f152517a;
        if (str == null ? aVar.f152517a != null : !str.equals(aVar.f152517a)) {
            return false;
        }
        String str2 = this.f152518b;
        String str3 = aVar.f152518b;
        return str2 != null ? str2.equals(str3) : str3 == null;
    }

    public int hashCode() {
        String str = this.f152517a;
        int i10 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f152518b;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return hashCode + i10;
    }
}
