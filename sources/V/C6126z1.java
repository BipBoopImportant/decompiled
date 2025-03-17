package v;

import androidx.camera.core.impl.d1;
import androidx.camera.core.impl.e1;
import java.util.ArrayList;
import java.util.List;

/* renamed from: v.z1  reason: case insensitive filesystem */
public final class C6126z1 {
    public static List<d1> a(int i10, boolean z10, boolean z11) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(f());
        if (i10 == 0 || i10 == 1 || i10 == 3) {
            arrayList.addAll(h());
        }
        if (i10 == 1 || i10 == 3) {
            arrayList.addAll(e());
        }
        if (z10) {
            arrayList.addAll(j());
        }
        if (z11 && i10 == 0) {
            arrayList.addAll(c());
        }
        if (i10 == 3) {
            arrayList.addAll(g());
        }
        return arrayList;
    }

    public static List<d1> b() {
        ArrayList arrayList = new ArrayList();
        d1 d1Var = new d1();
        e1.b bVar = e1.b.PRIV;
        e1.a aVar = e1.a.MAXIMUM;
        d1Var.a(e1.a(bVar, aVar));
        arrayList.add(d1Var);
        d1 d1Var2 = new d1();
        e1.b bVar2 = e1.b.YUV;
        d1Var2.a(e1.a(bVar2, aVar));
        arrayList.add(d1Var2);
        d1 d1Var3 = new d1();
        e1.a aVar2 = e1.a.PREVIEW;
        d1Var3.a(e1.a(bVar, aVar2));
        e1.b bVar3 = e1.b.JPEG;
        d1Var3.a(e1.a(bVar3, aVar));
        arrayList.add(d1Var3);
        d1 d1Var4 = new d1();
        d1Var4.a(e1.a(bVar, aVar2));
        d1Var4.a(e1.a(bVar2, aVar));
        arrayList.add(d1Var4);
        d1 d1Var5 = new d1();
        d1Var5.a(e1.a(bVar2, aVar2));
        d1Var5.a(e1.a(bVar2, aVar));
        arrayList.add(d1Var5);
        d1 d1Var6 = new d1();
        d1Var6.a(e1.a(bVar, aVar2));
        e1.a aVar3 = e1.a.RECORD;
        d1Var6.a(e1.a(bVar, aVar3));
        arrayList.add(d1Var6);
        d1 d1Var7 = new d1();
        d1Var7.a(e1.a(bVar, aVar2));
        d1Var7.a(e1.a(bVar, aVar3));
        d1Var7.a(e1.a(bVar2, aVar3));
        arrayList.add(d1Var7);
        d1 d1Var8 = new d1();
        d1Var8.a(e1.a(bVar, aVar2));
        d1Var8.a(e1.a(bVar, aVar3));
        d1Var8.a(e1.a(bVar3, aVar3));
        arrayList.add(d1Var8);
        return arrayList;
    }

    public static List<d1> c() {
        ArrayList arrayList = new ArrayList();
        d1 d1Var = new d1();
        e1.b bVar = e1.b.PRIV;
        e1.a aVar = e1.a.PREVIEW;
        d1Var.a(e1.a(bVar, aVar));
        e1.a aVar2 = e1.a.MAXIMUM;
        d1Var.a(e1.a(bVar, aVar2));
        arrayList.add(d1Var);
        d1 d1Var2 = new d1();
        d1Var2.a(e1.a(bVar, aVar));
        e1.b bVar2 = e1.b.YUV;
        d1Var2.a(e1.a(bVar2, aVar2));
        arrayList.add(d1Var2);
        d1 d1Var3 = new d1();
        d1Var3.a(e1.a(bVar2, aVar));
        d1Var3.a(e1.a(bVar2, aVar2));
        arrayList.add(d1Var3);
        return arrayList;
    }

    public static List<d1> d() {
        ArrayList arrayList = new ArrayList();
        d1 d1Var = new d1();
        e1.b bVar = e1.b.YUV;
        e1.a aVar = e1.a.s1440p;
        d1Var.a(e1.a(bVar, aVar));
        arrayList.add(d1Var);
        d1 d1Var2 = new d1();
        e1.b bVar2 = e1.b.PRIV;
        d1Var2.a(e1.a(bVar2, aVar));
        arrayList.add(d1Var2);
        d1 d1Var3 = new d1();
        e1.b bVar3 = e1.b.JPEG;
        d1Var3.a(e1.a(bVar3, aVar));
        arrayList.add(d1Var3);
        d1 d1Var4 = new d1();
        e1.a aVar2 = e1.a.s720p;
        d1Var4.a(e1.a(bVar, aVar2));
        d1Var4.a(e1.a(bVar3, aVar));
        arrayList.add(d1Var4);
        d1 d1Var5 = new d1();
        d1Var5.a(e1.a(bVar2, aVar2));
        d1Var5.a(e1.a(bVar3, aVar));
        arrayList.add(d1Var5);
        d1 d1Var6 = new d1();
        d1Var6.a(e1.a(bVar, aVar2));
        d1Var6.a(e1.a(bVar, aVar));
        arrayList.add(d1Var6);
        d1 d1Var7 = new d1();
        d1Var7.a(e1.a(bVar, aVar2));
        d1Var7.a(e1.a(bVar2, aVar));
        arrayList.add(d1Var7);
        d1 d1Var8 = new d1();
        d1Var8.a(e1.a(bVar2, aVar2));
        d1Var8.a(e1.a(bVar, aVar));
        arrayList.add(d1Var8);
        d1 d1Var9 = new d1();
        d1Var9.a(e1.a(bVar2, aVar2));
        d1Var9.a(e1.a(bVar2, aVar));
        arrayList.add(d1Var9);
        return arrayList;
    }

    public static List<d1> e() {
        ArrayList arrayList = new ArrayList();
        d1 d1Var = new d1();
        e1.b bVar = e1.b.PRIV;
        e1.a aVar = e1.a.PREVIEW;
        d1Var.a(e1.a(bVar, aVar));
        e1.a aVar2 = e1.a.MAXIMUM;
        d1Var.a(e1.a(bVar, aVar2));
        arrayList.add(d1Var);
        d1 d1Var2 = new d1();
        d1Var2.a(e1.a(bVar, aVar));
        e1.b bVar2 = e1.b.YUV;
        d1Var2.a(e1.a(bVar2, aVar2));
        arrayList.add(d1Var2);
        d1 d1Var3 = new d1();
        d1Var3.a(e1.a(bVar2, aVar));
        d1Var3.a(e1.a(bVar2, aVar2));
        arrayList.add(d1Var3);
        d1 d1Var4 = new d1();
        d1Var4.a(e1.a(bVar, aVar));
        d1Var4.a(e1.a(bVar, aVar));
        d1Var4.a(e1.a(e1.b.JPEG, aVar2));
        arrayList.add(d1Var4);
        d1 d1Var5 = new d1();
        e1.a aVar3 = e1.a.VGA;
        d1Var5.a(e1.a(bVar2, aVar3));
        d1Var5.a(e1.a(bVar, aVar));
        d1Var5.a(e1.a(bVar2, aVar2));
        arrayList.add(d1Var5);
        d1 d1Var6 = new d1();
        d1Var6.a(e1.a(bVar2, aVar3));
        d1Var6.a(e1.a(bVar2, aVar));
        d1Var6.a(e1.a(bVar2, aVar2));
        arrayList.add(d1Var6);
        return arrayList;
    }

    public static List<d1> f() {
        ArrayList arrayList = new ArrayList();
        d1 d1Var = new d1();
        e1.b bVar = e1.b.PRIV;
        e1.a aVar = e1.a.MAXIMUM;
        d1Var.a(e1.a(bVar, aVar));
        arrayList.add(d1Var);
        d1 d1Var2 = new d1();
        e1.b bVar2 = e1.b.JPEG;
        d1Var2.a(e1.a(bVar2, aVar));
        arrayList.add(d1Var2);
        d1 d1Var3 = new d1();
        e1.b bVar3 = e1.b.YUV;
        d1Var3.a(e1.a(bVar3, aVar));
        arrayList.add(d1Var3);
        d1 d1Var4 = new d1();
        e1.a aVar2 = e1.a.PREVIEW;
        d1Var4.a(e1.a(bVar, aVar2));
        d1Var4.a(e1.a(bVar2, aVar));
        arrayList.add(d1Var4);
        d1 d1Var5 = new d1();
        d1Var5.a(e1.a(bVar3, aVar2));
        d1Var5.a(e1.a(bVar2, aVar));
        arrayList.add(d1Var5);
        d1 d1Var6 = new d1();
        d1Var6.a(e1.a(bVar, aVar2));
        d1Var6.a(e1.a(bVar, aVar2));
        arrayList.add(d1Var6);
        d1 d1Var7 = new d1();
        d1Var7.a(e1.a(bVar, aVar2));
        d1Var7.a(e1.a(bVar3, aVar2));
        arrayList.add(d1Var7);
        d1 d1Var8 = new d1();
        d1Var8.a(e1.a(bVar, aVar2));
        d1Var8.a(e1.a(bVar3, aVar2));
        d1Var8.a(e1.a(bVar2, aVar));
        arrayList.add(d1Var8);
        return arrayList;
    }

    public static List<d1> g() {
        ArrayList arrayList = new ArrayList();
        d1 d1Var = new d1();
        e1.b bVar = e1.b.PRIV;
        e1.a aVar = e1.a.PREVIEW;
        d1Var.a(e1.a(bVar, aVar));
        e1.a aVar2 = e1.a.VGA;
        d1Var.a(e1.a(bVar, aVar2));
        e1.b bVar2 = e1.b.YUV;
        e1.a aVar3 = e1.a.MAXIMUM;
        d1Var.a(e1.a(bVar2, aVar3));
        e1.b bVar3 = e1.b.RAW;
        d1Var.a(e1.a(bVar3, aVar3));
        arrayList.add(d1Var);
        d1 d1Var2 = new d1();
        d1Var2.a(e1.a(bVar, aVar));
        d1Var2.a(e1.a(bVar, aVar2));
        d1Var2.a(e1.a(e1.b.JPEG, aVar3));
        d1Var2.a(e1.a(bVar3, aVar3));
        arrayList.add(d1Var2);
        return arrayList;
    }

    public static List<d1> h() {
        ArrayList arrayList = new ArrayList();
        d1 d1Var = new d1();
        e1.b bVar = e1.b.PRIV;
        e1.a aVar = e1.a.PREVIEW;
        d1Var.a(e1.a(bVar, aVar));
        e1.a aVar2 = e1.a.RECORD;
        d1Var.a(e1.a(bVar, aVar2));
        arrayList.add(d1Var);
        d1 d1Var2 = new d1();
        d1Var2.a(e1.a(bVar, aVar));
        e1.b bVar2 = e1.b.YUV;
        d1Var2.a(e1.a(bVar2, aVar2));
        arrayList.add(d1Var2);
        d1 d1Var3 = new d1();
        d1Var3.a(e1.a(bVar2, aVar));
        d1Var3.a(e1.a(bVar2, aVar2));
        arrayList.add(d1Var3);
        d1 d1Var4 = new d1();
        d1Var4.a(e1.a(bVar, aVar));
        d1Var4.a(e1.a(bVar, aVar2));
        e1.b bVar3 = e1.b.JPEG;
        d1Var4.a(e1.a(bVar3, aVar2));
        arrayList.add(d1Var4);
        d1 d1Var5 = new d1();
        d1Var5.a(e1.a(bVar, aVar));
        d1Var5.a(e1.a(bVar2, aVar2));
        d1Var5.a(e1.a(bVar3, aVar2));
        arrayList.add(d1Var5);
        d1 d1Var6 = new d1();
        d1Var6.a(e1.a(bVar2, aVar));
        d1Var6.a(e1.a(bVar2, aVar));
        d1Var6.a(e1.a(bVar3, e1.a.MAXIMUM));
        arrayList.add(d1Var6);
        return arrayList;
    }

    public static List<d1> i() {
        ArrayList arrayList = new ArrayList();
        d1 d1Var = new d1();
        e1.b bVar = e1.b.PRIV;
        e1.a aVar = e1.a.s1440p;
        d1Var.a(e1.a(bVar, aVar));
        arrayList.add(d1Var);
        d1 d1Var2 = new d1();
        e1.b bVar2 = e1.b.YUV;
        d1Var2.a(e1.a(bVar2, aVar));
        arrayList.add(d1Var2);
        d1 d1Var3 = new d1();
        d1Var3.a(e1.a(bVar, aVar));
        e1.b bVar3 = e1.b.JPEG;
        e1.a aVar2 = e1.a.MAXIMUM;
        d1Var3.a(e1.a(bVar3, aVar2));
        arrayList.add(d1Var3);
        d1 d1Var4 = new d1();
        d1Var4.a(e1.a(bVar2, aVar));
        d1Var4.a(e1.a(bVar3, aVar2));
        arrayList.add(d1Var4);
        d1 d1Var5 = new d1();
        d1Var5.a(e1.a(bVar, aVar));
        d1Var5.a(e1.a(bVar2, aVar2));
        arrayList.add(d1Var5);
        d1 d1Var6 = new d1();
        d1Var6.a(e1.a(bVar2, aVar));
        d1Var6.a(e1.a(bVar2, aVar2));
        arrayList.add(d1Var6);
        d1 d1Var7 = new d1();
        e1.a aVar3 = e1.a.PREVIEW;
        d1Var7.a(e1.a(bVar, aVar3));
        d1Var7.a(e1.a(bVar, aVar));
        arrayList.add(d1Var7);
        d1 d1Var8 = new d1();
        d1Var8.a(e1.a(bVar2, aVar3));
        d1Var8.a(e1.a(bVar, aVar));
        arrayList.add(d1Var8);
        d1 d1Var9 = new d1();
        d1Var9.a(e1.a(bVar, aVar3));
        d1Var9.a(e1.a(bVar2, aVar));
        arrayList.add(d1Var9);
        d1 d1Var10 = new d1();
        d1Var10.a(e1.a(bVar2, aVar3));
        d1Var10.a(e1.a(bVar2, aVar));
        arrayList.add(d1Var10);
        return arrayList;
    }

    public static List<d1> j() {
        ArrayList arrayList = new ArrayList();
        d1 d1Var = new d1();
        e1.b bVar = e1.b.RAW;
        e1.a aVar = e1.a.MAXIMUM;
        d1Var.a(e1.a(bVar, aVar));
        arrayList.add(d1Var);
        d1 d1Var2 = new d1();
        e1.b bVar2 = e1.b.PRIV;
        e1.a aVar2 = e1.a.PREVIEW;
        d1Var2.a(e1.a(bVar2, aVar2));
        d1Var2.a(e1.a(bVar, aVar));
        arrayList.add(d1Var2);
        d1 d1Var3 = new d1();
        e1.b bVar3 = e1.b.YUV;
        d1Var3.a(e1.a(bVar3, aVar2));
        d1Var3.a(e1.a(bVar, aVar));
        arrayList.add(d1Var3);
        d1 d1Var4 = new d1();
        d1Var4.a(e1.a(bVar2, aVar2));
        d1Var4.a(e1.a(bVar2, aVar2));
        d1Var4.a(e1.a(bVar, aVar));
        arrayList.add(d1Var4);
        d1 d1Var5 = new d1();
        d1Var5.a(e1.a(bVar2, aVar2));
        d1Var5.a(e1.a(bVar3, aVar2));
        d1Var5.a(e1.a(bVar, aVar));
        arrayList.add(d1Var5);
        d1 d1Var6 = new d1();
        d1Var6.a(e1.a(bVar3, aVar2));
        d1Var6.a(e1.a(bVar3, aVar2));
        d1Var6.a(e1.a(bVar, aVar));
        arrayList.add(d1Var6);
        d1 d1Var7 = new d1();
        d1Var7.a(e1.a(bVar2, aVar2));
        e1.b bVar4 = e1.b.JPEG;
        d1Var7.a(e1.a(bVar4, aVar));
        d1Var7.a(e1.a(bVar, aVar));
        arrayList.add(d1Var7);
        d1 d1Var8 = new d1();
        d1Var8.a(e1.a(bVar3, aVar2));
        d1Var8.a(e1.a(bVar4, aVar));
        d1Var8.a(e1.a(bVar, aVar));
        arrayList.add(d1Var8);
        return arrayList;
    }

    public static List<d1> k() {
        ArrayList arrayList = new ArrayList();
        d1 d1Var = new d1();
        e1.b bVar = e1.b.PRIV;
        e1.a aVar = e1.a.s1440p;
        d1Var.a(e1.b(bVar, aVar, 4));
        arrayList.add(d1Var);
        d1 d1Var2 = new d1();
        e1.b bVar2 = e1.b.YUV;
        d1Var2.a(e1.b(bVar2, aVar, 4));
        arrayList.add(d1Var2);
        d1 d1Var3 = new d1();
        e1.a aVar2 = e1.a.RECORD;
        d1Var3.a(e1.b(bVar, aVar2, 3));
        arrayList.add(d1Var3);
        d1 d1Var4 = new d1();
        d1Var4.a(e1.b(bVar2, aVar2, 3));
        arrayList.add(d1Var4);
        d1 d1Var5 = new d1();
        e1.b bVar3 = e1.b.JPEG;
        e1.a aVar3 = e1.a.MAXIMUM;
        d1Var5.a(e1.b(bVar3, aVar3, 2));
        arrayList.add(d1Var5);
        d1 d1Var6 = new d1();
        d1Var6.a(e1.b(bVar2, aVar3, 2));
        arrayList.add(d1Var6);
        d1 d1Var7 = new d1();
        e1.a aVar4 = e1.a.PREVIEW;
        d1Var7.a(e1.b(bVar, aVar4, 1));
        d1Var7.a(e1.b(bVar3, aVar3, 2));
        arrayList.add(d1Var7);
        d1 d1Var8 = new d1();
        d1Var8.a(e1.b(bVar, aVar4, 1));
        d1Var8.a(e1.b(bVar2, aVar3, 2));
        arrayList.add(d1Var8);
        d1 d1Var9 = new d1();
        d1Var9.a(e1.b(bVar, aVar4, 1));
        d1Var9.a(e1.b(bVar, aVar2, 3));
        arrayList.add(d1Var9);
        d1 d1Var10 = new d1();
        d1Var10.a(e1.b(bVar, aVar4, 1));
        d1Var10.a(e1.b(bVar2, aVar2, 3));
        arrayList.add(d1Var10);
        d1 d1Var11 = new d1();
        d1Var11.a(e1.b(bVar, aVar4, 1));
        d1Var11.a(e1.b(bVar2, aVar4, 1));
        arrayList.add(d1Var11);
        d1 d1Var12 = new d1();
        d1Var12.a(e1.b(bVar, aVar4, 1));
        d1Var12.a(e1.b(bVar, aVar2, 3));
        d1Var12.a(e1.b(bVar3, aVar2, 2));
        arrayList.add(d1Var12);
        d1 d1Var13 = new d1();
        d1Var13.a(e1.b(bVar, aVar4, 1));
        d1Var13.a(e1.b(bVar2, aVar2, 3));
        d1Var13.a(e1.b(bVar3, aVar2, 2));
        arrayList.add(d1Var13);
        d1 d1Var14 = new d1();
        d1Var14.a(e1.b(bVar, aVar4, 1));
        d1Var14.a(e1.b(bVar2, aVar4, 1));
        d1Var14.a(e1.b(bVar3, aVar3, 2));
        arrayList.add(d1Var14);
        return arrayList;
    }

    public static List<d1> l() {
        ArrayList arrayList = new ArrayList();
        d1 d1Var = new d1();
        e1.b bVar = e1.b.JPEG_R;
        e1.a aVar = e1.a.MAXIMUM;
        d1Var.a(e1.a(bVar, aVar));
        arrayList.add(d1Var);
        d1 d1Var2 = new d1();
        d1Var2.a(e1.a(e1.b.PRIV, e1.a.PREVIEW));
        d1Var2.a(e1.a(bVar, aVar));
        arrayList.add(d1Var2);
        return arrayList;
    }

    public static List<d1> m() {
        ArrayList arrayList = new ArrayList();
        d1 d1Var = new d1();
        e1.b bVar = e1.b.YUV;
        e1.a aVar = e1.a.ULTRA_MAXIMUM;
        d1Var.a(e1.a(bVar, aVar));
        e1.b bVar2 = e1.b.PRIV;
        e1.a aVar2 = e1.a.PREVIEW;
        d1Var.a(e1.a(bVar2, aVar2));
        e1.a aVar3 = e1.a.RECORD;
        d1Var.a(e1.a(bVar2, aVar3));
        arrayList.add(d1Var);
        d1 d1Var2 = new d1();
        e1.b bVar3 = e1.b.JPEG;
        d1Var2.a(e1.a(bVar3, aVar));
        d1Var2.a(e1.a(bVar2, aVar2));
        d1Var2.a(e1.a(bVar2, aVar3));
        arrayList.add(d1Var2);
        d1 d1Var3 = new d1();
        e1.b bVar4 = e1.b.RAW;
        d1Var3.a(e1.a(bVar4, aVar));
        d1Var3.a(e1.a(bVar2, aVar2));
        d1Var3.a(e1.a(bVar2, aVar3));
        arrayList.add(d1Var3);
        d1 d1Var4 = new d1();
        d1Var4.a(e1.a(bVar, aVar));
        d1Var4.a(e1.a(bVar2, aVar2));
        e1.a aVar4 = e1.a.MAXIMUM;
        d1Var4.a(e1.a(bVar3, aVar4));
        arrayList.add(d1Var4);
        d1 d1Var5 = new d1();
        d1Var5.a(e1.a(bVar3, aVar));
        d1Var5.a(e1.a(bVar2, aVar2));
        d1Var5.a(e1.a(bVar3, aVar4));
        arrayList.add(d1Var5);
        d1 d1Var6 = new d1();
        d1Var6.a(e1.a(bVar4, aVar));
        d1Var6.a(e1.a(bVar2, aVar2));
        d1Var6.a(e1.a(bVar3, aVar4));
        arrayList.add(d1Var6);
        d1 d1Var7 = new d1();
        d1Var7.a(e1.a(bVar, aVar));
        d1Var7.a(e1.a(bVar2, aVar2));
        d1Var7.a(e1.a(bVar, aVar4));
        arrayList.add(d1Var7);
        d1 d1Var8 = new d1();
        d1Var8.a(e1.a(bVar3, aVar));
        d1Var8.a(e1.a(bVar2, aVar2));
        d1Var8.a(e1.a(bVar, aVar4));
        arrayList.add(d1Var8);
        d1 d1Var9 = new d1();
        d1Var9.a(e1.a(bVar4, aVar));
        d1Var9.a(e1.a(bVar2, aVar2));
        d1Var9.a(e1.a(bVar, aVar4));
        arrayList.add(d1Var9);
        d1 d1Var10 = new d1();
        d1Var10.a(e1.a(bVar, aVar));
        d1Var10.a(e1.a(bVar2, aVar2));
        d1Var10.a(e1.a(bVar4, aVar4));
        arrayList.add(d1Var10);
        d1 d1Var11 = new d1();
        d1Var11.a(e1.a(bVar3, aVar));
        d1Var11.a(e1.a(bVar2, aVar2));
        d1Var11.a(e1.a(bVar4, aVar4));
        arrayList.add(d1Var11);
        d1 d1Var12 = new d1();
        d1Var12.a(e1.a(bVar4, aVar));
        d1Var12.a(e1.a(bVar2, aVar2));
        d1Var12.a(e1.a(bVar4, aVar4));
        arrayList.add(d1Var12);
        return arrayList;
    }
}
