package v6;

import XH.C16796C;
import YH.X;
import YH.g0;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\u001a!\u0010\u0003\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\".\u0010\n\u001a\u001c\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00000\b0\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\t¨\u0006\u000b"}, d2 = {"Ljava/util/Locale;", "merchantLocale", "consumerLocale", "a", "(Ljava/util/Locale;Ljava/util/Locale;)Ljava/util/Locale;", "", "", "kotlin.jvm.PlatformType", "", "Ljava/util/Map;", "validRegionLanguages", "afterpay_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class k {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, Set<Locale>> f56927a;

    static {
        j jVar = j.f56916a;
        f56927a = X.m(C16796C.a(jVar.a().getCountry(), g0.c(jVar.a())), C16796C.a(jVar.c().getCountry(), g0.c(jVar.c())), C16796C.a(jVar.d().getCountry(), g0.c(jVar.d())), C16796C.a(jVar.e().getCountry(), g0.c(jVar.e())), C16796C.a(jVar.b().getCountry(), g0.h(jVar.b(), jVar.g())), C16796C.a(jVar.h().getCountry(), g0.h(jVar.h(), jVar.c())), C16796C.a(jVar.i().getCountry(), g0.h(jVar.i(), jVar.c())), C16796C.a(jVar.f().getCountry(), g0.h(jVar.f(), jVar.c())));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.util.Locale} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.util.Locale} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.util.Locale} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.util.Locale} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.Locale a(java.util.Locale r4, java.util.Locale r5) {
        /*
            java.lang.String r0 = "merchantLocale"
            kotlin.jvm.internal.C17542s.j(r4, r0)
            java.lang.String r0 = "consumerLocale"
            kotlin.jvm.internal.C17542s.j(r5, r0)
            java.util.Map<java.lang.String, java.util.Set<java.util.Locale>> r0 = f56927a
            java.lang.String r4 = r4.getCountry()
            java.lang.Object r4 = r0.get(r4)
            java.util.Set r4 = (java.util.Set) r4
            r0 = 0
            if (r4 == 0) goto L_0x003d
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L_0x001f:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x003b
            java.lang.Object r1 = r4.next()
            r2 = r1
            java.util.Locale r2 = (java.util.Locale) r2
            java.lang.String r3 = r5.getLanguage()
            java.lang.String r2 = r2.getLanguage()
            boolean r2 = kotlin.jvm.internal.C17542s.e(r3, r2)
            if (r2 == 0) goto L_0x001f
            r0 = r1
        L_0x003b:
            java.util.Locale r0 = (java.util.Locale) r0
        L_0x003d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: v6.k.a(java.util.Locale, java.util.Locale):java.util.Locale");
    }
}
