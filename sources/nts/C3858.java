package nts;

import java.io.Serializable;
import java.security.spec.AlgorithmParameterSpec;

/* renamed from: nts.Ꮀ  reason: contains not printable characters */
public class C3858 implements AlgorithmParameterSpec, Serializable {

    /* renamed from: ഇ  reason: contains not printable characters */
    public int f1666;

    public C3858(int i10) {
        if (i10 == 3 || i10 == 4 || i10 == 5 || i10 == 6) {
            this.f1666 = i10;
            return;
        }
        throw new C3625(280, C3695.m880(21031, 24, 36));
    }
}
