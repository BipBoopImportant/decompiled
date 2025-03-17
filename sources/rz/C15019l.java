package rz;

import com.ingka.ikea.core.model.Image;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0015\b\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u001c\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0014R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001a\u001a\u0004\b%\u0010\u0012R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b\u0019\u0010(R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00078\u0006¢\u0006\f\n\u0004\b)\u0010!\u001a\u0004\b*\u0010#¨\u0006+"}, d2 = {"Lrz/l;", "", "", "id", "name", "", "qty", "", "Lcom/ingka/ikea/core/model/Image;", "images", "basedOnSPR", "Lrz/n;", "details", "Lrz/m;", "childItems", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/lang/String;Lrz/n;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "getName", "c", "I", "getQty", "d", "Ljava/util/List;", "getImages", "()Ljava/util/List;", "e", "getBasedOnSPR", "f", "Lrz/n;", "()Lrz/n;", "g", "getChildItems", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: rz.l  reason: case insensitive filesystem */
public final class C15019l {

    /* renamed from: a  reason: collision with root package name */
    private final String f130864a;

    /* renamed from: b  reason: collision with root package name */
    private final String f130865b;

    /* renamed from: c  reason: collision with root package name */
    private final int f130866c;

    /* renamed from: d  reason: collision with root package name */
    private final List<Image> f130867d;

    /* renamed from: e  reason: collision with root package name */
    private final String f130868e;

    /* renamed from: f  reason: collision with root package name */
    private final C15021n f130869f;

    /* renamed from: g  reason: collision with root package name */
    private final List<C15020m> f130870g;

    public C15019l(String str, String str2, int i10, List<Image> list, String str3, C15021n nVar, List<C15020m> list2) {
        C17542s.j(str, "id");
        C17542s.j(str2, "name");
        C17542s.j(list, "images");
        C17542s.j(nVar, "details");
        C17542s.j(list2, "childItems");
        this.f130864a = str;
        this.f130865b = str2;
        this.f130866c = i10;
        this.f130867d = list;
        this.f130868e = str3;
        this.f130869f = nVar;
        this.f130870g = list2;
    }

    public final C15021n a() {
        return this.f130869f;
    }

    public final String b() {
        return this.f130864a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15019l)) {
            return false;
        }
        C15019l lVar = (C15019l) obj;
        return C17542s.e(this.f130864a, lVar.f130864a) && C17542s.e(this.f130865b, lVar.f130865b) && this.f130866c == lVar.f130866c && C17542s.e(this.f130867d, lVar.f130867d) && C17542s.e(this.f130868e, lVar.f130868e) && C17542s.e(this.f130869f, lVar.f130869f) && C17542s.e(this.f130870g, lVar.f130870g);
    }

    public int hashCode() {
        int hashCode = ((((((this.f130864a.hashCode() * 31) + this.f130865b.hashCode()) * 31) + Integer.hashCode(this.f130866c)) * 31) + this.f130867d.hashCode()) * 31;
        String str = this.f130868e;
        return ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f130869f.hashCode()) * 31) + this.f130870g.hashCode();
    }

    public String toString() {
        String str = this.f130864a;
        String str2 = this.f130865b;
        int i10 = this.f130866c;
        List<Image> list = this.f130867d;
        String str3 = this.f130868e;
        C15021n nVar = this.f130869f;
        List<C15020m> list2 = this.f130870g;
        return "CombinationProduct(id=" + str + ", name=" + str2 + ", qty=" + i10 + ", images=" + list + ", basedOnSPR=" + str3 + ", details=" + nVar + ", childItems=" + list2 + ")";
    }
}
