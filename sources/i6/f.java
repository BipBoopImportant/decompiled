package I6;

import D2.p;

public class f {

    /* renamed from: a  reason: collision with root package name */
    private final String[] f36954a = new String[5];

    /* renamed from: b  reason: collision with root package name */
    private final long[] f36955b = new long[5];

    /* renamed from: c  reason: collision with root package name */
    private int f36956c = 0;

    /* renamed from: d  reason: collision with root package name */
    private int f36957d = 0;

    public void a(String str) {
        int i10 = this.f36956c;
        if (i10 == 5) {
            this.f36957d++;
            return;
        }
        this.f36954a[i10] = str;
        this.f36955b[i10] = System.nanoTime();
        p.a(str);
        this.f36956c++;
    }

    public float b(String str) {
        int i10 = this.f36957d;
        if (i10 > 0) {
            this.f36957d = i10 - 1;
            return 0.0f;
        }
        int i11 = this.f36956c - 1;
        this.f36956c = i11;
        if (i11 == -1) {
            throw new IllegalStateException("Can't end trace section. There are none.");
        } else if (str.equals(this.f36954a[i11])) {
            p.b();
            return ((float) (System.nanoTime() - this.f36955b[this.f36956c])) / 1000000.0f;
        } else {
            throw new IllegalStateException("Unbalanced trace call " + str + ". Expected " + this.f36954a[this.f36956c] + ".");
        }
    }
}
