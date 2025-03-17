package Mc;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0019\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001b\u0010\u001eR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001f\u001a\u0004\b\u0016\u0010 ¨\u0006!"}, d2 = {"LMc/b;", "", "", "appId", "deviceModel", "sessionSdkVersion", "osVersion", "LMc/t;", "logEnvironment", "LMc/a;", "androidAppInfo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LMc/t;LMc/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "f", "d", "e", "LMc/t;", "()LMc/t;", "LMc/a;", "()LMc/a;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: Mc.b  reason: case insensitive filesystem */
public final class C9143b {

    /* renamed from: a  reason: collision with root package name */
    private final String f61765a;

    /* renamed from: b  reason: collision with root package name */
    private final String f61766b;

    /* renamed from: c  reason: collision with root package name */
    private final String f61767c;

    /* renamed from: d  reason: collision with root package name */
    private final String f61768d;

    /* renamed from: e  reason: collision with root package name */
    private final t f61769e;

    /* renamed from: f  reason: collision with root package name */
    private final C9142a f61770f;

    public C9143b(String str, String str2, String str3, String str4, t tVar, C9142a aVar) {
        C17542s.j(str, "appId");
        C17542s.j(str2, "deviceModel");
        C17542s.j(str3, "sessionSdkVersion");
        C17542s.j(str4, "osVersion");
        C17542s.j(tVar, "logEnvironment");
        C17542s.j(aVar, "androidAppInfo");
        this.f61765a = str;
        this.f61766b = str2;
        this.f61767c = str3;
        this.f61768d = str4;
        this.f61769e = tVar;
        this.f61770f = aVar;
    }

    public final C9142a a() {
        return this.f61770f;
    }

    public final String b() {
        return this.f61765a;
    }

    public final String c() {
        return this.f61766b;
    }

    public final t d() {
        return this.f61769e;
    }

    public final String e() {
        return this.f61768d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9143b)) {
            return false;
        }
        C9143b bVar = (C9143b) obj;
        return C17542s.e(this.f61765a, bVar.f61765a) && C17542s.e(this.f61766b, bVar.f61766b) && C17542s.e(this.f61767c, bVar.f61767c) && C17542s.e(this.f61768d, bVar.f61768d) && this.f61769e == bVar.f61769e && C17542s.e(this.f61770f, bVar.f61770f);
    }

    public final String f() {
        return this.f61767c;
    }

    public int hashCode() {
        return (((((((((this.f61765a.hashCode() * 31) + this.f61766b.hashCode()) * 31) + this.f61767c.hashCode()) * 31) + this.f61768d.hashCode()) * 31) + this.f61769e.hashCode()) * 31) + this.f61770f.hashCode();
    }

    public String toString() {
        return "ApplicationInfo(appId=" + this.f61765a + ", deviceModel=" + this.f61766b + ", sessionSdkVersion=" + this.f61767c + ", osVersion=" + this.f61768d + ", logEnvironment=" + this.f61769e + ", androidAppInfo=" + this.f61770f + ')';
    }
}
