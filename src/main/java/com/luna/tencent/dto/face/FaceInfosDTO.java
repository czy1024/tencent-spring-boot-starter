package com.luna.tencent.dto.face;

import com.luna.tencent.dto.group.FaceAttributesInfoDTO;

/**
 * @Package: com.luna.dto.dto
 * @ClassName: FaceInfosDTO
 * @Author: luna
 * @CreateTime: 2020/8/6 14:44
 * @Description:
 */
public class FaceInfosDTO {

    private String x;

    private String y;

    private String width;

    private String height;

    private FaceAttributesInfoDTO faceAttributesInfoDTO;

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public FaceAttributesInfoDTO getFaceAttributesInfoDTO() {
        return faceAttributesInfoDTO;
    }

    public void setFaceAttributesInfoDTO(FaceAttributesInfoDTO faceAttributesInfoDTO) {
        this.faceAttributesInfoDTO = faceAttributesInfoDTO;
    }
}
