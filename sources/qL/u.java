package QL;

import android.annotation.TargetApi;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

class u {

    @TargetApi(24)
    @IgnoreJRERequirement
    static final class a extends u {
        a() {
        }

        /* access modifiers changed from: package-private */
        public Object b(Method method, Class<?> cls, Object obj, Object[] objArr) {
            return l.a(method, cls, obj, objArr);
        }

        /* access modifiers changed from: package-private */
        public boolean c(Method method) {
            return method.isDefault();
        }
    }

    @IgnoreJRERequirement
    static class b extends u {
        b() {
        }

        /* access modifiers changed from: package-private */
        public String a(Method method, int i10) {
            Parameter parameter = method.getParameters()[i10];
            if (!parameter.isNamePresent()) {
                return u.super.a(method, i10);
            }
            return "parameter '" + parameter.getName() + '\'';
        }

        /* access modifiers changed from: package-private */
        public Object b(Method method, Class<?> cls, Object obj, Object[] objArr) {
            return l.a(method, cls, obj, objArr);
        }

        /* access modifiers changed from: package-private */
        public boolean c(Method method) {
            return method.isDefault();
        }
    }

    u() {
    }

    /* access modifiers changed from: package-private */
    public String a(Method method, int i10) {
        return "parameter #" + (i10 + 1);
    }

    /* access modifiers changed from: package-private */
    public Object b(Method method, Class<?> cls, Object obj, Object[] objArr) {
        throw new AssertionError();
    }

    /* access modifiers changed from: package-private */
    public boolean c(Method method) {
        return false;
    }
}
