package org.photonvision.vision.pipeline;

import org.photonvision.vision.frame.Frame;
import org.photonvision.vision.frame.FrameThresholdType;
import org.photonvision.vision.pipeline.result.CVPipelineResult;

public class TOFPipeline extends CVPipeline<CVPipelineResult, TOFPipelineSettings>{

    public TOFPipeline(FrameThresholdType thresholdType) {
        super(thresholdType);
        //TODO Auto-generated constructor stub
    }

    @Override
    protected void setPipeParamsImpl() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setPipeParamsImpl'");
    }

    @Override
    protected CVPipelineResult process(Frame frame, TOFPipelineSettings settings) {
        var colorImage = frame.colorImage;
        
        return null;
    }
    
}
