package com.google.gson.internal;

import Tc.c;
import com.google.gson.JsonElement;
import com.google.gson.internal.bind.TypeAdapters;
import java.io.Writer;
import java.util.Objects;

public final class n {
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001a, code lost:
        throw new com.google.gson.p((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
        throw new com.google.gson.j((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0026, code lost:
        throw new com.google.gson.p((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002d, code lost:
        return com.google.gson.k.f69184a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0033, code lost:
        throw new com.google.gson.p((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000d, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000f, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0011, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        r2 = e;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x000d A[ExcHandler: NumberFormatException (r2v6 'e' java.lang.NumberFormatException A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x000f A[ExcHandler: IOException (r2v5 'e' java.io.IOException A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0011 A[ExcHandler: d (r2v4 'e' Tc.d A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.gson.JsonElement a(Tc.a r2) {
        /*
            r2.F()     // Catch:{ EOFException -> 0x0027, d -> 0x0011, IOException -> 0x000f, NumberFormatException -> 0x000d }
            r0 = 0
            com.google.gson.TypeAdapter<com.google.gson.JsonElement> r1 = com.google.gson.internal.bind.TypeAdapters.f69047V     // Catch:{ EOFException -> 0x0013, d -> 0x0011, IOException -> 0x000f, NumberFormatException -> 0x000d }
            java.lang.Object r2 = r1.read(r2)     // Catch:{ EOFException -> 0x0013, d -> 0x0011, IOException -> 0x000f, NumberFormatException -> 0x000d }
            com.google.gson.JsonElement r2 = (com.google.gson.JsonElement) r2     // Catch:{ EOFException -> 0x0013, d -> 0x0011, IOException -> 0x000f, NumberFormatException -> 0x000d }
            return r2
        L_0x000d:
            r2 = move-exception
            goto L_0x0015
        L_0x000f:
            r2 = move-exception
            goto L_0x001b
        L_0x0011:
            r2 = move-exception
            goto L_0x0021
        L_0x0013:
            r2 = move-exception
            goto L_0x0029
        L_0x0015:
            com.google.gson.p r0 = new com.google.gson.p
            r0.<init>((java.lang.Throwable) r2)
            throw r0
        L_0x001b:
            com.google.gson.j r0 = new com.google.gson.j
            r0.<init>((java.lang.Throwable) r2)
            throw r0
        L_0x0021:
            com.google.gson.p r0 = new com.google.gson.p
            r0.<init>((java.lang.Throwable) r2)
            throw r0
        L_0x0027:
            r2 = move-exception
            r0 = 1
        L_0x0029:
            if (r0 == 0) goto L_0x002e
            com.google.gson.k r2 = com.google.gson.k.f69184a
            return r2
        L_0x002e:
            com.google.gson.p r0 = new com.google.gson.p
            r0.<init>((java.lang.Throwable) r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.n.a(Tc.a):com.google.gson.JsonElement");
    }

    public static void b(JsonElement jsonElement, c cVar) {
        TypeAdapters.f69047V.write(cVar, jsonElement);
    }

    public static Writer c(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new b(appendable);
    }

    private static final class b extends Writer {

        /* renamed from: a  reason: collision with root package name */
        private final Appendable f69162a;

        /* renamed from: b  reason: collision with root package name */
        private final a f69163b = new a();

        private static class a implements CharSequence {

            /* renamed from: a  reason: collision with root package name */
            private char[] f69164a;

            /* renamed from: b  reason: collision with root package name */
            private String f69165b;

            private a() {
            }

            /* access modifiers changed from: package-private */
            public void a(char[] cArr) {
                this.f69164a = cArr;
                this.f69165b = null;
            }

            public char charAt(int i10) {
                return this.f69164a[i10];
            }

            public int length() {
                return this.f69164a.length;
            }

            public CharSequence subSequence(int i10, int i11) {
                return new String(this.f69164a, i10, i11 - i10);
            }

            public String toString() {
                if (this.f69165b == null) {
                    this.f69165b = new String(this.f69164a);
                }
                return this.f69165b;
            }
        }

        b(Appendable appendable) {
            this.f69162a = appendable;
        }

        public void close() {
        }

        public void flush() {
        }

        public void write(char[] cArr, int i10, int i11) {
            this.f69163b.a(cArr);
            this.f69162a.append(this.f69163b, i10, i11 + i10);
        }

        public Writer append(CharSequence charSequence) {
            this.f69162a.append(charSequence);
            return this;
        }

        public void write(int i10) {
            this.f69162a.append((char) i10);
        }

        public Writer append(CharSequence charSequence, int i10, int i11) {
            this.f69162a.append(charSequence, i10, i11);
            return this;
        }

        public void write(String str, int i10, int i11) {
            Objects.requireNonNull(str);
            this.f69162a.append(str, i10, i11 + i10);
        }
    }
}
