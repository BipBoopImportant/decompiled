package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C5148a;
import androidx.datastore.preferences.protobuf.C5148a.C0330a;
import androidx.datastore.preferences.protobuf.C5154g;
import androidx.datastore.preferences.protobuf.S;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: androidx.datastore.preferences.protobuf.a  reason: case insensitive filesystem */
public abstract class C5148a<MessageType extends C5148a<MessageType, BuilderType>, BuilderType extends C0330a<MessageType, BuilderType>> implements S {
    protected int memoizedHashCode = 0;

    /* renamed from: androidx.datastore.preferences.protobuf.a$a  reason: collision with other inner class name */
    public static abstract class C0330a<MessageType extends C5148a<MessageType, BuilderType>, BuilderType extends C0330a<MessageType, BuilderType>> implements S.a {
        protected static <T> void b(Iterable<T> iterable, List<? super T> list) {
            C5172z.a(iterable);
            if (iterable instanceof E) {
                List<?> l10 = ((E) iterable).l();
                E e10 = (E) list;
                int size = list.size();
                for (Object next : l10) {
                    if (next == null) {
                        String str = "Element at index " + (e10.size() - size) + " is null.";
                        for (int size2 = e10.size() - 1; size2 >= size; size2--) {
                            e10.remove(size2);
                        }
                        throw new NullPointerException(str);
                    } else if (next instanceof C5154g) {
                        e10.e2((C5154g) next);
                    } else if (next instanceof byte[]) {
                        e10.e2(C5154g.m((byte[]) next));
                    } else {
                        e10.add((String) next);
                    }
                }
            } else if (iterable instanceof b0) {
                list.addAll((Collection) iterable);
            } else {
                c(iterable, list);
            }
        }

        private static <T> void c(Iterable<T> iterable, List<? super T> list) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size = list.size();
            for (T next : iterable) {
                if (next == null) {
                    String str = "Element at index " + (list.size() - size) + " is null.";
                    for (int size2 = list.size() - 1; size2 >= size; size2--) {
                        list.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                list.add(next);
            }
        }

        protected static n0 f(S s10) {
            return new n0(s10);
        }

        /* access modifiers changed from: protected */
        public abstract BuilderType d(MessageType messagetype);

        /* renamed from: e */
        public BuilderType U(S s10) {
            if (getDefaultInstanceForType().getClass().isInstance(s10)) {
                return d((C5148a) s10);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
    }

    protected static <T> void b(Iterable<T> iterable, List<? super T> list) {
        C0330a.b(iterable, list);
    }

    private String e(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    /* access modifiers changed from: package-private */
    public int c() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public int d(h0 h0Var) {
        int c10 = c();
        if (c10 != -1) {
            return c10;
        }
        int h10 = h0Var.h(this);
        h(h10);
        return h10;
    }

    /* access modifiers changed from: package-private */
    public n0 f() {
        return new n0(this);
    }

    /* access modifiers changed from: package-private */
    public void h(int i10) {
        throw new UnsupportedOperationException();
    }

    public void i(OutputStream outputStream) {
        C5157j e02 = C5157j.e0(outputStream, C5157j.I(getSerializedSize()));
        a(e02);
        e02.b0();
    }

    public C5154g toByteString() {
        try {
            C5154g.h x10 = C5154g.x(getSerializedSize());
            a(x10.b());
            return x10.a();
        } catch (IOException e10) {
            throw new RuntimeException(e("ByteString"), e10);
        }
    }
}
