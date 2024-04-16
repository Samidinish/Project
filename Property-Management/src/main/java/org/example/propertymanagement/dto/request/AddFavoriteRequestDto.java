package org.example.propertymanagement.dto.request;

import lombok.Data;

@Data
public class AddFavoriteRequestDto {
    private long propertyId;
    private long memberId;
}
