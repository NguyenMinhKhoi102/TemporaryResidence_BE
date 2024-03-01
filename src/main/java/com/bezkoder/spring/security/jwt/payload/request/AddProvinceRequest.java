package com.bezkoder.spring.security.jwt.payload.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AddProvinceRequest {
    private String code;

    private String name;
    private String nameEn;
    private String fullName;
    private String fullNameEn;
    private String codeName;
    private Double latitude;
    private Double longitude;
}
