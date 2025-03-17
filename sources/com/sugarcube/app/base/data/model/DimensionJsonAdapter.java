package com.sugarcube.app.base.data.model;

import ME.c;
import YH.g0;
import com.squareup.moshi.f;
import com.squareup.moshi.k;
import com.squareup.moshi.q;
import com.squareup.moshi.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/sugarcube/app/base/data/model/DimensionJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/sugarcube/app/base/data/model/Dimension;", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Lcom/squareup/moshi/t;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "fromJson", "(Lcom/squareup/moshi/k;)Lcom/sugarcube/app/base/data/model/Dimension;", "Lcom/squareup/moshi/q;", "writer", "value_", "LXH/N;", "toJson", "(Lcom/squareup/moshi/q;Lcom/sugarcube/app/base/data/model/Dimension;)V", "Lcom/squareup/moshi/k$a;", "options", "Lcom/squareup/moshi/k$a;", "", "intAdapter", "Lcom/squareup/moshi/f;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DimensionJsonAdapter extends f<Dimension> {
    public static final int $stable = 8;
    private final f<Integer> intAdapter;
    private final k.a options;

    public DimensionJsonAdapter(t tVar) {
        C17542s.j(tVar, "moshi");
        k.a a10 = k.a.a("width", "height");
        C17542s.i(a10, "of(...)");
        this.options = a10;
        f<Integer> f10 = tVar.f(Integer.TYPE, g0.d(), "width");
        C17542s.i(f10, "adapter(...)");
        this.intAdapter = f10;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(31);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("Dimension");
        sb2.append(')');
        return sb2.toString();
    }

    public Dimension fromJson(k kVar) {
        C17542s.j(kVar, "reader");
        kVar.d();
        Integer num = null;
        Integer num2 = null;
        while (kVar.hasNext()) {
            int s10 = kVar.s(this.options);
            if (s10 == -1) {
                kVar.w();
                kVar.a0();
            } else if (s10 == 0) {
                num = this.intAdapter.fromJson(kVar);
                if (num == null) {
                    throw c.w("width", "width", kVar);
                }
            } else if (s10 == 1 && (num2 = this.intAdapter.fromJson(kVar)) == null) {
                throw c.w("height", "height", kVar);
            }
        }
        kVar.f();
        if (num != null) {
            int intValue = num.intValue();
            if (num2 != null) {
                return new Dimension(intValue, num2.intValue());
            }
            throw c.n("height", "height", kVar);
        }
        throw c.n("width", "width", kVar);
    }

    public void toJson(q qVar, Dimension dimension) {
        C17542s.j(qVar, "writer");
        if (dimension != null) {
            qVar.d();
            qVar.n("width");
            this.intAdapter.toJson(qVar, Integer.valueOf(dimension.getWidth()));
            qVar.n("height");
            this.intAdapter.toJson(qVar, Integer.valueOf(dimension.getHeight()));
            qVar.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
