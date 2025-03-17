package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.internal.zzagl;
import com.google.android.libraries.places.internal.zzago;

public class zzagl<MessageType extends zzago<MessageType, BuilderType>, BuilderType extends zzagl<MessageType, BuilderType>> extends zzaff<MessageType, BuilderType> {
    protected zzago zza;
    private final zzago zzb;

    protected zzagl(MessageType messagetype) {
        this.zzb = messagetype;
        if (!messagetype.zzL()) {
            this.zza = messagetype.zzy();
            return;
        }
        throw new IllegalArgumentException("Default instance must be immutable.");
    }

    /* renamed from: zzp */
    public final zzagl zzo() {
        zzagl zzagl = (zzagl) this.zzb.zzb(5, (Object) null, (Object) null);
        zzagl.zza = zzs();
        return zzagl;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002e, code lost:
        if (r3 != false) goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final MessageType zzq() {
        /*
            r5 = this;
            com.google.android.libraries.places.internal.zzago r0 = r5.zzs()
            r1 = 1
            r2 = 0
            java.lang.Object r3 = r0.zzb(r1, r2, r2)
            java.lang.Byte r3 = (java.lang.Byte) r3
            byte r3 = r3.byteValue()
            if (r3 != r1) goto L_0x0013
            goto L_0x0030
        L_0x0013:
            if (r3 == 0) goto L_0x0031
            com.google.android.libraries.places.internal.zzaie r3 = com.google.android.libraries.places.internal.zzaie.zza()
            java.lang.Class r4 = r0.getClass()
            com.google.android.libraries.places.internal.zzaih r3 = r3.zzb(r4)
            boolean r3 = r3.zzh(r0)
            if (r1 == r3) goto L_0x0029
            r1 = r2
            goto L_0x002a
        L_0x0029:
            r1 = r0
        L_0x002a:
            r4 = 2
            r0.zzb(r4, r1, r2)
            if (r3 == 0) goto L_0x0031
        L_0x0030:
            return r0
        L_0x0031:
            com.google.android.libraries.places.internal.zzaix r1 = new com.google.android.libraries.places.internal.zzaix
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzagl.zzq():com.google.android.libraries.places.internal.zzago");
    }

    /* renamed from: zzr */
    public MessageType zzs() {
        if (!this.zza.zzL()) {
            return this.zza;
        }
        this.zza.zzG();
        return this.zza;
    }

    public final /* bridge */ /* synthetic */ zzahw zzt() {
        throw null;
    }

    /* access modifiers changed from: protected */
    public final void zzu() {
        if (!this.zza.zzL()) {
            zzv();
        }
    }

    /* access modifiers changed from: protected */
    public void zzv() {
        zzago zzy = this.zzb.zzy();
        zzaie.zza().zzb(zzy.getClass()).zze(zzy, this.zza);
        this.zza = zzy;
    }
}
