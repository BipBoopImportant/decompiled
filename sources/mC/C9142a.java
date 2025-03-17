package Mc;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u0016\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001c\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b\u001b\u0010\u001eR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\t8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001f\u001a\u0004\b\u0019\u0010 ¨\u0006!"}, d2 = {"LMc/a;", "", "", "packageName", "versionName", "appBuildVersion", "deviceManufacturer", "LMc/u;", "currentProcessDetails", "", "appProcessDetails", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LMc/u;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "e", "b", "f", "c", "d", "LMc/u;", "()LMc/u;", "Ljava/util/List;", "()Ljava/util/List;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: Mc.a  reason: case insensitive filesystem */
public final class C9142a {

    /* renamed from: a  reason: collision with root package name */
    private final String f61759a;

    /* renamed from: b  reason: collision with root package name */
    private final String f61760b;

    /* renamed from: c  reason: collision with root package name */
    private final String f61761c;

    /* renamed from: d  reason: collision with root package name */
    private final String f61762d;

    /* renamed from: e  reason: collision with root package name */
    private final u f61763e;

    /* renamed from: f  reason: collision with root package name */
    private final List<u> f61764f;

    public C9142a(String str, String str2, String str3, String str4, u uVar, List<u> list) {
        C17542s.j(str, "packageName");
        C17542s.j(str2, "versionName");
        C17542s.j(str3, "appBuildVersion");
        C17542s.j(str4, "deviceManufacturer");
        C17542s.j(uVar, "currentProcessDetails");
        C17542s.j(list, "appProcessDetails");
        this.f61759a = str;
        this.f61760b = str2;
        this.f61761c = str3;
        this.f61762d = str4;
        this.f61763e = uVar;
        this.f61764f = list;
    }

    public final String a() {
        return this.f61761c;
    }

    public final List<u> b() {
        return this.f61764f;
    }

    public final u c() {
        return this.f61763e;
    }

    public final String d() {
        return this.f61762d;
    }

    public final String e() {
        return this.f61759a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9142a)) {
            return false;
        }
        C9142a aVar = (C9142a) obj;
        return C17542s.e(this.f61759a, aVar.f61759a) && C17542s.e(this.f61760b, aVar.f61760b) && C17542s.e(this.f61761c, aVar.f61761c) && C17542s.e(this.f61762d, aVar.f61762d) && C17542s.e(this.f61763e, aVar.f61763e) && C17542s.e(this.f61764f, aVar.f61764f);
    }

    public final String f() {
        return this.f61760b;
    }

    public int hashCode() {
        return (((((((((this.f61759a.hashCode() * 31) + this.f61760b.hashCode()) * 31) + this.f61761c.hashCode()) * 31) + this.f61762d.hashCode()) * 31) + this.f61763e.hashCode()) * 31) + this.f61764f.hashCode();
    }

    public String toString() {
        return "AndroidApplicationInfo(packageName=" + this.f61759a + ", versionName=" + this.f61760b + ", appBuildVersion=" + this.f61761c + ", deviceManufacturer=" + this.f61762d + ", currentProcessDetails=" + this.f61763e + ", appProcessDetails=" + this.f61764f + ')';
    }
}
