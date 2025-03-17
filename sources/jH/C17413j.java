package jH;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.C5187o;
import androidx.lifecycle.C5218v;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.r;
import cH.C17062a;
import gH.C17265a;
import hH.C17326e;
import hH.C17328g;
import mH.C17599b;
import mH.C17601d;

/* renamed from: jH.j  reason: case insensitive filesystem */
public final class C17413j implements C17599b<Object> {

    /* renamed from: a  reason: collision with root package name */
    private volatile Object f143967a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f143968b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private final boolean f143969c;

    /* renamed from: d  reason: collision with root package name */
    private final View f143970d;

    /* renamed from: jH.j$b */
    public interface b {
        C17326e g();
    }

    /* renamed from: jH.j$c */
    public interface c {
        C17328g V();
    }

    public C17413j(View view, boolean z10) {
        this.f143970d = view;
        this.f143969c = z10;
    }

    private Object a() {
        C17599b<?> b10 = b(false);
        return this.f143969c ? ((c) C17062a.a(b10, c.class)).V().a(this.f143970d).g() : ((b) C17062a.a(b10, b.class)).g().a(this.f143970d).g();
    }

    private C17599b<?> b(boolean z10) {
        Class<C17599b> cls = C17599b.class;
        if (this.f143969c) {
            Context c10 = c(a.class, z10);
            if (c10 instanceof a) {
                return (C17599b) ((a) c10).d();
            }
            if (z10) {
                return null;
            }
            Context c11 = c(cls, z10);
            C17601d.d(!(c11 instanceof C17599b), "%s, @WithFragmentBindings Hilt view must be attached to an @AndroidEntryPoint Fragment. Was attached to context %s", this.f143970d.getClass(), c11.getClass().getName());
        } else {
            Context c12 = c(cls, z10);
            if (c12 instanceof C17599b) {
                return (C17599b) c12;
            }
            if (z10) {
                return null;
            }
        }
        throw new IllegalStateException(String.format("%s, Hilt view must be attached to an @AndroidEntryPoint Fragment or Activity.", new Object[]{this.f143970d.getClass()}));
    }

    private Context c(Class<?> cls, boolean z10) {
        Context d10 = d(this.f143970d.getContext(), cls);
        if (d10 != C17265a.a(d10.getApplicationContext())) {
            return d10;
        }
        C17601d.d(z10, "%s, Hilt view cannot be created using the application context. Use a Hilt Fragment or Activity context.", this.f143970d.getClass());
        return null;
    }

    private static Context d(Context context, Class<?> cls) {
        while ((context instanceof ContextWrapper) && !cls.isInstance(context)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return context;
    }

    public Object g0() {
        if (this.f143967a == null) {
            synchronized (this.f143968b) {
                try {
                    if (this.f143967a == null) {
                        this.f143967a = a();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f143967a;
    }

    /* renamed from: jH.j$a */
    public static final class a extends ContextWrapper {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public C5187o f143971a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public LayoutInflater f143972b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public LayoutInflater f143973c;

        /* renamed from: d  reason: collision with root package name */
        private final C5218v f143974d;

        /* renamed from: jH.j$a$a  reason: collision with other inner class name */
        class C3517a implements C5218v {
            C3517a() {
            }

            public void e(C5221y yVar, r.a aVar) {
                if (aVar == r.a.ON_DESTROY) {
                    C5187o unused = a.this.f143971a = null;
                    LayoutInflater unused2 = a.this.f143972b = null;
                    LayoutInflater unused3 = a.this.f143973c = null;
                }
            }
        }

        a(Context context, C5187o oVar) {
            super((Context) C17601d.b(context));
            C3517a aVar = new C3517a();
            this.f143974d = aVar;
            this.f143972b = null;
            C5187o oVar2 = (C5187o) C17601d.b(oVar);
            this.f143971a = oVar2;
            oVar2.getLifecycle().c(aVar);
        }

        /* access modifiers changed from: package-private */
        public C5187o d() {
            C17601d.c(this.f143971a, "The fragment has already been destroyed.");
            return this.f143971a;
        }

        public Object getSystemService(String str) {
            if (!"layout_inflater".equals(str)) {
                return getBaseContext().getSystemService(str);
            }
            if (this.f143973c == null) {
                if (this.f143972b == null) {
                    this.f143972b = (LayoutInflater) getBaseContext().getSystemService("layout_inflater");
                }
                this.f143973c = this.f143972b.cloneInContext(this);
            }
            return this.f143973c;
        }

        a(LayoutInflater layoutInflater, C5187o oVar) {
            super((Context) C17601d.b(((LayoutInflater) C17601d.b(layoutInflater)).getContext()));
            C3517a aVar = new C3517a();
            this.f143974d = aVar;
            this.f143972b = layoutInflater;
            C5187o oVar2 = (C5187o) C17601d.b(oVar);
            this.f143971a = oVar2;
            oVar2.getLifecycle().c(aVar);
        }
    }
}
