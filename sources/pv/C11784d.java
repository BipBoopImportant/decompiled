package pv;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u0017\u0010\u000fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001a\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001c\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001d\u0010\u000fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0019\u0010!\u001a\u0004\b\u001b\u0010\"¨\u0006#"}, d2 = {"Lpv/d;", "", "", "title", "body", "imageUrl", "messageId", "purpose", "Lpv/c;", "source", "Lpv/b;", "localNotificationChannel", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lpv/c;Lpv/b;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "g", "b", "c", "d", "e", "f", "Lpv/c;", "()Lpv/c;", "Lpv/b;", "()Lpv/b;", "localnotification_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: pv.d  reason: case insensitive filesystem */
public final class C11784d {

    /* renamed from: a  reason: collision with root package name */
    private final String f101395a;

    /* renamed from: b  reason: collision with root package name */
    private final String f101396b;

    /* renamed from: c  reason: collision with root package name */
    private final String f101397c;

    /* renamed from: d  reason: collision with root package name */
    private final String f101398d;

    /* renamed from: e  reason: collision with root package name */
    private final String f101399e;

    /* renamed from: f  reason: collision with root package name */
    private final C11783c f101400f;

    /* renamed from: g  reason: collision with root package name */
    private final C11782b f101401g;

    public C11784d(String str, String str2, String str3, String str4, String str5, C11783c cVar, C11782b bVar) {
        C17542s.j(str, "title");
        C17542s.j(str2, "body");
        C17542s.j(str4, "messageId");
        C17542s.j(str5, "purpose");
        C17542s.j(cVar, "source");
        C17542s.j(bVar, "localNotificationChannel");
        this.f101395a = str;
        this.f101396b = str2;
        this.f101397c = str3;
        this.f101398d = str4;
        this.f101399e = str5;
        this.f101400f = cVar;
        this.f101401g = bVar;
    }

    public final String a() {
        return this.f101396b;
    }

    public final String b() {
        return this.f101397c;
    }

    public final C11782b c() {
        return this.f101401g;
    }

    public final String d() {
        return this.f101398d;
    }

    public final String e() {
        return this.f101399e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11784d)) {
            return false;
        }
        C11784d dVar = (C11784d) obj;
        return C17542s.e(this.f101395a, dVar.f101395a) && C17542s.e(this.f101396b, dVar.f101396b) && C17542s.e(this.f101397c, dVar.f101397c) && C17542s.e(this.f101398d, dVar.f101398d) && C17542s.e(this.f101399e, dVar.f101399e) && this.f101400f == dVar.f101400f && C17542s.e(this.f101401g, dVar.f101401g);
    }

    public final C11783c f() {
        return this.f101400f;
    }

    public final String g() {
        return this.f101395a;
    }

    public int hashCode() {
        int hashCode = ((this.f101395a.hashCode() * 31) + this.f101396b.hashCode()) * 31;
        String str = this.f101397c;
        return ((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f101398d.hashCode()) * 31) + this.f101399e.hashCode()) * 31) + this.f101400f.hashCode()) * 31) + this.f101401g.hashCode();
    }

    public String toString() {
        String str = this.f101395a;
        String str2 = this.f101396b;
        String str3 = this.f101397c;
        String str4 = this.f101398d;
        String str5 = this.f101399e;
        C11783c cVar = this.f101400f;
        C11782b bVar = this.f101401g;
        return "MessageData(title=" + str + ", body=" + str2 + ", imageUrl=" + str3 + ", messageId=" + str4 + ", purpose=" + str5 + ", source=" + cVar + ", localNotificationChannel=" + bVar + ")";
    }
}
