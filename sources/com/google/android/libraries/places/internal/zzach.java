package com.google.android.libraries.places.internal;

public final class zzach extends zzago implements zzahx {
    /* access modifiers changed from: private */
    public static final zzach zzb;
    private zzagw zzd = zzago.zzB();

    static {
        zzach zzach = new zzach();
        zzb = zzach;
        zzago.zzI(zzach.class, zzach);
    }

    private zzach() {
    }

    public static zzacg zza() {
        return (zzacg) zzb.zzw();
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [java.util.Collection, java.lang.Iterable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ void zzd(com.google.android.libraries.places.internal.zzach r3, java.lang.Iterable r4) {
        /*
            com.google.android.libraries.places.internal.zzagw r0 = r3.zzd
            boolean r1 = r0.zzc()
            if (r1 != 0) goto L_0x000e
            com.google.android.libraries.places.internal.zzagw r0 = com.google.android.libraries.places.internal.zzago.zzC(r0)
            r3.zzd = r0
        L_0x000e:
            com.google.android.libraries.places.internal.zzagw r3 = r3.zzd
            byte[] r0 = com.google.android.libraries.places.internal.zzagx.zzd
            boolean r0 = r3 instanceof java.util.ArrayList
            if (r0 == 0) goto L_0x0025
            r0 = r3
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r1 = r3.size()
            int r2 = r4.size()
            int r1 = r1 + r2
            r0.ensureCapacity(r1)
        L_0x0025:
            int r0 = r3.size()
            java.util.Iterator r4 = r4.iterator()
        L_0x002d:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x006a
            java.lang.Object r1 = r4.next()
            if (r1 != 0) goto L_0x0066
            int r4 = r3.size()
            int r4 = r4 - r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Element at index "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = " is null."
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            int r1 = r3.size()
        L_0x0058:
            int r1 = r1 + -1
            if (r1 < r0) goto L_0x0060
            r3.remove(r1)
            goto L_0x0058
        L_0x0060:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            r3.<init>(r4)
            throw r3
        L_0x0066:
            r3.add(r1)
            goto L_0x002d
        L_0x006a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzach.zzd(com.google.android.libraries.places.internal.zzach, java.lang.Iterable):void");
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzago.zzF(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"zzd"});
        } else if (i11 == 3) {
            return new zzach();
        } else {
            if (i11 == 4) {
                return new zzacg((zzyp) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
