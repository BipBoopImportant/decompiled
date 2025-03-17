package nts;

import java.util.Iterator;

/* renamed from: nts.ጪ  reason: contains not printable characters */
public abstract class C3849<OUT_T, IN_T> implements Iterator<OUT_T> {

    /* renamed from: ગ  reason: contains not printable characters */
    public boolean f1628;

    /* renamed from: ഇ  reason: contains not printable characters */
    public Iterator f1629;

    public C3849(Iterator it, boolean z10) {
        this.f1629 = it;
        this.f1628 = z10;
    }

    public boolean hasNext() {
        return this.f1629.hasNext();
    }

    public OUT_T next() {
        Object next = this.f1629.next();
        if (next == null) {
            return null;
        }
        return m1774(next);
    }

    public void remove() {
        if (!this.f1628) {
            this.f1629.remove();
            return;
        }
        throw new UnsupportedOperationException(C3727.m1052("'\u0019\u000f\u0019\r\u0019\u0007\u0000\u000eA\u0012\u0011\u000b\r\u000f\u0005\u0011\r\u001f\u001fF]\u0012\u0016\u0003\u0005R\u001a\u0007U\u0004\u0012)-g$\"!7a\u001265\u0011;:u=(z77+~$97b(-7* ).$=-+`Hv`vbvhoa.}~db`j~bpp)2}ylj=uh:k}FB\bKMNX\u000e*\u0014\u0002\u0014\u0000\u0014\n\r\u0003L\u001f\u001c\u0006\u0000\u0002\b\u001c\u0000\u0012\u0012KP\u001f\u001b\u000e\b_\u0017\nX\t\u001f$ j)/,:lÆøîøìøæáï óðêìîäðìþþ§¼üñýüöñáýøøÁØßÉÎÊÏÍÎÜÍóåóçóíêä«øûáçåïûçõõ¬·÷úö÷ýúêöóóÊÓÔÂÅÁÄÆÅ×", 196, 46, 104));
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public abstract OUT_T m1774(IN_T in_t);
}
