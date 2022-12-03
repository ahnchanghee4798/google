package google.domain;

import google.domain.*;
import google.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class Indexed extends AbstractEvent {

    private Long id;
    private String fileId;
    private String keywords;

    public Indexed(Index aggregate){
        super(aggregate);
    }
    public Indexed(){
        super();
    }
}
