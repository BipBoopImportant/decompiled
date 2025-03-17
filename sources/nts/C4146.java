package nts;

import java.util.ListIterator;

/* renamed from: nts.ⱱ  reason: contains not printable characters */
public abstract class C4146<OUT_T, IN_T> extends C3849<OUT_T, IN_T> implements ListIterator<OUT_T> {

    /* renamed from: ᐳ  reason: contains not printable characters */
    public ListIterator f3762;

    public C4146(ListIterator listIterator, boolean z10) {
        super(listIterator, z10);
        this.f3762 = listIterator;
    }

    public void add(OUT_T out_t) {
        this.f3762.add(out_t == null ? null : C4004.this.m3195(out_t));
    }

    public boolean hasPrevious() {
        return this.f3762.hasPrevious();
    }

    public int nextIndex() {
        return this.f3762.nextIndex();
    }

    public OUT_T previous() {
        Object previous = this.f3762.previous();
        if (previous == null) {
            return null;
        }
        return C4004.this.m3196(previous);
    }

    public int previousIndex() {
        return this.f3762.previousIndex();
    }

    public void set(OUT_T out_t) {
        if (!this.f1628) {
            this.f3762.set(out_t == null ? null : C4004.this.m3195(out_t));
            return;
        }
        throw new UnsupportedOperationException(C3727.m1052("'\u0019\u000f\u0019\r\u0019\u0007\u0000\u000eA\u0012\u0011\u000b\r\u000f\u0005\u0011\r\u001f\u001fF]\u0012\u0016\u0003\u0005R\u001a\u0007U\u0004\u0012)-g$\"!7a\u001265\u0011;:u=(z77+~$97b(-7* ).$=-+`Hv`vbvhoa.}~db`j~bpp)2}ylj=uh:k}FB\bKMNX\u000e*\u0014\u0002\u0014\u0000\u0014\n\r\u0003L\u001f\u001c\u0006\u0000\u0002\b\u001c\u0000\u0012\u0012KP\u001f\u001b\u000e\b_\u0017\nX\t\u001f$ j)/,:lÆøîøìøæáï óðêìîäðìþþ§¼üñýüöñáýøøÁØßÉÎÊÏÍÎÜÍóåóçóíêä«øûáçåïûçõõ¬·÷úö÷ýúêöóóÊÓÔÂÅÁÄÆÅ×", 150, 46, 49));
    }
}
