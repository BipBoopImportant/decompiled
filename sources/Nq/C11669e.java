package nq;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, d2 = {"Lnq/e;", "Lnq/d;", "", "text", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "energylabel-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: nq.e  reason: case insensitive filesystem */
public final class C11669e extends C11668d {

    /* renamed from: a  reason: collision with root package name */
    private final String f99988a;

    /* renamed from: b  reason: collision with root package name */
    private final String f99989b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11669e(String str, String str2) {
        super((DefaultConstructorMarker) null);
        C17542s.j(str, "text");
        this.f99988a = str;
        this.f99989b = str2;
    }

    public final String a() {
        return this.f99988a;
    }

    public final String b() {
        return this.f99989b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11669e)) {
            return false;
        }
        C11669e eVar = (C11669e) obj;
        return C17542s.e(this.f99988a, eVar.f99988a) && C17542s.e(this.f99989b, eVar.f99989b);
    }

    public int hashCode() {
        int hashCode = this.f99988a.hashCode() * 31;
        String str = this.f99989b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.f99988a;
        String str2 = this.f99989b;
        return "TextValueModel(text=" + str + ", value=" + str2 + ")";
    }
}
