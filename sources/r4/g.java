package R4;

import Q4.i;
import android.database.sqlite.SQLiteProgram;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0007\b\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"LR4/g;", "LQ4/i;", "Landroid/database/sqlite/SQLiteProgram;", "delegate", "<init>", "(Landroid/database/sqlite/SQLiteProgram;)V", "", "index", "LXH/N;", "I2", "(I)V", "", "value", "i2", "(IJ)V", "", "g0", "(ID)V", "", "H", "(ILjava/lang/String;)V", "", "o2", "(I[B)V", "close", "()V", "a", "Landroid/database/sqlite/SQLiteProgram;", "sqlite-framework_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class g implements i {

    /* renamed from: a  reason: collision with root package name */
    private final SQLiteProgram f39679a;

    public g(SQLiteProgram sQLiteProgram) {
        C17542s.j(sQLiteProgram, "delegate");
        this.f39679a = sQLiteProgram;
    }

    public void H(int i10, String str) {
        C17542s.j(str, "value");
        this.f39679a.bindString(i10, str);
    }

    public void I2(int i10) {
        this.f39679a.bindNull(i10);
    }

    public void close() {
        this.f39679a.close();
    }

    public void g0(int i10, double d10) {
        this.f39679a.bindDouble(i10, d10);
    }

    public void i2(int i10, long j10) {
        this.f39679a.bindLong(i10, j10);
    }

    public void o2(int i10, byte[] bArr) {
        C17542s.j(bArr, "value");
        this.f39679a.bindBlob(i10, bArr);
    }
}
