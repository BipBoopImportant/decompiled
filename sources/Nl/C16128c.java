package NL;

import java.util.Map;
import java.util.function.Consumer;

/* renamed from: NL.c  reason: case insensitive filesystem */
public final /* synthetic */ class C16128c implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f136648a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Map f136649b;

    public /* synthetic */ C16128c(e eVar, Map map) {
        this.f136648a = eVar;
        this.f136649b = map;
    }

    public final void accept(Object obj) {
        this.f136648a.m(this.f136649b, (g) obj);
    }
}
