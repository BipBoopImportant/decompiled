package GE;

import java.util.HashMap;
import java.util.Map;

/* renamed from: GE.c  reason: case insensitive filesystem */
public class C12938c implements C12943h {

    /* renamed from: a  reason: collision with root package name */
    private String f110489a;

    /* renamed from: b  reason: collision with root package name */
    private String f110490b;

    public C12938c(String str, String str2) {
        this.f110489a = str;
        this.f110490b = str2;
    }

    public Map<String, String> get() {
        HashMap hashMap = new HashMap();
        hashMap.put("experimentKey", this.f110489a);
        hashMap.put("variationKey", this.f110490b);
        return hashMap;
    }
}
