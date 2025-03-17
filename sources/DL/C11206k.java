package dl;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0014"}, d2 = {"Ldl/k;", "Ljava/io/Serializable;", "", "title", "body", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "uicomponents_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: dl.k  reason: case insensitive filesystem */
public final class C11206k implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    private final String f96919a;

    /* renamed from: b  reason: collision with root package name */
    private final String f96920b;

    public C11206k(String str, String str2) {
        C17542s.j(str2, "body");
        this.f96919a = str;
        this.f96920b = str2;
    }

    public final String a() {
        return this.f96920b;
    }

    public final String b() {
        return this.f96919a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11206k)) {
            return false;
        }
        C11206k kVar = (C11206k) obj;
        return C17542s.e(this.f96919a, kVar.f96919a) && C17542s.e(this.f96920b, kVar.f96920b);
    }

    public int hashCode() {
        String str = this.f96919a;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.f96920b.hashCode();
    }

    public String toString() {
        String str = this.f96919a;
        String str2 = this.f96920b;
        return "ErrorFeedbackResource(title=" + str + ", body=" + str2 + ")";
    }
}
