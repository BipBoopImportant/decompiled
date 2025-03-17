package org.maplibre.android.maps;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.maplibre.android.style.layers.Layer;
import org.maplibre.android.style.layers.TransitionOptions;
import org.maplibre.android.style.sources.Source;

public class E {

    /* renamed from: a  reason: collision with root package name */
    private final v f145701a;

    /* renamed from: b  reason: collision with root package name */
    private final HashMap<String, Source> f145702b;

    /* renamed from: c  reason: collision with root package name */
    private final HashMap<String, Layer> f145703c;

    /* renamed from: d  reason: collision with root package name */
    private final HashMap<String, Bitmap> f145704d;

    /* renamed from: e  reason: collision with root package name */
    private final a f145705e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f145706f;

    public static class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final List<Source> f145707a = new ArrayList();
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final List<e> f145708b = new ArrayList();
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public final List<C4249a> f145709c = new ArrayList();
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public TransitionOptions f145710d;

        /* renamed from: e  reason: collision with root package name */
        private String f145711e;

        /* renamed from: f  reason: collision with root package name */
        private String f145712f;

        /* renamed from: org.maplibre.android.maps.E$a$a  reason: collision with other inner class name */
        public static class C4249a {

            /* renamed from: a  reason: collision with root package name */
            Bitmap f145713a;

            /* renamed from: b  reason: collision with root package name */
            String f145714b;

            /* renamed from: c  reason: collision with root package name */
            boolean f145715c;

            /* renamed from: d  reason: collision with root package name */
            List<i> f145716d;

            /* renamed from: e  reason: collision with root package name */
            List<i> f145717e;

            public C4249a(String str, Bitmap bitmap, boolean z10) {
                this(str, bitmap, z10, (List<i>) null, (List<i>) null, (C17739h) null);
            }

            public C17739h a() {
                return null;
            }

            public List<i> b() {
                return this.f145716d;
            }

            public List<i> c() {
                return this.f145717e;
            }

            public C4249a(String str, Bitmap bitmap, boolean z10, List<i> list, List<i> list2, C17739h hVar) {
                this.f145714b = str;
                this.f145713a = bitmap;
                this.f145715c = z10;
                this.f145716d = list;
                this.f145717e = list2;
            }
        }

        public class b extends e {

            /* renamed from: b  reason: collision with root package name */
            String f145718b;
        }

        public class c extends e {

            /* renamed from: b  reason: collision with root package name */
            int f145719b;
        }

        public class d extends e {

            /* renamed from: b  reason: collision with root package name */
            String f145720b;
        }

        public class e {

            /* renamed from: a  reason: collision with root package name */
            Layer f145721a;
        }

        /* access modifiers changed from: package-private */
        public E e(v vVar) {
            return new E(this, vVar);
        }

        public a f(String str) {
            this.f145712f = str;
            return this;
        }

        public String g() {
            return this.f145712f;
        }

        public String h() {
            return this.f145711e;
        }
    }

    public interface b {
        void a(E e10);
    }

    public static Image o(a.C4249a aVar) {
        Bitmap bitmap = aVar.f145713a;
        Bitmap.Config config = bitmap.getConfig();
        Bitmap.Config config2 = Bitmap.Config.ARGB_8888;
        if (config != config2) {
            bitmap = bitmap.copy(config2, false);
        }
        ByteBuffer allocate = ByteBuffer.allocate(bitmap.getByteCount());
        bitmap.copyPixelsToBuffer(allocate);
        float density = ((float) bitmap.getDensity()) / 160.0f;
        if (aVar.b() == null || aVar.c() == null) {
            return new Image(allocate.array(), density, aVar.f145714b, bitmap.getWidth(), bitmap.getHeight(), aVar.f145715c);
        }
        float[] fArr = new float[(aVar.b().size() * 2)];
        for (int i10 = 0; i10 < aVar.b().size(); i10++) {
            int i11 = i10 * 2;
            fArr[i11] = aVar.b().get(i10).a();
            fArr[i11 + 1] = aVar.b().get(i10).b();
        }
        float[] fArr2 = new float[(aVar.c().size() * 2)];
        for (int i12 = 0; i12 < aVar.c().size(); i12++) {
            int i13 = i12 * 2;
            fArr2[i13] = aVar.c().get(i12).a();
            fArr2[i13 + 1] = aVar.c().get(i12).b();
        }
        byte[] array = allocate.array();
        String str = aVar.f145714b;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        boolean z10 = aVar.f145715c;
        aVar.a();
        return new Image(array, density, str, width, height, z10, fArr, fArr2, (float[]) null);
    }

    private void p(String str) {
        if (!this.f145706f) {
            throw new IllegalStateException(String.format("Calling %s when a newer style is loading/has loaded.", new Object[]{str}));
        }
    }

    public void a(String str, Bitmap bitmap) {
        b(str, bitmap, false);
    }

    public void b(String str, Bitmap bitmap, boolean z10) {
        p("addImage");
        this.f145701a.D(new Image[]{o(new a.C4249a(str, bitmap, z10))});
    }

    public void c(Layer layer) {
        p("addLayer");
        this.f145701a.V(layer);
        this.f145703c.put(layer.c(), layer);
    }

    public void d(Layer layer, String str) {
        p("addLayerAbove");
        this.f145701a.R(layer, str);
        this.f145703c.put(layer.c(), layer);
    }

    public void e(Layer layer, int i10) {
        p("addLayerAbove");
        this.f145701a.U(layer, i10);
        this.f145703c.put(layer.c(), layer);
    }

    public void f(Layer layer, String str) {
        p("addLayerBelow");
        this.f145701a.s(layer, str);
        this.f145703c.put(layer.c(), layer);
    }

    public void g(Source source) {
        p("addSource");
        this.f145701a.W(source);
        this.f145702b.put(source.getId(), source);
    }

    /* access modifiers changed from: package-private */
    public void h() {
        this.f145706f = false;
        for (Layer next : this.f145703c.values()) {
            if (next != null) {
                next.e();
            }
        }
        for (Source next2 : this.f145702b.values()) {
            if (next2 != null) {
                next2.setDetached();
            }
        }
        for (Map.Entry next3 : this.f145704d.entrySet()) {
            this.f145701a.F((String) next3.getKey());
            ((Bitmap) next3.getValue()).recycle();
        }
        this.f145702b.clear();
        this.f145703c.clear();
        this.f145704d.clear();
    }

    public <T extends Source> T i(String str) {
        p("getSourceAs");
        return this.f145702b.containsKey(str) ? (Source) this.f145702b.get(str) : this.f145701a.w(str);
    }

    public List<Source> j() {
        p("getSources");
        return this.f145701a.r();
    }

    public String k() {
        p("getUri");
        return this.f145701a.Y();
    }

    public boolean l() {
        return this.f145706f;
    }

    /* access modifiers changed from: package-private */
    public void m() {
        if (!this.f145706f) {
            this.f145706f = true;
            for (Source g10 : this.f145705e.f145707a) {
                g(g10);
            }
            for (a.e eVar : this.f145705e.f145708b) {
                if (eVar instanceof a.c) {
                    e(eVar.f145721a, ((a.c) eVar).f145719b);
                } else if (eVar instanceof a.b) {
                    d(eVar.f145721a, ((a.b) eVar).f145718b);
                } else if (eVar instanceof a.d) {
                    f(eVar.f145721a, ((a.d) eVar).f145720b);
                } else {
                    f(eVar.f145721a, "org.maplibre.annotations.points");
                }
            }
            for (a.C4249a aVar : this.f145705e.f145709c) {
                b(aVar.f145714b, aVar.f145713a, aVar.f145715c);
            }
            if (this.f145705e.f145710d != null) {
                n(this.f145705e.f145710d);
            }
        }
    }

    public void n(TransitionOptions transitionOptions) {
        p("setTransition");
        this.f145701a.J(transitionOptions);
    }

    private E(a aVar, v vVar) {
        this.f145702b = new HashMap<>();
        this.f145703c = new HashMap<>();
        this.f145704d = new HashMap<>();
        this.f145705e = aVar;
        this.f145701a = vVar;
    }
}
