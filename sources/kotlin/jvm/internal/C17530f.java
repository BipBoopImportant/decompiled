package kotlin.jvm.internal;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import mI.C17605c;
import uI.C18054c;
import uI.C18058g;
import uI.C18063l;
import uI.C18068q;
import uI.C18069r;
import uI.C18072u;

/* renamed from: kotlin.jvm.internal.f  reason: case insensitive filesystem */
public abstract class C17530f implements C18054c, Serializable {
    public static final Object NO_RECEIVER = a.f144374a;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient C18054c reflected;
    private final String signature;

    /* renamed from: kotlin.jvm.internal.f$a */
    private static class a implements Serializable {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public static final a f144374a = new a();

        private a() {
        }
    }

    public C17530f() {
        this(NO_RECEIVER);
    }

    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public C18054c compute() {
        C18054c cVar = this.reflected;
        if (cVar != null) {
            return cVar;
        }
        C18054c computeReflected = computeReflected();
        this.reflected = computeReflected;
        return computeReflected;
    }

    /* access modifiers changed from: protected */
    public abstract C18054c computeReflected();

    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    public String getName() {
        return this.name;
    }

    public C18058g getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? P.c(cls) : P.b(cls);
    }

    public List<C18063l> getParameters() {
        return getReflected().getParameters();
    }

    /* access modifiers changed from: protected */
    public C18054c getReflected() {
        C18054c compute = compute();
        if (compute != this) {
            return compute;
        }
        throw new C17605c();
    }

    public C18068q getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    public List<C18069r> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    public C18072u getVisibility() {
        return getReflected().getVisibility();
    }

    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    public boolean isFinal() {
        return getReflected().isFinal();
    }

    public boolean isOpen() {
        return getReflected().isOpen();
    }

    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    protected C17530f(Object obj) {
        this(obj, (Class) null, (String) null, (String) null, false);
    }

    protected C17530f(Object obj, Class cls, String str, String str2, boolean z10) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z10;
    }
}
