package r6;

import WK.C16762E;
import WK.C16777l;
import android.os.StatFs;
import java.io.File;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LWK/l;", "LWK/E;", "directory", "", "a", "(LWK/l;LWK/E;)J", "coil-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class k {
    public static final long a(C16777l lVar, C16762E e10) {
        File I10 = e10.I();
        I10.mkdir();
        StatFs statFs = new StatFs(I10.getAbsolutePath());
        return statFs.getBlockCountLong() * statFs.getBlockSizeLong();
    }
}
