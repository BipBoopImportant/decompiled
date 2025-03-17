package androidx.fragment.app;

import I2.C4600b0;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.r;
import c3.b;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;

public abstract class Q {

    /* renamed from: a  reason: collision with root package name */
    private final C5195x f21927a;

    /* renamed from: b  reason: collision with root package name */
    private final ClassLoader f21928b;

    /* renamed from: c  reason: collision with root package name */
    ArrayList<a> f21929c;

    /* renamed from: d  reason: collision with root package name */
    int f21930d;

    /* renamed from: e  reason: collision with root package name */
    int f21931e;

    /* renamed from: f  reason: collision with root package name */
    int f21932f;

    /* renamed from: g  reason: collision with root package name */
    int f21933g;

    /* renamed from: h  reason: collision with root package name */
    int f21934h;

    /* renamed from: i  reason: collision with root package name */
    boolean f21935i;

    /* renamed from: j  reason: collision with root package name */
    boolean f21936j;

    /* renamed from: k  reason: collision with root package name */
    String f21937k;

    /* renamed from: l  reason: collision with root package name */
    int f21938l;

    /* renamed from: m  reason: collision with root package name */
    CharSequence f21939m;

    /* renamed from: n  reason: collision with root package name */
    int f21940n;

    /* renamed from: o  reason: collision with root package name */
    CharSequence f21941o;

    /* renamed from: p  reason: collision with root package name */
    ArrayList<String> f21942p;

    /* renamed from: q  reason: collision with root package name */
    ArrayList<String> f21943q;

    /* renamed from: r  reason: collision with root package name */
    boolean f21944r;

    /* renamed from: s  reason: collision with root package name */
    ArrayList<Runnable> f21945s;

    static final class a {

        /* renamed from: a  reason: collision with root package name */
        int f21946a;

        /* renamed from: b  reason: collision with root package name */
        C5187o f21947b;

        /* renamed from: c  reason: collision with root package name */
        boolean f21948c;

        /* renamed from: d  reason: collision with root package name */
        int f21949d;

        /* renamed from: e  reason: collision with root package name */
        int f21950e;

        /* renamed from: f  reason: collision with root package name */
        int f21951f;

        /* renamed from: g  reason: collision with root package name */
        int f21952g;

        /* renamed from: h  reason: collision with root package name */
        r.b f21953h;

        /* renamed from: i  reason: collision with root package name */
        r.b f21954i;

        a() {
        }

        a(int i10, C5187o oVar) {
            this.f21946a = i10;
            this.f21947b = oVar;
            this.f21948c = false;
            r.b bVar = r.b.RESUMED;
            this.f21953h = bVar;
            this.f21954i = bVar;
        }

        a(int i10, C5187o oVar, boolean z10) {
            this.f21946a = i10;
            this.f21947b = oVar;
            this.f21948c = z10;
            r.b bVar = r.b.RESUMED;
            this.f21953h = bVar;
            this.f21954i = bVar;
        }

        a(int i10, C5187o oVar, r.b bVar) {
            this.f21946a = i10;
            this.f21947b = oVar;
            this.f21948c = false;
            this.f21953h = oVar.mMaxState;
            this.f21954i = bVar;
        }

        a(a aVar) {
            this.f21946a = aVar.f21946a;
            this.f21947b = aVar.f21947b;
            this.f21948c = aVar.f21948c;
            this.f21949d = aVar.f21949d;
            this.f21950e = aVar.f21950e;
            this.f21951f = aVar.f21951f;
            this.f21952g = aVar.f21952g;
            this.f21953h = aVar.f21953h;
            this.f21954i = aVar.f21954i;
        }
    }

    Q(C5195x xVar, ClassLoader classLoader) {
        this.f21929c = new ArrayList<>();
        this.f21936j = true;
        this.f21944r = false;
        this.f21927a = xVar;
        this.f21928b = classLoader;
    }

    private C5187o n(Class<? extends C5187o> cls, Bundle bundle) {
        C5195x xVar = this.f21927a;
        if (xVar != null) {
            ClassLoader classLoader = this.f21928b;
            if (classLoader != null) {
                C5187o instantiate = xVar.instantiate(classLoader, cls.getName());
                if (bundle != null) {
                    instantiate.setArguments(bundle);
                }
                return instantiate;
            }
            throw new IllegalStateException("The FragmentManager must be attached to itshost to create a Fragment");
        }
        throw new IllegalStateException("Creating a Fragment requires that this FragmentTransaction was built with FragmentManager.beginTransaction()");
    }

    public Q A(C5187o oVar) {
        g(new a(8, oVar));
        return this;
    }

    public Q B(boolean z10) {
        this.f21944r = z10;
        return this;
    }

    public Q b(int i10, C5187o oVar) {
        p(i10, oVar, (String) null, 1);
        return this;
    }

    public Q c(int i10, C5187o oVar, String str) {
        p(i10, oVar, str, 1);
        return this;
    }

    public final Q d(int i10, Class<? extends C5187o> cls, Bundle bundle) {
        return b(i10, n(cls, bundle));
    }

    public final Q e(ViewGroup viewGroup, C5187o oVar, String str) {
        oVar.mContainer = viewGroup;
        oVar.mInDynamicContainer = true;
        return c(viewGroup.getId(), oVar, str);
    }

    public Q f(C5187o oVar, String str) {
        p(0, oVar, str, 1);
        return this;
    }

    /* access modifiers changed from: package-private */
    public void g(a aVar) {
        this.f21929c.add(aVar);
        aVar.f21949d = this.f21930d;
        aVar.f21950e = this.f21931e;
        aVar.f21951f = this.f21932f;
        aVar.f21952g = this.f21933g;
    }

    public Q h(View view, String str) {
        if (S.f()) {
            String I10 = C4600b0.I(view);
            if (I10 != null) {
                if (this.f21942p == null) {
                    this.f21942p = new ArrayList<>();
                    this.f21943q = new ArrayList<>();
                } else if (this.f21943q.contains(str)) {
                    throw new IllegalArgumentException("A shared element with the target name '" + str + "' has already been added to the transaction.");
                } else if (this.f21942p.contains(I10)) {
                    throw new IllegalArgumentException("A shared element with the source name '" + I10 + "' has already been added to the transaction.");
                }
                this.f21942p.add(I10);
                this.f21943q.add(str);
            } else {
                throw new IllegalArgumentException("Unique transitionNames are required for all sharedElements");
            }
        }
        return this;
    }

    public Q i(String str) {
        if (this.f21936j) {
            this.f21935i = true;
            this.f21937k = str;
            return this;
        }
        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
    }

    public abstract int j();

    public abstract int k();

    public abstract void l();

    public abstract void m();

    public Q o() {
        if (!this.f21935i) {
            this.f21936j = false;
            return this;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    /* access modifiers changed from: package-private */
    public void p(int i10, C5187o oVar, String str, int i11) {
        String str2 = oVar.mPreviousWho;
        if (str2 != null) {
            b.f(oVar, str2);
        }
        Class<?> cls = oVar.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = oVar.mTag;
            if (str3 == null || str.equals(str3)) {
                oVar.mTag = str;
            } else {
                throw new IllegalStateException("Can't change tag of fragment " + oVar + ": was " + oVar.mTag + " now " + str);
            }
        }
        if (i10 != 0) {
            if (i10 != -1) {
                int i12 = oVar.mFragmentId;
                if (i12 == 0 || i12 == i10) {
                    oVar.mFragmentId = i10;
                    oVar.mContainerId = i10;
                } else {
                    throw new IllegalStateException("Can't change container ID of fragment " + oVar + ": was " + oVar.mFragmentId + " now " + i10);
                }
            } else {
                throw new IllegalArgumentException("Can't add fragment " + oVar + " with tag " + str + " to container view with no id");
            }
        }
        g(new a(i11, oVar));
    }

    public abstract boolean q();

    public Q r(C5187o oVar) {
        g(new a(3, oVar));
        return this;
    }

    public Q s(int i10, C5187o oVar) {
        return t(i10, oVar, (String) null);
    }

    public Q t(int i10, C5187o oVar, String str) {
        if (i10 != 0) {
            p(i10, oVar, str, 2);
            return this;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    public final Q u(int i10, Class<? extends C5187o> cls, Bundle bundle) {
        return v(i10, cls, bundle, (String) null);
    }

    public final Q v(int i10, Class<? extends C5187o> cls, Bundle bundle, String str) {
        return t(i10, n(cls, bundle), str);
    }

    /* access modifiers changed from: package-private */
    public Q w(boolean z10, Runnable runnable) {
        if (!z10) {
            o();
        }
        if (this.f21945s == null) {
            this.f21945s = new ArrayList<>();
        }
        this.f21945s.add(runnable);
        return this;
    }

    public Q x(int i10, int i11) {
        return y(i10, i11, 0, 0);
    }

    public Q y(int i10, int i11, int i12, int i13) {
        this.f21930d = i10;
        this.f21931e = i11;
        this.f21932f = i12;
        this.f21933g = i13;
        return this;
    }

    public Q z(C5187o oVar, r.b bVar) {
        g(new a(10, oVar, bVar));
        return this;
    }

    Q(C5195x xVar, ClassLoader classLoader, Q q10) {
        this(xVar, classLoader);
        Iterator<a> it = q10.f21929c.iterator();
        while (it.hasNext()) {
            this.f21929c.add(new a(it.next()));
        }
        this.f21930d = q10.f21930d;
        this.f21931e = q10.f21931e;
        this.f21932f = q10.f21932f;
        this.f21933g = q10.f21933g;
        this.f21934h = q10.f21934h;
        this.f21935i = q10.f21935i;
        this.f21936j = q10.f21936j;
        this.f21937k = q10.f21937k;
        this.f21940n = q10.f21940n;
        this.f21941o = q10.f21941o;
        this.f21938l = q10.f21938l;
        this.f21939m = q10.f21939m;
        if (q10.f21942p != null) {
            ArrayList<String> arrayList = new ArrayList<>();
            this.f21942p = arrayList;
            arrayList.addAll(q10.f21942p);
        }
        if (q10.f21943q != null) {
            ArrayList<String> arrayList2 = new ArrayList<>();
            this.f21943q = arrayList2;
            arrayList2.addAll(q10.f21943q);
        }
        this.f21944r = q10.f21944r;
    }
}
