package com.sugarcube.app.base.ui.capturev2;

import YH.C16877v;
import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\b*\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0010\u001a\u00020\u000f*\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010#\u001a\u0004\u0018\u00010 8F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0011\u0010'\u001a\u00020$8F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0011\u0010)\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b(\u0010\u0015R\u0011\u0010+\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b*\u0010\u0015R\u0011\u0010-\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b,\u0010\u0013¨\u0006."}, d2 = {"Lcom/sugarcube/app/base/ui/capturev2/X;", "", "Lcom/sugarcube/app/base/ui/capturev2/a;", "arPano", "Lcom/sugarcube/app/base/ui/capturev2/v1;", "ultrawidePano", "<init>", "(Lcom/sugarcube/app/base/ui/capturev2/a;Lcom/sugarcube/app/base/ui/capturev2/v1;)V", "", "Lcom/sugarcube/app/base/ui/capturev2/V;", "", "timestamp", "", "b", "(Ljava/util/List;J)Ljava/util/List;", "", "a", "(Ljava/util/List;J)I", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/sugarcube/app/base/ui/capturev2/a;", "c", "()Lcom/sugarcube/app/base/ui/capturev2/a;", "Lcom/sugarcube/app/base/ui/capturev2/v1;", "i", "()Lcom/sugarcube/app/base/ui/capturev2/v1;", "Landroid/graphics/Bitmap;", "d", "()Landroid/graphics/Bitmap;", "image", "Lcom/sugarcube/app/base/ui/capturev2/W;", "e", "()Lcom/sugarcube/app/base/ui/capturev2/W;", "intrinsics", "f", "panoDataSize", "g", "panoOffset", "h", "state", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class X {

    /* renamed from: a  reason: collision with root package name */
    private final C14196a f123664a;

    /* renamed from: b  reason: collision with root package name */
    private final v1 f123665b;

    public X() {
        this((C14196a) null, (v1) null, 3, (DefaultConstructorMarker) null);
    }

    private final int a(List<V> list, long j10) {
        int i10 = 0;
        double d10 = Double.MAX_VALUE;
        int i11 = 0;
        for (Object next : list) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C16877v.x();
            }
            double abs = Math.abs(((double) (((V) next).o() - j10)) / 1000000.0d);
            if (abs < d10) {
                i10 = i11;
                d10 = abs;
            }
            i11 = i12;
        }
        return i10;
    }

    private final List<String> b(List<V> list, long j10) {
        Iterable<V> iterable = list;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (V v10 : iterable) {
            double abs = Math.abs(((double) (v10.o() - j10)) / 1000000.0d);
            int a10 = v10.a();
            arrayList.add("[" + a10 + "]=" + abs);
        }
        return arrayList;
    }

    public final C14196a c() {
        return this.f123664a;
    }

    public final Bitmap d() {
        Bitmap a10;
        v1 v1Var = this.f123665b;
        if (v1Var != null && (a10 = v1Var.a()) != null) {
            return a10;
        }
        C14196a aVar = this.f123664a;
        if (aVar != null) {
            return aVar.a();
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0014, code lost:
        r0 = (r0 = r0.c()).get(g());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.sugarcube.app.base.ui.capturev2.W e() {
        /*
            r9 = this;
            com.sugarcube.app.base.ui.capturev2.v1 r0 = r9.f123665b
            if (r0 == 0) goto L_0x000a
            com.sugarcube.app.base.ui.capturev2.W r0 = r0.c()
            if (r0 != 0) goto L_0x0033
        L_0x000a:
            com.sugarcube.app.base.ui.capturev2.a r0 = r9.f123664a
            if (r0 == 0) goto L_0x0025
            java.util.List r0 = r0.c()
            if (r0 == 0) goto L_0x0025
            int r1 = r9.g()
            java.lang.Object r0 = r0.get(r1)
            com.sugarcube.app.base.ui.capturev2.V r0 = (com.sugarcube.app.base.ui.capturev2.V) r0
            if (r0 == 0) goto L_0x0025
            com.sugarcube.app.base.ui.capturev2.W r0 = r0.g()
            goto L_0x0033
        L_0x0025:
            com.sugarcube.app.base.ui.capturev2.W r0 = new com.sugarcube.app.base.ui.capturev2.W
            r7 = 31
            r8 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
        L_0x0033:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.capturev2.X.e():com.sugarcube.app.base.ui.capturev2.W");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X)) {
            return false;
        }
        X x10 = (X) obj;
        return C17542s.e(this.f123664a, x10.f123664a) && C17542s.e(this.f123665b, x10.f123665b);
    }

    public final int f() {
        C14196a aVar = this.f123664a;
        if (aVar != null) {
            return aVar.c().size();
        }
        return 1;
    }

    public final int g() {
        C14196a aVar = this.f123664a;
        if (aVar != null) {
            return a(aVar.c(), this.f123664a.d());
        }
        return 0;
    }

    public final String h() {
        v1 v1Var = this.f123665b;
        if (v1Var != null) {
            long b10 = v1Var.b();
            R0 d10 = this.f123665b.d();
            Long valueOf = d10 != null ? Long.valueOf(d10.a()) : null;
            return b10 + "," + valueOf;
        }
        C14196a aVar = this.f123664a;
        if (aVar == null) {
            return "";
        }
        long d11 = aVar.d();
        List<String> b11 = b(this.f123664a.c(), this.f123664a.d());
        return d11 + "," + b11;
    }

    public int hashCode() {
        C14196a aVar = this.f123664a;
        int i10 = 0;
        int hashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        v1 v1Var = this.f123665b;
        if (v1Var != null) {
            i10 = v1Var.hashCode();
        }
        return hashCode + i10;
    }

    public final v1 i() {
        return this.f123665b;
    }

    public String toString() {
        C14196a aVar = this.f123664a;
        v1 v1Var = this.f123665b;
        return "PanoData(arPano=" + aVar + ", ultrawidePano=" + v1Var + ")";
    }

    public X(C14196a aVar, v1 v1Var) {
        this.f123664a = aVar;
        this.f123665b = v1Var;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ X(C14196a aVar, v1 v1Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : aVar, (i10 & 2) != 0 ? null : v1Var);
    }
}
