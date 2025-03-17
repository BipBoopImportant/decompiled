package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.internal.zzagl;
import com.google.android.libraries.places.internal.zzago;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class zzago<MessageType extends zzago<MessageType, BuilderType>, BuilderType extends zzagl<MessageType, BuilderType>> extends zzafg<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    protected zzaiz zzc = zzaiz.zzc();
    private int zzd = -1;

    protected static zzagv zzA() {
        return zzahl.zze();
    }

    protected static zzagw zzB() {
        return zzaif.zzd();
    }

    protected static zzagw zzC(zzagw zzagw) {
        int size = zzagw.size();
        return zzagw.zzf(size == 0 ? 10 : size + size);
    }

    static Object zzE(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    protected static Object zzF(zzahw zzahw, String str, Object[] objArr) {
        return new zzaig(zzahw, str, objArr);
    }

    protected static void zzI(Class cls, zzago zzago) {
        zzago.zzH();
        zzb.put(cls, zzago);
    }

    private final int zza(zzaih zzaih) {
        if (zzaih != null) {
            return zzaih.zza(this);
        }
        return zzaie.zza().zzb(getClass()).zza(this);
    }

    static zzago zzx(Class cls) {
        Map map = zzb;
        zzago zzago = (zzago) map.get(cls);
        if (zzago == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzago = (zzago) map.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (zzago == null) {
            zzago = (zzago) ((zzago) zzaji.zze(cls)).zzb(6, (Object) null, (Object) null);
            if (zzago != null) {
                map.put(cls, zzago);
            } else {
                throw new IllegalStateException();
            }
        }
        return zzago;
    }

    protected static zzagt zzz() {
        return zzagp.zze();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzaie.zza().zzb(getClass()).zzg(this, (zzago) obj);
    }

    public final int hashCode() {
        if (zzL()) {
            return zzu();
        }
        int i10 = this.zza;
        if (i10 != 0) {
            return i10;
        }
        int zzu = zzu();
        this.zza = zzu;
        return zzu;
    }

    public final String toString() {
        return zzahy.zza(this, super.toString());
    }

    public final /* synthetic */ zzahv zzD() {
        return (zzagl) zzb(5, (Object) null, (Object) null);
    }

    /* access modifiers changed from: protected */
    public final void zzG() {
        zzaie.zza().zzb(getClass()).zzd(this);
        zzH();
    }

    /* access modifiers changed from: package-private */
    public final void zzH() {
        this.zzd &= Integer.MAX_VALUE;
    }

    /* access modifiers changed from: package-private */
    public final void zzJ(int i10) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final void zzK(zzagb zzagb) {
        zzaie.zza().zzb(getClass()).zzf(this, zzagc.zza(zzagb));
    }

    /* access modifiers changed from: package-private */
    public final boolean zzL() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    /* access modifiers changed from: protected */
    public abstract Object zzb(int i10, Object obj, Object obj2);

    /* access modifiers changed from: package-private */
    public final int zzr(zzaih zzaih) {
        if (zzL()) {
            int zza = zza(zzaih);
            if (zza >= 0) {
                return zza;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + zza);
        }
        int i10 = this.zzd & Integer.MAX_VALUE;
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int zza2 = zza(zzaih);
        if (zza2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | zza2;
            return zza2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + zza2);
    }

    public final /* synthetic */ zzahw zzt() {
        return (zzago) zzb(6, (Object) null, (Object) null);
    }

    /* access modifiers changed from: package-private */
    public final int zzu() {
        return zzaie.zza().zzb(getClass()).zzb(this);
    }

    public final int zzv() {
        int i10;
        if (zzL()) {
            i10 = zza((zzaih) null);
            if (i10 < 0) {
                throw new IllegalStateException("serialized size must be non-negative, was " + i10);
            }
        } else {
            i10 = this.zzd & Integer.MAX_VALUE;
            if (i10 == Integer.MAX_VALUE) {
                i10 = zza((zzaih) null);
                if (i10 >= 0) {
                    this.zzd = (this.zzd & Integer.MIN_VALUE) | i10;
                } else {
                    throw new IllegalStateException("serialized size must be non-negative, was " + i10);
                }
            }
        }
        return i10;
    }

    /* access modifiers changed from: protected */
    public final zzagl zzw() {
        return (zzagl) zzb(5, (Object) null, (Object) null);
    }

    /* access modifiers changed from: package-private */
    public final zzago zzy() {
        return (zzago) zzb(4, (Object) null, (Object) null);
    }
}
