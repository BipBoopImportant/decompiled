package rz;

import com.ingka.ikea.core.model.Image;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0013\b\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0011R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lrz/m;", "", "", "itemNumber", "type", "", "qty", "", "Lcom/ingka/ikea/core/model/Image;", "images", "Lrz/t;", "itemLocation", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Lrz/t;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getItemNumber", "b", "getType", "c", "I", "getQty", "d", "Ljava/util/List;", "getImages", "()Ljava/util/List;", "e", "Lrz/t;", "getItemLocation", "()Lrz/t;", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: rz.m  reason: case insensitive filesystem */
public final class C15020m {

    /* renamed from: a  reason: collision with root package name */
    private final String f130871a;

    /* renamed from: b  reason: collision with root package name */
    private final String f130872b;

    /* renamed from: c  reason: collision with root package name */
    private final int f130873c;

    /* renamed from: d  reason: collision with root package name */
    private final List<Image> f130874d;

    /* renamed from: e  reason: collision with root package name */
    private final C15026t f130875e;

    public C15020m(String str, String str2, int i10, List<Image> list, C15026t tVar) {
        C17542s.j(str, "itemNumber");
        C17542s.j(str2, "type");
        C17542s.j(list, "images");
        C17542s.j(tVar, "itemLocation");
        this.f130871a = str;
        this.f130872b = str2;
        this.f130873c = i10;
        this.f130874d = list;
        this.f130875e = tVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15020m)) {
            return false;
        }
        C15020m mVar = (C15020m) obj;
        return C17542s.e(this.f130871a, mVar.f130871a) && C17542s.e(this.f130872b, mVar.f130872b) && this.f130873c == mVar.f130873c && C17542s.e(this.f130874d, mVar.f130874d) && C17542s.e(this.f130875e, mVar.f130875e);
    }

    public int hashCode() {
        return (((((((this.f130871a.hashCode() * 31) + this.f130872b.hashCode()) * 31) + Integer.hashCode(this.f130873c)) * 31) + this.f130874d.hashCode()) * 31) + this.f130875e.hashCode();
    }

    public String toString() {
        String str = this.f130871a;
        String str2 = this.f130872b;
        int i10 = this.f130873c;
        List<Image> list = this.f130874d;
        C15026t tVar = this.f130875e;
        return "CombinationProductChildItem(itemNumber=" + str + ", type=" + str2 + ", qty=" + i10 + ", images=" + list + ", itemLocation=" + tVar + ")";
    }
}
