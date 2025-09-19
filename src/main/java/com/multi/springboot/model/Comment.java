package com.multi.springboot.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Comment {
    private int id;
    private String content;
    //ResultSet의 컬럼명과 Java 프로퍼티명을 매칭하는데, 규칙은 카멜 케이스 변환(created_at → createdAt)을 기대합니다.
    @JsonProperty("created_at")  // JSON 키 이름을 created_at으로 강제
    private String createdAt; // DB/프론트와 동일 키 사용
}
