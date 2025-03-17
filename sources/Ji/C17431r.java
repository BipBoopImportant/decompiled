package jI;

import GJ.C15765h;
import GJ.C15768k;
import XH.C16807N;
import java.io.BufferedReader;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u001a%\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007*\u00020\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b*\u00020\n¢\u0006\u0004\b\f\u0010\r\u001a\u0011\u0010\u000e\u001a\u00020\u0002*\u00020\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a#\u0010\u0015\u001a\u00020\u0014*\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Ljava/io/Reader;", "Lkotlin/Function1;", "", "LXH/N;", "action", "d", "(Ljava/io/Reader;LnI/l;)V", "", "f", "(Ljava/io/Reader;)Ljava/util/List;", "Ljava/io/BufferedReader;", "LGJ/h;", "e", "(Ljava/io/BufferedReader;)LGJ/h;", "h", "(Ljava/io/Reader;)Ljava/lang/String;", "Ljava/io/Writer;", "out", "", "bufferSize", "", "b", "(Ljava/io/Reader;Ljava/io/Writer;I)J", "kotlin-stdlib"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: jI.r  reason: case insensitive filesystem */
public final class C17431r {
    public static final long b(Reader reader, Writer writer, int i10) {
        C17542s.j(reader, "<this>");
        C17542s.j(writer, "out");
        char[] cArr = new char[i10];
        int read = reader.read(cArr);
        long j10 = 0;
        while (read >= 0) {
            writer.write(cArr, 0, read);
            j10 += (long) read;
            read = reader.read(cArr);
        }
        return j10;
    }

    public static /* synthetic */ long c(Reader reader, Writer writer, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 8192;
        }
        return b(reader, writer, i10);
    }

    public static final void d(Reader reader, C17642l<? super String, C16807N> lVar) {
        C17542s.j(reader, "<this>");
        C17542s.j(lVar, "action");
        BufferedReader bufferedReader = reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, 8192);
        try {
            for (String invoke : e(bufferedReader)) {
                lVar.invoke(invoke);
            }
            C16807N n10 = C16807N.f139792a;
            C17416c.a(bufferedReader, (Throwable) null);
        } catch (Throwable th2) {
            C17416c.a(bufferedReader, th);
            throw th2;
        }
    }

    public static final C15765h<String> e(BufferedReader bufferedReader) {
        C17542s.j(bufferedReader, "<this>");
        return C15768k.i(new C17428o(bufferedReader));
    }

    public static final List<String> f(Reader reader) {
        C17542s.j(reader, "<this>");
        ArrayList arrayList = new ArrayList();
        d(reader, new C17430q(arrayList));
        return arrayList;
    }

    /* access modifiers changed from: private */
    public static final C16807N g(ArrayList arrayList, String str) {
        C17542s.j(str, "it");
        arrayList.add(str);
        return C16807N.f139792a;
    }

    public static final String h(Reader reader) {
        C17542s.j(reader, "<this>");
        StringWriter stringWriter = new StringWriter();
        c(reader, stringWriter, 0, 2, (Object) null);
        String stringWriter2 = stringWriter.toString();
        C17542s.i(stringWriter2, "toString(...)");
        return stringWriter2;
    }
}
