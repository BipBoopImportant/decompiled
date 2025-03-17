package oj;

import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.U;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u001b\u0010\nR\u001a\u0010!\u001a\u00020\u001c8\u0016X\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Loj/h;", "Loj/b;", "", "imageUrl", "altText", "title", "description", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "i", "b", "g", "c", "j", "d", "h", "", "e", "J", "f", "()J", "stableId", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h implements C11681b {

    /* renamed from: a  reason: collision with root package name */
    private final String f100425a;

    /* renamed from: b  reason: collision with root package name */
    private final String f100426b;

    /* renamed from: c  reason: collision with root package name */
    private final String f100427c;

    /* renamed from: d  reason: collision with root package name */
    private final String f100428d;

    /* renamed from: e  reason: collision with root package name */
    private final long f100429e;

    public h(String str, String str2, String str3, String str4) {
        C17542s.j(str, "imageUrl");
        C17542s.j(str2, "altText");
        C17542s.j(str3, "title");
        C17542s.j(str4, "description");
        this.f100425a = str;
        this.f100426b = str2;
        this.f100427c = str3;
        this.f100428d = str4;
        Object[] objArr = {str3, str4};
        U u10 = new U(3);
        u10.a(P.b(h.class));
        u10.a(str);
        u10.b(objArr);
        this.f100429e = (long) Objects.hash(u10.d(new Object[u10.c()]));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return C17542s.e(this.f100425a, hVar.f100425a) && C17542s.e(this.f100426b, hVar.f100426b) && C17542s.e(this.f100427c, hVar.f100427c) && C17542s.e(this.f100428d, hVar.f100428d);
    }

    public long f() {
        return this.f100429e;
    }

    public final String g() {
        return this.f100426b;
    }

    public final String h() {
        return this.f100428d;
    }

    public int hashCode() {
        return (((((this.f100425a.hashCode() * 31) + this.f100426b.hashCode()) * 31) + this.f100427c.hashCode()) * 31) + this.f100428d.hashCode();
    }

    public final String i() {
        return this.f100425a;
    }

    public final String j() {
        return this.f100427c;
    }

    public String toString() {
        String str = this.f100425a;
        String str2 = this.f100426b;
        String str3 = this.f100427c;
        String str4 = this.f100428d;
        return "ProductInfoModel(imageUrl=" + str + ", altText=" + str2 + ", title=" + str3 + ", description=" + str4 + ")";
    }
}
