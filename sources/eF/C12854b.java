package EF;

import QJ.C16297b0;
import QJ.Q;
import XH.C16796C;
import XH.C16807N;
import XH.C16816g;
import XH.v;
import XH.y;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Log;
import com.squareup.picasso.C;
import com.squareup.picasso.t;
import com.sugarcube.app.base.data.source.CompositionRepository;
import com.sugarcube.app.base.ui.gallery.share.CloneDesignUseCase;
import com.sugarcube.core.logger.AnyKt;
import com.sugarcube.core.logger.Priority;
import dI.C17164e;
import eI.C17187b;
import java.io.ByteArrayOutputStream;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.O;
import nI.p;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH@¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u000eH@¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0015¨\u0006\u0016"}, d2 = {"LEF/b;", "Lcom/sugarcube/app/base/ui/gallery/share/CloneDesignUseCase;", "Lcom/sugarcube/app/base/data/source/CompositionRepository;", "compositionRepository", "Lcom/squareup/picasso/t;", "picasso", "<init>", "(Lcom/sugarcube/app/base/data/source/CompositionRepository;Lcom/squareup/picasso/t;)V", "Landroid/net/Uri;", "uri", "LXH/v;", "", "b", "(Landroid/net/Uri;LdI/e;)Ljava/lang/Object;", "Ljava/util/UUID;", "compositionUuid", "Lcom/sugarcube/core/network/models/Composition;", "invoke", "(Ljava/util/UUID;LdI/e;)Ljava/lang/Object;", "a", "Lcom/sugarcube/app/base/data/source/CompositionRepository;", "Lcom/squareup/picasso/t;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: EF.b  reason: case insensitive filesystem */
public final class C12854b implements CloneDesignUseCase {

    /* renamed from: a  reason: collision with root package name */
    private final CompositionRepository f109420a;

    /* renamed from: b  reason: collision with root package name */
    private final t f109421b;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.sugarcube.app.base.ui.gallery.share.CloneDesignUseCaseImpl", f = "CloneDesignUseCase.kt", l = {94}, m = "fetchImageData")
    /* renamed from: EF.b$a */
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f109422c;

        /* renamed from: d  reason: collision with root package name */
        Object f109423d;

        /* renamed from: e  reason: collision with root package name */
        Object f109424e;

        /* renamed from: f  reason: collision with root package name */
        Object f109425f;

        /* renamed from: g  reason: collision with root package name */
        Object f109426g;

        /* renamed from: h  reason: collision with root package name */
        Object f109427h;

        /* renamed from: i  reason: collision with root package name */
        int f109428i;

        /* renamed from: j  reason: collision with root package name */
        /* synthetic */ Object f109429j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ C12854b f109430k;

        /* renamed from: l  reason: collision with root package name */
        int f109431l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C12854b bVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f109430k = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f109429j = obj;
            this.f109431l |= Integer.MIN_VALUE;
            return this.f109430k.b((Uri) null, this);
        }
    }

    @Metadata(d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u000e\u001a\u00020\u00062\u000e\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"EF/b$b", "Lcom/squareup/picasso/C;", "Landroid/graphics/Bitmap;", "bitmap", "Lcom/squareup/picasso/t$e;", "from", "LXH/N;", "a", "(Landroid/graphics/Bitmap;Lcom/squareup/picasso/t$e;)V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "Landroid/graphics/drawable/Drawable;", "errorDrawable", "b", "(Ljava/lang/Exception;Landroid/graphics/drawable/Drawable;)V", "placeHolderDrawable", "c", "(Landroid/graphics/drawable/Drawable;)V", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: EF.b$b  reason: collision with other inner class name */
    public static final class C2616b implements C {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ O<v<Uri, byte[]>> f109432a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Uri f109433b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ O<Throwable> f109434c;

        C2616b(O<v<Uri, byte[]>> o10, Uri uri, O<Throwable> o11) {
            this.f109432a = o10;
            this.f109433b = uri;
            this.f109434c = o11;
        }

        public void a(Bitmap bitmap, t.e eVar) {
            if (bitmap != null) {
                O<v<Uri, byte[]>> o10 = this.f109432a;
                Uri uri = this.f109433b;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 90, byteArrayOutputStream);
                C17542s.g(uri);
                o10.f144348a = C16796C.a(uri, byteArrayOutputStream.toByteArray());
            }
        }

        public void b(Exception exc, Drawable drawable) {
            IllegalStateException illegalStateException = new IllegalStateException("Loading image failed", exc);
            Priority priority = Priority.ERROR;
            String message = illegalStateException.getMessage();
            String str = "";
            if (message == null) {
                message = str;
            }
            String b10 = C16816g.b(illegalStateException);
            if (b10 != null) {
                str = b10;
            }
            int i10 = C12855c.f109446a[priority.ordinal()];
            if (i10 == 1) {
                Log.v(AnyKt.SUGARCUBE_TAG, message + " " + str);
            } else if (i10 == 2) {
                Log.d(AnyKt.SUGARCUBE_TAG, message + " " + str);
            } else if (i10 == 3) {
                Log.i(AnyKt.SUGARCUBE_TAG, message + " " + str);
            } else if (i10 == 4) {
                Log.w(AnyKt.SUGARCUBE_TAG, message + " " + str);
            } else if (i10 == 5) {
                Log.e(AnyKt.SUGARCUBE_TAG, message + " " + str);
            } else {
                throw new XH.t();
            }
            this.f109434c.f144348a = exc;
        }

        public void c(Drawable drawable) {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.app.base.ui.gallery.share.CloneDesignUseCaseImpl$fetchImageData$3", f = "CloneDesignUseCase.kt", l = {96}, m = "invokeSuspend")
    /* renamed from: EF.b$c */
    static final class c extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f109435c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ O<v<Uri, byte[]>> f109436d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ O<Throwable> f109437e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(O<v<Uri, byte[]>> o10, O<Throwable> o11, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f109436d = o10;
            this.f109437e = o11;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new c(this.f109436d, this.f109437e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f109435c;
            if (i10 == 0 || i10 == 1) {
                y.b(obj);
                while (this.f109436d.f144348a == null && this.f109437e.f144348a == null) {
                    this.f109435c = 1;
                    if (C16297b0.b(300, this) == f10) {
                        return f10;
                    }
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.sugarcube.app.base.ui.gallery.share.CloneDesignUseCaseImpl", f = "CloneDesignUseCase.kt", l = {43, 44, 53}, m = "invoke")
    /* renamed from: EF.b$d */
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f109438c;

        /* renamed from: d  reason: collision with root package name */
        Object f109439d;

        /* renamed from: e  reason: collision with root package name */
        Object f109440e;

        /* renamed from: f  reason: collision with root package name */
        Object f109441f;

        /* renamed from: g  reason: collision with root package name */
        Object f109442g;

        /* renamed from: h  reason: collision with root package name */
        /* synthetic */ Object f109443h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ C12854b f109444i;

        /* renamed from: j  reason: collision with root package name */
        int f109445j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C12854b bVar, C17164e<? super d> eVar) {
            super(eVar);
            this.f109444i = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f109443h = obj;
            this.f109445j |= Integer.MIN_VALUE;
            return this.f109444i.invoke((UUID) null, this);
        }
    }

    public C12854b(CompositionRepository compositionRepository, t tVar) {
        C17542s.j(compositionRepository, "compositionRepository");
        C17542s.j(tVar, "picasso");
        this.f109420a = compositionRepository;
        this.f109421b = tVar;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(android.net.Uri r12, dI.C17164e<? super XH.v<? extends android.net.Uri, byte[]>> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof EF.C12854b.a
            if (r0 == 0) goto L_0x0013
            r0 = r13
            EF.b$a r0 = (EF.C12854b.a) r0
            int r1 = r0.f109431l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f109431l = r1
            goto L_0x0018
        L_0x0013:
            EF.b$a r0 = new EF.b$a
            r0.<init>(r11, r13)
        L_0x0018:
            java.lang.Object r1 = r0.f109429j
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f109431l
            r4 = 5
            r5 = 1
            if (r3 == 0) goto L_0x004d
            if (r3 != r5) goto L_0x0045
            java.lang.Object r12 = r0.f109427h
            IJ.b$a r12 = (IJ.C15906b.a) r12
            java.lang.Object r12 = r0.f109426g
            kotlin.jvm.internal.O r12 = (kotlin.jvm.internal.O) r12
            java.lang.Object r12 = r0.f109425f
            kotlin.jvm.internal.O r12 = (kotlin.jvm.internal.O) r12
            java.lang.Object r13 = r0.f109424e
            dI.e r13 = (dI.C17164e) r13
            java.lang.Object r13 = r0.f109423d
            android.net.Uri r13 = (android.net.Uri) r13
            java.lang.Object r13 = r0.f109422c
            EF.b r13 = (EF.C12854b) r13
            XH.y.b(r1)     // Catch:{ k1 -> 0x0043 }
            goto L_0x0131
        L_0x0043:
            r13 = move-exception
            goto L_0x0092
        L_0x0045:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x004d:
            XH.y.b(r1)
            kotlin.jvm.internal.O r1 = new kotlin.jvm.internal.O
            r1.<init>()
            kotlin.jvm.internal.O r3 = new kotlin.jvm.internal.O
            r3.<init>()
            com.squareup.picasso.t r6 = r11.f109421b
            com.squareup.picasso.x r6 = r6.l(r12)
            EF.b$b r7 = new EF.b$b
            r7.<init>(r1, r12, r3)
            r6.f(r7)
            IJ.b$a r6 = IJ.C15906b.f135496b     // Catch:{ k1 -> 0x0090 }
            IJ.e r7 = IJ.C15909e.SECONDS     // Catch:{ k1 -> 0x0090 }
            long r7 = IJ.C15908d.s(r4, r7)     // Catch:{ k1 -> 0x0090 }
            EF.b$c r9 = new EF.b$c     // Catch:{ k1 -> 0x0090 }
            r10 = 0
            r9.<init>(r1, r3, r10)     // Catch:{ k1 -> 0x0090 }
            r0.f109422c = r11     // Catch:{ k1 -> 0x0090 }
            r0.f109423d = r12     // Catch:{ k1 -> 0x0090 }
            r0.f109424e = r13     // Catch:{ k1 -> 0x0090 }
            r0.f109425f = r1     // Catch:{ k1 -> 0x0090 }
            r0.f109426g = r3     // Catch:{ k1 -> 0x0090 }
            r0.f109427h = r6     // Catch:{ k1 -> 0x0090 }
            r0.f109428i = r4     // Catch:{ k1 -> 0x0090 }
            r0.f109431l = r5     // Catch:{ k1 -> 0x0090 }
            java.lang.Object r12 = QJ.m1.d(r7, r9, r0)     // Catch:{ k1 -> 0x0090 }
            if (r12 != r2) goto L_0x008d
            return r2
        L_0x008d:
            r12 = r1
            goto L_0x0131
        L_0x0090:
            r13 = move-exception
            r12 = r1
        L_0x0092:
            com.sugarcube.core.logger.Priority r0 = com.sugarcube.core.logger.Priority.ERROR
            java.lang.String r1 = r13.getMessage()
            java.lang.String r2 = ""
            if (r1 != 0) goto L_0x009d
            r1 = r2
        L_0x009d:
            java.lang.String r13 = XH.C16816g.b(r13)
            if (r13 != 0) goto L_0x00a4
            goto L_0x00a5
        L_0x00a4:
            r2 = r13
        L_0x00a5:
            int[] r13 = EF.C12853a.f109419a
            int r0 = r0.ordinal()
            r13 = r13[r0]
            java.lang.String r0 = " "
            java.lang.String r3 = "Sugarcube"
            if (r13 == r5) goto L_0x011c
            r5 = 2
            if (r13 == r5) goto L_0x0106
            r5 = 3
            if (r13 == r5) goto L_0x00f0
            r5 = 4
            if (r13 == r5) goto L_0x00da
            if (r13 != r4) goto L_0x00d4
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r1)
            r13.append(r0)
            r13.append(r2)
            java.lang.String r13 = r13.toString()
            android.util.Log.e(r3, r13)
            goto L_0x0131
        L_0x00d4:
            XH.t r12 = new XH.t
            r12.<init>()
            throw r12
        L_0x00da:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r1)
            r13.append(r0)
            r13.append(r2)
            java.lang.String r13 = r13.toString()
            android.util.Log.w(r3, r13)
            goto L_0x0131
        L_0x00f0:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r1)
            r13.append(r0)
            r13.append(r2)
            java.lang.String r13 = r13.toString()
            android.util.Log.i(r3, r13)
            goto L_0x0131
        L_0x0106:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r1)
            r13.append(r0)
            r13.append(r2)
            java.lang.String r13 = r13.toString()
            android.util.Log.d(r3, r13)
            goto L_0x0131
        L_0x011c:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r1)
            r13.append(r0)
            r13.append(r2)
            java.lang.String r13 = r13.toString()
            android.util.Log.v(r3, r13)
        L_0x0131:
            T r12 = r12.f144348a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: EF.C12854b.b(android.net.Uri, dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a2 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x01e8  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0032  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke(java.util.UUID r38, dI.C17164e<? super com.sugarcube.core.network.models.Composition> r39) {
        /*
            r37 = this;
            r0 = r37
            r1 = r39
            boolean r2 = r1 instanceof EF.C12854b.d
            if (r2 == 0) goto L_0x0017
            r2 = r1
            EF.b$d r2 = (EF.C12854b.d) r2
            int r3 = r2.f109445j
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f109445j = r3
            goto L_0x001c
        L_0x0017:
            EF.b$d r2 = new EF.b$d
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r3 = r2.f109443h
            java.lang.Object r4 = eI.C17187b.f()
            int r5 = r2.f109445j
            r6 = 0
            r7 = 5
            r8 = 4
            java.lang.String r9 = ""
            r10 = 3
            r11 = 2
            r12 = 1
            java.lang.String r13 = " "
            java.lang.String r14 = "Sugarcube"
            if (r5 == 0) goto L_0x007b
            if (r5 == r12) goto L_0x006b
            if (r5 == r11) goto L_0x005b
            if (r5 != r10) goto L_0x0053
            java.lang.Object r1 = r2.f109442g
            com.sugarcube.core.network.models.Composition r1 = (com.sugarcube.core.network.models.Composition) r1
            java.lang.Object r4 = r2.f109441f
            com.sugarcube.core.network.models.CompiledComposition r4 = (com.sugarcube.core.network.models.CompiledComposition) r4
            java.lang.Object r4 = r2.f109440e
            dI.e r4 = (dI.C17164e) r4
            java.lang.Object r4 = r2.f109439d
            java.util.UUID r4 = (java.util.UUID) r4
            java.lang.Object r2 = r2.f109438c
            EF.b r2 = (EF.C12854b) r2
            XH.y.b(r3)
            r16 = r1
            goto L_0x0178
        L_0x0053:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x005b:
            java.lang.Object r1 = r2.f109440e
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r5 = r2.f109439d
            java.util.UUID r5 = (java.util.UUID) r5
            java.lang.Object r15 = r2.f109438c
            EF.b r15 = (EF.C12854b) r15
            XH.y.b(r3)
            goto L_0x00a3
        L_0x006b:
            java.lang.Object r1 = r2.f109440e
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r5 = r2.f109439d
            java.util.UUID r5 = (java.util.UUID) r5
            java.lang.Object r15 = r2.f109438c
            EF.b r15 = (EF.C12854b) r15
            XH.y.b(r3)
            goto L_0x0092
        L_0x007b:
            XH.y.b(r3)
            com.sugarcube.app.base.data.source.CompositionRepository r3 = r0.f109420a
            r2.f109438c = r0
            r5 = r38
            r2.f109439d = r5
            r2.f109440e = r1
            r2.f109445j = r12
            java.lang.Object r3 = r3.refreshCache(r2)
            if (r3 != r4) goto L_0x0091
            return r4
        L_0x0091:
            r15 = r0
        L_0x0092:
            com.sugarcube.app.base.data.source.CompositionRepository r3 = r15.f109420a
            r2.f109438c = r15
            r2.f109439d = r5
            r2.f109440e = r1
            r2.f109445j = r11
            java.lang.Object r3 = r3.fetchCompiledComposition(r5, r2)
            if (r3 != r4) goto L_0x00a3
            return r4
        L_0x00a3:
            com.sugarcube.core.network.models.CompiledComposition r3 = (com.sugarcube.core.network.models.CompiledComposition) r3
            if (r3 != 0) goto L_0x0159
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "CompiledComposition for uuid: "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r3 = " not found."
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            com.sugarcube.core.logger.Priority r2 = com.sugarcube.core.logger.Priority.ERROR
            java.lang.String r3 = r1.getMessage()
            if (r3 != 0) goto L_0x00cb
            r3 = r9
        L_0x00cb:
            java.lang.String r1 = XH.C16816g.b(r1)
            if (r1 != 0) goto L_0x00d2
            goto L_0x00d3
        L_0x00d2:
            r9 = r1
        L_0x00d3:
            int[] r1 = EF.C12856d.f109447a
            int r2 = r2.ordinal()
            r1 = r1[r2]
            if (r1 == r12) goto L_0x0143
            if (r1 == r11) goto L_0x012d
            if (r1 == r10) goto L_0x0117
            if (r1 == r8) goto L_0x0101
            if (r1 != r7) goto L_0x00fb
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            r1.append(r13)
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r14, r1)
            goto L_0x0158
        L_0x00fb:
            XH.t r1 = new XH.t
            r1.<init>()
            throw r1
        L_0x0101:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            r1.append(r13)
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            android.util.Log.w(r14, r1)
            goto L_0x0158
        L_0x0117:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            r1.append(r13)
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            android.util.Log.i(r14, r1)
            goto L_0x0158
        L_0x012d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            r1.append(r13)
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r14, r1)
            goto L_0x0158
        L_0x0143:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            r1.append(r13)
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r14, r1)
        L_0x0158:
            return r6
        L_0x0159:
            com.sugarcube.core.network.models.Composition r6 = r3.getComposition()
            android.net.Uri r7 = r6.getThumbnailUrl()
            r2.f109438c = r15
            r2.f109439d = r5
            r2.f109440e = r1
            r2.f109441f = r3
            r2.f109442g = r6
            r2.f109445j = r10
            java.lang.Object r3 = r15.b(r7, r2)
            if (r3 != r4) goto L_0x0174
            return r4
        L_0x0174:
            r4 = r5
            r16 = r6
            r2 = r15
        L_0x0178:
            XH.v r3 = (XH.v) r3
            if (r3 == 0) goto L_0x01e8
            java.lang.Object r1 = r3.a()
            r20 = r1
            android.net.Uri r20 = (android.net.Uri) r20
            java.lang.Object r1 = r3.b()
            byte[] r1 = (byte[]) r1
            java.util.UUID r3 = java.util.UUID.randomUUID()
            r22 = r3
            java.lang.String r4 = "randomUUID(...)"
            kotlin.jvm.internal.C17542s.i(r3, r4)
            kotlin.jvm.internal.V r3 = kotlin.jvm.internal.V.f144353a
            java.util.Base64$Encoder r3 = java.util.Base64.getEncoder()
            java.lang.String r1 = r3.encodeToString(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r12)
            java.lang.String r3 = "data:image/jpeg;base64,%s"
            java.lang.String r1 = java.lang.String.format(r3, r1)
            r31 = r1
            java.lang.String r3 = "format(...)"
            kotlin.jvm.internal.C17542s.i(r1, r3)
            r35 = 245719(0x3bfd7, float:3.44326E-40)
            r36 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r21 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            com.sugarcube.core.network.models.Composition r1 = com.sugarcube.core.network.models.Composition.copy$default(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            com.sugarcube.app.base.data.source.CompositionRepository r2 = r2.f109420a
            com.sugarcube.app.base.data.model.PendingComposition r3 = new com.sugarcube.app.base.data.model.PendingComposition
            com.sugarcube.core.network.models.AuthType r4 = com.sugarcube.core.network.models.AuthType.LOGIN
            r3.<init>(r1, r4, r12)
            r2.setPendingComposition(r3)
            return r1
        L_0x01e8:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Couldn't fetch imageData for "
            r2.append(r3)
            r2.append(r4)
            java.lang.String r3 = "."
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            com.sugarcube.core.logger.Priority r2 = com.sugarcube.core.logger.Priority.ERROR
            java.lang.String r3 = r1.getMessage()
            if (r3 != 0) goto L_0x020c
            r3 = r9
        L_0x020c:
            java.lang.String r1 = XH.C16816g.b(r1)
            if (r1 != 0) goto L_0x0213
            goto L_0x0214
        L_0x0213:
            r9 = r1
        L_0x0214:
            int[] r1 = EF.C12857e.f109448a
            int r2 = r2.ordinal()
            r1 = r1[r2]
            if (r1 == r12) goto L_0x0286
            if (r1 == r11) goto L_0x0270
            if (r1 == r10) goto L_0x025a
            if (r1 == r8) goto L_0x0244
            r2 = 5
            if (r1 != r2) goto L_0x023e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            r1.append(r13)
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r14, r1)
        L_0x023c:
            r1 = 0
            goto L_0x029c
        L_0x023e:
            XH.t r1 = new XH.t
            r1.<init>()
            throw r1
        L_0x0244:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            r1.append(r13)
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            android.util.Log.w(r14, r1)
            goto L_0x023c
        L_0x025a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            r1.append(r13)
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            android.util.Log.i(r14, r1)
            goto L_0x023c
        L_0x0270:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            r1.append(r13)
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r14, r1)
            goto L_0x023c
        L_0x0286:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            r1.append(r13)
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r14, r1)
            goto L_0x023c
        L_0x029c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: EF.C12854b.invoke(java.util.UUID, dI.e):java.lang.Object");
    }
}
