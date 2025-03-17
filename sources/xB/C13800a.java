package XB;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u000bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\u000b¨\u0006\u0018"}, d2 = {"LXB/a;", "", "", "title", "description", "", "icon", "altText", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "c", "I", "storedetails-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: XB.a  reason: case insensitive filesystem */
public final class C13800a {

    /* renamed from: a  reason: collision with root package name */
    private final String f117764a;

    /* renamed from: b  reason: collision with root package name */
    private final String f117765b;

    /* renamed from: c  reason: collision with root package name */
    private final int f117766c;

    /* renamed from: d  reason: collision with root package name */
    private final String f117767d;

    public C13800a(String str, String str2, int i10, String str3) {
        this.f117764a = str;
        this.f117765b = str2;
        this.f117766c = i10;
        this.f117767d = str3;
    }

    public final String a() {
        return this.f117767d;
    }

    public final String b() {
        return this.f117765b;
    }

    public final int c() {
        return this.f117766c;
    }

    public final String d() {
        return this.f117764a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13800a)) {
            return false;
        }
        C13800a aVar = (C13800a) obj;
        return C17542s.e(this.f117764a, aVar.f117764a) && C17542s.e(this.f117765b, aVar.f117765b) && this.f117766c == aVar.f117766c && C17542s.e(this.f117767d, aVar.f117767d);
    }

    public int hashCode() {
        String str = this.f117764a;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f117765b;
        int hashCode2 = (((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + Integer.hashCode(this.f117766c)) * 31;
        String str3 = this.f117767d;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        String str = this.f117764a;
        String str2 = this.f117765b;
        int i10 = this.f117766c;
        String str3 = this.f117767d;
        return "InfoServiceItemUiModel(title=" + str + ", description=" + str2 + ", icon=" + i10 + ", altText=" + str3 + ")";
    }
}
