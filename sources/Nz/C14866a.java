package nz;

import com.ingka.ikea.scanandgo.datalayer.model.ScanAndGoSettings;
import com.ingka.ikea.scanandgo.datalayer.model.UpptackaSettings;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import rz.N;
import ug.k;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\r\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000f¨\u0006\u0010"}, d2 = {"Lnz/a;", "", "Lug/k;", "labsFeatures", "<init>", "(Lug/k;)V", "", "settingsValue", "labsFeatureValue", "b", "(ZZ)Z", "Lcom/ingka/ikea/scanandgo/datalayer/model/ScanAndGoSettings;", "settings", "a", "(Lcom/ingka/ikea/scanandgo/datalayer/model/ScanAndGoSettings;)Lcom/ingka/ikea/scanandgo/datalayer/model/ScanAndGoSettings;", "Lug/k;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: nz.a  reason: case insensitive filesystem */
public final class C14866a {

    /* renamed from: a  reason: collision with root package name */
    private final k f129966a;

    public C14866a(k kVar) {
        C17542s.j(kVar, "labsFeatures");
        this.f129966a = kVar;
    }

    private final boolean b(boolean z10, boolean z11) {
        return (z10 && z11) || z11;
    }

    public final ScanAndGoSettings a(ScanAndGoSettings scanAndGoSettings) {
        if (scanAndGoSettings == null) {
            return null;
        }
        return ScanAndGoSettings.c(scanAndGoSettings, (String) null, (List) null, (N) null, (String) null, (Long) null, false, (UpptackaSettings) null, false, false, false, false, b(scanAndGoSettings.d(), this.f129966a.g()), false, false, false, false, 63487, (Object) null);
    }
}
