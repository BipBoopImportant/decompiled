package com.sugarcube.decorate.v1.internal.catalog;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0012\b\b\u0018\u00002\u00020\u0001B;\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJD\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001e\u0010\u001b¨\u0006\u001f"}, d2 = {"Lcom/sugarcube/decorate/v1/internal/catalog/W;", "", "", "numResults", "", "showLoading", "isPaging", "pagingError", "showEmptyMessage", "<init>", "(Ljava/lang/Integer;ZZZZ)V", "a", "(Ljava/lang/Integer;ZZZZ)Lcom/sugarcube/decorate/v1/internal/catalog/W;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "c", "()Ljava/lang/Integer;", "b", "Z", "f", "()Z", "g", "d", "e", "v1_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class W {

    /* renamed from: a  reason: collision with root package name */
    private final Integer f141514a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f141515b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f141516c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f141517d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f141518e;

    public W() {
        this((Integer) null, false, false, false, false, 31, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ W b(W w10, Integer num, boolean z10, boolean z11, boolean z12, boolean z13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = w10.f141514a;
        }
        if ((i10 & 2) != 0) {
            z10 = w10.f141515b;
        }
        boolean z14 = z10;
        if ((i10 & 4) != 0) {
            z11 = w10.f141516c;
        }
        boolean z15 = z11;
        if ((i10 & 8) != 0) {
            z12 = w10.f141517d;
        }
        boolean z16 = z12;
        if ((i10 & 16) != 0) {
            z13 = w10.f141518e;
        }
        return w10.a(num, z14, z15, z16, z13);
    }

    public final W a(Integer num, boolean z10, boolean z11, boolean z12, boolean z13) {
        return new W(num, z10, z11, z12, z13);
    }

    public final Integer c() {
        return this.f141514a;
    }

    public final boolean d() {
        return this.f141517d;
    }

    public final boolean e() {
        return this.f141518e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof W)) {
            return false;
        }
        W w10 = (W) obj;
        return C17542s.e(this.f141514a, w10.f141514a) && this.f141515b == w10.f141515b && this.f141516c == w10.f141516c && this.f141517d == w10.f141517d && this.f141518e == w10.f141518e;
    }

    public final boolean f() {
        return this.f141515b;
    }

    public final boolean g() {
        return this.f141516c;
    }

    public int hashCode() {
        Integer num = this.f141514a;
        return ((((((((num == null ? 0 : num.hashCode()) * 31) + Boolean.hashCode(this.f141515b)) * 31) + Boolean.hashCode(this.f141516c)) * 31) + Boolean.hashCode(this.f141517d)) * 31) + Boolean.hashCode(this.f141518e);
    }

    public String toString() {
        Integer num = this.f141514a;
        boolean z10 = this.f141515b;
        boolean z11 = this.f141516c;
        boolean z12 = this.f141517d;
        boolean z13 = this.f141518e;
        return "CatalogUIState(numResults=" + num + ", showLoading=" + z10 + ", isPaging=" + z11 + ", pagingError=" + z12 + ", showEmptyMessage=" + z13 + ")";
    }

    public W(Integer num, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f141514a = num;
        this.f141515b = z10;
        this.f141516c = z11;
        this.f141517d = z12;
        this.f141518e = z13;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ W(java.lang.Integer r4, boolean r5, boolean r6, boolean r7, boolean r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
        /*
            r3 = this;
            r10 = r9 & 1
            if (r10 == 0) goto L_0x0005
            r4 = 0
        L_0x0005:
            r10 = r9 & 2
            r0 = 0
            if (r10 == 0) goto L_0x000c
            r10 = r0
            goto L_0x000d
        L_0x000c:
            r10 = r5
        L_0x000d:
            r5 = r9 & 4
            if (r5 == 0) goto L_0x0013
            r1 = r0
            goto L_0x0014
        L_0x0013:
            r1 = r6
        L_0x0014:
            r5 = r9 & 8
            if (r5 == 0) goto L_0x001a
            r2 = r0
            goto L_0x001b
        L_0x001a:
            r2 = r7
        L_0x001b:
            r5 = r9 & 16
            if (r5 == 0) goto L_0x0020
            goto L_0x0021
        L_0x0020:
            r0 = r8
        L_0x0021:
            r5 = r3
            r6 = r4
            r7 = r10
            r8 = r1
            r9 = r2
            r10 = r0
            r5.<init>(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate.v1.internal.catalog.W.<init>(java.lang.Integer, boolean, boolean, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
