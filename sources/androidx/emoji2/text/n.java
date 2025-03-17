package androidx.emoji2.text;

import D2.p;
import H2.i;
import Z2.b;
import android.graphics.Typeface;
import android.util.SparseArray;
import java.nio.ByteBuffer;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    private final b f21620a;

    /* renamed from: b  reason: collision with root package name */
    private final char[] f21621b;

    /* renamed from: c  reason: collision with root package name */
    private final a f21622c = new a(1024);

    /* renamed from: d  reason: collision with root package name */
    private final Typeface f21623d;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        private final SparseArray<a> f21624a;

        /* renamed from: b  reason: collision with root package name */
        private p f21625b;

        private a() {
            this(1);
        }

        /* access modifiers changed from: package-private */
        public a a(int i10) {
            SparseArray<a> sparseArray = this.f21624a;
            if (sparseArray == null) {
                return null;
            }
            return sparseArray.get(i10);
        }

        /* access modifiers changed from: package-private */
        public final p b() {
            return this.f21625b;
        }

        /* access modifiers changed from: package-private */
        public void c(p pVar, int i10, int i11) {
            a a10 = a(pVar.b(i10));
            if (a10 == null) {
                a10 = new a();
                this.f21624a.put(pVar.b(i10), a10);
            }
            if (i11 > i10) {
                a10.c(pVar, i10 + 1, i11);
            } else {
                a10.f21625b = pVar;
            }
        }

        a(int i10) {
            this.f21624a = new SparseArray<>(i10);
        }
    }

    private n(Typeface typeface, b bVar) {
        this.f21623d = typeface;
        this.f21620a = bVar;
        this.f21621b = new char[(bVar.k() * 2)];
        a(bVar);
    }

    private void a(b bVar) {
        int k10 = bVar.k();
        for (int i10 = 0; i10 < k10; i10++) {
            p pVar = new p(this, i10);
            Character.toChars(pVar.f(), this.f21621b, i10 * 2);
            h(pVar);
        }
    }

    public static n b(Typeface typeface, ByteBuffer byteBuffer) {
        try {
            p.a("EmojiCompat.MetadataRepo.create");
            return new n(typeface, m.b(byteBuffer));
        } finally {
            p.b();
        }
    }

    public char[] c() {
        return this.f21621b;
    }

    public b d() {
        return this.f21620a;
    }

    /* access modifiers changed from: package-private */
    public int e() {
        return this.f21620a.l();
    }

    /* access modifiers changed from: package-private */
    public a f() {
        return this.f21622c;
    }

    /* access modifiers changed from: package-private */
    public Typeface g() {
        return this.f21623d;
    }

    /* access modifiers changed from: package-private */
    public void h(p pVar) {
        i.h(pVar, "emoji metadata cannot be null");
        i.b(pVar.c() > 0, "invalid metadata codepoint length");
        this.f21622c.c(pVar, 0, pVar.c() - 1);
    }
}
