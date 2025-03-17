package C3;

import C3.C6407A;
import android.media.MediaDrm;

public final /* synthetic */ class E implements MediaDrm.OnEventListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ J f33560a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C6407A.b f33561b;

    public /* synthetic */ E(J j10, C6407A.b bVar) {
        this.f33560a = j10;
        this.f33561b = bVar;
    }

    public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i10, int i11, byte[] bArr2) {
        this.f33560a.A(this.f33561b, mediaDrm, bArr, i10, i11, bArr2);
    }
}
