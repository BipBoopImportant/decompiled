package oz;

import TJ.C16532g;
import XH.C16807N;
import com.ingka.ikea.scanandgo.datalayer.model.ScanAndGoSettings;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import mz.C14835a;
import nz.C14866a;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH@¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\nH@¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00128\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0013\u001a\u0004\b\u0010\u0010\u0014¨\u0006\u0015"}, d2 = {"Loz/a;", "", "Lmz/a;", "settingsDataStore", "Lnz/a;", "settingsDataSourceMapper", "<init>", "(Lmz/a;Lnz/a;)V", "Lcom/ingka/ikea/scanandgo/datalayer/model/ScanAndGoSettings;", "settings", "LXH/N;", "c", "(Lcom/ingka/ikea/scanandgo/datalayer/model/ScanAndGoSettings;LdI/e;)Ljava/lang/Object;", "a", "(LdI/e;)Ljava/lang/Object;", "Lmz/a;", "b", "Lnz/a;", "LTJ/g;", "LTJ/g;", "()LTJ/g;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: oz.a  reason: case insensitive filesystem */
public final class C14902a {

    /* renamed from: a  reason: collision with root package name */
    private final C14835a f130174a;

    /* renamed from: b  reason: collision with root package name */
    private final C14866a f130175b;

    /* renamed from: c  reason: collision with root package name */
    private final C16532g<ScanAndGoSettings> f130176c;

    public C14902a(C14835a aVar, C14866a aVar2) {
        C17542s.j(aVar, "settingsDataStore");
        C17542s.j(aVar2, "settingsDataSourceMapper");
        this.f130174a = aVar;
        this.f130175b = aVar2;
        this.f130176c = aVar.b();
    }

    public final Object a(C17164e<? super C16807N> eVar) {
        Object c10 = this.f130174a.c(eVar);
        return c10 == C17187b.f() ? c10 : C16807N.f139792a;
    }

    public final C16532g<ScanAndGoSettings> b() {
        return this.f130176c;
    }

    public final Object c(ScanAndGoSettings scanAndGoSettings, C17164e<? super C16807N> eVar) {
        Object a10 = this.f130174a.a(this.f130175b.a(scanAndGoSettings), eVar);
        return a10 == C17187b.f() ? a10 : C16807N.f139792a;
    }
}
