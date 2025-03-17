package jb;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class p {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C9893d f74797a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final boolean f74798b;

    /* renamed from: c  reason: collision with root package name */
    private final c f74799c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final int f74800d;

    class a implements c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C9893d f74801a;

        /* renamed from: jb.p$a$a  reason: collision with other inner class name */
        class C1352a extends b {
            C1352a(p pVar, CharSequence charSequence) {
                super(pVar, charSequence);
            }

            /* access modifiers changed from: package-private */
            public int f(int i10) {
                return i10 + 1;
            }

            /* access modifiers changed from: package-private */
            public int g(int i10) {
                return a.this.f74801a.c(this.f74803c, i10);
            }
        }

        a(C9893d dVar) {
            this.f74801a = dVar;
        }

        /* renamed from: b */
        public b a(p pVar, CharSequence charSequence) {
            return new C1352a(pVar, charSequence);
        }
    }

    private static abstract class b extends C9891b<String> {

        /* renamed from: c  reason: collision with root package name */
        final CharSequence f74803c;

        /* renamed from: d  reason: collision with root package name */
        final C9893d f74804d;

        /* renamed from: e  reason: collision with root package name */
        final boolean f74805e;

        /* renamed from: f  reason: collision with root package name */
        int f74806f = 0;

        /* renamed from: g  reason: collision with root package name */
        int f74807g;

        protected b(p pVar, CharSequence charSequence) {
            this.f74804d = pVar.f74797a;
            this.f74805e = pVar.f74798b;
            this.f74807g = pVar.f74800d;
            this.f74803c = charSequence;
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public String a() {
            int i10;
            int i11 = this.f74806f;
            while (true) {
                int i12 = this.f74806f;
                if (i12 == -1) {
                    return (String) c();
                }
                int g10 = g(i12);
                if (g10 == -1) {
                    g10 = this.f74803c.length();
                    this.f74806f = -1;
                } else {
                    this.f74806f = f(g10);
                }
                int i13 = this.f74806f;
                if (i13 == i11) {
                    int i14 = i13 + 1;
                    this.f74806f = i14;
                    if (i14 > this.f74803c.length()) {
                        this.f74806f = -1;
                    }
                } else {
                    while (i11 < g10 && this.f74804d.e(this.f74803c.charAt(i11))) {
                        i11++;
                    }
                    while (i10 > i11 && this.f74804d.e(this.f74803c.charAt(i10 - 1))) {
                        g10 = i10 - 1;
                    }
                    if (!this.f74805e || i11 != i10) {
                        int i15 = this.f74807g;
                    } else {
                        i11 = this.f74806f;
                    }
                }
            }
            int i152 = this.f74807g;
            if (i152 == 1) {
                i10 = this.f74803c.length();
                this.f74806f = -1;
                while (i10 > i11 && this.f74804d.e(this.f74803c.charAt(i10 - 1))) {
                    i10--;
                }
            } else {
                this.f74807g = i152 - 1;
            }
            return this.f74803c.subSequence(i11, i10).toString();
        }

        /* access modifiers changed from: package-private */
        public abstract int f(int i10);

        /* access modifiers changed from: package-private */
        public abstract int g(int i10);
    }

    private interface c {
        Iterator<String> a(p pVar, CharSequence charSequence);
    }

    private p(c cVar) {
        this(cVar, false, C9893d.f(), Integer.MAX_VALUE);
    }

    public static p d(char c10) {
        return e(C9893d.d(c10));
    }

    public static p e(C9893d dVar) {
        l.j(dVar);
        return new p(new a(dVar));
    }

    private Iterator<String> g(CharSequence charSequence) {
        return this.f74799c.a(this, charSequence);
    }

    public List<String> f(CharSequence charSequence) {
        l.j(charSequence);
        Iterator<String> g10 = g(charSequence);
        ArrayList arrayList = new ArrayList();
        while (g10.hasNext()) {
            arrayList.add(g10.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    private p(c cVar, boolean z10, C9893d dVar, int i10) {
        this.f74799c = cVar;
        this.f74798b = z10;
        this.f74797a = dVar;
        this.f74800d = i10;
    }
}
