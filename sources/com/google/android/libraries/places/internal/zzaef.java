package com.google.android.libraries.places.internal;

public final class zzaef extends zzago implements zzahx {
    /* access modifiers changed from: private */
    public static final zzaef zzb;
    private zzagw zzd = zzago.zzB();

    static {
        zzaef zzaef = new zzaef();
        zzb = zzaef;
        zzago.zzI(zzaef.class, zzaef);
    }

    private zzaef() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzago.zzF(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", zzaeq.class});
        } else if (i11 == 3) {
            return new zzaef();
        } else {
            if (i11 == 4) {
                return new zzaee((zzaed) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
