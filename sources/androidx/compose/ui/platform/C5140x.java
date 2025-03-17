package androidx.compose.ui.platform;

import L1.p;
import bI.C17035a;
import java.util.Comparator;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.platform.x  reason: case insensitive filesystem */
public final class C5140x<T> implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Comparator f19674a;

    public C5140x(Comparator comparator) {
        this.f19674a = comparator;
    }

    public final int compare(T t10, T t11) {
        int compare = this.f19674a.compare(t10, t11);
        return compare != 0 ? compare : C17035a.e(Integer.valueOf(((p) t10).o()), Integer.valueOf(((p) t11).o()));
    }
}
