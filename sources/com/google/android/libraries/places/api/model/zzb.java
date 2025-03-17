package com.google.android.libraries.places.api.model;

import java.util.List;

abstract class zzb extends AddressComponent {
    private final String zza;
    private final String zzb;
    private final List zzc;

    zzb(String str, String str2, List list) {
        if (str != null) {
            this.zza = str;
            this.zzb = str2;
            if (list != null) {
                this.zzc = list;
                return;
            }
            throw new NullPointerException("Null types");
        }
        throw new NullPointerException("Null name");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r1 = r4.zzb;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.libraries.places.api.model.AddressComponent
            r2 = 0
            if (r1 == 0) goto L_0x003a
            com.google.android.libraries.places.api.model.AddressComponent r5 = (com.google.android.libraries.places.api.model.AddressComponent) r5
            java.lang.String r1 = r4.zza
            java.lang.String r3 = r5.getName()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x003a
            java.lang.String r1 = r4.zzb
            if (r1 != 0) goto L_0x0022
            java.lang.String r1 = r5.getShortName()
            if (r1 != 0) goto L_0x003a
            goto L_0x002d
        L_0x0022:
            java.lang.String r3 = r5.getShortName()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x002d
            goto L_0x003a
        L_0x002d:
            java.util.List r1 = r4.zzc
            java.util.List r5 = r5.getTypes()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x003a
            return r0
        L_0x003a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.api.model.zzb.equals(java.lang.Object):boolean");
    }

    public final String getName() {
        return this.zza;
    }

    public final String getShortName() {
        return this.zzb;
    }

    public final List<String> getTypes() {
        return this.zzc;
    }

    public final int hashCode() {
        int hashCode = this.zza.hashCode() ^ 1000003;
        String str = this.zzb;
        return (((hashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.zzc.hashCode();
    }

    public final String toString() {
        String str = this.zza;
        String str2 = this.zzb;
        String obj = this.zzc.toString();
        return "AddressComponent{name=" + str + ", shortName=" + str2 + ", types=" + obj + "}";
    }
}
