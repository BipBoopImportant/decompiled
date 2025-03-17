package CE;

import DE.C12750e;
import DE.h;
import GE.C12939d;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* renamed from: CE.e  reason: case insensitive filesystem */
public class C12698e implements C12697d {

    /* renamed from: c  reason: collision with root package name */
    private static final Logger f108409c = LoggerFactory.getLogger((Class<?>) C12698e.class);

    /* renamed from: a  reason: collision with root package name */
    private final C12696c f108410a;

    /* renamed from: b  reason: collision with root package name */
    private final C12939d f108411b;

    public C12698e(C12696c cVar, C12939d dVar) {
        this.f108410a = cVar;
        this.f108411b = dVar;
    }

    public void c(h hVar) {
        C12699f b10 = C12750e.b(hVar);
        C12939d dVar = this.f108411b;
        if (dVar != null) {
            dVar.c(b10);
        }
        try {
            this.f108410a.a(b10);
        } catch (Exception e10) {
            f108409c.error("Error dispatching event: {}", (Object) b10, (Object) e10);
        }
    }
}
