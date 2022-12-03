package google.domain;

import google.domain.*;
import google.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class FileUploaded extends AbstractEvent {

    private Long id;
    private String name;
    private Long size;
}


