package kp;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016¨\u0006\u0017"}, d2 = {"Lkp/b;", "", "", "title", "", "Lkp/a;", "campaigns", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ljava/util/List;", "()Ljava/util/List;", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: kp.b  reason: case insensitive filesystem */
public final class C11520b {

    /* renamed from: a  reason: collision with root package name */
    private final String f99032a;

    /* renamed from: b  reason: collision with root package name */
    private final List<C11519a> f99033b;

    public C11520b(String str, List<? extends C11519a> list) {
        C17542s.j(list, "campaigns");
        this.f99032a = str;
        this.f99033b = list;
    }

    public final List<C11519a> a() {
        return this.f99033b;
    }

    public final String b() {
        return this.f99032a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11520b)) {
            return false;
        }
        C11520b bVar = (C11520b) obj;
        return C17542s.e(this.f99032a, bVar.f99032a) && C17542s.e(this.f99033b, bVar.f99033b);
    }

    public int hashCode() {
        String str = this.f99032a;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.f99033b.hashCode();
    }

    public String toString() {
        String str = this.f99032a;
        List<C11519a> list = this.f99033b;
        return "Campaigns(title=" + str + ", campaigns=" + list + ")";
    }
}
