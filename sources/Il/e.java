package Il;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\rR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u0019\u001a\u0004\b\u0018\u0010\r¨\u0006\""}, d2 = {"LIl/e;", "", "LIl/b;", "marketConfigChangeType", "", "marketCode", "languageCode", "LRl/e;", "newMarketConfig", "oldShopAndGoStore", "<init>", "(LIl/b;Ljava/lang/String;Ljava/lang/String;LRl/e;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LIl/b;", "()LIl/b;", "b", "Ljava/lang/String;", "getMarketCode", "c", "getLanguageCode", "d", "LRl/e;", "getNewMarketConfig", "()LRl/e;", "e", "appconfig_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final b f81894a;

    /* renamed from: b  reason: collision with root package name */
    private final String f81895b;

    /* renamed from: c  reason: collision with root package name */
    private final String f81896c;

    /* renamed from: d  reason: collision with root package name */
    private final Rl.e f81897d;

    /* renamed from: e  reason: collision with root package name */
    private final String f81898e;

    public e(b bVar, String str, String str2, Rl.e eVar, String str3) {
        C17542s.j(bVar, "marketConfigChangeType");
        C17542s.j(str, "marketCode");
        C17542s.j(str2, "languageCode");
        C17542s.j(eVar, "newMarketConfig");
        this.f81894a = bVar;
        this.f81895b = str;
        this.f81896c = str2;
        this.f81897d = eVar;
        this.f81898e = str3;
    }

    public final b a() {
        return this.f81894a;
    }

    public final String b() {
        return this.f81898e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f81894a == eVar.f81894a && C17542s.e(this.f81895b, eVar.f81895b) && C17542s.e(this.f81896c, eVar.f81896c) && C17542s.e(this.f81897d, eVar.f81897d) && C17542s.e(this.f81898e, eVar.f81898e);
    }

    public int hashCode() {
        int hashCode = ((((((this.f81894a.hashCode() * 31) + this.f81895b.hashCode()) * 31) + this.f81896c.hashCode()) * 31) + this.f81897d.hashCode()) * 31;
        String str = this.f81898e;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        b bVar = this.f81894a;
        String str = this.f81895b;
        String str2 = this.f81896c;
        Rl.e eVar = this.f81897d;
        String str3 = this.f81898e;
        return "NewMarketSelection(marketConfigChangeType=" + bVar + ", marketCode=" + str + ", languageCode=" + str2 + ", newMarketConfig=" + eVar + ", oldShopAndGoStore=" + str3 + ")";
    }
}
