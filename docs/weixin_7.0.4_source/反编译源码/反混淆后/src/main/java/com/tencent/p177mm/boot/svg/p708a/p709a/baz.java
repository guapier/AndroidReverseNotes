package com.tencent.p177mm.boot.svg.p708a.p709a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.p177mm.svg.C5163c;
import com.tencent.p177mm.svg.WeChatSVGRenderC2Java;
import com.tencent.smtt.sdk.TbsListener.ErrorCode;
import com.tencent.smtt.sdk.WebView;

/* renamed from: com.tencent.mm.boot.svg.a.a.baz */
public final class baz extends C5163c {
    private final int height = ErrorCode.STARTDOWNLOAD_3;
    private final int width = ErrorCode.STARTDOWNLOAD_3;

    /* renamed from: a */
    public final int mo10620a(int i, Object... objArr) {
        switch (i) {
            case 0:
                return ErrorCode.STARTDOWNLOAD_3;
            case 1:
                return ErrorCode.STARTDOWNLOAD_3;
            case 2:
                Canvas canvas = (Canvas) objArr[0];
                Looper looper = (Looper) objArr[1];
                Matrix h = C5163c.m7881h(looper);
                float[] g = C5163c.m7880g(looper);
                Paint k = C5163c.m7883k(looper);
                k.setFlags(385);
                k.setStyle(Style.FILL);
                Paint k2 = C5163c.m7883k(looper);
                k2.setFlags(385);
                k2.setStyle(Style.STROKE);
                k.setColor(WebView.NIGHT_MODE_COLOR);
                k2.setStrokeWidth(1.0f);
                k2.setStrokeCap(Cap.BUTT);
                k2.setStrokeJoin(Join.MITER);
                k2.setStrokeMiter(4.0f);
                k2.setPathEffect(null);
                C5163c.m7876a(k2, looper).setStrokeWidth(1.0f);
                canvas.save();
                Paint a = C5163c.m7876a(k, looper);
                Path l = C5163c.m7884l(looper);
                l.moveTo(147.0f, 87.99551f);
                l.lineTo(147.0f, 24.004f);
                l.cubicTo(147.0f, 21.796232f, 145.2098f, 20.0f, 143.00148f, 20.0f);
                l.lineTo(17.998524f, 20.0f);
                l.cubicTo(15.791985f, 20.0f, 14.0f, 21.792652f, 14.0f, 24.004f);
                l.lineTo(14.0f, 87.99551f);
                l.lineTo(14.0f, 137.00499f);
                l.cubicTo(14.0f, 140.3086f, 16.683992f, 143.0f, 19.994865f, 143.0f);
                l.lineTo(141.00514f, 143.0f);
                l.cubicTo(144.31322f, 143.0f, 147.0f, 140.31593f, 147.0f, 137.00499f);
                l.lineTo(147.0f, 87.99551f);
                l.close();
                Paint k3 = C5163c.m7883k(looper);
                k3.setFlags(385);
                k3.setStyle(Style.FILL);
                Paint k4 = C5163c.m7883k(looper);
                k4.setFlags(385);
                k4.setStyle(Style.STROKE);
                k3.setColor(WebView.NIGHT_MODE_COLOR);
                k4.setStrokeWidth(1.0f);
                k4.setStrokeCap(Cap.BUTT);
                k4.setStrokeJoin(Join.MITER);
                k4.setStrokeMiter(4.0f);
                k4.setPathEffect(null);
                float[] a2 = C5163c.m7878a(g, 147.0f, 0.0f, 14.0f, 0.0f, 143.0f, 20.0f);
                h.reset();
                h.setValues(a2);
                WeChatSVGRenderC2Java.setLinearGradient(a, 0.5f, 0.0f, 0.5f, 1.0f, new int[]{-1023919, -1684420}, new float[]{0.0f, 1.0f}, h, 0);
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a);
                canvas.restore();
                canvas.save();
                Paint a3 = C5163c.m7876a(k, looper);
                a3.setColor(-4045769);
                l = C5163c.m7884l(looper);
                l.moveTo(38.0f, 41.0f);
                l.cubicTo(41.31371f, 41.0f, 44.0f, 43.68629f, 44.0f, 47.0f);
                l.cubicTo(44.0f, 50.31371f, 41.31371f, 53.0f, 38.0f, 53.0f);
                l.cubicTo(34.68629f, 53.0f, 32.0f, 50.31371f, 32.0f, 47.0f);
                l.cubicTo(32.0f, 43.68629f, 34.68629f, 41.0f, 38.0f, 41.0f);
                l.close();
                canvas.drawPath(l, a3);
                canvas.restore();
                canvas.save();
                a3 = C5163c.m7876a(k, looper);
                a3.setColor(-4045769);
                l = C5163c.m7884l(looper);
                l.moveTo(123.0f, 41.0f);
                l.cubicTo(126.313705f, 41.0f, 129.0f, 43.68629f, 129.0f, 47.0f);
                l.cubicTo(129.0f, 50.31371f, 126.313705f, 53.0f, 123.0f, 53.0f);
                l.cubicTo(119.686295f, 53.0f, 117.0f, 50.31371f, 117.0f, 47.0f);
                l.cubicTo(117.0f, 43.68629f, 119.686295f, 41.0f, 123.0f, 41.0f);
                l.close();
                canvas.drawPath(l, a3);
                canvas.restore();
                a3 = C5163c.m7876a(k, looper);
                a3.setColor(WebView.NIGHT_MODE_COLOR);
                l = C5163c.m7884l(looper);
                l.moveTo(125.025665f, 52.646748f);
                l.cubicTo(121.89993f, 74.69777f, 103.00941f, 91.65349f, 80.172646f, 91.65349f);
                l.cubicTo(57.11698f, 91.65349f, 38.083572f, 74.371155f, 35.234097f, 52.011253f);
                l.lineTo(35.32706f, 52.011253f);
                l.lineTo(35.32706f, 52.011253f);
                l.cubicTo(35.298355f, 51.859913f, 35.283337f, 51.70371f, 35.283337f, 51.543983f);
                l.cubicTo(35.283337f, 50.172024f, 36.3916f, 49.059834f, 37.758717f, 49.059834f);
                l.cubicTo(39.12583f, 49.059834f, 40.234097f, 50.172024f, 40.234097f, 51.543983f);
                l.cubicTo(40.234097f, 51.70371f, 40.219074f, 51.859913f, 40.190372f, 52.011253f);
                l.lineTo(40.265175f, 52.011253f);
                l.cubicTo(43.423683f, 71.29139f, 60.106743f, 86.0f, 80.21306f, 86.0f);
                l.cubicTo(100.31937f, 86.0f, 117.002426f, 71.29139f, 120.160934f, 52.011253f);
                l.lineTo(120.33231f, 52.011253f);
                l.cubicTo(120.30019f, 51.850533f, 120.28333f, 51.684277f, 120.28333f, 51.514065f);
                l.cubicTo(120.28333f, 50.125587f, 121.404945f, 49.0f, 122.78853f, 49.0f);
                l.cubicTo(124.172104f, 49.0f, 125.29372f, 50.125587f, 125.29372f, 51.514065f);
                l.cubicTo(125.29372f, 51.921535f, 125.19713f, 52.306362f, 125.025665f, 52.646748f);
                l.close();
                canvas.saveLayerAlpha(null, 25, 4);
                k3 = C5163c.m7876a(a3, looper);
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, k3);
                canvas.restore();
                canvas.save();
                a3 = C5163c.m7876a(k, looper);
                a3.setColor(-1);
                l = C5163c.m7884l(looper);
                l.moveTo(125.025665f, 48.646748f);
                l.cubicTo(121.89993f, 70.69777f, 103.00941f, 87.65349f, 80.172646f, 87.65349f);
                l.cubicTo(57.11698f, 87.65349f, 38.083572f, 70.371155f, 35.234097f, 48.011253f);
                l.lineTo(35.32706f, 48.011253f);
                l.lineTo(35.32706f, 48.011253f);
                l.cubicTo(35.298355f, 47.859913f, 35.283337f, 47.70371f, 35.283337f, 47.543983f);
                l.cubicTo(35.283337f, 46.172024f, 36.3916f, 45.059834f, 37.758717f, 45.059834f);
                l.cubicTo(39.12583f, 45.059834f, 40.234097f, 46.172024f, 40.234097f, 47.543983f);
                l.cubicTo(40.234097f, 47.70371f, 40.219074f, 47.859913f, 40.190372f, 48.011253f);
                l.lineTo(40.265175f, 48.011253f);
                l.cubicTo(43.423683f, 67.29139f, 60.106743f, 82.0f, 80.21306f, 82.0f);
                l.cubicTo(100.31937f, 82.0f, 117.002426f, 67.29139f, 120.160934f, 48.011253f);
                l.lineTo(120.33231f, 48.011253f);
                l.cubicTo(120.30019f, 47.850533f, 120.28333f, 47.684277f, 120.28333f, 47.514065f);
                l.cubicTo(120.28333f, 46.125587f, 121.404945f, 45.0f, 122.78853f, 45.0f);
                l.cubicTo(124.172104f, 45.0f, 125.29372f, 46.125587f, 125.29372f, 47.514065f);
                l.cubicTo(125.29372f, 47.921535f, 125.19713f, 48.306362f, 125.025665f, 48.646748f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a3);
                canvas.restore();
                C5163c.m7882j(looper);
                break;
        }
        return 0;
    }
}
