package androidx.compose.ui.platform;

import L1.p;
import java.util.Comparator;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0004\u001a\n \u0002*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"T", "K", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.platform.w  reason: case insensitive filesystem */
public final class C5138w<T> implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Comparator f19671a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Comparator f19672b;

    public C5138w(Comparator comparator, Comparator comparator2) {
        this.f19671a = comparator;
        this.f19672b = comparator2;
    }

    public final int compare(T t10, T t11) {
        int compare = this.f19671a.compare(t10, t11);
        return compare != 0 ? compare : this.f19672b.compare(((p) t10).q(), ((p) t11).q());
    }
}
