package t4;

import N3.r;
import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import java.util.List;
import t3.B;
import t3.H;

public interface L {

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f56232a;

        /* renamed from: b  reason: collision with root package name */
        public final int f56233b;

        /* renamed from: c  reason: collision with root package name */
        public final byte[] f56234c;

        public a(String str, int i10, byte[] bArr) {
            this.f56232a = str;
            this.f56233b = i10;
            this.f56234c = bArr;
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f56235a;

        /* renamed from: b  reason: collision with root package name */
        public final String f56236b;

        /* renamed from: c  reason: collision with root package name */
        public final int f56237c;

        /* renamed from: d  reason: collision with root package name */
        public final List<a> f56238d;

        /* renamed from: e  reason: collision with root package name */
        public final byte[] f56239e;

        public b(int i10, String str, int i11, List<a> list, byte[] bArr) {
            this.f56235a = i10;
            this.f56236b = str;
            this.f56237c = i11;
            this.f56238d = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
            this.f56239e = bArr;
        }

        public int a() {
            int i10 = this.f56237c;
            return i10 != 2 ? i10 != 3 ? 0 : 512 : RecyclerView.n.FLAG_MOVED;
        }
    }

    public interface c {
        SparseArray<L> a();

        L b(int i10, b bVar);
    }

    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        private final String f56240a;

        /* renamed from: b  reason: collision with root package name */
        private final int f56241b;

        /* renamed from: c  reason: collision with root package name */
        private final int f56242c;

        /* renamed from: d  reason: collision with root package name */
        private int f56243d;

        /* renamed from: e  reason: collision with root package name */
        private String f56244e;

        public d(int i10, int i11) {
            this(Integer.MIN_VALUE, i10, i11);
        }

        private void d() {
            if (this.f56243d == Integer.MIN_VALUE) {
                throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
            }
        }

        public void a() {
            int i10 = this.f56243d;
            this.f56243d = i10 == Integer.MIN_VALUE ? this.f56241b : i10 + this.f56242c;
            this.f56244e = this.f56240a + this.f56243d;
        }

        public String b() {
            d();
            return this.f56244e;
        }

        public int c() {
            d();
            return this.f56243d;
        }

        public d(int i10, int i11, int i12) {
            String str;
            if (i10 != Integer.MIN_VALUE) {
                str = i10 + "/";
            } else {
                str = "";
            }
            this.f56240a = str;
            this.f56241b = i11;
            this.f56242c = i12;
            this.f56243d = Integer.MIN_VALUE;
            this.f56244e = "";
        }
    }

    void a(B b10, int i10);

    void b(H h10, r rVar, d dVar);

    void c();
}
