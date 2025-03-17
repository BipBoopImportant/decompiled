package nts;

import androidx.recyclerview.widget.RecyclerView;
import java.io.InputStream;
import java.io.PushbackInputStream;

/* renamed from: nts.ᕷ  reason: contains not printable characters */
public class C3912 extends C3897 {
    public C3912(InputStream inputStream) {
        super(m2038(inputStream, RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT), new C4023(), RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT);
        m1991(true);
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static PushbackInputStream m2038(InputStream inputStream, int i10) {
        return inputStream instanceof PushbackInputStream ? (PushbackInputStream) inputStream : new PushbackInputStream(inputStream, i10);
    }

    public void close() {
        if (!this.f1812) {
            if (this.f1809) {
                this.f1810.close();
            }
            this.f1812 = true;
        }
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m2039() {
        byte[] r02 = m1992(8);
        m1989(r02, 0, 4);
        m1989(r02, 4, 4);
        throw null;
    }
}
