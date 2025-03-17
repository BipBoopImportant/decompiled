package h4;

import N3.C6679q;
import N3.I;
import c4.C7091b;
import java.util.ArrayList;
import java.util.List;
import q3.z;
import t3.B;

final class p {

    /* renamed from: d  reason: collision with root package name */
    private static final jb.p f51583d = jb.p.d(':');

    /* renamed from: e  reason: collision with root package name */
    private static final jb.p f51584e = jb.p.d('*');

    /* renamed from: a  reason: collision with root package name */
    private final List<a> f51585a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private int f51586b = 0;

    /* renamed from: c  reason: collision with root package name */
    private int f51587c;

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f51588a;

        /* renamed from: b  reason: collision with root package name */
        public final long f51589b;

        /* renamed from: c  reason: collision with root package name */
        public final int f51590c;

        public a(int i10, long j10, int i11) {
            this.f51588a = i10;
            this.f51589b = j10;
            this.f51590c = i11;
        }
    }

    private void a(C6679q qVar, I i10) {
        B b10 = new B(8);
        qVar.readFully(b10.e(), 0, 8);
        this.f51587c = b10.u() + 8;
        if (b10.q() != 1397048916) {
            i10.f38760a = 0;
            return;
        }
        i10.f38760a = qVar.getPosition() - ((long) (this.f51587c - 12));
        this.f51586b = 2;
    }

    private static int b(String str) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1711564334:
                if (str.equals("SlowMotion_Data")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1332107749:
                if (str.equals("Super_SlowMotion_Edit_Data")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1251387154:
                if (str.equals("Super_SlowMotion_Data")) {
                    c10 = 2;
                    break;
                }
                break;
            case -830665521:
                if (str.equals("Super_SlowMotion_Deflickering_On")) {
                    c10 = 3;
                    break;
                }
                break;
            case 1760745220:
                if (str.equals("Super_SlowMotion_BGM")) {
                    c10 = 4;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return 2192;
            case 1:
                return 2819;
            case 2:
                return 2816;
            case 3:
                return 2820;
            case 4:
                return 2817;
            default:
                throw q3.B.a("Invalid SEF name", (Throwable) null);
        }
    }

    private void d(C6679q qVar, I i10) {
        long length = qVar.getLength();
        int i11 = this.f51587c - 20;
        B b10 = new B(i11);
        qVar.readFully(b10.e(), 0, i11);
        for (int i12 = 0; i12 < i11 / 12; i12++) {
            b10.X(2);
            short w10 = b10.w();
            if (w10 == 2192 || w10 == 2816 || w10 == 2817 || w10 == 2819 || w10 == 2820) {
                this.f51585a.add(new a(w10, (length - ((long) this.f51587c)) - ((long) b10.u()), b10.u()));
            } else {
                b10.X(8);
            }
        }
        if (this.f51585a.isEmpty()) {
            i10.f38760a = 0;
            return;
        }
        this.f51586b = 3;
        i10.f38760a = this.f51585a.get(0).f51589b;
    }

    private void e(C6679q qVar, List<z.b> list) {
        long position = qVar.getPosition();
        int length = (int) ((qVar.getLength() - qVar.getPosition()) - ((long) this.f51587c));
        B b10 = new B(length);
        qVar.readFully(b10.e(), 0, length);
        for (int i10 = 0; i10 < this.f51585a.size(); i10++) {
            a aVar = this.f51585a.get(i10);
            b10.W((int) (aVar.f51589b - position));
            b10.X(4);
            int u10 = b10.u();
            int b11 = b(b10.E(u10));
            int i11 = aVar.f51590c - (u10 + 8);
            if (b11 == 2192) {
                list.add(f(b10, i11));
            } else if (!(b11 == 2816 || b11 == 2817 || b11 == 2819 || b11 == 2820)) {
                throw new IllegalStateException();
            }
        }
    }

    private static C7091b f(B b10, int i10) {
        ArrayList arrayList = new ArrayList();
        List<String> f10 = f51584e.f(b10.E(i10));
        int i11 = 0;
        while (i11 < f10.size()) {
            List<String> f11 = f51583d.f(f10.get(i11));
            if (f11.size() == 3) {
                try {
                    arrayList.add(new C7091b.C0794b(Long.parseLong(f11.get(0)), Long.parseLong(f11.get(1)), 1 << (Integer.parseInt(f11.get(2)) - 1)));
                    i11++;
                } catch (NumberFormatException e10) {
                    throw q3.B.a((String) null, e10);
                }
            } else {
                throw q3.B.a((String) null, (Throwable) null);
            }
        }
        return new C7091b(arrayList);
    }

    public int c(C6679q qVar, I i10, List<z.b> list) {
        int i11 = this.f51586b;
        long j10 = 0;
        if (i11 == 0) {
            long length = qVar.getLength();
            if (length != -1 && length >= 8) {
                j10 = length - 8;
            }
            i10.f38760a = j10;
            this.f51586b = 1;
        } else if (i11 == 1) {
            a(qVar, i10);
        } else if (i11 == 2) {
            d(qVar, i10);
        } else if (i11 == 3) {
            e(qVar, list);
            i10.f38760a = 0;
        } else {
            throw new IllegalStateException();
        }
        return 1;
    }

    public void g() {
        this.f51585a.clear();
        this.f51586b = 0;
    }
}
