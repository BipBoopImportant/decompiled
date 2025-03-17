package EF;

import com.sugarcube.core.logger.Priority;
import kotlin.Metadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
/* renamed from: EF.a  reason: case insensitive filesystem */
public final /* synthetic */ class C12853a {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f109419a;

    static {
        int[] iArr = new int[Priority.values().length];
        iArr[Priority.VERBOSE.ordinal()] = 1;
        iArr[Priority.DEBUG.ordinal()] = 2;
        iArr[Priority.INFO.ordinal()] = 3;
        iArr[Priority.WARN.ordinal()] = 4;
        iArr[Priority.ERROR.ordinal()] = 5;
        f109419a = iArr;
    }
}
