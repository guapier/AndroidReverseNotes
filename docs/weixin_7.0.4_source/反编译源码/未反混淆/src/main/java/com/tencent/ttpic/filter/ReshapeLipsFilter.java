package com.tencent.ttpic.filter;

import android.graphics.PointF;
import com.tencent.filter.m.f;
import com.tencent.filter.m.g;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.baseutils.FileUtils;
import com.tencent.ttpic.gles.GlUtil.DRAW_MODE;
import com.tencent.ttpic.util.VideoGlobalContext;
import com.tencent.ttpic.util.VideoMaterialUtil;
import java.util.List;
import java.util.Map;

public class ReshapeLipsFilter extends VideoFilterBase {
    public static final String FRAGMENT_SHADER = FileUtils.loadAssetsString(VideoGlobalContext.getContext(), "camera/camera_video/shader/ReshapeEyeFragmentShader.dat");
    public static final String FRAGMENT_SHADER_V = FileUtils.loadAssetsString(VideoGlobalContext.getContext(), "camera/camera_video/shader/ReshapeEyeFragmentShader_v.dat");
    public static final String VERTEX_SHADER = FileUtils.loadAssetsString(VideoGlobalContext.getContext(), "camera/camera_video/shader/ReshapeLipsVertexShader.dat");
    public static final String VERTEX_SHADER_V = FileUtils.loadAssetsString(VideoGlobalContext.getContext(), "camera/camera_video/shader/ReshapeLipsVertexShader_v.dat");
    private static final int XCOORD_NUM = 128;
    private static final int YCOORD_NUM = 128;
    private static List<PointF> mFullscreenVerticesPortrait = VideoMaterialUtil.genFullScreenVertices(128, 128, 0.0f, 1.0f, 0.0f, 1.0f);
    private static List<PointF> mInitTextureCoordinatesPortrait = VideoMaterialUtil.genFullScreenVertices(128, 128, 0.0f, 1.0f, 0.0f, 1.0f);
    private float[] angles;
    private float[] lipsCenter;
    private float lipsHeight;
    private float[] lipsPlainSize;
    private float lipsSize;
    private float lipsWidth;
    private float lipsYPosition;
    private float meshType;
    private float[] noseCenter;
    private float[] nosePlainSize;
    private float[] size;

    static {
        AppMethodBeat.i(82806);
        AppMethodBeat.o(82806);
    }

    public ReshapeLipsFilter(float f, float f2, float f3, float f4) {
        super(VERTEX_SHADER_V, FRAGMENT_SHADER);
        AppMethodBeat.i(82800);
        this.noseCenter = new float[]{0.0f, 0.0f, 0.0f};
        this.nosePlainSize = new float[]{0.0f, 0.0f};
        this.lipsCenter = new float[]{0.0f, 0.0f, 0.0f};
        this.lipsPlainSize = new float[]{0.0f, 0.0f};
        this.lipsSize = 0.0f;
        this.lipsWidth = 0.0f;
        this.lipsHeight = 0.0f;
        this.lipsYPosition = 0.0f;
        this.angles = new float[]{0.0f, 0.0f, 0.0f};
        this.size = new float[]{1.0f, 1.0f};
        this.meshType = 0.0f;
        this.meshType = 0.5f;
        initParams();
        AppMethodBeat.o(82800);
    }

    public ReshapeLipsFilter(int i) {
        super(VERTEX_SHADER_V, FRAGMENT_SHADER_V);
        AppMethodBeat.i(82801);
        this.noseCenter = new float[]{0.0f, 0.0f, 0.0f};
        this.nosePlainSize = new float[]{0.0f, 0.0f};
        this.lipsCenter = new float[]{0.0f, 0.0f, 0.0f};
        this.lipsPlainSize = new float[]{0.0f, 0.0f};
        this.lipsSize = 0.0f;
        this.lipsWidth = 0.0f;
        this.lipsHeight = 0.0f;
        this.lipsYPosition = 0.0f;
        this.angles = new float[]{0.0f, 0.0f, 0.0f};
        this.size = new float[]{1.0f, 1.0f};
        this.meshType = 0.0f;
        this.meshType = 0.0f;
        initParams();
        AppMethodBeat.o(82801);
    }

    public void initParams() {
        AppMethodBeat.i(82802);
        addParam(new g("noseCenter", this.noseCenter));
        addParam(new g("nosePlainSize", this.nosePlainSize));
        addParam(new g("lipsCenter", this.lipsCenter));
        addParam(new g("lipsPlainSize", this.lipsPlainSize));
        addParam(new f("lipsSize", this.lipsSize));
        addParam(new f("lipsWidth", this.lipsWidth));
        addParam(new f("lipsHeight", this.lipsHeight));
        addParam(new f("lipsYPosition", this.lipsYPosition));
        addParam(new g("angles", this.angles));
        addParam(new g("size", this.size));
        addParam(new f("meshType", this.meshType));
        AppMethodBeat.o(82802);
    }

    public void initAttribParams() {
        AppMethodBeat.i(82803);
        setPositions(VideoMaterialUtil.toFlatArray((PointF[]) mFullscreenVerticesPortrait.toArray(new PointF[0])), false);
        setTexCords(VideoMaterialUtil.toFlatArray((PointF[]) mInitTextureCoordinatesPortrait.toArray(new PointF[0])), false);
        setCoordNum(32897);
        AppMethodBeat.o(82803);
    }

    public void ApplyGLSLFilter() {
        AppMethodBeat.i(82804);
        initParams();
        super.ApplyGLSLFilter();
        setDrawMode(DRAW_MODE.TRIANGLE_STRIP);
        AppMethodBeat.o(82804);
    }

    public void setParam(Map<String, Object> map) {
        AppMethodBeat.i(82805);
        if (map.containsKey("noseCenter")) {
            this.noseCenter = (float[]) map.get("noseCenter");
        }
        if (map.containsKey("nosePlainSize")) {
            this.nosePlainSize = (float[]) map.get("nosePlainSize");
        }
        if (map.containsKey("lipsCenter")) {
            this.lipsCenter = (float[]) map.get("lipsCenter");
        }
        if (map.containsKey("lipsPlainSize")) {
            this.lipsPlainSize = (float[]) map.get("lipsPlainSize");
        }
        if (map.containsKey("lipsSize")) {
            this.lipsSize = ((Float) map.get("lipsSize")).floatValue() * -0.006f;
        }
        if (map.containsKey("lipsHeight")) {
            this.lipsHeight = ((Float) map.get("lipsHeight")).floatValue() * -0.008f;
        }
        if (map.containsKey("lipsWidth")) {
            this.lipsWidth = ((Float) map.get("lipsWidth")).floatValue() * -0.006f;
        }
        if (map.containsKey("lipsYPosition")) {
            this.lipsYPosition = ((Float) map.get("lipsYPosition")).floatValue() * 0.01f;
            if (this.lipsYPosition < 0.0f) {
                this.lipsYPosition *= 1.4f;
            }
        }
        if (map.containsKey("angles")) {
            this.angles = (float[]) map.get("angles");
        }
        if (map.containsKey("size")) {
            this.size = (float[]) map.get("size");
        }
        initParams();
        AppMethodBeat.o(82805);
    }
}
