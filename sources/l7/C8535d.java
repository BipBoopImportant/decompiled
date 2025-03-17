package l7;

import XH.C16824o;
import XH.C16825p;
import XH.v;
import YH.C16877v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import l7.C8533b;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001c\u001a\u00020\u00068VX\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u001b¨\u0006\u001d"}, d2 = {"Ll7/d;", "Ll7/b;", "", "bytes", "<init>", "(Ljava/util/List;)V", "", "index", "LXH/v;", "i", "(I)LXH/v;", "", "get", "(I)B", "fromIndex", "toIndex", "", "P2", "(II)[B", "e0", "(II)Ll7/b;", "a", "Ljava/util/List;", "getBytes", "()Ljava/util/List;", "b", "LXH/o;", "()I", "size", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: l7.d  reason: case insensitive filesystem */
public final class C8535d implements C8533b {

    /* renamed from: a  reason: collision with root package name */
    private final List<C8533b> f54793a;

    /* renamed from: b  reason: collision with root package name */
    private final C16824o f54794b = C16825p.b(new C8534c(this));

    public C8535d(List<? extends C8533b> list) {
        C17542s.j(list, "bytes");
        this.f54793a = list;
    }

    private final v<Integer, Integer> i(int i10) {
        if (!this.f54793a.isEmpty()) {
            int i11 = 0;
            int i12 = 0;
            while (i10 >= this.f54793a.get(i12).a() + i11) {
                i11 += this.f54793a.get(i12).a();
                i12++;
                if (i12 >= this.f54793a.size()) {
                    throw new IndexOutOfBoundsException("Index " + i10 + " out of bounds for length " + a());
                }
            }
            return new v<>(Integer.valueOf(i12), Integer.valueOf(i10 - i11));
        }
        throw new IndexOutOfBoundsException("Index " + i10 + " out of bounds for length 0");
    }

    /* access modifiers changed from: private */
    public static final int k(C8535d dVar) {
        int i10 = 0;
        for (C8533b a10 : dVar.f54793a) {
            i10 += a10.a();
        }
        return i10;
    }

    public byte[] P2(int i10, int i11) {
        return C16877v.n1(C16877v.t1(e0(i10, i11)));
    }

    public int a() {
        return ((Number) this.f54794b.getValue()).intValue();
    }

    public C8533b e0(int i10, int i11) {
        int i12 = i11 - i10;
        ArrayList arrayList = new ArrayList();
        while (i12 > 0) {
            v<Integer, Integer> i13 = i(i10);
            int a10 = this.f54793a.get(i13.c().intValue()).a() - i13.d().intValue();
            if (a10 >= i12) {
                arrayList.add(this.f54793a.get(i13.c().intValue()).e0(i13.d().intValue(), i13.d().intValue() + i12));
                i12 = 0;
            } else {
                arrayList.add(this.f54793a.get(i13.c().intValue()).e0(i13.d().intValue(), i13.d().intValue() + a10));
                i12 -= a10;
                i10 += a10;
            }
        }
        return new C8535d(arrayList);
    }

    public byte get(int i10) {
        v<Integer, Integer> i11 = i(i10);
        return this.f54793a.get(i11.c().intValue()).get(i11.d().intValue());
    }

    public Iterator<Byte> iterator() {
        return C8533b.a.a(this);
    }
}
