package LA;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kp.i;
import kp.j;
import mp.C11588a;
import mp.C11589b;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0019\b\b\u0018\u00002\u00020\u0001By\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000e¢\u0006\u0004\b\u0014\u0010\u0015J\u0001\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010%\u001a\u0004\b'\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b)\u0010\u0019R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b2\u0010%\u001a\u0004\b3\u0010\u0019R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b,\u0010%\u001a\u0004\b(\u0010\u0019R\u001f\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b2\u00105R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b&\u0010%\u001a\u0004\b.\u0010\u0019R\u001f\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b6\u00104\u001a\u0004\b*\u00105¨\u00067"}, d2 = {"LLA/a;", "", "Lkp/i$a;", "type", "", "url", "altText", "id", "Lkp/j;", "source", "", "aspectRatio", "title", "description", "", "Lmp/b;", "products", "inspirationsTitle", "Lmp/a;", "inspirations", "<init>", "(Lkp/i$a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkp/j;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)V", "a", "(Lkp/i$a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkp/j;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)LLA/a;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lkp/i$a;", "getType", "()Lkp/i$a;", "b", "Ljava/lang/String;", "j", "c", "d", "getId", "e", "Lkp/j;", "h", "()Lkp/j;", "f", "Ljava/lang/Double;", "getAspectRatio", "()Ljava/lang/Double;", "g", "i", "Ljava/util/List;", "()Ljava/util/List;", "k", "shoppableimage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: LA.a  reason: case insensitive filesystem */
public final class C13173a {

    /* renamed from: a  reason: collision with root package name */
    private final i.a f111801a;

    /* renamed from: b  reason: collision with root package name */
    private final String f111802b;

    /* renamed from: c  reason: collision with root package name */
    private final String f111803c;

    /* renamed from: d  reason: collision with root package name */
    private final String f111804d;

    /* renamed from: e  reason: collision with root package name */
    private final j f111805e;

    /* renamed from: f  reason: collision with root package name */
    private final Double f111806f;

    /* renamed from: g  reason: collision with root package name */
    private final String f111807g;

    /* renamed from: h  reason: collision with root package name */
    private final String f111808h;

    /* renamed from: i  reason: collision with root package name */
    private final List<C11589b> f111809i;

    /* renamed from: j  reason: collision with root package name */
    private final String f111810j;

    /* renamed from: k  reason: collision with root package name */
    private final List<C11588a> f111811k;

    public C13173a(i.a aVar, String str, String str2, String str3, j jVar, Double d10, String str4, String str5, List<C11589b> list, String str6, List<C11588a> list2) {
        C17542s.j(aVar, "type");
        C17542s.j(str, "url");
        C17542s.j(str2, "altText");
        C17542s.j(str3, "id");
        this.f111801a = aVar;
        this.f111802b = str;
        this.f111803c = str2;
        this.f111804d = str3;
        this.f111805e = jVar;
        this.f111806f = d10;
        this.f111807g = str4;
        this.f111808h = str5;
        this.f111809i = list;
        this.f111810j = str6;
        this.f111811k = list2;
    }

    public static /* synthetic */ C13173a b(C13173a aVar, i.a aVar2, String str, String str2, String str3, j jVar, Double d10, String str4, String str5, List list, String str6, List list2, int i10, Object obj) {
        C13173a aVar3 = aVar;
        int i11 = i10;
        return aVar.a((i11 & 1) != 0 ? aVar3.f111801a : aVar2, (i11 & 2) != 0 ? aVar3.f111802b : str, (i11 & 4) != 0 ? aVar3.f111803c : str2, (i11 & 8) != 0 ? aVar3.f111804d : str3, (i11 & 16) != 0 ? aVar3.f111805e : jVar, (i11 & 32) != 0 ? aVar3.f111806f : d10, (i11 & 64) != 0 ? aVar3.f111807g : str4, (i11 & 128) != 0 ? aVar3.f111808h : str5, (i11 & 256) != 0 ? aVar3.f111809i : list, (i11 & 512) != 0 ? aVar3.f111810j : str6, (i11 & 1024) != 0 ? aVar3.f111811k : list2);
    }

    public final C13173a a(i.a aVar, String str, String str2, String str3, j jVar, Double d10, String str4, String str5, List<C11589b> list, String str6, List<C11588a> list2) {
        C17542s.j(aVar, "type");
        C17542s.j(str, "url");
        String str7 = str2;
        C17542s.j(str7, "altText");
        String str8 = str3;
        C17542s.j(str8, "id");
        return new C13173a(aVar, str, str7, str8, jVar, d10, str4, str5, list, str6, list2);
    }

    public final String c() {
        return this.f111803c;
    }

    public final String d() {
        return this.f111808h;
    }

    public final List<C11588a> e() {
        return this.f111811k;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13173a)) {
            return false;
        }
        C13173a aVar = (C13173a) obj;
        return this.f111801a == aVar.f111801a && C17542s.e(this.f111802b, aVar.f111802b) && C17542s.e(this.f111803c, aVar.f111803c) && C17542s.e(this.f111804d, aVar.f111804d) && C17542s.e(this.f111805e, aVar.f111805e) && C17542s.e(this.f111806f, aVar.f111806f) && C17542s.e(this.f111807g, aVar.f111807g) && C17542s.e(this.f111808h, aVar.f111808h) && C17542s.e(this.f111809i, aVar.f111809i) && C17542s.e(this.f111810j, aVar.f111810j) && C17542s.e(this.f111811k, aVar.f111811k);
    }

    public final String f() {
        return this.f111810j;
    }

    public final List<C11589b> g() {
        return this.f111809i;
    }

    public final j h() {
        return this.f111805e;
    }

    public int hashCode() {
        int hashCode = ((((((this.f111801a.hashCode() * 31) + this.f111802b.hashCode()) * 31) + this.f111803c.hashCode()) * 31) + this.f111804d.hashCode()) * 31;
        j jVar = this.f111805e;
        int i10 = 0;
        int hashCode2 = (hashCode + (jVar == null ? 0 : jVar.hashCode())) * 31;
        Double d10 = this.f111806f;
        int hashCode3 = (hashCode2 + (d10 == null ? 0 : d10.hashCode())) * 31;
        String str = this.f111807g;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f111808h;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<C11589b> list = this.f111809i;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.f111810j;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<C11588a> list2 = this.f111811k;
        if (list2 != null) {
            i10 = list2.hashCode();
        }
        return hashCode7 + i10;
    }

    public final String i() {
        return this.f111807g;
    }

    public final String j() {
        return this.f111802b;
    }

    public String toString() {
        i.a aVar = this.f111801a;
        String str = this.f111802b;
        String str2 = this.f111803c;
        String str3 = this.f111804d;
        j jVar = this.f111805e;
        Double d10 = this.f111806f;
        String str4 = this.f111807g;
        String str5 = this.f111808h;
        List<C11589b> list = this.f111809i;
        String str6 = this.f111810j;
        List<C11588a> list2 = this.f111811k;
        return "ShoppableImageModel(type=" + aVar + ", url=" + str + ", altText=" + str2 + ", id=" + str3 + ", source=" + jVar + ", aspectRatio=" + d10 + ", title=" + str4 + ", description=" + str5 + ", products=" + list + ", inspirationsTitle=" + str6 + ", inspirations=" + list2 + ")";
    }
}
