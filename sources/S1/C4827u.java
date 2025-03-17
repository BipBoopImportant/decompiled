package S1;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000,\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aY\u0010\f\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000\u0012\u0004\u0012\u00020\t0\u000b*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"", "LS1/l;", "LS1/W;", "typefaceRequest", "LS1/i;", "asyncTypefaceCache", "LS1/J;", "platformFontLoader", "Lkotlin/Function1;", "", "createDefaultTypeface", "LXH/v;", "b", "(Ljava/util/List;LS1/W;LS1/i;LS1/J;LnI/l;)LXH/v;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: S1.u  reason: case insensitive filesystem */
public final class C4827u {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: S1.i$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v39, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v31, resolved type: S1.i$a} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final XH.v<java.util.List<S1.C4819l>, java.lang.Object> b(java.util.List<? extends S1.C4819l> r17, S1.W r18, S1.C4816i r19, S1.J r20, nI.C17642l<? super S1.W, ? extends java.lang.Object> r21) {
        /*
            r8 = r20
            r9 = 1
            int r10 = r17.size()
            r12 = 0
            r13 = r12
            r14 = 0
        L_0x000a:
            if (r13 >= r10) goto L_0x01a4
            r15 = r17
            java.lang.Object r0 = r15.get(r13)
            r7 = r0
            S1.l r7 = (S1.C4819l) r7
            int r0 = r7.a()
            S1.v$a r1 = S1.C4828v.f13445a
            int r2 = r1.b()
            boolean r2 = S1.C4828v.e(r0, r2)
            if (r2 == 0) goto L_0x00b6
            V1.t r1 = r19.f13406d
            monitor-enter(r1)
            S1.i$b r0 = new S1.i$b     // Catch:{ all -> 0x004b }
            java.lang.Object r2 = r20.a()     // Catch:{ all -> 0x004b }
            r0.<init>(r7, r2)     // Catch:{ all -> 0x004b }
            R1.b r2 = r19.f13404b     // Catch:{ all -> 0x004b }
            java.lang.Object r2 = r2.d(r0)     // Catch:{ all -> 0x004b }
            S1.i$a r2 = (S1.C4816i.a) r2     // Catch:{ all -> 0x004b }
            if (r2 != 0) goto L_0x004d
            R1.c r2 = r19.f13405c     // Catch:{ all -> 0x004b }
            java.lang.Object r0 = r2.b(r0)     // Catch:{ all -> 0x004b }
            r2 = r0
            S1.i$a r2 = (S1.C4816i.a) r2     // Catch:{ all -> 0x004b }
            goto L_0x004d
        L_0x004b:
            r0 = move-exception
            goto L_0x00b4
        L_0x004d:
            if (r2 == 0) goto L_0x0056
            java.lang.Object r0 = r2.g()     // Catch:{ all -> 0x004b }
            monitor-exit(r1)
            r8 = r7
            goto L_0x006c
        L_0x0056:
            XH.N r0 = XH.C16807N.f139792a     // Catch:{ all -> 0x004b }
            monitor-exit(r1)
            java.lang.Object r0 = r8.c(r7)     // Catch:{ Exception -> 0x009a }
            r6 = 8
            r9 = 0
            r5 = 0
            r1 = r19
            r2 = r7
            r3 = r20
            r4 = r0
            r8 = r7
            r7 = r9
            S1.C4816i.f(r1, r2, r3, r4, r5, r6, r7)
        L_0x006c:
            if (r0 == 0) goto L_0x0083
            int r1 = r18.e()
            S1.C r2 = r18.f()
            int r3 = r18.d()
            java.lang.Object r0 = S1.z.a(r1, r0, r8, r2, r3)
            XH.v r0 = XH.C16796C.a(r14, r0)
            return r0
        L_0x0083:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unable to load font "
            r1.append(r2)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x009a:
            r0 = move-exception
            r8 = r7
            r1 = r0
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unable to load font "
            r2.append(r3)
            r2.append(r8)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2, r1)
            throw r0
        L_0x00b4:
            monitor-exit(r1)
            throw r0
        L_0x00b6:
            int r2 = r1.c()
            boolean r2 = S1.C4828v.e(r0, r2)
            if (r2 == 0) goto L_0x013e
            V1.t r1 = r19.f13406d
            monitor-enter(r1)
            S1.i$b r0 = new S1.i$b     // Catch:{ all -> 0x00e6 }
            java.lang.Object r2 = r20.a()     // Catch:{ all -> 0x00e6 }
            r0.<init>(r7, r2)     // Catch:{ all -> 0x00e6 }
            R1.b r2 = r19.f13404b     // Catch:{ all -> 0x00e6 }
            java.lang.Object r2 = r2.d(r0)     // Catch:{ all -> 0x00e6 }
            S1.i$a r2 = (S1.C4816i.a) r2     // Catch:{ all -> 0x00e6 }
            if (r2 != 0) goto L_0x00e8
            R1.c r2 = r19.f13405c     // Catch:{ all -> 0x00e6 }
            java.lang.Object r0 = r2.b(r0)     // Catch:{ all -> 0x00e6 }
            r2 = r0
            S1.i$a r2 = (S1.C4816i.a) r2     // Catch:{ all -> 0x00e6 }
            goto L_0x00e8
        L_0x00e6:
            r0 = move-exception
            goto L_0x013c
        L_0x00e8:
            if (r2 == 0) goto L_0x00f1
            java.lang.Object r0 = r2.g()     // Catch:{ all -> 0x00e6 }
            monitor-exit(r1)
            r11 = r7
            goto L_0x0122
        L_0x00f1:
            XH.N r0 = XH.C16807N.f139792a     // Catch:{ all -> 0x00e6 }
            monitor-exit(r1)
            XH.x$a r0 = XH.x.f139812b     // Catch:{ all -> 0x00ff }
            java.lang.Object r0 = r8.c(r7)     // Catch:{ all -> 0x00ff }
            java.lang.Object r0 = XH.x.b(r0)     // Catch:{ all -> 0x00ff }
            goto L_0x010a
        L_0x00ff:
            r0 = move-exception
            XH.x$a r1 = XH.x.f139812b
            java.lang.Object r0 = XH.y.a(r0)
            java.lang.Object r0 = XH.x.b(r0)
        L_0x010a:
            boolean r1 = XH.x.g(r0)
            if (r1 == 0) goto L_0x0111
            r0 = 0
        L_0x0111:
            r6 = 8
            r16 = 0
            r5 = 0
            r1 = r19
            r2 = r7
            r3 = r20
            r4 = r0
            r11 = r7
            r7 = r16
            S1.C4816i.f(r1, r2, r3, r4, r5, r6, r7)
        L_0x0122:
            if (r0 == 0) goto L_0x0139
            int r1 = r18.e()
            S1.C r2 = r18.f()
            int r3 = r18.d()
            java.lang.Object r0 = S1.z.a(r1, r0, r11, r2, r3)
            XH.v r0 = XH.C16796C.a(r14, r0)
            return r0
        L_0x0139:
            r1 = r19
            goto L_0x018a
        L_0x013c:
            monitor-exit(r1)
            throw r0
        L_0x013e:
            r11 = r7
            int r1 = r1.a()
            boolean r0 = S1.C4828v.e(r0, r1)
            if (r0 == 0) goto L_0x018d
            r1 = r19
            S1.i$a r0 = r1.d(r11, r8)
            if (r0 != 0) goto L_0x0160
            if (r14 != 0) goto L_0x015c
            S1.l[] r0 = new S1.C4819l[r9]
            r0[r12] = r11
            java.util.List r14 = YH.C16877v.t(r0)
            goto L_0x018a
        L_0x015c:
            r14.add(r11)
            goto L_0x018a
        L_0x0160:
            java.lang.Object r2 = r0.g()
            boolean r2 = S1.C4816i.a.e(r2)
            if (r2 == 0) goto L_0x016b
            goto L_0x018a
        L_0x016b:
            java.lang.Object r2 = r0.g()
            if (r2 == 0) goto L_0x018a
            int r1 = r18.e()
            java.lang.Object r0 = r0.g()
            S1.C r2 = r18.f()
            int r3 = r18.d()
            java.lang.Object r0 = S1.z.a(r1, r0, r11, r2, r3)
            XH.v r0 = XH.C16796C.a(r14, r0)
            return r0
        L_0x018a:
            int r13 = r13 + r9
            goto L_0x000a
        L_0x018d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unknown font type "
            r1.append(r2)
            r1.append(r11)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x01a4:
            r1 = r18
            r2 = r21
            java.lang.Object r0 = r2.invoke(r1)
            XH.v r0 = XH.C16796C.a(r14, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: S1.C4827u.b(java.util.List, S1.W, S1.i, S1.J, nI.l):XH.v");
    }
}
