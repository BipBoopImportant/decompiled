package ha;

import com.sugarcube.app.base.data.source.CatalogRepository;

public final class L0 extends M0 {
    public static int a(int i10, int i11, int i12) {
        return Math.min(Math.max(i10, i11), CatalogRepository.FETCH_FLAG_ALL);
    }
}
