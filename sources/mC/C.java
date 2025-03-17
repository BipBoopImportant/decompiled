package Mc;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0010\b\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0012R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001a\u0010!R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\"\u001a\u0004\b\u0017\u0010#R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u001f\u0010\u0010R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001c\u0010\u0010¨\u0006$"}, d2 = {"LMc/C;", "", "", "sessionId", "firstSessionId", "", "sessionIndex", "", "eventTimestampUs", "LMc/e;", "dataCollectionStatus", "firebaseInstallationId", "firebaseAuthenticationToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;IJLMc/e;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "f", "b", "e", "c", "I", "g", "d", "J", "()J", "LMc/e;", "()LMc/e;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class C {

    /* renamed from: a  reason: collision with root package name */
    private final String f61733a;

    /* renamed from: b  reason: collision with root package name */
    private final String f61734b;

    /* renamed from: c  reason: collision with root package name */
    private final int f61735c;

    /* renamed from: d  reason: collision with root package name */
    private final long f61736d;

    /* renamed from: e  reason: collision with root package name */
    private final C9146e f61737e;

    /* renamed from: f  reason: collision with root package name */
    private final String f61738f;

    /* renamed from: g  reason: collision with root package name */
    private final String f61739g;

    public C(String str, String str2, int i10, long j10, C9146e eVar, String str3, String str4) {
        C17542s.j(str, "sessionId");
        C17542s.j(str2, "firstSessionId");
        C17542s.j(eVar, "dataCollectionStatus");
        C17542s.j(str3, "firebaseInstallationId");
        C17542s.j(str4, "firebaseAuthenticationToken");
        this.f61733a = str;
        this.f61734b = str2;
        this.f61735c = i10;
        this.f61736d = j10;
        this.f61737e = eVar;
        this.f61738f = str3;
        this.f61739g = str4;
    }

    public final C9146e a() {
        return this.f61737e;
    }

    public final long b() {
        return this.f61736d;
    }

    public final String c() {
        return this.f61739g;
    }

    public final String d() {
        return this.f61738f;
    }

    public final String e() {
        return this.f61734b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c10 = (C) obj;
        return C17542s.e(this.f61733a, c10.f61733a) && C17542s.e(this.f61734b, c10.f61734b) && this.f61735c == c10.f61735c && this.f61736d == c10.f61736d && C17542s.e(this.f61737e, c10.f61737e) && C17542s.e(this.f61738f, c10.f61738f) && C17542s.e(this.f61739g, c10.f61739g);
    }

    public final String f() {
        return this.f61733a;
    }

    public final int g() {
        return this.f61735c;
    }

    public int hashCode() {
        return (((((((((((this.f61733a.hashCode() * 31) + this.f61734b.hashCode()) * 31) + Integer.hashCode(this.f61735c)) * 31) + Long.hashCode(this.f61736d)) * 31) + this.f61737e.hashCode()) * 31) + this.f61738f.hashCode()) * 31) + this.f61739g.hashCode();
    }

    public String toString() {
        return "SessionInfo(sessionId=" + this.f61733a + ", firstSessionId=" + this.f61734b + ", sessionIndex=" + this.f61735c + ", eventTimestampUs=" + this.f61736d + ", dataCollectionStatus=" + this.f61737e + ", firebaseInstallationId=" + this.f61738f + ", firebaseAuthenticationToken=" + this.f61739g + ')';
    }
}
