package com.auth0.android.request.internal;

import HJ.C15854t;
import YH.C16877v;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\u000b\u001a\u00020\n2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/auth0/android/request/internal/i;", "", "<init>", "()V", "", "scope", "b", "(Ljava/lang/String;)Ljava/lang/String;", "", "parameters", "LXH/N;", "a", "(Ljava/util/Map;)V", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final i f46457a = new i();

    private i() {
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.util.Map<java.lang.String, java.lang.String>, java.util.Map, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.util.Map<java.lang.String, java.lang.String> r3) {
        /*
            r2 = this;
            java.lang.String r0 = "parameters"
            kotlin.jvm.internal.C17542s.j(r3, r0)
            java.lang.String r0 = "scope"
            boolean r1 = r3.containsKey(r0)
            if (r1 == 0) goto L_0x0018
            java.lang.Object r1 = YH.X.k(r3, r0)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = r2.b(r1)
            goto L_0x001a
        L_0x0018:
            java.lang.String r1 = "openid profile email"
        L_0x001a:
            r3.put(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.auth0.android.request.internal.i.a(java.util.Map):void");
    }

    public final String b(String str) {
        C17542s.j(str, "scope");
        Iterable<String> Y02 = C15854t.Y0(str, new String[]{" "}, false, 0, 6, (Object) null);
        ArrayList arrayList = new ArrayList(C16877v.y(Y02, 10));
        for (String lowerCase : Y02) {
            Locale locale = Locale.ROOT;
            C17542s.i(locale, "ROOT");
            String lowerCase2 = lowerCase.toLowerCase(locale);
            C17542s.i(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            arrayList.add(lowerCase2);
        }
        return !arrayList.contains("openid") ? C15854t.z1(C16877v.G0(C16877v.W0(arrayList, "openid"), " ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C17642l) null, 62, (Object) null)).toString() : str;
    }
}
