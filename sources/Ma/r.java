package ma;

import Ba.C6384h;
import Ba.C6385i;
import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.MaskedWallet;

public interface r extends IInterface {
    void A0(Status status, C6385i iVar, Bundle bundle);

    void Q1(Status status, boolean z10, Bundle bundle);

    void T(int i10, boolean z10, Bundle bundle);

    void V0(int i10, Bundle bundle);

    void c2(Status status, C6384h hVar, Bundle bundle);

    void s0(int i10, MaskedWallet maskedWallet, Bundle bundle);

    void w3(int i10, FullWallet fullWallet, Bundle bundle);
}
