package C;

import H2.i;
import O.a0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public final class I0 {

    /* renamed from: a  reason: collision with root package name */
    private final J0 f5246a;

    /* renamed from: b  reason: collision with root package name */
    private final List<H0> f5247b;

    /* renamed from: c  reason: collision with root package name */
    private final List<C4404l> f5248c;

    public static final class a {

        /* renamed from: d  reason: collision with root package name */
        private static final List<Integer> f5249d = Arrays.asList(new Integer[]{1, 2, 4, 3, 7});

        /* renamed from: a  reason: collision with root package name */
        private J0 f5250a;

        /* renamed from: b  reason: collision with root package name */
        private final List<H0> f5251b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        private final List<C4404l> f5252c = new ArrayList();

        private void d() {
            int i10 = 0;
            for (C4404l g10 : this.f5252c) {
                int g11 = g10.g();
                a0.a(f5249d, g11);
                int i11 = i10 & g11;
                if (i11 <= 0) {
                    i10 |= g11;
                } else {
                    throw new IllegalArgumentException(String.format(Locale.US, "More than one effects has targets %s.", new Object[]{a0.b(i11)}));
                }
            }
        }

        public a a(C4404l lVar) {
            this.f5252c.add(lVar);
            return this;
        }

        public a b(H0 h02) {
            this.f5251b.add(h02);
            return this;
        }

        public I0 c() {
            i.b(!this.f5251b.isEmpty(), "UseCase must not be empty.");
            d();
            return new I0(this.f5250a, this.f5251b, this.f5252c);
        }

        public a e(J0 j02) {
            this.f5250a = j02;
            return this;
        }
    }

    I0(J0 j02, List<H0> list, List<C4404l> list2) {
        this.f5246a = j02;
        this.f5247b = list;
        this.f5248c = list2;
    }

    public List<C4404l> a() {
        return this.f5248c;
    }

    public List<H0> b() {
        return this.f5247b;
    }

    public J0 c() {
        return this.f5246a;
    }
}
