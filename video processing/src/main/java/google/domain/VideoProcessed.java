package google.domain;

import google.domain.*;
import google.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class VideoProcessed extends AbstractEvent {

    private Long id;
    private String videoUrl;
    private String fileKey;

    public VideoProcessed(Video aggregate){
        super(aggregate);
    }
    public VideoProcessed(){
        super();
    }
}
