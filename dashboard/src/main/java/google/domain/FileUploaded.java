package google.domain;

import google.infra.AbstractEvent;
import lombok.Data;
import java.util.*;


@Data
public class FileUploaded extends AbstractEvent {

    private Long id;
    private String name;
    private Long size;
}
