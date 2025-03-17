package Mi;

import KJ.C15987c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0016\u0010\u000bR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019¨\u0006\u001a"}, d2 = {"LMi/a;", "", "", "label", "key", "LKJ/c;", "LMi/b;", "filterValues", "<init>", "(Ljava/lang/String;Ljava/lang/String;LKJ/c;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getLabel", "b", "c", "LKJ/c;", "()LKJ/c;", "ratingsandreviews-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Mi.a  reason: case insensitive filesystem */
public final class C10766a {

    /* renamed from: a  reason: collision with root package name */
    private final String f83376a;

    /* renamed from: b  reason: collision with root package name */
    private final String f83377b;

    /* renamed from: c  reason: collision with root package name */
    private final C15987c<C10767b> f83378c;

    public C10766a(String str, String str2, C15987c<C10767b> cVar) {
        C17542s.j(str, "label");
        C17542s.j(str2, "key");
        C17542s.j(cVar, "filterValues");
        this.f83376a = str;
        this.f83377b = str2;
        this.f83378c = cVar;
    }

    public final C15987c<C10767b> a() {
        return this.f83378c;
    }

    public final String b() {
        return this.f83377b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10766a)) {
            return false;
        }
        C10766a aVar = (C10766a) obj;
        return C17542s.e(this.f83376a, aVar.f83376a) && C17542s.e(this.f83377b, aVar.f83377b) && C17542s.e(this.f83378c, aVar.f83378c);
    }

    public int hashCode() {
        return (((this.f83376a.hashCode() * 31) + this.f83377b.hashCode()) * 31) + this.f83378c.hashCode();
    }

    public String toString() {
        String str = this.f83376a;
        String str2 = this.f83377b;
        C15987c<C10767b> cVar = this.f83378c;
        return "AvailableModifier(label=" + str + ", key=" + str2 + ", filterValues=" + cVar + ")";
    }
}
