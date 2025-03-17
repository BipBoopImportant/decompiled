package eJ;

import eJ.C17206q;
import java.io.FilterInputStream;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: eJ.a  reason: case insensitive filesystem */
public abstract class C17190a implements C17206q {

    /* renamed from: a  reason: collision with root package name */
    protected int f143006a = 0;

    /* access modifiers changed from: package-private */
    public C17212w b() {
        return new C17212w(this);
    }

    public void c(OutputStream outputStream) {
        int serializedSize = getSerializedSize();
        C17195f J10 = C17195f.J(outputStream, C17195f.u(C17195f.v(serializedSize) + serializedSize));
        J10.o0(serializedSize);
        a(J10);
        J10.I();
    }

    /* renamed from: eJ.a$a  reason: collision with other inner class name */
    public static abstract class C3485a<BuilderType extends C3485a> implements C17206q.a {
        protected static C17212w c(C17206q qVar) {
            return new C17212w(qVar);
        }

        /* renamed from: b */
        public abstract BuilderType o1(C17194e eVar, C17196g gVar);

        /* renamed from: eJ.a$a$a  reason: collision with other inner class name */
        static final class C3486a extends FilterInputStream {

            /* renamed from: a  reason: collision with root package name */
            private int f143007a;

            C3486a(InputStream inputStream, int i10) {
                super(inputStream);
                this.f143007a = i10;
            }

            public int available() {
                return Math.min(super.available(), this.f143007a);
            }

            public int read() {
                if (this.f143007a <= 0) {
                    return -1;
                }
                int read = super.read();
                if (read >= 0) {
                    this.f143007a--;
                }
                return read;
            }

            public long skip(long j10) {
                long skip = super.skip(Math.min(j10, (long) this.f143007a));
                if (skip >= 0) {
                    this.f143007a = (int) (((long) this.f143007a) - skip);
                }
                return skip;
            }

            public int read(byte[] bArr, int i10, int i11) {
                int i12 = this.f143007a;
                if (i12 <= 0) {
                    return -1;
                }
                int read = super.read(bArr, i10, Math.min(i11, i12));
                if (read >= 0) {
                    this.f143007a -= read;
                }
                return read;
            }
        }
    }
}
