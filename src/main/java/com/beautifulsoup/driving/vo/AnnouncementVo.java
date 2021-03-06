package com.beautifulsoup.driving.vo;

import com.beautifulsoup.driving.common.Date2LongSerializer;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AnnouncementVo implements Serializable {
    private static final long serialVersionUID = 9009814907491473841L;
    private String content;
    @JsonSerialize(using = Date2LongSerializer.class)
    private Date publishTime;
}
