package R7;

import L7.s;
import Y7.k;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.C5191t;
import androidx.fragment.app.FragmentManager;
import com.bumptech.glide.l;
import j0.C5445a;
import java.util.Collection;
import java.util.Map;

public class o implements Handler.Callback {

    /* renamed from: f  reason: collision with root package name */
    private static final b f39711f = new a();

    /* renamed from: a  reason: collision with root package name */
    private volatile l f39712a;

    /* renamed from: b  reason: collision with root package name */
    private final b f39713b;

    /* renamed from: c  reason: collision with root package name */
    private final C5445a<View, C5187o> f39714c = new C5445a<>();

    /* renamed from: d  reason: collision with root package name */
    private final i f39715d;

    /* renamed from: e  reason: collision with root package name */
    private final m f39716e;

    class a implements b {
        a() {
        }

        public l a(com.bumptech.glide.b bVar, j jVar, p pVar, Context context) {
            return new l(bVar, jVar, pVar, context);
        }
    }

    public interface b {
        l a(com.bumptech.glide.b bVar, j jVar, p pVar, Context context);
    }

    public o(b bVar) {
        bVar = bVar == null ? f39711f : bVar;
        this.f39713b = bVar;
        this.f39716e = new m(bVar);
        this.f39715d = b();
    }

    @TargetApi(17)
    private static void a(Activity activity) {
        if (activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    private static i b() {
        return (!s.f38424f || !s.f38423e) ? new f() : new h();
    }

    private static Activity c(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return c(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    private static void d(Collection<C5187o> collection, Map<View, C5187o> map) {
        if (collection != null) {
            for (C5187o next : collection) {
                if (!(next == null || next.getView() == null)) {
                    map.put(next.getView(), next);
                    d(next.getChildFragmentManager().G0(), map);
                }
            }
        }
    }

    private C5187o e(View view, C5191t tVar) {
        this.f39714c.clear();
        d(tVar.getSupportFragmentManager().G0(), this.f39714c);
        View findViewById = tVar.findViewById(16908290);
        C5187o oVar = null;
        while (!view.equals(findViewById) && (oVar = this.f39714c.get(view)) == null && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        this.f39714c.clear();
        return oVar;
    }

    private l j(Context context) {
        if (this.f39712a == null) {
            synchronized (this) {
                try {
                    if (this.f39712a == null) {
                        this.f39712a = this.f39713b.a(com.bumptech.glide.b.c(context.getApplicationContext()), new a(), new g(), context.getApplicationContext());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f39712a;
    }

    private static boolean k(Context context) {
        Activity c10 = c(context);
        return c10 == null || !c10.isFinishing();
    }

    public l f(Context context) {
        if (context != null) {
            if (Y7.l.s() && !(context instanceof Application)) {
                if (context instanceof C5191t) {
                    return i((C5191t) context);
                }
                if (context instanceof ContextWrapper) {
                    ContextWrapper contextWrapper = (ContextWrapper) context;
                    if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                        return f(contextWrapper.getBaseContext());
                    }
                }
            }
            return j(context);
        }
        throw new IllegalArgumentException("You cannot start a load on a null Context");
    }

    public l g(View view) {
        if (Y7.l.r()) {
            return f(view.getContext().getApplicationContext());
        }
        k.d(view);
        k.e(view.getContext(), "Unable to obtain a request manager for a view without a Context");
        Activity c10 = c(view.getContext());
        if (c10 == null) {
            return f(view.getContext().getApplicationContext());
        }
        if (!(c10 instanceof C5191t)) {
            return f(view.getContext().getApplicationContext());
        }
        C5191t tVar = (C5191t) c10;
        C5187o e10 = e(view, tVar);
        return e10 != null ? h(e10) : i(tVar);
    }

    public l h(C5187o oVar) {
        k.e(oVar.getContext(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
        if (Y7.l.r()) {
            return f(oVar.getContext().getApplicationContext());
        }
        if (oVar.getActivity() != null) {
            this.f39715d.a(oVar.getActivity());
        }
        FragmentManager childFragmentManager = oVar.getChildFragmentManager();
        Context context = oVar.getContext();
        return this.f39716e.b(context, com.bumptech.glide.b.c(context.getApplicationContext()), oVar.getLifecycle(), childFragmentManager, oVar.isVisible());
    }

    @Deprecated
    public boolean handleMessage(Message message) {
        return false;
    }

    public l i(C5191t tVar) {
        if (Y7.l.r()) {
            return f(tVar.getApplicationContext());
        }
        a(tVar);
        this.f39715d.a(tVar);
        boolean k10 = k(tVar);
        return this.f39716e.b(tVar, com.bumptech.glide.b.c(tVar.getApplicationContext()), tVar.getLifecycle(), tVar.getSupportFragmentManager(), k10);
    }
}
