package nts;

import com.oppwa.mobile.connect.checkout.dialog.CheckoutActivity;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* renamed from: nts.ᦞ  reason: contains not printable characters */
public abstract class C4004<OUT_T, IN_T> extends C4066<OUT_T, IN_T> implements List<OUT_T> {

    /* renamed from: ᐳ  reason: contains not printable characters */
    public List f2677;

    /* renamed from: nts.ᦞ$ગ  reason: contains not printable characters */
    public class C4005 extends C4004<OUT_T, IN_T> {
        public C4005(List list, boolean z10) {
            super(list, z10);
        }

        /* renamed from: ഇ  reason: contains not printable characters */
        public IN_T m2471(OUT_T out_t) {
            return C4004.this.m3195(out_t);
        }

        /* renamed from: ᐳ  reason: contains not printable characters */
        public OUT_T m2472(IN_T in_t) {
            return C4004.this.m3196(in_t);
        }
    }

    /* renamed from: nts.ᦞ$ഇ  reason: contains not printable characters */
    public class C4006 extends C4146<OUT_T, IN_T> {
        public C4006(ListIterator listIterator, boolean z10) {
            super(listIterator, z10);
        }

        /* renamed from: ഇ  reason: contains not printable characters */
        public OUT_T m2473(IN_T in_t) {
            return C4004.this.m3196(in_t);
        }
    }

    public C4004(List list, boolean z10) {
        super(list, z10);
        this.f2677 = list;
    }

    public void add(int i10, OUT_T out_t) {
        if (!this.f3339) {
            this.f2677.add(i10, m3194(out_t));
            return;
        }
        throw new UnsupportedOperationException(C3727.m1052("'\u0019\u000f\u0019\r\u0019\u0007\u0000\u000eA\u0012\u0011\u000b\r\u000f\u0005\u0011\r\u001f\u001fF]\u0012\u0016\u0003\u0005R\u001a\u0007U\u0004\u0012)-g$\"!7a\u001265\u0011;:u=(z77+~$97b(-7* ).$=-+`Hv`vbvhoa.}~db`j~bpp)2}ylj=uh:k}FB\bKMNX\u000e*\u0014\u0002\u0014\u0000\u0014\n\r\u0003L\u001f\u001c\u0006\u0000\u0002\b\u001c\u0000\u0012\u0012KP\u001f\u001b\u000e\b_\u0017\nX\t\u001f$ j)/,:lÆøîøìøæáï óðêìîäðìþþ§¼üñýüöñáýøøÁØßÉÎÊÏÍÎÜÍóåóçóíêä«øûáçåïûçõõ¬·÷úö÷ýúêöóóÊÓÔÂÅÁÄÆÅ×", 0, 40, 64));
    }

    public boolean addAll(int i10, Collection<? extends OUT_T> collection) {
        throw new RuntimeException(C3727.m1052("'\u0019\u000f\u0019\r\u0019\u0007\u0000\u000eA\u0012\u0011\u000b\r\u000f\u0005\u0011\r\u001f\u001fF]\u0012\u0016\u0003\u0005R\u001a\u0007U\u0004\u0012)-g$\"!7a\u001265\u0011;:u=(z77+~$97b(-7* ).$=-+`Hv`vbvhoa.}~db`j~bpp)2}ylj=uh:k}FB\bKMNX\u000e*\u0014\u0002\u0014\u0000\u0014\n\r\u0003L\u001f\u001c\u0006\u0000\u0002\b\u001c\u0000\u0012\u0012KP\u001f\u001b\u000e\b_\u0017\nX\t\u001f$ j)/,:lÆøîøìøæáï óðêìîäðìþþ§¼üñýüöñáýøøÁØßÉÎÊÏÍÎÜÍóåóçóíêä«øûáçåïûçõõ¬·÷úö÷ýúêöóóÊÓÔÂÅÁÄÆÅ×", 40, 30, (int) CheckoutActivity.RESULT_CANCELED));
    }

    public OUT_T get(int i10) {
        return m3193(this.f2677.get(i10));
    }

    public int indexOf(Object obj) {
        return this.f2677.indexOf(m3194(obj));
    }

    public int lastIndexOf(Object obj) {
        return this.f2677.lastIndexOf(m3194(obj));
    }

    public ListIterator<OUT_T> listIterator(int i10) {
        return new C4006(this.f2677.listIterator(i10), this.f3339);
    }

    public OUT_T remove(int i10) {
        if (!this.f3339) {
            return m3193(this.f2677.remove(i10));
        }
        throw new UnsupportedOperationException(C3727.m1052("'\u0019\u000f\u0019\r\u0019\u0007\u0000\u000eA\u0012\u0011\u000b\r\u000f\u0005\u0011\r\u001f\u001fF]\u0012\u0016\u0003\u0005R\u001a\u0007U\u0004\u0012)-g$\"!7a\u001265\u0011;:u=(z77+~$97b(-7* ).$=-+`Hv`vbvhoa.}~db`j~bpp)2}ylj=uh:k}FB\bKMNX\u000e*\u0014\u0002\u0014\u0000\u0014\n\r\u0003L\u001f\u001c\u0006\u0000\u0002\b\u001c\u0000\u0012\u0012KP\u001f\u001b\u000e\b_\u0017\nX\t\u001f$ j)/,:lÆøîøìøæáï óðêìîäðìþþ§¼üñýüöñáýøøÁØßÉÎÊÏÍÎÜÍóåóçóíêä«øûáçåïûçõõ¬·÷úö÷ýúêöóóÊÓÔÂÅÁÄÆÅ×", 70, 40, 105));
    }

    public OUT_T set(int i10, OUT_T out_t) {
        if (!this.f3339) {
            return m3193(this.f2677.set(i10, m3194(out_t)));
        }
        throw new UnsupportedOperationException(C3727.m1052("'\u0019\u000f\u0019\r\u0019\u0007\u0000\u000eA\u0012\u0011\u000b\r\u000f\u0005\u0011\r\u001f\u001fF]\u0012\u0016\u0003\u0005R\u001a\u0007U\u0004\u0012)-g$\"!7a\u001265\u0011;:u=(z77+~$97b(-7* ).$=-+`Hv`vbvhoa.}~db`j~bpp)2}ylj=uh:k}FB\bKMNX\u000e*\u0014\u0002\u0014\u0000\u0014\n\r\u0003L\u001f\u001c\u0006\u0000\u0002\b\u001c\u0000\u0012\u0012KP\u001f\u001b\u000e\b_\u0017\nX\t\u001f$ j)/,:lÆøîøìøæáï óðêìîäðìþþ§¼üñýüöñáýøøÁØßÉÎÊÏÍÎÜÍóåóçóíêä«øûáçåïûçõõ¬·÷úö÷ýúêöóóÊÓÔÂÅÁÄÆÅ×", 110, 40, 35));
    }

    public List<OUT_T> subList(int i10, int i11) {
        return new C4005(this.f2677.subList(i10, i11), this.f3339);
    }

    public ListIterator<OUT_T> listIterator() {
        return listIterator(0);
    }
}
