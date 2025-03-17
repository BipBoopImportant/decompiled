package Jm;

import IC.C13023e;
import Mm.h;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.U;
import xB.C15201a;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\t\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0018\u001a\u0004\b!\u0010\u000eR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b&\u0010\u001b\u001a\u0004\b'\u0010\u001dR\u001a\u0010+\u001a\u00020(8\u0016X\u0004¢\u0006\f\n\u0004\b\u001f\u0010)\u001a\u0004\b&\u0010*¨\u0006,"}, d2 = {"LJm/b;", "LxB/a;", "", "id", "LIC/e;", "title", "body", "imageUrl", "LMm/h;", "icon", "cta", "<init>", "(Ljava/lang/String;LIC/e;LIC/e;Ljava/lang/String;LMm/h;LIC/e;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "LIC/e;", "getTitle", "()LIC/e;", "c", "g", "d", "i", "e", "LMm/h;", "getIcon", "()LMm/h;", "f", "h", "", "J", "()J", "stableId", "benefits-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements C15201a {

    /* renamed from: a  reason: collision with root package name */
    private final String f82609a;

    /* renamed from: b  reason: collision with root package name */
    private final C13023e f82610b;

    /* renamed from: c  reason: collision with root package name */
    private final C13023e f82611c;

    /* renamed from: d  reason: collision with root package name */
    private final String f82612d;

    /* renamed from: e  reason: collision with root package name */
    private final h f82613e;

    /* renamed from: f  reason: collision with root package name */
    private final C13023e f82614f;

    /* renamed from: g  reason: collision with root package name */
    private final long f82615g;

    public b(String str, C13023e eVar, C13023e eVar2, String str2, h hVar, C13023e eVar3) {
        C17542s.j(str, "id");
        C17542s.j(eVar, "title");
        C17542s.j(eVar2, "body");
        C17542s.j(str2, "imageUrl");
        this.f82609a = str;
        this.f82610b = eVar;
        this.f82611c = eVar2;
        this.f82612d = str2;
        this.f82613e = hVar;
        this.f82614f = eVar3;
        U u10 = new U(3);
        u10.a(P.b(b.class));
        u10.a(str);
        u10.b(new Object[0]);
        this.f82615g = (long) Objects.hash(u10.d(new Object[u10.c()]));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return C17542s.e(this.f82609a, bVar.f82609a) && C17542s.e(this.f82610b, bVar.f82610b) && C17542s.e(this.f82611c, bVar.f82611c) && C17542s.e(this.f82612d, bVar.f82612d) && C17542s.e(this.f82613e, bVar.f82613e) && C17542s.e(this.f82614f, bVar.f82614f);
    }

    public long f() {
        return this.f82615g;
    }

    public final C13023e g() {
        return this.f82611c;
    }

    public final String getId() {
        return this.f82609a;
    }

    public final C13023e getTitle() {
        return this.f82610b;
    }

    public final C13023e h() {
        return this.f82614f;
    }

    public int hashCode() {
        int hashCode = ((((((this.f82609a.hashCode() * 31) + this.f82610b.hashCode()) * 31) + this.f82611c.hashCode()) * 31) + this.f82612d.hashCode()) * 31;
        h hVar = this.f82613e;
        int i10 = 0;
        int hashCode2 = (hashCode + (hVar == null ? 0 : hVar.hashCode())) * 31;
        C13023e eVar = this.f82614f;
        if (eVar != null) {
            i10 = eVar.hashCode();
        }
        return hashCode2 + i10;
    }

    public final String i() {
        return this.f82612d;
    }

    public String toString() {
        String str = this.f82609a;
        C13023e eVar = this.f82610b;
        C13023e eVar2 = this.f82611c;
        String str2 = this.f82612d;
        h hVar = this.f82613e;
        C13023e eVar3 = this.f82614f;
        return "BenefitModel(id=" + str + ", title=" + eVar + ", body=" + eVar2 + ", imageUrl=" + str2 + ", icon=" + hVar + ", cta=" + eVar3 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(String str, C13023e eVar, C13023e eVar2, String str2, h hVar, C13023e eVar3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, eVar, eVar2, str2, (i10 & 16) != 0 ? null : hVar, (i10 & 32) != 0 ? null : eVar3);
    }
}
