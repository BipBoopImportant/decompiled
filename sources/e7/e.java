package E7;

import C7.d;
import C7.i;
import G7.a;
import java.io.File;

class e<DataType> implements a.b {

    /* renamed from: a  reason: collision with root package name */
    private final d<DataType> f35038a;

    /* renamed from: b  reason: collision with root package name */
    private final DataType f35039b;

    /* renamed from: c  reason: collision with root package name */
    private final i f35040c;

    e(d<DataType> dVar, DataType datatype, i iVar) {
        this.f35038a = dVar;
        this.f35039b = datatype;
        this.f35040c = iVar;
    }

    public boolean a(File file) {
        return this.f35038a.b(this.f35039b, file, this.f35040c);
    }
}
