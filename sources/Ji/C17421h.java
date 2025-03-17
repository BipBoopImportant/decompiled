package jI;

import GJ.C15765h;
import XH.C16807N;
import XH.t;
import YH.C16859c;
import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b\u000e\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u001a\u0016\u0018Bm\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006\u0012\u001a\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011B\u001b\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0012J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\"\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\"\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR(\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"LjI/h;", "LGJ/h;", "Ljava/io/File;", "start", "LjI/i;", "direction", "Lkotlin/Function1;", "", "onEnter", "LXH/N;", "onLeave", "Lkotlin/Function2;", "Ljava/io/IOException;", "onFail", "", "maxDepth", "<init>", "(Ljava/io/File;LjI/i;LnI/l;LnI/l;LnI/p;I)V", "(Ljava/io/File;LjI/i;)V", "", "iterator", "()Ljava/util/Iterator;", "a", "Ljava/io/File;", "b", "LjI/i;", "c", "LnI/l;", "d", "e", "LnI/p;", "f", "I", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: jI.h  reason: case insensitive filesystem */
public final class C17421h implements C15765h<File> {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final File f143979a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C17422i f143980b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final C17642l<File, Boolean> f143981c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final C17642l<File, C16807N> f143982d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final p<File, IOException, C16807N> f143983e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final int f143984f;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\"\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LjI/h$a;", "LjI/h$c;", "Ljava/io/File;", "rootDir", "<init>", "(Ljava/io/File;)V", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: jI.h$a */
    private static abstract class a extends c {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(File file) {
            super(file);
            C17542s.j(file, "rootDir");
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0012\f\u0013B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0010¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0010¨\u0006\u0014"}, d2 = {"LjI/h$b;", "LYH/c;", "Ljava/io/File;", "<init>", "(LjI/h;)V", "root", "LjI/h$a;", "i", "(Ljava/io/File;)LjI/h$a;", "k", "()Ljava/io/File;", "LXH/N;", "c", "()V", "Ljava/util/ArrayDeque;", "LjI/h$c;", "Ljava/util/ArrayDeque;", "state", "a", "b", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: jI.h$b */
    private final class b extends C16859c<File> {

        /* renamed from: c  reason: collision with root package name */
        private final ArrayDeque<c> f143985c;

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\n\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\tR\u001e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\t¨\u0006\u0015"}, d2 = {"LjI/h$b$a;", "LjI/h$a;", "Ljava/io/File;", "rootDir", "<init>", "(LjI/h$b;Ljava/io/File;)V", "b", "()Ljava/io/File;", "", "Z", "rootVisited", "", "c", "[Ljava/io/File;", "fileList", "", "d", "I", "fileIndex", "e", "failed", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: jI.h$b$a */
        private final class a extends a {

            /* renamed from: b  reason: collision with root package name */
            private boolean f143987b;

            /* renamed from: c  reason: collision with root package name */
            private File[] f143988c;

            /* renamed from: d  reason: collision with root package name */
            private int f143989d;

            /* renamed from: e  reason: collision with root package name */
            private boolean f143990e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ b f143991f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(b bVar, File file) {
                super(file);
                C17542s.j(file, "rootDir");
                this.f143991f = bVar;
            }

            public File b() {
                if (!this.f143990e && this.f143988c == null) {
                    C17642l e10 = C17421h.this.f143981c;
                    if (e10 != null && !((Boolean) e10.invoke(a())).booleanValue()) {
                        return null;
                    }
                    File[] listFiles = a().listFiles();
                    this.f143988c = listFiles;
                    if (listFiles == null) {
                        p f10 = C17421h.this.f143983e;
                        if (f10 != null) {
                            f10.invoke(a(), new C17414a(a(), (File) null, "Cannot list files in a directory", 2, (DefaultConstructorMarker) null));
                        }
                        this.f143990e = true;
                    }
                }
                File[] fileArr = this.f143988c;
                if (fileArr != null) {
                    int i10 = this.f143989d;
                    C17542s.g(fileArr);
                    if (i10 < fileArr.length) {
                        File[] fileArr2 = this.f143988c;
                        C17542s.g(fileArr2);
                        int i11 = this.f143989d;
                        this.f143989d = i11 + 1;
                        return fileArr2[i11];
                    }
                }
                if (!this.f143987b) {
                    this.f143987b = true;
                    return a();
                }
                C17642l g10 = C17421h.this.f143982d;
                if (g10 != null) {
                    g10.invoke(a());
                }
                return null;
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\n\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\t¨\u0006\u000b"}, d2 = {"LjI/h$b$b;", "LjI/h$c;", "Ljava/io/File;", "rootFile", "<init>", "(LjI/h$b;Ljava/io/File;)V", "b", "()Ljava/io/File;", "", "Z", "visited", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: jI.h$b$b  reason: collision with other inner class name */
        private final class C3518b extends c {

            /* renamed from: b  reason: collision with root package name */
            private boolean f143992b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ b f143993c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3518b(b bVar, File file) {
                super(file);
                C17542s.j(file, "rootFile");
                this.f143993c = bVar;
            }

            public File b() {
                if (this.f143992b) {
                    return null;
                }
                this.f143992b = true;
                return a();
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\n\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\tR\u001e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"LjI/h$b$c;", "LjI/h$a;", "Ljava/io/File;", "rootDir", "<init>", "(LjI/h$b;Ljava/io/File;)V", "b", "()Ljava/io/File;", "", "Z", "rootVisited", "", "c", "[Ljava/io/File;", "fileList", "", "d", "I", "fileIndex", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: jI.h$b$c */
        private final class c extends a {

            /* renamed from: b  reason: collision with root package name */
            private boolean f143994b;

            /* renamed from: c  reason: collision with root package name */
            private File[] f143995c;

            /* renamed from: d  reason: collision with root package name */
            private int f143996d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ b f143997e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public c(b bVar, File file) {
                super(file);
                C17542s.j(file, "rootDir");
                this.f143997e = bVar;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:27:0x007f, code lost:
                if (r0.length == 0) goto L_0x0081;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.io.File b() {
                /*
                    r10 = this;
                    boolean r0 = r10.f143994b
                    r1 = 0
                    if (r0 != 0) goto L_0x0028
                    jI.h$b r0 = r10.f143997e
                    jI.h r0 = jI.C17421h.this
                    nI.l r0 = r0.f143981c
                    if (r0 == 0) goto L_0x0020
                    java.io.File r2 = r10.a()
                    java.lang.Object r0 = r0.invoke(r2)
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    boolean r0 = r0.booleanValue()
                    if (r0 != 0) goto L_0x0020
                    return r1
                L_0x0020:
                    r0 = 1
                    r10.f143994b = r0
                    java.io.File r0 = r10.a()
                    return r0
                L_0x0028:
                    java.io.File[] r0 = r10.f143995c
                    if (r0 == 0) goto L_0x0047
                    int r2 = r10.f143996d
                    kotlin.jvm.internal.C17542s.g(r0)
                    int r0 = r0.length
                    if (r2 >= r0) goto L_0x0035
                    goto L_0x0047
                L_0x0035:
                    jI.h$b r0 = r10.f143997e
                    jI.h r0 = jI.C17421h.this
                    nI.l r0 = r0.f143982d
                    if (r0 == 0) goto L_0x0046
                    java.io.File r2 = r10.a()
                    r0.invoke(r2)
                L_0x0046:
                    return r1
                L_0x0047:
                    java.io.File[] r0 = r10.f143995c
                    if (r0 != 0) goto L_0x0093
                    java.io.File r0 = r10.a()
                    java.io.File[] r0 = r0.listFiles()
                    r10.f143995c = r0
                    if (r0 != 0) goto L_0x0077
                    jI.h$b r0 = r10.f143997e
                    jI.h r0 = jI.C17421h.this
                    nI.p r0 = r0.f143983e
                    if (r0 == 0) goto L_0x0077
                    java.io.File r2 = r10.a()
                    jI.a r9 = new jI.a
                    java.io.File r4 = r10.a()
                    r7 = 2
                    r8 = 0
                    r5 = 0
                    java.lang.String r6 = "Cannot list files in a directory"
                    r3 = r9
                    r3.<init>(r4, r5, r6, r7, r8)
                    r0.invoke(r2, r9)
                L_0x0077:
                    java.io.File[] r0 = r10.f143995c
                    if (r0 == 0) goto L_0x0081
                    kotlin.jvm.internal.C17542s.g(r0)
                    int r0 = r0.length
                    if (r0 != 0) goto L_0x0093
                L_0x0081:
                    jI.h$b r0 = r10.f143997e
                    jI.h r0 = jI.C17421h.this
                    nI.l r0 = r0.f143982d
                    if (r0 == 0) goto L_0x0092
                    java.io.File r2 = r10.a()
                    r0.invoke(r2)
                L_0x0092:
                    return r1
                L_0x0093:
                    java.io.File[] r0 = r10.f143995c
                    kotlin.jvm.internal.C17542s.g(r0)
                    int r1 = r10.f143996d
                    int r2 = r1 + 1
                    r10.f143996d = r2
                    r0 = r0[r1]
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: jI.C17421h.b.c.b():java.io.File");
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: jI.h$b$d */
        public /* synthetic */ class d {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f143998a;

            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            static {
                /*
                    jI.i[] r0 = jI.C17422i.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    jI.i r1 = jI.C17422i.TOP_DOWN     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    jI.i r1 = jI.C17422i.BOTTOM_UP     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    f143998a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: jI.C17421h.b.d.<clinit>():void");
            }
        }

        public b() {
            ArrayDeque<c> arrayDeque = new ArrayDeque<>();
            this.f143985c = arrayDeque;
            if (C17421h.this.f143979a.isDirectory()) {
                arrayDeque.push(i(C17421h.this.f143979a));
            } else if (C17421h.this.f143979a.isFile()) {
                arrayDeque.push(new C3518b(this, C17421h.this.f143979a));
            } else {
                d();
            }
        }

        private final a i(File file) {
            int i10 = d.f143998a[C17421h.this.f143980b.ordinal()];
            if (i10 == 1) {
                return new c(this, file);
            }
            if (i10 == 2) {
                return new a(this, file);
            }
            throw new t();
        }

        private final File k() {
            File b10;
            while (true) {
                c peek = this.f143985c.peek();
                if (peek == null) {
                    return null;
                }
                b10 = peek.b();
                if (b10 == null) {
                    this.f143985c.pop();
                } else if (C17542s.e(b10, peek.a()) || !b10.isDirectory() || this.f143985c.size() >= C17421h.this.f143984f) {
                    return b10;
                } else {
                    this.f143985c.push(i(b10));
                }
            }
            return b10;
        }

        /* access modifiers changed from: protected */
        public void c() {
            File k10 = k();
            if (k10 != null) {
                f(k10);
            } else {
                d();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\"\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\u0007¨\u0006\n"}, d2 = {"LjI/h$c;", "", "Ljava/io/File;", "root", "<init>", "(Ljava/io/File;)V", "b", "()Ljava/io/File;", "a", "Ljava/io/File;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: jI.h$c */
    private static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        private final File f143999a;

        public c(File file) {
            C17542s.j(file, "root");
            this.f143999a = file;
        }

        public final File a() {
            return this.f143999a;
        }

        public abstract File b();
    }

    private C17421h(File file, C17422i iVar, C17642l<? super File, Boolean> lVar, C17642l<? super File, C16807N> lVar2, p<? super File, ? super IOException, C16807N> pVar, int i10) {
        this.f143979a = file;
        this.f143980b = iVar;
        this.f143981c = lVar;
        this.f143982d = lVar2;
        this.f143983e = pVar;
        this.f143984f = i10;
    }

    public Iterator<File> iterator() {
        return new b();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    /* synthetic */ C17421h(File file, C17422i iVar, C17642l lVar, C17642l lVar2, p pVar, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, (i11 & 2) != 0 ? C17422i.TOP_DOWN : iVar, lVar, lVar2, pVar, (i11 & 32) != 0 ? Integer.MAX_VALUE : i10);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C17421h(File file, C17422i iVar) {
        this(file, iVar, (C17642l) null, (C17642l) null, (p) null, 0, 32, (DefaultConstructorMarker) null);
        C17542s.j(file, "start");
        C17542s.j(iVar, "direction");
    }
}
