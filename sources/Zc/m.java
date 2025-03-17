package Zc;

import G9.C6521b;
import K9.C6620s;
import O9.c;
import O9.f;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.b;
import com.google.android.gms.dynamite.DynamiteModule;
import ga.C7912n;
import ga.C7914p;
import ga.C7915q;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import xa.C8974o;

public class m {

    /* renamed from: a  reason: collision with root package name */
    public static final C6521b[] f65102a = new C6521b[0];

    /* renamed from: b  reason: collision with root package name */
    public static final C6521b f65103b;

    /* renamed from: c  reason: collision with root package name */
    public static final C6521b f65104c;

    /* renamed from: d  reason: collision with root package name */
    public static final C6521b f65105d;

    /* renamed from: e  reason: collision with root package name */
    public static final C6521b f65106e;

    /* renamed from: f  reason: collision with root package name */
    public static final C6521b f65107f;

    /* renamed from: g  reason: collision with root package name */
    public static final C6521b f65108g = new C6521b("mlkit.ocr.chinese", 1);

    /* renamed from: h  reason: collision with root package name */
    public static final C6521b f65109h = new C6521b("mlkit.ocr.common", 1);

    /* renamed from: i  reason: collision with root package name */
    public static final C6521b f65110i = new C6521b("mlkit.ocr.devanagari", 1);

    /* renamed from: j  reason: collision with root package name */
    public static final C6521b f65111j = new C6521b("mlkit.ocr.japanese", 1);

    /* renamed from: k  reason: collision with root package name */
    public static final C6521b f65112k = new C6521b("mlkit.ocr.korean", 1);

    /* renamed from: l  reason: collision with root package name */
    public static final C6521b f65113l;

    /* renamed from: m  reason: collision with root package name */
    public static final C6521b f65114m;

    /* renamed from: n  reason: collision with root package name */
    public static final C6521b f65115n;

    /* renamed from: o  reason: collision with root package name */
    public static final C6521b f65116o;

    /* renamed from: p  reason: collision with root package name */
    public static final C6521b f65117p;

    /* renamed from: q  reason: collision with root package name */
    public static final C6521b f65118q = new C6521b("mlkit.image.caption", 1);

    /* renamed from: r  reason: collision with root package name */
    public static final C6521b f65119r = new C6521b("mlkit.docscan.detect", 1);

    /* renamed from: s  reason: collision with root package name */
    public static final C6521b f65120s = new C6521b("mlkit.docscan.crop", 1);

    /* renamed from: t  reason: collision with root package name */
    public static final C6521b f65121t = new C6521b("mlkit.docscan.enhance", 1);

    /* renamed from: u  reason: collision with root package name */
    public static final C6521b f65122u = new C6521b("mlkit.quality.aesthetic", 1);

    /* renamed from: v  reason: collision with root package name */
    public static final C6521b f65123v = new C6521b("mlkit.quality.technical", 1);

    /* renamed from: w  reason: collision with root package name */
    private static final C7915q f65124w;

    /* renamed from: x  reason: collision with root package name */
    private static final C7915q f65125x;

    static {
        C6521b bVar = new C6521b("vision.barcode", 1);
        f65103b = bVar;
        C6521b bVar2 = new C6521b("vision.custom.ica", 1);
        f65104c = bVar2;
        C6521b bVar3 = new C6521b("vision.face", 1);
        f65105d = bVar3;
        C6521b bVar4 = new C6521b("vision.ica", 1);
        f65106e = bVar4;
        C6521b bVar5 = new C6521b("vision.ocr", 1);
        f65107f = bVar5;
        C6521b bVar6 = new C6521b("mlkit.langid", 1);
        f65113l = bVar6;
        C6521b bVar7 = new C6521b("mlkit.nlclassifier", 1);
        f65114m = bVar7;
        C6521b bVar8 = new C6521b("tflite_dynamite", 1);
        f65115n = bVar8;
        C6521b bVar9 = new C6521b("mlkit.barcode.ui", 1);
        f65116o = bVar9;
        C6521b bVar10 = new C6521b("mlkit.smartreply", 1);
        f65117p = bVar10;
        C7914p pVar = new C7914p();
        pVar.a("barcode", bVar);
        pVar.a("custom_ica", bVar2);
        pVar.a("face", bVar3);
        pVar.a("ica", bVar4);
        pVar.a("ocr", bVar5);
        pVar.a("langid", bVar6);
        pVar.a("nlclassifier", bVar7);
        pVar.a("tflite_dynamite", bVar8);
        pVar.a("barcode_ui", bVar9);
        pVar.a("smart_reply", bVar10);
        f65124w = pVar.b();
        C7914p pVar2 = new C7914p();
        pVar2.a("com.google.android.gms.vision.barcode", bVar);
        pVar2.a("com.google.android.gms.vision.custom.ica", bVar2);
        pVar2.a("com.google.android.gms.vision.face", bVar3);
        pVar2.a("com.google.android.gms.vision.ica", bVar4);
        pVar2.a("com.google.android.gms.vision.ocr", bVar5);
        pVar2.a("com.google.android.gms.mlkit.langid", bVar6);
        pVar2.a("com.google.android.gms.mlkit.nlclassifier", bVar7);
        pVar2.a("com.google.android.gms.tflite_dynamite", bVar8);
        pVar2.a("com.google.android.gms.mlkit_smartreply", bVar10);
        f65125x = pVar2.b();
    }

    @Deprecated
    public static boolean a(Context context, List<String> list) {
        if (b.f().a(context) >= 221500000) {
            return b(context, f(f65125x, list));
        }
        try {
            for (String e10 : list) {
                DynamiteModule.e(context, DynamiteModule.f48093b, e10);
            }
            return true;
        } catch (DynamiteModule.a unused) {
            return false;
        }
    }

    public static boolean b(Context context, C6521b[] bVarArr) {
        try {
            return ((O9.b) C8974o.a(c.a(context).i(new B(bVarArr)).e(C.f65076a))).x();
        } catch (InterruptedException | ExecutionException e10) {
            Log.e("OptionalModuleUtils", "Failed to complete the task of features availability check", e10);
            return false;
        }
    }

    @Deprecated
    public static void c(Context context, String str) {
        d(context, C7912n.q(str));
    }

    @Deprecated
    public static void d(Context context, List<String> list) {
        if (b.f().a(context) >= 221500000) {
            e(context, f(f65124w, list));
            return;
        }
        Intent intent = new Intent();
        intent.setClassName("com.google.android.gms", "com.google.android.gms.vision.DependencyBroadcastReceiverProxy");
        intent.setAction("com.google.android.gms.vision.DEPENDENCY");
        intent.putExtra("com.google.android.gms.vision.DEPENDENCIES", TextUtils.join(",", list));
        intent.putExtra("requester_app_package", context.getApplicationInfo().packageName);
        context.sendBroadcast(intent);
    }

    public static void e(Context context, C6521b[] bVarArr) {
        c.a(context).e(f.d().a(new D(bVarArr)).b()).e(E.f65078a);
    }

    private static C6521b[] f(Map map, List list) {
        C6521b[] bVarArr = new C6521b[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            bVarArr[i10] = (C6521b) C6620s.l((C6521b) map.get(list.get(i10)));
        }
        return bVarArr;
    }
}
