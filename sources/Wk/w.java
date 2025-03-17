package WK;

import YH.C16877v;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u000b*\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0015\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010!\u001a\u00020 2\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0006H\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010#\u001a\u00020 2\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0006H\u0016¢\u0006\u0004\b#\u0010\"J\u001f\u0010$\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0006H\u0016¢\u0006\u0004\b$\u0010%J\u001f\u0010(\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u0004H\u0016¢\u0006\u0004\b(\u0010)J\u001f\u0010*\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0006H\u0016¢\u0006\u0004\b*\u0010%J\u000f\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b,\u0010-¨\u0006."}, d2 = {"LWK/w;", "LWK/l;", "<init>", "()V", "LWK/E;", "dir", "", "throwOnFailure", "", "F", "(LWK/E;Z)Ljava/util/List;", "LXH/N;", "N", "(LWK/E;)V", "J", "path", "LWK/k;", "t", "(LWK/E;)LWK/k;", "q", "(LWK/E;)Ljava/util/List;", "file", "LWK/j;", "u", "(LWK/E;)LWK/j;", "mustCreate", "mustExist", "w", "(LWK/E;ZZ)LWK/j;", "LWK/N;", "B", "(LWK/E;)LWK/N;", "LWK/L;", "z", "(LWK/E;Z)LWK/L;", "d", "h", "(LWK/E;Z)V", "source", "target", "e", "(LWK/E;LWK/E;)V", "n", "", "toString", "()Ljava/lang/String;", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class w extends C16777l {
    private final List<C16762E> F(C16762E e10, boolean z10) {
        File I10 = e10.I();
        String[] list = I10.list();
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                C17542s.g(str);
                arrayList.add(e10.G(str));
            }
            C16877v.B(arrayList);
            return arrayList;
        } else if (!z10) {
            return null;
        } else {
            if (!I10.exists()) {
                throw new FileNotFoundException("no such file: " + e10);
            }
            throw new IOException("failed to list " + e10);
        }
    }

    private final void J(C16762E e10) {
        if (o(e10)) {
            throw new IOException(e10 + " already exists.");
        }
    }

    private final void N(C16762E e10) {
        if (!o(e10)) {
            throw new IOException(e10 + " doesn't exist.");
        }
    }

    public N B(C16762E e10) {
        C17542s.j(e10, "file");
        return y.k(e10.I());
    }

    public L d(C16762E e10, boolean z10) {
        C17542s.j(e10, "file");
        if (z10) {
            N(e10);
        }
        return y.g(e10.I(), true);
    }

    public void e(C16762E e10, C16762E e11) {
        C17542s.j(e10, "source");
        C17542s.j(e11, "target");
        if (!e10.I().renameTo(e11.I())) {
            throw new IOException("failed to move " + e10 + " to " + e11);
        }
    }

    public void h(C16762E e10, boolean z10) {
        C17542s.j(e10, "dir");
        if (!e10.I().mkdir()) {
            C16776k t10 = t(e10);
            if (t10 == null || !t10.f()) {
                throw new IOException("failed to create directory: " + e10);
            } else if (z10) {
                throw new IOException(e10 + " already exists.");
            }
        }
    }

    public void n(C16762E e10, boolean z10) {
        C17542s.j(e10, "path");
        if (!Thread.interrupted()) {
            File I10 = e10.I();
            if (I10.delete()) {
                return;
            }
            if (I10.exists()) {
                throw new IOException("failed to delete " + e10);
            } else if (z10) {
                throw new FileNotFoundException("no such file: " + e10);
            }
        } else {
            throw new InterruptedIOException("interrupted");
        }
    }

    public List<C16762E> q(C16762E e10) {
        C17542s.j(e10, "dir");
        List<C16762E> F10 = F(e10, true);
        C17542s.g(F10);
        return F10;
    }

    public C16776k t(C16762E e10) {
        C17542s.j(e10, "path");
        File I10 = e10.I();
        boolean isFile = I10.isFile();
        boolean isDirectory = I10.isDirectory();
        long lastModified = I10.lastModified();
        long length = I10.length();
        if (!isFile && !isDirectory && lastModified == 0 && length == 0 && !I10.exists()) {
            return null;
        }
        return new C16776k(isFile, isDirectory, (C16762E) null, Long.valueOf(length), (Long) null, Long.valueOf(lastModified), (Long) null, (Map) null, 128, (DefaultConstructorMarker) null);
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }

    public C16775j u(C16762E e10) {
        C17542s.j(e10, "file");
        return new v(false, new RandomAccessFile(e10.I(), "r"));
    }

    public C16775j w(C16762E e10, boolean z10, boolean z11) {
        C17542s.j(e10, "file");
        if (!z10 || !z11) {
            if (z10) {
                J(e10);
            }
            if (z11) {
                N(e10);
            }
            return new v(true, new RandomAccessFile(e10.I(), "rw"));
        }
        throw new IllegalArgumentException("Cannot require mustCreate and mustExist at the same time.");
    }

    public L z(C16762E e10, boolean z10) {
        C17542s.j(e10, "file");
        if (z10) {
            J(e10);
        }
        return z.g(e10.I(), false, 1, (Object) null);
    }
}
