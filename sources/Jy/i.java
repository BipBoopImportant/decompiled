package Jy;

import Op.a1;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import rz.C15026t;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u0015\u0010\u001a¨\u0006\u001b"}, d2 = {"LJy/i;", "", "", "barcode", "LOp/a1;", "productItem", "Lrz/t;", "itemLocation", "<init>", "(Ljava/lang/String;LOp/a1;Lrz/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "LOp/a1;", "c", "()LOp/a1;", "Lrz/t;", "()Lrz/t;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i {

    /* renamed from: a  reason: collision with root package name */
    private final String f111412a;

    /* renamed from: b  reason: collision with root package name */
    private final a1 f111413b;

    /* renamed from: c  reason: collision with root package name */
    private final C15026t f111414c;

    public i(String str, a1 a1Var, C15026t tVar) {
        C17542s.j(str, "barcode");
        C17542s.j(a1Var, "productItem");
        this.f111412a = str;
        this.f111413b = a1Var;
        this.f111414c = tVar;
    }

    public final String a() {
        return this.f111412a;
    }

    public final C15026t b() {
        return this.f111414c;
    }

    public final a1 c() {
        return this.f111413b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return C17542s.e(this.f111412a, iVar.f111412a) && C17542s.e(this.f111413b, iVar.f111413b) && C17542s.e(this.f111414c, iVar.f111414c);
    }

    public int hashCode() {
        int hashCode = ((this.f111412a.hashCode() * 31) + this.f111413b.hashCode()) * 31;
        C15026t tVar = this.f111414c;
        return hashCode + (tVar == null ? 0 : tVar.hashCode());
    }

    public String toString() {
        String str = this.f111412a;
        a1 a1Var = this.f111413b;
        C15026t tVar = this.f111414c;
        return "CartListItemUiModel(barcode=" + str + ", productItem=" + a1Var + ", itemLocation=" + tVar + ")";
    }
}
