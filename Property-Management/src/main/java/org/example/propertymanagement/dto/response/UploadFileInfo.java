package org.example.propertymanagement.dto.response;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UploadFileInfo {
    private String url;
    private String key;
}
