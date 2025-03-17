package nl;

import android.graphics.Color;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a\u001b\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "alpha", "d", "(II)I", "", "c", "(I)F", "uicomponents_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: nl.c  reason: case insensitive filesystem */
public final class C11653c {
    /* access modifiers changed from: private */
    public static final float c(int i10) {
        return ((float) i10) / 255.0f;
    }

    /* access modifiers changed from: private */
    public static final int d(int i10, int i11) {
        return Color.argb(i11, (i10 >> 16) & 255, (i10 >> 8) & 255, i10 & 255);
    }
}
