package qB;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\r\b\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\u0018¨\u0006\u0019"}, d2 = {"LqB/c;", "", "", "listId", "listName", "imageUrl", "", "hasItem", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "d", "Z", "()Z", "listpicker-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: qB.c  reason: case insensitive filesystem */
public final class C14936c {

    /* renamed from: a  reason: collision with root package name */
    private final String f130396a;

    /* renamed from: b  reason: collision with root package name */
    private final String f130397b;

    /* renamed from: c  reason: collision with root package name */
    private final String f130398c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f130399d;

    public C14936c(String str, String str2, String str3, boolean z10) {
        C17542s.j(str, "listId");
        C17542s.j(str2, "listName");
        this.f130396a = str;
        this.f130397b = str2;
        this.f130398c = str3;
        this.f130399d = z10;
    }

    public final boolean a() {
        return this.f130399d;
    }

    public final String b() {
        return this.f130398c;
    }

    public final String c() {
        return this.f130396a;
    }

    public final String d() {
        return this.f130397b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14936c)) {
            return false;
        }
        C14936c cVar = (C14936c) obj;
        return C17542s.e(this.f130396a, cVar.f130396a) && C17542s.e(this.f130397b, cVar.f130397b) && C17542s.e(this.f130398c, cVar.f130398c) && this.f130399d == cVar.f130399d;
    }

    public int hashCode() {
        int hashCode = ((this.f130396a.hashCode() * 31) + this.f130397b.hashCode()) * 31;
        String str = this.f130398c;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.f130399d);
    }

    public String toString() {
        String str = this.f130396a;
        String str2 = this.f130397b;
        String str3 = this.f130398c;
        boolean z10 = this.f130399d;
        return "ShoppingListPickerModel(listId=" + str + ", listName=" + str2 + ", imageUrl=" + str3 + ", hasItem=" + z10 + ")";
    }
}
