package U0;

import YH.C16877v;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0003¢\u0006\u0004\b\u0010\u0010\u000fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0011¨\u0006\u0012"}, d2 = {"LU0/F0;", "", "", "", "list", "<init>", "(Ljava/util/List;)V", "value", "LXH/N;", "a", "(I)V", "", "b", "()Z", "c", "()I", "d", "Ljava/util/List;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class F0 {

    /* renamed from: a  reason: collision with root package name */
    private final List<Integer> f13745a;

    public F0(List<Integer> list) {
        this.f13745a = list;
    }

    public final void a(int i10) {
        if (!this.f13745a.isEmpty()) {
            if (this.f13745a.get(0).intValue() != i10) {
                List<Integer> list = this.f13745a;
                if (list.get(list.size() - 1).intValue() == i10) {
                    return;
                }
            } else {
                return;
            }
        }
        int size = this.f13745a.size();
        this.f13745a.add(Integer.valueOf(i10));
        while (size > 0) {
            int i11 = ((size + 1) >>> 1) - 1;
            int intValue = this.f13745a.get(i11).intValue();
            if (i10 <= intValue) {
                break;
            }
            this.f13745a.set(size, Integer.valueOf(intValue));
            size = i11;
        }
        this.f13745a.set(size, Integer.valueOf(i10));
    }

    public final boolean b() {
        return !this.f13745a.isEmpty();
    }

    public final int c() {
        return ((Number) C16877v.w0(this.f13745a)).intValue();
    }

    public final int d() {
        int intValue;
        if (!(this.f13745a.size() > 0)) {
            C4895p.s("Set is empty");
        }
        int intValue2 = this.f13745a.get(0).intValue();
        while (!this.f13745a.isEmpty() && this.f13745a.get(0).intValue() == intValue2) {
            List<Integer> list = this.f13745a;
            list.set(0, C16877v.I0(list));
            List<Integer> list2 = this.f13745a;
            list2.remove(list2.size() - 1);
            int size = this.f13745a.size();
            int size2 = this.f13745a.size() >>> 1;
            int i10 = 0;
            while (i10 < size2) {
                int intValue3 = this.f13745a.get(i10).intValue();
                int i11 = (i10 + 1) * 2;
                int i12 = i11 - 1;
                int intValue4 = this.f13745a.get(i12).intValue();
                if (i11 < size && (intValue = this.f13745a.get(i11).intValue()) > intValue4) {
                    if (intValue <= intValue3) {
                        break;
                    }
                    this.f13745a.set(i10, Integer.valueOf(intValue));
                    this.f13745a.set(i11, Integer.valueOf(intValue3));
                    i10 = i11;
                } else if (intValue4 <= intValue3) {
                    break;
                } else {
                    this.f13745a.set(i10, Integer.valueOf(intValue4));
                    this.f13745a.set(i12, Integer.valueOf(intValue3));
                    i10 = i12;
                }
            }
        }
        return intValue2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ F0(List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new ArrayList() : list);
    }
}
