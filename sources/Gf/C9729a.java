package gf;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0019\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0017\u0010\fR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001a\u001a\u0004\b\u0014\u0010\u001b¨\u0006\u001c"}, d2 = {"Lgf/a;", "", "", "name", "link", "licenseText", "copyright", "", "artifacts", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "e", "b", "d", "c", "Ljava/util/List;", "()Ljava/util/List;", "profile-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: gf.a  reason: case insensitive filesystem */
public final class C9729a {

    /* renamed from: a  reason: collision with root package name */
    private final String f73066a;

    /* renamed from: b  reason: collision with root package name */
    private final String f73067b;

    /* renamed from: c  reason: collision with root package name */
    private final String f73068c;

    /* renamed from: d  reason: collision with root package name */
    private final String f73069d;

    /* renamed from: e  reason: collision with root package name */
    private final List<String> f73070e;

    public C9729a() {
        this((String) null, (String) null, (String) null, (String) null, (List) null, 31, (DefaultConstructorMarker) null);
    }

    public final List<String> a() {
        return this.f73070e;
    }

    public final String b() {
        return this.f73069d;
    }

    public final String c() {
        return this.f73068c;
    }

    public final String d() {
        return this.f73067b;
    }

    public final String e() {
        return this.f73066a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9729a)) {
            return false;
        }
        C9729a aVar = (C9729a) obj;
        return C17542s.e(this.f73066a, aVar.f73066a) && C17542s.e(this.f73067b, aVar.f73067b) && C17542s.e(this.f73068c, aVar.f73068c) && C17542s.e(this.f73069d, aVar.f73069d) && C17542s.e(this.f73070e, aVar.f73070e);
    }

    public int hashCode() {
        return (((((((this.f73066a.hashCode() * 31) + this.f73067b.hashCode()) * 31) + this.f73068c.hashCode()) * 31) + this.f73069d.hashCode()) * 31) + this.f73070e.hashCode();
    }

    public String toString() {
        String str = this.f73066a;
        String str2 = this.f73067b;
        String str3 = this.f73068c;
        String str4 = this.f73069d;
        List<String> list = this.f73070e;
        return "Dependency(name=" + str + ", link=" + str2 + ", licenseText=" + str3 + ", copyright=" + str4 + ", artifacts=" + list + ")";
    }

    public C9729a(String str, String str2, String str3, String str4, List<String> list) {
        C17542s.j(str, "name");
        C17542s.j(str2, "link");
        C17542s.j(str3, "licenseText");
        C17542s.j(str4, "copyright");
        C17542s.j(list, "artifacts");
        this.f73066a = str;
        this.f73067b = str2;
        this.f73068c = str3;
        this.f73069d = str4;
        this.f73070e = list;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C9729a(java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.util.List r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
        /*
            r3 = this;
            r10 = r9 & 1
            java.lang.String r0 = ""
            if (r10 == 0) goto L_0x0008
            r10 = r0
            goto L_0x0009
        L_0x0008:
            r10 = r4
        L_0x0009:
            r4 = r9 & 2
            if (r4 == 0) goto L_0x000f
            r1 = r0
            goto L_0x0010
        L_0x000f:
            r1 = r5
        L_0x0010:
            r4 = r9 & 4
            if (r4 == 0) goto L_0x0016
            r2 = r0
            goto L_0x0017
        L_0x0016:
            r2 = r6
        L_0x0017:
            r4 = r9 & 8
            if (r4 == 0) goto L_0x001c
            goto L_0x001d
        L_0x001c:
            r0 = r7
        L_0x001d:
            r4 = r9 & 16
            if (r4 == 0) goto L_0x0025
            java.util.List r8 = YH.C16877v.n()
        L_0x0025:
            r9 = r8
            r4 = r3
            r5 = r10
            r6 = r1
            r7 = r2
            r8 = r0
            r4.<init>(r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gf.C9729a.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
