package r7;

import GK.C15774B;
import GK.C15784c;
import GK.C15785d;
import GK.C15793l;
import GK.C15803v;
import GK.z;
import QK.C16354j;
import XH.C16824o;
import XH.C16825p;
import YH.C16877v;
import b7.b;
import c7.C7100a;
import dI.C17164e;
import e7.C7794a;
import e7.C7795b;
import e7.C7796c;
import e7.C7799f;
import e7.C7806m;
import e7.C7807n;
import h7.e;
import j7.C8412f;
import java.security.PublicKey;
import java.time.Instant;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JI\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011JC\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\b\b\u0002\u0010\u0012\u001a\u00020\u000f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0006¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001e²\u0006\f\u0010\u001d\u001a\u00020\u00078\nX\u0002"}, d2 = {"Lr7/d;", "", "<init>", "()V", "", "baseUrl", "Lkotlin/Function0;", "LGK/z;", "okHttpClient", "", "networkTimeoutSeconds", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "LGK/l;", "connectionSpec", "Lr7/f;", "g", "(Ljava/lang/String;LnI/a;JLjavax/net/ssl/X509TrustManager;LGK/l;)Lr7/f;", "logListService", "Lb7/b;", "diskCache", "Ljava/security/PublicKey;", "publicKey", "Ljava/time/Instant;", "now", "Lc7/a;", "Lr7/e;", "d", "(Lr7/f;Lb7/b;Ljava/security/PublicKey;LnI/a;)Lc7/a;", "client", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: r7.d  reason: case insensitive filesystem */
public final class C8702d {

    /* renamed from: a  reason: collision with root package name */
    public static final C8702d f55741a = new C8702d();

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H@¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0006H@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"r7/d$a", "Lr7/f;", "", "pathSegment", "", "maxSize", "", "b", "(Ljava/lang/String;JLdI/e;)Ljava/lang/Object;", "a", "(LdI/e;)Ljava/lang/Object;", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: r7.d$a */
    public static final class a implements C8704f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f55742a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C16824o<z> f55743b;

        a(String str, C16824o<? extends z> oVar) {
            this.f55742a = str;
            this.f55743b = oVar;
        }

        private final Object b(String str, long j10, C17164e<? super byte[]> eVar) {
            return C7794a.a(C8702d.j(this.f55743b).b(new C15774B.a().m(C15803v.f135109k.d(this.f55742a).k().c(str).e()).c(new C15785d.a().e().f().a()).a("Max-Size", String.valueOf(j10)).b()), eVar);
        }

        public Object a(C17164e<? super byte[]> eVar) {
            return b("log_list.zip", 2097152, eVar);
        }
    }

    private C8702d() {
    }

    public static /* synthetic */ C7100a e(C8702d dVar, C8704f fVar, b bVar, PublicKey publicKey, C17631a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            fVar = h(dVar, (String) null, (C17631a) null, 0, (X509TrustManager) null, (C15793l) null, 31, (Object) null);
        }
        if ((i10 & 2) != 0) {
            bVar = null;
        }
        if ((i10 & 4) != 0) {
            publicKey = C7795b.a();
        }
        if ((i10 & 8) != 0) {
            new C8700b
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0025: CONSTRUCTOR  (r13v2 ? I:r7.b) =  call: r7.b.<init>():void type: CONSTRUCTOR in method: r7.d.e(r7.d, r7.f, b7.b, java.security.PublicKey, nI.a, int, java.lang.Object):c7.a, dex: classes2.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r13v2 ?
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:620)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	... 34 more
                */
            /*
                r15 = r14 & 1
                if (r15 == 0) goto L_0x0012
                r7 = 31
                r8 = 0
                r1 = 0
                r2 = 0
                r3 = 0
                r5 = 0
                r6 = 0
                r0 = r9
                r7.f r10 = h(r0, r1, r2, r3, r5, r6, r7, r8)
            L_0x0012:
                r15 = r14 & 2
                if (r15 == 0) goto L_0x0017
                r11 = 0
            L_0x0017:
                r15 = r14 & 4
                if (r15 == 0) goto L_0x001f
                java.security.PublicKey r12 = e7.C7795b.a()
            L_0x001f:
                r14 = r14 & 8
                if (r14 == 0) goto L_0x0028
                r7.b r13 = new r7.b
                r13.<init>()
            L_0x0028:
                c7.a r9 = r9.d(r10, r11, r12, r13)
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: r7.C8702d.e(r7.d, r7.f, b7.b, java.security.PublicKey, nI.a, int, java.lang.Object):c7.a");
        }

        /* access modifiers changed from: private */
        public static final Instant f() {
            return Instant.now();
        }

        public static /* synthetic */ C8704f h(C8702d dVar, String str, C17631a aVar, long j10, X509TrustManager x509TrustManager, C15793l lVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = "https://www.gstatic.com/ct/log_list/v3/";
            }
            X509TrustManager x509TrustManager2 = null;
            C17631a aVar2 = (i10 & 2) != 0 ? null : aVar;
            if ((i10 & 4) != 0) {
                j10 = 30;
            }
            long j11 = j10;
            if ((i10 & 8) == 0) {
                x509TrustManager2 = x509TrustManager;
            }
            if ((i10 & 16) != 0) {
                lVar = C15793l.f135050i;
            }
            return dVar.g(str, aVar2, j11, x509TrustManager2, lVar);
        }

        /* access modifiers changed from: private */
        public static final z i(C17631a aVar, X509TrustManager x509TrustManager, C15793l lVar, long j10) {
            z.a aVar2;
            z zVar;
            if (aVar == null || (zVar = (z) aVar.invoke()) == null || (aVar2 = zVar.H()) == null) {
                aVar2 = new z.a();
            }
            if (x509TrustManager == null) {
                x509TrustManager = C7807n.a();
            }
            aVar2.T(C16354j.f137719a.g().o(x509TrustManager), x509TrustManager);
            aVar2.g(C16877v.e(lVar));
            aVar2.a(new C8412f());
            TimeUnit timeUnit = TimeUnit.SECONDS;
            aVar2.f(j10, timeUnit);
            aVar2.R(j10, timeUnit);
            aVar2.U(j10, timeUnit);
            aVar2.d((C15784c) null);
            return aVar2.c();
        }

        /* access modifiers changed from: private */
        public static final z j(C16824o<? extends z> oVar) {
            return (z) oVar.getValue();
        }

        public final C7100a<C8703e> d(C8704f fVar, b bVar, PublicKey publicKey, C17631a<Instant> aVar) {
            C17542s.j(fVar, "logListService");
            C17542s.j(publicKey, "publicKey");
            C17542s.j(aVar, "now");
            return new C8699a(new C7796c(), bVar, new C7806m(), new C7799f(fVar), publicKey, (e) null, aVar, 32, (DefaultConstructorMarker) null).c();
        }

        public final C8704f g(String str, C17631a<? extends z> aVar, long j10, X509TrustManager x509TrustManager, C15793l lVar) {
            C17542s.j(str, "baseUrl");
            C17542s.j(lVar, "connectionSpec");
            return new a(str, C16825p.b(new C8701c(aVar, x509TrustManager, lVar, j10)));
        }
    }
