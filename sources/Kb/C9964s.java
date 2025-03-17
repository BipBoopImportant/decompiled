package kb;

import com.sugarcube.app.base.data.source.CatalogRepository;

/* renamed from: kb.s  reason: case insensitive filesystem */
final class C9964s {
    static int a(int i10, double d10) {
        int max = Math.max(i10, 2);
        int highestOneBit = Integer.highestOneBit(max);
        if (max <= ((int) (d10 * ((double) highestOneBit)))) {
            return highestOneBit;
        }
        int i11 = highestOneBit << 1;
        return i11 > 0 ? i11 : CatalogRepository.FETCH_FLAG_SDB;
    }

    static int b(int i10) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i10) * -862048943), 15)) * 461845907);
    }

    static int c(Object obj) {
        return b(obj == null ? 0 : obj.hashCode());
    }
}
