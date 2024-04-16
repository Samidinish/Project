package org.example.propertymanagement.dto.response;


import lombok.AllArgsConstructor;
import lombok.Data;
//import org.example.propertymanagement.entity.Picture;
import org.springframework.core.io.Resource;

@Data
@AllArgsConstructor
public class DownloadFileInfo {
    private Resource resource;
   // private Picture picture;
}
