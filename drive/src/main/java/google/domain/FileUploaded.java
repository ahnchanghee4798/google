package google.domain;

import google.domain.*;
import google.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class FileUploaded extends AbstractEvent {

    private Long id;
    private String name;
    private Long size;

    public FileUploaded(File aggregate){
        super(aggregate);
    }
    public FileUploaded(){
        super();
    }
}
