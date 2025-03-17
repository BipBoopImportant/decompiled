package ha;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: ha.q6  reason: case insensitive filesystem */
public enum C8115q6 implements Q0 {
    FORMAT_UNKNOWN(0),
    FORMAT_CODE_128(1),
    FORMAT_CODE_39(2),
    FORMAT_CODE_93(4),
    FORMAT_CODABAR(8),
    FORMAT_DATA_MATRIX(16),
    FORMAT_EAN_13(32),
    FORMAT_EAN_8(64),
    FORMAT_ITF(128),
    FORMAT_QR_CODE(256),
    FORMAT_UPC_A(512),
    FORMAT_UPC_E(1024),
    FORMAT_PDF417(RecyclerView.n.FLAG_MOVED),
    FORMAT_AZTEC(RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT);
    
    private final int zzp;

    private C8115q6(int i10) {
        this.zzp = i10;
    }

    public final int zza() {
        return this.zzp;
    }
}
