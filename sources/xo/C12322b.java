package xo;

import YH.C16877v;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import qg.i;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0001\u0018\u00002\u00020\u0001BO\u0012\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002\u0012\u0010\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002\u0012\u0010\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002\u0012\u0010\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002¢\u0006\u0004\b\b\u0010\tR!\u0010\u000e\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR!\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR!\u0010\u0013\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0012\u0010\rR!\u0010\u0015\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\u0014\u0010\rR!\u0010\u0016\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u000f\u0010\rR!\u0010\u0017\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u000b\u001a\u0004\b\n\u0010\r¨\u0006\u0018"}, d2 = {"Lxo/b;", "", "", "Lqg/i;", "primaryAll", "secondaryAll", "contactAll", "termsAll", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "a", "Ljava/util/List;", "d", "()Ljava/util/List;", "primaryVisible", "b", "e", "secondaryVisible", "c", "contactVisible", "f", "termsVisible", "activeVisible", "activeAll", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: xo.b  reason: case insensitive filesystem */
public final class C12322b {

    /* renamed from: a  reason: collision with root package name */
    private final List<i<?>> f106103a;

    /* renamed from: b  reason: collision with root package name */
    private final List<i<?>> f106104b;

    /* renamed from: c  reason: collision with root package name */
    private final List<i<?>> f106105c;

    /* renamed from: d  reason: collision with root package name */
    private final List<i<?>> f106106d;

    /* renamed from: e  reason: collision with root package name */
    private final List<i<?>> f106107e;

    /* renamed from: f  reason: collision with root package name */
    private final List<i<?>> f106108f;

    public C12322b(List<? extends i<?>> list, List<? extends i<?>> list2, List<? extends i<?>> list3, List<? extends i<?>> list4) {
        C17542s.j(list, "primaryAll");
        C17542s.j(list2, "secondaryAll");
        C17542s.j(list3, "contactAll");
        C17542s.j(list4, "termsAll");
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (((i) next).p()) {
                arrayList.add(next);
            }
        }
        this.f106103a = arrayList;
        ArrayList arrayList2 = new ArrayList();
        for (Object next2 : list2) {
            if (((i) next2).p()) {
                arrayList2.add(next2);
            }
        }
        this.f106104b = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        for (Object next3 : list3) {
            if (((i) next3).p()) {
                arrayList3.add(next3);
            }
        }
        this.f106105c = arrayList3;
        ArrayList arrayList4 = new ArrayList();
        for (Object next4 : list4) {
            if (((i) next4).p()) {
                arrayList4.add(next4);
            }
        }
        this.f106106d = arrayList4;
        this.f106107e = C16877v.A(C16877v.q(this.f106103a, this.f106104b, this.f106105c, arrayList4));
        this.f106108f = C16877v.A(C16877v.q(list, list2, list3, list4));
    }

    public final List<i<?>> a() {
        return this.f106108f;
    }

    public final List<i<?>> b() {
        return this.f106107e;
    }

    public final List<i<?>> c() {
        return this.f106105c;
    }

    public final List<i<?>> d() {
        return this.f106103a;
    }

    public final List<i<?>> e() {
        return this.f106104b;
    }

    public final List<i<?>> f() {
        return this.f106106d;
    }
}
