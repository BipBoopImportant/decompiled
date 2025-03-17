package sG;

import OE.n;
import com.sugarcube.common.UiText;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"LsG/q;", "", "Lcom/sugarcube/common/UiText;", "messageRes", "<init>", "(Lcom/sugarcube/common/UiText;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/sugarcube/common/UiText;", "()Lcom/sugarcube/common/UiText;", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class q {

    /* renamed from: a  reason: collision with root package name */
    private final UiText f146965a;

    public q() {
        this((UiText) null, 1, (DefaultConstructorMarker) null);
    }

    public final UiText a() {
        return this.f146965a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && C17542s.e(this.f146965a, ((q) obj).f146965a);
    }

    public int hashCode() {
        return this.f146965a.hashCode();
    }

    public String toString() {
        UiText uiText = this.f146965a;
        return "CartError(messageRes=" + uiText + ")";
    }

    public q(UiText uiText) {
        C17542s.j(uiText, "messageRes");
        this.f146965a = uiText;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(UiText uiText, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new UiText.StringResource(n.f113336b5, (List) null, 2, (DefaultConstructorMarker) null) : uiText);
    }
}
