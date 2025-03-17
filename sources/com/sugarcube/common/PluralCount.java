package com.sugarcube.common;

import kotlin.Metadata;
import mI.C17604b;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\b@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u0005J\u0010\u0010\u000f\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0001\u0002¨\u0006\u0013"}, d2 = {"Lcom/sugarcube/common/PluralCount;", "", "value", "", "constructor-impl", "(I)I", "getValue", "()I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C17604b
public final class PluralCount {
    private final int value;

    private /* synthetic */ PluralCount(int i10) {
        this.value = i10;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ PluralCount m31boximpl(int i10) {
        return new PluralCount(i10);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m32constructorimpl(int i10) {
        if (i10 >= 0) {
            return i10;
        }
        throw new IllegalArgumentException("Plural count should be >= 0");
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m33equalsimpl(int i10, Object obj) {
        return (obj instanceof PluralCount) && i10 == ((PluralCount) obj).m37unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m34equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m35hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m36toStringimpl(int i10) {
        return "PluralCount(value=" + i10 + ")";
    }

    public boolean equals(Object obj) {
        return m33equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return m35hashCodeimpl(this.value);
    }

    public String toString() {
        return m36toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m37unboximpl() {
        return this.value;
    }
}
