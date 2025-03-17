package Wd;

import YH.C16877v;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import qg.i;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B+\u0012\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002\u0012\u0010\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007R!\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR!\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\f\u0010\u000bR!\u0010\r\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\t\u001a\u0004\b\b\u0010\u000b¨\u0006\u000e"}, d2 = {"LWd/t;", "", "", "Lqg/i;", "regular", "loyalty", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "a", "Ljava/util/List;", "c", "()Ljava/util/List;", "b", "active", "account-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class t {

    /* renamed from: a  reason: collision with root package name */
    private final List<i<?>> f64674a;

    /* renamed from: b  reason: collision with root package name */
    private final List<i<?>> f64675b;

    /* renamed from: c  reason: collision with root package name */
    private final List<i<?>> f64676c;

    public t(List<? extends i<?>> list, List<? extends i<?>> list2) {
        C17542s.j(list, "regular");
        C17542s.j(list2, "loyalty");
        this.f64674a = list;
        this.f64675b = list2;
        this.f64676c = C16877v.A(C16877v.q(list, list2));
    }

    public final List<i<?>> a() {
        return this.f64676c;
    }

    public final List<i<?>> b() {
        return this.f64675b;
    }

    public final List<i<?>> c() {
        return this.f64674a;
    }
}
