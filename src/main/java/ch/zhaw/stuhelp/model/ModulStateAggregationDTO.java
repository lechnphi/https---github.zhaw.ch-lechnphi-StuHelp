package ch.zhaw.stuhelp.model;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@Getter
public class ModulStateAggregationDTO {
    private String id;
    private List<String> modulIds;
    private String count;
}
