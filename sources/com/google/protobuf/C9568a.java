package com.google.protobuf;

import com.google.protobuf.C9568a;
import com.google.protobuf.C9568a.C1192a;
import com.google.protobuf.C9575h;
import com.google.protobuf.S;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.google.protobuf.a  reason: case insensitive filesystem */
public abstract class C9568a<MessageType extends C9568a<MessageType, BuilderType>, BuilderType extends C1192a<MessageType, BuilderType>> implements S {
    protected int memoizedHashCode = 0;

    /* renamed from: com.google.protobuf.a$a  reason: collision with other inner class name */
    public static abstract class C1192a<MessageType extends C9568a<MessageType, BuilderType>, BuilderType extends C1192a<MessageType, BuilderType>> implements S.a {
        protected static <T> void j(Iterable<T> iterable, List<? super T> list) {
            C9592z.a(iterable);
            if (iterable instanceof G) {
                List<?> l10 = ((G) iterable).l();
                G g10 = (G) list;
                int size = list.size();
                for (Object next : l10) {
                    if (next == null) {
                        String str = "Element at index " + (g10.size() - size) + " is null.";
                        for (int size2 = g10.size() - 1; size2 >= size; size2--) {
                            g10.remove(size2);
                        }
                        throw new NullPointerException(str);
                    } else if (next instanceof C9575h) {
                        g10.f0((C9575h) next);
                    } else {
                        g10.add((String) next);
                    }
                }
            } else if (iterable instanceof b0) {
                list.addAll((Collection) iterable);
            } else {
                k(iterable, list);
            }
        }

        private static <T> void k(Iterable<T> iterable, List<? super T> list) {
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

        protected static n0 n(S s10) {
            return new n0(s10);
        }

        /* access modifiers changed from: protected */
        public abstract BuilderType l(MessageType messagetype);

        /* renamed from: m */
        public BuilderType S0(S s10) {
            if (getDefaultInstanceForType().getClass().isInstance(s10)) {
                return l((C9568a) s10);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
    }

    protected static <T> void addAll(Iterable<T> iterable, List<? super T> list) {
        C1192a.j(iterable, list);
    }

    private String getSerializingExceptionMessage(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    /* access modifiers changed from: package-private */
    public int getMemoizedSerializedSize() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public int getSerializedSize(h0 h0Var) {
        int memoizedSerializedSize = getMemoizedSerializedSize();
        if (memoizedSerializedSize != -1) {
            return memoizedSerializedSize;
        }
        int h10 = h0Var.h(this);
        setMemoizedSerializedSize(h10);
        return h10;
    }

    /* access modifiers changed from: package-private */
    public n0 newUninitializedMessageException() {
        return new n0(this);
    }

    /* access modifiers changed from: package-private */
    public void setMemoizedSerializedSize(int i10) {
        throw new UnsupportedOperationException();
    }

    public byte[] toByteArray() {
        try {
            byte[] bArr = new byte[getSerializedSize()];
            C9578k c02 = C9578k.c0(bArr);
            writeTo(c02);
            c02.c();
            return bArr;
        } catch (IOException e10) {
            throw new RuntimeException(getSerializingExceptionMessage("byte array"), e10);
        }
    }

    public C9575h toByteString() {
        try {
            C9575h.C1193h x10 = C9575h.x(getSerializedSize());
            writeTo(x10.b());
            return x10.a();
        } catch (IOException e10) {
            throw new RuntimeException(getSerializingExceptionMessage("ByteString"), e10);
        }
    }
}
