package lK;

import fK.C17251d;
import kK.C17514c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.json.JsonObject;

@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a3\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a7\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u000b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0000¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"T", "LkK/c;", "json", "Lkotlinx/serialization/json/JsonElement;", "element", "LfK/d;", "deserializer", "a", "(LkK/c;Lkotlinx/serialization/json/JsonElement;LfK/d;)Ljava/lang/Object;", "", "discriminator", "Lkotlinx/serialization/json/JsonObject;", "b", "(LkK/c;Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;LfK/d;)Ljava/lang/Object;", "kotlinx-serialization-json"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class h0 {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: lK.O} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: lK.J} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: lK.Q} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: lK.O} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: lK.O} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: lK.O} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> T a(kK.C17514c r8, kotlinx.serialization.json.JsonElement r9, fK.C17251d<? extends T> r10) {
        /*
            java.lang.String r0 = "json"
            kotlin.jvm.internal.C17542s.j(r8, r0)
            java.lang.String r0 = "element"
            kotlin.jvm.internal.C17542s.j(r9, r0)
            java.lang.String r0 = "deserializer"
            kotlin.jvm.internal.C17542s.j(r10, r0)
            boolean r0 = r9 instanceof kotlinx.serialization.json.JsonObject
            if (r0 == 0) goto L_0x0023
            lK.O r0 = new lK.O
            r3 = r9
            kotlinx.serialization.json.JsonObject r3 = (kotlinx.serialization.json.JsonObject) r3
            r6 = 12
            r7 = 0
            r4 = 0
            r5 = 0
            r1 = r0
            r2 = r8
            r1.<init>(r2, r3, r4, r5, r6, r7)
            goto L_0x004f
        L_0x0023:
            boolean r0 = r9 instanceof kotlinx.serialization.json.JsonArray
            if (r0 == 0) goto L_0x002f
            lK.Q r0 = new lK.Q
            kotlinx.serialization.json.JsonArray r9 = (kotlinx.serialization.json.JsonArray) r9
            r0.<init>(r8, r9)
            goto L_0x004f
        L_0x002f:
            boolean r0 = r9 instanceof kK.w
            if (r0 != 0) goto L_0x0042
            kotlinx.serialization.json.JsonNull r0 = kotlinx.serialization.json.JsonNull.INSTANCE
            boolean r0 = kotlin.jvm.internal.C17542s.e(r9, r0)
            if (r0 == 0) goto L_0x003c
            goto L_0x0042
        L_0x003c:
            XH.t r8 = new XH.t
            r8.<init>()
            throw r8
        L_0x0042:
            lK.J r6 = new lK.J
            r2 = r9
            kotlinx.serialization.json.JsonPrimitive r2 = (kotlinx.serialization.json.JsonPrimitive) r2
            r4 = 4
            r5 = 0
            r3 = 0
            r0 = r6
            r1 = r8
            r0.<init>(r1, r2, r3, r4, r5)
        L_0x004f:
            java.lang.Object r8 = r0.E(r10)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: lK.h0.a(kK.c, kotlinx.serialization.json.JsonElement, fK.d):java.lang.Object");
    }

    public static final <T> T b(C17514c cVar, String str, JsonObject jsonObject, C17251d<? extends T> dVar) {
        C17542s.j(cVar, "<this>");
        C17542s.j(str, "discriminator");
        C17542s.j(jsonObject, "element");
        C17542s.j(dVar, "deserializer");
        return new O(cVar, jsonObject, str, dVar.getDescriptor()).E(dVar);
    }
}
