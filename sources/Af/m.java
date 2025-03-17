package af;

import Cp.c;
import XH.C16807N;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\b\u0018\u00002\u00020\u0001BE\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001e\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b\u001f\u0010\u000fR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"¨\u0006#"}, d2 = {"Laf/m;", "", "", "LCp/c;", "list", "", "title", "description", "privacyPolicyLinkText", "Lkotlin/Function0;", "LXH/N;", "openPrivacyPolicy", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LnI/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "d", "()Ljava/util/List;", "b", "Ljava/lang/String;", "g", "c", "f", "e", "LnI/a;", "()LnI/a;", "profile-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class m {

    /* renamed from: a  reason: collision with root package name */
    private final List<c> f65314a;

    /* renamed from: b  reason: collision with root package name */
    private final String f65315b;

    /* renamed from: c  reason: collision with root package name */
    private final String f65316c;

    /* renamed from: d  reason: collision with root package name */
    private final String f65317d;

    /* renamed from: e  reason: collision with root package name */
    private final C17631a<C16807N> f65318e;

    public m() {
        this((List) null, (String) null, (String) null, (String) null, (C17631a) null, 31, (DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: private */
    public static final C16807N b() {
        return C16807N.f139792a;
    }

    public final String c() {
        return this.f65316c;
    }

    public final List<c> d() {
        return this.f65314a;
    }

    public final C17631a<C16807N> e() {
        return this.f65318e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return C17542s.e(this.f65314a, mVar.f65314a) && C17542s.e(this.f65315b, mVar.f65315b) && C17542s.e(this.f65316c, mVar.f65316c) && C17542s.e(this.f65317d, mVar.f65317d) && C17542s.e(this.f65318e, mVar.f65318e);
    }

    public final String f() {
        return this.f65317d;
    }

    public final String g() {
        return this.f65315b;
    }

    public int hashCode() {
        return (((((((this.f65314a.hashCode() * 31) + this.f65315b.hashCode()) * 31) + this.f65316c.hashCode()) * 31) + this.f65317d.hashCode()) * 31) + this.f65318e.hashCode();
    }

    public String toString() {
        List<c> list = this.f65314a;
        String str = this.f65315b;
        String str2 = this.f65316c;
        String str3 = this.f65317d;
        C17631a<C16807N> aVar = this.f65318e;
        return "EthicsCarousel(list=" + list + ", title=" + str + ", description=" + str2 + ", privacyPolicyLinkText=" + str3 + ", openPrivacyPolicy=" + aVar + ")";
    }

    public m(List<c> list, String str, String str2, String str3, C17631a<C16807N> aVar) {
        C17542s.j(list, "list");
        C17542s.j(str, "title");
        C17542s.j(str2, "description");
        C17542s.j(str3, "privacyPolicyLinkText");
        C17542s.j(aVar, "openPrivacyPolicy");
        this.f65314a = list;
        this.f65315b = str;
        this.f65316c = str2;
        this.f65317d = str3;
        this.f65318e = aVar;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ m(java.util.List r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, nI.C17631a r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
        /*
            r3 = this;
            r10 = r9 & 1
            if (r10 == 0) goto L_0x0008
            java.util.List r4 = YH.C16877v.n()
        L_0x0008:
            r10 = r9 & 2
            java.lang.String r0 = ""
            if (r10 == 0) goto L_0x0010
            r10 = r0
            goto L_0x0011
        L_0x0010:
            r10 = r5
        L_0x0011:
            r5 = r9 & 4
            if (r5 == 0) goto L_0x0017
            r1 = r0
            goto L_0x0018
        L_0x0017:
            r1 = r6
        L_0x0018:
            r5 = r9 & 8
            if (r5 == 0) goto L_0x001d
            goto L_0x001e
        L_0x001d:
            r0 = r7
        L_0x001e:
            r5 = r9 & 16
            if (r5 == 0) goto L_0x0027
            af.l r8 = new af.l
            r8.<init>()
        L_0x0027:
            r2 = r8
            r5 = r3
            r6 = r4
            r7 = r10
            r8 = r1
            r9 = r0
            r10 = r2
            r5.<init>(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: af.m.<init>(java.util.List, java.lang.String, java.lang.String, java.lang.String, nI.a, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
