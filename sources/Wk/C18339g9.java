package wK;

import XH.C16807N;
import com.google.android.libraries.places.api.model.PlaceTypes;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import t1.C5942c;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0016\u0010\u001eR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001f\u001a\u0004\b\u001c\u0010 ¨\u0006!"}, d2 = {"LwK/g9;", "", "Lt1/c;", "painter", "", "contentDescription", "LwK/H9;", "aspectRatio", "Lkotlin/Function0;", "LXH/N;", "onClick", "<init>", "(Lt1/c;Ljava/lang/String;LwK/H9;LnI/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lt1/c;", "d", "()Lt1/c;", "b", "Ljava/lang/String;", "c", "LwK/H9;", "()LwK/H9;", "LnI/a;", "()LnI/a;", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: wK.g9  reason: case insensitive filesystem */
public final class C18339g9 {

    /* renamed from: e  reason: collision with root package name */
    public static final int f150912e = 0;

    /* renamed from: a  reason: collision with root package name */
    private final C5942c f150913a;

    /* renamed from: b  reason: collision with root package name */
    private final String f150914b;

    /* renamed from: c  reason: collision with root package name */
    private final H9 f150915c;

    /* renamed from: d  reason: collision with root package name */
    private final C17631a<C16807N> f150916d;

    public C18339g9(C5942c cVar, String str, H9 h92, C17631a<C16807N> aVar) {
        C17542s.j(cVar, PlaceTypes.PAINTER);
        C17542s.j(h92, "aspectRatio");
        C17542s.j(aVar, "onClick");
        this.f150913a = cVar;
        this.f150914b = str;
        this.f150915c = h92;
        this.f150916d = aVar;
    }

    public final H9 a() {
        return this.f150915c;
    }

    public final String b() {
        return this.f150914b;
    }

    public final C17631a<C16807N> c() {
        return this.f150916d;
    }

    public final C5942c d() {
        return this.f150913a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18339g9)) {
            return false;
        }
        C18339g9 g9Var = (C18339g9) obj;
        return C17542s.e(this.f150913a, g9Var.f150913a) && C17542s.e(this.f150914b, g9Var.f150914b) && this.f150915c == g9Var.f150915c && C17542s.e(this.f150916d, g9Var.f150916d);
    }

    public int hashCode() {
        int hashCode = this.f150913a.hashCode() * 31;
        String str = this.f150914b;
        return ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f150915c.hashCode()) * 31) + this.f150916d.hashCode();
    }

    public String toString() {
        C5942c cVar = this.f150913a;
        String str = this.f150914b;
        H9 h92 = this.f150915c;
        C17631a<C16807N> aVar = this.f150916d;
        return "ShoppableImageBackgroundParams(painter=" + cVar + ", contentDescription=" + str + ", aspectRatio=" + h92 + ", onClick=" + aVar + ")";
    }
}
