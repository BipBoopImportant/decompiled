package G6;

import C6.a;
import C6.b;
import H6.c;
import w6.C8927i;

/* renamed from: G6.k  reason: case insensitive filesystem */
public class C6516k {

    /* renamed from: f  reason: collision with root package name */
    private static final c.a f36195f = c.a.a("ef");

    /* renamed from: g  reason: collision with root package name */
    private static final c.a f36196g = c.a.a("nm", "v");

    /* renamed from: a  reason: collision with root package name */
    private a f36197a;

    /* renamed from: b  reason: collision with root package name */
    private b f36198b;

    /* renamed from: c  reason: collision with root package name */
    private b f36199c;

    /* renamed from: d  reason: collision with root package name */
    private b f36200d;

    /* renamed from: e  reason: collision with root package name */
    private b f36201e;

    private void a(c cVar, C8927i iVar) {
        cVar.e();
        String str = "";
        while (cVar.hasNext()) {
            int n10 = cVar.n(f36196g);
            if (n10 != 0) {
                if (n10 == 1) {
                    str.hashCode();
                    char c10 = 65535;
                    switch (str.hashCode()) {
                        case 353103893:
                            if (str.equals("Distance")) {
                                c10 = 0;
                                break;
                            }
                            break;
                        case 397447147:
                            if (str.equals("Opacity")) {
                                c10 = 1;
                                break;
                            }
                            break;
                        case 1041377119:
                            if (str.equals("Direction")) {
                                c10 = 2;
                                break;
                            }
                            break;
                        case 1379387491:
                            if (str.equals("Shadow Color")) {
                                c10 = 3;
                                break;
                            }
                            break;
                        case 1383710113:
                            if (str.equals("Softness")) {
                                c10 = 4;
                                break;
                            }
                            break;
                    }
                    switch (c10) {
                        case 0:
                            this.f36200d = C6509d.e(cVar, iVar);
                            break;
                        case 1:
                            this.f36198b = C6509d.f(cVar, iVar, false);
                            break;
                        case 2:
                            this.f36199c = C6509d.f(cVar, iVar, false);
                            break;
                        case 3:
                            this.f36197a = C6509d.c(cVar, iVar);
                            break;
                        case 4:
                            this.f36201e = C6509d.e(cVar, iVar);
                            break;
                        default:
                            cVar.a0();
                            break;
                    }
                } else {
                    cVar.o();
                    cVar.a0();
                }
            } else {
                str = cVar.C1();
            }
        }
        cVar.g();
    }

    /* access modifiers changed from: package-private */
    public C6515j b(c cVar, C8927i iVar) {
        b bVar;
        b bVar2;
        b bVar3;
        b bVar4;
        while (cVar.hasNext()) {
            if (cVar.n(f36195f) != 0) {
                cVar.o();
                cVar.a0();
            } else {
                cVar.d();
                while (cVar.hasNext()) {
                    a(cVar, iVar);
                }
                cVar.f();
            }
        }
        a aVar = this.f36197a;
        if (aVar == null || (bVar = this.f36198b) == null || (bVar2 = this.f36199c) == null || (bVar3 = this.f36200d) == null || (bVar4 = this.f36201e) == null) {
            return null;
        }
        return new C6515j(aVar, bVar, bVar2, bVar3, bVar4);
    }
}
