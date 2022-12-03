package google.domain;

import google.infra.AbstractEvent;
import lombok.Data;
import java.util.*;


@Data
public class Indexed extends AbstractEvent {

    private Long id;
    private String fileId;
    private String keywords;
}
