package w2;

import android.content.res.TypedArray;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001d\u0010\u0006\u001a\u00020\u0001*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroid/content/res/TypedArray;", "", "index", "LXH/N;", "a", "(Landroid/content/res/TypedArray;I)V", "b", "(Landroid/content/res/TypedArray;I)I", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class k {
    private static final void a(TypedArray typedArray, int i10) {
        if (!typedArray.hasValue(i10)) {
            throw new IllegalArgumentException("Attribute not defined in set.");
        }
    }

    public static final int b(TypedArray typedArray, int i10) {
        a(typedArray, i10);
        return typedArray.getResourceId(i10, 0);
    }
}
