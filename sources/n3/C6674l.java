package N3;

import O3.C6683b;
import Q3.C6685a;
import R3.C6686a;
import S3.C6690d;
import T3.C6693c;
import U3.C6706a;
import V3.C6707a;
import android.net.Uri;
import f4.e;
import g4.C7870f;
import h4.h;
import h4.m;
import i4.d;
import j4.C8399a;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import k4.C8424h;
import k4.s;
import kb.C9967v;
import q3.C5805p;
import q3.C5807s;
import t3.H;
import t4.C8775C;
import t4.C8777b;
import t4.C8780e;
import t4.C8783h;
import t4.C8785j;
import t4.K;
import u4.b;
import v4.C8889a;

/* renamed from: N3.l  reason: case insensitive filesystem */
public final class C6674l implements u {

    /* renamed from: r  reason: collision with root package name */
    private static final int[] f38894r = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};

    /* renamed from: s  reason: collision with root package name */
    private static final a f38895s = new a(new C6672j());

    /* renamed from: t  reason: collision with root package name */
    private static final a f38896t = new a(new C6673k());

    /* renamed from: b  reason: collision with root package name */
    private boolean f38897b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f38898c;

    /* renamed from: d  reason: collision with root package name */
    private int f38899d;

    /* renamed from: e  reason: collision with root package name */
    private int f38900e;

    /* renamed from: f  reason: collision with root package name */
    private int f38901f;

    /* renamed from: g  reason: collision with root package name */
    private int f38902g;

    /* renamed from: h  reason: collision with root package name */
    private int f38903h;

    /* renamed from: i  reason: collision with root package name */
    private int f38904i;

    /* renamed from: j  reason: collision with root package name */
    private int f38905j;

    /* renamed from: k  reason: collision with root package name */
    private int f38906k = 1;

    /* renamed from: l  reason: collision with root package name */
    private int f38907l;

    /* renamed from: m  reason: collision with root package name */
    private C9967v<C5807s> f38908m;

    /* renamed from: n  reason: collision with root package name */
    private int f38909n = 112800;

    /* renamed from: o  reason: collision with root package name */
    private boolean f38910o = true;

    /* renamed from: p  reason: collision with root package name */
    private s.a f38911p = new C8424h();

    /* renamed from: q  reason: collision with root package name */
    private int f38912q;

    /* renamed from: N3.l$a */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final C0614a f38913a;

        /* renamed from: b  reason: collision with root package name */
        private final AtomicBoolean f38914b = new AtomicBoolean(false);

        /* renamed from: c  reason: collision with root package name */
        private Constructor<? extends C6678p> f38915c;

        /* renamed from: N3.l$a$a  reason: collision with other inner class name */
        public interface C0614a {
            Constructor<? extends C6678p> a();
        }

        public a(C0614a aVar) {
            this.f38913a = aVar;
        }

        private Constructor<? extends C6678p> b() {
            synchronized (this.f38914b) {
                if (this.f38914b.get()) {
                    Constructor<? extends C6678p> constructor = this.f38915c;
                    return constructor;
                }
                try {
                    Constructor<? extends C6678p> a10 = this.f38913a.a();
                    return a10;
                } catch (ClassNotFoundException unused) {
                    this.f38914b.set(true);
                    return this.f38915c;
                } catch (Exception e10) {
                    throw new RuntimeException("Error instantiating extension", e10);
                }
            }
        }

        public C6678p a(Object... objArr) {
            Constructor<? extends C6678p> b10 = b();
            if (b10 == null) {
                return null;
            }
            try {
                return (C6678p) b10.newInstance(objArr);
            } catch (Exception e10) {
                throw new IllegalStateException("Unexpected error creating extractor", e10);
            }
        }
    }

    private void i(int i10, List<C6678p> list) {
        int i11 = 2;
        int i12 = 0;
        switch (i10) {
            case 0:
                list.add(new C8777b());
                return;
            case 1:
                list.add(new C8780e());
                return;
            case 2:
                boolean z10 = this.f38899d | this.f38897b;
                if (!this.f38898c) {
                    i11 = 0;
                }
                list.add(new C8783h(i11 | z10 ? 1 : 0));
                return;
            case 3:
                boolean z11 = this.f38900e | this.f38897b;
                if (!this.f38898c) {
                    i11 = 0;
                }
                list.add(new C6683b(i11 | z11 ? 1 : 0));
                return;
            case 4:
                C6678p a10 = f38895s.a(Integer.valueOf(this.f38901f));
                if (a10 != null) {
                    list.add(a10);
                    return;
                } else {
                    list.add(new C6690d(this.f38901f));
                    return;
                }
            case 5:
                list.add(new C6693c());
                return;
            case 6:
                s.a aVar = this.f38911p;
                int i13 = this.f38902g;
                if (this.f38910o) {
                    i11 = 0;
                }
                list.add(new e(aVar, i11 | i13));
                return;
            case 7:
                boolean z12 = this.f38905j | this.f38897b;
                if (!this.f38898c) {
                    i11 = 0;
                }
                list.add(new C7870f(i11 | z12 ? 1 : 0));
                return;
            case 8:
                list.add(new h(this.f38911p, this.f38904i | (this.f38910o ? 0 : 32)));
                s.a aVar2 = this.f38911p;
                int i14 = this.f38903h;
                if (!this.f38910o) {
                    i12 = 16;
                }
                list.add(new m(aVar2, i12 | i14));
                return;
            case 9:
                list.add(new d());
                return;
            case 10:
                list.add(new C8775C());
                return;
            case 11:
                if (this.f38908m == null) {
                    this.f38908m = C9967v.E();
                }
                list.add(new K(this.f38906k, this.f38910o ^ true ? 1 : 0, this.f38911p, new H(0), new C8785j(this.f38907l, this.f38908m), this.f38909n));
                return;
            case 12:
                list.add(new b());
                return;
            case 14:
                list.add(new C6707a(this.f38912q));
                return;
            case 15:
                C6678p a11 = f38896t.a(new Object[0]);
                if (a11 != null) {
                    list.add(a11);
                    return;
                }
                return;
            case 16:
                list.add(new P3.b(this.f38910o ^ true ? 1 : 0, this.f38911p));
                return;
            case 17:
                list.add(new C8399a());
                return;
            case 18:
                list.add(new C8889a());
                return;
            case 19:
                list.add(new C6686a());
                return;
            case 20:
                int i15 = this.f38903h;
                if ((i15 & 2) == 0 && (i15 & 4) == 0) {
                    list.add(new C6706a());
                    return;
                }
                return;
            case 21:
                list.add(new C6685a());
                return;
            default:
                return;
        }
    }

    /* access modifiers changed from: private */
    public static Constructor<? extends C6678p> k() {
        if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", (Class[]) null).invoke((Object) null, (Object[]) null))) {
            return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(C6678p.class).getConstructor(new Class[]{Integer.TYPE});
        }
        return null;
    }

    /* access modifiers changed from: private */
    public static Constructor<? extends C6678p> l() {
        return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(C6678p.class).getConstructor((Class[]) null);
    }

    public synchronized C6678p[] d(Uri uri, Map<String, List<String>> map) {
        ArrayList arrayList;
        try {
            int[] iArr = f38894r;
            arrayList = new ArrayList(iArr.length);
            int b10 = C5805p.b(map);
            if (b10 != -1) {
                i(b10, arrayList);
            }
            int c10 = C5805p.c(uri);
            if (!(c10 == -1 || c10 == b10)) {
                i(c10, arrayList);
            }
            for (int i10 : iArr) {
                if (!(i10 == b10 || i10 == c10)) {
                    i(i10, arrayList);
                }
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return (C6678p[]) arrayList.toArray(new C6678p[arrayList.size()]);
    }

    public synchronized C6678p[] f() {
        return d(Uri.EMPTY, new HashMap());
    }

    @Deprecated
    /* renamed from: j */
    public synchronized C6674l c(boolean z10) {
        this.f38910o = z10;
        return this;
    }

    public synchronized C6674l m(int i10) {
        this.f38912q = i10;
        return this;
    }

    /* renamed from: n */
    public synchronized C6674l b(s.a aVar) {
        this.f38911p = aVar;
        return this;
    }
}
