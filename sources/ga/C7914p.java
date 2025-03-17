package ga;

import java.util.Arrays;

/* renamed from: ga.p  reason: case insensitive filesystem */
public final class C7914p {

    /* renamed from: a  reason: collision with root package name */
    Object[] f51405a = new Object[8];

    /* renamed from: b  reason: collision with root package name */
    int f51406b = 0;

    /* renamed from: c  reason: collision with root package name */
    C7913o f51407c;

    public final C7914p a(Object obj, Object obj2) {
        int i10 = this.f51406b + 1;
        Object[] objArr = this.f51405a;
        int length = objArr.length;
        int i11 = i10 + i10;
        if (i11 > length) {
            this.f51405a = Arrays.copyOf(objArr, C7908j.a(length, i11));
        }
        C7905g.a(obj, obj2);
        Object[] objArr2 = this.f51405a;
        int i12 = this.f51406b;
        int i13 = i12 + i12;
        objArr2[i13] = obj;
        objArr2[i13 + 1] = obj2;
        this.f51406b = i12 + 1;
        return this;
    }

    public final C7915q b() {
        C7913o oVar = this.f51407c;
        if (oVar == null) {
            C7922y i10 = C7922y.i(this.f51406b, this.f51405a, this);
            C7913o oVar2 = this.f51407c;
            if (oVar2 == null) {
                return i10;
            }
            throw oVar2.a();
        }
        throw oVar.a();
    }
}
