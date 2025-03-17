package aJ;

import XI.C16829b;
import XI.C16830c;
import XI.C16831d;
import XI.i;
import XI.l;
import XI.n;
import XI.q;
import XI.s;
import com.oppwa.mobile.connect.checkout.dialog.CheckoutActivity;
import eJ.C17190a;
import eJ.C17191b;
import eJ.C17193d;
import eJ.C17194e;
import eJ.C17195f;
import eJ.C17196g;
import eJ.C17198i;
import eJ.C17199j;
import eJ.C17200k;
import eJ.C17206q;
import eJ.C17207r;
import eJ.C17208s;
import eJ.C17215z;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: aJ.a  reason: case insensitive filesystem */
public final class C17030a {

    /* renamed from: a  reason: collision with root package name */
    public static final C17198i.f<C16831d, c> f140987a;

    /* renamed from: b  reason: collision with root package name */
    public static final C17198i.f<i, c> f140988b;

    /* renamed from: c  reason: collision with root package name */
    public static final C17198i.f<i, Integer> f140989c;

    /* renamed from: d  reason: collision with root package name */
    public static final C17198i.f<n, d> f140990d;

    /* renamed from: e  reason: collision with root package name */
    public static final C17198i.f<n, Integer> f140991e;

    /* renamed from: f  reason: collision with root package name */
    public static final C17198i.f<q, List<C16829b>> f140992f;

    /* renamed from: g  reason: collision with root package name */
    public static final C17198i.f<q, Boolean> f140993g = C17198i.j(q.S(), Boolean.FALSE, (C17206q) null, (C17199j.b<?>) null, CheckoutActivity.RESULT_CANCELED, C17215z.b.BOOL, Boolean.class);

    /* renamed from: h  reason: collision with root package name */
    public static final C17198i.f<s, List<C16829b>> f140994h;

    /* renamed from: i  reason: collision with root package name */
    public static final C17198i.f<C16830c, Integer> f140995i;

    /* renamed from: j  reason: collision with root package name */
    public static final C17198i.f<C16830c, List<n>> f140996j;

    /* renamed from: k  reason: collision with root package name */
    public static final C17198i.f<C16830c, Integer> f140997k;

    /* renamed from: l  reason: collision with root package name */
    public static final C17198i.f<C16830c, Integer> f140998l;

    /* renamed from: m  reason: collision with root package name */
    public static final C17198i.f<l, Integer> f140999m;

    /* renamed from: n  reason: collision with root package name */
    public static final C17198i.f<l, List<n>> f141000n;

    /* renamed from: aJ.a$e */
    public static final class e extends C17198i implements C17207r {

        /* renamed from: h  reason: collision with root package name */
        private static final e f141040h;

        /* renamed from: i  reason: collision with root package name */
        public static C17208s<e> f141041i = new C3454a();
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final C17193d f141042b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public List<c> f141043c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public List<Integer> f141044d;

        /* renamed from: e  reason: collision with root package name */
        private int f141045e;

        /* renamed from: f  reason: collision with root package name */
        private byte f141046f;

        /* renamed from: g  reason: collision with root package name */
        private int f141047g;

        /* renamed from: aJ.a$e$a  reason: collision with other inner class name */
        static class C3454a extends C17191b<e> {
            C3454a() {
            }

            /* renamed from: m */
            public e c(C17194e eVar, C17196g gVar) {
                return new e(eVar, gVar);
            }
        }

        /* renamed from: aJ.a$e$b */
        public static final class b extends C17198i.b<e, b> implements C17207r {

            /* renamed from: b  reason: collision with root package name */
            private int f141048b;

            /* renamed from: c  reason: collision with root package name */
            private List<c> f141049c = Collections.emptyList();

            /* renamed from: d  reason: collision with root package name */
            private List<Integer> f141050d = Collections.emptyList();

            private b() {
                u();
            }

            /* access modifiers changed from: private */
            public static b o() {
                return new b();
            }

            private void p() {
                if ((this.f141048b & 2) != 2) {
                    this.f141050d = new ArrayList(this.f141050d);
                    this.f141048b |= 2;
                }
            }

            private void r() {
                if ((this.f141048b & 1) != 1) {
                    this.f141049c = new ArrayList(this.f141049c);
                    this.f141048b |= 1;
                }
            }

            private void u() {
            }

            /* renamed from: l */
            public e g() {
                e m10 = m();
                if (m10.isInitialized()) {
                    return m10;
                }
                throw C17190a.C3485a.c(m10);
            }

            public e m() {
                e eVar = new e((C17198i.b) this);
                if ((this.f141048b & 1) == 1) {
                    this.f141049c = Collections.unmodifiableList(this.f141049c);
                    this.f141048b &= -2;
                }
                List unused = eVar.f141043c = this.f141049c;
                if ((this.f141048b & 2) == 2) {
                    this.f141050d = Collections.unmodifiableList(this.f141050d);
                    this.f141048b &= -3;
                }
                List unused2 = eVar.f141044d = this.f141050d;
                return eVar;
            }

            /* renamed from: n */
            public b d() {
                return o().f(m());
            }

            /* renamed from: v */
            public b f(e eVar) {
                if (eVar == e.r()) {
                    return this;
                }
                if (!eVar.f141043c.isEmpty()) {
                    if (this.f141049c.isEmpty()) {
                        this.f141049c = eVar.f141043c;
                        this.f141048b &= -2;
                    } else {
                        r();
                        this.f141049c.addAll(eVar.f141043c);
                    }
                }
                if (!eVar.f141044d.isEmpty()) {
                    if (this.f141050d.isEmpty()) {
                        this.f141050d = eVar.f141044d;
                        this.f141048b &= -3;
                    } else {
                        p();
                        this.f141050d.addAll(eVar.f141044d);
                    }
                }
                j(e().i(eVar.f141042b));
                return this;
            }

            /* renamed from: w */
            public b o1(C17194e eVar, C17196g gVar) {
                e eVar2;
                e eVar3 = null;
                try {
                    e c10 = e.f141041i.c(eVar, gVar);
                    if (c10 != null) {
                        f(c10);
                    }
                    return this;
                } catch (C17200k e10) {
                    eVar2 = (e) e10.a();
                    throw e10;
                } catch (Throwable th2) {
                    th = th2;
                    eVar3 = eVar2;
                }
                if (eVar3 != null) {
                    f(eVar3);
                }
                throw th;
            }
        }

        static {
            e eVar = new e(true);
            f141040h = eVar;
            eVar.u();
        }

        public static e r() {
            return f141040h;
        }

        private void u() {
            this.f141043c = Collections.emptyList();
            this.f141044d = Collections.emptyList();
        }

        public static b v() {
            return b.o();
        }

        public static b w(e eVar) {
            return v().f(eVar);
        }

        public static e y(InputStream inputStream, C17196g gVar) {
            return f141041i.d(inputStream, gVar);
        }

        public void a(C17195f fVar) {
            getSerializedSize();
            for (int i10 = 0; i10 < this.f141043c.size(); i10++) {
                fVar.d0(1, this.f141043c.get(i10));
            }
            if (s().size() > 0) {
                fVar.o0(42);
                fVar.o0(this.f141045e);
            }
            for (int i11 = 0; i11 < this.f141044d.size(); i11++) {
                fVar.b0(this.f141044d.get(i11).intValue());
            }
            fVar.i0(this.f141042b);
        }

        public C17208s<e> getParserForType() {
            return f141041i;
        }

        public int getSerializedSize() {
            int i10 = this.f141047g;
            if (i10 != -1) {
                return i10;
            }
            int i11 = 0;
            for (int i12 = 0; i12 < this.f141043c.size(); i12++) {
                i11 += C17195f.s(1, this.f141043c.get(i12));
            }
            int i13 = 0;
            for (int i14 = 0; i14 < this.f141044d.size(); i14++) {
                i13 += C17195f.p(this.f141044d.get(i14).intValue());
            }
            int i15 = i11 + i13;
            if (!s().isEmpty()) {
                i15 = i15 + 1 + C17195f.p(i13);
            }
            this.f141045e = i13;
            int size = i15 + this.f141042b.size();
            this.f141047g = size;
            return size;
        }

        public final boolean isInitialized() {
            byte b10 = this.f141046f;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f141046f = 1;
            return true;
        }

        public List<Integer> s() {
            return this.f141044d;
        }

        public List<c> t() {
            return this.f141043c;
        }

        /* renamed from: x */
        public b newBuilderForType() {
            return v();
        }

        /* renamed from: z */
        public b toBuilder() {
            return w(this);
        }

        /* renamed from: aJ.a$e$c */
        public static final class c extends C17198i implements C17207r {

            /* renamed from: n  reason: collision with root package name */
            private static final c f141051n;

            /* renamed from: o  reason: collision with root package name */
            public static C17208s<c> f141052o = new C3455a();
            /* access modifiers changed from: private */

            /* renamed from: b  reason: collision with root package name */
            public final C17193d f141053b;
            /* access modifiers changed from: private */

            /* renamed from: c  reason: collision with root package name */
            public int f141054c;
            /* access modifiers changed from: private */

            /* renamed from: d  reason: collision with root package name */
            public int f141055d;
            /* access modifiers changed from: private */

            /* renamed from: e  reason: collision with root package name */
            public int f141056e;
            /* access modifiers changed from: private */

            /* renamed from: f  reason: collision with root package name */
            public Object f141057f;
            /* access modifiers changed from: private */

            /* renamed from: g  reason: collision with root package name */
            public C3456c f141058g;
            /* access modifiers changed from: private */

            /* renamed from: h  reason: collision with root package name */
            public List<Integer> f141059h;

            /* renamed from: i  reason: collision with root package name */
            private int f141060i;
            /* access modifiers changed from: private */

            /* renamed from: j  reason: collision with root package name */
            public List<Integer> f141061j;

            /* renamed from: k  reason: collision with root package name */
            private int f141062k;

            /* renamed from: l  reason: collision with root package name */
            private byte f141063l;

            /* renamed from: m  reason: collision with root package name */
            private int f141064m;

            /* renamed from: aJ.a$e$c$a  reason: collision with other inner class name */
            static class C3455a extends C17191b<c> {
                C3455a() {
                }

                /* renamed from: m */
                public c c(C17194e eVar, C17196g gVar) {
                    return new c(eVar, gVar);
                }
            }

            /* renamed from: aJ.a$e$c$b */
            public static final class b extends C17198i.b<c, b> implements C17207r {

                /* renamed from: b  reason: collision with root package name */
                private int f141065b;

                /* renamed from: c  reason: collision with root package name */
                private int f141066c = 1;

                /* renamed from: d  reason: collision with root package name */
                private int f141067d;

                /* renamed from: e  reason: collision with root package name */
                private Object f141068e = "";

                /* renamed from: f  reason: collision with root package name */
                private C3456c f141069f = C3456c.NONE;

                /* renamed from: g  reason: collision with root package name */
                private List<Integer> f141070g = Collections.emptyList();

                /* renamed from: h  reason: collision with root package name */
                private List<Integer> f141071h = Collections.emptyList();

                private b() {
                    u();
                }

                /* access modifiers changed from: private */
                public static b o() {
                    return new b();
                }

                private void p() {
                    if ((this.f141065b & 32) != 32) {
                        this.f141071h = new ArrayList(this.f141071h);
                        this.f141065b |= 32;
                    }
                }

                private void r() {
                    if ((this.f141065b & 16) != 16) {
                        this.f141070g = new ArrayList(this.f141070g);
                        this.f141065b |= 16;
                    }
                }

                private void u() {
                }

                public b A(int i10) {
                    this.f141065b |= 1;
                    this.f141066c = i10;
                    return this;
                }

                /* renamed from: l */
                public c g() {
                    c m10 = m();
                    if (m10.isInitialized()) {
                        return m10;
                    }
                    throw C17190a.C3485a.c(m10);
                }

                public c m() {
                    c cVar = new c((C17198i.b) this);
                    int i10 = this.f141065b;
                    int i11 = 1;
                    if ((i10 & 1) != 1) {
                        i11 = 0;
                    }
                    int unused = cVar.f141055d = this.f141066c;
                    if ((i10 & 2) == 2) {
                        i11 |= 2;
                    }
                    int unused2 = cVar.f141056e = this.f141067d;
                    if ((i10 & 4) == 4) {
                        i11 |= 4;
                    }
                    Object unused3 = cVar.f141057f = this.f141068e;
                    if ((i10 & 8) == 8) {
                        i11 |= 8;
                    }
                    C3456c unused4 = cVar.f141058g = this.f141069f;
                    if ((this.f141065b & 16) == 16) {
                        this.f141070g = Collections.unmodifiableList(this.f141070g);
                        this.f141065b &= -17;
                    }
                    List unused5 = cVar.f141059h = this.f141070g;
                    if ((this.f141065b & 32) == 32) {
                        this.f141071h = Collections.unmodifiableList(this.f141071h);
                        this.f141065b &= -33;
                    }
                    List unused6 = cVar.f141061j = this.f141071h;
                    int unused7 = cVar.f141054c = i11;
                    return cVar;
                }

                /* renamed from: n */
                public b d() {
                    return o().f(m());
                }

                /* renamed from: v */
                public b f(c cVar) {
                    if (cVar == c.x()) {
                        return this;
                    }
                    if (cVar.J()) {
                        A(cVar.A());
                    }
                    if (cVar.I()) {
                        z(cVar.z());
                    }
                    if (cVar.K()) {
                        this.f141065b |= 4;
                        this.f141068e = cVar.f141057f;
                    }
                    if (cVar.H()) {
                        y(cVar.y());
                    }
                    if (!cVar.f141059h.isEmpty()) {
                        if (this.f141070g.isEmpty()) {
                            this.f141070g = cVar.f141059h;
                            this.f141065b &= -17;
                        } else {
                            r();
                            this.f141070g.addAll(cVar.f141059h);
                        }
                    }
                    if (!cVar.f141061j.isEmpty()) {
                        if (this.f141071h.isEmpty()) {
                            this.f141071h = cVar.f141061j;
                            this.f141065b &= -33;
                        } else {
                            p();
                            this.f141071h.addAll(cVar.f141061j);
                        }
                    }
                    j(e().i(cVar.f141053b));
                    return this;
                }

                /* renamed from: w */
                public b o1(C17194e eVar, C17196g gVar) {
                    c cVar;
                    c cVar2 = null;
                    try {
                        c c10 = c.f141052o.c(eVar, gVar);
                        if (c10 != null) {
                            f(c10);
                        }
                        return this;
                    } catch (C17200k e10) {
                        cVar = (c) e10.a();
                        throw e10;
                    } catch (Throwable th2) {
                        th = th2;
                        cVar2 = cVar;
                    }
                    if (cVar2 != null) {
                        f(cVar2);
                    }
                    throw th;
                }

                public b y(C3456c cVar) {
                    cVar.getClass();
                    this.f141065b |= 8;
                    this.f141069f = cVar;
                    return this;
                }

                public b z(int i10) {
                    this.f141065b |= 2;
                    this.f141067d = i10;
                    return this;
                }
            }

            /* renamed from: aJ.a$e$c$c  reason: collision with other inner class name */
            public enum C3456c implements C17199j.a {
                NONE(0, 0),
                INTERNAL_TO_CLASS_ID(1, 1),
                DESC_TO_CLASS_ID(2, 2);
                
                private static C17199j.b<C3456c> internalValueMap;
                private final int value;

                /* renamed from: aJ.a$e$c$c$a  reason: collision with other inner class name */
                static class C3457a implements C17199j.b<C3456c> {
                    C3457a() {
                    }

                    /* renamed from: b */
                    public C3456c a(int i10) {
                        return C3456c.a(i10);
                    }
                }

                static {
                    internalValueMap = new C3457a();
                }

                private C3456c(int i10, int i11) {
                    this.value = i11;
                }

                public static C3456c a(int i10) {
                    if (i10 == 0) {
                        return NONE;
                    }
                    if (i10 == 1) {
                        return INTERNAL_TO_CLASS_ID;
                    }
                    if (i10 != 2) {
                        return null;
                    }
                    return DESC_TO_CLASS_ID;
                }

                public final int d() {
                    return this.value;
                }
            }

            static {
                c cVar = new c(true);
                f141051n = cVar;
                cVar.L();
            }

            private void L() {
                this.f141055d = 1;
                this.f141056e = 0;
                this.f141057f = "";
                this.f141058g = C3456c.NONE;
                this.f141059h = Collections.emptyList();
                this.f141061j = Collections.emptyList();
            }

            public static b M() {
                return b.o();
            }

            public static b N(c cVar) {
                return M().f(cVar);
            }

            public static c x() {
                return f141051n;
            }

            public int A() {
                return this.f141055d;
            }

            public int B() {
                return this.f141061j.size();
            }

            public List<Integer> C() {
                return this.f141061j;
            }

            public String D() {
                Object obj = this.f141057f;
                if (obj instanceof String) {
                    return (String) obj;
                }
                C17193d dVar = (C17193d) obj;
                String H10 = dVar.H();
                if (dVar.x()) {
                    this.f141057f = H10;
                }
                return H10;
            }

            public C17193d E() {
                Object obj = this.f141057f;
                if (!(obj instanceof String)) {
                    return (C17193d) obj;
                }
                C17193d p10 = C17193d.p((String) obj);
                this.f141057f = p10;
                return p10;
            }

            public int F() {
                return this.f141059h.size();
            }

            public List<Integer> G() {
                return this.f141059h;
            }

            public boolean H() {
                return (this.f141054c & 8) == 8;
            }

            public boolean I() {
                return (this.f141054c & 2) == 2;
            }

            public boolean J() {
                return (this.f141054c & 1) == 1;
            }

            public boolean K() {
                return (this.f141054c & 4) == 4;
            }

            /* renamed from: O */
            public b newBuilderForType() {
                return M();
            }

            /* renamed from: P */
            public b toBuilder() {
                return N(this);
            }

            public void a(C17195f fVar) {
                getSerializedSize();
                if ((this.f141054c & 1) == 1) {
                    fVar.a0(1, this.f141055d);
                }
                if ((this.f141054c & 2) == 2) {
                    fVar.a0(2, this.f141056e);
                }
                if ((this.f141054c & 8) == 8) {
                    fVar.S(3, this.f141058g.d());
                }
                if (G().size() > 0) {
                    fVar.o0(34);
                    fVar.o0(this.f141060i);
                }
                for (int i10 = 0; i10 < this.f141059h.size(); i10++) {
                    fVar.b0(this.f141059h.get(i10).intValue());
                }
                if (C().size() > 0) {
                    fVar.o0(42);
                    fVar.o0(this.f141062k);
                }
                for (int i11 = 0; i11 < this.f141061j.size(); i11++) {
                    fVar.b0(this.f141061j.get(i11).intValue());
                }
                if ((this.f141054c & 4) == 4) {
                    fVar.O(6, E());
                }
                fVar.i0(this.f141053b);
            }

            public C17208s<c> getParserForType() {
                return f141052o;
            }

            public int getSerializedSize() {
                int i10 = this.f141064m;
                if (i10 != -1) {
                    return i10;
                }
                int o10 = (this.f141054c & 1) == 1 ? C17195f.o(1, this.f141055d) : 0;
                if ((this.f141054c & 2) == 2) {
                    o10 += C17195f.o(2, this.f141056e);
                }
                if ((this.f141054c & 8) == 8) {
                    o10 += C17195f.h(3, this.f141058g.d());
                }
                int i11 = 0;
                for (int i12 = 0; i12 < this.f141059h.size(); i12++) {
                    i11 += C17195f.p(this.f141059h.get(i12).intValue());
                }
                int i13 = o10 + i11;
                if (!G().isEmpty()) {
                    i13 = i13 + 1 + C17195f.p(i11);
                }
                this.f141060i = i11;
                int i14 = 0;
                for (int i15 = 0; i15 < this.f141061j.size(); i15++) {
                    i14 += C17195f.p(this.f141061j.get(i15).intValue());
                }
                int i16 = i13 + i14;
                if (!C().isEmpty()) {
                    i16 = i16 + 1 + C17195f.p(i14);
                }
                this.f141062k = i14;
                if ((this.f141054c & 4) == 4) {
                    i16 += C17195f.d(6, E());
                }
                int size = i16 + this.f141053b.size();
                this.f141064m = size;
                return size;
            }

            public final boolean isInitialized() {
                byte b10 = this.f141063l;
                if (b10 == 1) {
                    return true;
                }
                if (b10 == 0) {
                    return false;
                }
                this.f141063l = 1;
                return true;
            }

            public C3456c y() {
                return this.f141058g;
            }

            public int z() {
                return this.f141056e;
            }

            private c(C17198i.b bVar) {
                super(bVar);
                this.f141060i = -1;
                this.f141062k = -1;
                this.f141063l = -1;
                this.f141064m = -1;
                this.f141053b = bVar.e();
            }

            private c(boolean z10) {
                this.f141060i = -1;
                this.f141062k = -1;
                this.f141063l = -1;
                this.f141064m = -1;
                this.f141053b = C17193d.f143014a;
            }

            private c(C17194e eVar, C17196g gVar) {
                this.f141060i = -1;
                this.f141062k = -1;
                this.f141063l = -1;
                this.f141064m = -1;
                L();
                C17193d.b B10 = C17193d.B();
                C17195f J10 = C17195f.J(B10, 1);
                boolean z10 = false;
                boolean z11 = false;
                while (!z10) {
                    try {
                        int K10 = eVar.K();
                        if (K10 != 0) {
                            if (K10 == 8) {
                                this.f141054c |= 1;
                                this.f141055d = eVar.s();
                            } else if (K10 == 16) {
                                this.f141054c |= 2;
                                this.f141056e = eVar.s();
                            } else if (K10 == 24) {
                                int n10 = eVar.n();
                                C3456c a10 = C3456c.a(n10);
                                if (a10 == null) {
                                    J10.o0(K10);
                                    J10.o0(n10);
                                } else {
                                    this.f141054c |= 8;
                                    this.f141058g = a10;
                                }
                            } else if (K10 == 32) {
                                if (!(z11 & true)) {
                                    this.f141059h = new ArrayList();
                                    z11 |= true;
                                }
                                this.f141059h.add(Integer.valueOf(eVar.s()));
                            } else if (K10 == 34) {
                                int j10 = eVar.j(eVar.A());
                                if (!(z11 & true) && eVar.e() > 0) {
                                    this.f141059h = new ArrayList();
                                    z11 |= true;
                                }
                                while (eVar.e() > 0) {
                                    this.f141059h.add(Integer.valueOf(eVar.s()));
                                }
                                eVar.i(j10);
                            } else if (K10 == 40) {
                                if (!(z11 & true)) {
                                    this.f141061j = new ArrayList();
                                    z11 |= true;
                                }
                                this.f141061j.add(Integer.valueOf(eVar.s()));
                            } else if (K10 == 42) {
                                int j11 = eVar.j(eVar.A());
                                if (!(z11 & true) && eVar.e() > 0) {
                                    this.f141061j = new ArrayList();
                                    z11 |= true;
                                }
                                while (eVar.e() > 0) {
                                    this.f141061j.add(Integer.valueOf(eVar.s()));
                                }
                                eVar.i(j11);
                            } else if (K10 == 50) {
                                C17193d l10 = eVar.l();
                                this.f141054c |= 4;
                                this.f141057f = l10;
                            } else if (k(eVar, J10, gVar, K10)) {
                            }
                        }
                        z10 = true;
                    } catch (C17200k e10) {
                        throw e10.i(this);
                    } catch (IOException e11) {
                        throw new C17200k(e11.getMessage()).i(this);
                    } catch (Throwable th2) {
                        if (z11 & true) {
                            this.f141059h = Collections.unmodifiableList(this.f141059h);
                        }
                        if (z11 & true) {
                            this.f141061j = Collections.unmodifiableList(this.f141061j);
                        }
                        try {
                            J10.I();
                        } catch (IOException unused) {
                        } catch (Throwable th3) {
                            this.f141053b = B10.g();
                            throw th3;
                        }
                        this.f141053b = B10.g();
                        h();
                        throw th2;
                    }
                }
                if (z11 & true) {
                    this.f141059h = Collections.unmodifiableList(this.f141059h);
                }
                if (z11 & true) {
                    this.f141061j = Collections.unmodifiableList(this.f141061j);
                }
                try {
                    J10.I();
                } catch (IOException unused2) {
                } catch (Throwable th4) {
                    this.f141053b = B10.g();
                    throw th4;
                }
                this.f141053b = B10.g();
                h();
            }
        }

        private e(C17198i.b bVar) {
            super(bVar);
            this.f141045e = -1;
            this.f141046f = -1;
            this.f141047g = -1;
            this.f141042b = bVar.e();
        }

        private e(boolean z10) {
            this.f141045e = -1;
            this.f141046f = -1;
            this.f141047g = -1;
            this.f141042b = C17193d.f143014a;
        }

        private e(C17194e eVar, C17196g gVar) {
            this.f141045e = -1;
            this.f141046f = -1;
            this.f141047g = -1;
            u();
            C17193d.b B10 = C17193d.B();
            C17195f J10 = C17195f.J(B10, 1);
            boolean z10 = false;
            boolean z11 = false;
            while (!z10) {
                try {
                    int K10 = eVar.K();
                    if (K10 != 0) {
                        if (K10 == 10) {
                            if (!z11 || !true) {
                                this.f141043c = new ArrayList();
                                z11 |= true;
                            }
                            this.f141043c.add(eVar.u(c.f141052o, gVar));
                        } else if (K10 == 40) {
                            if (!(z11 & true)) {
                                this.f141044d = new ArrayList();
                                z11 |= true;
                            }
                            this.f141044d.add(Integer.valueOf(eVar.s()));
                        } else if (K10 == 42) {
                            int j10 = eVar.j(eVar.A());
                            if (!(z11 & true) && eVar.e() > 0) {
                                this.f141044d = new ArrayList();
                                z11 |= true;
                            }
                            while (eVar.e() > 0) {
                                this.f141044d.add(Integer.valueOf(eVar.s()));
                            }
                            eVar.i(j10);
                        } else if (k(eVar, J10, gVar, K10)) {
                        }
                    }
                    z10 = true;
                } catch (C17200k e10) {
                    throw e10.i(this);
                } catch (IOException e11) {
                    throw new C17200k(e11.getMessage()).i(this);
                } catch (Throwable th2) {
                    if (z11 && true) {
                        this.f141043c = Collections.unmodifiableList(this.f141043c);
                    }
                    if (z11 & true) {
                        this.f141044d = Collections.unmodifiableList(this.f141044d);
                    }
                    try {
                        J10.I();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f141042b = B10.g();
                        throw th3;
                    }
                    this.f141042b = B10.g();
                    h();
                    throw th2;
                }
            }
            if (z11 && true) {
                this.f141043c = Collections.unmodifiableList(this.f141043c);
            }
            if (z11 & true) {
                this.f141044d = Collections.unmodifiableList(this.f141044d);
            }
            try {
                J10.I();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f141042b = B10.g();
                throw th4;
            }
            this.f141042b = B10.g();
            h();
        }
    }

    static {
        C16831d C10 = C16831d.C();
        c q10 = c.q();
        c q11 = c.q();
        C17215z.b bVar = C17215z.b.MESSAGE;
        f140987a = C17198i.j(C10, q10, q11, (C17199j.b<?>) null, 100, bVar, c.class);
        C17215z.b bVar2 = bVar;
        f140988b = C17198i.j(i.V(), c.q(), c.q(), (C17199j.b<?>) null, 100, bVar2, c.class);
        i V10 = i.V();
        C17215z.b bVar3 = C17215z.b.INT32;
        f140989c = C17198i.j(V10, null, (C17206q) null, (C17199j.b<?>) null, CheckoutActivity.RESULT_CANCELED, bVar3, Integer.class);
        f140990d = C17198i.j(n.T(), d.t(), d.t(), (C17199j.b<?>) null, 100, bVar2, d.class);
        f140991e = C17198i.j(n.T(), null, (C17206q) null, (C17199j.b<?>) null, CheckoutActivity.RESULT_CANCELED, bVar3, Integer.class);
        f140992f = C17198i.i(q.S(), C16829b.u(), (C17199j.b<?>) null, 100, bVar, false, C16829b.class);
        f140994h = C17198i.i(s.F(), C16829b.u(), (C17199j.b<?>) null, 100, bVar, false, C16829b.class);
        f140995i = C17198i.j(C16830c.t0(), null, (C17206q) null, (C17199j.b<?>) null, CheckoutActivity.RESULT_CANCELED, bVar3, Integer.class);
        f140996j = C17198i.i(C16830c.t0(), n.T(), (C17199j.b<?>) null, CheckoutActivity.RESULT_ERROR, bVar, false, n.class);
        C17215z.b bVar4 = bVar3;
        f140997k = C17198i.j(C16830c.t0(), null, (C17206q) null, (C17199j.b<?>) null, 103, bVar4, Integer.class);
        f140998l = C17198i.j(C16830c.t0(), null, (C17206q) null, (C17199j.b<?>) null, 104, bVar4, Integer.class);
        f140999m = C17198i.j(l.F(), null, (C17206q) null, (C17199j.b<?>) null, CheckoutActivity.RESULT_CANCELED, bVar4, Integer.class);
        f141000n = C17198i.i(l.F(), n.T(), (C17199j.b<?>) null, CheckoutActivity.RESULT_ERROR, bVar, false, n.class);
    }

    public static void a(C17196g gVar) {
        gVar.a(f140987a);
        gVar.a(f140988b);
        gVar.a(f140989c);
        gVar.a(f140990d);
        gVar.a(f140991e);
        gVar.a(f140992f);
        gVar.a(f140993g);
        gVar.a(f140994h);
        gVar.a(f140995i);
        gVar.a(f140996j);
        gVar.a(f140997k);
        gVar.a(f140998l);
        gVar.a(f140999m);
        gVar.a(f141000n);
    }

    /* renamed from: aJ.a$b */
    public static final class b extends C17198i implements C17207r {

        /* renamed from: h  reason: collision with root package name */
        private static final b f141001h;

        /* renamed from: i  reason: collision with root package name */
        public static C17208s<b> f141002i = new C3450a();
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final C17193d f141003b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public int f141004c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public int f141005d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public int f141006e;

        /* renamed from: f  reason: collision with root package name */
        private byte f141007f;

        /* renamed from: g  reason: collision with root package name */
        private int f141008g;

        /* renamed from: aJ.a$b$a  reason: collision with other inner class name */
        static class C3450a extends C17191b<b> {
            C3450a() {
            }

            /* renamed from: m */
            public b c(C17194e eVar, C17196g gVar) {
                return new b(eVar, gVar);
            }
        }

        /* renamed from: aJ.a$b$b  reason: collision with other inner class name */
        public static final class C3451b extends C17198i.b<b, C3451b> implements C17207r {

            /* renamed from: b  reason: collision with root package name */
            private int f141009b;

            /* renamed from: c  reason: collision with root package name */
            private int f141010c;

            /* renamed from: d  reason: collision with root package name */
            private int f141011d;

            private C3451b() {
                p();
            }

            /* access modifiers changed from: private */
            public static C3451b o() {
                return new C3451b();
            }

            private void p() {
            }

            /* renamed from: l */
            public b g() {
                b m10 = m();
                if (m10.isInitialized()) {
                    return m10;
                }
                throw C17190a.C3485a.c(m10);
            }

            public b m() {
                b bVar = new b((C17198i.b) this);
                int i10 = this.f141009b;
                int i11 = 1;
                if ((i10 & 1) != 1) {
                    i11 = 0;
                }
                int unused = bVar.f141005d = this.f141010c;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                int unused2 = bVar.f141006e = this.f141011d;
                int unused3 = bVar.f141004c = i11;
                return bVar;
            }

            /* renamed from: n */
            public C3451b d() {
                return o().f(m());
            }

            /* renamed from: r */
            public C3451b f(b bVar) {
                if (bVar == b.q()) {
                    return this;
                }
                if (bVar.u()) {
                    w(bVar.s());
                }
                if (bVar.t()) {
                    v(bVar.r());
                }
                j(e().i(bVar.f141003b));
                return this;
            }

            /* renamed from: u */
            public C3451b o1(C17194e eVar, C17196g gVar) {
                b bVar;
                b bVar2 = null;
                try {
                    b c10 = b.f141002i.c(eVar, gVar);
                    if (c10 != null) {
                        f(c10);
                    }
                    return this;
                } catch (C17200k e10) {
                    bVar = (b) e10.a();
                    throw e10;
                } catch (Throwable th2) {
                    th = th2;
                    bVar2 = bVar;
                }
                if (bVar2 != null) {
                    f(bVar2);
                }
                throw th;
            }

            public C3451b v(int i10) {
                this.f141009b |= 2;
                this.f141011d = i10;
                return this;
            }

            public C3451b w(int i10) {
                this.f141009b |= 1;
                this.f141010c = i10;
                return this;
            }
        }

        static {
            b bVar = new b(true);
            f141001h = bVar;
            bVar.v();
        }

        public static b q() {
            return f141001h;
        }

        private void v() {
            this.f141005d = 0;
            this.f141006e = 0;
        }

        public static C3451b w() {
            return C3451b.o();
        }

        public static C3451b x(b bVar) {
            return w().f(bVar);
        }

        public void a(C17195f fVar) {
            getSerializedSize();
            if ((this.f141004c & 1) == 1) {
                fVar.a0(1, this.f141005d);
            }
            if ((this.f141004c & 2) == 2) {
                fVar.a0(2, this.f141006e);
            }
            fVar.i0(this.f141003b);
        }

        public C17208s<b> getParserForType() {
            return f141002i;
        }

        public int getSerializedSize() {
            int i10 = this.f141008g;
            if (i10 != -1) {
                return i10;
            }
            int o10 = (this.f141004c & 1) == 1 ? C17195f.o(1, this.f141005d) : 0;
            if ((this.f141004c & 2) == 2) {
                o10 += C17195f.o(2, this.f141006e);
            }
            int size = o10 + this.f141003b.size();
            this.f141008g = size;
            return size;
        }

        public final boolean isInitialized() {
            byte b10 = this.f141007f;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f141007f = 1;
            return true;
        }

        public int r() {
            return this.f141006e;
        }

        public int s() {
            return this.f141005d;
        }

        public boolean t() {
            return (this.f141004c & 2) == 2;
        }

        public boolean u() {
            return (this.f141004c & 1) == 1;
        }

        /* renamed from: y */
        public C3451b newBuilderForType() {
            return w();
        }

        /* renamed from: z */
        public C3451b toBuilder() {
            return x(this);
        }

        private b(C17198i.b bVar) {
            super(bVar);
            this.f141007f = -1;
            this.f141008g = -1;
            this.f141003b = bVar.e();
        }

        private b(boolean z10) {
            this.f141007f = -1;
            this.f141008g = -1;
            this.f141003b = C17193d.f143014a;
        }

        private b(C17194e eVar, C17196g gVar) {
            this.f141007f = -1;
            this.f141008g = -1;
            v();
            C17193d.b B10 = C17193d.B();
            C17195f J10 = C17195f.J(B10, 1);
            boolean z10 = false;
            while (!z10) {
                try {
                    int K10 = eVar.K();
                    if (K10 != 0) {
                        if (K10 == 8) {
                            this.f141004c |= 1;
                            this.f141005d = eVar.s();
                        } else if (K10 == 16) {
                            this.f141004c |= 2;
                            this.f141006e = eVar.s();
                        } else if (k(eVar, J10, gVar, K10)) {
                        }
                    }
                    z10 = true;
                } catch (C17200k e10) {
                    throw e10.i(this);
                } catch (IOException e11) {
                    throw new C17200k(e11.getMessage()).i(this);
                } catch (Throwable th2) {
                    try {
                        J10.I();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f141003b = B10.g();
                        throw th3;
                    }
                    this.f141003b = B10.g();
                    h();
                    throw th2;
                }
            }
            try {
                J10.I();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f141003b = B10.g();
                throw th4;
            }
            this.f141003b = B10.g();
            h();
        }
    }

    /* renamed from: aJ.a$c */
    public static final class c extends C17198i implements C17207r {

        /* renamed from: h  reason: collision with root package name */
        private static final c f141012h;

        /* renamed from: i  reason: collision with root package name */
        public static C17208s<c> f141013i = new C3452a();
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final C17193d f141014b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public int f141015c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public int f141016d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public int f141017e;

        /* renamed from: f  reason: collision with root package name */
        private byte f141018f;

        /* renamed from: g  reason: collision with root package name */
        private int f141019g;

        /* renamed from: aJ.a$c$a  reason: collision with other inner class name */
        static class C3452a extends C17191b<c> {
            C3452a() {
            }

            /* renamed from: m */
            public c c(C17194e eVar, C17196g gVar) {
                return new c(eVar, gVar);
            }
        }

        /* renamed from: aJ.a$c$b */
        public static final class b extends C17198i.b<c, b> implements C17207r {

            /* renamed from: b  reason: collision with root package name */
            private int f141020b;

            /* renamed from: c  reason: collision with root package name */
            private int f141021c;

            /* renamed from: d  reason: collision with root package name */
            private int f141022d;

            private b() {
                p();
            }

            /* access modifiers changed from: private */
            public static b o() {
                return new b();
            }

            private void p() {
            }

            /* renamed from: l */
            public c g() {
                c m10 = m();
                if (m10.isInitialized()) {
                    return m10;
                }
                throw C17190a.C3485a.c(m10);
            }

            public c m() {
                c cVar = new c((C17198i.b) this);
                int i10 = this.f141020b;
                int i11 = 1;
                if ((i10 & 1) != 1) {
                    i11 = 0;
                }
                int unused = cVar.f141016d = this.f141021c;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                int unused2 = cVar.f141017e = this.f141022d;
                int unused3 = cVar.f141015c = i11;
                return cVar;
            }

            /* renamed from: n */
            public b d() {
                return o().f(m());
            }

            /* renamed from: r */
            public b f(c cVar) {
                if (cVar == c.q()) {
                    return this;
                }
                if (cVar.u()) {
                    w(cVar.s());
                }
                if (cVar.t()) {
                    v(cVar.r());
                }
                j(e().i(cVar.f141014b));
                return this;
            }

            /* renamed from: u */
            public b o1(C17194e eVar, C17196g gVar) {
                c cVar;
                c cVar2 = null;
                try {
                    c c10 = c.f141013i.c(eVar, gVar);
                    if (c10 != null) {
                        f(c10);
                    }
                    return this;
                } catch (C17200k e10) {
                    cVar = (c) e10.a();
                    throw e10;
                } catch (Throwable th2) {
                    th = th2;
                    cVar2 = cVar;
                }
                if (cVar2 != null) {
                    f(cVar2);
                }
                throw th;
            }

            public b v(int i10) {
                this.f141020b |= 2;
                this.f141022d = i10;
                return this;
            }

            public b w(int i10) {
                this.f141020b |= 1;
                this.f141021c = i10;
                return this;
            }
        }

        static {
            c cVar = new c(true);
            f141012h = cVar;
            cVar.v();
        }

        public static c q() {
            return f141012h;
        }

        private void v() {
            this.f141016d = 0;
            this.f141017e = 0;
        }

        public static b w() {
            return b.o();
        }

        public static b x(c cVar) {
            return w().f(cVar);
        }

        public void a(C17195f fVar) {
            getSerializedSize();
            if ((this.f141015c & 1) == 1) {
                fVar.a0(1, this.f141016d);
            }
            if ((this.f141015c & 2) == 2) {
                fVar.a0(2, this.f141017e);
            }
            fVar.i0(this.f141014b);
        }

        public C17208s<c> getParserForType() {
            return f141013i;
        }

        public int getSerializedSize() {
            int i10 = this.f141019g;
            if (i10 != -1) {
                return i10;
            }
            int o10 = (this.f141015c & 1) == 1 ? C17195f.o(1, this.f141016d) : 0;
            if ((this.f141015c & 2) == 2) {
                o10 += C17195f.o(2, this.f141017e);
            }
            int size = o10 + this.f141014b.size();
            this.f141019g = size;
            return size;
        }

        public final boolean isInitialized() {
            byte b10 = this.f141018f;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f141018f = 1;
            return true;
        }

        public int r() {
            return this.f141017e;
        }

        public int s() {
            return this.f141016d;
        }

        public boolean t() {
            return (this.f141015c & 2) == 2;
        }

        public boolean u() {
            return (this.f141015c & 1) == 1;
        }

        /* renamed from: y */
        public b newBuilderForType() {
            return w();
        }

        /* renamed from: z */
        public b toBuilder() {
            return x(this);
        }

        private c(C17198i.b bVar) {
            super(bVar);
            this.f141018f = -1;
            this.f141019g = -1;
            this.f141014b = bVar.e();
        }

        private c(boolean z10) {
            this.f141018f = -1;
            this.f141019g = -1;
            this.f141014b = C17193d.f143014a;
        }

        private c(C17194e eVar, C17196g gVar) {
            this.f141018f = -1;
            this.f141019g = -1;
            v();
            C17193d.b B10 = C17193d.B();
            C17195f J10 = C17195f.J(B10, 1);
            boolean z10 = false;
            while (!z10) {
                try {
                    int K10 = eVar.K();
                    if (K10 != 0) {
                        if (K10 == 8) {
                            this.f141015c |= 1;
                            this.f141016d = eVar.s();
                        } else if (K10 == 16) {
                            this.f141015c |= 2;
                            this.f141017e = eVar.s();
                        } else if (k(eVar, J10, gVar, K10)) {
                        }
                    }
                    z10 = true;
                } catch (C17200k e10) {
                    throw e10.i(this);
                } catch (IOException e11) {
                    throw new C17200k(e11.getMessage()).i(this);
                } catch (Throwable th2) {
                    try {
                        J10.I();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f141014b = B10.g();
                        throw th3;
                    }
                    this.f141014b = B10.g();
                    h();
                    throw th2;
                }
            }
            try {
                J10.I();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f141014b = B10.g();
                throw th4;
            }
            this.f141014b = B10.g();
            h();
        }
    }

    /* renamed from: aJ.a$d */
    public static final class d extends C17198i implements C17207r {

        /* renamed from: k  reason: collision with root package name */
        private static final d f141023k;

        /* renamed from: l  reason: collision with root package name */
        public static C17208s<d> f141024l = new C3453a();
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final C17193d f141025b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public int f141026c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public b f141027d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public c f141028e;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public c f141029f;
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public c f141030g;
        /* access modifiers changed from: private */

        /* renamed from: h  reason: collision with root package name */
        public c f141031h;

        /* renamed from: i  reason: collision with root package name */
        private byte f141032i;

        /* renamed from: j  reason: collision with root package name */
        private int f141033j;

        /* renamed from: aJ.a$d$a  reason: collision with other inner class name */
        static class C3453a extends C17191b<d> {
            C3453a() {
            }

            /* renamed from: m */
            public d c(C17194e eVar, C17196g gVar) {
                return new d(eVar, gVar);
            }
        }

        /* renamed from: aJ.a$d$b */
        public static final class b extends C17198i.b<d, b> implements C17207r {

            /* renamed from: b  reason: collision with root package name */
            private int f141034b;

            /* renamed from: c  reason: collision with root package name */
            private b f141035c = b.q();

            /* renamed from: d  reason: collision with root package name */
            private c f141036d = c.q();

            /* renamed from: e  reason: collision with root package name */
            private c f141037e = c.q();

            /* renamed from: f  reason: collision with root package name */
            private c f141038f = c.q();

            /* renamed from: g  reason: collision with root package name */
            private c f141039g = c.q();

            private b() {
                p();
            }

            /* access modifiers changed from: private */
            public static b o() {
                return new b();
            }

            private void p() {
            }

            public b A(c cVar) {
                if ((this.f141034b & 2) != 2 || this.f141036d == c.q()) {
                    this.f141036d = cVar;
                } else {
                    this.f141036d = c.x(this.f141036d).f(cVar).m();
                }
                this.f141034b |= 2;
                return this;
            }

            /* renamed from: l */
            public d g() {
                d m10 = m();
                if (m10.isInitialized()) {
                    return m10;
                }
                throw C17190a.C3485a.c(m10);
            }

            public d m() {
                d dVar = new d((C17198i.b) this);
                int i10 = this.f141034b;
                int i11 = 1;
                if ((i10 & 1) != 1) {
                    i11 = 0;
                }
                b unused = dVar.f141027d = this.f141035c;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                c unused2 = dVar.f141028e = this.f141036d;
                if ((i10 & 4) == 4) {
                    i11 |= 4;
                }
                c unused3 = dVar.f141029f = this.f141037e;
                if ((i10 & 8) == 8) {
                    i11 |= 8;
                }
                c unused4 = dVar.f141030g = this.f141038f;
                if ((i10 & 16) == 16) {
                    i11 |= 16;
                }
                c unused5 = dVar.f141031h = this.f141039g;
                int unused6 = dVar.f141026c = i11;
                return dVar;
            }

            /* renamed from: n */
            public b d() {
                return o().f(m());
            }

            public b r(c cVar) {
                if ((this.f141034b & 16) != 16 || this.f141039g == c.q()) {
                    this.f141039g = cVar;
                } else {
                    this.f141039g = c.x(this.f141039g).f(cVar).m();
                }
                this.f141034b |= 16;
                return this;
            }

            public b u(b bVar) {
                if ((this.f141034b & 1) != 1 || this.f141035c == b.q()) {
                    this.f141035c = bVar;
                } else {
                    this.f141035c = b.x(this.f141035c).f(bVar).m();
                }
                this.f141034b |= 1;
                return this;
            }

            /* renamed from: v */
            public b f(d dVar) {
                if (dVar == d.t()) {
                    return this;
                }
                if (dVar.A()) {
                    u(dVar.v());
                }
                if (dVar.D()) {
                    A(dVar.y());
                }
                if (dVar.B()) {
                    y(dVar.w());
                }
                if (dVar.C()) {
                    z(dVar.x());
                }
                if (dVar.z()) {
                    r(dVar.u());
                }
                j(e().i(dVar.f141025b));
                return this;
            }

            /* renamed from: w */
            public b o1(C17194e eVar, C17196g gVar) {
                d dVar;
                d dVar2 = null;
                try {
                    d c10 = d.f141024l.c(eVar, gVar);
                    if (c10 != null) {
                        f(c10);
                    }
                    return this;
                } catch (C17200k e10) {
                    dVar = (d) e10.a();
                    throw e10;
                } catch (Throwable th2) {
                    th = th2;
                    dVar2 = dVar;
                }
                if (dVar2 != null) {
                    f(dVar2);
                }
                throw th;
            }

            public b y(c cVar) {
                if ((this.f141034b & 4) != 4 || this.f141037e == c.q()) {
                    this.f141037e = cVar;
                } else {
                    this.f141037e = c.x(this.f141037e).f(cVar).m();
                }
                this.f141034b |= 4;
                return this;
            }

            public b z(c cVar) {
                if ((this.f141034b & 8) != 8 || this.f141038f == c.q()) {
                    this.f141038f = cVar;
                } else {
                    this.f141038f = c.x(this.f141038f).f(cVar).m();
                }
                this.f141034b |= 8;
                return this;
            }
        }

        static {
            d dVar = new d(true);
            f141023k = dVar;
            dVar.E();
        }

        private void E() {
            this.f141027d = b.q();
            this.f141028e = c.q();
            this.f141029f = c.q();
            this.f141030g = c.q();
            this.f141031h = c.q();
        }

        public static b F() {
            return b.o();
        }

        public static b G(d dVar) {
            return F().f(dVar);
        }

        public static d t() {
            return f141023k;
        }

        public boolean A() {
            return (this.f141026c & 1) == 1;
        }

        public boolean B() {
            return (this.f141026c & 4) == 4;
        }

        public boolean C() {
            return (this.f141026c & 8) == 8;
        }

        public boolean D() {
            return (this.f141026c & 2) == 2;
        }

        /* renamed from: H */
        public b newBuilderForType() {
            return F();
        }

        /* renamed from: I */
        public b toBuilder() {
            return G(this);
        }

        public void a(C17195f fVar) {
            getSerializedSize();
            if ((this.f141026c & 1) == 1) {
                fVar.d0(1, this.f141027d);
            }
            if ((this.f141026c & 2) == 2) {
                fVar.d0(2, this.f141028e);
            }
            if ((this.f141026c & 4) == 4) {
                fVar.d0(3, this.f141029f);
            }
            if ((this.f141026c & 8) == 8) {
                fVar.d0(4, this.f141030g);
            }
            if ((this.f141026c & 16) == 16) {
                fVar.d0(5, this.f141031h);
            }
            fVar.i0(this.f141025b);
        }

        public C17208s<d> getParserForType() {
            return f141024l;
        }

        public int getSerializedSize() {
            int i10 = this.f141033j;
            if (i10 != -1) {
                return i10;
            }
            int s10 = (this.f141026c & 1) == 1 ? C17195f.s(1, this.f141027d) : 0;
            if ((this.f141026c & 2) == 2) {
                s10 += C17195f.s(2, this.f141028e);
            }
            if ((this.f141026c & 4) == 4) {
                s10 += C17195f.s(3, this.f141029f);
            }
            if ((this.f141026c & 8) == 8) {
                s10 += C17195f.s(4, this.f141030g);
            }
            if ((this.f141026c & 16) == 16) {
                s10 += C17195f.s(5, this.f141031h);
            }
            int size = s10 + this.f141025b.size();
            this.f141033j = size;
            return size;
        }

        public final boolean isInitialized() {
            byte b10 = this.f141032i;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f141032i = 1;
            return true;
        }

        public c u() {
            return this.f141031h;
        }

        public b v() {
            return this.f141027d;
        }

        public c w() {
            return this.f141029f;
        }

        public c x() {
            return this.f141030g;
        }

        public c y() {
            return this.f141028e;
        }

        public boolean z() {
            return (this.f141026c & 16) == 16;
        }

        private d(C17198i.b bVar) {
            super(bVar);
            this.f141032i = -1;
            this.f141033j = -1;
            this.f141025b = bVar.e();
        }

        private d(boolean z10) {
            this.f141032i = -1;
            this.f141033j = -1;
            this.f141025b = C17193d.f143014a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: aJ.a$b$b} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: aJ.a$c$b} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: aJ.a$c$b} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: aJ.a$c$b} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: aJ.a$c$b} */
        /* JADX WARNING: type inference failed for: r6v0 */
        /* JADX WARNING: type inference failed for: r6v11 */
        /* JADX WARNING: type inference failed for: r6v12 */
        /* JADX WARNING: type inference failed for: r6v13 */
        /* JADX WARNING: type inference failed for: r6v14 */
        /* JADX WARNING: type inference failed for: r6v15 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private d(eJ.C17194e r8, eJ.C17196g r9) {
            /*
                r7 = this;
                r7.<init>()
                r0 = -1
                r7.f141032i = r0
                r7.f141033j = r0
                r7.E()
                eJ.d$b r0 = eJ.C17193d.B()
                r1 = 1
                eJ.f r2 = eJ.C17195f.J(r0, r1)
                r3 = 0
            L_0x0015:
                if (r3 != 0) goto L_0x0133
                int r4 = r8.K()     // Catch:{ k -> 0x0040, IOException -> 0x003d }
                if (r4 == 0) goto L_0x0038
                r5 = 10
                r6 = 0
                if (r4 == r5) goto L_0x00e3
                r5 = 18
                if (r4 == r5) goto L_0x00bb
                r5 = 26
                if (r4 == r5) goto L_0x0093
                r5 = 34
                if (r4 == r5) goto L_0x006b
                r5 = 42
                if (r4 == r5) goto L_0x0043
                boolean r4 = r7.k(r8, r2, r9, r4)     // Catch:{ k -> 0x0040, IOException -> 0x003d }
                if (r4 != 0) goto L_0x0015
            L_0x0038:
                r3 = r1
                goto L_0x0015
            L_0x003a:
                r8 = move-exception
                goto L_0x011d
            L_0x003d:
                r8 = move-exception
                goto L_0x010a
            L_0x0040:
                r8 = move-exception
                goto L_0x0118
            L_0x0043:
                int r4 = r7.f141026c     // Catch:{ k -> 0x0040, IOException -> 0x003d }
                r5 = 16
                r4 = r4 & r5
                if (r4 != r5) goto L_0x0050
                aJ.a$c r4 = r7.f141031h     // Catch:{ k -> 0x0040, IOException -> 0x003d }
                aJ.a$c$b r6 = r4.toBuilder()     // Catch:{ k -> 0x0040, IOException -> 0x003d }
            L_0x0050:
                eJ.s<aJ.a$c> r4 = aJ.C17030a.c.f141013i     // Catch:{ k -> 0x0040, IOException -> 0x003d }
                eJ.q r4 = r8.u(r4, r9)     // Catch:{ k -> 0x0040, IOException -> 0x003d }
                aJ.a$c r4 = (aJ.C17030a.c) r4     // Catch:{ k -> 0x0040, IOException -> 0x003d }
                r7.f141031h = r4     // Catch:{ k -> 0x0040, IOException -> 0x003d }
                if (r6 == 0) goto L_0x0065
                r6.f(r4)     // Catch:{ k -> 0x0040, IOException -> 0x003d }
                aJ.a$c r4 = r6.m()     // Catch:{ k -> 0x0040, IOException -> 0x003d }
                r7.f141031h = r4     // Catch:{ k -> 0x0040, IOException -> 0x003d }
            L_0x0065:
                int r4 = r7.f141026c     // Catch:{ k -> 0x0040, IOException -> 0x003d }
                r4 = r4 | r5
                r7.f141026c = r4     // Catch:{ k -> 0x0040, IOException -> 0x003d }
                goto L_0x0015
            L_0x006b:
                int r4 = r7.f141026c     // Catch:{ k -> 0x0040, IOException -> 0x003d }
                r5 = 8
                r4 = r4 & r5
                if (r4 != r5) goto L_0x0078
                aJ.a$c r4 = r7.f141030g     // Catch:{ k -> 0x0040, IOException -> 0x003d }
                aJ.a$c$b r6 = r4.toBuilder()     // Catch:{ k -> 0x0040, IOException -> 0x003d }
            L_0x0078:
                eJ.s<aJ.a$c> r4 = aJ.C17030a.c.f141013i     // Catch:{ k -> 0x0040, IOException -> 0x003d }
                eJ.q r4 = r8.u(r4, r9)     // Catch:{ k -> 0x0040, IOException -> 0x003d }
                aJ.a$c r4 = (aJ.C17030a.c) r4     // Catch:{ k -> 0x0040, IOException -> 0x003d }
                r7.f141030g = r4     // Catch:{ k -> 0x0040, IOException -> 0x003d }
                if (r6 == 0) goto L_0x008d
                r6.f(r4)     // Catch:{ k -> 0x0040, IOException -> 0x003d }
                aJ.a$c r4 = r6.m()     // Catch:{ k -> 0x0040, IOException -> 0x003d }
                r7.f141030g = r4     // Catch:{ k -> 0x0040, IOException -> 0x003d }
            L_0x008d:
                int r4 = r7.f141026c     // Catch:{ k -> 0x0040, IOException -> 0x003d }
                r4 = r4 | r5
                r7.f141026c = r4     // Catch:{ k -> 0x0040, IOException -> 0x003d }
                goto L_0x0015
            L_0x0093:
                int r4 = r7.f141026c     // Catch:{ k -> 0x0040, IOException -> 0x003d }
                r5 = 4
                r4 = r4 & r5
                if (r4 != r5) goto L_0x009f
                aJ.a$c r4 = r7.f141029f     // Catch:{ k -> 0x0040, IOException -> 0x003d }
                aJ.a$c$b r6 = r4.toBuilder()     // Catch:{ k -> 0x0040, IOException -> 0x003d }
            L_0x009f:
                eJ.s<aJ.a$c> r4 = aJ.C17030a.c.f141013i     // Catch:{ k -> 0x0040, IOException -> 0x003d }
                eJ.q r4 = r8.u(r4, r9)     // Catch:{ k -> 0x0040, IOException -> 0x003d }
                aJ.a$c r4 = (aJ.C17030a.c) r4     // Catch:{ k -> 0x0040, IOException -> 0x003d }
                r7.f141029f = r4     // Catch:{ k -> 0x0040, IOException -> 0x003d }
                if (r6 == 0) goto L_0x00b4
                r6.f(r4)     // Catch:{ k -> 0x0040, IOException -> 0x003d }
                aJ.a$c r4 = r6.m()     // Catch:{ k -> 0x0040, IOException -> 0x003d }
                r7.f141029f = r4     // Catch:{ k -> 0x0040, IOException -> 0x003d }
            L_0x00b4:
                int r4 = r7.f141026c     // Catch:{ k -> 0x0040, IOException -> 0x003d }
                r4 = r4 | r5
                r7.f141026c = r4     // Catch:{ k -> 0x0040, IOException -> 0x003d }
                goto L_0x0015
            L_0x00bb:
                int r4 = r7.f141026c     // Catch:{ k -> 0x0040, IOException -> 0x003d }
                r5 = 2
                r4 = r4 & r5
                if (r4 != r5) goto L_0x00c7
                aJ.a$c r4 = r7.f141028e     // Catch:{ k -> 0x0040, IOException -> 0x003d }
                aJ.a$c$b r6 = r4.toBuilder()     // Catch:{ k -> 0x0040, IOException -> 0x003d }
            L_0x00c7:
                eJ.s<aJ.a$c> r4 = aJ.C17030a.c.f141013i     // Catch:{ k -> 0x0040, IOException -> 0x003d }
                eJ.q r4 = r8.u(r4, r9)     // Catch:{ k -> 0x0040, IOException -> 0x003d }
                aJ.a$c r4 = (aJ.C17030a.c) r4     // Catch:{ k -> 0x0040, IOException -> 0x003d }
                r7.f141028e = r4     // Catch:{ k -> 0x0040, IOException -> 0x003d }
                if (r6 == 0) goto L_0x00dc
                r6.f(r4)     // Catch:{ k -> 0x0040, IOException -> 0x003d }
                aJ.a$c r4 = r6.m()     // Catch:{ k -> 0x0040, IOException -> 0x003d }
                r7.f141028e = r4     // Catch:{ k -> 0x0040, IOException -> 0x003d }
            L_0x00dc:
                int r4 = r7.f141026c     // Catch:{ k -> 0x0040, IOException -> 0x003d }
                r4 = r4 | r5
                r7.f141026c = r4     // Catch:{ k -> 0x0040, IOException -> 0x003d }
                goto L_0x0015
            L_0x00e3:
                int r4 = r7.f141026c     // Catch:{ k -> 0x0040, IOException -> 0x003d }
                r4 = r4 & r1
                if (r4 != r1) goto L_0x00ee
                aJ.a$b r4 = r7.f141027d     // Catch:{ k -> 0x0040, IOException -> 0x003d }
                aJ.a$b$b r6 = r4.toBuilder()     // Catch:{ k -> 0x0040, IOException -> 0x003d }
            L_0x00ee:
                eJ.s<aJ.a$b> r4 = aJ.C17030a.b.f141002i     // Catch:{ k -> 0x0040, IOException -> 0x003d }
                eJ.q r4 = r8.u(r4, r9)     // Catch:{ k -> 0x0040, IOException -> 0x003d }
                aJ.a$b r4 = (aJ.C17030a.b) r4     // Catch:{ k -> 0x0040, IOException -> 0x003d }
                r7.f141027d = r4     // Catch:{ k -> 0x0040, IOException -> 0x003d }
                if (r6 == 0) goto L_0x0103
                r6.f(r4)     // Catch:{ k -> 0x0040, IOException -> 0x003d }
                aJ.a$b r4 = r6.m()     // Catch:{ k -> 0x0040, IOException -> 0x003d }
                r7.f141027d = r4     // Catch:{ k -> 0x0040, IOException -> 0x003d }
            L_0x0103:
                int r4 = r7.f141026c     // Catch:{ k -> 0x0040, IOException -> 0x003d }
                r4 = r4 | r1
                r7.f141026c = r4     // Catch:{ k -> 0x0040, IOException -> 0x003d }
                goto L_0x0015
            L_0x010a:
                eJ.k r9 = new eJ.k     // Catch:{ all -> 0x003a }
                java.lang.String r8 = r8.getMessage()     // Catch:{ all -> 0x003a }
                r9.<init>(r8)     // Catch:{ all -> 0x003a }
                eJ.k r8 = r9.i(r7)     // Catch:{ all -> 0x003a }
                throw r8     // Catch:{ all -> 0x003a }
            L_0x0118:
                eJ.k r8 = r8.i(r7)     // Catch:{ all -> 0x003a }
                throw r8     // Catch:{ all -> 0x003a }
            L_0x011d:
                r2.I()     // Catch:{ IOException -> 0x0120, all -> 0x0127 }
            L_0x0120:
                eJ.d r9 = r0.g()
                r7.f141025b = r9
                goto L_0x012f
            L_0x0127:
                r8 = move-exception
                eJ.d r9 = r0.g()
                r7.f141025b = r9
                throw r8
            L_0x012f:
                r7.h()
                throw r8
            L_0x0133:
                r2.I()     // Catch:{ IOException -> 0x0136, all -> 0x013d }
            L_0x0136:
                eJ.d r8 = r0.g()
                r7.f141025b = r8
                goto L_0x0145
            L_0x013d:
                r8 = move-exception
                eJ.d r9 = r0.g()
                r7.f141025b = r9
                throw r8
            L_0x0145:
                r7.h()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: aJ.C17030a.d.<init>(eJ.e, eJ.g):void");
        }
    }
}
