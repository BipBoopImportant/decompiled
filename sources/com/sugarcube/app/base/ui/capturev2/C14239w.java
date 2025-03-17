package com.sugarcube.app.base.ui.capturev2;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000f\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u0016R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0012\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/sugarcube/app/base/ui/capturev2/w;", "", "", "rowStride", "pixelStride", "", "buffer", "<init>", "(II[B)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "setRowStride", "(I)V", "getPixelStride", "setPixelStride", "c", "[B", "()[B", "setBuffer", "([B)V", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.sugarcube.app.base.ui.capturev2.w  reason: case insensitive filesystem */
public final class C14239w {

    /* renamed from: a  reason: collision with root package name */
    private int f124071a;

    /* renamed from: b  reason: collision with root package name */
    private int f124072b;

    /* renamed from: c  reason: collision with root package name */
    private byte[] f124073c;

    public C14239w(int i10, int i11, byte[] bArr) {
        C17542s.j(bArr, "buffer");
        this.f124071a = i10;
        this.f124072b = i11;
        this.f124073c = bArr;
    }

    public final byte[] a() {
        return this.f124073c;
    }

    public final int b() {
        return this.f124071a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14239w)) {
            return false;
        }
        C14239w wVar = (C14239w) obj;
        return this.f124071a == wVar.f124071a && this.f124072b == wVar.f124072b && C17542s.e(this.f124073c, wVar.f124073c);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f124071a) * 31) + Integer.hashCode(this.f124072b)) * 31) + Arrays.hashCode(this.f124073c);
    }

    public String toString() {
        int i10 = this.f124071a;
        int i11 = this.f124072b;
        String arrays = Arrays.toString(this.f124073c);
        return "BufferedPlane(rowStride=" + i10 + ", pixelStride=" + i11 + ", buffer=" + arrays + ")";
    }
}
